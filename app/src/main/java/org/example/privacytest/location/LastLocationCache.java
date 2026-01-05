package org.example.privacytest.location;

import android.location.LocationManager;

/** Caches the most recent fix so the map opens instantly. Not covered by the policy. */
public class LastLocationCache {

    private final LocationManager manager;

    public LastLocationCache(LocationManager manager) {
        this.manager = manager;
    }

    public Object cached() {
        return manager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
    }
}
