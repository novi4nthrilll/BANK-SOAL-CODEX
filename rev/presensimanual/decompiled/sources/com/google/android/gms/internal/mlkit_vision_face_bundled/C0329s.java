package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0329s implements InterfaceC0369w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3451a;

    public C0329s(int i3) {
        this.f3451a = i3;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC0369w.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC0369w)) {
            return false;
        }
        C0329s c0329s = (C0329s) ((InterfaceC0369w) obj);
        if (this.f3451a == c0329s.f3451a) {
            Object obj2 = EnumC0359v.f3466d;
            c0329s.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f3451a ^ 14552422) + (EnumC0359v.f3466d.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f3451a + "intEncoding=" + EnumC0359v.f3466d + ')';
    }
}
