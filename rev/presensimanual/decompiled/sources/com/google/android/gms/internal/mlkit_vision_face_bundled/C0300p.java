package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0300p extends AbstractC0250k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient r f3247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient C0310q f3248g;

    public C0300p(r rVar, C0310q c0310q) {
        this.f3247f = rVar;
        this.f3248g = c0310q;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0210g
    public final int c(Object[] objArr) {
        return this.f3248g.c(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f3247f.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f3248g.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
