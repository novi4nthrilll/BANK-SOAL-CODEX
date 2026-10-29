package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0121c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f2273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f2274b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f2273a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f2274b = cls2 != null;
    }

    public static boolean a() {
        return (f2273a == null || f2274b) ? false : true;
    }
}
