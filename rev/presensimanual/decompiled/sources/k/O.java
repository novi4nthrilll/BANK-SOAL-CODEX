package k;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f5073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f5074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f5075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f5076d;
    public static final Field e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Field f5077f;

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z2;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z2 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z2 = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                        f5074b = method;
                        f5075c = field;
                        f5076d = field2;
                        e = field3;
                        f5077f = field4;
                        f5073a = true;
                        return;
                    }
                    f5074b = null;
                    f5075c = null;
                    f5076d = null;
                    e = null;
                    f5077f = null;
                    f5073a = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                        f5074b = method;
                        f5075c = field;
                        f5076d = field2;
                        e = field3;
                        f5077f = field4;
                        f5073a = true;
                        return;
                    }
                    f5074b = null;
                    f5075c = null;
                    f5076d = null;
                    e = null;
                    f5077f = null;
                    f5073a = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                        f5074b = method;
                        f5075c = field;
                        f5076d = field2;
                        e = field3;
                        f5077f = field4;
                        f5073a = true;
                        return;
                    }
                    f5074b = null;
                    f5075c = null;
                    f5076d = null;
                    e = null;
                    f5077f = null;
                    f5073a = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                    f5074b = method;
                    f5075c = field;
                    f5076d = field2;
                    e = field3;
                    f5077f = field4;
                    f5073a = true;
                    return;
                }
                f5074b = null;
                f5075c = null;
                f5076d = null;
                e = null;
                f5077f = null;
                f5073a = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                    f5074b = method;
                    f5075c = field;
                    f5076d = field2;
                    e = field3;
                    f5077f = field4;
                    f5073a = true;
                    return;
                }
                f5074b = null;
                f5075c = null;
                f5076d = null;
                e = null;
                f5077f = null;
                f5073a = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                    f5074b = method;
                    f5075c = field;
                    f5076d = field2;
                    e = field3;
                    f5077f = field4;
                    f5073a = true;
                    return;
                }
                f5074b = null;
                f5075c = null;
                f5076d = null;
                e = null;
                f5077f = null;
                f5073a = false;
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z2) {
            f5074b = method;
            f5075c = field;
            f5076d = field2;
            e = field3;
            f5077f = field4;
            f5073a = true;
            return;
        }
        f5074b = null;
        f5075c = null;
        f5076d = null;
        e = null;
        f5077f = null;
        f5073a = false;
    }
}
