package p045n;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Set {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5376d;
    public final /* synthetic */ k e;

    public /* synthetic */ h(k kVar, int i3) {
        this.f5376d = i3;
        this.e = kVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                k kVar = this.e;
                int iE = kVar.e();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    kVar.h(entry.getKey(), entry.getValue());
                }
                return iE != kVar.e();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.e.b();
                break;
            default:
                this.e.b();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                k kVar = this.e;
                int iF = kVar.f(key);
                if (iF < 0) {
                    return false;
                }
                Object objC = kVar.c(iF, 1);
                Object value = entry.getValue();
                return objC == value || (objC != null && objC.equals(value));
            default:
                return this.e.f(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Map mapD = this.e.d();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!mapD.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                break;
        }
        return k.k(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                k kVar = this.e;
                int iHashCode = 0;
                for (int iE = kVar.e() - 1; iE >= 0; iE--) {
                    Object objC = kVar.c(iE, 0);
                    Object objC2 = kVar.c(iE, 1);
                    iHashCode += (objC == null ? 0 : objC.hashCode()) ^ (objC2 == null ? 0 : objC2.hashCode());
                }
                return iHashCode;
            default:
                k kVar2 = this.e;
                int iHashCode2 = 0;
                for (int iE2 = kVar2.e() - 1; iE2 >= 0; iE2--) {
                    Object objC3 = kVar2.c(iE2, 0);
                    iHashCode2 += objC3 == null ? 0 : objC3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return this.e.e() == 0;
            default:
                return this.e.e() == 0;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return new i(this.e);
            default:
                return new g(this.e, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                throw new UnsupportedOperationException();
            default:
                k kVar = this.e;
                int iF = kVar.f(obj);
                if (iF < 0) {
                    return false;
                }
                kVar.i(iF);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                throw new UnsupportedOperationException();
            default:
                Map mapD = this.e.d();
                int size = mapD.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mapD.remove(it.next());
                }
                return size != mapD.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                throw new UnsupportedOperationException();
            default:
                Map mapD = this.e.d();
                int size = mapD.size();
                Iterator it = mapD.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != mapD.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                break;
        }
        return this.e.e();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                throw new UnsupportedOperationException();
            default:
                return this.e.l(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f5376d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                throw new UnsupportedOperationException();
            default:
                k kVar = this.e;
                int iE = kVar.e();
                Object[] objArr = new Object[iE];
                for (int i3 = 0; i3 < iE; i3++) {
                    objArr[i3] = kVar.c(i3, 0);
                }
                return objArr;
        }
    }
}
