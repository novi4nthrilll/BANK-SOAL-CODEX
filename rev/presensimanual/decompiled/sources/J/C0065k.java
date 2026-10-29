package J;

import p013d1.AbstractC0449g3;

/* JADX INFO: renamed from: J.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0065k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q2.a f641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B2.m f642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B2.p f643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f644d;

    public C0065k(Q2.a aVar, B2.m mVar, B2.p pVar, P p3) {
        this.f641a = aVar;
        this.f642b = mVar;
        this.f643c = pVar;
        this.f644d = p3;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ae, B:38:0x00b6), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C0061g c0061g, u2.b bVar) throws Throwable {
        C0064j c0064j;
        P p3;
        B2.m mVar;
        B2.p pVar;
        Q2.a aVar;
        A2.p pVar2;
        Q2.a aVar2;
        Q2.a aVar3;
        P p4;
        Object obj;
        B2.p pVar3;
        Q2.a aVar4;
        if (bVar instanceof C0064j) {
            c0064j = (C0064j) bVar;
            int i3 = c0064j.f640n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0064j.f640n = i3 - Integer.MIN_VALUE;
            } else {
                c0064j = new C0064j(this, bVar);
            }
        } else {
            c0064j = new C0064j(this, bVar);
        }
        Object obj2 = c0064j.f638l;
        t2.a aVar5 = t2.a.f5737d;
        int i4 = c0064j.f640n;
        try {
            if (i4 == 0) {
                AbstractC0449g3.b(obj2);
                c0064j.f633g = c0061g;
                Q2.a aVar6 = this.f641a;
                c0064j.f634h = aVar6;
                B2.m mVar2 = this.f642b;
                c0064j.f635i = mVar2;
                B2.p pVar4 = this.f643c;
                c0064j.f636j = pVar4;
                p3 = this.f644d;
                c0064j.f637k = p3;
                c0064j.f640n = 1;
                Q2.d dVar = (Q2.d) aVar6;
                if (dVar.c(c0064j) == aVar5) {
                    return aVar5;
                }
                mVar = mVar2;
                pVar = pVar4;
                pVar2 = c0061g;
                aVar = dVar;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = c0064j.f635i;
                        pVar3 = (B2.p) c0064j.f634h;
                        aVar2 = (Q2.a) c0064j.f633g;
                        try {
                            AbstractC0449g3.b(obj2);
                            aVar4 = aVar2;
                            pVar3.f128d = obj;
                            pVar = pVar3;
                            aVar2 = aVar4;
                            Object obj3 = pVar.f128d;
                            ((Q2.d) aVar2).e(null);
                            return obj3;
                        } catch (Throwable th) {
                            th = th;
                            ((Q2.d) aVar2).e(null);
                            throw th;
                        }
                    }
                    p4 = (P) c0064j.f635i;
                    pVar = (B2.p) c0064j.f634h;
                    aVar3 = (Q2.a) c0064j.f633g;
                    try {
                        AbstractC0449g3.b(obj2);
                        aVar3 = aVar3;
                        if (B2.h.a(obj2, pVar.f128d)) {
                            aVar2 = aVar3;
                        } else {
                            c0064j.f633g = aVar3;
                            c0064j.f634h = pVar;
                            c0064j.f635i = obj2;
                            c0064j.f640n = 3;
                            if (p4.k(obj2, false, c0064j) == aVar5) {
                                return aVar5;
                            }
                            obj = obj2;
                            pVar3 = pVar;
                            aVar4 = aVar3;
                            pVar3.f128d = obj;
                            pVar = pVar3;
                            aVar2 = aVar4;
                        }
                        Object obj4 = pVar.f128d;
                        ((Q2.d) aVar2).e(null);
                        return obj4;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar3;
                        ((Q2.d) aVar2).e(null);
                        throw th;
                    }
                }
                P p5 = c0064j.f637k;
                pVar = c0064j.f636j;
                mVar = (B2.m) c0064j.f635i;
                Q2.a aVar7 = (Q2.a) c0064j.f634h;
                A2.p pVar5 = (A2.p) c0064j.f633g;
                AbstractC0449g3.b(obj2);
                aVar = aVar7;
                p3 = p5;
                pVar2 = pVar5;
            }
            if (mVar.f125d) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = pVar.f128d;
            c0064j.f633g = aVar;
            c0064j.f634h = pVar;
            c0064j.f635i = p3;
            c0064j.f636j = null;
            c0064j.f637k = null;
            c0064j.f640n = 2;
            Object objH = pVar2.h(obj5, c0064j);
            if (objH == aVar5) {
                return aVar5;
            }
            aVar3 = aVar;
            obj2 = objH;
            p4 = p3;
            if (B2.h.a(obj2, pVar.f128d)) {
                c0064j.f633g = aVar3;
                c0064j.f634h = pVar;
                c0064j.f635i = obj2;
                c0064j.f640n = 3;
                if (p4.k(obj2, false, c0064j) == aVar5) {
                    return aVar5;
                }
                obj = obj2;
                pVar3 = pVar;
                aVar4 = aVar3;
                pVar3.f128d = obj;
                pVar = pVar3;
                aVar2 = aVar4;
            } else {
                aVar2 = aVar3;
            }
            Object obj6 = pVar.f128d;
            ((Q2.d) aVar2).e(null);
            return obj6;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            ((Q2.d) aVar2).e(null);
            throw th;
        }
    }
}
