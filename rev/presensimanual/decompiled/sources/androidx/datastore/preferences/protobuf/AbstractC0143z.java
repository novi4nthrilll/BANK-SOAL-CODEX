package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0143z extends AbstractC0119a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0143z> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected j0 unknownFields;

    public AbstractC0143z() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = j0.f2312f;
    }

    public static AbstractC0143z f(Class cls) {
        AbstractC0143z abstractC0143z = defaultInstanceMap.get(cls);
        if (abstractC0143z == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0143z = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0143z == null) {
            abstractC0143z = (AbstractC0143z) ((AbstractC0143z) p0.d(cls)).e(6);
            if (abstractC0143z == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0143z);
        }
        return abstractC0143z;
    }

    public static Object g(Method method, AbstractC0119a abstractC0119a, Object... objArr) {
        try {
            return method.invoke(abstractC0119a, objArr);
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

    public static final boolean h(AbstractC0143z abstractC0143z, boolean z2) {
        byte bByteValue = ((Byte) abstractC0143z.e(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        Z z3 = Z.f2263c;
        z3.getClass();
        boolean zA = z3.a(abstractC0143z.getClass()).a(abstractC0143z);
        if (z2) {
            abstractC0143z.e(2);
        }
        return zA;
    }

    public static void l(Class cls, AbstractC0143z abstractC0143z) {
        abstractC0143z.j();
        defaultInstanceMap.put(cls, abstractC0143z);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0119a
    public final int a(c0 c0Var) {
        int iF;
        int iF2;
        if (i()) {
            if (c0Var == null) {
                Z z2 = Z.f2263c;
                z2.getClass();
                iF2 = z2.a(getClass()).f(this);
            } else {
                iF2 = c0Var.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            throw new IllegalStateException(p013d1.I.f("serialized size must be non-negative, was ", iF2));
        }
        int i3 = this.memoizedSerializedSize;
        if ((i3 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i3 & Integer.MAX_VALUE;
        }
        if (c0Var == null) {
            Z z3 = Z.f2263c;
            z3.getClass();
            iF = z3.a(getClass()).f(this);
        } else {
            iF = c0Var.f(this);
        }
        m(iF);
        return iF;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0119a
    public final void b(C0132n c0132n) {
        Z z2 = Z.f2263c;
        z2.getClass();
        c0 c0VarA = z2.a(getClass());
        L l3 = c0132n.f2326a;
        if (l3 == null) {
            l3 = new L(c0132n);
        }
        c0VarA.d(this, l3);
    }

    public final void c() {
        this.memoizedHashCode = 0;
    }

    public final void d() {
        m(Integer.MAX_VALUE);
    }

    public abstract Object e(int i3);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Z z2 = Z.f2263c;
        z2.getClass();
        return z2.a(getClass()).i(this, (AbstractC0143z) obj);
    }

    public final int hashCode() {
        if (i()) {
            Z z2 = Z.f2263c;
            z2.getClass();
            return z2.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            Z z3 = Z.f2263c;
            z3.getClass();
            this.memoizedHashCode = z3.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final AbstractC0143z k() {
        return (AbstractC0143z) e(4);
    }

    public final void m(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException(p013d1.I.f("serialized size must be non-negative, was ", i3));
        }
        this.memoizedSerializedSize = (i3 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = T.f2243a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        T.c(this, sb, 0);
        return sb.toString();
    }
}
