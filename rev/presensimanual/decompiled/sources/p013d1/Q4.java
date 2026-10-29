package p013d1;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p006b1.t;

/* JADX INFO: loaded from: classes.dex */
public final class Q4 extends t implements ListIterator {
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S4 f3635g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(S4 s4, int i3) {
        super(2);
        int size = s4.size();
        if (i3 < 0 || i3 > size) {
            throw new IndexOutOfBoundsException(E2.c("index", i3, size));
        }
        this.e = size;
        this.f3634f = i3;
        this.f3635g = s4;
    }

    public final Object a(int i3) {
        return this.f3635g.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f3634f < this.e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3634f > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f3634f;
        this.f3634f = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3634f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f3634f - 1;
        this.f3634f = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3634f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
