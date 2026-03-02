package org.example.privacytest.location;

import android.location.Location;

/** Warns the user when leaving a saved area. */
public class GeoFenceManager {

    public boolean isInside(Location location, double centerLat, double centerLon, double radius) {
        double dLat = location.getLatitude() - centerLat;
        double dLon = location.getLongitude() - centerLon;
        return Math.sqrt(dLat * dLat + dLon * dLon) <= radius;
    }
}
