package J;

import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class C extends u2.f implements A2.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Throwable f519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f520i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f521j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(P p3, p063s2.d dVar) {
        super(1, dVar);
        this.f521j = p3;
    }

    @Override // A2.l
    public final Object i(Object obj) {
        return new C(this.f521j, (p063s2.d) obj).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        Throwable th;
        a0 t3;
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f520i;
        P p3 = this.f521j;
        try {
            if (i3 == 0) {
                AbstractC0449g3.b(obj);
                this.f520i = 1;
                obj = P.g(p3, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = this.f519h;
                    AbstractC0449g3.b(obj);
                    t3 = new T(th, ((Number) obj).intValue());
                    return new p055q2.b(t3, Boolean.TRUE);
                }
                AbstractC0449g3.b(obj);
            }
            t3 = (a0) obj;
        } catch (Throwable th2) {
            Z zH = p3.h();
            this.f519h = th2;
            this.f520i = 2;
            Integer numA = zH.a();
            if (numA == aVar) {
                return aVar;
            }
            th = th2;
            obj = numA;
        }
        return new p055q2.b(t3, Boolean.TRUE);
    }
}
