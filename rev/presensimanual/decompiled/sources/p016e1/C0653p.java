package p016e1;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p013d1.J2;
import p013d1.K2;
import p013d1.M2;

/* JADX INFO: renamed from: e1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0653p extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f4272m = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object f4273d;
    public transient int[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Object[] f4274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient Object[] f4275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f4276h = Math.min(Math.max(12, 1), 1073741823);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int f4277i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient C0635m f4278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient C0635m f4279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient C0647o f4280l;

    public final Map a() {
        Object obj = this.f4273d;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int i3, int i4) {
        Object obj = this.f4273d;
        obj.getClass();
        int[] iArr = this.e;
        iArr.getClass();
        Object[] objArr = this.f4274f;
        objArr.getClass();
        Object[] objArr2 = this.f4275g;
        objArr2.getClass();
        int size = size();
        int i5 = size - 1;
        if (i3 >= i5) {
            objArr[i3] = null;
            objArr2[i3] = null;
            iArr[i3] = 0;
            return;
        }
        Object obj2 = objArr[i5];
        objArr[i3] = obj2;
        objArr2[i3] = objArr2[i5];
        objArr[i5] = null;
        objArr2[i5] = null;
        iArr[i3] = iArr[i5];
        iArr[i5] = 0;
        int iA = K2.a(obj2) & i4;
        int iB = J2.b(iA, obj);
        if (iB == size) {
            J2.d(obj, iA, i3 + 1);
            return;
        }
        while (true) {
            int i6 = iB - 1;
            int i7 = iArr[i6];
            int i8 = i7 & i4;
            if (i8 == size) {
                iArr[i6] = ((i3 + 1) & i4) | (i7 & (~i4));
                return;
            }
            iB = i8;
        }
    }

    public final boolean c() {
        return this.f4273d == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.f4276h += 32;
        Map mapA = a();
        if (mapA != null) {
            this.f4276h = Math.min(Math.max(size(), 3), 1073741823);
            mapA.clear();
            this.f4273d = null;
            this.f4277i = 0;
            return;
        }
        Object[] objArr = this.f4274f;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f4277i, (Object) null);
        Object[] objArr2 = this.f4275g;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f4277i, (Object) null);
        Object obj = this.f4273d;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.e;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f4277i, 0);
        this.f4277i = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.containsKey(obj);
        }
        return e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.containsValue(obj);
        }
        for (int i3 = 0; i3 < this.f4277i; i3++) {
            Object[] objArr = this.f4275g;
            objArr.getClass();
            if (M2.a(obj, objArr[i3])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f4276h & 31)) - 1;
    }

    public final int e(Object obj) {
        if (c()) {
            return -1;
        }
        int iA = K2.a(obj);
        int iD = d();
        Object obj2 = this.f4273d;
        obj2.getClass();
        int iB = J2.b(iA & iD, obj2);
        if (iB != 0) {
            int i3 = ~iD;
            int i4 = iA & i3;
            do {
                int i5 = iB - 1;
                int[] iArr = this.e;
                iArr.getClass();
                int i6 = iArr[i5];
                if ((i6 & i3) == i4) {
                    Object[] objArr = this.f4274f;
                    objArr.getClass();
                    if (M2.a(obj, objArr[i5])) {
                        return i5;
                    }
                }
                iB = i6 & iD;
            } while (iB != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0635m c0635m = this.f4279k;
        if (c0635m != null) {
            return c0635m;
        }
        C0635m c0635m2 = new C0635m(this, 0);
        this.f4279k = c0635m2;
        return c0635m2;
    }

    public final int f(int i3, int i4, int i5, int i6) {
        Object objC = J2.c(i4);
        int i7 = i4 - 1;
        if (i6 != 0) {
            J2.d(objC, i5 & i7, i6 + 1);
        }
        Object obj = this.f4273d;
        obj.getClass();
        int[] iArr = this.e;
        iArr.getClass();
        for (int i8 = 0; i8 <= i3; i8++) {
            int iB = J2.b(i8, obj);
            while (iB != 0) {
                int i9 = iB - 1;
                int i10 = iArr[i9];
                int i11 = ((~i3) & i10) | i8;
                int i12 = i11 & i7;
                int iB2 = J2.b(i12, objC);
                J2.d(objC, i12, iB);
                iArr[i9] = ((~i7) & i11) | (iB2 & i7);
                iB = i10 & i3;
            }
        }
        this.f4273d = objC;
        this.f4276h = ((32 - Integer.numberOfLeadingZeros(i7)) & 31) | (this.f4276h & (-32));
        return i7;
    }

    public final Object g(Object obj) {
        boolean zC = c();
        Object obj2 = f4272m;
        if (zC) {
            return obj2;
        }
        int iD = d();
        Object obj3 = this.f4273d;
        obj3.getClass();
        int[] iArr = this.e;
        iArr.getClass();
        Object[] objArr = this.f4274f;
        objArr.getClass();
        int iA = J2.a(obj, null, iD, obj3, iArr, objArr, null);
        if (iA == -1) {
            return obj2;
        }
        Object[] objArr2 = this.f4275g;
        objArr2.getClass();
        Object obj4 = objArr2[iA];
        b(iA, iD);
        this.f4277i--;
        this.f4276h += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        Object[] objArr = this.f4275g;
        objArr.getClass();
        return objArr[iE];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0635m c0635m = this.f4278j;
        if (c0635m != null) {
            return c0635m;
        }
        C0635m c0635m2 = new C0635m(this, 1);
        this.f4278j = c0635m2;
        return c0635m2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        int i3 = -1;
        if (c()) {
            if (!c()) {
                throw new IllegalStateException("Arrays already allocated");
            }
            int i4 = this.f4276h;
            int iMax = Math.max(i4 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f4273d = J2.c(iMax2);
            this.f4276h = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f4276h & (-32));
            this.e = new int[i4];
            this.f4274f = new Object[i4];
            this.f4275g = new Object[i4];
        }
        Map mapA = a();
        if (mapA != null) {
            return mapA.put(obj, obj2);
        }
        int[] iArr = this.e;
        iArr.getClass();
        Object[] objArr = this.f4274f;
        objArr.getClass();
        Object[] objArr2 = this.f4275g;
        objArr2.getClass();
        int i5 = this.f4277i;
        int i6 = i5 + 1;
        int iA = K2.a(obj);
        int iD = d();
        int i7 = iA & iD;
        Object obj3 = this.f4273d;
        obj3.getClass();
        int iB = J2.b(i7, obj3);
        if (iB != 0) {
            int i8 = ~iD;
            int i9 = iA & i8;
            int i10 = 0;
            while (true) {
                int i11 = iB + i3;
                int i12 = iArr[i11];
                int i13 = i12 & i8;
                if (i13 == i9 && M2.a(obj, objArr[i11])) {
                    Object obj4 = objArr2[i11];
                    objArr2[i11] = obj2;
                    return obj4;
                }
                int i14 = i12 & iD;
                int i15 = i9;
                int i16 = i10 + 1;
                if (i14 == 0) {
                    if (i16 < 9) {
                        if (i6 <= iD) {
                            iArr[i11] = (i6 & iD) | i13;
                            break;
                        }
                        iD = f(iD, (iD + 1) * (iD < 32 ? 4 : 2), iA, i5);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                    int i17 = isEmpty() ? -1 : 0;
                    while (i17 >= 0) {
                        Object[] objArr3 = this.f4274f;
                        objArr3.getClass();
                        Object obj5 = objArr3[i17];
                        Object[] objArr4 = this.f4275g;
                        objArr4.getClass();
                        linkedHashMap.put(obj5, objArr4[i17]);
                        int i18 = i17 + 1;
                        i17 = i18 < this.f4277i ? i18 : -1;
                    }
                    this.f4273d = linkedHashMap;
                    this.e = null;
                    this.f4274f = null;
                    this.f4275g = null;
                    this.f4276h += 32;
                    return linkedHashMap.put(obj, obj2);
                }
                iB = i14;
                i10 = i16;
                i9 = i15;
                i3 = -1;
            }
        } else if (i6 > iD) {
            iD = f(iD, (iD + 1) * (iD < 32 ? 4 : 2), iA, i5);
        } else {
            Object obj6 = this.f4273d;
            obj6.getClass();
            J2.d(obj6, i7, i6);
        }
        int[] iArr2 = this.e;
        iArr2.getClass();
        int length = iArr2.length;
        if (i6 > length && (iMin = Math.min(1073741823, 1 | (Math.max(1, length >>> 1) + length))) != length) {
            int[] iArr3 = this.e;
            iArr3.getClass();
            this.e = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.f4274f;
            objArr5.getClass();
            this.f4274f = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.f4275g;
            objArr6.getClass();
            this.f4275g = Arrays.copyOf(objArr6, iMin);
        }
        int[] iArr4 = this.e;
        iArr4.getClass();
        iArr4[i5] = (~iD) & iA;
        Object[] objArr7 = this.f4274f;
        objArr7.getClass();
        objArr7[i5] = obj;
        Object[] objArr8 = this.f4275g;
        objArr8.getClass();
        objArr8[i5] = obj2;
        this.f4277i = i6;
        this.f4276h += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapA = a();
        if (mapA != null) {
            return mapA.remove(obj);
        }
        Object objG = g(obj);
        if (objG == f4272m) {
            return null;
        }
        return objG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapA = a();
        return mapA != null ? mapA.size() : this.f4277i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0647o c0647o = this.f4280l;
        if (c0647o != null) {
            return c0647o;
        }
        C0647o c0647o2 = new C0647o(this);
        this.f4280l = c0647o2;
        return c0647o2;
    }
}
