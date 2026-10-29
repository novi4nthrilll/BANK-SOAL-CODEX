package p046n2;

import A2.p;
import B.C0006g;
import B2.h;
import I2.InterfaceC0050v;
import N.e;
import android.content.Context;
import p013d1.AbstractC0449g3;
import p055q2.g;
import p063s2.d;
import t2.a;
import u2.f;

/* JADX INFO: loaded from: classes.dex */
public final class B extends f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f5399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J f5400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f5401k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(String str, J j3, boolean z2, d dVar) {
        super(2, dVar);
        this.f5399i = str;
        this.f5400j = j3;
        this.f5401k = z2;
    }

    @Override // u2.b
    public final d b(Object obj, d dVar) {
        return new B(this.f5399i, this.f5400j, this.f5401k, dVar);
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((B) b((InterfaceC0050v) obj, (d) obj2)).j(g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        a aVar = a.f5737d;
        int i3 = this.f5398h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            e eVar = new e(this.f5399i);
            Context context = this.f5400j.f5428d;
            if (context == null) {
                h.g("context");
                throw null;
            }
            C0006g c0006gA = K.a(context);
            A a3 = new A(eVar, this.f5401k, null);
            this.f5398h = 1;
            if (c0006gA.f(new N.g(a3, null), this) == aVar) {
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
