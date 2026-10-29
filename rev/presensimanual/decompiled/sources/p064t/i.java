package p064t;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p013d1.AbstractC0497o3;
import p013d1.AbstractC0503p3;
import p045n.l;
import p060s.f;
import p060s.g;
import p075y.h;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0497o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f5685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Constructor f5686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f5687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f5688d;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f5686b = constructor;
        f5685a = cls;
        f5687c = method2;
        f5688d = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i3, int i4, boolean z2) {
        try {
            return ((Boolean) f5687c.invoke(obj, byteBuffer, Integer.valueOf(i3), null, Integer.valueOf(i4), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f5685a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f5688d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a A[LOOP:0: B:9:0x0015->B:37:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0069 A[SYNTHETIC] */
    @Override // p013d1.AbstractC0497o3
    public final Typeface a(Context context, f fVar, Resources resources, int i3) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = f5686b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (g gVar : fVar.f5637a) {
            int i4 = gVar.f5642f;
            File fileD = AbstractC0503p3.d(context);
            if (fileD != null) {
                try {
                    if (AbstractC0503p3.b(fileD, resources, i4)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(fileD);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                fileD.delete();
                            } catch (Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (IOException unused2) {
                            map = null;
                        }
                    } else {
                        fileD.delete();
                    }
                    if (map == null) {
                        return null;
                    }
                    if (!f(objNewInstance, map, gVar.e, gVar.f5639b, gVar.f5640c)) {
                        return null;
                    }
                } catch (Throwable th3) {
                    fileD.delete();
                    throw th3;
                }
            }
            map = null;
            if (map == null) {
                return null;
            }
            if (!f(objNewInstance, map, gVar.e, gVar.f5639b, gVar.f5640c)) {
                return null;
            }
        }
        return g(objNewInstance);
    }

    @Override // p013d1.AbstractC0497o3
    public final Typeface b(Context context, h[] hVarArr, int i3) {
        Object objNewInstance;
        try {
            objNewInstance = f5686b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        l lVar = new l();
        for (h hVar : hVarArr) {
            Uri uri = hVar.f5852a;
            ByteBuffer byteBufferE = (ByteBuffer) lVar.getOrDefault(uri, null);
            if (byteBufferE == null) {
                byteBufferE = AbstractC0503p3.e(context, uri);
                lVar.put(uri, byteBufferE);
            }
            if (byteBufferE == null) {
                return null;
            }
            if (!f(objNewInstance, byteBufferE, hVar.f5853b, hVar.f5854c, hVar.f5855d)) {
                return null;
            }
        }
        Typeface typefaceG = g(objNewInstance);
        if (typefaceG == null) {
            return null;
        }
        return Typeface.create(typefaceG, i3);
    }
}
