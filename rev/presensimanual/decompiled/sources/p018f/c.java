package p018f;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import p013d1.N2;
import p021g.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ObjectAnimator f4426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4427b;

    public c(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i3 = z2 ? numberOfFrames - 1 : 0;
        int i4 = z2 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f4429b = numberOfFrames2;
        int[] iArr = dVar.f4428a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f4428a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f4428a;
        int i5 = 0;
        for (int i6 = 0; i6 < numberOfFrames2; i6++) {
            int duration = animationDrawable.getDuration(z2 ? (numberOfFrames2 - i6) - 1 : i6);
            iArr2[i6] = duration;
            i5 += duration;
        }
        dVar.f4430c = i5;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i3, i4);
        a.a(objectAnimatorOfInt, true);
        objectAnimatorOfInt.setDuration(dVar.f4430c);
        objectAnimatorOfInt.setInterpolator(dVar);
        this.f4427b = z3;
        this.f4426a = objectAnimatorOfInt;
    }

    @Override // p013d1.N2
    public final boolean a() {
        return this.f4427b;
    }

    @Override // p013d1.N2
    public final void b() {
        this.f4426a.reverse();
    }

    @Override // p013d1.N2
    public final void c() {
        this.f4426a.start();
    }

    @Override // p013d1.N2
    public final void d() {
        this.f4426a.cancel();
    }
}
