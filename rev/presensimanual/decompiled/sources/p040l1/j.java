package p040l1;

import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5321c;

    public j(int i3, int i4, Class cls) {
        this.f5319a = cls;
        this.f5320b = i3;
        this.f5321c = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f5319a == jVar.f5319a && this.f5320b == jVar.f5320b && this.f5321c == jVar.f5321c;
    }

    public final int hashCode() {
        return ((((this.f5319a.hashCode() ^ 1000003) * 1000003) ^ this.f5320b) * 1000003) ^ this.f5321c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f5319a);
        sb.append(", type=");
        int i3 = this.f5320b;
        if (i3 == 1) {
            str = "required";
        } else {
            str = i3 == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i4 = this.f5321c;
        if (i4 == 0) {
            str2 = "direct";
        } else if (i4 == 1) {
            str2 = "provider";
        } else {
            if (i4 != 2) {
                throw new AssertionError(I.f("Unsupported injection: ", i4));
            }
            str2 = "deferred";
        }
        return I.h(sb, str2, "}");
    }
}
