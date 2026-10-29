package A1;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import p013d1.I;
import p016e1.C0717z4;
import p016e1.K0;
import p016e1.M;
import p016e1.V4;
import p016e1.X4;
import p016e1.c5;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f23a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f25c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f26d;
    public final float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f27f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f28g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f29h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseArray f30i = new SparseArray();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseArray f31j = new SparseArray();

    public a(K0 k3) {
        float f3 = k3.f4062c;
        float f4 = k3.e / 2.0f;
        float f5 = k3.f4064f / 2.0f;
        float f6 = k3.f4063d;
        this.f23a = new Rect((int) (f3 - f4), (int) (f6 - f5), (int) (f3 + f4), (int) (f6 + f5));
        this.f24b = k3.f4061b;
        for (C0717z4 c0717z4 : k3.f4068j) {
            if (a(c0717z4.f4387d)) {
                PointF pointF = new PointF(c0717z4.f4385b, c0717z4.f4386c);
                SparseArray sparseArray = this.f30i;
                int i3 = c0717z4.f4387d;
                sparseArray.put(i3, new e(i3, pointF));
            }
        }
        for (M m3 : k3.f4072n) {
            int i4 = m3.f4085b;
            if (i4 <= 15 && i4 > 0) {
                PointF[] pointFArr = m3.f4084a;
                pointFArr.getClass();
                int length = pointFArr.length;
                long j3 = ((long) length) + 5 + ((long) (length / 10));
                ArrayList arrayList = new ArrayList(j3 > 2147483647L ? Integer.MAX_VALUE : (int) j3);
                Collections.addAll(arrayList, pointFArr);
                this.f31j.put(i4, new b(i4, arrayList));
            }
        }
        this.f27f = k3.f4067i;
        this.f28g = k3.f4065g;
        this.f29h = k3.f4066h;
        this.e = k3.f4071m;
        this.f26d = k3.f4069k;
        this.f25c = k3.f4070l;
    }

    public static boolean a(int i3) {
        return i3 == 0 || i3 == 1 || i3 == 7 || i3 == 3 || i3 == 9 || i3 == 4 || i3 == 10 || i3 == 5 || i3 == 11 || i3 == 6;
    }

    public final String toString() {
        D0.b bVar = new D0.b("Face");
        bVar.U(this.f23a, "boundingBox");
        bVar.T("trackingId", this.f24b);
        bVar.S("rightEyeOpenProbability", this.f25c);
        bVar.S("leftEyeOpenProbability", this.f26d);
        bVar.S("smileProbability", this.e);
        bVar.S("eulerX", this.f27f);
        bVar.S("eulerY", this.f28g);
        bVar.S("eulerZ", this.f29h);
        D0.b bVar2 = new D0.b("Landmarks");
        for (int i3 = 0; i3 <= 11; i3++) {
            if (a(i3)) {
                bVar2.U((e) this.f30i.get(i3), I.f("landmark_", i3));
            }
        }
        bVar.U(bVar2.toString(), "landmarks");
        D0.b bVar3 = new D0.b("Contours");
        for (int i4 = 1; i4 <= 15; i4++) {
            bVar3.U((b) this.f31j.get(i4), I.f("Contour_", i4));
        }
        bVar.U(bVar3.toString(), "contours");
        return bVar.toString();
    }

    public a(X4 x4) {
        this.f23a = x4.f4155b;
        this.f24b = x4.f4154a;
        for (c5 c5Var : x4.f4162j) {
            if (a(c5Var.f4183a)) {
                SparseArray sparseArray = this.f30i;
                int i3 = c5Var.f4183a;
                sparseArray.put(i3, new e(i3, c5Var.f4184b));
            }
        }
        for (V4 v4 : x4.f4163k) {
            int i4 = v4.f4139a;
            if (i4 <= 15 && i4 > 0) {
                ArrayList arrayList = v4.f4140b;
                arrayList.getClass();
                this.f31j.put(i4, new b(i4, new ArrayList(arrayList)));
            }
        }
        this.f27f = x4.e;
        this.f28g = x4.f4157d;
        this.f29h = -x4.f4156c;
        this.e = x4.f4160h;
        this.f26d = x4.f4158f;
        this.f25c = x4.f4159g;
    }
}
