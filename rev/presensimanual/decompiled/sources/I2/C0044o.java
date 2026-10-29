package I2;

/* JADX INFO: renamed from: I2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0044o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A2.l f492b;

    public C0044o(Object obj, A2.l lVar) {
        this.f491a = obj;
        this.f492b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0044o)) {
            return false;
        }
        C0044o c0044o = (C0044o) obj;
        return B2.h.a(this.f491a, c0044o.f491a) && B2.h.a(this.f492b, c0044o.f492b);
    }

    public final int hashCode() {
        Object obj = this.f491a;
        return this.f492b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f491a + ", onCancellation=" + this.f492b + ')';
    }
}
