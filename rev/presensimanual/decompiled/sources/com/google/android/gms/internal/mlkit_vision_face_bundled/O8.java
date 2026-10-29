package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class O8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H7 f2874a;

    static {
        K8 k8 = K8.f2835c;
        f2874a = new H7(4);
    }

    public static void A(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof AbstractC0309p8) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                c0179c8.l(i3 << 3);
                if (iIntValue >= 0) {
                    c0179c8.l(iIntValue);
                } else {
                    c0179c8.n(iIntValue);
                }
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int iA = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iA += C0179c8.a(((Integer) list.get(i5)).intValue());
        }
        c0179c8.l(iA);
        while (i4 < list.size()) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            if (iIntValue2 >= 0) {
                c0179c8.l(iIntValue2);
            } else {
                c0179c8.n(iIntValue2);
            }
            i4++;
        }
    }

    public static void B(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof AbstractC0309p8) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0179c8.e(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            i5 += 4;
        }
        c0179c8.l(i5);
        while (i4 < list.size()) {
            c0179c8.f(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void C(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof AbstractC0408z8) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0179c8.g(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            i5 += 8;
        }
        c0179c8.l(i5);
        while (i4 < list.size()) {
            c0179c8.h(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void D(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof AbstractC0249j8) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0179c8.e(i3, Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Float) list.get(i6)).getClass();
            i5 += 4;
        }
        c0179c8.l(i5);
        while (i4 < list.size()) {
            c0179c8.f(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
            i4++;
        }
    }

    public static void E(int i3, List list, A8 a8, N8 n8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            a8.n(i3, list.get(i4), n8);
        }
    }

    public static void F(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof AbstractC0309p8) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                c0179c8.l(i3 << 3);
                if (iIntValue >= 0) {
                    c0179c8.l(iIntValue);
                } else {
                    c0179c8.n(iIntValue);
                }
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int iA = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iA += C0179c8.a(((Integer) list.get(i5)).intValue());
        }
        c0179c8.l(iA);
        while (i4 < list.size()) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            if (iIntValue2 >= 0) {
                c0179c8.l(iIntValue2);
            } else {
                c0179c8.n(iIntValue2);
            }
            i4++;
        }
    }

    public static void G(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof AbstractC0408z8) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0179c8.m(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int iA = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iA += C0179c8.a(((Long) list.get(i5)).longValue());
        }
        c0179c8.l(iA);
        while (i4 < list.size()) {
            c0179c8.n(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void a(int i3, List list, A8 a8, N8 n8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            a8.q(i3, list.get(i4), n8);
        }
    }

    public static void b(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof AbstractC0309p8) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0179c8.e(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Integer) list.get(i6)).getClass();
            i5 += 4;
        }
        c0179c8.l(i5);
        while (i4 < list.size()) {
            c0179c8.f(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void c(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof AbstractC0408z8) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0179c8.g(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Long) list.get(i6)).getClass();
            i5 += 8;
        }
        c0179c8.l(i5);
        while (i4 < list.size()) {
            c0179c8.h(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static void d(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof AbstractC0309p8) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                c0179c8.k(i3, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int iR = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue2 = ((Integer) list.get(i5)).intValue();
            iR += C0179c8.r((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        c0179c8.l(iR);
        while (i4 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i4)).intValue();
            c0179c8.l((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i4++;
        }
    }

    public static void e(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof AbstractC0408z8) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                long jLongValue = ((Long) list.get(i4)).longValue();
                c0179c8.m((jLongValue >> 63) ^ (jLongValue + jLongValue), i3);
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int iA = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            long jLongValue2 = ((Long) list.get(i5)).longValue();
            iA += C0179c8.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        c0179c8.l(iA);
        while (i4 < list.size()) {
            long jLongValue3 = ((Long) list.get(i4)).longValue();
            c0179c8.n((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i4++;
        }
    }

    public static void f(int i3, List list, A8 a8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        boolean z2 = list instanceof InterfaceC0388x8;
        int i4 = 0;
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        if (!z2) {
            while (i4 < list.size()) {
                c0179c8.i((String) list.get(i4), i3);
                i4++;
            }
            return;
        }
        InterfaceC0388x8 interfaceC0388x8 = (InterfaceC0388x8) list;
        while (i4 < list.size()) {
            Object objA = interfaceC0388x8.a();
            if (objA instanceof String) {
                c0179c8.i((String) objA, i3);
            } else {
                c0179c8.d(i3, (AbstractC0169b8) objA);
            }
            i4++;
        }
    }

    public static void g(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof AbstractC0309p8) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0179c8.k(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int iR = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iR += C0179c8.r(((Integer) list.get(i5)).intValue());
        }
        c0179c8.l(iR);
        while (i4 < list.size()) {
            c0179c8.l(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    public static void h(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof AbstractC0408z8) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0179c8.m(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int iA = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            iA += C0179c8.a(((Long) list.get(i5)).longValue());
        }
        c0179c8.l(iA);
        while (i4 < list.size()) {
            c0179c8.n(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0309p8) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iA = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iA += C0179c8.a(((Integer) list.get(i3)).intValue());
        }
        return iA;
    }

    public static int k(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0179c8.r(i3 << 3) + 4) * size;
    }

    public static int l(List list) {
        return list.size() * 4;
    }

    public static int m(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0179c8.r(i3 << 3) + 8) * size;
    }

    public static int n(List list) {
        return list.size() * 8;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0309p8) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iA = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iA += C0179c8.a(((Integer) list.get(i3)).intValue());
        }
        return iA;
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0408z8) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iA = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iA += C0179c8.a(((Long) list.get(i3)).longValue());
        }
        return iA;
    }

    public static int q(int i3, Object obj, N8 n8) {
        return C0179c8.p((U7) obj, n8) + C0179c8.r(i3 << 3);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0309p8) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iR = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iIntValue = ((Integer) list.get(i3)).intValue();
            iR += C0179c8.r((iIntValue >> 31) ^ (iIntValue + iIntValue));
        }
        return iR;
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0408z8) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iA = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long jLongValue = ((Long) list.get(i3)).longValue();
            iA += C0179c8.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
        }
        return iA;
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0309p8) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iR = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iR += C0179c8.r(((Integer) list.get(i3)).intValue());
        }
        return iR;
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0408z8) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iA = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iA += C0179c8.a(((Long) list.get(i3)).longValue());
        }
        return iA;
    }

    public static void v(Object obj, Object obj2) {
        C0229h8 c0229h8 = ((AbstractC0269l8) obj2).zzb;
        if (c0229h8.f3082a.isEmpty()) {
            return;
        }
        C0229h8 c0229h8O = ((AbstractC0269l8) obj).o();
        c0229h8O.getClass();
        P8 p8 = c0229h8.f3082a;
        int i3 = p8.e;
        for (int i4 = 0; i4 < i3; i4++) {
            c0229h8O.h(p8.d(i4));
        }
        Iterator it = p8.b().iterator();
        while (it.hasNext()) {
            c0229h8O.h((Map.Entry) it.next());
        }
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
    public static void w(Object obj, Object obj2) {
        AbstractC0299o8 abstractC0299o8 = (AbstractC0299o8) obj;
        S8 s8 = abstractC0299o8.zzc;
        S8 s9 = ((AbstractC0299o8) obj2).zzc;
        S8 s10 = S8.f2908f;
        if (!s10.equals(s9)) {
            if (s10.equals(s8)) {
                int i3 = s8.f2909a + s9.f2909a;
                int[] iArrCopyOf = Arrays.copyOf(s8.f2910b, i3);
                System.arraycopy(s9.f2910b, 0, iArrCopyOf, s8.f2909a, s9.f2909a);
                Object[] objArrCopyOf = Arrays.copyOf(s8.f2911c, i3);
                System.arraycopy(s9.f2911c, 0, objArrCopyOf, s8.f2909a, s9.f2909a);
                s8 = new S8(i3, iArrCopyOf, objArrCopyOf, true);
            } else {
                s8.getClass();
                if (!s9.equals(s10)) {
                    if (!s8.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i4 = s8.f2909a + s9.f2909a;
                    s8.e(i4);
                    System.arraycopy(s9.f2910b, 0, s8.f2910b, s8.f2909a, s9.f2909a);
                    System.arraycopy(s9.f2911c, 0, s8.f2911c, s8.f2909a, s9.f2909a);
                    s8.f2909a = i4;
                }
            }
        }
        abstractC0299o8.zzc = s8;
    }

    public static void x(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof Y7) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                boolean zBooleanValue = ((Boolean) list.get(i4)).booleanValue();
                c0179c8.l(i3 << 3);
                c0179c8.b(zBooleanValue ? (byte) 1 : (byte) 0);
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            i5++;
        }
        c0179c8.l(i5);
        while (i4 < list.size()) {
            c0179c8.b(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
            i4++;
        }
    }

    public static void y(int i3, List list, A8 a8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((C0179c8) a8.f2742a).d(i3, (AbstractC0169b8) list.get(i4));
        }
    }

    public static void z(int i3, List list, A8 a8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        a8.getClass();
        if (list instanceof AbstractC0189d8) {
            throw new ClassCastException();
        }
        C0179c8 c0179c8 = (C0179c8) a8.f2742a;
        int i4 = 0;
        if (!z2) {
            while (i4 < list.size()) {
                c0179c8.g(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()), i3);
                i4++;
            }
            return;
        }
        c0179c8.j(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Double) list.get(i6)).getClass();
            i5 += 8;
        }
        c0179c8.l(i5);
        while (i4 < list.size()) {
            c0179c8.h(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
            i4++;
        }
    }
}
