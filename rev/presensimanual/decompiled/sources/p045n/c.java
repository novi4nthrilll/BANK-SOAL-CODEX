package p045n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Collection, Set {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f5353h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f5354i = new Object[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Object[] f5355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f5356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Object[] f5357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f5358m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f5359d;
    public Object[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f5361g;

    public c(int i3) {
        if (i3 == 0) {
            this.f5359d = f5353h;
            this.e = f5354i;
        } else {
            c(i3);
        }
        this.f5360f = 0;
    }

    public static void d(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (f5358m < 10) {
                        objArr[0] = f5357l;
                        objArr[1] = iArr;
                        for (int i4 = i3 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f5357l = objArr;
                        f5358m++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (f5356k < 10) {
                        objArr[0] = f5355j;
                        objArr[1] = iArr;
                        for (int i5 = i3 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f5355j = objArr;
                        f5356k++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i3;
        int iE;
        if (obj == null) {
            iE = f();
            i3 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i3 = iHashCode;
            iE = e(iHashCode, obj);
        }
        if (iE >= 0) {
            return false;
        }
        int i4 = ~iE;
        int i5 = this.f5360f;
        int[] iArr = this.f5359d;
        if (i5 >= iArr.length) {
            int i6 = 8;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.e;
            c(i6);
            int[] iArr2 = this.f5359d;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.e, 0, objArr.length);
            }
            d(iArr, objArr, this.f5360f);
        }
        int i7 = this.f5360f;
        if (i4 < i7) {
            int[] iArr3 = this.f5359d;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.e;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f5360f - i4);
        }
        this.f5359d[i4] = i3;
        this.e[i4] = obj;
        this.f5360f++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f5360f;
        int[] iArr = this.f5359d;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.e;
            c(size);
            int i3 = this.f5360f;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f5359d, 0, i3);
                System.arraycopy(objArr, 0, this.e, 0, this.f5360f);
            }
            d(iArr, objArr, this.f5360f);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void c(int i3) {
        if (i3 == 8) {
            synchronized (c.class) {
                try {
                    Object[] objArr = f5357l;
                    if (objArr != null) {
                        this.e = objArr;
                        f5357l = (Object[]) objArr[0];
                        this.f5359d = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f5358m--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i3 == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f5355j;
                    if (objArr2 != null) {
                        this.e = objArr2;
                        f5355j = (Object[]) objArr2[0];
                        this.f5359d = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f5356k--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f5359d = new int[i3];
        this.e = new Object[i3];
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i3 = this.f5360f;
        if (i3 != 0) {
            d(this.f5359d, this.e, i3);
            this.f5359d = f5353h;
            this.e = f5354i;
            this.f5360f = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int e(int i3, Object obj) {
        int i4 = this.f5360f;
        if (i4 == 0) {
            return -1;
        }
        int iA = d.a(i4, i3, this.f5359d);
        if (iA < 0 || obj.equals(this.e[iA])) {
            return iA;
        }
        int i5 = iA + 1;
        while (i5 < i4 && this.f5359d[i5] == i3) {
            if (obj.equals(this.e[i5])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iA - 1; i6 >= 0 && this.f5359d[i6] == i3; i6--) {
            if (obj.equals(this.e[i6])) {
                return i6;
            }
        }
        return ~i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f5360f != set.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f5360f; i3++) {
                try {
                    if (!set.contains(this.e[i3])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i3 = this.f5360f;
        if (i3 == 0) {
            return -1;
        }
        int iA = d.a(i3, 0, this.f5359d);
        if (iA < 0 || this.e[iA] == null) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.f5359d[i4] == 0) {
            if (this.e[i4] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.f5359d[i5] == 0; i5--) {
            if (this.e[i5] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public final void g(int i3) {
        Object[] objArr = this.e;
        Object obj = objArr[i3];
        int i4 = this.f5360f;
        if (i4 <= 1) {
            d(this.f5359d, objArr, i4);
            this.f5359d = f5353h;
            this.e = f5354i;
            this.f5360f = 0;
            return;
        }
        int[] iArr = this.f5359d;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            int i5 = i4 - 1;
            this.f5360f = i5;
            if (i3 < i5) {
                int i6 = i3 + 1;
                System.arraycopy(iArr, i6, iArr, i3, i5 - i3);
                Object[] objArr2 = this.e;
                System.arraycopy(objArr2, i6, objArr2, i3, this.f5360f - i3);
            }
            this.e[this.f5360f] = null;
            return;
        }
        c(i4 > 8 ? i4 + (i4 >> 1) : 8);
        this.f5360f--;
        if (i3 > 0) {
            System.arraycopy(iArr, 0, this.f5359d, 0, i3);
            System.arraycopy(objArr, 0, this.e, 0, i3);
        }
        int i7 = this.f5360f;
        if (i3 < i7) {
            int i8 = i3 + 1;
            System.arraycopy(iArr, i8, this.f5359d, i3, i7 - i3);
            System.arraycopy(objArr, i8, this.e, i3, this.f5360f - i3);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f5359d;
        int i3 = this.f5360f;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    public final int indexOf(Object obj) {
        return obj == null ? f() : e(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5360f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f5361g == null) {
            this.f5361g = new a(1, this);
        }
        a aVar = this.f5361g;
        if (((h) aVar.f5382b) == null) {
            aVar.f5382b = new h(aVar, 1);
        }
        return ((h) aVar.f5382b).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        g(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int i3 = this.f5360f - 1; i3 >= 0; i3--) {
            if (!collection.contains(this.e[i3])) {
                g(i3);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f5360f;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i3 = this.f5360f;
        Object[] objArr = new Object[i3];
        System.arraycopy(this.e, 0, objArr, 0, i3);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5360f * 14);
        sb.append('{');
        for (int i3 = 0; i3 < this.f5360f; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.e[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f5360f) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f5360f);
        }
        System.arraycopy(this.e, 0, objArr, 0, this.f5360f);
        int length = objArr.length;
        int i3 = this.f5360f;
        if (length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
