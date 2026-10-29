package E0;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f200c;

    public c(long j3, long j4, Set set) {
        this.f198a = j3;
        this.f199b = j4;
        this.f200c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f198a == cVar.f198a && this.f199b == cVar.f199b && this.f200c.equals(cVar.f200c);
    }

    public final int hashCode() {
        long j3 = this.f198a;
        int i3 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        long j4 = this.f199b;
        return this.f200c.hashCode() ^ ((i3 ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f198a + ", maxAllowedDelay=" + this.f199b + ", flags=" + this.f200c + "}";
    }
}
