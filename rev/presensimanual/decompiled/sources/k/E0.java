package k;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Method f5025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f5026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Method f5027c;

    public E0(Method method, Method method2, Method method3) {
        this.f5025a = method;
        this.f5026b = method2;
        this.f5027c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
