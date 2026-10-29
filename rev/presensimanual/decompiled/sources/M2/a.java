package M2;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient L2.e f995d;

    public a(L2.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f995d = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
