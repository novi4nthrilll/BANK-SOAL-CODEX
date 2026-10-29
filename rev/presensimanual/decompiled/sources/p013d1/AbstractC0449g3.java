package p013d1;

import B2.h;
import p055q2.c;

/* JADX INFO: renamed from: d1.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0449g3 {
    public static final c a(Throwable th) {
        h.e(th, "exception");
        return new c(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof c) {
            throw ((c) obj).f5599d;
        }
    }
}
