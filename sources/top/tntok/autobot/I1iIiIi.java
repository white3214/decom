package top.tntok.autobot;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;

public class I1iIiIi {
    public static Rect iiI1L1iI(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect);
        Rect rect2 = new Rect();
        rect2.top = 0;
        rect2.left = 0;
        rect2.right = i;
        rect2.bottom = i2;
        if (rect.intersect(rect2)) {
            return rect;
        }
        return new Rect();
    }
}
