package N0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0081b f1107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L0.c f1108b;

    public /* synthetic */ s(C0081b c0081b, L0.c cVar) {
        this.f1107a = c0081b;
        this.f1108b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof s)) {
            s sVar = (s) obj;
            if (O0.u.i(this.f1107a, sVar.f1107a) && O0.u.i(this.f1108b, sVar.f1108b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1107a, this.f1108b});
    }

    public final String toString() {
        A0.g gVar = new A0.g(this);
        gVar.j(this.f1107a, "key");
        gVar.j(this.f1108b, "feature");
        return gVar.toString();
    }
}
