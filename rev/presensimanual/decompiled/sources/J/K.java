package J;

import I2.C0035f;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class K extends B2.i implements A2.l {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f556f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i3, Object obj) {
        super(1);
        this.e = i3;
        this.f556f = obj;
    }

    @Override // A2.l
    public final Object i(Object obj) {
        switch (this.e) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Throwable th = (Throwable) obj;
                P p3 = (P) this.f556f;
                if (th != null) {
                    p3.f577k.s(new Q(th));
                }
                if (p3.f579m.e != p055q2.f.f5602a) {
                    ((L.i) p3.f579m.a()).close();
                }
                return p055q2.g.f5603a;
            case 1:
                p055q2.g gVar = p055q2.g.f5603a;
                ((C0035f) this.f556f).l(gVar);
                return gVar;
            default:
                ((Q2.h) this.f556f).b();
                return p055q2.g.f5603a;
        }
    }
}
