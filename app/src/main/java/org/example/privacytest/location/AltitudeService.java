package org.example.privacytest.location;

import android.location.Location;

/** Records the elevation profile in hiking mode. */
public class AltitudeService {

    public double elevation(Location location) {
        return location.getAltitude();
    }
}
