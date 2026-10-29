package O0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f1227d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1230c;

    public B(String str, boolean z2) {
        u.d(str);
        this.f1228a = str;
        u.d("com.google.android.gms");
        this.f1229b = "com.google.android.gms";
        this.f1230c = z2;
    }

    public final Intent a(Context context) {
        Bundle bundleCall;
        Intent intent = null;
        String str = this.f1228a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f1230c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(f1227d, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f1229b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b3 = (B) obj;
        return u.i(this.f1228a, b3.f1228a) && u.i(this.f1229b, b3.f1229b) && u.i(null, null) && this.f1230c == b3.f1230c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1228a, this.f1229b, null, 4225, Boolean.valueOf(this.f1230c)});
    }

    public final String toString() {
        String str = this.f1228a;
        if (str != null) {
            return str;
        }
        u.f(null);
        throw null;
    }
}
