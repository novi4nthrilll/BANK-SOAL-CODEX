package p060s;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n f5655k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f5658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f5659d;
    public final float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f5660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f5661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f5662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f5663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f5664j;

    static {
        float[] fArr = b.f5634c;
        float fL = (float) ((((double) b.l()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f5632a;
        float f3 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr3[0] * f3;
        float f5 = fArr[1];
        float f6 = (fArr3[1] * f5) + f4;
        float f7 = fArr[2];
        float f8 = (fArr3[2] * f7) + f6;
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[2] * f7) + (fArr4[1] * f5) + (fArr4[0] * f3);
        float[] fArr5 = fArr2[2];
        float f10 = (f7 * fArr5[2]) + (f5 * fArr5[1]) + (f3 * fArr5[0]);
        float f11 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fL) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d3 = fExp;
        if (d3 > 1.0d) {
            fExp = 1.0f;
        } else if (d3 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f8) * fExp) + 1.0f) - fExp, (((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp};
        float f12 = 1.0f / ((5.0f * fL) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float fCbrt = (0.1f * f14 * f14 * ((float) Math.cbrt(((double) fL) * 5.0d))) + (f13 * fL);
        float fL2 = b.l() / fArr[1];
        double d4 = fL2;
        float fSqrt = ((float) Math.sqrt(d4)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d4, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f8)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f9)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f10)) / 100.0d, 0.42d)};
        float f15 = fArr7[0];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[1];
        float f18 = (f17 * 400.0f) / (f17 + 27.13f);
        float f19 = fArr7[2];
        float[] fArr8 = {f16, f18, (400.0f * f19) / (f19 + 27.13f)};
        f5655k = new n(fL2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f11, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public n(float f3, float f4, float f5, float f6, float f7, float f8, float[] fArr, float f9, float f10, float f11) {
        this.f5660f = f3;
        this.f5656a = f4;
        this.f5657b = f5;
        this.f5658c = f6;
        this.f5659d = f7;
        this.e = f8;
        this.f5661g = fArr;
        this.f5662h = f9;
        this.f5663i = f10;
        this.f5664j = f11;
    }
}
