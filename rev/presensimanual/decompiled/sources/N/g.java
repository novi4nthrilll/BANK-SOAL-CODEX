package N;

import A2.p;
import java.util.LinkedHashMap;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class g extends u2.f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.f f1035j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(p pVar, p063s2.d dVar) {
        super(2, dVar);
        this.f1035j = (u2.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [A2.p, u2.f] */
    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        g gVar = new g(this.f1035j, dVar);
        gVar.f1034i = obj;
        return gVar;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((g) b((b) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [A2.p, u2.f] */
    @Override // u2.b
    public final Object j(Object obj) {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f1033h;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f1034i;
            AbstractC0449g3.b(obj);
            return bVar;
        }
        AbstractC0449g3.b(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f1034i).a()), false);
        this.f1034i = bVar2;
        this.f1033h = 1;
        return this.f1035j.h(bVar2, this) == aVar ? aVar : bVar2;
    }
}
