package I1;

import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements A.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f387b;

    public /* synthetic */ n(int i3, Object obj) {
        this.f386a = i3;
        this.f387b = obj;
    }

    @Override // A.a
    public final void accept(Object obj) {
        switch (this.f386a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((p) this.f387b).setWindowInfoListenerDisplayFeatures((p029i0.j) obj);
                break;
            default:
                ((K2.o) ((K2.p) this.f387b)).i((p029i0.j) obj);
                break;
        }
    }
}
