package org.example.privacytest.web;

import android.webkit.WebSettings;

/** Configures the embedded web view. */
public class WebViewSetup {

    public String userAgent(WebSettings settings) {
        return settings.getUserAgentString();
    }
}
