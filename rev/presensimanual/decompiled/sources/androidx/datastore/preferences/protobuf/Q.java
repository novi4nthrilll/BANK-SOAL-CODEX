package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f2241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P f2242b;

    static {
        Z z2 = Z.f2263c;
        P p3 = null;
        try {
            p3 = (P) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2241a = p3;
        f2242b = new P();
    }
}
