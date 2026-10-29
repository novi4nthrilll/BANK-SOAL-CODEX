package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.f8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0209f8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0209f8 f3066b = new C0209f8(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3067a;

    public C0209f8() {
        this.f3067a = new HashMap();
    }

    public final C0289n8 a(U7 u7, int i3) {
        return (C0289n8) this.f3067a.get(new C0199e8(u7, i3));
    }

    public C0209f8(int i3) {
        this.f3067a = Collections.emptyMap();
    }
}
