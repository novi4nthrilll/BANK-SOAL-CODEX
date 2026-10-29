package J;

import java.util.LinkedHashSet;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: J.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0067m extends B2.i implements A2.a {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P f654f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0067m(P p3, int i3) {
        super(0);
        this.e = i3;
        this.f654f = p3;
    }

    @Override // A2.a
    public final Object a() {
        switch (this.e) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return ((L.i) this.f654f.f579m.a()).f851c;
            default:
                L.f fVar = this.f654f.f571d;
                String strN = ((R2.l) fVar.f835d.a()).f1532d.n();
                synchronized (L.f.f831f) {
                    LinkedHashSet linkedHashSet = L.f.e;
                    if (linkedHashSet.contains(strN)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + strN + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(strN);
                }
                return new L.i(fVar.f832a, (R2.l) fVar.f835d.a(), (Z) fVar.f833b.h((R2.l) fVar.f835d.a(), fVar.f832a), new L.e(fVar, 1));
        }
    }
}
