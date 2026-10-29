package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: k.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0722c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5154d;
    public final /* synthetic */ ActionBarOverlayLayout e;

    public /* synthetic */ RunnableC0722c(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f5154d = i3;
        this.e = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5154d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = this.e;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f2026w = actionBarOverlayLayout.f2010f.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f2027x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.e;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f2026w = actionBarOverlayLayout2.f2010f.animate().translationY(-actionBarOverlayLayout2.f2010f.getHeight()).setListener(actionBarOverlayLayout2.f2027x);
                break;
        }
    }
}
