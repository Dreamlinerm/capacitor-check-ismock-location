export interface LocationPlugin {
  isMocked(): Promise<boolean>;
  isLastLocationMocked(): Promise<boolean>;
  installedMockPermissionApps(): Promise<boolean>;
}
