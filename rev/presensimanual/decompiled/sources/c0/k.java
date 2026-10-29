package c0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f2593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2596d;
    public float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f2600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f2601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2602k;

    public k() {
        this.f2593a = new Matrix();
        this.f2594b = new ArrayList();
        this.f2595c = 0.0f;
        this.f2596d = 0.0f;
        this.e = 0.0f;
        this.f2597f = 1.0f;
        this.f2598g = 1.0f;
        this.f2599h = 0.0f;
        this.f2600i = 0.0f;
        this.f2601j = new Matrix();
        this.f2602k = null;
    }

    @Override // c0.l
    public final boolean a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f2594b;
            if (i3 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i3)).a()) {
                return true;
            }
            i3++;
        }
    }

    @Override // c0.l
    public final boolean b(int[] iArr) {
        int i3 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f2594b;
            if (i3 >= arrayList.size()) {
                return zB;
            }
            zB |= ((l) arrayList.get(i3)).b(iArr);
            i3++;
        }
    }

    public final void c() {
        Matrix matrix = this.f2601j;
        matrix.reset();
        matrix.postTranslate(-this.f2596d, -this.e);
        matrix.postScale(this.f2597f, this.f2598g);
        matrix.postRotate(this.f2595c, 0.0f, 0.0f);
        matrix.postTranslate(this.f2599h + this.f2596d, this.f2600i + this.e);
    }

    public String getGroupName() {
        return this.f2602k;
    }

    public Matrix getLocalMatrix() {
        return this.f2601j;
    }

    public float getPivotX() {
        return this.f2596d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f2595c;
    }

    public float getScaleX() {
        return this.f2597f;
    }

    public float getScaleY() {
        return this.f2598g;
    }

    public float getTranslateX() {
        return this.f2599h;
    }

    public float getTranslateY() {
        return this.f2600i;
    }

    public void setPivotX(float f3) {
        if (f3 != this.f2596d) {
            this.f2596d = f3;
            c();
        }
    }

    public void setPivotY(float f3) {
        if (f3 != this.e) {
            this.e = f3;
            c();
        }
    }

    public void setRotation(float f3) {
        if (f3 != this.f2595c) {
            this.f2595c = f3;
            c();
        }
    }

    public void setScaleX(float f3) {
        if (f3 != this.f2597f) {
            this.f2597f = f3;
            c();
        }
    }

    public void setScaleY(float f3) {
        if (f3 != this.f2598g) {
            this.f2598g = f3;
            c();
        }
    }

    public void setTranslateX(float f3) {
        if (f3 != this.f2599h) {
            this.f2599h = f3;
            c();
        }
    }

    public void setTranslateY(float f3) {
        if (f3 != this.f2600i) {
            this.f2600i = f3;
            c();
        }
    }

    public k(k kVar, p045n.b bVar) {
        m iVar;
        this.f2593a = new Matrix();
        this.f2594b = new ArrayList();
        this.f2595c = 0.0f;
        this.f2596d = 0.0f;
        this.e = 0.0f;
        this.f2597f = 1.0f;
        this.f2598g = 1.0f;
        this.f2599h = 0.0f;
        this.f2600i = 0.0f;
        Matrix matrix = new Matrix();
        this.f2601j = matrix;
        this.f2602k = null;
        this.f2595c = kVar.f2595c;
        this.f2596d = kVar.f2596d;
        this.e = kVar.e;
        this.f2597f = kVar.f2597f;
        this.f2598g = kVar.f2598g;
        this.f2599h = kVar.f2599h;
        this.f2600i = kVar.f2600i;
        String str = kVar.f2602k;
        this.f2602k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(kVar.f2601j);
        ArrayList arrayList = kVar.f2594b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Object obj = arrayList.get(i3);
            if (obj instanceof k) {
                this.f2594b.add(new k((k) obj, bVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    j jVar2 = new j(jVar);
                    jVar2.e = 0.0f;
                    jVar2.f2585g = 1.0f;
                    jVar2.f2586h = 1.0f;
                    jVar2.f2587i = 0.0f;
                    jVar2.f2588j = 1.0f;
                    jVar2.f2589k = 0.0f;
                    jVar2.f2590l = Paint.Cap.BUTT;
                    jVar2.f2591m = Paint.Join.MITER;
                    jVar2.f2592n = 4.0f;
                    jVar2.f2583d = jVar.f2583d;
                    jVar2.e = jVar.e;
                    jVar2.f2585g = jVar.f2585g;
                    jVar2.f2584f = jVar.f2584f;
                    jVar2.f2605c = jVar.f2605c;
                    jVar2.f2586h = jVar.f2586h;
                    jVar2.f2587i = jVar.f2587i;
                    jVar2.f2588j = jVar.f2588j;
                    jVar2.f2589k = jVar.f2589k;
                    jVar2.f2590l = jVar.f2590l;
                    jVar2.f2591m = jVar.f2591m;
                    jVar2.f2592n = jVar.f2592n;
                    iVar = jVar2;
                } else if (obj instanceof i) {
                    iVar = new i((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f2594b.add(iVar);
                Object obj2 = iVar.f2604b;
                if (obj2 != null) {
                    bVar.put(obj2, iVar);
                }
            }
        }
    }
}
