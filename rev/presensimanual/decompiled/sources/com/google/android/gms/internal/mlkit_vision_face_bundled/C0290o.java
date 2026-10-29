package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0290o extends AbstractC0250k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient r f3238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient Object[] f3239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f3240h = 1;

    public C0290o(r rVar, Object[] objArr) {
        this.f3238f = rVar;
        this.f3239g = objArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0210g
    public final int c(Object[] objArr) {
        AbstractC0240j c0270m = this.e;
        if (c0270m == null) {
            c0270m = new C0270m(this);
            this.e = c0270m;
        }
        return c0270m.c(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f3238f.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC0240j c0270m = this.e;
        if (c0270m == null) {
            c0270m = new C0270m(this);
            this.e = c0270m;
        }
        return c0270m.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3240h;
    }
}
