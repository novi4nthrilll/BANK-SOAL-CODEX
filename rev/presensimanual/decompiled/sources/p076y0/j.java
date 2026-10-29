package p076y0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f5903a;

    public j(h hVar) {
        this.f5903a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f5918d;
        ((j) qVar).getClass();
        return obj2.equals(obj2) && this.f5903a.equals(((j) qVar).f5903a);
    }

    public final int hashCode() {
        return ((p.f5918d.hashCode() ^ 1000003) * 1000003) ^ this.f5903a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f5918d + ", androidClientInfo=" + this.f5903a + "}";
    }
}
