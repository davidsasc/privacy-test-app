package org.example.privacytest.telephony;

import android.telephony.TelephonyManager;

/** Collects SIM details for fraud detection. Not covered by the policy. */
public class SimInfoCollector {

    public String serial(TelephonyManager telephony) {
        return telephony.getSimSerialNumber();
    }
}
