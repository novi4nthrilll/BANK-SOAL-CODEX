package C;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static k a(boolean z2, int i3, int i4, int i5, int i6, boolean z3, String str, String str2) {
        new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z2).setColumnIndex(i3).setRowIndex(i4).setColumnSpan(i5).setRowSpan(i6).setSelected(z3).setRowTitle(str).setColumnTitle(str2).build();
        return new k();
    }

    public static l b(AccessibilityNodeInfo accessibilityNodeInfo, int i3, int i4) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i3, i4);
        if (child != null) {
            return new l(child, 0);
        }
        return null;
    }

    public static String c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static l f(AccessibilityNodeInfo accessibilityNodeInfo, int i3) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i3);
        if (parent != null) {
            return new l(parent, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setTextSelectable(z2);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
