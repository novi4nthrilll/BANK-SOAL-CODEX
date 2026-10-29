package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0136s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f2341a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f2342b;

    static {
        Z z2 = Z.f2263c;
        r rVar = null;
        try {
            rVar = (r) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f2342b = rVar;
    }
}
