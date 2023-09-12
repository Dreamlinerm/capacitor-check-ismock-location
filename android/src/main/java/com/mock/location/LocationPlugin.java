package com.mock.location;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.JSObject;


@CapacitorPlugin(name = "Location")
public class LocationPlugin extends Plugin {

    @PluginMethod()
    public void isMock(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("value", false);
        call.resolve(ret);
    }

    @PluginMethod()
    public void isMockSettingsON(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("value", isMockSettingsONLocal());
        call.resolve(ret);
    }

    private boolean isMockSettingsONLocal() {
        //Context context
        // returns true if mock location enabled, false if not enabled.
        /* if (Settings.Secure.getString(context.getContentResolver(),
                Settings.Secure.ALLOW_MOCK_LOCATION).equals("0"))
            return false;
        else
            return true;*/
        return false;
    }
}
