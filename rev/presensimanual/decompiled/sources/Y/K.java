package Y;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1843d;
    public int e;

    public final boolean a() {
        int i3;
        int i4;
        int i5;
        int i6 = this.f1840a;
        int i7 = 2;
        if ((i6 & 7) != 0) {
            int i8 = this.f1843d;
            int i9 = this.f1841b;
            if (i8 > i9) {
                i5 = 1;
            } else {
                i5 = i8 == i9 ? 2 : 4;
            }
            if ((i5 & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 112) != 0) {
            int i10 = this.f1843d;
            int i11 = this.f1842c;
            if (i10 > i11) {
                i4 = 1;
            } else {
                i4 = i10 == i11 ? 2 : 4;
            }
            if (((i4 << 4) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 1792) != 0) {
            int i12 = this.e;
            int i13 = this.f1841b;
            if (i12 > i13) {
                i3 = 1;
            } else {
                i3 = i12 == i13 ? 2 : 4;
            }
            if (((i3 << 8) & i6) == 0) {
                return false;
            }
        }
        if ((i6 & 28672) != 0) {
            int i14 = this.e;
            int i15 = this.f1842c;
            if (i14 > i15) {
                i7 = 1;
            } else if (i14 != i15) {
                i7 = 4;
            }
            if ((i6 & (i7 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
