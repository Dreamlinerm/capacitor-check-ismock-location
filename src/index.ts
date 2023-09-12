import { registerPlugin } from '@capacitor/core';

import type { LocationPlugin } from './definitions';

const Location = registerPlugin<LocationPlugin>('Location', {
  web: () => import('./web').then(m => new m.LocationWeb()),
});

export * from './definitions';
export { Location };
