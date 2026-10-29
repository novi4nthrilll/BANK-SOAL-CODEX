package p006b1;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p013d1.AbstractC0555y2;

/* JADX INFO: loaded from: classes.dex */
public final class p extends t implements ListIterator {
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f2548g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, int i3) {
        super(0);
        int size = rVar.size();
        if (i3 < 0 || i3 > size) {
            throw new IndexOutOfBoundsException(AbstractC0555y2.c("index", i3, size));
        }
        this.e = size;
        this.f2547f = i3;
        this.f2548g = rVar;
    }

    public final Object a(int i3) {
        return this.f2548g.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f2547f < this.e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2547f > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2547f;
        this.f2547f = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2547f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2547f - 1;
        this.f2547f = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2547f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
