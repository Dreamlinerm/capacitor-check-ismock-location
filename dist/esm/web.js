import { WebPlugin } from '@capacitor/core';
export class LocationWeb extends WebPlugin {
    async isMocked() {
        return false;
    }
    async isMockSettingsON() {
        return false;
    }
}
//# sourceMappingURL=web.js.map