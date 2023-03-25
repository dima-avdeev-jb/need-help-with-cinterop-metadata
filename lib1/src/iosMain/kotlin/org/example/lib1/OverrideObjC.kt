package org.example.lib1

import kotlinx.cinterop.CValue
import kotlinx.cinterop.ExportObjCClass
import platform.CoreGraphics.CGPoint
import platform.CoreGraphics.CGRect
import platform.CoreGraphics.CGRectMake
import platform.Foundation.NSCoder
import platform.UIKit.UIEvent
import platform.UIKit.UIView

@ExportObjCClass
private class OverrideObjC : UIView, org.example.lib1.objc.UIViewExtensionProtocol {

    @OverrideInit
    constructor(frame: CValue<CGRect>) : super(frame)

    @OverrideInit
    constructor(coder: NSCoder) : super(coder)

    override fun pointInside(point: CValue<CGPoint>, withEvent: UIEvent?): Boolean {
        println("override pointInside")
        return true
    }
}

fun createLib1View(): UIView {
    return OverrideObjC(frame = CGRectMake(0.0, 0.0, 100.0, 100.0))
}
