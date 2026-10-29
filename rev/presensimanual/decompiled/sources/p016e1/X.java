package p016e1;

import D0.d;
import O0.u;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0704x3 f4148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f4149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0639m3 f4150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f4151d;
    public final Integer e;

    public /* synthetic */ X(d dVar) {
        this.f4148a = (EnumC0704x3) dVar.e;
        this.f4149b = (Boolean) dVar.f190f;
        this.f4150c = (C0639m3) dVar.f191g;
        this.f4151d = (Integer) dVar.f192h;
        this.e = (Integer) dVar.f193i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x3 = (X) obj;
        return u.i(this.f4148a, x3.f4148a) && u.i(this.f4149b, x3.f4149b) && u.i(null, null) && u.i(this.f4150c, x3.f4150c) && u.i(this.f4151d, x3.f4151d) && u.i(this.e, x3.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4148a, this.f4149b, null, this.f4150c, this.f4151d, this.e});
    }
}
