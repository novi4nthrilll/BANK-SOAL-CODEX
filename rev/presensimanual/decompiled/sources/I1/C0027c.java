package I1;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: renamed from: I1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0027c implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0028d f355a;

    public C0027c(AbstractActivityC0028d abstractActivityC0028d) {
        this.f355a = abstractActivityC0028d;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        AbstractActivityC0028d abstractActivityC0028d = this.f355a;
        if (abstractActivityC0028d.l("cancelBackGesture")) {
            g gVar = abstractActivityC0028d.e;
            gVar.c();
            J1.c cVar = gVar.f364b;
            if (cVar != null) {
                ((E0.n) cVar.f703j.e).b("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        AbstractActivityC0028d abstractActivityC0028d = this.f355a;
        if (abstractActivityC0028d.l("commitBackGesture")) {
            g gVar = abstractActivityC0028d.e;
            gVar.c();
            J1.c cVar = gVar.f364b;
            if (cVar != null) {
                ((E0.n) cVar.f703j.e).b("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0028d abstractActivityC0028d = this.f355a;
        if (abstractActivityC0028d.l("updateBackGestureProgress")) {
            g gVar = abstractActivityC0028d.e;
            gVar.c();
            J1.c cVar = gVar.f364b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            A0.f fVar = cVar.f703j;
            fVar.getClass();
            ((E0.n) fVar.e).b("updateBackGestureProgress", A0.f.p(backEvent), null);
        }
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0028d abstractActivityC0028d = this.f355a;
        if (abstractActivityC0028d.l("startBackGesture")) {
            g gVar = abstractActivityC0028d.e;
            gVar.c();
            J1.c cVar = gVar.f364b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            A0.f fVar = cVar.f703j;
            fVar.getClass();
            ((E0.n) fVar.e).b("startBackGesture", A0.f.p(backEvent), null);
        }
    }
}
