package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f2965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f2966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X8 f2967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f2968d;
    public static final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f2969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f2970g;

    /* JADX WARN: Code duplicated, block: B:11:0x004a  */
    /* JADX WARN: Code duplicated, block: B:4:0x001f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0180 A[PHI: r0
      0x0180: PHI (r0v42 java.lang.reflect.Field) = (r0v35 java.lang.reflect.Field), (r0v37 java.lang.reflect.Field) binds: [B:43:0x016d, B:49:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        X8 u8;
        Field declaredField;
        boolean z2;
        boolean z3;
        Field declaredField2;
        Field field;
        X8 x8;
        Unsafe unsafeJ = j();
        f2965a = unsafeJ;
        int i3 = W7.f2943a;
        f2966b = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zS = s(cls);
        boolean zS2 = s(Integer.TYPE);
        if (unsafeJ == null) {
            u8 = null;
        } else if (zS) {
            u8 = new W8(unsafeJ);
        } else if (zS2) {
            u8 = new U8(unsafeJ);
        } else {
            u8 = null;
        }
        f2967c = u8;
        if (u8 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls2 = u8.f2955a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                try {
                    declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                } catch (Throwable unused) {
                    declaredField = null;
                }
                if (declaredField == null) {
                    try {
                        declaredField = Buffer.class.getDeclaredField("address");
                    } catch (Throwable unused2) {
                        declaredField = null;
                    }
                    if (declaredField == null || declaredField.getType() != Long.TYPE) {
                        declaredField = null;
                    }
                }
                if (declaredField == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } catch (Throwable th) {
                Logger.getLogger(Y8.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        f2968d = z2;
        X8 x9 = f2967c;
        if (x9 == null) {
            z3 = false;
        } else {
            try {
                Class<?> cls3 = x9.f2955a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class<?> cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z3 = true;
            } catch (Throwable th2) {
                Logger.getLogger(Y8.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z3 = false;
            }
        }
        e = z3;
        f2969f = u(byte[].class);
        u(boolean[].class);
        a(boolean[].class);
        u(int[].class);
        a(int[].class);
        u(long[].class);
        a(long[].class);
        u(float[].class);
        a(float[].class);
        u(double[].class);
        a(double[].class);
        u(Object[].class);
        a(Object[].class);
        int i4 = W7.f2943a;
        try {
            declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        if (declaredField2 == null) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused4) {
                declaredField2 = null;
            }
            if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
                field = null;
            } else {
                field = declaredField2;
            }
        } else {
            field = declaredField2;
        }
        if (field != null && (x8 = f2967c) != null) {
            x8.f2955a.objectFieldOffset(field);
        }
        f2970g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Class cls) {
        if (e) {
            f2967c.f2955a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j3, byte b3) {
        X8 x8 = f2967c;
        long j4 = (-4) & j3;
        int i3 = x8.f2955a.getInt(obj, j4);
        int i4 = ((~((int) j3)) & 3) << 3;
        x8.f2955a.putInt(obj, j4, ((255 & b3) << i4) | (i3 & (~(255 << i4))));
    }

    public static void c(Object obj, long j3, byte b3) {
        X8 x8 = f2967c;
        long j4 = (-4) & j3;
        int i3 = (((int) j3) & 3) << 3;
        x8.f2955a.putInt(obj, j4, ((255 & b3) << i3) | (x8.f2955a.getInt(obj, j4) & (~(255 << i3))));
    }

    public static double d(long j3, Object obj) {
        return f2967c.a(j3, obj);
    }

    public static float e(long j3, Object obj) {
        return f2967c.b(j3, obj);
    }

    public static int f(long j3, Object obj) {
        return f2967c.f2955a.getInt(obj, j3);
    }

    public static long g(long j3, Object obj) {
        return f2967c.f2955a.getLong(obj, j3);
    }

    public static Object h(Class cls) {
        try {
            return f2965a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static Object i(long j3, Object obj) {
        return f2967c.f2955a.getObject(obj, j3);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new T8());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j3, boolean z2) {
        f2967c.c(obj, j3, z2);
    }

    public static void l(Object obj, long j3, double d3) {
        f2967c.e(obj, j3, d3);
    }

    public static void m(Object obj, long j3, float f3) {
        f2967c.f(obj, j3, f3);
    }

    public static void n(Object obj, long j3, int i3) {
        f2967c.f2955a.putInt(obj, j3, i3);
    }

    public static void o(Object obj, long j3, long j4) {
        f2967c.f2955a.putLong(obj, j3, j4);
    }

    public static void p(Object obj, long j3, Object obj2) {
        f2967c.f2955a.putObject(obj, j3, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean q(long j3, Object obj) {
        return ((byte) ((f2967c.f2955a.getInt(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean r(long j3, Object obj) {
        return ((byte) ((f2967c.f2955a.getInt(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean s(Class cls) {
        int i3 = W7.f2943a;
        try {
            Class cls2 = f2966b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean t(long j3, Object obj) {
        return f2967c.g(j3, obj);
    }

    public static int u(Class cls) {
        if (e) {
            return f2967c.f2955a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
