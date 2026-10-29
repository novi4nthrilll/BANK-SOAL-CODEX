package p019f0;

import A0.c;
import B2.h;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4453d;

    public b(Rect rect) {
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        this.f4450a = i3;
        this.f4451b = i4;
        this.f4452c = i5;
        this.f4453d = i6;
        if (i3 > i5) {
            throw new IllegalArgumentException(c.h("Left must be less than or equal to right, left: ", i3, ", right: ", i5).toString());
        }
        if (i4 > i6) {
            throw new IllegalArgumentException(c.h("top must be less than or equal to bottom, top: ", i4, ", bottom: ", i6).toString());
        }
    }

    public final int a() {
        return this.f4453d - this.f4451b;
    }

    public final int b() {
        return this.f4452c - this.f4450a;
    }

    public final Rect c() {
        return new Rect(this.f4450a, this.f4451b, this.f4452c, this.f4453d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        h.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f4450a == bVar.f4450a && this.f4451b == bVar.f4451b && this.f4452c == bVar.f4452c && this.f4453d == bVar.f4453d;
    }

    public final int hashCode() {
        return (((((this.f4450a * 31) + this.f4451b) * 31) + this.f4452c) * 31) + this.f4453d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f4450a + ',' + this.f4451b + ',' + this.f4452c + ',' + this.f4453d + "] }";
    }
}
