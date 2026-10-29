package p016e1;

import java.util.AbstractSet;
import java.util.Collection;
import p013d1.L2;

/* JADX INFO: loaded from: classes.dex */
public abstract class E extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return L2.a(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
