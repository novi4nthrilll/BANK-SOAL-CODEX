package p076y0;

import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f5891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5894d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f5899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f5900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f5901l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f5891a = num;
        this.f5892b = str;
        this.f5893c = str2;
        this.f5894d = str3;
        this.e = str4;
        this.f5895f = str5;
        this.f5896g = str6;
        this.f5897h = str7;
        this.f5898i = str8;
        this.f5899j = str9;
        this.f5900k = str10;
        this.f5901l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f5891a;
        if (num != null ? num.equals(((h) aVar).f5891a) : ((h) aVar).f5891a == null) {
            String str = this.f5892b;
            if (str != null ? str.equals(((h) aVar).f5892b) : ((h) aVar).f5892b == null) {
                String str2 = this.f5893c;
                if (str2 != null ? str2.equals(((h) aVar).f5893c) : ((h) aVar).f5893c == null) {
                    String str3 = this.f5894d;
                    if (str3 != null ? str3.equals(((h) aVar).f5894d) : ((h) aVar).f5894d == null) {
                        String str4 = this.e;
                        if (str4 != null ? str4.equals(((h) aVar).e) : ((h) aVar).e == null) {
                            String str5 = this.f5895f;
                            if (str5 != null ? str5.equals(((h) aVar).f5895f) : ((h) aVar).f5895f == null) {
                                String str6 = this.f5896g;
                                if (str6 != null ? str6.equals(((h) aVar).f5896g) : ((h) aVar).f5896g == null) {
                                    String str7 = this.f5897h;
                                    if (str7 != null ? str7.equals(((h) aVar).f5897h) : ((h) aVar).f5897h == null) {
                                        String str8 = this.f5898i;
                                        if (str8 != null ? str8.equals(((h) aVar).f5898i) : ((h) aVar).f5898i == null) {
                                            String str9 = this.f5899j;
                                            if (str9 != null ? str9.equals(((h) aVar).f5899j) : ((h) aVar).f5899j == null) {
                                                String str10 = this.f5900k;
                                                if (str10 != null ? str10.equals(((h) aVar).f5900k) : ((h) aVar).f5900k == null) {
                                                    String str11 = this.f5901l;
                                                    if (str11 == null) {
                                                        if (((h) aVar).f5901l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((h) aVar).f5901l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        Integer num = this.f5891a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f5892b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f5893c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5894d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f5895f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f5896g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f5897h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f5898i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f5899j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f5900k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f5901l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f5891a);
        sb.append(", model=");
        sb.append(this.f5892b);
        sb.append(", hardware=");
        sb.append(this.f5893c);
        sb.append(", device=");
        sb.append(this.f5894d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f5895f);
        sb.append(", manufacturer=");
        sb.append(this.f5896g);
        sb.append(", fingerprint=");
        sb.append(this.f5897h);
        sb.append(", locale=");
        sb.append(this.f5898i);
        sb.append(", country=");
        sb.append(this.f5899j);
        sb.append(", mccMnc=");
        sb.append(this.f5900k);
        sb.append(", applicationBuild=");
        return I.h(sb, this.f5901l, "}");
    }
}
