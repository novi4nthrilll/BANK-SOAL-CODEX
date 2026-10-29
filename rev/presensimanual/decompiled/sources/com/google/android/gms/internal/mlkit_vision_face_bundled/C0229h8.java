package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0229h8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0229h8 f3081c = new C0229h8(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P8 f3082a = new P8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3083b;

    public C0229h8() {
    }

    public static int a(C0279m8 c0279m8, Object obj) {
        int iE;
        int iR;
        b9 b9Var = c0279m8.f3230d;
        List list = (List) obj;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj2 = list.get(i4);
            int iR2 = C0179c8.r(1616448016);
            if (b9Var == b9.e) {
                Charset charset = AbstractC0348t8.f3460a;
                iR2 += iR2;
            }
            c9 c9Var = c9.f3009d;
            int iA = 4;
            switch (b9Var.ordinal()) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    ((Double) obj2).getClass();
                    iA = 8;
                    i3 += iR2 + iA;
                    break;
                case 1:
                    ((Float) obj2).getClass();
                    i3 += iR2 + iA;
                    break;
                case 2:
                    iA = C0179c8.a(((Long) obj2).longValue());
                    i3 += iR2 + iA;
                    break;
                case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                    iA = C0179c8.a(((Long) obj2).longValue());
                    i3 += iR2 + iA;
                    break;
                case M.k.LONG_FIELD_NUMBER /* 4 */:
                    iA = C0179c8.a(((Integer) obj2).intValue());
                    i3 += iR2 + iA;
                    break;
                case M.k.STRING_FIELD_NUMBER /* 5 */:
                    ((Long) obj2).getClass();
                    iA = 8;
                    i3 += iR2 + iA;
                    break;
                case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    ((Integer) obj2).getClass();
                    i3 += iR2 + iA;
                    break;
                case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    ((Boolean) obj2).getClass();
                    iA = 1;
                    i3 += iR2 + iA;
                    break;
                case M.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (obj2 instanceof AbstractC0169b8) {
                        iE = ((AbstractC0169b8) obj2).e();
                        iR = C0179c8.r(iE);
                        iA = iR + iE;
                    } else {
                        iA = C0179c8.q((String) obj2);
                    }
                    i3 += iR2 + iA;
                    break;
                case 9:
                    iA = ((AbstractC0299o8) ((U7) obj2)).l();
                    i3 += iR2 + iA;
                    break;
                case 10:
                    iE = ((AbstractC0299o8) ((U7) obj2)).l();
                    iR = C0179c8.r(iE);
                    iA = iR + iE;
                    i3 += iR2 + iA;
                    break;
                case 11:
                    if (obj2 instanceof AbstractC0169b8) {
                        iE = ((AbstractC0169b8) obj2).e();
                        iR = C0179c8.r(iE);
                    } else {
                        iE = ((byte[]) obj2).length;
                        iR = C0179c8.r(iE);
                    }
                    iA = iR + iE;
                    i3 += iR2 + iA;
                    break;
                case 12:
                    iA = C0179c8.r(((Integer) obj2).intValue());
                    i3 += iR2 + iA;
                    break;
                case 13:
                    iA = C0179c8.a(((Integer) obj2).intValue());
                    i3 += iR2 + iA;
                    break;
                case 14:
                    ((Integer) obj2).getClass();
                    i3 += iR2 + iA;
                    break;
                case 15:
                    ((Long) obj2).getClass();
                    iA = 8;
                    i3 += iR2 + iA;
                    break;
                case 16:
                    int iIntValue = ((Integer) obj2).intValue();
                    iA = C0179c8.r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i3 += iR2 + iA;
                    break;
                case 17:
                    long jLongValue = ((Long) obj2).longValue();
                    iA = C0179c8.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i3 += iR2 + iA;
                    break;
                default:
                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
        return i3;
    }

    public static boolean i(Map.Entry entry) {
        if (((C0279m8) entry.getKey()).f3230d.f2999d != c9.f3016l) {
            return true;
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (!(obj instanceof E8)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (!((E8) obj).a()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    public static final void j(C0279m8 c0279m8, Object obj) {
        boolean z2;
        b9 b9Var = c0279m8.f3230d;
        Charset charset = AbstractC0348t8.f3460a;
        obj.getClass();
        b9 b9Var2 = b9.e;
        c9 c9Var = c9.f3009d;
        switch (b9Var.f2999d.ordinal()) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                z2 = obj instanceof Integer;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, c0279m8.f3230d.f2999d, obj.getClass().getName()));
            case 1:
                z2 = obj instanceof Long;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, c0279m8.f3230d.f2999d, obj.getClass().getName()));
            case 2:
                z2 = obj instanceof Float;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, c0279m8.f3230d.f2999d, obj.getClass().getName()));
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                z2 = obj instanceof Double;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, c0279m8.f3230d.f2999d, obj.getClass().getName()));
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                z2 = obj instanceof Boolean;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, c0279m8.f3230d.f2999d, obj.getClass().getName()));
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                z2 = obj instanceof String;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, c0279m8.f3230d.f2999d, obj.getClass().getName()));
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                if ((obj instanceof AbstractC0169b8) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, c0279m8.f3230d.f2999d, obj.getClass().getName()));
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                if (obj instanceof Integer) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, c0279m8.f3230d.f2999d, obj.getClass().getName()));
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof U7) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, c0279m8.f3230d.f2999d, obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 202056002, c0279m8.f3230d.f2999d, obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0229h8 clone() {
        C0229h8 c0229h8 = new C0229h8();
        P8 p8 = this.f3082a;
        int i3 = p8.e;
        for (int i4 = 0; i4 < i3; i4++) {
            Q8 q8D = p8.d(i4);
            c0229h8.f((C0279m8) q8D.f2893d, q8D.e);
        }
        for (Map.Entry entry : p8.b()) {
            c0229h8.f((C0279m8) entry.getKey(), entry.getValue());
        }
        return c0229h8;
    }

    public final Iterator c() {
        P8 p8 = this.f3082a;
        return p8.isEmpty() ? Collections.emptyIterator() : ((androidx.datastore.preferences.protobuf.h0) p8.entrySet()).iterator();
    }

    public final void d(C0279m8 c0279m8, Object obj) {
        List arrayList;
        j(c0279m8, obj);
        P8 p8 = this.f3082a;
        Object obj2 = p8.get(c0279m8);
        if (obj2 == null) {
            arrayList = new ArrayList();
            p8.put(c0279m8, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    public final void e() {
        if (this.f3083b) {
            return;
        }
        P8 p8 = this.f3082a;
        int i3 = p8.e;
        for (int i4 = 0; i4 < i3; i4++) {
            Object obj = p8.d(i4).e;
            if (obj instanceof AbstractC0299o8) {
                AbstractC0299o8 abstractC0299o8 = (AbstractC0299o8) obj;
                abstractC0299o8.getClass();
                K8.f2835c.a(abstractC0299o8.getClass()).a(abstractC0299o8);
                abstractC0299o8.e();
            }
        }
        if (!p8.f2883g) {
            for (int i5 = 0; i5 < p8.e; i5++) {
                Q8 q8D = p8.d(i5);
                ((C0279m8) q8D.f2893d).getClass();
                q8D.setValue(Collections.unmodifiableList((List) q8D.e));
            }
            for (Map.Entry entry : p8.b()) {
                ((C0279m8) entry.getKey()).getClass();
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        if (!p8.f2883g) {
            p8.f2882f = p8.f2882f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(p8.f2882f);
            p8.f2885i = p8.f2885i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(p8.f2885i);
            p8.f2883g = true;
        }
        this.f3083b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0229h8) {
            return this.f3082a.equals(((C0229h8) obj).f3082a);
        }
        return false;
    }

    public final void f(C0279m8 c0279m8, Object obj) {
        c0279m8.getClass();
        if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        List list = (List) obj;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            Object obj2 = list.get(i3);
            j(c0279m8, obj2);
            arrayList.add(obj2);
        }
        this.f3082a.put(c0279m8, arrayList);
    }

    public final boolean g() {
        P8 p8 = this.f3082a;
        int i3 = p8.e;
        for (int i4 = 0; i4 < i3; i4++) {
            if (!i(p8.d(i4))) {
                return false;
            }
        }
        Iterator it = p8.b().iterator();
        while (it.hasNext()) {
            if (!i((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void h(Map.Entry entry) {
        C0279m8 c0279m8 = (C0279m8) entry.getKey();
        Object value = entry.getValue();
        c0279m8.getClass();
        P8 p8 = this.f3082a;
        Object arrayList = p8.get(c0279m8);
        List list = (List) value;
        int size = list.size();
        if (arrayList == null) {
            arrayList = new ArrayList(size);
        }
        List list2 = (List) arrayList;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, length);
                obj = bArr2;
            }
            list2.add(obj);
        }
        p8.put(c0279m8, arrayList);
    }

    public final int hashCode() {
        return this.f3082a.hashCode();
    }

    public C0229h8(int i3) {
        e();
        e();
    }
}
