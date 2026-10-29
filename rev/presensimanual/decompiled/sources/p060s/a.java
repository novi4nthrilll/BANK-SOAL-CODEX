package p060s;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f5629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f5630d;
    public final float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f5631f;

    public a(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f5627a = f3;
        this.f5628b = f4;
        this.f5629c = f5;
        this.f5630d = f6;
        this.e = f7;
        this.f5631f = f8;
    }

    public static a a(int i3) {
        n nVar = n.f5655k;
        float fG = b.g(Color.red(i3));
        float fG2 = b.g(Color.green(i3));
        float fG3 = b.g(Color.blue(i3));
        float[][] fArr = b.f5635d;
        float[] fArr2 = fArr[0];
        float f3 = (fArr2[2] * fG3) + (fArr2[1] * fG2) + (fArr2[0] * fG);
        float[] fArr3 = fArr[1];
        float f4 = (fArr3[2] * fG3) + (fArr3[1] * fG2) + (fArr3[0] * fG);
        float[] fArr4 = fArr[2];
        float f5 = (fG3 * fArr4[2]) + (fG2 * fArr4[1]) + (fG * fArr4[0]);
        float[][] fArr5 = b.f5632a;
        float[] fArr6 = fArr5[0];
        float f6 = (fArr6[2] * f5) + (fArr6[1] * f4) + (fArr6[0] * f3);
        float[] fArr7 = fArr5[1];
        float f7 = (fArr7[2] * f5) + (fArr7[1] * f4) + (fArr7[0] * f3);
        float[] fArr8 = fArr5[2];
        float f8 = (f5 * fArr8[2]) + (f4 * fArr8[1]) + (f3 * fArr8[0]);
        float[] fArr9 = nVar.f5661g;
        float f9 = fArr9[0] * f6;
        float f10 = fArr9[1] * f7;
        float f11 = fArr9[2] * f8;
        float fAbs = Math.abs(f9);
        float f12 = nVar.f5662h;
        float fPow = (float) Math.pow(((double) (fAbs * f12)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f10) * f12)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f11) * f12)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f9) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f10) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f11) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d3 = fSignum3;
        float f13 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d3)) / 11.0f;
        float f14 = ((float) (((double) (fSignum + fSignum2)) - (d3 * 2.0d))) / 9.0f;
        float f15 = fSignum2 * 20.0f;
        float f16 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f15)) / 20.0f;
        float f17 = (((fSignum * 40.0f) + f15) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f14, f13)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f18 = fAtan2;
        float f19 = (3.1415927f * f18) / 180.0f;
        float f20 = f17 * nVar.f5657b;
        float f21 = nVar.f5656a;
        float f22 = nVar.f5659d;
        float fPow4 = ((float) Math.pow(f20 / f21, nVar.f5664j * f22)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f23 = f21 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, nVar.f5660f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f18) < 20.14d ? 360.0f + f18 : f18)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * nVar.e) * nVar.f5658c) * ((float) Math.sqrt((f14 * f14) + (f13 * f13)))) / (f16 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f24 = nVar.f5663i * fSqrt;
        Math.sqrt((fPow5 * f22) / f23);
        float f25 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f24 * 0.0228f) + 1.0f)) * 43.85965f;
        double d4 = f19;
        return new a(f18, fSqrt, fPow4, f25, fLog * ((float) Math.cos(d4)), fLog * ((float) Math.sin(d4)));
    }

    public static a b(float f3, float f4, float f5) {
        n nVar = n.f5655k;
        float f6 = nVar.f5659d;
        double d3 = ((double) f3) / 100.0d;
        Math.sqrt(d3);
        float f7 = nVar.f5656a + 4.0f;
        float f8 = nVar.f5663i * f4;
        Math.sqrt(((f4 / ((float) Math.sqrt(d3))) * nVar.f5659d) / f7);
        float f9 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float fLog = ((float) Math.log((((double) f8) * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f5) / 180.0f;
        return new a(f5, f4, f3, f9, fLog * ((float) Math.cos(d4)), fLog * ((float) Math.sin(d4)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final int c(n nVar) {
        float fSqrt;
        float f3 = this.f5628b;
        double d3 = f3;
        float f4 = this.f5629c;
        if (d3 != 0.0d) {
            double d4 = f4;
            if (d4 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f3 / ((float) Math.sqrt(d4 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, nVar.f5660f), 0.73d), 1.1111111111111112d);
        double d5 = (this.f5627a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d5) + 3.8d)) * 0.25f;
        float fPow2 = nVar.f5656a * ((float) Math.pow(((double) f4) / 100.0d, (1.0d / ((double) nVar.f5659d)) / ((double) nVar.f5664j)));
        float f5 = fCos * 3846.1538f * nVar.e * nVar.f5658c;
        float f6 = fPow2 / nVar.f5657b;
        float fSin = (float) Math.sin(d5);
        float fCos2 = (float) Math.cos(d5);
        float f7 = (((0.305f + f6) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f5 * 23.0f)));
        float f8 = fCos2 * f7;
        float f9 = f7 * fSin;
        float f10 = f6 * 460.0f;
        float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11))));
        float fSignum = Math.signum(f11);
        float f14 = 100.0f / nVar.f5662h;
        float fPow3 = fSignum * f14 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f13) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
        float[] fArr = nVar.f5661g;
        float f15 = fPow3 / fArr[0];
        float f16 = fSignum2 / fArr[1];
        float f17 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f5633b;
        float[] fArr3 = fArr2[0];
        float f18 = (fArr3[2] * f17) + (fArr3[1] * f16) + (fArr3[0] * f15);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
        float[] fArr5 = fArr2[2];
        return p064t.a.a(f18, f19, (f17 * fArr5[2]) + (f16 * fArr5[1]) + (f15 * fArr5[0]));
    }
}
