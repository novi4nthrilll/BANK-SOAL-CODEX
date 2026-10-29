package p013d1;

/* JADX INFO: renamed from: d1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0409a implements InterfaceC0427d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3684a;

    public C0409a(int i3) {
        this.f3684a = i3;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC0427d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC0427d)) {
            return false;
        }
        C0409a c0409a = (C0409a) ((InterfaceC0427d) obj);
        if (this.f3684a == c0409a.f3684a) {
            Object obj2 = EnumC0421c.f3697d;
            c0409a.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f3684a ^ 14552422) + (EnumC0421c.f3697d.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f3684a + "intEncoding=" + EnumC0421c.f3697d + ')';
    }
}
