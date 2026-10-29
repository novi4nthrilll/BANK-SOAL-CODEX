package p046n2;

import A2.p;
import N.b;
import N.e;
import p013d1.AbstractC0449g3;
import p055q2.g;
import p063s2.d;
import u2.f;

/* JADX INFO: loaded from: classes.dex */
public final class G extends f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f5418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f5419j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(e eVar, long j3, d dVar) {
        super(2, dVar);
        this.f5418i = eVar;
        this.f5419j = j3;
    }

    @Override // u2.b
    public final d b(Object obj, d dVar) {
        G g3 = new G(this.f5418i, this.f5419j, dVar);
        g3.f5417h = obj;
        return g3;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        G g3 = (G) b((b) obj, (d) obj2);
        g gVar = g.f5603a;
        g3.j(gVar);
        return gVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        AbstractC0449g3.b(obj);
        ((b) this.f5417h).d(this.f5418i, new Long(this.f5419j));
        return g.f5603a;
    }
}
