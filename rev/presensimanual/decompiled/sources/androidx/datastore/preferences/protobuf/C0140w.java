package androidx.datastore.preferences.protobuf;

import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0140w implements S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0140w f2351b = new C0140w(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2352a;

    public /* synthetic */ C0140w(int i3) {
        this.f2352a = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final boolean a(Class cls) {
        switch (this.f2352a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return AbstractC0143z.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final b0 b(Class cls) {
        switch (this.f2352a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (!AbstractC0143z.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (b0) AbstractC0143z.f(cls.asSubclass(AbstractC0143z.class)).e(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
