package J;

import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0449g3;

/* JADX INFO: renamed from: J.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0071q extends u2.f implements A2.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f660h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f662j;

    public /* synthetic */ C0071q(int i3, p063s2.d dVar) {
        super(i3, dVar);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        switch (this.f660h) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                t2.a aVar = t2.a.f5737d;
                int i3 = this.f661i;
                if (i3 == 0) {
                    AbstractC0449g3.b(obj);
                    this.f661i = 1;
                    if (P.a((P) this.f662j, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0449g3.b(obj);
                }
                return p055q2.g.f5603a;
            default:
                t2.a aVar2 = t2.a.f5737d;
                int i4 = this.f661i;
                if (i4 == 0) {
                    AbstractC0449g3.b(obj);
                    L.c cVar = (L.c) this.f662j;
                    this.f661i = 1;
                    cVar.getClass();
                    obj = L.c.a(cVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0449g3.b(obj);
                }
                return obj;
        }
    }

    public final Object p(Object obj, Object obj2, u2.b bVar) {
        switch (this.f660h) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return new C0071q((P) this.f662j, bVar).j(p055q2.g.f5603a);
            default:
                ((Boolean) obj2).getClass();
                C0071q c0071q = new C0071q(3, bVar);
                c0071q.f662j = (L.c) obj;
                return c0071q.j(p055q2.g.f5603a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0071q(P p3, p063s2.d dVar) {
        super(3, dVar);
        this.f662j = p3;
    }
}
