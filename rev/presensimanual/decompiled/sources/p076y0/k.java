package p076y0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f5905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f5907d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f5909g;

    public k(long j3, Integer num, long j4, byte[] bArr, String str, long j5, n nVar) {
        this.f5904a = j3;
        this.f5905b = num;
        this.f5906c = j4;
        this.f5907d = bArr;
        this.e = str;
        this.f5908f = j5;
        this.f5909g = nVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        k kVar = (k) rVar;
        if (this.f5904a == kVar.f5904a && ((num = this.f5905b) != null ? num.equals(kVar.f5905b) : kVar.f5905b == null)) {
            if (this.f5906c == kVar.f5906c) {
                if (Arrays.equals(this.f5907d, rVar instanceof k ? ((k) rVar).f5907d : kVar.f5907d)) {
                    String str = kVar.e;
                    String str2 = this.e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f5908f == kVar.f5908f) {
                            n nVar = kVar.f5909g;
                            n nVar2 = this.f5909g;
                            if (nVar2 == null) {
                                if (nVar == null) {
                                    return true;
                                }
                            } else if (nVar2.equals(nVar)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f5904a;
        int i3 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f5905b;
        int iHashCode = (i3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j4 = this.f5906c;
        int iHashCode2 = (((iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f5907d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j5 = this.f5908f;
        int i4 = (iHashCode3 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        n nVar = this.f5909g;
        return i4 ^ (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f5904a + ", eventCode=" + this.f5905b + ", eventUptimeMs=" + this.f5906c + ", sourceExtension=" + Arrays.toString(this.f5907d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f5908f + ", networkConnectionInfo=" + this.f5909g + "}";
    }
}
