package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends o0 {
    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean c(long j3, Object obj) {
        return this.f2330a.getBoolean(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final double d(long j3, Object obj) {
        return this.f2330a.getDouble(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final float e(long j3, Object obj) {
        return this.f2330a.getFloat(obj, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void j(Object obj, long j3, boolean z2) {
        this.f2330a.putBoolean(obj, j3, z2);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void k(Object obj, long j3, byte b3) {
        this.f2330a.putByte(obj, j3, b3);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void l(Object obj, long j3, double d3) {
        this.f2330a.putDouble(obj, j3, d3);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void m(Object obj, long j3, float f3) {
        this.f2330a.putFloat(obj, j3, f3);
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean q() {
        if (!super.q()) {
            return false;
        }
        try {
            Class<?> cls = this.f2330a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            p0.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean r() {
        Unsafe unsafe = this.f2330a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (p0.g() != null) {
                    try {
                        Class<?> cls3 = this.f2330a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        p0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                p0.a(th2);
            }
        }
        return false;
    }
}
