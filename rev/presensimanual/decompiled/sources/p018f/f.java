package p018f;

import E0.l;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import c0.b;
import p013d1.AbstractC0520s3;
import u.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f4437p = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f4438d;
    public Rect e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f4439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f4440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l f4445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f4448o;

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void a(boolean z2) {
        boolean z3;
        Drawable drawable;
        long j3;
        boolean z4 = true;
        this.f4442i = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f4439f;
        if (drawable2 != null) {
            long j4 = this.f4446m;
            if (j4 != 0) {
                if (j4 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f4441h);
                    this.f4446m = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j4 - jUptimeMillis) * 255)) / this.f4438d.f4424y)) * this.f4441h) / 255);
                    z3 = true;
                }
            }
            drawable = this.f4440g;
            if (drawable != null) {
                j3 = this.f4447n;
                if (j3 == 0) {
                    if (j3 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f4440g = null;
                        this.f4447n = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j3 - jUptimeMillis) * 255)) / this.f4438d.f4425z) * this.f4441h) / 255);
                    }
                }
                if (z2 || !z4) {
                }
                scheduleSelf(this.f4445l, jUptimeMillis + 16);
                return;
            }
            this.f4447n = 0L;
            z4 = z3;
            if (z2) {
            }
        }
        this.f4446m = 0L;
        z3 = false;
        drawable = this.f4440g;
        if (drawable != null) {
            j3 = this.f4447n;
            if (j3 == 0) {
                if (j3 <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f4440g = null;
                    this.f4447n = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j3 - jUptimeMillis) * 255)) / this.f4438d.f4425z) * this.f4441h) / 255);
                }
            }
            if (z2) {
            }
        }
        this.f4447n = 0L;
        z4 = z3;
        if (z2) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f4438d;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i3 = bVar.f4408h;
        Drawable[] drawableArr = bVar.f4407g;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null && a.b(drawable)) {
                a.a(drawableArr[i4], theme);
                bVar.e |= drawableArr[i4].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.f4403b = resources;
            int i5 = resources.getDisplayMetrics().densityDpi;
            if (i5 == 0) {
                i5 = 160;
            }
            int i6 = bVar.f4404c;
            bVar.f4404c = i5;
            if (i6 != i5) {
                bVar.f4413m = false;
                bVar.f4410j = false;
            }
        }
    }

    public final void b(Drawable drawable) {
        if (this.f4448o == null) {
            this.f4448o = new b();
        }
        b bVar = this.f4448o;
        bVar.e = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f4438d.f4424y <= 0 && this.f4442i) {
                drawable.setAlpha(this.f4441h);
            }
            b bVar2 = this.f4438d;
            if (bVar2.f4394C) {
                drawable.setColorFilter(bVar2.f4393B);
            } else {
                if (bVar2.f4397F) {
                    a.h(drawable, bVar2.f4395D);
                }
                b bVar3 = this.f4438d;
                if (bVar3.f4398G) {
                    a.i(drawable, bVar3.f4396E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f4438d.f4422w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC0520s3.b(drawable, AbstractC0520s3.a(this));
            }
            drawable.setAutoMirrored(this.f4438d.f4392A);
            Rect rect = this.e;
            if (rect != null) {
                a.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            b bVar4 = this.f4448o;
            Drawable.Callback callback = (Drawable.Callback) bVar4.e;
            bVar4.e = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public final boolean c(int i3) {
        if (i3 == this.f4443j) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f4438d.f4425z > 0) {
            Drawable drawable = this.f4440g;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f4439f;
            if (drawable2 != null) {
                this.f4440g = drawable2;
                this.f4447n = ((long) this.f4438d.f4425z) + jUptimeMillis;
            } else {
                this.f4440g = null;
                this.f4447n = 0L;
            }
        } else {
            Drawable drawable3 = this.f4439f;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i3 >= 0) {
            b bVar = this.f4438d;
            if (i3 < bVar.f4408h) {
                Drawable drawableD = bVar.d(i3);
                this.f4439f = drawableD;
                this.f4443j = i3;
                if (drawableD != null) {
                    int i4 = this.f4438d.f4424y;
                    if (i4 > 0) {
                        this.f4446m = jUptimeMillis + ((long) i4);
                    }
                    b(drawableD);
                }
            } else {
                this.f4439f = null;
                this.f4443j = -1;
            }
        } else {
            this.f4439f = null;
            this.f4443j = -1;
        }
        if (this.f4446m != 0 || this.f4447n != 0) {
            l lVar = this.f4445l;
            if (lVar == null) {
                this.f4445l = new l(10, (e) this);
            } else {
                unscheduleSelf(lVar);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f4438d.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4439f;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f4440g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4441h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f4438d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z2;
        b bVar = this.f4438d;
        if (!bVar.f4421u) {
            bVar.c();
            bVar.f4421u = true;
            int i3 = bVar.f4408h;
            Drawable[] drawableArr = bVar.f4407g;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    bVar.v = true;
                    z2 = true;
                    break;
                }
                if (drawableArr[i4].getConstantState() == null) {
                    bVar.v = false;
                    z2 = false;
                    break;
                }
                i4++;
            }
        } else {
            z2 = bVar.v;
        }
        if (!z2) {
            return null;
        }
        this.f4438d.f4405d = getChangingConfigurations();
        return this.f4438d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f4439f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.e;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f4438d;
        if (bVar.f4412l) {
            if (!bVar.f4413m) {
                bVar.b();
            }
            return bVar.f4415o;
        }
        Drawable drawable = this.f4439f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f4438d;
        if (bVar.f4412l) {
            if (!bVar.f4413m) {
                bVar.b();
            }
            return bVar.f4414n;
        }
        Drawable drawable = this.f4439f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f4438d;
        if (bVar.f4412l) {
            if (!bVar.f4413m) {
                bVar.b();
            }
            return bVar.f4417q;
        }
        Drawable drawable = this.f4439f;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f4438d;
        if (bVar.f4412l) {
            if (!bVar.f4413m) {
                bVar.b();
            }
            return bVar.f4416p;
        }
        Drawable drawable = this.f4439f;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4439f;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        b bVar = this.f4438d;
        if (bVar.f4418r) {
            return bVar.f4419s;
        }
        bVar.c();
        int i3 = bVar.f4408h;
        Drawable[] drawableArr = bVar.f4407g;
        int opacity = i3 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i4 = 1; i4 < i3; i4++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i4].getOpacity());
        }
        bVar.f4419s = opacity;
        bVar.f4418r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f4439f;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f4438d;
        boolean padding = false;
        Rect rect2 = null;
        if (!bVar.f4409i) {
            Rect rect3 = bVar.f4411k;
            if (rect3 != null || bVar.f4410j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i3 = bVar.f4408h;
                Drawable[] drawableArr = bVar.f4407g;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (drawableArr[i4].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i5 = rect4.left;
                        if (i5 > rect2.left) {
                            rect2.left = i5;
                        }
                        int i6 = rect4.top;
                        if (i6 > rect2.top) {
                            rect2.top = i6;
                        }
                        int i7 = rect4.right;
                        if (i7 > rect2.right) {
                            rect2.right = i7;
                        }
                        int i8 = rect4.bottom;
                        if (i8 > rect2.bottom) {
                            rect2.bottom = i8;
                        }
                    }
                }
                bVar.f4410j = true;
                bVar.f4411k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f4439f;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f4438d.f4392A && AbstractC0520s3.a(this) == 1) {
            int i9 = rect.left;
            rect.left = rect.right;
            rect.right = i9;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f4438d;
        if (bVar != null) {
            bVar.f4418r = false;
            bVar.f4420t = false;
        }
        if (drawable != this.f4439f || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f4438d.f4392A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f4440g;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f4440g = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f4439f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f4442i) {
                this.f4439f.setAlpha(this.f4441h);
            }
        }
        if (this.f4447n != 0) {
            this.f4447n = 0L;
            z2 = true;
        }
        if (this.f4446m != 0) {
            this.f4446m = 0L;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f4444k && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.f4433s, eVar, null);
            bVar.f4400I = bVar.f4400I.clone();
            bVar.f4401J = bVar.f4401J.clone();
            d(bVar);
            this.f4444k = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4440g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f4439f;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i3) {
        b bVar = this.f4438d;
        int i4 = this.f4443j;
        int i5 = bVar.f4408h;
        Drawable[] drawableArr = bVar.f4407g;
        boolean z2 = false;
        for (int i6 = 0; i6 < i5; i6++) {
            Drawable drawable = drawableArr[i6];
            if (drawable != null) {
                boolean zB = Build.VERSION.SDK_INT >= 23 ? AbstractC0520s3.b(drawable, i3) : false;
                if (i6 == i4) {
                    z2 = zB;
                }
            }
        }
        bVar.f4423x = i3;
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        Drawable drawable = this.f4440g;
        if (drawable != null) {
            return drawable.setLevel(i3);
        }
        Drawable drawable2 = this.f4439f;
        if (drawable2 != null) {
            return drawable2.setLevel(i3);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        if (drawable != this.f4439f || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        if (this.f4442i && this.f4441h == i3) {
            return;
        }
        this.f4442i = true;
        this.f4441h = i3;
        Drawable drawable = this.f4439f;
        if (drawable != null) {
            if (this.f4446m == 0) {
                drawable.setAlpha(i3);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        b bVar = this.f4438d;
        if (bVar.f4392A != z2) {
            bVar.f4392A = z2;
            Drawable drawable = this.f4439f;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f4438d;
        bVar.f4394C = true;
        if (bVar.f4393B != colorFilter) {
            bVar.f4393B = colorFilter;
            Drawable drawable = this.f4439f;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        b bVar = this.f4438d;
        if (bVar.f4422w != z2) {
            bVar.f4422w = z2;
            Drawable drawable = this.f4439f;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f3, float f4) {
        Drawable drawable = this.f4439f;
        if (drawable != null) {
            a.e(drawable, f3, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i3, int i4, int i5, int i6) {
        Rect rect = this.e;
        if (rect == null) {
            this.e = new Rect(i3, i4, i5, i6);
        } else {
            rect.set(i3, i4, i5, i6);
        }
        Drawable drawable = this.f4439f;
        if (drawable != null) {
            a.f(drawable, i3, i4, i5, i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f4438d;
        bVar.f4397F = true;
        if (bVar.f4395D != colorStateList) {
            bVar.f4395D = colorStateList;
            a.h(this.f4439f, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f4438d;
        bVar.f4398G = true;
        if (bVar.f4396E != mode) {
            bVar.f4396E = mode;
            a.i(this.f4439f, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f4440g;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f4439f;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f4439f || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
