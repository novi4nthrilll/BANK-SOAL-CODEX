package p046n2;

import A2.p;
import I2.InterfaceC0050v;
import java.util.List;
import p013d1.AbstractC0449g3;
import p055q2.g;
import p063s2.d;
import t2.a;
import u2.f;

/* JADX INFO: renamed from: n2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0780l extends f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f5457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f5458j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0780l(J j3, List list, d dVar) {
        super(2, dVar);
        this.f5457i = j3;
        this.f5458j = list;
    }

    @Override // u2.b
    public final d b(Object obj, d dVar) {
        return new C0780l(this.f5457i, this.f5458j, dVar);
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((C0780l) b((InterfaceC0050v) obj, (d) obj2)).j(g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        a aVar = a.f5737d;
        int i3 = this.f5456h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            this.f5456h = 1;
            obj = J.l(this.f5457i, this.f5458j, this);
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
