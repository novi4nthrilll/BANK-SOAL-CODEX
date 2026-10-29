package p013d1;

import B2.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w2.a;

/* JADX INFO: renamed from: d1.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0443f3 {
    public static void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        h.e(th, "<this>");
        h.e(th2, "exception");
        if (th != th2) {
            Integer num = a.f5813a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = v2.a.f5763a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }
}
