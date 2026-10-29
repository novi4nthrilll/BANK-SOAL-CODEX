package B0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p053p2.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f103f = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile b f104d;
    public volatile Object e;

    public static p053p2.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.e = f103f;
        aVar.f104d = bVar;
        return aVar;
    }

    @Override // p053p2.a
    public final Object get() {
        Object obj = this.e;
        Object obj2 = f103f;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.e;
                    if (obj == obj2) {
                        obj = this.f104d.get();
                        Object obj3 = this.e;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.e = obj;
                        this.f104d = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
