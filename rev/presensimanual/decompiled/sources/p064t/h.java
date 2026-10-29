package p064t;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p013d1.AbstractC0497o3;
import p013d1.AbstractC0503p3;
import p060s.f;
import p060s.g;

/* JADX INFO: loaded from: classes.dex */
public class h extends AbstractC0497o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Class f5681a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Constructor f5682b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f5683c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f5684d = null;
    public static boolean e = false;

    public static boolean f(Object obj, String str, int i3, boolean z2) throws NoSuchMethodException {
        g();
        try {
            return ((Boolean) f5683c.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void g() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            method = null;
            cls = null;
            method2 = null;
        }
        f5682b = constructor;
        f5681a = cls;
        f5683c = method2;
        f5684d = method;
    }

    @Override // p013d1.AbstractC0497o3
    public Typeface a(Context context, f fVar, Resources resources, int i3) throws NoSuchMethodException {
        g();
        try {
            Object objNewInstance = f5682b.newInstance(null);
            for (g gVar : fVar.f5637a) {
                File fileD = AbstractC0503p3.d(context);
                if (fileD == null) {
                    return null;
                }
                try {
                    if (!AbstractC0503p3.b(fileD, resources, gVar.f5642f)) {
                        return null;
                    }
                    if (!f(objNewInstance, fileD.getPath(), gVar.f5639b, gVar.f5640c)) {
                        return null;
                    }
                    fileD.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileD.delete();
                }
            }
            g();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f5681a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f5684d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // p013d1.AbstractC0497o3
    public Typeface b(Context context, p075y.h[] hVarArr, int i3) {
        File file;
        if (hVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(e(hVarArr, i3).f5852a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                    file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                } catch (ErrnoException unused) {
                }
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceC = c(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceC;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
