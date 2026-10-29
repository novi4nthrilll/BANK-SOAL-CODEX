package p076y0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f5916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f5917b;

    public n(u uVar, t tVar) {
        this.f5916a = uVar;
        this.f5917b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        u uVar = this.f5916a;
        if (uVar != null ? uVar.equals(((n) vVar).f5916a) : ((n) vVar).f5916a == null) {
            t tVar = this.f5917b;
            if (tVar == null) {
                if (((n) vVar).f5917b == null) {
                    return true;
                }
            } else if (tVar.equals(((n) vVar).f5917b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f5916a;
        int iHashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f5917b;
        return (tVar != null ? tVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f5916a + ", mobileSubtype=" + this.f5917b + "}";
    }
}
