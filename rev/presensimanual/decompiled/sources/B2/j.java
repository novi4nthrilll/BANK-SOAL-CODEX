package B2;

/* JADX INFO: loaded from: classes.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f123a;

    public j(Class cls) {
        this.f123a = cls;
    }

    @Override // B2.d
    public final Class a() {
        return this.f123a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (h.a(this.f123a, ((j) obj).f123a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f123a.hashCode();
    }

    public final String toString() {
        return this.f123a + " (Kotlin reflection is not available)";
    }
}
