package J;

import I2.AbstractC0052x;
import p013d1.AbstractC0449g3;

/* JADX INFO: renamed from: J.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0073t extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0057c f667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f670k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0073t(P p3, p063s2.d dVar) {
        super(2, dVar);
        this.f670k = p3;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        C0073t c0073t = new C0073t(this.f670k, dVar);
        c0073t.f669j = obj;
        return c0073t;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((C0073t) b((L2.e) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    @Override // u2.b
    public final Object j(Object obj) throws Throwable {
        L2.e eVar;
        a0 a0Var;
        L2.i iVar;
        Object objQ;
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f668i;
        p055q2.g gVar = p055q2.g.f5603a;
        P p3 = this.f670k;
        if (i3 != 0) {
            if (i3 == 1) {
                L2.e eVar2 = (L2.e) this.f669j;
                AbstractC0449g3.b(obj);
                eVar = eVar2;
            } else if (i3 == 2) {
                a0Var = this.f667h;
                eVar = (L2.e) this.f669j;
                AbstractC0449g3.b(obj);
                int i4 = 7;
                int i5 = 9;
                int i6 = 8;
                iVar = new L2.i(new A0.f(7, new A0.g(i6, new A0.g(i5, new A0.g(i4, new C0068n(p3, null), (L2.q) p3.f577k.e), new C0069o(2, null)), new C0070p(a0Var, null))), new C0071q(p3, (p063s2.d) null));
                this.f669j = null;
                this.f667h = null;
                this.f668i = 3;
                if (!(eVar instanceof L2.t)) {
                    throw ((L2.t) eVar).f952d;
                }
                objQ = iVar.q(eVar, this);
                if (objQ != aVar) {
                    objQ = gVar;
                }
                if (objQ == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0449g3.b(obj);
            }
            return gVar;
        }
        AbstractC0449g3.b(obj);
        L2.e eVar3 = (L2.e) this.f669j;
        this.f669j = eVar3;
        this.f668i = 1;
        Object objN = AbstractC0052x.n(p3.f572f.j(), new H(p3, null), this);
        if (objN == aVar) {
            return aVar;
        }
        eVar = eVar3;
        obj = objN;
        a0Var = (a0) obj;
        if (a0Var instanceof C0057c) {
            Object obj2 = ((C0057c) a0Var).f611b;
            this.f669j = eVar;
            this.f667h = (C0057c) a0Var;
            this.f668i = 2;
            if (eVar.c(obj2, this) == aVar) {
                return aVar;
            }
        } else {
            if (a0Var instanceof b0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (a0Var instanceof T) {
                throw ((T) a0Var).f587b;
            }
            if (a0Var instanceof Q) {
                return gVar;
            }
        }
        int i7 = 7;
        int i8 = 9;
        int i9 = 8;
        iVar = new L2.i(new A0.f(7, new A0.g(i9, new A0.g(i8, new A0.g(i7, new C0068n(p3, null), (L2.q) p3.f577k.e), new C0069o(2, null)), new C0070p(a0Var, null))), new C0071q(p3, (p063s2.d) null));
        this.f669j = null;
        this.f667h = null;
        this.f668i = 3;
        if (!(eVar instanceof L2.t)) {
            throw ((L2.t) eVar).f952d;
        }
        objQ = iVar.q(eVar, this);
        if (objQ != aVar) {
            objQ = gVar;
        }
        if (objQ == aVar) {
            return aVar;
        }
        return gVar;
    }
}
