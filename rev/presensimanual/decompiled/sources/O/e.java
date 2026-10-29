package O;

import java.util.ArrayList;
import p013d1.AbstractC0493o;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0493o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N0.j f1177a;

    public e(N0.j jVar) {
        this.f1177a = jVar;
    }

    @Override // p013d1.AbstractC0493o
    public final void a(Throwable th) {
        ((h) this.f1177a.f1084a).d(th);
    }

    @Override // p013d1.AbstractC0493o
    public final void b(E0.n nVar) {
        N0.j jVar = this.f1177a;
        jVar.f1086c = nVar;
        jVar.f1085b = new A0.g((E0.n) jVar.f1086c, new p074x1.a(2), ((h) jVar.f1084a).f1186h);
        h hVar = (h) jVar.f1084a;
        hVar.getClass();
        ArrayList arrayList = new ArrayList();
        hVar.f1180a.writeLock().lock();
        try {
            hVar.f1182c = 1;
            arrayList.addAll(hVar.f1181b);
            hVar.f1181b.clear();
            hVar.f1180a.writeLock().unlock();
            hVar.f1183d.post(new N0.q(arrayList, hVar.f1182c, null));
        } catch (Throwable th) {
            hVar.f1180a.writeLock().unlock();
            throw th;
        }
    }
}
