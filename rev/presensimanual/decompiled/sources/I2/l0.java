package I2;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends N2.t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ThreadLocal f483h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public l0(p063s2.i iVar, u2.f fVar) {
        m0 m0Var = m0.f488d;
        super(fVar, iVar.f(m0Var) == null ? iVar.h(m0Var) : iVar);
        this.f483h = new ThreadLocal();
        p063s2.i iVar2 = fVar.e;
        B2.h.b(iVar2);
        if (iVar2.f(p063s2.e.f5669d) instanceof AbstractC0048t) {
            return;
        }
        Object objM = N2.a.m(iVar, null);
        N2.a.h(iVar, objM);
        Y(iVar, objM);
    }

    public final boolean X() {
        boolean z2 = this.threadLocalIsSet && this.f483h.get() == null;
        this.f483h.remove();
        return !z2;
    }

    public final void Y(p063s2.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f483h.set(new p055q2.b(iVar, obj));
    }

    @Override // N2.t, I2.b0
    public final void r(Object obj) {
        if (this.threadLocalIsSet) {
            p055q2.b bVar = (p055q2.b) this.f483h.get();
            if (bVar != null) {
                N2.a.h((p063s2.i) bVar.f5598d, bVar.e);
            }
            this.f483h.remove();
        }
        Object objH = AbstractC0052x.h(obj);
        p063s2.d dVar = this.f1163g;
        p063s2.i iVarG = dVar.g();
        Object objM = N2.a.m(iVarG, null);
        l0 l0VarM = objM != N2.a.f1132f ? AbstractC0052x.m(dVar, iVarG, objM) : null;
        try {
            this.f1163g.l(objH);
        } finally {
            if (l0VarM == null || l0VarM.X()) {
                N2.a.h(iVarG, objM);
            }
        }
    }
}
