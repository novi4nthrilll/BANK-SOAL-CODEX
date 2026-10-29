package J;

import B.C0006g;
import java.util.concurrent.atomic.AtomicInteger;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q2.d f606a = Q2.e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0006g f607b = new C0006g(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0006g f608c = new C0006g(new Y(2, null));

    public Z(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f607b.e).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(A2.l lVar, u2.b bVar) {
        W w3;
        Q2.d dVar;
        Throwable th;
        Q2.a aVar;
        if (bVar instanceof W) {
            w3 = (W) bVar;
            int i3 = w3.f600k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w3.f600k = i3 - Integer.MIN_VALUE;
            } else {
                w3 = new W(this, bVar);
            }
        } else {
            w3 = new W(this, bVar);
        }
        Object obj = w3.f598i;
        t2.a aVar2 = t2.a.f5737d;
        int i4 = w3.f600k;
        try {
            if (i4 == 0) {
                AbstractC0449g3.b(obj);
                w3.f596g = lVar;
                dVar = this.f606a;
                w3.f597h = dVar;
                w3.f600k = 1;
                if (dVar.c(w3) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (Q2.a) w3.f596g;
                    try {
                        AbstractC0449g3.b(obj);
                        ((Q2.d) aVar).e(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        ((Q2.d) aVar).e(null);
                        throw th;
                    }
                }
                Q2.d dVar2 = w3.f597h;
                A2.l lVar2 = (A2.l) w3.f596g;
                AbstractC0449g3.b(obj);
                dVar = dVar2;
                lVar = lVar2;
            }
            w3.f596g = dVar;
            w3.f597h = null;
            w3.f600k = 2;
            Object objI = lVar.i(w3);
            if (objI == aVar2) {
                return aVar2;
            }
            Q2.d dVar3 = dVar;
            obj = objI;
            aVar = dVar3;
            ((Q2.d) aVar).e(null);
            return obj;
        } catch (Throwable th3) {
            Q2.d dVar4 = dVar;
            th = th3;
            aVar = dVar4;
            ((Q2.d) aVar).e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(A2.p pVar, u2.b bVar) {
        X x3;
        Q2.d dVar;
        Throwable th;
        boolean z2;
        if (bVar instanceof X) {
            x3 = (X) bVar;
            int i3 = x3.f605k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x3.f605k = i3 - Integer.MIN_VALUE;
            } else {
                x3 = new X(this, bVar);
            }
        } else {
            x3 = new X(this, bVar);
        }
        Object obj = x3.f603i;
        Object obj2 = t2.a.f5737d;
        int i4 = x3.f605k;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = x3.f602h;
            dVar = x3.f601g;
            try {
                AbstractC0449g3.b(obj);
                if (z2) {
                    dVar.e(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z2) {
                    dVar.e(null);
                }
                throw th;
            }
        }
        AbstractC0449g3.b(obj);
        Q2.d dVar2 = this.f606a;
        boolean zD = dVar2.d(null);
        try {
            Object objValueOf = Boolean.valueOf(zD);
            x3.f601g = dVar2;
            x3.f602h = zD;
            x3.f605k = 1;
            Object objH = pVar.h(objValueOf, x3);
            if (objH == obj2) {
                return obj2;
            }
            dVar = dVar2;
            obj = objH;
            z2 = zD;
            if (z2) {
                dVar.e(null);
            }
            return obj;
        } catch (Throwable th3) {
            dVar = dVar2;
            th = th3;
            z2 = zD;
            if (z2) {
                dVar.e(null);
            }
            throw th;
        }
    }
}
