package p046n2;

import A2.p;
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
public final class x extends f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public B2.p f5501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f5503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J f5504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B2.p f5505l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, J j3, B2.p pVar, d dVar) {
        super(2, dVar);
        this.f5503j = str;
        this.f5504k = j3;
        this.f5505l = pVar;
    }

    @Override // u2.b
    public final d b(Object obj, d dVar) {
        return new x(this.f5503j, this.f5504k, this.f5505l, dVar);
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((x) b((InterfaceC0050v) obj, (d) obj2)).j(g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        B2.p pVar;
        a aVar = a.f5737d;
        int i3 = this.f5502i;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            e eVar = new e(this.f5503j);
            Context context = this.f5504k.f5428d;
            if (context == null) {
                h.g("context");
                throw null;
            }
            o oVar = new o(((InterfaceC0062h) K.a(context).e).e(), eVar, 2);
            B2.p pVar2 = this.f5505l;
            this.f5501h = pVar2;
            this.f5502i = 1;
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
            pVar = this.f5501h;
            AbstractC0449g3.b(obj);
        }
        pVar.f128d = obj;
        return g.f5603a;
    }
}
