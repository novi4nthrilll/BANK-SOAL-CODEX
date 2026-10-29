package O0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class C implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1231a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1232b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f1234d;
    public final B e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f1235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ E f1236g;

    public C(E e, B b3) {
        this.f1236g = e;
        this.e = b3;
    }

    public final void a(String str, Executor executor) {
        this.f1232b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            E e = this.f1236g;
            T0.a aVar = e.f1244d;
            Context context = e.f1242b;
            boolean zB = aVar.b(context, str, this.e.a(context), this, executor);
            this.f1233c = zB;
            if (zB) {
                this.f1236g.f1243c.sendMessageDelayed(this.f1236g.f1243c.obtainMessage(1, this.e), this.f1236g.f1245f);
            } else {
                this.f1232b = 2;
                try {
                    E e3 = this.f1236g;
                    e3.f1244d.a(e3.f1242b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1236g.f1241a) {
            try {
                this.f1236g.f1243c.removeMessages(1, this.e);
                this.f1234d = iBinder;
                this.f1235f = componentName;
                Iterator it = this.f1231a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f1232b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f1236g.f1241a) {
            try {
                this.f1236g.f1243c.removeMessages(1, this.e);
                this.f1234d = null;
                this.f1235f = componentName;
                Iterator it = this.f1231a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f1232b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
