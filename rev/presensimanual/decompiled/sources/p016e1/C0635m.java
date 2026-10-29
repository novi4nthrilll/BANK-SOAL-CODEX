package p016e1;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.J2;
import p013d1.M2;

/* JADX INFO: renamed from: e1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0635m extends AbstractSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4243d;
    public final /* synthetic */ C0653p e;

    public /* synthetic */ C0635m(C0653p c0653p, int i3) {
        this.f4243d = i3;
        this.e = c0653p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f4243d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.e.clear();
                break;
            default:
                this.e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f4243d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                C0653p c0653p = this.e;
                Map mapA = c0653p.a();
                if (mapA != null) {
                    return mapA.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = c0653p.e(entry.getKey());
                    if (iE != -1) {
                        Object[] objArr = c0653p.f4275g;
                        objArr.getClass();
                        if (M2.a(objArr[iE], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4243d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                C0653p c0653p = this.e;
                Map mapA = c0653p.a();
                return mapA != null ? mapA.entrySet().iterator() : new C0629l(c0653p, 1);
            default:
                C0653p c0653p2 = this.e;
                Map mapA2 = c0653p2.a();
                return mapA2 != null ? mapA2.keySet().iterator() : new C0629l(c0653p2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f4243d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                C0653p c0653p = this.e;
                Map mapA = c0653p.a();
                if (mapA != null) {
                    return mapA.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0653p.c()) {
                        int iD = c0653p.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0653p.f4273d;
                        obj2.getClass();
                        int[] iArr = c0653p.e;
                        iArr.getClass();
                        Object[] objArr = c0653p.f4274f;
                        objArr.getClass();
                        Object[] objArr2 = c0653p.f4275g;
                        objArr2.getClass();
                        int iA = J2.a(key, value, iD, obj2, iArr, objArr, objArr2);
                        if (iA != -1) {
                            c0653p.b(iA, iD);
                            c0653p.f4277i--;
                            c0653p.f4276h += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C0653p c0653p2 = this.e;
                Map mapA2 = c0653p2.a();
                if (mapA2 != null) {
                    return mapA2.keySet().remove(obj);
                }
                return c0653p2.g(obj) != C0653p.f4272m;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4243d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                break;
        }
        return this.e.size();
    }
}
