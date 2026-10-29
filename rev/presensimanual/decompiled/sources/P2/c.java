package P2;

import I2.AbstractC0048t;
import I2.K;
import N2.w;
import java.util.concurrent.Executor;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class c extends K implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f1341f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC0048t f1342g;

    static {
        AbstractC0048t iVar;
        k kVar = k.f1355f;
        int i3 = w.f1167a;
        if (64 >= i3) {
            i3 = 64;
        }
        int iK = N2.a.k("kotlinx.coroutines.io.parallelism", i3, 0, 0, 12);
        kVar.getClass();
        if (iK < 1) {
            throw new IllegalArgumentException(I.f("Expected positive parallelism level, but got ", iK).toString());
        }
        if (iK < j.f1351d) {
            if (iK < 1) {
                throw new IllegalArgumentException(I.f("Expected positive parallelism level, but got ", iK).toString());
            }
            iVar = new N2.i(kVar, iK);
        }
        iVar = kVar;
        f1342g = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // I2.AbstractC0048t
    public final void d(p063s2.i iVar, Runnable runnable) {
        f1342g.d(iVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(p063s2.j.f5670d, runnable);
    }

    @Override // I2.AbstractC0048t
    public final String toString() {
        return "Dispatchers.IO";
    }
}
