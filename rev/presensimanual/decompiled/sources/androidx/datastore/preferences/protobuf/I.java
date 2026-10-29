package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f2231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H f2232b;

    static {
        Z z2 = Z.f2263c;
        H h3 = null;
        try {
            h3 = (H) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2231a = h3;
        f2232b = new H();
    }
}
