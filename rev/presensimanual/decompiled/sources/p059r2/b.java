package p059r2;

import A0.c;
import B2.h;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractList implements List {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object[] f5620g = new Object[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5621d;
    public Object[] e = f5620g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5622f;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int length;
        int i4 = this.f5622f;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(c.h("index: ", i3, ", size: ", i4));
        }
        if (i3 == i4) {
            addLast(obj);
            return;
        }
        if (i3 == 0) {
            addFirst(obj);
            return;
        }
        i();
        d(this.f5622f + 1);
        int iH = h(this.f5621d + i3);
        int i5 = this.f5622f;
        if (i3 < ((i5 + 1) >> 1)) {
            if (iH == 0) {
                Object[] objArr = this.e;
                h.e(objArr, "<this>");
                iH = objArr.length;
            }
            int i6 = iH - 1;
            int i7 = this.f5621d;
            if (i7 == 0) {
                Object[] objArr2 = this.e;
                h.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i7 - 1;
            }
            int i8 = this.f5621d;
            if (i6 >= i8) {
                Object[] objArr3 = this.e;
                objArr3[length] = objArr3[i8];
                c.b(objArr3, objArr3, i8, i8 + 1, i6 + 1);
            } else {
                Object[] objArr4 = this.e;
                c.b(objArr4, objArr4, i8 - 1, i8, objArr4.length);
                Object[] objArr5 = this.e;
                objArr5[objArr5.length - 1] = objArr5[0];
                c.b(objArr5, objArr5, 0, 1, i6 + 1);
            }
            this.e[i6] = obj;
            this.f5621d = length;
        } else {
            int iH2 = h(this.f5621d + i5);
            if (iH < iH2) {
                Object[] objArr6 = this.e;
                c.b(objArr6, objArr6, iH + 1, iH, iH2);
            } else {
                Object[] objArr7 = this.e;
                c.b(objArr7, objArr7, 1, 0, iH2);
                Object[] objArr8 = this.e;
                objArr8[0] = objArr8[objArr8.length - 1];
                c.b(objArr8, objArr8, iH + 1, iH, objArr8.length - 1);
            }
            this.e[iH] = obj;
        }
        this.f5622f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        h.e(collection, "elements");
        int i4 = this.f5622f;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(c.h("index: ", i3, ", size: ", i4));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i3 == this.f5622f) {
            return addAll(collection);
        }
        i();
        d(collection.size() + this.f5622f);
        int iH = h(this.f5621d + this.f5622f);
        int iH2 = h(this.f5621d + i3);
        int size = collection.size();
        if (i3 < ((this.f5622f + 1) >> 1)) {
            int i5 = this.f5621d;
            int length = i5 - size;
            if (iH2 < i5) {
                Object[] objArr = this.e;
                c.b(objArr, objArr, length, i5, objArr.length);
                if (size >= iH2) {
                    Object[] objArr2 = this.e;
                    c.b(objArr2, objArr2, objArr2.length - size, 0, iH2);
                } else {
                    Object[] objArr3 = this.e;
                    c.b(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.e;
                    c.b(objArr4, objArr4, 0, size, iH2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.e;
                c.b(objArr5, objArr5, length, i5, iH2);
            } else {
                Object[] objArr6 = this.e;
                length += objArr6.length;
                int i6 = iH2 - i5;
                int length2 = objArr6.length - length;
                if (length2 >= i6) {
                    c.b(objArr6, objArr6, length, i5, iH2);
                } else {
                    c.b(objArr6, objArr6, length, i5, i5 + length2);
                    Object[] objArr7 = this.e;
                    c.b(objArr7, objArr7, 0, this.f5621d + length2, iH2);
                }
            }
            this.f5621d = length;
            c(f(iH2 - size), collection);
        } else {
            int i7 = iH2 + size;
            if (iH2 < iH) {
                int i8 = size + iH;
                Object[] objArr8 = this.e;
                if (i8 <= objArr8.length) {
                    c.b(objArr8, objArr8, i7, iH2, iH);
                } else if (i7 >= objArr8.length) {
                    c.b(objArr8, objArr8, i7 - objArr8.length, iH2, iH);
                } else {
                    int length3 = iH - (i8 - objArr8.length);
                    c.b(objArr8, objArr8, 0, length3, iH);
                    Object[] objArr9 = this.e;
                    c.b(objArr9, objArr9, i7, iH2, length3);
                }
            } else {
                Object[] objArr10 = this.e;
                c.b(objArr10, objArr10, size, 0, iH);
                Object[] objArr11 = this.e;
                if (i7 >= objArr11.length) {
                    c.b(objArr11, objArr11, i7 - objArr11.length, iH2, objArr11.length);
                } else {
                    c.b(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.e;
                    c.b(objArr12, objArr12, i7, iH2, objArr12.length - size);
                }
            }
            c(iH2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        i();
        d(this.f5622f + 1);
        int length = this.f5621d;
        if (length == 0) {
            Object[] objArr = this.e;
            h.e(objArr, "<this>");
            length = objArr.length;
        }
        int i3 = length - 1;
        this.f5621d = i3;
        this.e[i3] = obj;
        this.f5622f++;
    }

    public final void addLast(Object obj) {
        i();
        d(this.f5622f + 1);
        this.e[h(this.f5621d + this.f5622f)] = obj;
        this.f5622f++;
    }

    public final void c(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.e.length;
        while (i3 < length && it.hasNext()) {
            this.e[i3] = it.next();
            i3++;
        }
        int i4 = this.f5621d;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.e[i5] = it.next();
        }
        this.f5622f = collection.size() + this.f5622f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.f5621d, h(this.f5621d + this.f5622f));
        }
        this.f5621d = 0;
        this.f5622f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.e;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == f5620g) {
            if (i3 < 10) {
                i3 = 10;
            }
            this.e = new Object[i3];
            return;
        }
        int length = objArr.length;
        int i4 = length + (length >> 1);
        if (i4 - i3 < 0) {
            i4 = i3;
        }
        if (i4 - 2147483639 > 0) {
            i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i4];
        c.b(objArr, objArr2, 0, this.f5621d, objArr.length);
        Object[] objArr3 = this.e;
        int length2 = objArr3.length;
        int i5 = this.f5621d;
        c.b(objArr3, objArr2, length2 - i5, 0, i5);
        this.f5621d = 0;
        this.e = objArr2;
    }

    public final int e(int i3) {
        Object[] objArr = this.e;
        h.e(objArr, "<this>");
        if (i3 == objArr.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final int f(int i3) {
        return i3 < 0 ? i3 + this.e.length : i3;
    }

    public final void g(int i3, int i4) {
        if (i3 < i4) {
            Object[] objArr = this.e;
            h.e(objArr, "<this>");
            Arrays.fill(objArr, i3, i4, (Object) null);
        } else {
            Object[] objArr2 = this.e;
            Arrays.fill(objArr2, i3, objArr2.length, (Object) null);
            Object[] objArr3 = this.e;
            h.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i4, (Object) null);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int i4 = this.f5622f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(c.h("index: ", i3, ", size: ", i4));
        }
        return this.e[h(this.f5621d + i3)];
    }

    public final int h(int i3) {
        Object[] objArr = this.e;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i3;
        int iH = h(this.f5621d + this.f5622f);
        int length = this.f5621d;
        if (length < iH) {
            while (length < iH) {
                if (h.a(obj, this.e[length])) {
                    i3 = this.f5621d;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iH) {
            return -1;
        }
        int length2 = this.e.length;
        while (length < length2) {
            if (h.a(obj, this.e[length])) {
                i3 = this.f5621d;
            } else {
                length++;
            }
        }
        for (int i4 = 0; i4 < iH; i4++) {
            if (h.a(obj, this.e[i4])) {
                length = i4 + this.e.length;
                i3 = this.f5621d;
            }
        }
        return -1;
        return length - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f5622f == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int iH = h(this.f5621d + this.f5622f);
        int i4 = this.f5621d;
        if (i4 < iH) {
            length = iH - 1;
            if (i4 <= length) {
                while (!h.a(obj, this.e[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i3 = this.f5621d;
                return length - i3;
            }
            return -1;
        }
        if (i4 > iH) {
            for (int i5 = iH - 1; -1 < i5; i5--) {
                if (h.a(obj, this.e[i5])) {
                    length = i5 + this.e.length;
                    i3 = this.f5621d;
                    return length - i3;
                }
            }
            Object[] objArr = this.e;
            h.e(objArr, "<this>");
            length = objArr.length - 1;
            int i6 = this.f5621d;
            if (i6 <= length) {
                while (!h.a(obj, this.e[length])) {
                    if (length != i6) {
                        length--;
                    }
                }
                i3 = this.f5621d;
                return length - i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        int i4 = this.f5622f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(c.h("index: ", i3, ", size: ", i4));
        }
        if (i3 == size() - 1) {
            return removeLast();
        }
        if (i3 == 0) {
            return removeFirst();
        }
        i();
        int iH = h(this.f5621d + i3);
        Object[] objArr = this.e;
        Object obj = objArr[iH];
        if (i3 < (this.f5622f >> 1)) {
            int i5 = this.f5621d;
            if (iH >= i5) {
                c.b(objArr, objArr, i5 + 1, i5, iH);
            } else {
                c.b(objArr, objArr, 1, 0, iH);
                Object[] objArr2 = this.e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.f5621d;
                c.b(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
            }
            Object[] objArr3 = this.e;
            int i7 = this.f5621d;
            objArr3[i7] = null;
            this.f5621d = e(i7);
        } else {
            int iH2 = h((size() - 1) + this.f5621d);
            if (iH <= iH2) {
                Object[] objArr4 = this.e;
                c.b(objArr4, objArr4, iH, iH + 1, iH2 + 1);
            } else {
                Object[] objArr5 = this.e;
                c.b(objArr5, objArr5, iH, iH + 1, objArr5.length);
                Object[] objArr6 = this.e;
                objArr6[objArr6.length - 1] = objArr6[0];
                c.b(objArr6, objArr6, 0, 1, iH2 + 1);
            }
            this.e[iH2] = null;
        }
        this.f5622f--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iH;
        h.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.e.length != 0) {
            int iH2 = h(this.f5621d + this.f5622f);
            int i3 = this.f5621d;
            if (i3 < iH2) {
                iH = i3;
                while (i3 < iH2) {
                    Object obj = this.e[i3];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.e[iH] = obj;
                        iH++;
                    }
                    i3++;
                }
                Object[] objArr = this.e;
                h.e(objArr, "<this>");
                Arrays.fill(objArr, iH, iH2, (Object) null);
            } else {
                int length = this.e.length;
                int i4 = i3;
                boolean z3 = false;
                while (i3 < length) {
                    Object[] objArr2 = this.e;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.e[i4] = obj2;
                        i4++;
                    }
                    i3++;
                }
                iH = h(i4);
                for (int i5 = 0; i5 < iH2; i5++) {
                    Object[] objArr3 = this.e;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.e[iH] = obj3;
                        iH = e(iH);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                i();
                this.f5622f = f(iH - this.f5621d);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.e;
        int i3 = this.f5621d;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f5621d = e(i3);
        this.f5622f--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int iH = h((size() - 1) + this.f5621d);
        Object[] objArr = this.e;
        Object obj = objArr[iH];
        objArr[iH] = null;
        this.f5622f--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        int i5 = this.f5622f;
        if (i3 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
        }
        if (i3 > i4) {
            throw new IllegalArgumentException(c.h("fromIndex: ", i3, " > toIndex: ", i4));
        }
        int i6 = i4 - i3;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.f5622f) {
            clear();
            return;
        }
        if (i6 == 1) {
            remove(i3);
            return;
        }
        i();
        if (i3 < this.f5622f - i4) {
            int iH = h((i3 - 1) + this.f5621d);
            int iH2 = h((i4 - 1) + this.f5621d);
            while (i3 > 0) {
                int i7 = iH + 1;
                int iMin = Math.min(i3, Math.min(i7, iH2 + 1));
                Object[] objArr = this.e;
                int i8 = iH2 - iMin;
                int i9 = iH - iMin;
                c.b(objArr, objArr, i8 + 1, i9 + 1, i7);
                iH = f(i9);
                iH2 = f(i8);
                i3 -= iMin;
            }
            int iH3 = h(this.f5621d + i6);
            g(this.f5621d, iH3);
            this.f5621d = iH3;
        } else {
            int iH4 = h(this.f5621d + i4);
            int iH5 = h(this.f5621d + i3);
            int i10 = this.f5622f;
            while (true) {
                i10 -= i4;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.e;
                i4 = Math.min(i10, Math.min(objArr2.length - iH4, objArr2.length - iH5));
                Object[] objArr3 = this.e;
                int i11 = iH4 + i4;
                c.b(objArr3, objArr3, iH5, iH4, i11);
                iH4 = h(i11);
                iH5 = h(iH5 + i4);
            }
            int iH6 = h(this.f5621d + this.f5622f);
            g(f(iH6 - i6), iH6);
        }
        this.f5622f -= i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iH;
        h.e(collection, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.e.length != 0) {
            int iH2 = h(this.f5621d + this.f5622f);
            int i3 = this.f5621d;
            if (i3 < iH2) {
                iH = i3;
                while (i3 < iH2) {
                    Object obj = this.e[i3];
                    if (collection.contains(obj)) {
                        this.e[iH] = obj;
                        iH++;
                    } else {
                        z2 = true;
                    }
                    i3++;
                }
                Object[] objArr = this.e;
                h.e(objArr, "<this>");
                Arrays.fill(objArr, iH, iH2, (Object) null);
            } else {
                int length = this.e.length;
                int i4 = i3;
                boolean z3 = false;
                while (i3 < length) {
                    Object[] objArr2 = this.e;
                    Object obj2 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj2)) {
                        this.e[i4] = obj2;
                        i4++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                iH = h(i4);
                for (int i5 = 0; i5 < iH2; i5++) {
                    Object[] objArr3 = this.e;
                    Object obj3 = objArr3[i5];
                    objArr3[i5] = null;
                    if (collection.contains(obj3)) {
                        this.e[iH] = obj3;
                        iH = e(iH);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                i();
                this.f5622f = f(iH - this.f5621d);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        int i4 = this.f5622f;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(c.h("index: ", i3, ", size: ", i4));
        }
        int iH = h(this.f5621d + i3);
        Object[] objArr = this.e;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5622f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f5622f]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        h.e(objArr, "array");
        int length = objArr.length;
        int i3 = this.f5622f;
        if (length < i3) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i3);
            h.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iH = h(this.f5621d + this.f5622f);
        int i4 = this.f5621d;
        if (i4 < iH) {
            c.b(this.e, objArr, 0, i4, iH);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.e;
            c.b(objArr2, objArr, 0, this.f5621d, objArr2.length);
            Object[] objArr3 = this.e;
            c.b(objArr3, objArr, objArr3.length - this.f5621d, 0, iH);
        }
        int i5 = this.f5622f;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        h.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        i();
        d(collection.size() + this.f5622f);
        c(h(this.f5621d + this.f5622f), collection);
        return true;
    }
}
