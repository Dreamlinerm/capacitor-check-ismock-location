# capacitor-check-ismock-location

The Capacitor plugin finds out if a location is spoofed/mock/fake.

Implemented the functions on https://stackoverflow.com/questions/6880232/disable-check-for-mock-location-prevent-gps-spoofing as a Capacitor plugin

## Install

```bash
npm install https://github.com/Dreamlinerm/capacitor-check-ismock-location.git
npx cap sync
```
## Example
    
```javascript

import { Location } from "capacitor-check-ismock-location";

...

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

- [capacitor-check-ismock-location](#capacitor-check-ismock-location)
  - [Install](#install)
  - [Example](#example)
  - [API](#api)
    - [isMocked()](#ismocked)
    - [isLastLocationMocked()](#islastlocationmocked)
    - [installedMockPermissionApps()](#installedmockpermissionapps)
    - [Interfaces](#interfaces)
      - [ObjectWithBooleanValue](#objectwithbooleanvalue)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### isMocked()

```typescript
isMocked() => Promise<ObjectWithBooleanValue>
```

Is the last location mocked or MockProvider is enabled. Returns false on error.

**Returns:** <code>Promise&lt;<a href="#objectwithbooleanvalue">ObjectWithBooleanValue</a>&gt;</code>

**Since:** 0.0.1

--------------------


### isLastLocationMocked()

```typescript
isLastLocationMocked() => Promise<ObjectWithBooleanValue>
```

Is the last location mocked. Returns false on error.

**Returns:** <code>Promise&lt;<a href="#objectwithbooleanvalue">ObjectWithBooleanValue</a>&gt;</code>

**Since:** 0.0.1

--------------------


### installedMockPermissionApps()

```typescript
installedMockPermissionApps() => Promise<ObjectWithBooleanValue>
```

Is MockProvider enabled. Returns false on error.

**Returns:** <code>Promise&lt;<a href="#objectwithbooleanvalue">ObjectWithBooleanValue</a>&gt;</code>

**Since:** 0.0.1

--------------------


### Interfaces


#### ObjectWithBooleanValue

Object with the value property that is a boolean. Returns false on error.

| Prop        | Type                 |
| ----------- | -------------------- |
| **`value`** | <code>boolean</code> |

</docgen-api>
