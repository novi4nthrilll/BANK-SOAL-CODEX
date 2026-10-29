package p016e1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: e1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0605h extends AbstractCollection implements List {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4203d;
    public Collection e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0605h f4204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Collection f4205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0623k f4206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0623k f4207i;

    public C0605h(C0623k c0623k, Object obj, List list, C0605h c0605h) {
        this.f4207i = c0623k;
        this.f4206h = c0623k;
        this.f4203d = obj;
        this.e = list;
        this.f4204f = c0605h;
        this.f4205g = c0605h == null ? null : c0605h.e;
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        d();
        boolean zIsEmpty = this.e.isEmpty();
        ((List) this.e).add(i3, obj);
        this.f4207i.f4225g++;
        if (zIsEmpty) {
            c();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.e).addAll(i3, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f4207i.f4225g += this.e.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        c();
        return true;
    }

    public final void c() {
        C0605h c0605h = this.f4204f;
        if (c0605h != null) {
            c0605h.c();
        } else {
            this.f4206h.f4224f.put(this.f4203d, this.e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.e.clear();
        this.f4206h.f4225g -= size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        d();
        return this.e.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        d();
        return this.e.containsAll(collection);
    }

    public final void d() {
        Collection collection;
        C0605h c0605h = this.f4204f;
        if (c0605h != null) {
            c0605h.d();
            if (c0605h.e != this.f4205g) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.e.isEmpty() || (collection = (Collection) this.f4206h.f4224f.get(this.f4203d)) == null) {
                return;
            }
            this.e = collection;
        }
    }

    public final void e() {
        C0605h c0605h = this.f4204f;
        if (c0605h != null) {
            c0605h.e();
        } else if (this.e.isEmpty()) {
            this.f4206h.f4224f.remove(this.f4203d);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        d();
        return this.e.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        d();
        return ((List) this.e).get(i3);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        d();
        return this.e.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        d();
        return ((List) this.e).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        d();
        return new C0575c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d();
        return ((List) this.e).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        d();
        return new C0599g(this);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        d();
        Object objRemove = ((List) this.e).remove(i3);
        this.f4207i.f4225g--;
        e();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.e.removeAll(collection);
        if (zRemoveAll) {
            this.f4206h.f4225g += this.e.size() - size;
            e();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.e.retainAll(collection);
        if (zRetainAll) {
            this.f4206h.f4225g += this.e.size() - size;
            e();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        d();
        return ((List) this.e).set(i3, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        d();
        return this.e.size();
    }

    @Override // java.util.List
    public final List subList(int i3, int i4) {
        d();
        List listSubList = ((List) this.e).subList(i3, i4);
        C0605h c0605h = this.f4204f;
        if (c0605h == null) {
            c0605h = this;
        }
        C0623k c0623k = this.f4207i;
        c0623k.getClass();
        boolean z2 = listSubList instanceof RandomAccess;
        Object obj = this.f4203d;
        return z2 ? new C0593f(c0623k, obj, listSubList, c0605h) : new C0605h(c0623k, obj, listSubList, c0605h);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        d();
        return this.e.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        d();
        return new C0599g(this, i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        boolean zRemove = this.e.remove(obj);
        if (zRemove) {
            this.f4206h.f4225g--;
            e();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        boolean zIsEmpty = this.e.isEmpty();
        boolean zAdd = this.e.add(obj);
        if (zAdd) {
            this.f4206h.f4225g++;
            if (zIsEmpty) {
                c();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.e.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f4206h.f4225g += this.e.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        c();
        return true;
    }
}
