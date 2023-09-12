import { WebPlugin } from '@capacitor/core';

import type { LocationPlugin } from './definitions';

interface ObjectWithBooleanValue {
  value: boolean;
}
export class LocationWeb extends WebPlugin implements LocationPlugin {
  async isMocked(): Promise<ObjectWithBooleanValue> {
    return { value: false };
  }
  async isLastLocationMocked(): Promise<ObjectWithBooleanValue> {
    return { value: false };
  }
  async installedMockPermissionApps(): Promise<ObjectWithBooleanValue> {
    return { value: false };
  }
}
