package E0;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H0.a f196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f197b;

    public b(H0.a aVar, HashMap map) {
        this.f196a = aVar;
        this.f197b = map;
    }

    public final long a(p070w0.c cVar, long j3, int i3) {
        long jB = j3 - this.f196a.b();
        c cVar2 = (c) this.f197b.get(cVar);
        long j4 = cVar2.f198a;
        int i4 = i3 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i4) * j4 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j4 > 1 ? j4 : 2L) * ((long) i4)))), jB), cVar2.f199b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f196a.equals(bVar.f196a) && this.f197b.equals(bVar.f197b);
    }

    public final int hashCode() {
        return ((this.f196a.hashCode() ^ 1000003) * 1000003) ^ this.f197b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f196a + ", values=" + this.f197b + "}";
    }
}
