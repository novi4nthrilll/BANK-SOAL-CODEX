package c0;

import android.animation.TypeEvaluator;
import p013d1.AbstractC0491n3;

/* JADX INFO: loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p064t.f[] f2580a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f3, Object obj, Object obj2) {
        p064t.f[] fVarArr = (p064t.f[]) obj;
        p064t.f[] fVarArr2 = (p064t.f[]) obj2;
        if (!AbstractC0491n3.a(fVarArr, fVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!AbstractC0491n3.a(this.f2580a, fVarArr)) {
            this.f2580a = AbstractC0491n3.d(fVarArr);
        }
        for (int i3 = 0; i3 < fVarArr.length; i3++) {
            p064t.f fVar = this.f2580a[i3];
            p064t.f fVar2 = fVarArr[i3];
            p064t.f fVar3 = fVarArr2[i3];
            fVar.getClass();
            fVar.f5677a = fVar2.f5677a;
            int i4 = 0;
            while (true) {
                float[] fArr = fVar2.f5678b;
                if (i4 < fArr.length) {
                    fVar.f5678b[i4] = (fVar3.f5678b[i4] * f3) + ((1.0f - f3) * fArr[i4]);
                    i4++;
                }
            }
        }
        return this.f2580a;
    }
}
