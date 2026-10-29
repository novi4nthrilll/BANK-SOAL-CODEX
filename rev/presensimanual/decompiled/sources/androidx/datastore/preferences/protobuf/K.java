package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class K implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S[] f2233a;

    @Override // androidx.datastore.preferences.protobuf.S
    public final boolean a(Class cls) {
        for (S s3 : this.f2233a) {
            if (s3.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final b0 b(Class cls) {
        for (S s3 : this.f2233a) {
            if (s3.a(cls)) {
                return s3.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
