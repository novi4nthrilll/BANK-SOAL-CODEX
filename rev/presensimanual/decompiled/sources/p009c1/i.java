package p009c1;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient l f2654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient Object[] f2655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f2656h;

    public i(l lVar, Object[] objArr, int i3) {
        this.f2654f = lVar;
        this.f2655g = objArr;
        this.f2656h = i3;
    }

    @Override // p009c1.a
    public final int c(Object[] objArr) {
        d hVar = this.e;
        if (hVar == null) {
            hVar = new h(this);
            this.e = hVar;
        }
        return hVar.c(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f2654f.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        d hVar = this.e;
        if (hVar == null) {
            hVar = new h(this);
            this.e = hVar;
        }
        return hVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2656h;
    }
}
