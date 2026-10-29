package N0;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: N0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0082c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ComponentCallbacks2C0082c f1061h = new ComponentCallbacks2C0082c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f1062d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f1063f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1064g = false;

    public final void a(p pVar) {
        synchronized (f1061h) {
            this.f1063f.add(pVar);
        }
    }

    public final void b(boolean z2) {
        synchronized (f1061h) {
            try {
                Iterator it = this.f1063f.iterator();
                while (it.hasNext()) {
                    Z0.f fVar = ((p) it.next()).f1092a.f1080m;
                    fVar.sendMessage(fVar.obtainMessage(1, Boolean.valueOf(z2)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.e;
        boolean zCompareAndSet = this.f1062d.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.e;
        boolean zCompareAndSet = this.f1062d.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        if (i3 == 20 && this.f1062d.compareAndSet(false, true)) {
            this.e.set(true);
            b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
