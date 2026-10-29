package p047o;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5513c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellationException f5514a;

    static {
        if (g.f5524d) {
            f5513c = null;
            f5512b = null;
        } else {
            f5513c = new a(false, null);
            f5512b = new a(true, null);
        }
    }

    public a(boolean z2, CancellationException cancellationException) {
        this.f5514a = cancellationException;
    }
}
