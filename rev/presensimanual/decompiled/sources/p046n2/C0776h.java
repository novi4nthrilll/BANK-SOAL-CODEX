package p046n2;

import B2.h;

/* JADX INFO: renamed from: n2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0776h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5447b;

    public C0776h(String str, boolean z2) {
        this.f5446a = str;
        this.f5447b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0776h)) {
            return false;
        }
        C0776h c0776h = (C0776h) obj;
        return h.a(this.f5446a, c0776h.f5446a) && this.f5447b == c0776h.f5447b;
    }

    public final int hashCode() {
        String str = this.f5446a;
        return ((str == null ? 0 : str.hashCode()) * 31) + (this.f5447b ? 1231 : 1237);
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f5446a + ", useDataStore=" + this.f5447b + ")";
    }
}
