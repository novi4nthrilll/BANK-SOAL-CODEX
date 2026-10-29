package p033j1;

import O0.u;
import androidx.lifecycle.y;
import p006b1.c;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f4990a = new k();

    public e() {
    }

    public final void a(Object obj) {
        this.f4990a.h(obj);
    }

    public final boolean b(Exception exc) {
        k kVar = this.f4990a;
        kVar.getClass();
        u.g(exc, "Exception must not be null");
        synchronized (kVar.f4997a) {
            try {
                if (kVar.f4999c) {
                    return false;
                }
                kVar.f4999c = true;
                kVar.f5001f = exc;
                kVar.f4998b.e(kVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public e(c cVar) {
        y yVar = new y(9, this);
        cVar.getClass();
        y yVar2 = new y(8, yVar);
        ((k) cVar.f2515d).b(f.f4991a, yVar2);
    }
}
