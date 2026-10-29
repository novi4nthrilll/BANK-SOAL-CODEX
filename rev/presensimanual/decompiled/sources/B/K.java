package B;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class K extends O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f49c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f50d = false;
    public static Constructor e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f51f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WindowInsets f52a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p064t.c f53b;

    public K() {
        this.f52a = e();
    }

    private static WindowInsets e() {
        if (!f50d) {
            try {
                f49c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
            }
            f50d = true;
        }
        Field field = f49c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
            }
        }
        if (!f51f) {
            try {
                e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
            }
            f51f = true;
        }
        Constructor constructor = e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
            }
        }
        return null;
    }

    @Override // B.O
    public X b() {
        a();
        X xC = X.c(this.f52a, null);
        W w3 = xC.f67a;
        w3.k(null);
        w3.m(this.f53b);
        return xC;
    }

    @Override // B.O
    public void c(p064t.c cVar) {
        this.f53b = cVar;
    }

    @Override // B.O
    public void d(p064t.c cVar) {
        WindowInsets windowInsets = this.f52a;
        if (windowInsets != null) {
            this.f52a = windowInsets.replaceSystemWindowInsets(cVar.f5672a, cVar.f5673b, cVar.f5674c, cVar.f5675d);
        }
    }

    public K(X x3) {
        super(x3);
        this.f52a = x3.b();
    }
}
