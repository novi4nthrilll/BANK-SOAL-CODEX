package p013d1;

import A0.c;
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
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import o2.b;
import p029i0.l;
import p029i0.m;
import p029i0.n;
import p043m0.a;

/* JADX INFO: renamed from: d1.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0413a3 {
    public static void a(Context context, b bVar) {
        Rect rect;
        O m3;
        X xB;
        Activity activityB = b(context);
        if (activityB != null) {
            int i3 = l.f4589a;
            m.f4590a.getClass();
            int i4 = n.f4591b;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                rect = ((WindowManager) activityB.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
                h.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = activityB.getSystemService("window");
                h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                h.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i5 < 30) {
                if (i5 >= 30) {
                    m3 = new N();
                } else {
                    m3 = i5 >= 29 ? new M() : new K();
                }
                xB = m3.b();
                h.d(xB, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i5 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                xB = a.f5346a.a(activityB);
            }
            int i6 = rect.left;
            int i7 = rect.top;
            int i8 = rect.right;
            int i9 = rect.bottom;
            if (i6 > i8) {
                throw new IllegalArgumentException(c.h("Left must be less than or equal to right, left: ", i6, ", right: ", i8).toString());
            }
            if (i7 > i9) {
                throw new IllegalArgumentException(c.h("top must be less than or equal to bottom, top: ", i7, ", bottom: ", i9).toString());
            }
            h.e(xB, "_windowInsetsCompat");
            ((J1.c) bVar).f695a.updateDisplayMetrics(0, new Rect(i6, i7, i8, i9).width(), new Rect(i6, i7, i8, i9).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static Activity b(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
