package A0;

import M.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7b;

    public a(long j3, int i3) {
        if (i3 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f6a = i3;
        this.f7b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f6a, aVar.f6a) && this.f7b == aVar.f7b;
    }

    public final int hashCode() {
        int iB = (j.b(this.f6a) ^ 1000003) * 1000003;
        long j3 = this.f7b;
        return iB ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i3 = this.f6a;
        if (i3 == 1) {
            str = "OK";
        } else if (i3 != 2) {
            str = i3 != 3 ? "null" : "FATAL_ERROR";
        } else {
            str = "TRANSIENT_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f7b);
        sb.append("}");
        return sb.toString();
    }
}
