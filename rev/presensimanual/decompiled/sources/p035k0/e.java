package p035k0;

import B.K;
import B.M;
import B.N;
import B.O;
import B.X;
import B2.h;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import p029i0.b;
import p029i0.c;
import p029i0.j;
import p029i0.k;
import p029i0.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static c a(k kVar, FoldingFeature foldingFeature) {
        b bVar;
        b bVar2;
        int type = foldingFeature.getType();
        if (type == 1) {
            bVar = b.f4568j;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = b.f4569k;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar2 = b.f4566h;
        } else {
            if (state != 2) {
                return null;
            }
            bVar2 = b.f4567i;
        }
        Rect bounds = foldingFeature.getBounds();
        h.d(bounds, "oemFeature.bounds");
        p019f0.b bVar3 = new p019f0.b(bounds);
        Rect rectC = kVar.f4587a.c();
        if (bVar3.a() == 0 && bVar3.b() == 0) {
            return null;
        }
        if (bVar3.b() != rectC.width() && bVar3.a() != rectC.height()) {
            return null;
        }
        if (bVar3.b() < rectC.width() && bVar3.a() < rectC.height()) {
            return null;
        }
        if (bVar3.b() == rectC.width() && bVar3.a() == rectC.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        h.d(bounds2, "oemFeature.bounds");
        return new c(new p019f0.b(bounds2), bVar, bVar2);
    }

    public static j b(Context context, WindowLayoutInfo windowLayoutInfo) throws Exception {
        boolean z2;
        O m3;
        k kVar;
        h.e(windowLayoutInfo, "info");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            if (i3 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            int i4 = n.f4591b;
            return c(n.a((Activity) context), windowLayoutInfo);
        }
        int i5 = n.f4591b;
        if (i3 >= 30) {
            WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
            X xC = X.c(windowManager.getCurrentWindowMetrics().getWindowInsets(), null);
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            h.d(bounds, "wm.currentWindowMetrics.bounds");
            kVar = new k(bounds, xC);
        } else {
            Context baseContext = context;
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    throw new IllegalArgumentException("Context " + context + " is not a UiContext");
                }
                z2 = baseContext instanceof Activity;
                if (z2 || (baseContext instanceof InputMethodService)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                baseContext = contextWrapper.getBaseContext();
                h.d(baseContext, "iterator.baseContext");
            }
            if (z2) {
                kVar = n.a((Activity) context);
            } else {
                if (!(baseContext instanceof InputMethodService)) {
                    throw new IllegalArgumentException(context + " is not a UiContext");
                }
                Object systemService = context.getSystemService("window");
                h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                h.d(defaultDisplay, "wm.defaultDisplay");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Rect rect = new Rect(0, 0, point.x, point.y);
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 30) {
                    m3 = new N();
                } else {
                    m3 = i6 >= 29 ? new M() : new K();
                }
                X xB = m3.b();
                h.d(xB, "Builder().build()");
                kVar = new k(rect, xB);
            }
        }
        return c(kVar, windowLayoutInfo);
    }

    public static j c(k kVar, WindowLayoutInfo windowLayoutInfo) {
        c cVarA;
        h.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        h.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                h.d(foldingFeature, "feature");
                cVarA = a(kVar, foldingFeature);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new j(arrayList);
    }
}
