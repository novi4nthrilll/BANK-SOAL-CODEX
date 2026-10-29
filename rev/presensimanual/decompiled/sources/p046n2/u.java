package p046n2;

import A2.p;
import I2.InterfaceC0050v;
import java.util.List;
import p013d1.AbstractC0449g3;
import p055q2.g;
import p063s2.d;
import t2.a;
import u2.f;

/* JADX INFO: loaded from: classes.dex */
public final class u extends f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f5488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f5489j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(J j3, List list, d dVar) {
        super(2, dVar);
        this.f5488i = j3;
        this.f5489j = list;
    }

    @Override // u2.b
    public final d b(Object obj, d dVar) {
        return new u(this.f5488i, this.f5489j, dVar);
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((u) b((InterfaceC0050v) obj, (d) obj2)).j(g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        a aVar = a.f5737d;
        int i3 = this.f5487h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            this.f5487h = 1;
            obj = J.l(this.f5488i, this.f5489j, this);
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
