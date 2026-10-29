package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f2391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f2392b;

    public final void a(q qVar, j jVar) {
        k kVarA = jVar.a();
        k kVar = this.f2391a;
        B2.h.e(kVar, "state1");
        if (kVarA.compareTo(kVar) < 0) {
            kVar = kVarA;
        }
        this.f2391a = kVar;
        this.f2392b.f(qVar, jVar);
        this.f2391a = kVarA;
    }
}
