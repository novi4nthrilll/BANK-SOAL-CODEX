package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class L8 extends V7 implements RandomAccess {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final L8 f2847g = new L8(new Object[0], 0, false);
    public Object[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2848f;

    public L8(Object[] objArr, int i3, boolean z2) {
        this.f2935d = z2;
        this.e = objArr;
        this.f2848f = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        c();
        if (i3 < 0 || i3 > (i4 = this.f2848f)) {
            throw new IndexOutOfBoundsException(A0.c.h("Index:", i3, ", Size:", this.f2848f));
        }
        int i5 = i3 + 1;
        Object[] objArr = this.e;
        if (i4 < objArr.length) {
            System.arraycopy(objArr, i3, objArr, i5, i4 - i3);
        } else {
            Object[] objArr2 = new Object[((i4 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i3);
            System.arraycopy(this.e, i3, objArr2, i5, this.f2848f - i3);
            this.e = objArr2;
        }
        this.e[i3] = obj;
        this.f2848f++;
        ((AbstractList) this).modCount++;
    }

    public final /* bridge */ /* synthetic */ L8 f(int i3) {
        if (i3 >= this.f2848f) {
            return new L8(Arrays.copyOf(this.e, i3), this.f2848f, true);
        }
        throw new IllegalArgumentException();
    }

    public final void g(int i3) {
        if (i3 < 0 || i3 >= this.f2848f) {
            throw new IndexOutOfBoundsException(A0.c.h("Index:", i3, ", Size:", this.f2848f));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        g(i3);
        return this.e[i3];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.V7, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        c();
        g(i3);
        Object[] objArr = this.e;
        Object obj = objArr[i3];
        int i4 = this.f2848f;
        if (i3 < i4 - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (i4 - i3) - 1);
        }
        this.f2848f--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        c();
        g(i3);
        Object[] objArr = this.e;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2848f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i3 = this.f2848f;
        Object[] objArr = this.e;
        if (i3 == objArr.length) {
            this.e = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.e;
        int i4 = this.f2848f;
        this.f2848f = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
