package J;

import B.C0006g;
import java.util.concurrent.atomic.AtomicInteger;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class O extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public B2.n f564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ B2.n f567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ P f568l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f569m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f570n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(B2.n nVar, P p3, Object obj, boolean z2, p063s2.d dVar) {
        super(2, dVar);
        this.f567k = nVar;
        this.f568l = p3;
        this.f569m = obj;
        this.f570n = z2;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        O o3 = new O(this.f567k, this.f568l, this.f569m, this.f570n, dVar);
        o3.f566j = obj;
        return o3;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((O) b((L.k) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    @Override // u2.b
    public final Object j(Object obj) {
        B2.n nVar;
        L.k kVar;
        int iHashCode;
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f565i;
        B2.n nVar2 = this.f567k;
        Object obj2 = this.f569m;
        P p3 = this.f568l;
        if (i3 != 0) {
            if (i3 == 1) {
                nVar = this.f564h;
                kVar = (L.k) this.f566j;
                AbstractC0449g3.b(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0449g3.b(obj);
            }
            if (this.f570n) {
                C0006g c0006g = p3.f577k;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                c0006g.s(new C0057c(obj2, iHashCode, nVar2.f126d));
            }
            return p055q2.g.f5603a;
        }
        AbstractC0449g3.b(obj);
        L.k kVar2 = (L.k) this.f566j;
        Z zH = p3.h();
        this.f566j = kVar2;
        this.f564h = nVar2;
        this.f565i = 1;
        Integer num = new Integer(((AtomicInteger) zH.f607b.e).incrementAndGet());
        if (num == aVar) {
            return aVar;
        }
        nVar = nVar2;
        kVar = kVar2;
        obj = num;
        nVar.f126d = ((Number) obj).intValue();
        this.f566j = null;
        this.f564h = null;
        this.f565i = 2;
        if (kVar.b(obj2, this) == aVar) {
            return aVar;
        }
        if (this.f570n) {
            C0006g c0006g2 = p3.f577k;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            c0006g2.s(new C0057c(obj2, iHashCode, nVar2.f126d));
        }
        return p055q2.g.f5603a;
    }
}
