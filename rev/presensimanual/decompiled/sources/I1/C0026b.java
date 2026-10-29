package I1;

import android.window.OnBackInvokedCallback;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: I1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0026b implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f354b;

    public /* synthetic */ C0026b(int i3, Object obj) {
        this.f353a = i3;
        this.f354b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f353a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((AbstractActivityC0028d) this.f354b).onBackPressed();
                break;
            default:
                ((Runnable) this.f354b).run();
                break;
        }
    }
}
