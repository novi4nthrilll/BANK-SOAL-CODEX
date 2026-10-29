package I2;

import p013d1.AbstractC0514r3;

/* JADX INFO: renamed from: I2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0041l extends b0 implements InterfaceC0040k {
    public final Object U(u2.f fVar) throws Throwable {
        Object objE;
        do {
            objE = E();
            if (!(objE instanceof N)) {
                if (objE instanceof C0043n) {
                    throw ((C0043n) objE).f490a;
                }
                return AbstractC0052x.l(objE);
            }
        } while (R(objE) < 0);
        X x3 = new X(AbstractC0514r3.a(fVar), this);
        x3.v();
        x3.x(new F(I(false, true, new Q(1, x3))));
        return x3.u();
    }
}
