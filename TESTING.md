# Testing V2P2 with this repository

1. Start V2P2 with the GitHub URL of this repository.
2. Select `PRIVACY_POLICY.md` as the privacy policy and load it.
3. Wait until "Compare commits" in the toolbar of the code column is enabled
   (the commit history loads in the background).
4. Pick the earlier commit (A) first, then the later commit (B).

## Commits (oldest first)

| # | Commit message | What changes for V2P2 |
|---|---|---|
| v1 | Initial app with location, telephony, web and network helpers | baseline |
| v2 | Add hiking mode with elevation profile | altitude gets code |
| v3 | Add geofencing and SIM-based fraud detection | latitude/longitude in a new file, SIM serial number added, line shift in WebViewSetup |
| v4 | Remove call-back support and app recommendations | phone number and installed applications lose their code, wifi code moves to another file |
| v5 | Add testing guide | documentation only |

## How to read the result

- Category colors: Matches = blue, Unmatched Methods = red, Unmatched Canonicals = yellow, Unmatched = green.
- The **border** of a box shows its category in the later commit (B).
- The **indicator** on the right shows its category in the earlier commit (A).
- **No indicator** on a colored box: the item is new in B.
- **Grey** boxes are not affected; their connection lines only appear on hover.
- Highlights in the privacy policy always stay visible.

## Expected results

**No comparison (default):** everything looks as before the commit feature: no grey boxes, no indicators.
- Matches: altitude, browser user agent, cookies, latitude, longitude, wifi connections, ip address
- Unmatched Methods: last known location, SIM serial number
- Unmatched Canonicals: location, network state, phone number, registered device accounts

**v1 -> v2**
- altitude: Unmatched Canonicals -> Matches, yellow indicator
- everything else grey

**v2 -> v3**
- latitude, longitude: stay in Matches, blue indicator; outside of hover only the new line to GeoFenceManager is drawn
- SIM serial number: new in Unmatched Methods, no indicator
- browser user agent: grey (only a line shift in WebViewSetup)
- everything else grey

**v3 -> v4**
- phone number: Matches -> Unmatched Canonicals, blue indicator
- installed applications: Unmatched Methods -> Unmatched, red indicator
- wifi connections, ip address: stay in Matches, blue indicator (file renamed)
- everything else grey

**v4 -> v5**
- everything grey (documentation only)

**v1 -> v5 (all changes combined)**
- altitude: yellow indicator
- latitude, longitude, wifi connections, ip address: blue indicator
- phone number: blue indicator (now in Unmatched Canonicals)
- installed applications: red indicator (now in Unmatched)
- SIM serial number: no indicator (new)
- browser user agent, cookies, last known location, location, network state, registered device accounts: grey

**Same commit as A and B:** everything grey.
