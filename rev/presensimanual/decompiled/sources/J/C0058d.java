package J;

import java.util.List;
import p013d1.AbstractC0449g3;
import p013d1.AbstractC0475l;

/* JADX INFO: renamed from: J.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0058d extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f616j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0058d(List list, p063s2.d dVar) {
        super(2, dVar);
        this.f616j = list;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        C0058d c0058d = new C0058d(this.f616j, dVar);
        c0058d.f615i = obj;
        return c0058d;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((C0058d) b((C0065k) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f614h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            C0065k c0065k = (C0065k) this.f615i;
            this.f614h = 1;
            if (AbstractC0475l.a(this.f616j, c0065k, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0449g3.b(obj);
        }
        return p055q2.g.f5603a;
    }
}
