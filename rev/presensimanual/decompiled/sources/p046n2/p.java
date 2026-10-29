package p046n2;

import B2.h;
import I2.InterfaceC0050v;
import J.InterfaceC0062h;
import L2.r;
import N.e;
import android.content.Context;
import p013d1.AbstractC0449g3;
import p055q2.g;
import p063s2.d;
import t2.a;
import u2.f;

/* JADX INFO: loaded from: classes.dex */
public final class p extends f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public B2.p f5466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f5468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J f5469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B2.p f5470l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, J j3, B2.p pVar, d dVar) {
        super(2, dVar);
        this.f5468j = str;
        this.f5469k = j3;
        this.f5470l = pVar;
    }

    @Override // u2.b
    public final d b(Object obj, d dVar) {
        return new p(this.f5468j, this.f5469k, this.f5470l, dVar);
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((p) b((InterfaceC0050v) obj, (d) obj2)).j(g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        B2.p pVar;
        a aVar = a.f5737d;
        int i3 = this.f5467i;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            e eVar = new e(this.f5468j);
            Context context = this.f5469k.f5428d;
            if (context == null) {
                h.g("context");
                throw null;
            }
            o oVar = new o(((InterfaceC0062h) K.a(context).e).e(), eVar, 0);
            B2.p pVar2 = this.f5470l;
            this.f5466h = pVar2;
            this.f5467i = 1;
            Object objC = r.c(oVar, this);
            if (objC == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj = objC;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f5466h;
            AbstractC0449g3.b(obj);
        }
        pVar.f128d = obj;
        return g.f5603a;
    }
}
