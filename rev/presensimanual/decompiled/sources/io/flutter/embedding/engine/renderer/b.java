package io.flutter.embedding.engine.renderer;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.q;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f4612d;

    public b(l lVar) {
        this.f4612d = lVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void a() {
        Iterator it = this.f4612d.f4652g.iterator();
        while (it.hasNext()) {
            FlutterRenderer$ImageReaderSurfaceProducer.access$200((FlutterRenderer$ImageReaderSurfaceProducer) it.next());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void b(q qVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void c(q qVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void g(q qVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void h(q qVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void i(q qVar) {
    }
}
