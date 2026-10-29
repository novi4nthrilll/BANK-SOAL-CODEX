package Y;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: Y.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0110e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0111f f1857a;

    public C0110e(C0111f c0111f) {
        this.f1857a = c0111f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0111f c0111f = this.f1857a;
        c0111f.f1861b.setAlpha(iFloatValue);
        c0111f.f1862c.setAlpha(iFloatValue);
        c0111f.f1872n.invalidate();
    }
}
