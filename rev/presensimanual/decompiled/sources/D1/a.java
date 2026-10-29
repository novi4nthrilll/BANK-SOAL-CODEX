package D1;

import A0.g;
import D0.b;
import E0.n;
import R1.i;
import S1.f;
import S1.m;

/* JADX INFO: loaded from: classes.dex */
public class a implements O1.a, m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f194d;

    @Override // S1.m
    public final void a(g gVar, i iVar) {
        iVar.b();
    }

    @Override // O1.a
    public final void b(b bVar) {
        n nVar = new n((f) bVar.f182f, "google_mlkit_commons");
        this.f194d = nVar;
        nVar.f(this);
    }

    @Override // O1.a
    public final void k(b bVar) {
        this.f194d.f(null);
    }
}
