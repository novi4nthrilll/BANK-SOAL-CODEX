package I2;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class T extends CancellationException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient b0 f452d;

    public T(String str, Throwable th, b0 b0Var) {
        super(str);
        this.f452d = b0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof T) {
                T t3 = (T) obj;
                if (!B2.h.a(t3.getMessage(), getMessage()) || !B2.h.a(t3.f452d, this.f452d) || !B2.h.a(t3.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        B2.h.b(message);
        int iHashCode = (this.f452d.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f452d;
    }
}
