package p047o;

import p013d1.X2;

/* JADX INFO: loaded from: classes.dex */
public final class e extends X2 {
    @Override // p013d1.X2
    public final boolean a(g gVar, c cVar) {
        c cVar2 = c.f5515b;
        synchronized (gVar) {
            try {
                if (gVar.f5528b != cVar) {
                    return false;
                }
                gVar.f5528b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p013d1.X2
    public final boolean b(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f5527a != obj) {
                    return false;
                }
                gVar.f5527a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p013d1.X2
    public final boolean c(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f5529c != fVar) {
                    return false;
                }
                gVar.f5529c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p013d1.X2
    public final void d(f fVar, f fVar2) {
        fVar.f5523b = fVar2;
    }

    @Override // p013d1.X2
    public final void e(f fVar, Thread thread) {
        fVar.f5522a = thread;
    }
}
