package p016e1;

/* JADX INFO: loaded from: classes.dex */
public final class F implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4033a;

    public F(int i3) {
        this.f4033a = i3;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return I.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        F f3 = (F) ((I) obj);
        if (this.f4033a == f3.f4033a) {
            Object obj2 = H.f4040d;
            f3.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f4033a ^ 14552422) + (H.f4040d.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f4033a + "intEncoding=" + H.f4040d + ')';
    }
}
