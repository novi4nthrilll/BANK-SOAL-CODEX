package W1;

/* JADX INFO: renamed from: W1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0097e implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0098f f1736a;

    public C0097e(C0098f c0098f) {
        this.f1736a = c0098f;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.f1736a.f1743h.Q("Failed to process frames after camera was flipped.");
    }
}
