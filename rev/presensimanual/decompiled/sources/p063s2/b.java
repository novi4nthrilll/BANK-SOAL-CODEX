package p063s2;

import A2.p;
import B2.h;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5667d;

    public /* synthetic */ b(int i3) {
        this.f5667d = i3;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        c cVar;
        switch (this.f5667d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                String str = (String) obj;
                g gVar = (g) obj2;
                h.e(str, "acc");
                h.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                h.e(iVar, "acc");
                h.e(gVar2, "element");
                i iVarN = iVar.n(gVar2.getKey());
                j jVar = j.f5670d;
                if (iVarN == jVar) {
                    return gVar2;
                }
                e eVar = e.f5669d;
                f fVar = (f) iVarN.f(eVar);
                if (fVar == null) {
                    cVar = new c(iVarN, gVar2);
                } else {
                    i iVarN2 = iVarN.n(eVar);
                    if (iVarN2 == jVar) {
                        return new c(gVar2, fVar);
                    }
                    cVar = new c(new c(iVarN2, gVar2), fVar);
                }
                return cVar;
        }
    }
}
