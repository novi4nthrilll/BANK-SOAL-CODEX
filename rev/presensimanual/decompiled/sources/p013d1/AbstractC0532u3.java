package p013d1;

import android.location.Location;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: d1.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0532u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f3899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Integer f3900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Integer f3901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Integer f3902d;

    public static Field a() throws NoSuchFieldException {
        if (f3899a == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            f3899a = declaredField;
            declaredField.setAccessible(true);
        }
        return f3899a;
    }

    public static int b() throws NoSuchFieldException {
        if (f3901c == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f3901c = Integer.valueOf(declaredField.getInt(null));
        }
        return f3901c.intValue();
    }

    public static int c() throws NoSuchFieldException {
        if (f3900b == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f3900b = Integer.valueOf(declaredField.getInt(null));
        }
        return f3900b.intValue();
    }

    public static int d() throws NoSuchFieldException {
        if (f3902d == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f3902d = Integer.valueOf(declaredField.getInt(null));
        }
        return f3902d.intValue();
    }
}
