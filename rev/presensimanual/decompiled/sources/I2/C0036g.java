package I2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: I2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0036g extends C0043n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f478c = AtomicIntegerFieldUpdater.newUpdater(C0036g.class, "_resumed");
    private volatile int _resumed;

    public C0036g(C0035f c0035f, Throwable th, boolean z2) {
        if (th == null) {
            th = new CancellationException("Continuation " + c0035f + " was cancelled normally");
        }
        super(th, z2);
        this._resumed = 0;
    }
}
