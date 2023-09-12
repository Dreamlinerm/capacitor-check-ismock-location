import { WebPlugin } from '@capacitor/core';
export class LocationWeb extends WebPlugin {
    async isMocked() {
        return { value: false };
    }
    async isLastLocationMocked() {
        return { value: false };
    }
    async installedMockPermissionApps() {
        return { value: false };
    }
}
//# sourceMappingURL=web.js.map