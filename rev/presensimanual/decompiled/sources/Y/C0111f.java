package Y;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: renamed from: Y.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0111f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f1858x = {R.attr.state_pressed};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f1859y = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateListDrawable f1861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f1862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1863d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StateListDrawable f1864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Drawable f1865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f1868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f1869k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecyclerView f1872n;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ValueAnimator f1879u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final E0.l f1880w;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1870l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1871m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f1873o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1874p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1875q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1876r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f1877s = new int[2];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f1878t = new int[2];

    public C0111f(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i3, int i4, int i5) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1879u = valueAnimatorOfFloat;
        this.v = 0;
        E0.l lVar = new E0.l(7, this);
        this.f1880w = lVar;
        C0108c c0108c = new C0108c();
        this.f1861b = stateListDrawable;
        this.f1862c = drawable;
        this.f1864f = stateListDrawable2;
        this.f1865g = drawable2;
        this.f1863d = Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.e = Math.max(i3, drawable.getIntrinsicWidth());
        this.f1866h = Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.f1867i = Math.max(i3, drawable2.getIntrinsicWidth());
        this.f1860a = i5;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C0109d(this));
        valueAnimatorOfFloat.addUpdateListener(new C0110e(this));
        RecyclerView recyclerView2 = this.f1872n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            s sVar = recyclerView2.f2479l;
            if (sVar != null) {
                sVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f2480m;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f1872n;
            recyclerView3.f2481n.remove(this);
            if (recyclerView3.f2482o == this) {
                recyclerView3.f2482o = null;
            }
            ArrayList arrayList2 = this.f1872n.f2464b0;
            if (arrayList2 != null) {
                arrayList2.remove(c0108c);
            }
            this.f1872n.removeCallbacks(lVar);
        }
        this.f1872n = recyclerView;
        if (recyclerView != null) {
            s sVar2 = recyclerView.f2479l;
            if (sVar2 != null) {
                sVar2.a("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f2480m;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m();
            recyclerView.requestLayout();
            this.f1872n.f2481n.add(this);
            RecyclerView recyclerView4 = this.f1872n;
            if (recyclerView4.f2464b0 == null) {
                recyclerView4.f2464b0 = new ArrayList();
            }
            recyclerView4.f2464b0.add(c0108c);
        }
    }

    public static int d(float f3, float f4, int[] iArr, int i3, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 == 0) {
            return 0;
        }
        int i7 = i3 - i5;
        int i8 = (int) (((f4 - f3) / i6) * i7);
        int i9 = i4 + i8;
        if (i9 >= i7 || i9 < 0) {
            return 0;
        }
        return i8;
    }

    public final boolean a(float f3, float f4) {
        return f4 >= ((float) (this.f1871m - this.f1866h)) && f3 >= ((float) (0 - (0 / 2))) && f3 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f3, float f4) {
        RecyclerView recyclerView = this.f1872n;
        Field field = B.D.f41a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i3 = this.f1863d;
        if (z2) {
            if (f3 > i3 / 2) {
                return false;
            }
        } else if (f3 < this.f1870l - i3) {
            return false;
        }
        int i4 = 0 / 2;
        return f4 >= ((float) (0 - i4)) && f4 <= ((float) (i4 + 0));
    }

    public final boolean c(MotionEvent motionEvent) {
        int i3 = this.f1875q;
        if (i3 == 1) {
            boolean zB = b(motionEvent.getX(), motionEvent.getY());
            boolean zA = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zB && !zA) {
                return false;
            }
            if (zA) {
                this.f1876r = 1;
                this.f1869k = (int) motionEvent.getX();
            } else if (zB) {
                this.f1876r = 2;
                this.f1868j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i3 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i3) {
        E0.l lVar = this.f1880w;
        StateListDrawable stateListDrawable = this.f1861b;
        if (i3 == 2 && this.f1875q != 2) {
            stateListDrawable.setState(f1858x);
            this.f1872n.removeCallbacks(lVar);
        }
        if (i3 == 0) {
            this.f1872n.invalidate();
        } else {
            f();
        }
        if (this.f1875q == 2 && i3 != 2) {
            stateListDrawable.setState(f1859y);
            this.f1872n.removeCallbacks(lVar);
            this.f1872n.postDelayed(lVar, 1200);
        } else if (i3 == 1) {
            this.f1872n.removeCallbacks(lVar);
            this.f1872n.postDelayed(lVar, 1500);
        }
        this.f1875q = i3;
    }

    public final void f() {
        int i3 = this.v;
        ValueAnimator valueAnimator = this.f1879u;
        if (i3 != 0) {
            if (i3 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
