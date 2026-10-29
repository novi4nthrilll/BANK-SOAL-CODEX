package O0;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f1238g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static E f1239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static HandlerThread f1240i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1241a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Z0.f f1243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T0.a f1244d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1245f;

    public E(Context context, Looper looper) {
        D d3 = new D(this);
        this.f1242b = context.getApplicationContext();
        Z0.f fVar = new Z0.f(looper, d3);
        Looper.getMainLooper();
        this.f1243c = fVar;
        if (T0.a.f1624b == null) {
            synchronized (T0.a.f1623a) {
                try {
                    if (T0.a.f1624b == null) {
                        T0.a aVar = new T0.a();
                        new ConcurrentHashMap();
                        T0.a.f1624b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        T0.a aVar2 = T0.a.f1624b;
        u.f(aVar2);
        this.f1244d = aVar2;
        this.e = 5000L;
        this.f1245f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (f1238g) {
            try {
                HandlerThread handlerThread = f1240i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f1240i = handlerThread2;
                handlerThread2.start();
                return f1240i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z2) {
        B b3 = new B(str, z2);
        u.g(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f1241a) {
            try {
                C c3 = (C) this.f1241a.get(b3);
                if (c3 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(b3.toString()));
                }
                if (!c3.f1231a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(b3.toString()));
                }
                c3.f1231a.remove(serviceConnection);
                if (c3.f1231a.isEmpty()) {
                    this.f1243c.sendMessageDelayed(this.f1243c.obtainMessage(0, b3), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(B b3, x xVar, String str) {
        boolean z2;
        synchronized (this.f1241a) {
            try {
                C c3 = (C) this.f1241a.get(b3);
                if (c3 == null) {
                    c3 = new C(this, b3);
                    c3.f1231a.put(xVar, xVar);
                    c3.a(str, null);
                    this.f1241a.put(b3, c3);
                } else {
                    this.f1243c.removeMessages(0, b3);
                    if (c3.f1231a.containsKey(xVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(b3.toString()));
                    }
                    c3.f1231a.put(xVar, xVar);
                    int i3 = c3.f1232b;
                    if (i3 == 1) {
                        xVar.onServiceConnected(c3.f1235f, c3.f1234d);
                    } else if (i3 == 2) {
                        c3.a(str, null);
                    }
                }
                z2 = c3.f1233c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }
}
