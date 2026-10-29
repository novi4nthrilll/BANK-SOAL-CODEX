package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0399z implements p049o1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0379x f3503d = new C0379x(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f3505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3506c;

    @Override // p049o1.a
    public /* bridge */ /* synthetic */ p049o1.a a(Class cls, n1.d dVar) {
        ((HashMap) this.f3504a).put(cls, dVar);
        ((HashMap) this.f3505b).remove(cls);
        return this;
    }

    public byte[] b(C0325r5 c0325r5) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap map = (HashMap) this.f3504a;
            C0389y c0389y = new C0389y(byteArrayOutputStream, map, (HashMap) this.f3505b, (C0379x) this.f3506c);
            n1.d dVar = (n1.d) map.get(C0325r5.class);
            if (dVar == null) {
                throw new n1.b("No encoder for ".concat(String.valueOf(C0325r5.class)));
            }
            dVar.a(c0325r5, c0389y);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
        }
    }
}
