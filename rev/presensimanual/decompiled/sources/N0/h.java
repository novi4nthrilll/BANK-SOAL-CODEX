package N0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1083b;

    public h(Object obj, String str) {
        this.f1082a = obj;
        this.f1083b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f1082a == hVar.f1082a && this.f1083b.equals(hVar.f1083b);
    }

    public final int hashCode() {
        return this.f1083b.hashCode() + (System.identityHashCode(this.f1082a) * 31);
    }
}
