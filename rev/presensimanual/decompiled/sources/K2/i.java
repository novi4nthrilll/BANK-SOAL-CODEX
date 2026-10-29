package K2;

import I2.C0035f;
import I2.C0049u;
import J.K;
import p013d1.AbstractC0449g3;
import p013d1.AbstractC0514r3;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f811a = new h();

    public static b a(int i3, int i4, int i5) {
        b mVar;
        if ((i5 & 2) != 0) {
            i4 = 1;
        }
        if (i3 != -2) {
            if (i3 == -1) {
                if (i4 == 1) {
                    return new m(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i3 != 0) {
                if (i3 != Integer.MAX_VALUE) {
                    return i4 == 1 ? new b(i3, null) : new m(i3, i4, null);
                }
                return new b(Integer.MAX_VALUE, null);
            }
            mVar = i4 == 1 ? new b(0, null) : new m(1, i4, null);
        } else if (i4 == 1) {
            f.f809a.getClass();
            mVar = new b(e.f808b, null);
        } else {
            mVar = new m(1, i4, null);
        }
        return mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [A2.a, M.b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [A2.a] */
    /* JADX WARN: Type inference failed for: r5v3, types: [A2.a] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static final Object b(p pVar, M.b bVar, u2.b bVar2) {
        n nVar;
        if (bVar2 instanceof n) {
            nVar = (n) bVar2;
            int i3 = nVar.f818i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.f818i = i3 - Integer.MIN_VALUE;
            } else {
                nVar = new n(bVar2);
            }
        } else {
            nVar = new n(bVar2);
        }
        Object obj = nVar.f817h;
        t2.a aVar = t2.a.f5737d;
        int i4 = nVar.f818i;
        try {
            if (i4 == 0) {
                AbstractC0449g3.b(obj);
                p063s2.i iVar = nVar.e;
                B2.h.b(iVar);
                if (iVar.f(C0049u.e) != pVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                nVar.f816g = bVar;
                nVar.f818i = 1;
                C0035f c0035f = new C0035f(1, AbstractC0514r3.a(nVar));
                c0035f.v();
                ((o) pVar).X(new K(1, c0035f));
                if (c0035f.u() == aVar) {
                    bVar = bVar;
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                A2.a aVar2 = nVar.f816g;
                AbstractC0449g3.b(obj);
                bVar = aVar2;
            }
            bVar = bVar;
            bVar.a();
            return p055q2.g.f5603a;
        } catch (Throwable th) {
            bVar.a();
            throw th;
        }
    }
}
