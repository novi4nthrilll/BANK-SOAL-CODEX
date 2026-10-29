package p045n;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l implements Map {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f5352k;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f5352k == null) {
            this.f5352k = new a(0, this);
        }
        a aVar = this.f5352k;
        if (((h) aVar.f5381a) == null) {
            aVar.f5381a = new h(aVar, 0);
        }
        return (h) aVar.f5381a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f5352k == null) {
            this.f5352k = new a(0, this);
        }
        a aVar = this.f5352k;
        if (((h) aVar.f5382b) == null) {
            aVar.f5382b = new h(aVar, 1);
        }
        return (h) aVar.f5382b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f5389f;
        int i3 = this.f5389f;
        int[] iArr = this.f5388d;
        if (iArr.length < size) {
            Object[] objArr = this.e;
            a(size);
            if (this.f5389f > 0) {
                System.arraycopy(iArr, 0, this.f5388d, 0, i3);
                System.arraycopy(objArr, 0, this.e, 0, i3 << 1);
            }
            l.b(iArr, objArr, i3);
        }
        if (this.f5389f != i3) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f5352k == null) {
            this.f5352k = new a(0, this);
        }
        a aVar = this.f5352k;
        if (((j) aVar.f5383c) == null) {
            aVar.f5383c = new j(aVar);
        }
        return (j) aVar.f5383c;
    }
}
