/**
 * Object with the value property that is a boolean. Returns false on error.
 *
 * @since 1.0.0
 */
interface ObjectWithBooleanValue {
    value: boolean;
}
export interface LocationPlugin {
    /**
     * Is the last location mocked or MockProvider is enabled. Returns false on error.
     *
     * @since 1.0.0
     */
    isMocked(): Promise<ObjectWithBooleanValue>;
    /**
     * Is the last location mocked. Returns false on error.
     *
     * @since 1.0.0
     */
    isLastLocationMocked(): Promise<ObjectWithBooleanValue>;
    /**
     * Is MockProvider enabled. Returns false on error.
     *
     * @since 1.0.0
     */
    installedMockPermissionApps(): Promise<ObjectWithBooleanValue>;
}
export {};
