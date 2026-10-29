package G;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f286d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f290i;

    public final float a(long j3) {
        long j4 = this.e;
        if (j3 < j4) {
            return 0.0f;
        }
        long j5 = this.f288g;
        if (j5 < 0 || j3 < j5) {
            return e.b((j3 - j4) / this.f283a, 0.0f, 1.0f) * 0.5f;
        }
        float f3 = this.f289h;
        return (e.b((j3 - j5) / this.f290i, 0.0f, 1.0f) * f3) + (1.0f - f3);
    }
}
