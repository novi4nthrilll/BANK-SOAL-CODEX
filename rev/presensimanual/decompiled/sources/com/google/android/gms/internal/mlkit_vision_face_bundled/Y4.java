package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W4 f2960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U4 f2961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X4 f2962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V4 f2963d;
    public final Boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f2964f;

    public /* synthetic */ Y4(E0.k kVar) {
        this.f2960a = (W4) kVar.f226d;
        this.f2961b = (U4) kVar.e;
        this.f2962c = (X4) kVar.f227f;
        this.f2963d = (V4) kVar.f228g;
        this.e = (Boolean) kVar.f229h;
        this.f2964f = (Float) kVar.f230i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y4)) {
            return false;
        }
        Y4 y4 = (Y4) obj;
        return O0.u.i(this.f2960a, y4.f2960a) && O0.u.i(this.f2961b, y4.f2961b) && O0.u.i(this.f2962c, y4.f2962c) && O0.u.i(this.f2963d, y4.f2963d) && O0.u.i(this.e, y4.e) && O0.u.i(this.f2964f, y4.f2964f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2960a, this.f2961b, this.f2962c, this.f2963d, this.e, this.f2964f});
    }
}
