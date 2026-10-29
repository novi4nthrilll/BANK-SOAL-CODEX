package O0;

import android.util.Log;

/* JADX INFO: renamed from: O0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0092f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1270b;

    public C0092f(String str) {
        u.b(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f1269a = str;
        this.f1270b = null;
    }

    public void a(String str, String str2, Exception exc) {
        if (Log.isLoggable(this.f1269a, 6)) {
            String str3 = this.f1270b;
            if (str3 != null) {
                str2 = str3.concat(str2);
            }
            Log.e(str, str2, exc);
        }
    }

    public C0092f(String str, String str2) {
        this.f1269a = str;
        this.f1270b = str2;
    }
}
