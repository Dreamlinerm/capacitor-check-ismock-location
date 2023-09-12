import { WebPlugin } from '@capacitor/core';
export class ExampleWeb extends WebPlugin {
    async isMocked() {
        return false;
    }
    async isMockSettingsON() {
        return false;
    }
}
//# sourceMappingURL=web.js.map