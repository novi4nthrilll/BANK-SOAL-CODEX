package B;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X f66b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f67a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f66b = V.f63l;
        } else {
            f66b = W.f64b;
        }
    }

    public X(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            this.f67a = new V(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f67a = new T(this, windowInsets);
        } else if (i3 >= 28) {
            this.f67a = new S(this, windowInsets);
        } else {
            this.f67a = new Q(this, windowInsets);
        }
    }

    public static p064t.c a(p064t.c cVar, int i3, int i4, int i5, int i6) {
        int iMax = Math.max(0, cVar.f5672a - i3);
        int iMax2 = Math.max(0, cVar.f5673b - i4);
        int iMax3 = Math.max(0, cVar.f5674c - i5);
        int iMax4 = Math.max(0, cVar.f5675d - i6);
        return (iMax == i3 && iMax2 == i4 && iMax3 == i5 && iMax4 == i6) ? cVar : p064t.c.a(iMax, iMax2, iMax3, iMax4);
    }

    public static X c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        X x3 = new X(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = D.f41a;
            X xA = Build.VERSION.SDK_INT >= 23 ? AbstractC0021w.a(view) : AbstractC0020v.j(view);
            W w3 = x3.f67a;
            w3.l(xA);
            w3.d(view.getRootView());
        }
        return x3;
    }

    public final WindowInsets b() {
        W w3 = this.f67a;
        if (w3 instanceof P) {
            return ((P) w3).f60c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        return Objects.equals(this.f67a, ((X) obj).f67a);
    }

    public final int hashCode() {
        W w3 = this.f67a;
        if (w3 == null) {
            return 0;
        }
        return w3.hashCode();
    }

    public X() {
        this.f67a = new W(this);
    }
}
