import { WebPlugin } from '@capacitor/core';
export class LocationWeb extends WebPlugin {
    async isMocked() {
        return false;
    }
    async isLastLocationMocked() {
        return false;
    }
    async installedMockPermissionApps() {
        return false;
    }
}
//# sourceMappingURL=web.js.map