package com.mock.location;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.JSObject;
import android.provider.Settings;
import android.content.Context;


@CapacitorPlugin(name = "Location")
public class LocationPlugin extends Plugin {

    @PluginMethod()
    public void isMocked(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("value", false);
        call.resolve(ret);
    }

    @PluginMethod()
    public void isMockSettingsON(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("value", isMockSettingsONLocal(getContext()));
        call.resolve(ret);
    }

    private boolean isMockSettingsONLocal(Context context) {
        //Context context
        // returns true if mock location enabled, false if not enabled.
        if (Settings.Secure.getString(context.getContentResolver(),
                Settings.Secure.ALLOW_MOCK_LOCATION).equals("0"))
            return false;
        else
            return true;
    }
}
