# capacitor-mock-location

The Capacitor plugin finds out if a location is spoofed/mock/false.

## Install

```bash
npm install https://github.com/Dreamlinerm/capacitor-mock-location.git
npx cap sync
```
## Example
    
    ```typescript
    import { Location } from "capacitor-mock-location";

    const isMocked = await Location.isMocked();
    alert('isMocked: ' + JSON.stringify(isMocked));
    const isLastLocationMocked = await Location.isLastLocationMocked();
    alert('isLastLocationMocked: ' + JSON.stringify(isLastLocationMocked));
    const installedMockPermissionApps = await Location.installedMockPermissionApps();
    alert('installedMockPermissionApps: ' + JSON.stringify(installedMockPermissionApps));
    
    ```

Add this to your app Manifest.xml
```html
<uses-permission android:name="android.permission.QUERY_ALL_PACKAGES"/>
```

or,
```html
<uses-permission android:name="android.permission.QUERY_ALL_PACKAGES"
    tools:ignore="QueryAllPackagesPermission" />
```
## API

<docgen-index></docgen-index>

<docgen-api>
<!-- run docgen to generate docs from the source -->
<!-- More info: https://github.com/ionic-team/capacitor-docgen -->
</docgen-api>
