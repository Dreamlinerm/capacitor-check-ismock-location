package com.mock.location;

import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Location")
public class LocationPlugin extends Plugin {

    @PluginMethod()
    public void isMock(PluginCall call) {

        call.resolve(false);
    }

    @PluginMethod()
    public boolean isMockSettingsON(PluginCall call) {
        call.resolve(isMockSettingsONLocal());
    }

    private boolean isMockSettingsONLocal(Context context) {
        // returns true if mock location enabled, false if not enabled.
        if (Settings.Secure.getString(context.getContentResolver(),
                Settings.Secure.ALLOW_MOCK_LOCATION).equals("0"))
            return false;
        else
            return true;
    }
}
