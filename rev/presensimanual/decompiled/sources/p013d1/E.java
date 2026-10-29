package p013d1;

import T.b;
import Y.B;
import Y.s;
import Y.t;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    public static int a(B b3, b bVar, View view, View view2, s sVar, boolean z2) {
        if (sVar.p() == 0 || b3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z2) {
            return Math.min(bVar.h(), bVar.d(view2) - bVar.e(view));
        }
        ((t) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int b(B b3, b bVar, View view, View view2, s sVar, boolean z2) {
        if (sVar.p() == 0 || b3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return b3.a();
        }
        bVar.d(view2);
        bVar.e(view);
        ((t) view.getLayoutParams()).getClass();
        throw null;
    }
}
