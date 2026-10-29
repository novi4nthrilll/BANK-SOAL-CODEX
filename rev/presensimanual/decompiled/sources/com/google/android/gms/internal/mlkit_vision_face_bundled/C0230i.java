package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0230i extends AbstractC0240j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f3084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f3085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0240j f3086h;

    public C0230i(AbstractC0240j abstractC0240j, int i3, int i4) {
        this.f3086h = abstractC0240j;
        this.f3084f = i3;
        this.f3085g = i4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0210g
    public final int d() {
        return this.f3086h.e() + this.f3084f + this.f3085g;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0210g
    public final int e() {
        return this.f3086h.e() + this.f3084f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0210g
    public final Object[] f() {
        return this.f3086h.f();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0240j, java.util.List
    /* JADX INFO: renamed from: g */
    public final AbstractC0240j subList(int i3, int i4) {
        C.b(i3, i4, this.f3085g);
        int i5 = this.f3084f;
        return this.f3086h.subList(i3 + i5, i4 + i5);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        C.a(i3, this.f3085g);
        return this.f3086h.get(i3 + this.f3084f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3085g;
    }
}
