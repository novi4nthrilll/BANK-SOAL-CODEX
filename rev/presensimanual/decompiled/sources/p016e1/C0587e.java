package p016e1;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: e1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0587e extends E {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0653p f4190d;
    public final /* synthetic */ C0623k e;

    public C0587e(C0623k c0623k, C0653p c0653p) {
        this.e = c0623k;
        c0653p.getClass();
        this.f4190d = c0653p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0575c c0575c = (C0575c) it;
            if (!c0575c.hasNext()) {
                return;
            }
            c0575c.next();
            c0575c.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4190d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f4190d.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f4190d.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4190d.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4190d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0575c(this, this.f4190d.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f4190d.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.e.f4225g -= size;
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4190d.size();
    }
}
