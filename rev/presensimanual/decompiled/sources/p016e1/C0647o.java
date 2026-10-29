package p016e1;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.M2;

/* JADX INFO: renamed from: e1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0647o extends AbstractCollection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4267d = 1;
    public final AbstractMap e;

    public C0647o(C0581d c0581d) {
        this.e = c0581d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f4267d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((C0653p) this.e).clear();
                break;
            default:
                ((C0581d) this.e).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f4267d) {
            case 1:
                return ((C0581d) this.e).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f4267d) {
            case 1:
                return ((C0581d) this.e).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4267d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                C0653p c0653p = (C0653p) this.e;
                Map mapA = c0653p.a();
                return mapA != null ? mapA.values().iterator() : new C0629l(c0653p, 2);
            default:
                return new C0694w(((C0581d) this.e).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f4267d) {
            case 1:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0581d c0581d = (C0581d) this.e;
                    for (Map.Entry entry : c0581d.entrySet()) {
                        if (M2.a(obj, entry.getValue())) {
                            c0581d.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f4267d) {
            case 1:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0581d c0581d = (C0581d) this.e;
                    for (Map.Entry entry : c0581d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0581d.f4187g.b().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f4267d) {
            case 1:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0581d c0581d = (C0581d) this.e;
                    for (Map.Entry entry : c0581d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0581d.f4187g.b().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f4267d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return ((C0653p) this.e).size();
            default:
                return ((C0581d) this.e).size();
        }
    }

    public C0647o(C0653p c0653p) {
        this.e = c0653p;
    }
}
