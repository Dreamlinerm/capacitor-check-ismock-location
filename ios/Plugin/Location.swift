import Foundation

@objc public class Location: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
