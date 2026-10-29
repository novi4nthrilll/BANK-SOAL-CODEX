package p076y0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f5912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f5913d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f5914f;

    public l(long j3, long j4, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f5921d;
        this.f5910a = j3;
        this.f5911b = j4;
        this.f5912c = jVar;
        this.f5913d = num;
        this.e = str;
        this.f5914f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f5910a == lVar.f5910a) {
            if (this.f5911b == lVar.f5911b) {
                if (this.f5912c.equals(lVar.f5912c)) {
                    Integer num = lVar.f5913d;
                    Integer num2 = this.f5913d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = lVar.e;
                        String str2 = this.e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (this.f5914f.equals(lVar.f5914f)) {
                                Object obj2 = w.f5921d;
                                if (obj2.equals(obj2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f5910a;
        long j4 = this.f5911b;
        int iHashCode = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f5912c.hashCode()) * 1000003;
        Integer num = this.f5913d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return w.f5921d.hashCode() ^ ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f5914f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f5910a + ", requestUptimeMs=" + this.f5911b + ", clientInfo=" + this.f5912c + ", logSource=" + this.f5913d + ", logSourceName=" + this.e + ", logEvents=" + this.f5914f + ", qosTier=" + w.f5921d + "}";
    }
}
