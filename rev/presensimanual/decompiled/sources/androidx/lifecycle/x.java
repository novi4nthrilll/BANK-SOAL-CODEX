package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AbstractC0149f {
    final /* synthetic */ z this$0;

    public static final class a extends AbstractC0149f {
        final /* synthetic */ z this$0;

        public a(z zVar) {
            this.this$0 = zVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            B2.h.e(activity, "activity");
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            B2.h.e(activity, "activity");
            z zVar = this.this$0;
            int i3 = zVar.f2409d + 1;
            zVar.f2409d = i3;
            if (i3 == 1 && zVar.f2411g) {
                zVar.f2413i.e(j.ON_START);
                zVar.f2411g = false;
            }
        }
    }

    public x(z zVar) {
        this.this$0 = zVar;
    }

    @Override // androidx.lifecycle.AbstractC0149f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        B2.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = C.e;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            B2.h.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((C) fragmentFindFragmentByTag).f2368d = this.this$0.f2415k;
        }
    }

    @Override // androidx.lifecycle.AbstractC0149f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        B2.h.e(activity, "activity");
        z zVar = this.this$0;
        int i3 = zVar.e - 1;
        zVar.e = i3;
        if (i3 == 0) {
            Handler handler = zVar.f2412h;
            B2.h.b(handler);
            handler.postDelayed(zVar.f2414j, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        B2.h.e(activity, "activity");
        w.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0149f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        B2.h.e(activity, "activity");
        z zVar = this.this$0;
        int i3 = zVar.f2409d - 1;
        zVar.f2409d = i3;
        if (i3 == 0 && zVar.f2410f) {
            zVar.f2413i.e(j.ON_STOP);
            zVar.f2411g = true;
        }
    }
}
