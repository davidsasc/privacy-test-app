package org.example.privacytest.web;

import android.webkit.WebSettings;

/**
 * Configures the embedded web view.
 *
 * Only this comment was added in this commit. The user agent call moved a few
 * lines down, but file and method stay the same, so V2P2 must not mark
 * the browser user agent as affected.
 */
public class WebViewSetup {

    public String userAgent(WebSettings settings) {
        return settings.getUserAgentString();
    }
}
