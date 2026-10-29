package P2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f1343g;

    static {
        int i3 = j.f1350c;
        int i4 = j.f1351d;
        long j3 = j.e;
        String str = j.f1348a;
        d dVar = new d();
        dVar.f1345f = new b(i3, i4, j3, str);
        f1343g = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // I2.AbstractC0048t
    public final String toString() {
        return "Dispatchers.Default";
    }
}
