package p016e1;

import O0.u;
import W1.C0104l;
import java.util.Arrays;

/* JADX INFO: renamed from: e1.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0651o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0645n3 f4270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f4271b;

    public /* synthetic */ C0651o3(C0104l c0104l) {
        this.f4270a = (EnumC0645n3) c0104l.e;
        this.f4271b = (Integer) c0104l.f1774d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0651o3)) {
            return false;
        }
        C0651o3 c0651o3 = (C0651o3) obj;
        return u.i(this.f4270a, c0651o3.f4270a) && u.i(this.f4271b, c0651o3.f4271b) && u.i(null, null) && u.i(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4270a, this.f4271b, null, null});
    }
}
