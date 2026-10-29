package u;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import p013d1.AbstractC0520s3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Drawable implements Drawable.Callback, h, g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f5738j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Method f5739k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5740d;
    public PorterDuff.Mode e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f5742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f5744i;

    public static void a() {
        if (f5739k == null) {
            try {
                f5739k = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f5744i;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final j c() {
        j jVar = this.f5742g;
        j jVar2 = new j();
        jVar2.f5747c = null;
        jVar2.f5748d = f5738j;
        if (jVar != null) {
            jVar2.f5745a = jVar.f5745a;
            jVar2.f5746b = jVar.f5746b;
            jVar2.f5747c = jVar.f5747c;
            jVar2.f5748d = jVar.f5748d;
        }
        return jVar2;
    }

    public final boolean d(int[] iArr) {
        return i(iArr) || this.f5744i.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f5744i.draw(canvas);
    }

    public final void e(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    public final void f(ColorStateList colorStateList) {
        this.f5742g.f5747c = colorStateList;
        i(this.f5744i.getState());
    }

    public final void g(PorterDuff.Mode mode) {
        this.f5742g.f5748d = mode;
        i(this.f5744i.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        j jVar = this.f5742g;
        return changingConfigurations | (jVar != null ? jVar.getChangingConfigurations() : 0) | this.f5744i.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        j jVar = this.f5742g;
        if (jVar == null || jVar.f5746b == null) {
            return null;
        }
        jVar.f5745a = getChangingConfigurations();
        return this.f5742g;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f5744i.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f5744i.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f5744i.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f5744i.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return AbstractC0520s3.a(this.f5744i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f5744i.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f5744i.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f5744i.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f5744i.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f5744i.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f5744i.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f5744i.getTransparentRegion();
    }

    public final void h(Drawable drawable) {
        Drawable drawable2 = this.f5744i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5744i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            j jVar = this.f5742g;
            if (jVar != null) {
                jVar.f5746b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean i(int[] iArr) {
        if (!b()) {
            return false;
        }
        j jVar = this.f5742g;
        ColorStateList colorStateList = jVar.f5747c;
        PorterDuff.Mode mode = jVar.f5748d;
        if (colorStateList == null || mode == null) {
            this.f5741f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f5741f || colorForState != this.f5740d || mode != this.e) {
                setColorFilter(colorForState, mode);
                this.f5740d = colorForState;
                this.e = mode;
                this.f5741f = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f5744i.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f5744i;
        if (drawable == null || (method = f5739k) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception e) {
            Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        j jVar;
        ColorStateList colorStateList = (!b() || (jVar = this.f5742g) == null) ? null : jVar.f5747c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f5744i.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f5744i.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f5743h && super.mutate() == this) {
            this.f5742g = c();
            Drawable drawable = this.f5744i;
            if (drawable != null) {
                drawable.mutate();
            }
            j jVar = this.f5742g;
            if (jVar != null) {
                Drawable drawable2 = this.f5744i;
                jVar.f5746b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f5743h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5744i;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i3) {
        return AbstractC0520s3.b(this.f5744i, i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        return this.f5744i.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.f5744i.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        this.f5744i.setAutoMirrored(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i3) {
        this.f5744i.setChangingConfigurations(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5744i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        this.f5744i.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.f5744i.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f3, float f4) {
        this.f5744i.setHotspot(f3, f4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i3, int i4, int i5, int i6) {
        this.f5744i.setHotspotBounds(i3, i4, i5, i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!d(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        if (b()) {
            e(i3);
        } else {
            this.f5744i.setTint(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            f(colorStateList);
        } else {
            this.f5744i.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            g(mode);
        } else {
            this.f5744i.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f5744i.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
