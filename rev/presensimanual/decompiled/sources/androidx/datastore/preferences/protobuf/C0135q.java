package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0135q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0135q f2338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0135q f2339b;

    static {
        C0135q c0135q = new C0135q();
        Collections.emptyMap();
        f2339b = c0135q;
    }

    public static C0135q a() {
        Z z2 = Z.f2263c;
        C0135q c0135q = f2338a;
        if (c0135q == null) {
            synchronized (C0135q.class) {
                try {
                    c0135q = f2338a;
                    if (c0135q == null) {
                        Class cls = AbstractC0134p.f2331a;
                        C0135q c0135q2 = null;
                        if (cls != null) {
                            try {
                                c0135q2 = (C0135q) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0135q2 == null) {
                            c0135q2 = f2339b;
                        }
                        f2338a = c0135q2;
                        c0135q = c0135q2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c0135q;
    }
}
