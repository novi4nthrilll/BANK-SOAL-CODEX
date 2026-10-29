package p073x0;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p013d1.AbstractC0550x3;
import p070w0.b;
import p079z0.d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f5822d;
    public static final a e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5824b;

    static {
        String strA = AbstractC0550x3.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f5821c = strA;
        AbstractC0550x3.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        AbstractC0550x3.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f5822d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b("proto"), new b("json"))));
        e = new a(strA, null);
    }

    public a(String str, String str2) {
        this.f5823a = str;
        this.f5824b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
