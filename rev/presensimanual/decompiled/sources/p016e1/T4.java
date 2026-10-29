package p016e1;

import p009c1.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class T4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static s f4130a;

    public static synchronized S4 a(O4 o4) {
        try {
            if (f4130a == null) {
                f4130a = new s(2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (S4) f4130a.c(o4);
    }

    public static synchronized S4 b(String str) {
        byte b3 = (byte) (((byte) 1) | 2);
        try {
            if (b3 != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b3 & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b3 & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return a(new O4(str));
    }
}
