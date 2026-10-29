package p046n2;

import A2.p;
import N.b;
import N.e;
import p013d1.AbstractC0449g3;
import p055q2.g;
import p063s2.d;
import u2.f;

/* JADX INFO: renamed from: n2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0779k extends f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f5454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f5455j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0779k(e eVar, String str, d dVar) {
        super(2, dVar);
        this.f5454i = eVar;
        this.f5455j = str;
    }

    @Override // u2.b
    public final d b(Object obj, d dVar) {
        C0779k c0779k = new C0779k(this.f5454i, this.f5455j, dVar);
        c0779k.f5453h = obj;
        return c0779k;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        C0779k c0779k = (C0779k) b((b) obj, (d) obj2);
        g gVar = g.f5603a;
        c0779k.j(gVar);
        return gVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        AbstractC0449g3.b(obj);
        ((b) this.f5453h).d(this.f5454i, this.f5455j);
        return g.f5603a;
    }
}
