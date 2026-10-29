package p029i0;

import A2.p;
import I1.n;
import M.b;
import android.app.Activity;
import p013d1.AbstractC0449g3;
import p055q2.g;
import p063s2.d;
import t2.a;
import u2.f;

/* JADX INFO: loaded from: classes.dex */
public final class i extends f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f4584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Activity f4585k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, Activity activity, d dVar) {
        super(2, dVar);
        this.f4584j = bVar;
        this.f4585k = activity;
    }

    @Override // u2.b
    public final d b(Object obj, d dVar) {
        i iVar = new i(this.f4584j, this.f4585k, dVar);
        iVar.f4583i = obj;
        return iVar;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((i) b((K2.p) obj, (d) obj2)).j(g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        a aVar = a.f5737d;
        int i3 = this.f4582h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            K2.p pVar = (K2.p) this.f4583i;
            n nVar = new n(1, pVar);
            b bVar = this.f4584j;
            ((j0.a) bVar.e).b(this.f4585k, new W.d(), nVar);
            b bVar2 = new b(1, bVar, nVar);
            this.f4582h = 1;
            if (K2.i.b(pVar, bVar2, this) == aVar) {
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
