package B;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: B.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0021w {
    public static X a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        X xC = X.c(rootWindowInsets, null);
        W w3 = xC.f67a;
        w3.l(xC);
        w3.d(view.getRootView());
        return xC;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i3) {
        view.setScrollIndicators(i3);
    }

    public static void d(View view, int i3, int i4) {
        view.setScrollIndicators(i3, i4);
    }
}
