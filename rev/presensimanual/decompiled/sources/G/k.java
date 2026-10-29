package G;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z2) {
        popupWindow.setOverlapAnchor(z2);
    }

    public static void d(PopupWindow popupWindow, int i3) {
        popupWindow.setWindowLayoutType(i3);
    }
}
