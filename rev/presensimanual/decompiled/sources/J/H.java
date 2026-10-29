package J;

import I2.InterfaceC0050v;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class H extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P f548i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(P p3, p063s2.d dVar) {
        super(2, dVar);
        this.f548i = p3;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        return new H(this.f548i, dVar);
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((H) b((InterfaceC0050v) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f547h;
        P p3 = this.f548i;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    AbstractC0449g3.b(obj);
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0449g3.b(obj);
                }
                return (a0) obj;
            }
            AbstractC0449g3.b(obj);
            if (p3.f577k.h() instanceof Q) {
                return p3.f577k.h();
            }
            this.f547h = 1;
            if (p3.i(this) == aVar) {
                return aVar;
            }
            this.f547h = 2;
            obj = P.d(p3, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (a0) obj;
        } catch (Throwable th) {
            return new T(th, -1);
        }
    }
}
