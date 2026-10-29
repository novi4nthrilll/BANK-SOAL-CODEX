package p018f;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f4428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4430c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        int i3 = (int) ((f3 * this.f4430c) + 0.5f);
        int i4 = this.f4429b;
        int[] iArr = this.f4428a;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = iArr[i5];
            if (i3 < i6) {
                break;
            }
            i3 -= i6;
            i5++;
        }
        return (i5 / i4) + (i5 < i4 ? i3 / this.f4430c : 0.0f);
    }
}
