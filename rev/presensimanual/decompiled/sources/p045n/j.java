package p045n;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Collection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f5380d;

    public j(k kVar) {
        this.f5380d = kVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f5380d.b();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5380d.g(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5380d.e() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.f5380d, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        k kVar = this.f5380d;
        int iG = kVar.g(obj);
        if (iG < 0) {
            return false;
        }
        kVar.i(iG);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        k kVar = this.f5380d;
        int iE = kVar.e();
        int i3 = 0;
        boolean z2 = false;
        while (i3 < iE) {
            if (collection.contains(kVar.c(i3, 1))) {
                kVar.i(i3);
                i3--;
                iE--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        k kVar = this.f5380d;
        int iE = kVar.e();
        int i3 = 0;
        boolean z2 = false;
        while (i3 < iE) {
            if (!collection.contains(kVar.c(i3, 1))) {
                kVar.i(i3);
                i3--;
                iE--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5380d.e();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        k kVar = this.f5380d;
        int iE = kVar.e();
        Object[] objArr = new Object[iE];
        for (int i3 = 0; i3 < iE; i3++) {
            objArr[i3] = kVar.c(i3, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f5380d.l(1, objArr);
    }
}
