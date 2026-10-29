package p069w;

import android.annotation.SuppressLint;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Class f5764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f5765b;

    @SuppressLint({"BanUncheckedReflection"})
    public static boolean a(LocationManager locationManager, String str, h hVar, b bVar, Looper looper) {
        try {
            if (f5764a == null) {
                f5764a = Class.forName("android.location.LocationRequest");
            }
            if (f5765b == null) {
                Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f5764a, LocationListener.class, Looper.class);
                f5765b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            LocationRequest locationRequestA = hVar.a(str);
            if (locationRequestA != null) {
                f5765b.invoke(locationManager, locationRequestA, bVar, looper);
                return true;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
        }
        return false;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static boolean b(LocationManager locationManager, String str, h hVar, e eVar) {
        try {
            if (f5764a == null) {
                f5764a = Class.forName("android.location.LocationRequest");
            }
            if (f5765b == null) {
                Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f5764a, LocationListener.class, Looper.class);
                f5765b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            LocationRequest locationRequestA = hVar.a(str);
            if (locationRequestA != null) {
                synchronized (f.f5766a) {
                    f5765b.invoke(locationManager, locationRequestA, eVar, Looper.getMainLooper());
                    throw null;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
        }
        return false;
    }
}
