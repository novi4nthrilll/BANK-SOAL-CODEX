package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0199e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U7 f3049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3050b;

    public C0199e8(U7 u7, int i3) {
        this.f3049a = u7;
        this.f3050b = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0199e8)) {
            return false;
        }
        C0199e8 c0199e8 = (C0199e8) obj;
        return this.f3049a == c0199e8.f3049a && this.f3050b == c0199e8.f3050b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f3049a) * 65535) + this.f3050b;
    }
}
