package L;

import R2.l;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class e extends B2.i implements A2.a {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i3) {
        super(0);
        this.e = i3;
        this.f830f = fVar;
    }

    @Override // A2.a
    public final Object a() {
        switch (this.e) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                f fVar = this.f830f;
                l lVar = (l) fVar.f834c.a();
                if (S2.b.a(lVar) != -1) {
                    return p065t0.e.e(lVar.f1532d.n(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + fVar.f834c + ", instead got " + lVar).toString());
            default:
                L0.g gVar = f.f831f;
                f fVar2 = this.f830f;
                synchronized (gVar) {
                    f.e.remove(((l) fVar2.f835d.a()).f1532d.n());
                }
                return p055q2.g.f5603a;
        }
    }
}
