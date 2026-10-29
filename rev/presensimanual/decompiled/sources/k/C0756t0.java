package k;

/* JADX INFO: renamed from: k.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0756t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5248d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5251h;

    public final void a(int i3, int i4) {
        this.f5247c = i3;
        this.f5248d = i4;
        this.f5251h = true;
        if (this.f5250g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f5245a = i4;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f5246b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f5245a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f5246b = i4;
        }
    }
}
