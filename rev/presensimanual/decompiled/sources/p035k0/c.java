package p035k0;

import B2.q;
import I1.n;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import j0.a;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p019f0.d;
import p055q2.g;
import p059r2.l;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f5263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p015e0.a f5264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f5265c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5266d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f5267f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, p015e0.a aVar) {
        this.f5263a = windowLayoutComponent;
        this.f5264b = aVar;
    }

    @Override // j0.a
    public final void a(n nVar) {
        ReentrantLock reentrantLock = this.f5265c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.e;
        try {
            Context context = (Context) linkedHashMap.get(nVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f5266d;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(nVar);
            linkedHashMap.remove(nVar);
            if (fVar.f5275d.isEmpty()) {
                linkedHashMap2.remove(context);
                d dVar = (d) this.f5267f.remove(fVar);
                if (dVar != null) {
                    dVar.f4456a.invoke(dVar.f4457b, dVar.f4458c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // j0.a
    public final void b(Context context, W.d dVar, n nVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f5265c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f5266d;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
            if (fVar != null) {
                fVar.b(nVar);
                linkedHashMap2.put(nVar, context);
                gVar = g.f5603a;
            } else {
                gVar = null;
            }
            if (gVar == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(nVar, context);
                fVar2.b(nVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(l.f5624d));
                } else {
                    this.f5267f.put(fVar2, this.f5264b.a(this.f5263a, q.a(WindowLayoutInfo.class), (Activity) context, new b(fVar2)));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
