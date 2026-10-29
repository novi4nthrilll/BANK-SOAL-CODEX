package p046n2;

import A2.p;
import I2.InterfaceC0050v;
import p013d1.AbstractC0449g3;
import p055q2.g;
import p063s2.d;
import t2.a;
import u2.f;

/* JADX INFO: loaded from: classes.dex */
public final class F extends f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f5414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f5415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f5416k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(J j3, String str, String str2, d dVar) {
        super(2, dVar);
        this.f5414i = j3;
        this.f5415j = str;
        this.f5416k = str2;
    }

    @Override // u2.b
    public final d b(Object obj, d dVar) {
        return new F(this.f5414i, this.f5415j, this.f5416k, dVar);
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((F) b((InterfaceC0050v) obj, (d) obj2)).j(g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        a aVar = a.f5737d;
        int i3 = this.f5413h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            this.f5413h = 1;
            if (J.c(this.f5414i, this.f5415j, this.f5416k, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0449g3.b(obj);
        }
        return g.f5603a;
    }
}
