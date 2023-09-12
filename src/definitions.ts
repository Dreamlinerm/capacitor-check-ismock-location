export interface LocationPlugin {
  isMocked(): Promise<boolean>;
  isMockSettingsON(): Promise<boolean>;
}
