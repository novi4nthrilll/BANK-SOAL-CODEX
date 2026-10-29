package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class C extends Fragment {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f2368d;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final B Companion = new B();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            B2.h.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            B2.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            B2.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            B2.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            B2.h.e(activity, "activity");
            int i3 = C.e;
            A.a(activity, j.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            B2.h.e(activity, "activity");
            int i3 = C.e;
            A.a(activity, j.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            B2.h.e(activity, "activity");
            int i3 = C.e;
            A.a(activity, j.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            B2.h.e(activity, "activity");
            int i3 = C.e;
            A.a(activity, j.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            B2.h.e(activity, "activity");
            int i3 = C.e;
            A.a(activity, j.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            B2.h.e(activity, "activity");
            int i3 = C.e;
            A.a(activity, j.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            B2.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            B2.h.e(activity, "activity");
            B2.h.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            B2.h.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            B2.h.e(activity, "activity");
        }
    }

    public final void a(j jVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            B2.h.d(activity, "activity");
            A.a(activity, jVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(j.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(j.ON_DESTROY);
        this.f2368d = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(j.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        y yVar = this.f2368d;
        if (yVar != null) {
            ((z) yVar.e).c();
        }
        a(j.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        y yVar = this.f2368d;
        if (yVar != null) {
            z zVar = (z) yVar.e;
            int i3 = zVar.f2409d + 1;
            zVar.f2409d = i3;
            if (i3 == 1 && zVar.f2411g) {
                zVar.f2413i.e(j.ON_START);
                zVar.f2411g = false;
            }
        }
        a(j.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(j.ON_STOP);
    }
}
