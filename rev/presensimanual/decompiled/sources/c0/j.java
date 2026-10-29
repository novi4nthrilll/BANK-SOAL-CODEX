package c0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class j extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E0.i f2583d;
    public float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public E0.i f2584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f2587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f2589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint.Cap f2590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint.Join f2591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f2592n;

    @Override // c0.l
    public final boolean a() {
        return this.f2584f.b() || this.f2583d.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // c0.l
    public final boolean b(int[] iArr) {
        boolean z2;
        E0.i iVar = this.f2584f;
        boolean z3 = false;
        if (iVar.b()) {
            ColorStateList colorStateList = (ColorStateList) iVar.f219g;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != iVar.e) {
                iVar.e = colorForState;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        E0.i iVar2 = this.f2583d;
        if (iVar2.b()) {
            ColorStateList colorStateList2 = (ColorStateList) iVar2.f219g;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != iVar2.e) {
                iVar2.e = colorForState2;
                z3 = true;
            }
        }
        return z2 | z3;
    }

    public float getFillAlpha() {
        return this.f2586h;
    }

    public int getFillColor() {
        return this.f2584f.e;
    }

    public float getStrokeAlpha() {
        return this.f2585g;
    }

    public int getStrokeColor() {
        return this.f2583d.e;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f2588j;
    }

    public float getTrimPathOffset() {
        return this.f2589k;
    }

    public float getTrimPathStart() {
        return this.f2587i;
    }

    public void setFillAlpha(float f3) {
        this.f2586h = f3;
    }

    public void setFillColor(int i3) {
        this.f2584f.e = i3;
    }

    public void setStrokeAlpha(float f3) {
        this.f2585g = f3;
    }

    public void setStrokeColor(int i3) {
        this.f2583d.e = i3;
    }

    public void setStrokeWidth(float f3) {
        this.e = f3;
    }

    public void setTrimPathEnd(float f3) {
        this.f2588j = f3;
    }

    public void setTrimPathOffset(float f3) {
        this.f2589k = f3;
    }

    public void setTrimPathStart(float f3) {
        this.f2587i = f3;
    }
}
