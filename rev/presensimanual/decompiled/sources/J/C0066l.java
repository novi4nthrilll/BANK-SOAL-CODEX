package J;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import p013d1.AbstractC0449g3;

/* JADX INFO: renamed from: J.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0066l extends u2.f implements A2.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Serializable f646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Iterator f649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P f652o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ E0.n f653p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0066l(P p3, E0.n nVar, p063s2.d dVar) {
        super(1, dVar);
        this.f652o = p3;
        this.f653p = nVar;
    }

    @Override // A2.l
    public final Object i(Object obj) {
        return new C0066l(this.f652o, this.f653p, (p063s2.d) obj).j(p055q2.g.f5603a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00da A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00db  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:38:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00a1->B:50:?, LOOP_END, SYNTHETIC] */
    @Override // u2.b
    public final Object j(Object obj) {
        Q2.a aVarA;
        B2.m mVar;
        B2.p pVar;
        B2.p pVar2;
        Iterator it;
        Q2.a aVar;
        B2.m mVar2;
        B2.p pVar3;
        C0065k c0065k;
        Q2.d dVar;
        B2.p pVar4;
        B2.m mVar3;
        A2.p pVar5;
        Q2.a aVar2;
        Object obj2;
        int iHashCode;
        Integer numA;
        int i3;
        t2.a aVar3 = t2.a.f5737d;
        int i4 = this.f651n;
        E0.n nVar = this.f653p;
        P p3 = this.f652o;
        if (i4 != 0) {
            if (i4 == 1) {
                pVar = (B2.p) this.f648k;
                pVar2 = (B2.p) this.f647j;
                mVar = (B2.m) this.f646i;
                aVarA = (Q2.a) this.f645h;
                AbstractC0449g3.b(obj);
            } else if (i4 == 2) {
                it = this.f649l;
                c0065k = (C0065k) this.f648k;
                pVar3 = (B2.p) this.f647j;
                mVar2 = (B2.m) this.f646i;
                aVar = (Q2.a) this.f645h;
                AbstractC0449g3.b(obj);
                while (it.hasNext()) {
                    pVar5 = (A2.p) it.next();
                    this.f645h = aVar;
                    this.f646i = mVar2;
                    this.f647j = pVar3;
                    this.f648k = c0065k;
                    this.f649l = it;
                    this.f651n = 2;
                    if (pVar5.h(c0065k, this) == aVar3) {
                        return aVar3;
                    }
                }
                pVar2 = pVar3;
                mVar = mVar2;
                aVarA = aVar;
                nVar.f237f = null;
                this.f645h = mVar;
                this.f646i = pVar2;
                this.f647j = aVarA;
                this.f648k = null;
                this.f649l = null;
                this.f651n = 3;
                dVar = (Q2.d) aVarA;
                if (dVar.c(this) == aVar3) {
                    return aVar3;
                }
                pVar4 = pVar2;
                mVar3 = mVar;
                aVar2 = dVar;
                mVar3.f125d = true;
                ((Q2.d) aVar2).e(null);
                obj2 = pVar4.f128d;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                Z zH = p3.h();
                this.f645h = obj2;
                this.f646i = null;
                this.f647j = null;
                this.f650m = iHashCode;
                this.f651n = 4;
                numA = zH.a();
                if (numA == aVar3) {
                    return aVar3;
                }
                i3 = iHashCode;
                obj = numA;
            } else if (i4 == 3) {
                Q2.a aVar4 = (Q2.a) this.f647j;
                pVar4 = (B2.p) this.f646i;
                mVar3 = (B2.m) this.f645h;
                AbstractC0449g3.b(obj);
                aVar2 = aVar4;
                try {
                    mVar3.f125d = true;
                    ((Q2.d) aVar2).e(null);
                    obj2 = pVar4.f128d;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    Z zH2 = p3.h();
                    this.f645h = obj2;
                    this.f646i = null;
                    this.f647j = null;
                    this.f650m = iHashCode;
                    this.f651n = 4;
                    numA = zH2.a();
                    if (numA == aVar3) {
                        return aVar3;
                    }
                    i3 = iHashCode;
                    obj = numA;
                } catch (Throwable th) {
                    ((Q2.d) aVar2).e(null);
                    throw th;
                }
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = this.f650m;
                obj2 = this.f645h;
                AbstractC0449g3.b(obj);
            }
            return new C0057c(obj2, i3, ((Number) obj).intValue());
        }
        AbstractC0449g3.b(obj);
        aVarA = Q2.e.a();
        mVar = new B2.m();
        pVar = new B2.p();
        this.f645h = aVarA;
        this.f646i = mVar;
        this.f647j = pVar;
        this.f648k = pVar;
        this.f651n = 1;
        obj = P.g(p3, true, this);
        if (obj == aVar3) {
            return aVar3;
        }
        pVar2 = pVar;
        pVar.f128d = ((C0057c) obj).f611b;
        C0065k c0065k2 = new C0065k(aVarA, mVar, pVar2, p3);
        List list = (List) nVar.f237f;
        if (list != null) {
            it = list.iterator();
            aVar = aVarA;
            mVar2 = mVar;
            pVar3 = pVar2;
            c0065k = c0065k2;
            while (it.hasNext()) {
                pVar5 = (A2.p) it.next();
                this.f645h = aVar;
                this.f646i = mVar2;
                this.f647j = pVar3;
                this.f648k = c0065k;
                this.f649l = it;
                this.f651n = 2;
                if (pVar5.h(c0065k, this) == aVar3) {
                    return aVar3;
                }
            }
            pVar2 = pVar3;
            mVar = mVar2;
            aVarA = aVar;
        }
        nVar.f237f = null;
        this.f645h = mVar;
        this.f646i = pVar2;
        this.f647j = aVarA;
        this.f648k = null;
        this.f649l = null;
        this.f651n = 3;
        dVar = (Q2.d) aVarA;
        if (dVar.c(this) == aVar3) {
            return aVar3;
        }
        pVar4 = pVar2;
        mVar3 = mVar;
        aVar2 = dVar;
        mVar3.f125d = true;
        ((Q2.d) aVar2).e(null);
        obj2 = pVar4.f128d;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        Z zH3 = p3.h();
        this.f645h = obj2;
        this.f646i = null;
        this.f647j = null;
        this.f650m = iHashCode;
        this.f651n = 4;
        numA = zH3.a();
        if (numA == aVar3) {
            return aVar3;
        }
        i3 = iHashCode;
        obj = numA;
        return new C0057c(obj2, i3, ((Number) obj).intValue());
    }
}
