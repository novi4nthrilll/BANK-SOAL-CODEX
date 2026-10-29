package p042m;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5338d;
    public final Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f5339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f5340g;

    public c(Object obj, Object obj2) {
        this.f5338d = obj;
        this.e = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5338d.equals(cVar.f5338d) && this.e.equals(cVar.e);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5338d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f5338d.hashCode() ^ this.e.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f5338d + "=" + this.e;
    }
}
