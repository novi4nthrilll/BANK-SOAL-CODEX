package p013d1;

import android.util.Log;
import java.util.List;
import p059r2.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class W2 {
    public static final List a(Throwable th) {
        return e.b(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }
}
