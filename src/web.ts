import { WebPlugin } from '@capacitor/core';

import type { LocationPlugin } from './definitions';

export class LocationWeb extends WebPlugin implements LocationPlugin {
  async isMocked(): Promise<boolean> {
    return false;
  }
  async isLastLocationMocked(): Promise<boolean> {
    return false;
  }
  async installedMockPermissionApps(): Promise<boolean> {
    return false;
  }
}
