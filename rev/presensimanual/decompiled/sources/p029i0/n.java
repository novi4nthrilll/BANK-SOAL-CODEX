package p029i0;

import B.AbstractC0004e;
import B.K;
import B.M;
import B.N;
import B.O;
import B.X;
import B2.h;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p019f0.b;
import p059r2.a;

/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4591b = 0;

    static {
        new ArrayList(new a(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static k a(Activity activity) throws Exception {
        Rect rect;
        int i3;
        O m3;
        X xB;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            rect = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
            h.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i4 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                h.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException e) {
                Log.w("n", e);
                rect = b(activity);
            } catch (NoSuchFieldException e3) {
                Log.w("n", e3);
                rect = b(activity);
            } catch (NoSuchMethodException e4) {
                Log.w("n", e4);
                rect = b(activity);
            } catch (InvocationTargetException e5) {
                Log.w("n", e5);
                rect = b(activity);
            }
        } else if (i4 >= 28) {
            rect = b(activity);
        } else if (i4 >= 24) {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i5 = rect.bottom + dimensionPixelSize;
                if (i5 == point.y) {
                    rect.bottom = i5;
                } else {
                    int i6 = rect.right + dimensionPixelSize;
                    if (i6 == point.x) {
                        rect.right = i6;
                    }
                }
            }
        } else {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            h.d(defaultDisplay2, "defaultDisplay");
            Point point2 = new Point();
            defaultDisplay2.getRealSize(point2);
            Rect rect2 = new Rect();
            int i7 = point2.x;
            if (i7 == 0 || (i3 = point2.y) == 0) {
                defaultDisplay2.getRectSize(rect2);
            } else {
                rect2.right = i7;
                rect2.bottom = i3;
            }
            rect = rect2;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30) {
            if (i8 >= 30) {
                m3 = new N();
            } else {
                m3 = i8 >= 29 ? new M() : new K();
            }
            xB = m3.b();
            h.d(xB, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i8 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            xB = p043m0.a.f5346a.a(activity);
        }
        return new k(new b(rect), xB);
    }

    public static Rect b(Activity activity) {
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutoutM = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                h.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                h.c(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e) {
            Log.w("n", e);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e3) {
            Log.w("n", e3);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e4) {
            Log.w("n", e4);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e5) {
            Log.w("n", e5);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        h.d(defaultDisplay, "currentDisplay");
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i3 = rect.bottom + dimensionPixelSize;
            if (i3 == point.y) {
                rect.bottom = i3;
            } else {
                int i4 = rect.right + dimensionPixelSize;
                if (i4 == point.x) {
                    rect.right = i4;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (AbstractC0004e.B(obj2)) {
                    displayCutoutM = AbstractC0004e.m(obj2);
                }
            } catch (ClassNotFoundException e6) {
                Log.w("n", e6);
            } catch (IllegalAccessException e7) {
                Log.w("n", e7);
            } catch (InstantiationException e8) {
                Log.w("n", e8);
            } catch (NoSuchFieldException e9) {
                Log.w("n", e9);
            } catch (NoSuchMethodException e10) {
                Log.w("n", e10);
            } catch (InvocationTargetException e11) {
                Log.w("n", e11);
            }
            if (displayCutoutM != null) {
                if (rect.left == displayCutoutM.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutM.getSafeInsetRight()) {
                    rect.right = displayCutoutM.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutM.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutM.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutM.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }
}
