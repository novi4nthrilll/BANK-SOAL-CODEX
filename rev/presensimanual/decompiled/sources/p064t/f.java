package p064t;

import android.graphics.Path;
import android.util.Log;
import p013d1.AbstractC0491n3;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char f5677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f5678b;

    public f(char c3, float[] fArr) {
        this.f5677a = c3;
        this.f5678b = fArr;
    }

    public static void a(Path path, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z2, boolean z3) {
        double d3;
        double d4;
        double radians = Math.toRadians(f9);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d5 = f3;
        double d6 = f4;
        double d7 = (d6 * dSin) + (d5 * dCos);
        double d8 = d5;
        double d9 = f7;
        double d10 = d7 / d9;
        double d11 = f8;
        double d12 = ((d6 * dCos) + (((double) (-f3)) * dSin)) / d11;
        double d13 = d6;
        double d14 = f6;
        double d15 = ((d14 * dSin) + (((double) f5) * dCos)) / d9;
        double d16 = ((d14 * dCos) + (((double) (-f5)) * dSin)) / d11;
        double d17 = d10 - d15;
        double d18 = d12 - d16;
        double d19 = (d10 + d15) / 2.0d;
        double d20 = (d12 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d21);
            float fSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            a(path, f3, f4, f5, f6, f7 * fSqrt, f8 * fSqrt, f9, z2, z3);
            return;
        }
        double dSqrt = Math.sqrt(d22);
        double d23 = d17 * dSqrt;
        double d24 = dSqrt * d18;
        if (z2 == z3) {
            d3 = d19 - d24;
            d4 = d20 + d23;
        } else {
            d3 = d19 + d24;
            d4 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d12 - d4, d10 - d3);
        double dAtan3 = Math.atan2(d16 - d4, d15 - d3) - dAtan2;
        int i3 = 0;
        if (z3 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d25 = d3 * d9;
        double d26 = d4 * d11;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d29 = -d9;
        double d30 = d29 * dCos2;
        double d31 = d11 * dSin2;
        double d32 = (d30 * dSin3) - (d31 * dCos3);
        double d33 = d29 * dSin2;
        double d34 = d11 * dCos2;
        double d35 = (dCos3 * d34) + (dSin3 * d33);
        double d36 = dAtan3 / ((double) iCeil);
        double d37 = dAtan2;
        while (i3 < iCeil) {
            double d38 = d37 + d36;
            double dSin4 = Math.sin(d38);
            double dCos4 = Math.cos(d38);
            double d39 = d36;
            double d40 = (((d9 * dCos2) * dCos4) + d27) - (d31 * dSin4);
            double d41 = d27;
            double d42 = (d34 * dSin4) + (d9 * dSin2 * dCos4) + d28;
            double d43 = (d30 * dSin4) - (d31 * dCos4);
            double d44 = (dCos4 * d34) + (dSin4 * d33);
            double d45 = d38 - d37;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d32 * dSqrt2) + d8), (float) ((d35 * dSqrt2) + d13), (float) (d40 - (dSqrt2 * d43)), (float) (d42 - (dSqrt2 * d44)), (float) d40, (float) d42);
            i3++;
            d34 = d34;
            d33 = d33;
            iCeil = iCeil;
            dCos2 = dCos2;
            d37 = d38;
            d9 = d9;
            d35 = d44;
            d32 = d43;
            d8 = d40;
            d13 = d42;
            d36 = d39;
            d27 = d41;
        }
    }

    public static void b(f[] fVarArr, Path path) {
        int i3;
        int i4;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        f[] fVarArr2 = fVarArr;
        float[] fArr = new float[6];
        int length = fVarArr2.length;
        char c3 = 'm';
        int i5 = 0;
        while (i5 < length) {
            f fVar = fVarArr2[i5];
            char c4 = fVar.f5677a;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i3 = 7;
                    break;
                case 'C':
                case 'c':
                    i3 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i3 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i3 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                default:
                    i3 = 2;
                    break;
            }
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int i6 = 0;
            while (true) {
                float[] fArr2 = fVar.f5678b;
                if (i6 < fArr2.length) {
                    if (c4 != 'A') {
                        if (c4 != 'C') {
                            if (c4 == 'H') {
                                i4 = i6;
                                c4 = c4;
                                i5 = i5;
                                length = length;
                                fVar = fVar;
                                path.lineTo(fArr2[i4], f24);
                                f23 = fArr2[i4];
                            } else if (c4 == 'Q') {
                                i4 = i6;
                                float f25 = fArr2[i4];
                                int i7 = i4 + 1;
                                float f26 = fArr2[i7];
                                int i8 = i4 + 2;
                                int i9 = i4 + 3;
                                path.quadTo(f25, f26, fArr2[i8], fArr2[i9]);
                                f3 = fArr2[i4];
                                f4 = fArr2[i7];
                                f23 = fArr2[i8];
                                f24 = fArr2[i9];
                            } else if (c4 == 'V') {
                                i4 = i6;
                                c4 = c4;
                                i5 = i5;
                                length = length;
                                fVar = fVar;
                                path.lineTo(f23, fArr2[i4]);
                                f24 = fArr2[i4];
                            } else if (c4 != 'a') {
                                if (c4 != 'c') {
                                    if (c4 != 'h') {
                                        if (c4 == 'q') {
                                            i4 = i6;
                                            float f27 = f24;
                                            float f28 = f23;
                                            int i10 = i4 + 1;
                                            int i11 = i4 + 2;
                                            int i12 = i4 + 3;
                                            path.rQuadTo(fArr2[i4], fArr2[i10], fArr2[i11], fArr2[i12]);
                                            float f29 = f28 + fArr2[i4];
                                            float f30 = fArr2[i10] + f27;
                                            float f31 = f28 + fArr2[i11];
                                            f24 = f27 + fArr2[i12];
                                            f18 = f30;
                                            f17 = f29;
                                            f23 = f31;
                                        } else if (c4 == 'v') {
                                            i4 = i6;
                                            path.rLineTo(0.0f, fArr2[i4]);
                                            f24 += fArr2[i4];
                                        } else if (c4 == 'L') {
                                            i4 = i6;
                                            int i13 = i4 + 1;
                                            path.lineTo(fArr2[i4], fArr2[i13]);
                                            f23 = fArr2[i4];
                                            f24 = fArr2[i13];
                                        } else if (c4 == 'M') {
                                            i4 = i6;
                                            f23 = fArr2[i4];
                                            f24 = fArr2[i4 + 1];
                                            if (i4 > 0) {
                                                path.lineTo(f23, f24);
                                            } else {
                                                path.moveTo(f23, f24);
                                                f22 = f24;
                                                f21 = f23;
                                            }
                                        } else if (c4 == 'S') {
                                            i4 = i6;
                                            float f32 = f24;
                                            float f33 = f23;
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                f9 = (f32 * 2.0f) - f18;
                                                f10 = (f33 * 2.0f) - f17;
                                            } else {
                                                f10 = f33;
                                                f9 = f32;
                                            }
                                            int i14 = i4 + 1;
                                            int i15 = i4 + 2;
                                            int i16 = i4 + 3;
                                            path.cubicTo(f10, f9, fArr2[i4], fArr2[i14], fArr2[i15], fArr2[i16]);
                                            float f34 = fArr2[i4];
                                            float f35 = fArr2[i14];
                                            f23 = fArr2[i15];
                                            f24 = fArr2[i16];
                                            f18 = f35;
                                            f17 = f34;
                                        } else if (c4 == 'T') {
                                            i4 = i6;
                                            float f36 = f24;
                                            float f37 = f23;
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f5 = (f37 * 2.0f) - f17;
                                                f6 = (f36 * 2.0f) - f18;
                                            } else {
                                                f5 = f37;
                                                f6 = f36;
                                            }
                                            int i17 = i4 + 1;
                                            path.quadTo(f5, f6, fArr2[i4], fArr2[i17]);
                                            f7 = fArr2[i4];
                                            f8 = fArr2[i17];
                                        } else if (c4 == 'l') {
                                            i4 = i6;
                                            int i18 = i4 + 1;
                                            path.rLineTo(fArr2[i4], fArr2[i18]);
                                            f23 += fArr2[i4];
                                            f24 += fArr2[i18];
                                        } else if (c4 == 'm') {
                                            i4 = i6;
                                            float f38 = fArr2[i4];
                                            f23 += f38;
                                            float f39 = fArr2[i4 + 1];
                                            f24 += f39;
                                            if (i4 > 0) {
                                                path.rLineTo(f38, f39);
                                            } else {
                                                path.rMoveTo(f38, f39);
                                                f22 = f24;
                                                f21 = f23;
                                            }
                                        } else if (c4 == 's') {
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                float f40 = f23 - f17;
                                                f11 = f24 - f18;
                                                f12 = f40;
                                            } else {
                                                f11 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            int i19 = i6 + 1;
                                            int i20 = i6 + 2;
                                            int i21 = i6 + 3;
                                            i4 = i6;
                                            float f41 = f24;
                                            float f42 = f23;
                                            path.rCubicTo(f12, f11, fArr2[i6], fArr2[i19], fArr2[i20], fArr2[i21]);
                                            f5 = f42 + fArr2[i4];
                                            f6 = f41 + fArr2[i19];
                                            f7 = f42 + fArr2[i20];
                                            f8 = fArr2[i21] + f41;
                                        } else if (c4 != 't') {
                                            i4 = i6;
                                        } else {
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f13 = f23 - f17;
                                                f14 = f24 - f18;
                                            } else {
                                                f14 = 0.0f;
                                                f13 = 0.0f;
                                            }
                                            int i22 = i6 + 1;
                                            path.rQuadTo(f13, f14, fArr2[i6], fArr2[i22]);
                                            float f43 = f13 + f23;
                                            float f44 = f14 + f24;
                                            f23 += fArr2[i6];
                                            f24 += fArr2[i22];
                                            f18 = f44;
                                            i4 = i6;
                                            f17 = f43;
                                        }
                                        fVar = fVar;
                                    } else {
                                        i4 = i6;
                                        path.rLineTo(fArr2[i4], 0.0f);
                                        f23 += fArr2[i4];
                                    }
                                    fVar = fVar;
                                } else {
                                    i4 = i6;
                                    float f45 = f24;
                                    float f46 = f23;
                                    int i23 = i4 + 2;
                                    int i24 = i4 + 3;
                                    int i25 = i4 + 4;
                                    int i26 = i4 + 5;
                                    path.rCubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i23], fArr2[i24], fArr2[i25], fArr2[i26]);
                                    f5 = f46 + fArr2[i23];
                                    f6 = f45 + fArr2[i24];
                                    f7 = f46 + fArr2[i25];
                                    f8 = fArr2[i26] + f45;
                                }
                                f18 = f6;
                                f17 = f5;
                                f23 = f7;
                                f24 = f8;
                                fVar = fVar;
                            } else {
                                i4 = i6;
                                float f47 = f24;
                                float f48 = f23;
                                int i27 = i4 + 5;
                                int i28 = i4 + 6;
                                a(path, f48, f47, fArr2[i27] + f48, fArr2[i28] + f47, fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                                f23 = f48 + fArr2[i27];
                                f24 = f47 + fArr2[i28];
                            }
                            i6 = i4 + i3;
                            fVar = fVar;
                            length = length;
                            c3 = c4;
                            c4 = c3;
                            i5 = i5;
                        } else {
                            i4 = i6;
                            int i29 = i4 + 2;
                            int i30 = i4 + 3;
                            int i31 = i4 + 4;
                            int i32 = i4 + 5;
                            path.cubicTo(fArr2[i4], fArr2[i4 + 1], fArr2[i29], fArr2[i30], fArr2[i31], fArr2[i32]);
                            f23 = fArr2[i31];
                            f24 = fArr2[i32];
                            f3 = fArr2[i29];
                            f4 = fArr2[i30];
                        }
                        f17 = f3;
                        f18 = f4;
                        i6 = i4 + i3;
                        fVar = fVar;
                        length = length;
                        c3 = c4;
                        c4 = c3;
                        i5 = i5;
                    } else {
                        i4 = i6;
                        int i33 = i4 + 5;
                        int i34 = i4 + 6;
                        a(path, f23, f24, fArr2[i33], fArr2[i34], fArr2[i4], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                        f23 = fArr2[i33];
                        f24 = fArr2[i34];
                    }
                    f18 = f24;
                    f17 = f23;
                    i6 = i4 + i3;
                    fVar = fVar;
                    length = length;
                    c3 = c4;
                    c4 = c3;
                    i5 = i5;
                }
            }
            fArr[0] = f23;
            fArr[1] = f24;
            fArr[2] = f17;
            fArr[3] = f18;
            fArr[4] = f21;
            fArr[5] = f22;
            c3 = fVar.f5677a;
            i5++;
            fVarArr2 = fVarArr;
            length = length;
        }
    }

    public f(f fVar) {
        this.f5677a = fVar.f5677a;
        float[] fArr = fVar.f5678b;
        this.f5678b = AbstractC0491n3.b(fArr, fArr.length);
    }
}
