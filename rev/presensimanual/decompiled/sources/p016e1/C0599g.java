package p016e1;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: e1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0599g extends C0575c implements ListIterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0605h f4200h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0599g(C0605h c0605h) {
        super(c0605h);
        this.f4200h = c0605h;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0605h c0605h = this.f4200h;
        boolean zIsEmpty = c0605h.isEmpty();
        a();
        ((ListIterator) this.e).add(obj);
        c0605h.f4207i.f4225g++;
        if (zIsEmpty) {
            c0605h.c();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.e).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.e).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.e).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.e).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.e).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0599g(C0605h c0605h, int i3) {
        super(c0605h, ((List) c0605h.e).listIterator(i3));
        this.f4200h = c0605h;
    }
}
