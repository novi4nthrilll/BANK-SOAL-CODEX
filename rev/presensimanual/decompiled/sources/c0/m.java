package c0;

import p013d1.AbstractC0491n3;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p064t.f[] f2603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2605c;

    public m() {
        this.f2603a = null;
        this.f2605c = 0;
    }

    public p064t.f[] getPathData() {
        return this.f2603a;
    }

    public String getPathName() {
        return this.f2604b;
    }

    public void setPathData(p064t.f[] fVarArr) {
        if (!AbstractC0491n3.a(this.f2603a, fVarArr)) {
            this.f2603a = AbstractC0491n3.d(fVarArr);
            return;
        }
        p064t.f[] fVarArr2 = this.f2603a;
        for (int i3 = 0; i3 < fVarArr.length; i3++) {
            fVarArr2[i3].f5677a = fVarArr[i3].f5677a;
            int i4 = 0;
            while (true) {
                float[] fArr = fVarArr[i3].f5678b;
                if (i4 < fArr.length) {
                    fVarArr2[i3].f5678b[i4] = fArr[i4];
                    i4++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f2603a = null;
        this.f2605c = 0;
        this.f2604b = mVar.f2604b;
        this.f2603a = AbstractC0491n3.d(mVar.f2603a);
    }
}
