package p046n2;

import L2.d;
import N.e;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p055q2.g;
import t2.a;

/* JADX INFO: loaded from: classes.dex */
public final class o implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5464d;
    public final /* synthetic */ d e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f5465f;

    public /* synthetic */ o(d dVar, e eVar, int i3) {
        this.f5464d = i3;
        this.e = dVar;
        this.f5465f = eVar;
    }

    @Override // L2.d
    public final Object q(L2.e eVar, p063s2.d dVar) {
        switch (this.f5464d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Object objQ = this.e.q(new C0782n(eVar, this.f5465f, 0), dVar);
                return objQ == a.f5737d ? objQ : g.f5603a;
            case 1:
                Object objQ2 = this.e.q(new C0782n(eVar, this.f5465f, 1), dVar);
                return objQ2 == a.f5737d ? objQ2 : g.f5603a;
            case 2:
                Object objQ3 = this.e.q(new C0782n(eVar, this.f5465f, 2), dVar);
                return objQ3 == a.f5737d ? objQ3 : g.f5603a;
            default:
                Object objQ4 = this.e.q(new C0782n(eVar, this.f5465f, 3), dVar);
                return objQ4 == a.f5737d ? objQ4 : g.f5603a;
        }
    }
}
