package p064t;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p013d1.AbstractC0503p3;
import p060s.f;
import p060s.g;
import p075y.h;

/* JADX INFO: loaded from: classes.dex */
public class j extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f5689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Constructor f5690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Method f5691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f5692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f5693j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f5694k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f5695l;

    public j() throws NoSuchMethodException {
        Method methodO;
        Constructor<?> constructor;
        Method methodN;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodN = n(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodO = o(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodO = null;
            constructor = null;
            methodN = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f5689f = cls;
        this.f5690g = constructor;
        this.f5691h = methodN;
        this.f5692i = method;
        this.f5693j = method2;
        this.f5694k = method3;
        this.f5695l = methodO;
    }

    public static Method n(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // p064t.h, p013d1.AbstractC0497o3
    public final Typeface a(Context context, f fVar, Resources resources, int i3) {
        if (!l()) {
            return super.a(context, fVar, resources, i3);
        }
        Object objM = m();
        if (objM == null) {
            return null;
        }
        for (g gVar : fVar.f5637a) {
            if (!i(context, objM, gVar.f5638a, gVar.e, gVar.f5639b, gVar.f5640c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f5641d))) {
                h(objM);
                return null;
            }
        }
        if (k(objM)) {
            return j(objM);
        }
        return null;
    }

    @Override // p064t.h, p013d1.AbstractC0497o3
    public final Typeface b(Context context, h[] hVarArr, int i3) {
        Typeface typefaceJ;
        boolean zBooleanValue;
        if (hVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            h hVarE = e(hVarArr, i3);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hVarE.f5852a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(hVarE.f5854c).setItalic(hVarE.f5855d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (h hVar : hVarArr) {
            if (hVar.e == 0) {
                Uri uri = hVar.f5852a;
                if (!map.containsKey(uri)) {
                    map.put(uri, AbstractC0503p3.e(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objM = m();
        if (objM == null) {
            return null;
        }
        boolean z2 = false;
        for (h hVar2 : hVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(hVar2.f5852a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f5692i.invoke(objM, byteBuffer, Integer.valueOf(hVar2.f5853b), null, Integer.valueOf(hVar2.f5854c), Integer.valueOf(hVar2.f5855d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    h(objM);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            h(objM);
            return null;
        }
        if (k(objM) && (typefaceJ = j(objM)) != null) {
            return Typeface.create(typefaceJ, i3);
        }
        return null;
    }

    @Override // p013d1.AbstractC0497o3
    public final Typeface d(Context context, Resources resources, int i3, String str, int i4) {
        if (!l()) {
            return super.d(context, resources, i3, str, i4);
        }
        Object objM = m();
        if (objM == null) {
            return null;
        }
        if (!i(context, objM, str, 0, -1, -1, null)) {
            h(objM);
            return null;
        }
        if (k(objM)) {
            return j(objM);
        }
        return null;
    }

    public final void h(Object obj) {
        try {
            this.f5694k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean i(Context context, Object obj, String str, int i3, int i4, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f5691h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f5689f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f5695l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f5693j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        Method method = this.f5691h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    public final Object m() {
        try {
            return this.f5690g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method o(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
