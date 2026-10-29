package W1;

import I1.AbstractActivityC0028d;
import k.Z0;

/* JADX INFO: renamed from: W1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0103k implements O1.a, P1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D0.b f1773d;
    public Z0 e;

    @Override // O1.a
    public final void b(D0.b bVar) {
        this.f1773d = bVar;
    }

    @Override // P1.a
    public final void c() {
        Z0 z2 = this.e;
        if (z2 != null) {
            A0.c.q((S1.f) z2.e, null);
            this.e = null;
        }
    }

    @Override // P1.a
    public final void d() {
        c();
    }

    @Override // P1.a
    public final void e(E0.k kVar) {
        AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) kVar.f226d;
        D0.b bVar = this.f1773d;
        S1.f fVar = (S1.f) bVar.f182f;
        G1.a aVar = new G1.a(10, kVar);
        C0102j c0102j = new C0102j();
        c0102j.f1772a = false;
        io.flutter.embedding.engine.renderer.l lVar = (io.flutter.embedding.engine.renderer.l) bVar.f183g;
        Z0 z2 = new Z0();
        z2.f5131d = abstractActivityC0028d;
        z2.e = fVar;
        z2.f5132f = c0102j;
        z2.f5133g = aVar;
        z2.f5134h = lVar;
        z2.f5135i = new D0.b(fVar, "plugins.flutter.io/camera_android/imageStream");
        A0.c.q(fVar, z2);
        this.e = z2;
    }

    @Override // P1.a
    public final void f(E0.k kVar) {
        e(kVar);
    }

    @Override // O1.a
    public final void k(D0.b bVar) {
        this.f1773d = null;
    }
}
