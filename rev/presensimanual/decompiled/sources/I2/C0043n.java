package I2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: I2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0043n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f489b = AtomicIntegerFieldUpdater.newUpdater(C0043n.class, "_handled");
    private volatile int _handled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f490a;

    public C0043n(Throwable th, boolean z2) {
        this.f490a = th;
        this._handled = z2 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f490a + ']';
    }
}
