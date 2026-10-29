package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends AbstractC0120b implements RandomAccess {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f2266g = new a0(new Object[0], 0, false);
    public Object[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2267f;

    public a0(Object[] objArr, int i3, boolean z2) {
        this.f2268d = z2;
        this.e = objArr;
        this.f2267f = i3;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i3 = this.f2267f;
        Object[] objArr = this.e;
        if (i3 == objArr.length) {
            this.e = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.e;
        int i4 = this.f2267f;
        this.f2267f = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i3) {
        if (i3 < 0 || i3 >= this.f2267f) {
            throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f2267f);
        }
    }

    public final a0 e(int i3) {
        if (i3 >= this.f2267f) {
            return new a0(Arrays.copyOf(this.e, i3), this.f2267f, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        d(i3);
        return this.e[i3];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0120b, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        c();
        d(i3);
        Object[] objArr = this.e;
        Object obj = objArr[i3];
        int i4 = this.f2267f;
        if (i3 < i4 - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (i4 - i3) - 1);
        }
        this.f2267f--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        c();
        d(i3);
        Object[] objArr = this.e;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2267f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        c();
        if (i3 >= 0 && i3 <= (i4 = this.f2267f)) {
            Object[] objArr = this.e;
            if (i4 < objArr.length) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, i4 - i3);
            } else {
                Object[] objArr2 = new Object[((i4 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(this.e, i3, objArr2, i3 + 1, this.f2267f - i3);
                this.e = objArr2;
            }
            this.e[i3] = obj;
            this.f2267f++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f2267f);
    }
}
