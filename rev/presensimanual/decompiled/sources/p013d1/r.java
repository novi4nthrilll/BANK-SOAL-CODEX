package p013d1;

import A2.p;
import B2.s;
import I2.AbstractC0052x;
import I2.C0043n;
import N2.t;
import t2.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final Object a(t tVar, t tVar2, p pVar) throws Throwable {
        Object c0043n;
        Object objL;
        try {
            s.a(2, pVar);
            c0043n = pVar.h(tVar2, tVar);
        } catch (Throwable th) {
            c0043n = new C0043n(th, false);
        }
        a aVar = a.f5737d;
        if (c0043n == aVar || (objL = tVar.L(c0043n)) == AbstractC0052x.f500d) {
            return aVar;
        }
        if (objL instanceof C0043n) {
            throw ((C0043n) objL).f490a;
        }
        return AbstractC0052x.l(objL);
    }
}
