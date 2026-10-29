package E2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f244d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f246g;

    public b(int i3, int i4, int i5) {
        this.f244d = i5;
        this.e = i4;
        boolean z2 = false;
        if (i5 <= 0 ? i3 >= i4 : i3 <= i4) {
            z2 = true;
        }
        this.f245f = z2;
        this.f246g = z2 ? i3 : i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f245f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f246g;
        if (i3 != this.e) {
            this.f246g = this.f244d + i3;
        } else {
            if (!this.f245f) {
                throw new NoSuchElementException();
            }
            this.f245f = false;
        }
        return Integer.valueOf(i3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
