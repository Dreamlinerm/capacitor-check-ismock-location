import Foundation

@objc public class Location: NSObject {
    @objc public func isMocked(_ value: String) -> String {
        print(value)
        return value
    }
    @objc public func isLastLocationMocked(_ value: String) -> String {
        print(value)
        return value
    }
    @objc public func installedMockPermissionApps(_ value: String) -> String {
        print(value)
        return value
    }
}
