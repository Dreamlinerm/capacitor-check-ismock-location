'use strict';

var core = require('@capacitor/core');

const Location = core.registerPlugin('Location', {
    web: () => Promise.resolve().then(function () { return web; }).then(m => new m.LocationWeb()),
});

class LocationWeb extends core.WebPlugin {
    async isMocked() {
        return false;
    }
    async isMockSettingsON() {
        return false;
    }
}

var web = /*#__PURE__*/Object.freeze({
    __proto__: null,
    LocationWeb: LocationWeb
});

exports.Location = Location;
//# sourceMappingURL=plugin.cjs.js.map
