package org.example.privacytest.location;

import android.location.Location;

/** Shows nearby points of interest for the current position. */
public class LocationTracker {

    public String describe(Location location) {
        double lat = location.getLatitude();
        double lon = location.getLongitude();
        return lat + "," + lon;
    }
}
