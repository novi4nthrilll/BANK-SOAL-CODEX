package X0;

import O0.u;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Z0.b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1808c;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 1);
        this.f1808c = obj;
    }

    public static a n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    public static Object o(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f1808c;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i3 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i3++;
                field = field2;
            }
        }
        if (i3 != 1) {
            throw new IllegalArgumentException(I.f("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        u.f(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e3) {
            throw new IllegalArgumentException("Binder object is null.", e3);
        }
    }
}
