package M2;

import I2.AbstractC0052x;
import I2.C0046q;

/* JADX INFO: loaded from: classes.dex */
public final class h extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L2.d f1010g;

    public h(L2.d dVar, p063s2.i iVar, int i3, int i4) {
        super(iVar, i3, i4);
        this.f1010g = dVar;
    }

    @Override // M2.f
    public final Object a(K2.p pVar, p063s2.d dVar) {
        Object objQ = this.f1010g.q(new r(pVar), dVar);
        t2.a aVar = t2.a.f5737d;
        p055q2.g gVar = p055q2.g.f5603a;
        if (objQ != aVar) {
            objQ = gVar;
        }
        return objQ == aVar ? objQ : gVar;
    }

    @Override // M2.f
    public final f c(p063s2.i iVar, int i3, int i4) {
        return new h(this.f1010g, iVar, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // M2.f, L2.d
    public final Object q(L2.e eVar, p063s2.d dVar) {
        Object objQ;
        p055q2.g gVar = p055q2.g.f5603a;
        int i3 = this.e;
        t2.a aVar = t2.a.f5737d;
        if (i3 == -3) {
            p063s2.i iVarG = dVar.g();
            Boolean bool = Boolean.FALSE;
            C0046q c0046q = C0046q.f494g;
            p063s2.i iVar = this.f1005d;
            p063s2.i iVarH = !((Boolean) iVar.c(bool, c0046q)).booleanValue() ? iVarG.h(iVar) : AbstractC0052x.a(iVarG, iVar, false);
            if (B2.h.a(iVarH, iVarG)) {
                objQ = this.f1010g.q(eVar, dVar);
                if (objQ != aVar) {
                    objQ = gVar;
                }
                if (objQ != aVar) {
                    return gVar;
                }
            } else {
                p063s2.e eVar2 = p063s2.e.f5669d;
                if (B2.h.a(iVarH.f(eVar2), iVarG.f(eVar2))) {
                    p063s2.i iVarG2 = dVar.g();
                    if (!(eVar instanceof r)) {
                        eVar = new L2.l(eVar, iVarG2);
                    }
                    objQ = l.b(iVarH, eVar, N2.a.l(iVarH), new g(this, null), dVar);
                    if (objQ != aVar) {
                        objQ = gVar;
                    }
                    if (objQ != aVar) {
                        return gVar;
                    }
                } else {
                    objQ = super.q(eVar, dVar);
                    if (objQ != aVar) {
                        return gVar;
                    }
                }
            }
        } else {
            objQ = super.q(eVar, dVar);
            if (objQ != aVar) {
                return gVar;
            }
        }
        return objQ;
    }

    @Override // M2.f
    public final String toString() {
        return this.f1010g + " -> " + super.toString();
    }
}
