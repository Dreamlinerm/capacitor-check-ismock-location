package com.mock.location;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.JSObject;
import android.provider.Settings;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
// areThereMockPermissionApps
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.*;
import android.content.pm.ApplicationInfo;
import java.util.List;
import android.content.pm.PackageInfo;



@CapacitorPlugin(name = "Location")
public class LocationPlugin extends Plugin {

    @PluginMethod()
    public void isMocked(PluginCall call) {
        JSObject ret = new JSObject();
        boolean isMock = false;
        try {
            isMock = isMockLocation(getContext());
            if(!isMock){
                isMock = areThereMockPermissionApps(getContext());
                // if(isMock){
                //     removeGpsFaker(getContext());
                //     isMock = areThereMockPermissionApps(getContext());
                // }
            }
        }catch (Exception e){
            Log.e("isMockLocation","isMockLocation: "+e);
        }
        ret.put("value", isMock);
        call.resolve(ret);
    }

    @PluginMethod()
    public void isLastLocationMocked(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("value", isMockLocation(getContext()));
        call.resolve(ret);
    }

    @PluginMethod()
    public void installedMockPermissionApps(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("value", areThereMockPermissionApps(getContext()));
        call.resolve(ret);
    }

    public static void removeGpsFaker(Context context) {
        try {
            LocationManager lm = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
            Log.d("isMockLocation" ,"Removing Test providers");
            lm.removeTestProvider(LocationManager.GPS_PROVIDER);
        } catch (IllegalArgumentException error) {
            Log.d("isMockLocation","Got exception in removing test  provider");
        }
    }

    public static boolean isMockLocation(Context context) {
        boolean isMock = false;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                Log.i("isMockLocation", "VERSION.SDK_INT >= 31");
                LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
                Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                if(location!= null) {
                    isMock = location.isMock();
                    if(isMock){
                        Log.i("isMockLocation", "isMocked=true: func isMock()");
                    }
                }
            } else if (android.os.Build.VERSION.SDK_INT >= 18) {
                Log.i("isMockLocation", "VERSION.SDK_INT >= 18");
                LocationManager locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
                Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                if(location!= null) {
                    isMock = location.isFromMockProvider();
                    if(isMock){
                        Log.i("isMockLocation", "isMocked=true: func isFromMockProvider()");
                    }
                }
            }
        }catch (Exception e){
            Log.e("error","isMockLocation: "+e);
        }
        return isMock;
    }

    private static boolean isMockSettingsONLocal(Context context) {
        //Context context
        // returns true if mock location enabled, false if not enabled.
        return !(Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ALLOW_MOCK_LOCATION).equals("0"));
    }

    public static boolean areThereMockPermissionApps(Context context) {
        try {
            if(android.os.Build.VERSION.SDK_INT >= 18) {
                int count = 0;

                PackageManager pm = context.getPackageManager();
                List<ApplicationInfo> packages =
                        pm.getInstalledApplications(PackageManager.GET_META_DATA);

                for (ApplicationInfo applicationInfo : packages) {
                    try {
                        PackageInfo packageInfo = pm.getPackageInfo(applicationInfo.packageName,
                                PackageManager.GET_PERMISSIONS);

                        // Get Permissions
                        String[] requestedPermissions = packageInfo.requestedPermissions;

                        if (requestedPermissions != null) {
                            for (int i = 0; i < requestedPermissions.length; i++) {
                                if (requestedPermissions[i]
                                        .equals("android.permission.ACCESS_MOCK_LOCATION")
                                        && !applicationInfo.packageName.equals(context.getPackageName())) {
                                    count++;
                                }
                            }
                        }
                    } catch (NameNotFoundException e) {
                        Log.e("Got exception ", e.getMessage());
                    }
                }

                if (count > 0) {
                    Log.i("isMockLocation", "isMocked=true: func areThereMockPermissionApps()");
                    return true;
                }
                return false;

            }
            else {
                Log.i("isMockLocation", "VERSION.SDK_INT < 18");
                boolean isMock = isMockSettingsONLocal(context);
                if(isMock) Log.i("isMockLocation", "isMocked=true: func isMockSettingsONLocal");
                return isMock;
            }
        }catch (Exception e){
            Log.e("error","isMockLocation: "+e);
            return false;
        }
    }
}
