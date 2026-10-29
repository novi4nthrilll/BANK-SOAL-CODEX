package p016e1;

import com.google.android.gms.internal.mlkit_vision_face_bundled.r;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0688v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient r f4018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient D f4019g;

    public C(r rVar, D d3) {
        this.f4018f = rVar;
        this.f4019g = d3;
    }

    @Override // p016e1.AbstractC0659q
    public final int c(Object[] objArr) {
        return this.f4019g.c(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f4018f.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f4019g.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f4018f.getClass();
        return 1;
    }
}
