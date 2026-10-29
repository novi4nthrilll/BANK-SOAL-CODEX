package N0;

import java.util.Arrays;

/* JADX INFO: renamed from: N0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0081b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.g f1058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M0.b f1059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1060d;

    public C0081b(A0.g gVar, M0.b bVar, String str) {
        this.f1058b = gVar;
        this.f1059c = bVar;
        this.f1060d = str;
        this.f1057a = Arrays.hashCode(new Object[]{gVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0081b)) {
            return false;
        }
        C0081b c0081b = (C0081b) obj;
        return O0.u.i(this.f1058b, c0081b.f1058b) && O0.u.i(this.f1059c, c0081b.f1059c) && O0.u.i(this.f1060d, c0081b.f1060d);
    }

    public final int hashCode() {
        return this.f1057a;
    }
}
