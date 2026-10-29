package p013d1;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: d1.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0549x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f3914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f3915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f3916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f3917d;

    public static void a(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static String b(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
