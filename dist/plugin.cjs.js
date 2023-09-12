'use strict';

var core = require('@capacitor/core');

const Location = core.registerPlugin('Example', {
    web: () => Promise.resolve().then(function () { return web; }).then(m => new m.ExampleWeb()),
});

class ExampleWeb extends core.WebPlugin {
    async isMocked() {
        return false;
    }
    async isMockSettingsON() {
        return false;
    }
}

var web = /*#__PURE__*/Object.freeze({
    __proto__: null,
    ExampleWeb: ExampleWeb
});

exports.Location = Location;
//# sourceMappingURL=plugin.cjs.js.map
