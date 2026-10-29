package M2;

/* JADX INFO: loaded from: classes.dex */
public final class s implements p063s2.d, u2.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p063s2.d f1022d;
    public final p063s2.i e;

    public s(p063s2.d dVar, p063s2.i iVar) {
        this.f1022d = dVar;
        this.e = iVar;
    }

    @Override // u2.c
    public final u2.c e() {
        p063s2.d dVar = this.f1022d;
        if (dVar instanceof u2.c) {
            return (u2.c) dVar;
        }
        return null;
    }

    @Override // p063s2.d
    public final p063s2.i g() {
        return this.e;
    }

    @Override // p063s2.d
    public final void l(Object obj) {
        this.f1022d.l(obj);
    }
}
