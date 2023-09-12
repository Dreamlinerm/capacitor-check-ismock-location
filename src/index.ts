import { registerPlugin } from '@capacitor/core';

import type { LocationPlugin } from './definitions';

const Location = registerPlugin<LocationPlugin>('Example', {
  web: () => import('./web').then(m => new m.ExampleWeb()),
});

export * from './definitions';
export { Location };
