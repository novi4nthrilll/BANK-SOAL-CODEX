package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0220h implements ListIterator, Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3075d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC0240j f3076f;

    public C0220h(AbstractC0240j abstractC0240j, int i3) {
        int size = abstractC0240j.size();
        if (i3 < 0 || i3 > size) {
            throw new IndexOutOfBoundsException(C.c("index", i3, size));
        }
        this.f3075d = size;
        this.e = i3;
        this.f3076f = abstractC0240j;
    }

    public final Object a(int i3) {
        return this.f3076f.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.f3075d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.e;
        this.e = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.e - 1;
        this.e = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
