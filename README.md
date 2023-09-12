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

<docgen-index>

* [`isMocked()`](#ismocked)
* [`isLastLocationMocked()`](#islastlocationmocked)
* [`installedMockPermissionApps()`](#installedmockpermissionapps)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### isMocked()

```typescript
isMocked() => Promise<boolean>
```

Is the last location mocked or MockProvider is enabled.

**Returns:** <code>Promise&lt;boolean&gt;</code>

**Since:** 1.0.0

--------------------


### isLastLocationMocked()

```typescript
isLastLocationMocked() => Promise<boolean>
```

Is the last location mocked.

**Returns:** <code>Promise&lt;boolean&gt;</code>

**Since:** 1.0.0

--------------------


### installedMockPermissionApps()

```typescript
installedMockPermissionApps() => Promise<boolean>
```

Is MockProvider enabled.

**Returns:** <code>Promise&lt;boolean&gt;</code>

**Since:** 1.0.0

--------------------

</docgen-api>
