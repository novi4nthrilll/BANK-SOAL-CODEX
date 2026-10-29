package O0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceC0088b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static j f1282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f1283c = new k(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f1284a;

    public /* synthetic */ j(Object obj) {
        this.f1284a = obj;
    }

    public static synchronized j b() {
        try {
            if (f1282b == null) {
                f1282b = new j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1282b;
    }

    @Override // O0.InterfaceC0088b
    public void a(L0.a aVar) {
        boolean z2 = aVar.f861b == 0;
        p030i1.a aVar2 = (p030i1.a) this.f1284a;
        if (z2) {
            aVar2.e(null, aVar2.f2732w);
            return;
        }
        j jVar = aVar2.f2725o;
        if (jVar != null) {
            ((M0.h) jVar.f1284a).g(aVar);
        }
    }
}
