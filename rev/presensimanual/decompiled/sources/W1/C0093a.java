package W1;

import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: W1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0093a implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1729d;
    public final /* synthetic */ C0098f e;

    public /* synthetic */ C0093a(C0098f c0098f, int i3) {
        this.f1729d = i3;
        this.e = c0098f;
    }

    @Override // W1.q
    public final void onError(String str) {
        switch (this.f1729d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.e.f1743h.Q(str);
                break;
            case 1:
                C0098f c0098f = this.e;
                c0098f.f1743h.z(c0098f.f1760z, "cameraAccess", str);
                break;
            default:
                C0098f c0098f2 = this.e;
                c0098f2.f1743h.z(c0098f2.f1760z, "cameraAccess", str);
                break;
        }
    }
}
