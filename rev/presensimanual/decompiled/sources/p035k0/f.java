package p035k0;

import A.a;
import B2.h;
import I1.n;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import p029i0.j;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5272a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f5274c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f5273b = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f5275d = new LinkedHashSet();

    public f(Context context) {
        this.f5272a = context;
    }

    @Override // A.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        h.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f5273b;
        reentrantLock.lock();
        try {
            this.f5274c = e.b(this.f5272a, windowLayoutInfo);
            Iterator it = this.f5275d.iterator();
            while (it.hasNext()) {
                ((a) it.next()).accept(this.f5274c);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(n nVar) {
        ReentrantLock reentrantLock = this.f5273b;
        reentrantLock.lock();
        try {
            j jVar = this.f5274c;
            if (jVar != null) {
                nVar.accept(jVar);
            }
            this.f5275d.add(nVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c() {
        return this.f5275d.isEmpty();
    }

    public final void d(n nVar) {
        ReentrantLock reentrantLock = this.f5273b;
        reentrantLock.lock();
        try {
            this.f5275d.remove(nVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
