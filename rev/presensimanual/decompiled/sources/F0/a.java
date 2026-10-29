package F0;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f247f = new a(10485760, 200, ModuleDescriptor.MODULE_VERSION, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f251d;
    public final int e;

    public a(long j3, int i3, int i4, long j4, int i5) {
        this.f248a = j3;
        this.f249b = i3;
        this.f250c = i4;
        this.f251d = j4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f248a == aVar.f248a && this.f249b == aVar.f249b && this.f250c == aVar.f250c && this.f251d == aVar.f251d && this.e == aVar.e;
    }

    public final int hashCode() {
        long j3 = this.f248a;
        int i3 = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f249b) * 1000003) ^ this.f250c) * 1000003;
        long j4 = this.f251d;
        return this.e ^ ((i3 ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003);
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f248a + ", loadBatchSize=" + this.f249b + ", criticalSectionEnterTimeoutMs=" + this.f250c + ", eventCleanUpAge=" + this.f251d + ", maxBlobByteSizePerRow=" + this.e + "}";
    }
}
