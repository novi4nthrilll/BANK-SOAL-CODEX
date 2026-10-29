package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W f2261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W f2262b;

    static {
        Z z2 = Z.f2263c;
        W w3 = null;
        try {
            w3 = (W) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2261a = w3;
        f2262b = new W();
    }
}
