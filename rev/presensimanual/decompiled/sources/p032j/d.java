package p032j;

import android.view.View;
import android.view.ViewTreeObserver;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4882d;
    public final /* synthetic */ k e;

    public /* synthetic */ d(k kVar, int i3) {
        this.f4882d = i3;
        this.e = kVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i3 = this.f4882d;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4882d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                f fVar = (f) this.e;
                ViewTreeObserver viewTreeObserver = fVar.f4886A;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.f4886A = view.getViewTreeObserver();
                    }
                    fVar.f4886A.removeGlobalOnLayoutListener(fVar.f4895l);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                s sVar = (s) this.e;
                ViewTreeObserver viewTreeObserver2 = sVar.f4984r;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f4984r = view.getViewTreeObserver();
                    }
                    sVar.f4984r.removeGlobalOnLayoutListener(sVar.f4978l);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
