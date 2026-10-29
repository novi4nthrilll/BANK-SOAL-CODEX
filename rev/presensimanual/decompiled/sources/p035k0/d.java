package p035k0;

import I1.n;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import j0.a;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p055q2.g;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f5268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f5269b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5270c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5271d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f5268a = windowLayoutComponent;
    }

    @Override // j0.a
    public final void a(n nVar) {
        ReentrantLock reentrantLock = this.f5269b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f5271d;
        try {
            Context context = (Context) linkedHashMap.get(nVar);
            if (context == null) {
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f5270c;
            f fVar = (f) linkedHashMap2.get(context);
            if (fVar == null) {
                return;
            }
            fVar.d(nVar);
            linkedHashMap.remove(nVar);
            if (fVar.c()) {
                linkedHashMap2.remove(context);
                this.f5268a.removeWindowLayoutInfoListener(fVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // j0.a
    public final void b(Context context, W.d dVar, n nVar) {
        g gVar;
        ReentrantLock reentrantLock = this.f5269b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f5270c;
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f5271d;
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
                this.f5268a.addWindowLayoutInfoListener(context, fVar2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
