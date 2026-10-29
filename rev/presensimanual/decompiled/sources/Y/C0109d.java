package Y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: Y.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0109d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1855a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0111f f1856b;

    public C0109d(C0111f c0111f) {
        this.f1856b = c0111f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1855a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f1855a) {
            this.f1855a = false;
            return;
        }
        C0111f c0111f = this.f1856b;
        if (((Float) c0111f.f1879u.getAnimatedValue()).floatValue() == 0.0f) {
            c0111f.v = 0;
            c0111f.e(0);
        } else {
            c0111f.v = 2;
            c0111f.f1872n.invalidate();
        }
    }
}
