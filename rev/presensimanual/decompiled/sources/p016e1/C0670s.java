package p016e1;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p006b1.t;
import p013d1.H2;

/* JADX INFO: renamed from: e1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0670s extends t implements ListIterator {
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC0682u f4302g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0670s(AbstractC0682u abstractC0682u, int i3) {
        super(3);
        int size = abstractC0682u.size();
        if (i3 < 0 || i3 > size) {
            throw new IndexOutOfBoundsException(H2.c("index", i3, size));
        }
        this.e = size;
        this.f4301f = i3;
        this.f4302g = abstractC0682u;
    }

    public final Object a(int i3) {
        return this.f4302g.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f4301f < this.e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4301f > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f4301f;
        this.f4301f = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4301f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f4301f - 1;
        this.f4301f = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4301f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
