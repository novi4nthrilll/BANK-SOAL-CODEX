package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0310q extends AbstractC0240j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f3255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f3256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f3257h = 1;

    public C0310q(int i3, Object[] objArr) {
        this.f3255f = objArr;
        this.f3256g = i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        C.a(i3, this.f3257h);
        Object obj = this.f3255f[i3 + i3 + this.f3256g];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3257h;
    }
}
