package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0143z f2269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f2271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2272d;

    public b0(AbstractC0143z abstractC0143z, String str, Object[] objArr) {
        this.f2269a = abstractC0143z;
        this.f2270b = str;
        this.f2271c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f2272d = cCharAt;
            return;
        }
        int i3 = cCharAt & 8191;
        int i4 = 1;
        int i5 = 13;
        while (true) {
            int i6 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 55296) {
                this.f2272d = i3 | (cCharAt2 << i5);
                return;
            } else {
                i3 |= (cCharAt2 & 8191) << i5;
                i5 += 13;
                i4 = i6;
            }
        }
    }

    public final AbstractC0119a a() {
        return this.f2269a;
    }

    public final Object[] b() {
        return this.f2271c;
    }

    public final String c() {
        return this.f2270b;
    }

    public final int d() {
        int i3 = this.f2272d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }
}
