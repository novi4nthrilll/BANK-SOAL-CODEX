package I2;

/* JADX INFO: loaded from: classes.dex */
public final class X extends C0035f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0041l f455l;

    public X(p063s2.d dVar, C0041l c0041l) {
        super(1, dVar);
        this.f455l = c0041l;
    }

    @Override // I2.C0035f
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // I2.C0035f
    public final Throwable t(b0 b0Var) {
        Throwable thC;
        Object objE = this.f455l.E();
        if (!(objE instanceof Z) || (thC = ((Z) objE).c()) == null) {
            return objE instanceof C0043n ? ((C0043n) objE).f490a : b0Var.A();
        }
        return thC;
    }
}
