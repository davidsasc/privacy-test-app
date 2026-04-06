package org.example.privacytest.network;

import android.net.wifi.WifiManager;

/** Detects metered connections (renamed from NetworkMonitor). */
public class ConnectivityReporter {

    public Object currentConnection(WifiManager wifi) {
        return wifi.getConnectionInfo();
    }
}
