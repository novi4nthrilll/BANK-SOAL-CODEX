package K1;

import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f762d;
    public final /* synthetic */ i e;

    public /* synthetic */ h(i iVar, int i3) {
        this.f762d = i3;
        this.e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f762d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.e.b();
                break;
            default:
                this.e.b();
                break;
        }
    }
}
