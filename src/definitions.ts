export interface LocationPlugin {
  /**
   * Is the last location mocked or MockProvider is enabled.
   *
   * @since 1.0.0
   */
  isMocked(): Promise<boolean>;
  /**
   * Is the last location mocked.
   *
   * @since 1.0.0
   */
  isLastLocationMocked(): Promise<boolean>;
  /**
   * Is MockProvider enabled.
   *
   * @since 1.0.0
   */
  installedMockPermissionApps(): Promise<boolean>;
}
