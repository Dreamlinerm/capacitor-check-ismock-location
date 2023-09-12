import { registerPlugin } from '@capacitor/core';
const Location = registerPlugin('Location', {
    web: () => import('./web').then(m => new m.LocationWeb()),
});
export * from './definitions';
export { Location };
//# sourceMappingURL=index.js.map