package p013d1;

import com.google.android.gms.internal.mlkit_vision_face_bundled.r;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class W4 extends T4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient r f3660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient Object[] f3661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f3662h = 1;

    public W4(r rVar, Object[] objArr) {
        this.f3660f = rVar;
        this.f3661g = objArr;
    }

    @Override // p013d1.AbstractC0468j4
    public final int c(Object[] objArr) {
        S4 v4 = this.e;
        if (v4 == null) {
            v4 = new V4(this);
            this.e = v4;
        }
        return v4.c(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f3660f.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        S4 v4 = this.e;
        if (v4 == null) {
            v4 = new V4(this);
            this.e = v4;
        }
        return v4.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3662h;
    }
}
