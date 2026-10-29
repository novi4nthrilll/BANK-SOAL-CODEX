package io.flutter.embedding.engine.renderer;

import android.os.Handler;
import android.view.Surface;
import androidx.lifecycle.z;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f4647a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f4649c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f4653h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f4648b = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4650d = false;
    public final Handler e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f4651f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f4652g = new ArrayList();

    public l(FlutterJNI flutterJNI) {
        a aVar = new a(this);
        this.f4653h = aVar;
        this.f4647a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        z.f2408l.f2413i.b(new b(this));
    }

    public final void a(int i3) {
        Iterator it = this.f4651f.iterator();
        while (it.hasNext()) {
            q qVar = (q) ((WeakReference) it.next()).get();
            if (qVar != null) {
                qVar.onTrimMemory(i3);
            } else {
                it.remove();
            }
        }
    }

    public final void b(q qVar) {
        HashSet<WeakReference> hashSet = this.f4651f;
        for (WeakReference weakReference : hashSet) {
            if (weakReference.get() == qVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void c() {
        if (this.f4649c != null) {
            this.f4647a.onSurfaceDestroyed();
            if (this.f4650d) {
                this.f4653h.a();
            }
            this.f4650d = false;
            this.f4649c = null;
        }
    }
}
