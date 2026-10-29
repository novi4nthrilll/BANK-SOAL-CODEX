package O0;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f1237a;

    public /* synthetic */ D(E e) {
        this.f1237a = e;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 0) {
            synchronized (this.f1237a.f1241a) {
                try {
                    B b3 = (B) message.obj;
                    C c3 = (C) this.f1237a.f1241a.get(b3);
                    if (c3 != null && c3.f1231a.isEmpty()) {
                        if (c3.f1233c) {
                            c3.f1236g.f1243c.removeMessages(1, c3.e);
                            E e = c3.f1236g;
                            e.f1244d.a(e.f1242b, c3);
                            c3.f1233c = false;
                            c3.f1232b = 2;
                        }
                        this.f1237a.f1241a.remove(b3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i3 != 1) {
            return false;
        }
        synchronized (this.f1237a.f1241a) {
            try {
                B b4 = (B) message.obj;
                C c4 = (C) this.f1237a.f1241a.get(b4);
                if (c4 != null && c4.f1232b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(b4)), new Exception());
                    ComponentName componentName = c4.f1235f;
                    if (componentName == null) {
                        b4.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = b4.f1229b;
                        u.f(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    c4.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
