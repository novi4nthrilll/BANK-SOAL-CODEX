package p013d1;

import p009c1.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class N4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static s f3619a;

    public static synchronized K4 a(H4 h4) {
        try {
            if (f3619a == null) {
                f3619a = new s(1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (K4) f3619a.c(h4);
    }
}
