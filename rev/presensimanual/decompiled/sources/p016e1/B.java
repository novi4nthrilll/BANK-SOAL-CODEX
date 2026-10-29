package p016e1;

import com.google.android.gms.internal.mlkit_vision_face_bundled.r;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0688v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient r f3930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient Object[] f3931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f3932h = 1;

    public B(r rVar, Object[] objArr) {
        this.f3930f = rVar;
        this.f3931g = objArr;
    }

    @Override // p016e1.AbstractC0659q
    public final int c(Object[] objArr) {
        AbstractC0682u a3 = this.e;
        if (a3 == null) {
            a3 = new A(this);
            this.e = a3;
        }
        return a3.c(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f3930f.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC0682u a3 = this.e;
        if (a3 == null) {
            a3 = new A(this);
            this.e = a3;
        }
        return a3.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3932h;
    }
}
