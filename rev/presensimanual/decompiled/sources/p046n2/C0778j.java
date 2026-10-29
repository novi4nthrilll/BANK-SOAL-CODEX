package p046n2;

import A2.p;
import B.C0006g;
import B2.h;
import I2.InterfaceC0050v;
import android.content.Context;
import java.util.List;
import p013d1.AbstractC0449g3;
import p055q2.g;
import p063s2.d;
import t2.a;
import u2.f;

/* JADX INFO: renamed from: n2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0778j extends f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f5451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f5452j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0778j(J j3, List list, d dVar) {
        super(2, dVar);
        this.f5451i = j3;
        this.f5452j = list;
    }

    @Override // u2.b
    public final d b(Object obj, d dVar) {
        return new C0778j(this.f5451i, this.f5452j, dVar);
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((C0778j) b((InterfaceC0050v) obj, (d) obj2)).j(g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        a aVar = a.f5737d;
        int i3 = this.f5450h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            Context context = this.f5451i.f5428d;
            if (context == null) {
                h.g("context");
                throw null;
            }
            C0006g c0006gA = K.a(context);
            C0777i c0777i = new C0777i(this.f5452j, null);
            this.f5450h = 1;
            obj = c0006gA.f(new N.g(c0777i, null), this);
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
