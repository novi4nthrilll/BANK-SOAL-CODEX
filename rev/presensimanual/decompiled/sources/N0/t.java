package N0;

import O0.InterfaceC0088b;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class t implements InterfaceC0088b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M0.c f1109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0081b f1110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O0.g f1111c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f1112d = null;
    public boolean e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0083d f1113f;

    public t(C0083d c0083d, M0.c cVar, C0081b c0081b) {
        this.f1113f = c0083d;
        this.f1109a = cVar;
        this.f1110b = c0081b;
    }

    @Override // O0.InterfaceC0088b
    public final void a(L0.a aVar) {
        this.f1113f.f1080m.post(new E0.e(this, aVar, 1, false));
    }

    public final void b(L0.a aVar) {
        r rVar = (r) this.f1113f.f1077j.get(this.f1110b);
        if (rVar != null) {
            rVar.p(aVar);
        }
    }
}
