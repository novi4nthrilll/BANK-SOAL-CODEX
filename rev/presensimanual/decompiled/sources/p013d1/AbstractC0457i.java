package p013d1;

import G.k;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k.C0753s;

/* JADX INFO: renamed from: d1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0457i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f3823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f3825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f3826d;

    public static void a(C0753s c0753s, boolean z2) {
        if (Build.VERSION.SDK_INT >= 23) {
            k.c(c0753s, z2);
            return;
        }
        if (!f3826d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f3825c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
            f3826d = true;
        }
        Field field = f3825c;
        if (field != null) {
            try {
                field.set(c0753s, Boolean.valueOf(z2));
            } catch (IllegalAccessException e3) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
            }
        }
    }
}
