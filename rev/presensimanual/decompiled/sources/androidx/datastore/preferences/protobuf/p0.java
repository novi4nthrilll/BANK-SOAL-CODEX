package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f2332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f2333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f2334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f2335d;
    public static final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f2336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f2337g;

    static {
        Unsafe unsafeI = i();
        f2332a = unsafeI;
        f2333b = AbstractC0121c.f2273a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        o0 n0Var = null;
        if (unsafeI != null) {
            if (!AbstractC0121c.a()) {
                n0Var = new n0(unsafeI);
            } else if (zH) {
                n0Var = new m0(unsafeI, 1);
            } else if (zH2) {
                n0Var = new m0(unsafeI, 0);
            }
        }
        f2334c = n0Var;
        f2335d = n0Var == null ? false : n0Var.r();
        e = n0Var == null ? false : n0Var.q();
        f2336f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field fieldG = g();
        if (fieldG != null && n0Var != null) {
            n0Var.i(fieldG);
        }
        f2337g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(p0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j3, Object obj) {
        return ((byte) ((f2334c.f((-4) & j3, obj) >>> ((int) (((~j3) & 3) << 3))) & 255)) != 0;
    }

    public static boolean c(long j3, Object obj) {
        return ((byte) ((f2334c.f((-4) & j3, obj) >>> ((int) ((j3 & 3) << 3))) & 255)) != 0;
    }

    public static Object d(Class cls) {
        try {
            return f2332a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int e(Class cls) {
        if (e) {
            return f2334c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (e) {
            f2334c.b(cls);
        }
    }

    public static Field g() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0121c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean h(Class cls) {
        if (!AbstractC0121c.a()) {
            return false;
        }
        try {
            Class cls2 = f2333b;
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

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new l0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j3, byte b3) {
        f2334c.k(bArr, f2336f + j3, b3);
    }

    public static void k(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int iF = f2334c.f(j4, obj);
        int i3 = ((~((int) j3)) & 3) << 3;
        m(obj, j4, ((255 & b3) << i3) | (iF & (~(255 << i3))));
    }

    public static void l(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int i3 = (((int) j3) & 3) << 3;
        m(obj, j4, ((255 & b3) << i3) | (f2334c.f(j4, obj) & (~(255 << i3))));
    }

    public static void m(Object obj, long j3, int i3) {
        f2334c.n(obj, j3, i3);
    }

    public static void n(Object obj, long j3, long j4) {
        f2334c.o(obj, j3, j4);
    }

    public static void o(Object obj, long j3, Object obj2) {
        f2334c.p(obj, j3, obj2);
    }
}
