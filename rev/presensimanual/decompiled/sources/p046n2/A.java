package p046n2;

import A2.p;
import N.b;
import N.e;
import p013d1.AbstractC0449g3;
import p055q2.g;
import p063s2.d;
import u2.f;

/* JADX INFO: loaded from: classes.dex */
public final class A extends f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f5396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f5397j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(e eVar, boolean z2, d dVar) {
        super(2, dVar);
        this.f5396i = eVar;
        this.f5397j = z2;
    }

    @Override // u2.b
    public final d b(Object obj, d dVar) {
        A a3 = new A(this.f5396i, this.f5397j, dVar);
        a3.f5395h = obj;
        return a3;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        A a3 = (A) b((b) obj, (d) obj2);
        g gVar = g.f5603a;
        a3.j(gVar);
        return gVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        AbstractC0449g3.b(obj);
        ((b) this.f5395h).d(this.f5396i, Boolean.valueOf(this.f5397j));
        return g.f5603a;
    }
}
