import { WebPlugin } from '@capacitor/core';

import type { LocationPlugin } from './definitions';

export class ExampleWeb extends WebPlugin implements LocationPlugin {
  async isMocked(): Promise<boolean> {
    return false;
  }
  async isMockSettingsON(): Promise<boolean> {
    return false;
  }  
}
