package B;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class P extends W {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f55f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f56g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Class f57h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Field f58i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Field f59j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f60c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p064t.c f61d;
    public p064t.c e;

    public P(X x3, WindowInsets windowInsets) {
        super(x3);
        this.f61d = null;
        this.f60c = windowInsets;
    }

    private p064t.c n(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f55f) {
            o();
        }
        Method method = f56g;
        if (method != null && f57h != null && f58i != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f58i.get(f59j.get(objInvoke));
                if (rect != null) {
                    return p064t.c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void o() {
        try {
            f56g = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f57h = cls;
            f58i = cls.getDeclaredField("mVisibleInsets");
            f59j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f58i.setAccessible(true);
            f59j.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f55f = true;
    }

    @Override // B.W
    public void d(View view) {
        p064t.c cVarN = n(view);
        if (cVarN == null) {
            cVarN = p064t.c.e;
        }
        p(cVarN);
    }

    @Override // B.W
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.e, ((P) obj).e);
        }
        return false;
    }

    @Override // B.W
    public final p064t.c g() {
        if (this.f61d == null) {
            WindowInsets windowInsets = this.f60c;
            this.f61d = p064t.c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f61d;
    }

    @Override // B.W
    public X h(int i3, int i4, int i5, int i6) {
        O m3;
        X xC = X.c(this.f60c, null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            m3 = new N(xC);
        } else {
            m3 = i7 >= 29 ? new M(xC) : new K(xC);
        }
        m3.d(X.a(g(), i3, i4, i5, i6));
        m3.c(X.a(f(), i3, i4, i5, i6));
        return m3.b();
    }

    @Override // B.W
    public boolean j() {
        return this.f60c.isRound();
    }

    public void p(p064t.c cVar) {
        this.e = cVar;
    }

    @Override // B.W
    public void k(p064t.c[] cVarArr) {
    }

    @Override // B.W
    public void l(X x3) {
    }
}
