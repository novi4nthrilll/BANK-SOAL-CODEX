package p045n;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5377d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f5379g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5378f = false;
    public int e = -1;

    public i(k kVar) {
        this.f5379g = kVar;
        this.f5377d = kVar.e() - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f5378f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i3 = this.e;
        k kVar = this.f5379g;
        Object objC = kVar.c(i3, 0);
        if (key != objC && (key == null || !key.equals(objC))) {
            return false;
        }
        Object value = entry.getValue();
        Object objC2 = kVar.c(this.e, 1);
        return value == objC2 || (value != null && value.equals(objC2));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f5378f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f5379g.c(this.e, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f5378f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f5379g.c(this.e, 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.f5377d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f5378f) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i3 = this.e;
        k kVar = this.f5379g;
        Object objC = kVar.c(i3, 0);
        Object objC2 = kVar.c(this.e, 1);
        return (objC == null ? 0 : objC.hashCode()) ^ (objC2 != null ? objC2.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.e++;
        this.f5378f = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5378f) {
            throw new IllegalStateException();
        }
        this.f5379g.i(this.e);
        this.e--;
        this.f5377d--;
        this.f5378f = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f5378f) {
            return this.f5379g.j(this.e, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
