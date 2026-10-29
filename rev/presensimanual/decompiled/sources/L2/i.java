package L2;

import J.C0071q;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class i implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A0.f f911d;
    public final /* synthetic */ C0071q e;

    public i(A0.f fVar, C0071q c0071q) {
        this.f911d = fVar;
        this.e = c0071q;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // L2.d
    public final Object q(e eVar, p063s2.d dVar) throws Throwable {
        h hVar;
        i iVar;
        t tVar;
        C0071q c0071q;
        M2.n nVar;
        Throwable th;
        M2.n nVar2;
        C0071q c0071q2;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i3 = hVar.f907h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.f907h = i3 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, dVar);
            }
        } else {
            hVar = new h(this, dVar);
        }
        Object obj = hVar.f906g;
        t2.a aVar = t2.a.f5737d;
        int i4 = hVar.f907h;
        if (i4 == 0) {
            AbstractC0449g3.b(obj);
            try {
                A0.f fVar = this.f911d;
                hVar.f909j = this;
                hVar.f910k = eVar;
                hVar.f907h = 1;
                if (fVar.q(eVar, hVar) == aVar) {
                    return aVar;
                }
                iVar = this;
                p063s2.i iVar2 = hVar.e;
                B2.h.b(iVar2);
                nVar = new M2.n(eVar, iVar2);
                c0071q2 = iVar.e;
                hVar.f909j = nVar;
                hVar.f910k = null;
                hVar.f907h = 3;
                if (c0071q2.p(nVar, null, hVar) == aVar) {
                    return aVar;
                }
                nVar2 = nVar;
                nVar2.n();
                return p055q2.g.f5603a;
            } catch (Throwable th2) {
                th = th2;
                iVar = this;
                tVar = new t(th);
                c0071q = iVar.e;
                hVar.f909j = th;
                hVar.f910k = null;
                hVar.f907h = 2;
                if (r.a(tVar, c0071q, th, hVar) == aVar) {
                    return aVar;
                }
                throw th;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                Throwable th3 = (Throwable) hVar.f909j;
                AbstractC0449g3.b(obj);
                throw th3;
            }
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar2 = (M2.n) hVar.f909j;
            try {
                AbstractC0449g3.b(obj);
                nVar2.n();
                return p055q2.g.f5603a;
            } catch (Throwable th4) {
                th = th4;
                nVar2.n();
                throw th;
            }
        }
        eVar = hVar.f910k;
        iVar = (i) hVar.f909j;
        try {
            AbstractC0449g3.b(obj);
            p063s2.i iVar3 = hVar.e;
            B2.h.b(iVar3);
            nVar = new M2.n(eVar, iVar3);
            try {
                c0071q2 = iVar.e;
                hVar.f909j = nVar;
                hVar.f910k = null;
                hVar.f907h = 3;
                if (c0071q2.p(nVar, null, hVar) == aVar) {
                    return aVar;
                }
                nVar2 = nVar;
                nVar2.n();
                return p055q2.g.f5603a;
            } catch (Throwable th5) {
                th = th5;
                nVar2 = nVar;
                nVar2.n();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            tVar = new t(th);
            c0071q = iVar.e;
            hVar.f909j = th;
            hVar.f910k = null;
            hVar.f907h = 2;
            if (r.a(tVar, c0071q, th, hVar) == aVar) {
                return aVar;
            }
            throw th;
        }
    }
}
