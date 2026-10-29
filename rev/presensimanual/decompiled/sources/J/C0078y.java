package J;

import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: J.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0078y implements L2.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f689d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C0078y(int i3, Object obj) {
        this.f689d = i3;
        this.e = obj;
    }

    @Override // L2.e
    public final Object c(Object obj, p063s2.d dVar) {
        Object objD;
        switch (this.f689d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                P p3 = (P) this.e;
                boolean z2 = p3.f577k.h() instanceof Q;
                p055q2.g gVar = p055q2.g.f5603a;
                return (z2 || (objD = P.d(p3, true, dVar)) != t2.a.f5737d) ? gVar : objD;
            case 1:
                ((B2.p) this.e).f128d = obj;
                throw new M2.a(this);
            default:
                ((I1.n) this.e).accept(obj);
                return p055q2.g.f5603a;
        }
    }
}
