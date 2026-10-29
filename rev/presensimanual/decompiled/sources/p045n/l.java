package p045n;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Object[] f5384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f5385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Object[] f5386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f5387j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f5388d = d.f5362a;
    public Object[] e = d.f5363b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5389f = 0;

    public static void b(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (l.class) {
                try {
                    if (f5387j < 10) {
                        objArr[0] = f5386i;
                        objArr[1] = iArr;
                        for (int i4 = (i3 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f5386i = objArr;
                        f5387j++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (l.class) {
                try {
                    if (f5385h < 10) {
                        objArr[0] = f5384g;
                        objArr[1] = iArr;
                        for (int i5 = (i3 << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f5384g = objArr;
                        f5385h++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(int i3) {
        if (i3 == 8) {
            synchronized (l.class) {
                try {
                    Object[] objArr = f5386i;
                    if (objArr != null) {
                        this.e = objArr;
                        f5386i = (Object[]) objArr[0];
                        this.f5388d = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f5387j--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i3 == 4) {
            synchronized (l.class) {
                try {
                    Object[] objArr2 = f5384g;
                    if (objArr2 != null) {
                        this.e = objArr2;
                        f5384g = (Object[]) objArr2[0];
                        this.f5388d = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f5385h--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f5388d = new int[i3];
        this.e = new Object[i3 << 1];
    }

    public final int c(int i3, Object obj) {
        int i4 = this.f5389f;
        if (i4 == 0) {
            return -1;
        }
        try {
            int iA = d.a(i4, i3, this.f5388d);
            if (iA < 0 || obj.equals(this.e[iA << 1])) {
                return iA;
            }
            int i5 = iA + 1;
            while (i5 < i4 && this.f5388d[i5] == i3) {
                if (obj.equals(this.e[i5 << 1])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = iA - 1; i6 >= 0 && this.f5388d[i6] == i3; i6--) {
                if (obj.equals(this.e[i6 << 1])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i3 = this.f5389f;
        if (i3 > 0) {
            int[] iArr = this.f5388d;
            Object[] objArr = this.e;
            this.f5388d = d.f5362a;
            this.e = d.f5363b;
            this.f5389f = 0;
            b(iArr, objArr, i3);
        }
        if (this.f5389f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return f(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i3 = this.f5389f;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iA = d.a(i3, 0, this.f5388d);
            if (iA < 0 || this.e[iA << 1] == null) {
                return iA;
            }
            int i4 = iA + 1;
            while (i4 < i3 && this.f5388d[i4] == 0) {
                if (this.e[i4 << 1] == null) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iA - 1; i5 >= 0 && this.f5388d[i5] == 0; i5--) {
                if (this.e[i5 << 1] == null) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f5389f != lVar.f5389f) {
                return false;
            }
            for (int i3 = 0; i3 < this.f5389f; i3++) {
                try {
                    Object objG = g(i3);
                    Object objI = i(i3);
                    Object orDefault = lVar.getOrDefault(objG, null);
                    if (objI == null) {
                        if (orDefault != null || !lVar.containsKey(objG)) {
                            return false;
                        }
                    } else if (!objI.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f5389f != map.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f5389f; i4++) {
                try {
                    Object objG2 = g(i4);
                    Object objI2 = i(i4);
                    Object obj2 = map.get(objG2);
                    if (objI2 == null) {
                        if (obj2 != null || !map.containsKey(objG2)) {
                            return false;
                        }
                    } else if (!objI2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        int i3 = this.f5389f * 2;
        Object[] objArr = this.e;
        if (obj == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public final Object g(int i3) {
        return this.e[i3 << 1];
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.e[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i3) {
        Object[] objArr = this.e;
        int i4 = i3 << 1;
        Object obj = objArr[i4 + 1];
        int i5 = this.f5389f;
        int i6 = 0;
        if (i5 <= 1) {
            b(this.f5388d, objArr, i5);
            this.f5388d = d.f5362a;
            this.e = d.f5363b;
        } else {
            int i7 = i5 - 1;
            int[] iArr = this.f5388d;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i3 < i7) {
                    int i8 = i3 + 1;
                    int i9 = i7 - i3;
                    System.arraycopy(iArr, i8, iArr, i3, i9);
                    Object[] objArr2 = this.e;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i4, i9 << 1);
                }
                Object[] objArr3 = this.e;
                int i10 = i7 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                a(i5 > 8 ? i5 + (i5 >> 1) : 8);
                if (i5 != this.f5389f) {
                    throw new ConcurrentModificationException();
                }
                if (i3 > 0) {
                    System.arraycopy(iArr, 0, this.f5388d, 0, i3);
                    System.arraycopy(objArr, 0, this.e, 0, i4);
                }
                if (i3 < i7) {
                    int i11 = i3 + 1;
                    int i12 = i7 - i3;
                    System.arraycopy(iArr, i11, this.f5388d, i3, i12);
                    System.arraycopy(objArr, i11 << 1, this.e, i4, i12 << 1);
                }
            }
            i6 = i7;
        }
        if (i5 != this.f5389f) {
            throw new ConcurrentModificationException();
        }
        this.f5389f = i6;
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f5388d;
        Object[] objArr = this.e;
        int i3 = this.f5389f;
        int i4 = 1;
        int i5 = 0;
        int iHashCode = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i3) {
        return this.e[(i3 << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f5389f <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i3;
        int iC;
        int i4 = this.f5389f;
        if (obj == null) {
            iC = e();
            i3 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i3 = iHashCode;
            iC = c(iHashCode, obj);
        }
        if (iC >= 0) {
            int i5 = (iC << 1) + 1;
            Object[] objArr = this.e;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~iC;
        int[] iArr = this.f5388d;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            Object[] objArr2 = this.e;
            a(i7);
            if (i4 != this.f5389f) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f5388d;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.e, 0, objArr2.length);
            }
            b(iArr, objArr2, i4);
        }
        if (i6 < i4) {
            int[] iArr3 = this.f5388d;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.e;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.f5389f - i6) << 1);
        }
        int i9 = this.f5389f;
        if (i4 == i9) {
            int[] iArr4 = this.f5388d;
            if (i6 < iArr4.length) {
                iArr4[i6] = i3;
                Object[] objArr4 = this.e;
                int i10 = i6 << 1;
                objArr4[i10] = obj;
                objArr4[i10 + 1] = obj2;
                this.f5389f = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0) {
            return null;
        }
        int i3 = (iD << 1) + 1;
        Object[] objArr = this.e;
        Object obj3 = objArr[i3];
        objArr[i3] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f5389f;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5389f * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f5389f; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objG = g(i3);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i3);
            if (objI != this) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0) {
            return false;
        }
        Object objI = i(iD);
        if (obj2 != objI && (obj2 == null || !obj2.equals(objI))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0) {
            return false;
        }
        Object objI = i(iD);
        if (objI != obj2 && (obj2 == null || !obj2.equals(objI))) {
            return false;
        }
        int i3 = (iD << 1) + 1;
        Object[] objArr = this.e;
        Object obj4 = objArr[i3];
        objArr[i3] = obj3;
        return true;
    }
}
