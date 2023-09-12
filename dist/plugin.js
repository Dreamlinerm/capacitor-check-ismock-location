var capacitorExample = (function (exports, core) {
    'use strict';

    const Location = core.registerPlugin('Location', {
        web: () => Promise.resolve().then(function () { return web; }).then(m => new m.LocationWeb()),
    });

    class LocationWeb extends core.WebPlugin {
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

    var web = /*#__PURE__*/Object.freeze({
        __proto__: null,
        LocationWeb: LocationWeb
    });

    exports.Location = Location;

    Object.defineProperty(exports, '__esModule', { value: true });

    return exports;

})({}, capacitorExports);
//# sourceMappingURL=plugin.js.map
