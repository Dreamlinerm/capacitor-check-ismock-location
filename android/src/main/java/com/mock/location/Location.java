package com.mock.location;

import android.util.Log;

public class Location {

    public void isMock() {
        Log.i("isMock");
        return "isMock";
    }

    public boolean isMockSettingsON(PluginCall call) {
        Log.i("isMockSettingsON");
        return "isMock";
    }
}
