package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f2275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k0 f2276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f2277c;

    static {
        Class<?> cls;
        Class<?> cls2;
        Z z2 = Z.f2263c;
        k0 k0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2275a = cls;
        try {
            Z z3 = Z.f2263c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                k0Var = (k0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f2276b = k0Var;
        f2277c = new k0();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void A(k0 k0Var, Object obj, Object obj2) {
        k0Var.getClass();
        AbstractC0143z abstractC0143z = (AbstractC0143z) obj;
        j0 j0Var = abstractC0143z.unknownFields;
        j0 j0Var2 = ((AbstractC0143z) obj2).unknownFields;
        j0 j0Var3 = j0.f2312f;
        if (!j0Var3.equals(j0Var2)) {
            if (j0Var3.equals(j0Var)) {
                int i3 = j0Var.f2313a + j0Var2.f2313a;
                int[] iArrCopyOf = Arrays.copyOf(j0Var.f2314b, i3);
                System.arraycopy(j0Var2.f2314b, 0, iArrCopyOf, j0Var.f2313a, j0Var2.f2313a);
                Object[] objArrCopyOf = Arrays.copyOf(j0Var.f2315c, i3);
                System.arraycopy(j0Var2.f2315c, 0, objArrCopyOf, j0Var.f2313a, j0Var2.f2313a);
                j0Var = new j0(i3, iArrCopyOf, objArrCopyOf, true);
            } else {
                j0Var.getClass();
                if (!j0Var2.equals(j0Var3)) {
                    if (!j0Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i4 = j0Var.f2313a + j0Var2.f2313a;
                    j0Var.a(i4);
                    System.arraycopy(j0Var2.f2314b, 0, j0Var.f2314b, j0Var.f2313a, j0Var2.f2313a);
                    System.arraycopy(j0Var2.f2315c, 0, j0Var.f2315c, j0Var.f2313a, j0Var2.f2313a);
                    j0Var.f2313a = i4;
                }
            }
        }
        abstractC0143z.unknownFields = j0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof AbstractC0122d) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0132n.G(i3, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            Logger logger = C0132n.f2324f;
            i5++;
        }
        c0132n.T(i5);
        while (i4 < list.size()) {
            c0132n.E(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    public static void D(int i3, List list, L l3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((C0132n) l3.f2235a).H(i3, (C0126h) list.get(i4));
        }
    }

    public static void E(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof AbstractC0133o) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                double dDoubleValue = ((Double) list.get(i4)).doubleValue();
                c0132n.getClass();
                c0132n.L(Double.doubleToRawLongBits(dDoubleValue), i3);
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Double) list.get(i6)).getClass();
            Logger logger = C0132n.f2324f;
            i5 += 8;
        }
        c0132n.T(i5);
        while (i4 < list.size()) {
            c0132n.M(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }

    public static void F(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof A) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0132n.N(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int iB = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iB += C0132n.B(((Integer) list.get(i5)).intValue());
        }
        c0132n.T(iB);
        while (i4 < list.size()) {
            c0132n.O(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void G(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof A) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0132n.J(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0132n.f2324f;
            i5 += 4;
        }
        c0132n.T(i5);
        while (i4 < list.size()) {
            c0132n.K(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void H(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof J) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0132n.L(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0132n.f2324f;
            i5 += 8;
        }
        c0132n.T(i5);
        while (i4 < list.size()) {
            c0132n.M(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void I(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof AbstractC0139v) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                float fFloatValue = ((Float) list.get(i4)).floatValue();
                c0132n.getClass();
                c0132n.J(i3, Float.floatToRawIntBits(fFloatValue));
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Float) list.get(i6)).getClass();
            Logger logger = C0132n.f2324f;
            i5 += 4;
        }
        c0132n.T(i5);
        while (i4 < list.size()) {
            c0132n.K(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void J(int i3, List list, L l3, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        for (int i4 = 0; i4 < list.size(); i4++) {
            l3.h(i3, list.get(i4), c0Var);
        }
    }

    public static void K(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof A) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0132n.N(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int iB = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iB += C0132n.B(((Integer) list.get(i5)).intValue());
        }
        c0132n.T(iB);
        while (i4 < list.size()) {
            c0132n.O(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void L(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof J) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0132n.U(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int iB = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iB += C0132n.B(((Long) list.get(i5)).longValue());
        }
        c0132n.T(iB);
        while (i4 < list.size()) {
            c0132n.V(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void M(int i3, List list, L l3, c0 c0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        for (int i4 = 0; i4 < list.size(); i4++) {
            l3.k(i3, list.get(i4), c0Var);
        }
    }

    public static void N(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof A) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0132n.J(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            Logger logger = C0132n.f2324f;
            i5 += 4;
        }
        c0132n.T(i5);
        while (i4 < list.size()) {
            c0132n.K(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void O(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof J) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0132n.L(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            Logger logger = C0132n.f2324f;
            i5 += 8;
        }
        c0132n.T(i5);
        while (i4 < list.size()) {
            c0132n.M(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void P(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof A) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                c0132n.S(i3, (iIntValue >> 31) ^ (iIntValue << 1));
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int iZ = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue2 = ((Integer) list.get(i5)).intValue();
            iZ += C0132n.z((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c0132n.T(iZ);
        while (i4 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            c0132n.T((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i4++;
        }
    }

    public static void Q(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof J) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                long jLongValue = ((Long) list.get(i4)).longValue();
                c0132n.U((jLongValue >> 63) ^ (jLongValue << 1), i3);
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int iB = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            long jLongValue2 = ((Long) list.get(i5)).longValue();
            iB += C0132n.B((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c0132n.T(iB);
        while (i4 < list.size()) {
            long jLongValue3 = ((Long) list.get(i4)).longValue();
            c0132n.V((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i4++;
        }
    }

    public static void R(int i3, List list, L l3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        boolean z2 = list instanceof G;
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0132n.P((String) list.get(i4), i3);
                i4++;
            }
            return;
        }
        G g3 = (G) list;
        while (i4 < list.size()) {
            Object objB = g3.b();
            if (objB instanceof String) {
                c0132n.P((String) objB, i3);
            } else {
                c0132n.H(i3, (C0126h) objB);
            }
            i4++;
        }
    }

    public static void S(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof A) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0132n.S(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int iZ = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iZ += C0132n.z(((Integer) list.get(i5)).intValue());
        }
        c0132n.T(iZ);
        while (i4 < list.size()) {
            c0132n.T(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void T(int i3, List list, L l3, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l3.getClass();
        if (list instanceof J) {
            throw new ClassCastException();
        }
        C0132n c0132n = (C0132n) l3.f2235a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0132n.U(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0132n.R(i3, 2);
        int iB = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iB += C0132n.B(((Long) list.get(i5)).longValue());
        }
        c0132n.T(iB);
        while (i4 < list.size()) {
            c0132n.V(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static int a(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0132n.g(i3) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = C0132n.x(i3) * size;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iX += C0132n.i((C0126h) list.get(i4));
        }
        return iX;
    }

    public static int d(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0132n.x(i3) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof A) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iB = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iB += C0132n.B(((Integer) list.get(i3)).intValue());
        }
        return iB;
    }

    public static int f(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0132n.l(i3) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0132n.m(i3) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i3, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iO += C0132n.o(i3, (AbstractC0119a) list.get(i4), c0Var);
        }
        return iO;
    }

    public static int k(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0132n.x(i3) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof A) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iB = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iB += C0132n.B(((Integer) list.get(i3)).intValue());
        }
        return iB;
    }

    public static int m(int i3, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0132n.x(i3) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof J) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iB = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iB += C0132n.B(((Long) list.get(i3)).longValue());
        }
        return iB;
    }

    public static int o(int i3, Object obj, c0 c0Var) {
        int iX = C0132n.x(i3);
        int iA = ((AbstractC0119a) obj).a(c0Var);
        return C0132n.z(iA) + iA + iX;
    }

    public static int p(int i3, List list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = C0132n.x(i3) * size;
        for (int i4 = 0; i4 < size; i4++) {
            int iA = ((AbstractC0119a) list.get(i4)).a(c0Var);
            iX += C0132n.z(iA) + iA;
        }
        return iX;
    }

    public static int q(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0132n.x(i3) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof A) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iZ = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iIntValue = ((Integer) list.get(i3)).intValue();
            iZ += C0132n.z((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iZ;
    }

    public static int s(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0132n.x(i3) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof J) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iB = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long jLongValue = ((Long) list.get(i3)).longValue();
            iB += C0132n.B((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iB;
    }

    public static int u(int i3, List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int iX = C0132n.x(i3) * size;
        if (list instanceof G) {
            G g3 = (G) list;
            while (i4 < size) {
                Object objB = g3.b();
                iX = (objB instanceof C0126h ? C0132n.i((C0126h) objB) : C0132n.w((String) objB)) + iX;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                iX = (obj instanceof C0126h ? C0132n.i((C0126h) obj) : C0132n.w((String) obj)) + iX;
                i4++;
            }
        }
        return iX;
    }

    public static int v(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0132n.x(i3) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof A) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iZ = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iZ += C0132n.z(((Integer) list.get(i3)).intValue());
        }
        return iZ;
    }

    public static int x(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0132n.x(i3) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof J) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iB = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iB += C0132n.B(((Long) list.get(i3)).longValue());
        }
        return iB;
    }

    public static Object z(Object obj, int i3, B b3, Object obj2, k0 k0Var) {
        return obj2;
    }
}
