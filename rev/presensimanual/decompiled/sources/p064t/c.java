package p064t;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c e = new c(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5675d;

    public c(int i3, int i4, int i5, int i6) {
        this.f5672a = i3;
        this.f5673b = i4;
        this.f5674c = i5;
        this.f5675d = i6;
    }

    public static c a(int i3, int i4, int i5, int i6) {
        return (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? e : new c(i3, i4, i5, i6);
    }

    public final Insets b() {
        return b.a(this.f5672a, this.f5673b, this.f5674c, this.f5675d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5675d == cVar.f5675d && this.f5672a == cVar.f5672a && this.f5674c == cVar.f5674c && this.f5673b == cVar.f5673b;
    }

    public final int hashCode() {
        return (((((this.f5672a * 31) + this.f5673b) * 31) + this.f5674c) * 31) + this.f5675d;
    }

    public final String toString() {
        return "Insets{left=" + this.f5672a + ", top=" + this.f5673b + ", right=" + this.f5674c + ", bottom=" + this.f5675d + '}';
    }
}
