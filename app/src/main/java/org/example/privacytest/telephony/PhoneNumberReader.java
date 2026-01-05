package org.example.privacytest.telephony;

import android.telephony.TelephonyManager;

/** Reads the phone number for the call-back support feature. */
public class PhoneNumberReader {

    public String read(TelephonyManager telephony) {
        return telephony.getLine1Number();
    }
}
