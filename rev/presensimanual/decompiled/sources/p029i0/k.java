package p029i0;

import B.X;
import B2.h;
import android.graphics.Rect;
import p019f0.b;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f4588b;

    public k(b bVar, X x3) {
        h.e(x3, "_windowInsetsCompat");
        this.f4587a = bVar;
        this.f4588b = x3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        h.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return h.a(this.f4587a, kVar.f4587a) && h.a(this.f4588b, kVar.f4588b);
    }

    public final int hashCode() {
        return this.f4588b.hashCode() + (this.f4587a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f4587a + ", windowInsetsCompat=" + this.f4588b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Rect rect, X x3) {
        this(new b(rect), x3);
        h.e(x3, "insets");
    }
}
