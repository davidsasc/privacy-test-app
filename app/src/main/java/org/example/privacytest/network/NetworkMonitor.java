package org.example.privacytest.network;

import android.net.wifi.WifiManager;

/** Detects metered connections. */
public class NetworkMonitor {

    public Object currentConnection(WifiManager wifi) {
        return wifi.getConnectionInfo();
    }
}
