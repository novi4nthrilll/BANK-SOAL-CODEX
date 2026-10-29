package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f2330a;

    public o0(Unsafe unsafe) {
        this.f2330a = unsafe;
    }

    public final int a(Class cls) {
        return this.f2330a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f2330a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j3, Object obj);

    public abstract double d(long j3, Object obj);

    public abstract float e(long j3, Object obj);

    public final int f(long j3, Object obj) {
        return this.f2330a.getInt(obj, j3);
    }

    public final long g(long j3, Object obj) {
        return this.f2330a.getLong(obj, j3);
    }

    public final Object h(long j3, Object obj) {
        return this.f2330a.getObject(obj, j3);
    }

    public final long i(Field field) {
        return this.f2330a.objectFieldOffset(field);
    }

    public abstract void j(Object obj, long j3, boolean z2);

    public abstract void k(Object obj, long j3, byte b3);

    public abstract void l(Object obj, long j3, double d3);

    public abstract void m(Object obj, long j3, float f3);

    public final void n(Object obj, long j3, int i3) {
        this.f2330a.putInt(obj, j3, i3);
    }

    public final void o(Object obj, long j3, long j4) {
        this.f2330a.putLong(obj, j3, j4);
    }

    public final void p(Object obj, long j3, Object obj2) {
        this.f2330a.putObject(obj, j3, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f2330a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            p0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
