package F0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p079z0.b f253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p079z0.a f254c;

    public b(long j3, p079z0.b bVar, p079z0.a aVar) {
        this.f252a = j3;
        this.f253b = bVar;
        this.f254c = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f252a == bVar.f252a && this.f253b.equals(bVar.f253b) && this.f254c.equals(bVar.f254c);
    }

    public final int hashCode() {
        long j3 = this.f252a;
        return this.f254c.hashCode() ^ ((((((int) ((j3 >>> 32) ^ j3)) ^ 1000003) * 1000003) ^ this.f253b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f252a + ", transportContext=" + this.f253b + ", event=" + this.f254c + "}";
    }
}
