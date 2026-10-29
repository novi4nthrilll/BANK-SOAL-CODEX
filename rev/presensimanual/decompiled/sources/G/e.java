package G;

import B.D;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.lang.reflect.Field;
import k.X;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f291u = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f292d;
    public final AccelerateInterpolator e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ListView f293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E0.l f294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float[] f300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float[] f301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final X f307t;

    public e(X x3) {
        a aVar = new a();
        aVar.e = Long.MIN_VALUE;
        aVar.f288g = -1L;
        aVar.f287f = 0L;
        this.f292d = aVar;
        this.e = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f295h = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f296i = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f299l = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f300m = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f301n = fArr5;
        this.f293f = x3;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        this.f297j = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f298k = f291u;
        aVar.f283a = 500;
        aVar.f284b = 500;
        this.f307t = x3;
    }

    public static float b(float f3, float f4, float f5) {
        if (f3 > f5) {
            return f5;
        }
        return f3 < f4 ? f4 : f3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    public final float a(int i3, float f3, float f4, float f5) {
        float fB;
        float interpolation;
        float fB2 = b(this.f295h[i3] * f4, 0.0f, this.f296i[i3]);
        float fC = c(f4 - f3, fB2) - c(f3, fB2);
        AccelerateInterpolator accelerateInterpolator = this.e;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f6 = this.f299l[i3];
            float f7 = this.f300m[i3];
            float f8 = this.f301n[i3];
            float f9 = f6 * f5;
            return fB > 0.0f ? b(fB * f9, f7, f8) : -b((-fB) * f9, f7, f8);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f10 = this.f299l[i3];
        float f11 = this.f300m[i3];
        float f12 = this.f301n[i3];
        float f13 = f10 * f5;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f3, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        int i3 = this.f297j;
        if (i3 == 0 || i3 == 1) {
            if (f3 < f4) {
                if (f3 >= 0.0f) {
                    return 1.0f - (f3 / f4);
                }
                if (this.f305r && i3 == 1) {
                    return 1.0f;
                }
            }
        } else if (i3 == 2 && f3 < 0.0f) {
            return f3 / (-f4);
        }
        return 0.0f;
    }

    public final void d() {
        int i3 = 0;
        if (this.f303p) {
            this.f305r = false;
            return;
        }
        a aVar = this.f292d;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i4 = (int) (jCurrentAnimationTimeMillis - aVar.e);
        int i5 = aVar.f284b;
        if (i4 > i5) {
            i3 = i5;
        } else if (i4 >= 0) {
            i3 = i4;
        }
        aVar.f290i = i3;
        aVar.f289h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f288g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        X x3;
        int count;
        a aVar = this.f292d;
        float f3 = aVar.f286d;
        int iAbs = (int) (f3 / Math.abs(f3));
        Math.abs(aVar.f285c);
        if (iAbs == 0 || (count = (x3 = this.f307t).getCount()) == 0) {
            return false;
        }
        int childCount = x3.getChildCount();
        int firstVisiblePosition = x3.getFirstVisiblePosition();
        int i3 = firstVisiblePosition + childCount;
        if (iAbs > 0) {
            if (i3 >= count && x3.getChildAt(childCount - 1).getBottom() <= x3.getHeight()) {
                return false;
            }
        } else {
            if (iAbs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && x3.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i3;
        int i4 = 1;
        if (!this.f306s) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                d();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    d();
                }
            }
            return false;
        }
        this.f304q = true;
        this.f302o = false;
        float x3 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f293f;
        float fA = a(0, x3, width, listView.getWidth());
        float fA2 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        a aVar = this.f292d;
        aVar.f285c = fA;
        aVar.f286d = fA2;
        if (!this.f305r && e()) {
            if (this.f294g == null) {
                this.f294g = new E0.l(i4, this);
            }
            this.f305r = true;
            this.f303p = true;
            if (this.f302o || (i3 = this.f298k) <= 0) {
                this.f294g.run();
            } else {
                E0.l lVar = this.f294g;
                long j3 = i3;
                Field field = D.f41a;
                listView.postOnAnimationDelayed(lVar, j3);
            }
            this.f302o = true;
        }
        return false;
    }
}
