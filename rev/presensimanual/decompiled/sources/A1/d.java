package A1;

import O0.u;
import java.util.Arrays;
import p016e1.d5;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f38f;

    public /* synthetic */ d(int i3, int i4, int i5, int i6, boolean z2, float f3) {
        this.f34a = i3;
        this.f35b = i4;
        this.f36c = i5;
        this.f37d = i6;
        this.e = z2;
        this.f38f = f3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.floatToIntBits(this.f38f) == Float.floatToIntBits(dVar.f38f) && u.i(Integer.valueOf(this.f34a), Integer.valueOf(dVar.f34a)) && u.i(Integer.valueOf(this.f35b), Integer.valueOf(dVar.f35b)) && u.i(Integer.valueOf(this.f37d), Integer.valueOf(dVar.f37d)) && u.i(Boolean.valueOf(this.e), Boolean.valueOf(dVar.e)) && u.i(Integer.valueOf(this.f36c), Integer.valueOf(dVar.f36c)) && u.i(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Float.floatToIntBits(this.f38f)), Integer.valueOf(this.f34a), Integer.valueOf(this.f35b), Integer.valueOf(this.f37d), Boolean.valueOf(this.e), Integer.valueOf(this.f36c), null});
    }

    public final String toString() {
        D0.b bVar = new D0.b("FaceDetectorOptions");
        bVar.T("landmarkMode", this.f34a);
        bVar.T("contourMode", this.f35b);
        bVar.T("classificationMode", this.f36c);
        bVar.T("performanceMode", this.f37d);
        String strValueOf = String.valueOf(this.e);
        d5 d5Var = new d5(18, false);
        ((D0.b) bVar.f183g).f183g = d5Var;
        bVar.f183g = d5Var;
        d5Var.f182f = strValueOf;
        d5Var.e = "trackingEnabled";
        bVar.S("minFaceSize", this.f38f);
        return bVar.toString();
    }
}
