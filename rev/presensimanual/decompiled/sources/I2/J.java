package I2;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class J extends AbstractC0048t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f441i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p059r2.b f444h;

    public final void i(boolean z2) {
        long j3 = this.f442f - (z2 ? 4294967296L : 1L);
        this.f442f = j3;
        if (j3 <= 0 && this.f443g) {
            shutdown();
        }
    }

    public abstract Thread j();

    public final void k(boolean z2) {
        this.f442f = (z2 ? 4294967296L : 1L) + this.f442f;
        if (z2) {
            return;
        }
        this.f443g = true;
    }

    public abstract long l();

    public final boolean m() throws IllegalAccessException, InvocationTargetException {
        p059r2.b bVar = this.f444h;
        if (bVar == null) {
            return false;
        }
        C c3 = (C) (bVar.isEmpty() ? null : bVar.removeFirst());
        if (c3 == null) {
            return false;
        }
        c3.run();
        return true;
    }

    public abstract void shutdown();
}
