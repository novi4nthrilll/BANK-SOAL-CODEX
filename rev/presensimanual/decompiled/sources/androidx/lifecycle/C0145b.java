package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0145b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f2377b;

    public C0145b(int i3, Method method) {
        this.f2376a = i3;
        this.f2377b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0145b)) {
            return false;
        }
        C0145b c0145b = (C0145b) obj;
        return this.f2376a == c0145b.f2376a && this.f2377b.getName().equals(c0145b.f2377b.getName());
    }

    public final int hashCode() {
        return this.f2377b.getName().hashCode() + (this.f2376a * 31);
    }
}
