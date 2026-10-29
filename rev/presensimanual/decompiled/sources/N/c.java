package N;

import A2.p;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends u2.f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.f f1030j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, p063s2.d dVar) {
        super(2, dVar);
        this.f1030j = (u2.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [A2.p, u2.f] */
    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        c cVar = new c(this.f1030j, dVar);
        cVar.f1029i = obj;
        return cVar;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((c) b((b) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [A2.p, u2.f] */
    @Override // u2.b
    public final Object j(Object obj) {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f1028h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            b bVar = (b) this.f1029i;
            this.f1028h = 1;
            obj = this.f1030j.h(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0449g3.b(obj);
        }
        b bVar2 = (b) obj;
        B2.h.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        bVar2.f1027b.f821a.set(true);
        return bVar2;
    }
}
