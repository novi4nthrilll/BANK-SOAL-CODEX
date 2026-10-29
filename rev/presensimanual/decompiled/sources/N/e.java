package N;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1032a;

    public e(String str) {
        B2.h.e(str, "name");
        this.f1032a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return B2.h.a(this.f1032a, ((e) obj).f1032a);
    }

    public final int hashCode() {
        return this.f1032a.hashCode();
    }

    public final String toString() {
        return this.f1032a;
    }
}
