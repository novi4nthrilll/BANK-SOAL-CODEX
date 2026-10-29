package L2;

import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends M2.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p029i0.i f895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p029i0.i f896h;

    public c(p029i0.i iVar, p063s2.i iVar2, int i3, int i4) {
        super(iVar2, i3, i4);
        this.f895g = iVar;
        this.f896h = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // M2.f
    public final Object a(K2.p pVar, p063s2.d dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i3 = bVar.f894j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f894j = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (u2.b) dVar);
            }
        } else {
            bVar = new b(this, (u2.b) dVar);
        }
        Object obj = bVar.f892h;
        t2.a aVar = t2.a.f5737d;
        int i4 = bVar.f894j;
        p055q2.g gVar = p055q2.g.f5603a;
        if (i4 == 0) {
            AbstractC0449g3.b(obj);
            bVar.f891g = pVar;
            bVar.f894j = 1;
            Object objH = this.f895g.h(pVar, bVar);
            if (objH != aVar) {
                objH = gVar;
            }
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = bVar.f891g;
            AbstractC0449g3.b(obj);
        }
        if (((K2.o) pVar).f819g.s()) {
            return gVar;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // M2.f
    public final M2.f c(p063s2.i iVar, int i3, int i4) {
        return new c(this.f896h, iVar, i3, i4);
    }

    @Override // M2.f
    public final String toString() {
        return "block[" + this.f895g + "] -> " + super.toString();
    }
}
