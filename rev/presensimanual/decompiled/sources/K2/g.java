package K2;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f810a;

    public g(Throwable th) {
        this.f810a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (B2.h.a(this.f810a, ((g) obj).f810a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f810a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // K2.h
    public final String toString() {
        return "Closed(" + this.f810a + ')';
    }
}
