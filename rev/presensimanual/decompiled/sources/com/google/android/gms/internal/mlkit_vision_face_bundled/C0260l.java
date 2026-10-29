package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0260l extends AbstractC0240j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0260l f3219h = new C0260l(0, new Object[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f3220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f3221g;

    public C0260l(int i3, Object[] objArr) {
        this.f3220f = objArr;
        this.f3221g = i3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0240j, com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0210g
    public final int c(Object[] objArr) {
        Object[] objArr2 = this.f3220f;
        int i3 = this.f3221g;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0210g
    public final int d() {
        return this.f3221g;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0210g
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0210g
    public final Object[] f() {
        return this.f3220f;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        C.a(i3, this.f3221g);
        Object obj = this.f3220f[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3221g;
    }
}
