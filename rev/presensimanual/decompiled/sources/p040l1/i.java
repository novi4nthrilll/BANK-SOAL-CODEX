package p040l1;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5318b;

    public i(Class cls, boolean z2) {
        this.f5317a = cls;
        this.f5318b = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f5317a.equals(this.f5317a) && iVar.f5318b == this.f5318b;
    }

    public final int hashCode() {
        return ((this.f5317a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f5318b).hashCode();
    }
}
