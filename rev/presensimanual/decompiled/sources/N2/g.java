package N2;

/* JADX INFO: loaded from: classes.dex */
public final class g extends RuntimeException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient p063s2.i f1138d;

    public g(p063s2.i iVar) {
        this.f1138d = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f1138d.toString();
    }
}
