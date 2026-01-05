package org.example.privacytest.web;

import android.webkit.CookieManager;

/** Keeps the embedded web pages signed in. */
public class CookieSync {

    public String session(String url) {
        return CookieManager.getInstance().getCookie(url);
    }
}
