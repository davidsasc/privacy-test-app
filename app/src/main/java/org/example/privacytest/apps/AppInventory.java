package org.example.privacytest.apps;

import android.content.pm.PackageManager;

/** Lists the apps on the device for a "recommended apps" screen. Not covered by the policy. */
public class AppInventory {

    public int count(PackageManager packages) {
        return packages.getInstalledApplications(0).size();
    }
}
