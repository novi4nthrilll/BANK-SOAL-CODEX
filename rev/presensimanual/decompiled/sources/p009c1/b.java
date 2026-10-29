package p009c1;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p006b1.t;
import p013d1.B2;

/* JADX INFO: loaded from: classes.dex */
public final class b extends t implements ListIterator {
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f2643g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i3) {
        super(1);
        int size = dVar.size();
        B2.b(i3, size);
        this.e = size;
        this.f2642f = i3;
        this.f2643g = dVar;
    }

    public final Object a(int i3) {
        return this.f2643g.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f2642f < this.e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2642f > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2642f;
        this.f2642f = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2642f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2642f - 1;
        this.f2642f = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2642f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
