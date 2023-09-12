package com.mock.location;

import android.util.Log;
import com.getcapacitor.PluginCall;
public class Location {

    public String isMocked() {
        // Log.i("isMock");
        return "isMocked";
    }

    public String isLastLocationMocked(PluginCall call) {
        // Log.i("isMockSettingsON");
        return "isMocked";
    }

    public String installedMockPermissionApps(PluginCall call) {
        // Log.i("isMockSettingsON");
        return "installedMockPermissionApps";
    }
}
