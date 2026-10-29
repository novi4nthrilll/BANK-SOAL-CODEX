package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0270m extends AbstractC0240j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0290o f3225f;

    public C0270m(C0290o c0290o) {
        this.f3225f = c0290o;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i3) {
        C0290o c0290o = this.f3225f;
        C.a(i3, c0290o.f3240h);
        int i4 = i3 + i3;
        Object[] objArr = c0290o.f3239g;
        Object obj = objArr[i4];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i4 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3225f.f3240h;
    }
}
