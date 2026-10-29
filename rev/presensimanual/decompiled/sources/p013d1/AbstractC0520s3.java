package p013d1;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import u.a;
import u.b;
import u.g;
import u.i;

/* JADX INFO: renamed from: d1.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0520s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f3889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f3891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f3892d;

    public static int a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(drawable);
        }
        if (!f3892d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f3891c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            f3892d = true;
        }
        Method method = f3891c;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception e3) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
            f3891c = null;
            return 0;
        }
    }

    public static boolean b(Drawable drawable, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.b(drawable, i3);
        }
        if (!f3890b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f3889a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f3890b = true;
        }
        Method method = f3889a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i3));
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                f3889a = null;
            }
        }
        return false;
    }

    public static void c(Drawable drawable, int i3) {
        a.g(drawable, i3);
    }

    public static Drawable d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof g)) {
            return drawable;
        }
        i iVar = new i();
        iVar.f5742g = iVar.c();
        iVar.h(drawable);
        i.a();
        return iVar;
    }
}
