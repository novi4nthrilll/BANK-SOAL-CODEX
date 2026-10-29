package p046n2;

import A2.p;
import N.b;
import N.e;
import p013d1.AbstractC0449g3;
import p055q2.g;
import p063s2.d;
import u2.f;

/* JADX INFO: loaded from: classes.dex */
public final class D extends f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f5407i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ double f5408j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(e eVar, double d3, d dVar) {
        super(2, dVar);
        this.f5407i = eVar;
        this.f5408j = d3;
    }

    @Override // u2.b
    public final d b(Object obj, d dVar) {
        D d3 = new D(this.f5407i, this.f5408j, dVar);
        d3.f5406h = obj;
        return d3;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        D d3 = (D) b((b) obj, (d) obj2);
        g gVar = g.f5603a;
        d3.j(gVar);
        return gVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        AbstractC0449g3.b(obj);
        ((b) this.f5406h).d(this.f5407i, new Double(this.f5408j));
        return g.f5603a;
    }
}
