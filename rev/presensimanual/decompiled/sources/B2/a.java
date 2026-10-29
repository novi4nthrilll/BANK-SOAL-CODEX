package B2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f108d;
    public int e;

    public a(Object[] objArr) {
        this.f108d = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.f108d.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f108d;
            int i3 = this.e;
            this.e = i3 + 1;
            return objArr[i3];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.e--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
