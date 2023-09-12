import { registerPlugin } from '@capacitor/core';
const Location = registerPlugin('Example', {
    web: () => import('./web').then(m => new m.ExampleWeb()),
});
export * from './definitions';
export { Location };
//# sourceMappingURL=index.js.map