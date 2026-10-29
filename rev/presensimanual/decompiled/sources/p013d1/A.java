package p013d1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f3561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f3562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f3563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f3564d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f3561a == null) {
            f3561a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f3561a.booleanValue() && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (f3562b == null) {
            f3562b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!f3562b.booleanValue()) {
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        return i3 < 26 || i3 >= 30;
    }
}
