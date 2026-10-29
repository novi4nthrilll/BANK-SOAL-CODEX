package c0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f2606p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f2607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f2608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f2609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f2610d;
    public Paint e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f2611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f2612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f2614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2615j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f2616k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f2618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f2619n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p045n.b f2620o;

    public n() {
        this.f2609c = new Matrix();
        this.f2613h = 0.0f;
        this.f2614i = 0.0f;
        this.f2615j = 0.0f;
        this.f2616k = 0.0f;
        this.f2617l = 255;
        this.f2618m = null;
        this.f2619n = null;
        this.f2620o = new p045n.b();
        this.f2612g = new k();
        this.f2607a = new Path();
        this.f2608b = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x013b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0148  */
    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0161  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x0195  */
    /* JADX WARN: Code duplicated, block: B:62:0x0198  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    public final void a(k kVar, Matrix matrix, Canvas canvas, int i3, int i4) {
        Matrix matrix2;
        float f3;
        float f4;
        E0.i iVar;
        boolean z2;
        E0.i iVar2;
        Paint paint;
        Paint.Join join;
        Paint.Cap cap;
        Shader shader;
        Paint paint2;
        Shader shader2;
        Path.FillType fillType;
        char c3 = 1;
        kVar.f2593a.set(matrix);
        Matrix matrix3 = kVar.f2593a;
        matrix3.preConcat(kVar.f2601j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = kVar.f2594b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            l lVar = (l) arrayList.get(i5);
            if (lVar instanceof k) {
                a((k) lVar, matrix3, canvas, i3, i4);
            } else {
                if (lVar instanceof m) {
                    m mVar = (m) lVar;
                    float f5 = i3 / this.f2615j;
                    float f6 = i4 / this.f2616k;
                    float fMin = Math.min(f5, f6);
                    Matrix matrix4 = this.f2609c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f5, f6);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[r11], fArr[c3]);
                    matrix2 = matrix3;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f7 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f7) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f2607a;
                        mVar.getClass();
                        path.reset();
                        p064t.f[] fVarArr = mVar.f2603a;
                        if (fVarArr != null) {
                            p064t.f.b(fVarArr, path);
                        }
                        Path path2 = this.f2608b;
                        path2.reset();
                        if (mVar instanceof i) {
                            path2.setFillType(mVar.f2605c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            j jVar = (j) mVar;
                            float f8 = jVar.f2587i;
                            if (f8 == 0.0f) {
                                f3 = 1.0f;
                                if (jVar.f2588j != 1.0f) {
                                }
                                path2.addPath(path, matrix4);
                                iVar = jVar.f2584f;
                                if (((Shader) iVar.f218f) != null && iVar.e == 0) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    if (this.e == null) {
                                        Paint paint3 = new Paint(1);
                                        this.e = paint3;
                                        paint3.setStyle(Paint.Style.FILL);
                                    }
                                    paint2 = this.e;
                                    shader2 = (Shader) iVar.f218f;
                                    if (shader2 != null) {
                                        shader2.setLocalMatrix(matrix4);
                                        paint2.setShader(shader2);
                                        paint2.setAlpha(Math.round(jVar.f2586h * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i6 = iVar.e;
                                        float f9 = jVar.f2586h;
                                        PorterDuff.Mode mode = q.f2633m;
                                        paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f9)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    if (jVar.f2605c == 0) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        fillType = Path.FillType.EVEN_ODD;
                                    }
                                    path2.setFillType(fillType);
                                    canvas.drawPath(path2, paint2);
                                }
                                iVar2 = jVar.f2583d;
                                if (((Shader) iVar2.f218f) == null || iVar2.e != 0) {
                                    if (this.f2610d == null) {
                                        Paint paint4 = new Paint(1);
                                        this.f2610d = paint4;
                                        paint4.setStyle(Paint.Style.STROKE);
                                    }
                                    paint = this.f2610d;
                                    join = jVar.f2591m;
                                    if (join != null) {
                                        paint.setStrokeJoin(join);
                                    }
                                    cap = jVar.f2590l;
                                    if (cap != null) {
                                        paint.setStrokeCap(cap);
                                    }
                                    paint.setStrokeMiter(jVar.f2592n);
                                    shader = (Shader) iVar2.f218f;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix4);
                                        paint.setShader(shader);
                                        paint.setAlpha(Math.round(jVar.f2585g * 255.0f));
                                    } else {
                                        paint.setShader(null);
                                        paint.setAlpha(255);
                                        int i7 = iVar2.e;
                                        float f10 = jVar.f2585g;
                                        PorterDuff.Mode mode2 = q.f2633m;
                                        paint.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f10)) << 24));
                                    }
                                    paint.setColorFilter(null);
                                    paint.setStrokeWidth(jVar.e * fAbs * fMin);
                                    canvas.drawPath(path2, paint);
                                }
                            } else {
                                f3 = 1.0f;
                            }
                            float f11 = jVar.f2589k;
                            float f12 = (f8 + f11) % f3;
                            float f13 = (jVar.f2588j + f11) % f3;
                            if (this.f2611f == null) {
                                this.f2611f = new PathMeasure();
                            }
                            this.f2611f.setPath(path, r11);
                            float length = this.f2611f.getLength();
                            float f14 = f12 * length;
                            float f15 = f13 * length;
                            path.reset();
                            if (f14 > f15) {
                                this.f2611f.getSegment(f14, length, path, true);
                                f4 = 0.0f;
                                this.f2611f.getSegment(0.0f, f15, path, true);
                            } else {
                                f4 = 0.0f;
                                this.f2611f.getSegment(f14, f15, path, true);
                            }
                            path.rLineTo(f4, f4);
                            path2.addPath(path, matrix4);
                            iVar = jVar.f2584f;
                            if (((Shader) iVar.f218f) != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                if (this.e == null) {
                                    Paint paint5 = new Paint(1);
                                    this.e = paint5;
                                    paint5.setStyle(Paint.Style.FILL);
                                }
                                paint2 = this.e;
                                shader2 = (Shader) iVar.f218f;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint2.setShader(shader2);
                                    paint2.setAlpha(Math.round(jVar.f2586h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i8 = iVar.e;
                                    float f16 = jVar.f2586h;
                                    PorterDuff.Mode mode3 = q.f2633m;
                                    paint2.setColor((i8 & 16777215) | (((int) (Color.alpha(i8) * f16)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (jVar.f2605c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            }
                            iVar2 = jVar.f2583d;
                            if (((Shader) iVar2.f218f) == null) {
                                if (this.f2610d == null) {
                                    Paint paint6 = new Paint(1);
                                    this.f2610d = paint6;
                                    paint6.setStyle(Paint.Style.STROKE);
                                }
                                paint = this.f2610d;
                                join = jVar.f2591m;
                                if (join != null) {
                                    paint.setStrokeJoin(join);
                                }
                                cap = jVar.f2590l;
                                if (cap != null) {
                                    paint.setStrokeCap(cap);
                                }
                                paint.setStrokeMiter(jVar.f2592n);
                                shader = (Shader) iVar2.f218f;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint.setShader(shader);
                                    paint.setAlpha(Math.round(jVar.f2585g * 255.0f));
                                } else {
                                    paint.setShader(null);
                                    paint.setAlpha(255);
                                    int i9 = iVar2.e;
                                    float f17 = jVar.f2585g;
                                    PorterDuff.Mode mode4 = q.f2633m;
                                    paint.setColor((i9 & 16777215) | (((int) (Color.alpha(i9) * f17)) << 24));
                                }
                                paint.setColorFilter(null);
                                paint.setStrokeWidth(jVar.e * fAbs * fMin);
                                canvas.drawPath(path2, paint);
                            } else {
                                if (this.f2610d == null) {
                                    Paint paint7 = new Paint(1);
                                    this.f2610d = paint7;
                                    paint7.setStyle(Paint.Style.STROKE);
                                }
                                paint = this.f2610d;
                                join = jVar.f2591m;
                                if (join != null) {
                                    paint.setStrokeJoin(join);
                                }
                                cap = jVar.f2590l;
                                if (cap != null) {
                                    paint.setStrokeCap(cap);
                                }
                                paint.setStrokeMiter(jVar.f2592n);
                                shader = (Shader) iVar2.f218f;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint.setShader(shader);
                                    paint.setAlpha(Math.round(jVar.f2585g * 255.0f));
                                } else {
                                    paint.setShader(null);
                                    paint.setAlpha(255);
                                    int i10 = iVar2.e;
                                    float f18 = jVar.f2585g;
                                    PorterDuff.Mode mode5 = q.f2633m;
                                    paint.setColor((i10 & 16777215) | (((int) (Color.alpha(i10) * f18)) << 24));
                                }
                                paint.setColorFilter(null);
                                paint.setStrokeWidth(jVar.e * fAbs * fMin);
                                canvas.drawPath(path2, paint);
                            }
                        }
                    }
                }
                i5++;
                matrix3 = matrix2;
                c3 = 1;
                r11 = 0;
            }
            matrix2 = matrix3;
            i5++;
            matrix3 = matrix2;
            c3 = 1;
            r11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f2617l;
    }

    public void setAlpha(float f3) {
        setRootAlpha((int) (f3 * 255.0f));
    }

    public void setRootAlpha(int i3) {
        this.f2617l = i3;
    }

    public n(n nVar) {
        this.f2609c = new Matrix();
        this.f2613h = 0.0f;
        this.f2614i = 0.0f;
        this.f2615j = 0.0f;
        this.f2616k = 0.0f;
        this.f2617l = 255;
        this.f2618m = null;
        this.f2619n = null;
        p045n.b bVar = new p045n.b();
        this.f2620o = bVar;
        this.f2612g = new k(nVar.f2612g, bVar);
        this.f2607a = new Path(nVar.f2607a);
        this.f2608b = new Path(nVar.f2608b);
        this.f2613h = nVar.f2613h;
        this.f2614i = nVar.f2614i;
        this.f2615j = nVar.f2615j;
        this.f2616k = nVar.f2616k;
        this.f2617l = nVar.f2617l;
        this.f2618m = nVar.f2618m;
        String str = nVar.f2618m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f2619n = nVar.f2619n;
    }
}
