package p079z0;

import E0.k;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f5932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f5933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5934d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f5935f;

    public a(String str, Integer num, e eVar, long j3, long j4, HashMap map) {
        this.f5931a = str;
        this.f5932b = num;
        this.f5933c = eVar;
        this.f5934d = j3;
        this.e = j4;
        this.f5935f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f5935f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f5935f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final k c() {
        k kVar = new k();
        String str = this.f5931a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        kVar.f226d = str;
        kVar.e = this.f5932b;
        e eVar = this.f5933c;
        if (eVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        kVar.f227f = eVar;
        kVar.f228g = Long.valueOf(this.f5934d);
        kVar.f229h = Long.valueOf(this.e);
        kVar.f230i = new HashMap(this.f5935f);
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f5931a.equals(aVar.f5931a)) {
            Integer num = aVar.f5932b;
            Integer num2 = this.f5932b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f5933c.equals(aVar.f5933c) && this.f5934d == aVar.f5934d && this.e == aVar.e && this.f5935f.equals(aVar.f5935f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f5931a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f5932b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f5933c.hashCode()) * 1000003;
        long j3 = this.f5934d;
        int i3 = (iHashCode2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.e;
        return ((i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f5935f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f5931a + ", code=" + this.f5932b + ", encodedPayload=" + this.f5933c + ", eventMillis=" + this.f5934d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f5935f + "}";
    }
}
