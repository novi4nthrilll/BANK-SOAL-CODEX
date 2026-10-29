package M2;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A0.f f1013a = new A0.f(10, "NULL");

    public static /* synthetic */ L2.d a(j jVar, J2.c cVar, int i3, int i4, int i5) {
        p063s2.i iVar = cVar;
        if ((i5 & 1) != 0) {
            iVar = p063s2.j.f5670d;
        }
        if ((i5 & 2) != 0) {
            i3 = -3;
        }
        if ((i5 & 4) != 0) {
            i4 = 1;
        }
        return jVar.b(iVar, i3, i4);
    }

    public static final Object b(p063s2.i iVar, Object obj, Object obj2, A2.p pVar, p063s2.d dVar) {
        Object objM = N2.a.m(iVar, obj2);
        try {
            s sVar = new s(dVar, iVar);
            B2.s.a(2, pVar);
            Object objH = pVar.h(obj, sVar);
            N2.a.h(iVar, objM);
            if (objH == t2.a.f5737d) {
                B2.h.e(dVar, "frame");
            }
            return objH;
        } catch (Throwable th) {
            N2.a.h(iVar, objM);
            throw th;
        }
    }
}
