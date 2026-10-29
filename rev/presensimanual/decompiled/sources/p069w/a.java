package p069w;

import android.location.Location;
import p013d1.AbstractC0532u3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static float a(Location location) {
        return location.getBearingAccuracyDegrees();
    }

    public static float b(Location location) {
        return location.getSpeedAccuracyMetersPerSecond();
    }

    public static float c(Location location) {
        return location.getVerticalAccuracyMeters();
    }

    public static boolean d(Location location) {
        return location.hasBearingAccuracy();
    }

    public static boolean e(Location location) {
        return location.hasSpeedAccuracy();
    }

    public static boolean f(Location location) {
        return location.hasVerticalAccuracy();
    }

    public static void g(Location location) {
        try {
            AbstractC0532u3.a().setByte(location, (byte) (AbstractC0532u3.a().getByte(location) & (~AbstractC0532u3.b())));
        } catch (IllegalAccessException e) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        } catch (NoSuchFieldException e3) {
            NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
            noSuchFieldError.initCause(e3);
            throw noSuchFieldError;
        }
    }

    public static void h(Location location) {
        try {
            AbstractC0532u3.a().setByte(location, (byte) (AbstractC0532u3.a().getByte(location) & (~AbstractC0532u3.c())));
        } catch (IllegalAccessException e) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        } catch (NoSuchFieldException e3) {
            NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
            noSuchFieldError.initCause(e3);
            throw noSuchFieldError;
        }
    }

    public static void i(Location location) {
        try {
            AbstractC0532u3.a().setByte(location, (byte) (AbstractC0532u3.a().getByte(location) & (~AbstractC0532u3.d())));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        }
    }

    public static void j(Location location, float f3) {
        location.setBearingAccuracyDegrees(f3);
    }

    public static void k(Location location, float f3) {
        location.setSpeedAccuracyMetersPerSecond(f3);
    }

    public static void l(Location location, float f3) {
        location.setVerticalAccuracyMeters(f3);
    }
}
