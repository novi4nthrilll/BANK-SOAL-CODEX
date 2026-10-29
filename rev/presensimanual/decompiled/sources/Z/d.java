package Z;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1942d;

    public Bundle a(String str) {
        if (!this.f1940b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f1942d;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f1942d;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f1942d;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f1942d = null;
        }
        return bundle2;
    }
}
