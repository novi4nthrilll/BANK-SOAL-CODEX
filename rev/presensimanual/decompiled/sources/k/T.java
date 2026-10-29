package k;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f5087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f5088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f5089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f5090d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f5087a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f5088b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f5089c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f5090d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
