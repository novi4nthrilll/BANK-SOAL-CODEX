package K1;

import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f743c;

    public a(String str, String str2) {
        this.f741a = str;
        this.f742b = null;
        this.f743c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f741a.equals(aVar.f741a)) {
            return this.f743c.equals(aVar.f743c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f743c.hashCode() + (this.f741a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f741a);
        sb.append(", function: ");
        return I.h(sb, this.f743c, " )");
    }

    public a(String str, String str2, String str3) {
        this.f741a = str;
        this.f742b = str2;
        this.f743c = str3;
    }
}
