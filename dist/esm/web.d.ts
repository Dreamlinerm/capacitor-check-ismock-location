import { WebPlugin } from '@capacitor/core';
import type { LocationPlugin } from './definitions';
interface ObjectWithBooleanValue {
    value: boolean;
}
export declare class LocationWeb extends WebPlugin implements LocationPlugin {
    isMocked(): Promise<ObjectWithBooleanValue>;
    isLastLocationMocked(): Promise<ObjectWithBooleanValue>;
    installedMockPermissionApps(): Promise<ObjectWithBooleanValue>;
}
export {};
