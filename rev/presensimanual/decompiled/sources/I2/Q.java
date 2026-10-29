package I2;

import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends W {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f451i;

    public /* synthetic */ Q(int i3, Object obj) {
        this.f450h = i3;
        this.f451i = obj;
    }

    @Override // A2.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        switch (this.f450h) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                o((Throwable) obj);
                break;
            default:
                o((Throwable) obj);
                break;
        }
        return p055q2.g.f5603a;
    }

    @Override // I2.W
    public final void o(Throwable th) {
        switch (this.f450h) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((A2.l) this.f451i).i(th);
                break;
            default:
                Object objE = n().E();
                boolean z2 = objE instanceof C0043n;
                X x3 = (X) this.f451i;
                if (!z2) {
                    x3.l(AbstractC0052x.l(objE));
                } else {
                    x3.l(AbstractC0449g3.a(((C0043n) objE).f490a));
                }
                break;
        }
    }
}
