package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0299o8 extends U7 {
    private static final Map zzb = new ConcurrentHashMap();
    protected S8 zzc;
    private int zzd;

    public AbstractC0299o8() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = S8.f2908f;
    }

    public static Object d(Method method, U7 u7, Object... objArr) {
        try {
            return method.invoke(u7, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void f(Class cls, AbstractC0299o8 abstractC0299o8) {
        abstractC0299o8.e();
        zzb.put(cls, abstractC0299o8);
    }

    public static final boolean h(AbstractC0299o8 abstractC0299o8, boolean z2) {
        byte bByteValue = ((Byte) abstractC0299o8.k(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zH = K8.f2835c.a(abstractC0299o8.getClass()).h(abstractC0299o8);
        if (z2) {
            abstractC0299o8.k(2, true == zH ? abstractC0299o8 : null);
        }
        return zH;
    }

    public static AbstractC0299o8 n(Class cls) {
        Map map = zzb;
        AbstractC0299o8 abstractC0299o8 = (AbstractC0299o8) map.get(cls);
        if (abstractC0299o8 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0299o8 = (AbstractC0299o8) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0299o8 == null) {
            abstractC0299o8 = (AbstractC0299o8) ((AbstractC0299o8) Y8.h(cls)).k(6, null);
            if (abstractC0299o8 == null) {
                throw new IllegalStateException();
            }
            map.put(cls, abstractC0299o8);
        }
        return abstractC0299o8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.E8
    public final boolean a() {
        return h(this, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.U7
    public final int b(N8 n8) {
        if (i()) {
            int iF = n8.f(this);
            if (iF >= 0) {
                return iF;
            }
            throw new IllegalStateException(p013d1.I.f("serialized size must be non-negative, was ", iF));
        }
        int i3 = this.zzd & Integer.MAX_VALUE;
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        int iF2 = n8.f(this);
        if (iF2 < 0) {
            throw new IllegalStateException(p013d1.I.f("serialized size must be non-negative, was ", iF2));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iF2;
        return iF2;
    }

    public final void e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return K8.f2835c.a(getClass()).d(this, (AbstractC0299o8) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (i()) {
            return K8.f2835c.a(getClass()).i(this);
        }
        int i3 = this.zza;
        if (i3 != 0) {
            return i3;
        }
        int i4 = K8.f2835c.a(getClass()).i(this);
        this.zza = i4;
        return i4;
    }

    public final boolean i() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final void j(C0179c8 c0179c8) {
        N8 n8A = K8.f2835c.a(getClass());
        A8 a8 = c0179c8.f3005a;
        if (a8 == null) {
            a8 = new A8(c0179c8);
        }
        n8A.c(this, a8);
    }

    public abstract Object k(int i3, AbstractC0299o8 abstractC0299o8);

    public final int l() {
        int iF;
        if (i()) {
            iF = K8.f2835c.a(getClass()).f(this);
            if (iF < 0) {
                throw new IllegalStateException(p013d1.I.f("serialized size must be non-negative, was ", iF));
            }
        } else {
            iF = this.zzd & Integer.MAX_VALUE;
            if (iF == Integer.MAX_VALUE) {
                iF = K8.f2835c.a(getClass()).f(this);
                if (iF < 0) {
                    throw new IllegalStateException(p013d1.I.f("serialized size must be non-negative, was ", iF));
                }
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iF;
            }
        }
        return iF;
    }

    public final AbstractC0259k8 m() {
        return (AbstractC0259k8) k(5, null);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = F8.f2785a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        F8.c(this, sb, 0);
        return sb.toString();
    }
}
