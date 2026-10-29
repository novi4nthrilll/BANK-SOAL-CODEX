package J;

import I2.InterfaceC0050v;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class I extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u2.f f550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0057c f551j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(A2.p pVar, C0057c c0057c, p063s2.d dVar) {
        super(2, dVar);
        this.f550i = (u2.f) pVar;
        this.f551j = c0057c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A2.p, u2.f] */
    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        return new I(this.f550i, this.f551j, dVar);
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((I) b((InterfaceC0050v) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [A2.p, u2.f] */
    @Override // u2.b
    public final Object j(Object obj) {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f549h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            Object obj2 = this.f551j.f611b;
            this.f549h = 1;
            obj = this.f550i.h(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0449g3.b(obj);
        }
        return obj;
    }
}
