package B;

/* JADX INFO: renamed from: B.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0011l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90c;

    public String toString() {
        switch (this.f88a) {
            case 1:
                return "LayoutState{mAvailable=0, mCurrentPosition=0, mItemDirection=0, mLayoutDirection=0, mStartLine=" + this.f89b + ", mEndLine=" + this.f90c + '}';
            default:
                return super.toString();
        }
    }

    public C0011l(int i3, int i4) {
        this.f88a = 2;
        this.f89b = i3;
        this.f90c = i4;
    }
}
