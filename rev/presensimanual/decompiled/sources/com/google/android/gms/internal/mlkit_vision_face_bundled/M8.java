package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public final class M8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U7 f2862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f2864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2865d;

    public M8(U7 u7, String str, Object[] objArr) {
        this.f2862a = u7;
        this.f2863b = str;
        this.f2864c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f2865d = cCharAt;
            return;
        }
        int i3 = cCharAt & 8191;
        int i4 = 13;
        int i5 = 1;
        while (true) {
            int i6 = i5 + 1;
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 < 55296) {
                this.f2865d = i3 | (cCharAt2 << i4);
                return;
            } else {
                i3 |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i5 = i6;
            }
        }
    }

    public final U7 a() {
        return this.f2862a;
    }

    public final int b() {
        int i3 = this.f2865d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }

    public final String c() {
        return this.f2863b;
    }

    public final Object[] d() {
        return this.f2864c;
    }
}
