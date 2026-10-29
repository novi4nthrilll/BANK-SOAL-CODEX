package p071w1;

import O0.C0092f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0092f f5780a = new C0092f("CommonUtils");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e.toString());
            C0092f c0092f = f5780a;
            if (Log.isLoggable(c0092f.f1269a, 6)) {
                String str = c0092f.f1270b;
                if (str != null) {
                    strConcat = str.concat(strConcat);
                }
                Log.e("CommonUtils", strConcat);
            }
            return "";
        }
    }
}
