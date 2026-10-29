package androidx.appcompat.widget;

import B.D;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import id.go.bangkalankab.simpeg.R;
import java.lang.reflect.Field;
import k.AbstractC0758u0;
import k.C0718a;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1988d;
    public View e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f1989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f1990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f1991h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f1992i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1993j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1994k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1995l;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0718a c0718a = new C0718a(this);
        Field field = D.f41a;
        setBackground(c0718a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p011d.a.f3531a);
        boolean z2 = false;
        this.f1990g = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f1991h = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f1995l = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1993j = true;
            this.f1992i = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f1993j ? !(this.f1990g != null || this.f1991h != null) : this.f1992i == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1990g;
        if (drawable != null && drawable.isStateful()) {
            this.f1990g.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1991h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1991h.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1992i;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1992i.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1990g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1991h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1992i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e = findViewById(R.id.action_bar);
        this.f1989f = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1988d || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        boolean z3 = true;
        if (this.f1993j) {
            Drawable drawable = this.f1992i;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1990g == null) {
                z3 = false;
            } else if (this.e.getVisibility() == 0) {
                this.f1990g.setBounds(this.e.getLeft(), this.e.getTop(), this.e.getRight(), this.e.getBottom());
            } else {
                View view = this.f1989f;
                if (view == null || view.getVisibility() != 0) {
                    this.f1990g.setBounds(0, 0, 0, 0);
                } else {
                    this.f1990g.setBounds(this.f1989f.getLeft(), this.f1989f.getTop(), this.f1989f.getRight(), this.f1989f.getBottom());
                }
            }
            this.f1994k = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.e == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f1995l) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i4);
        if (this.e == null) {
            return;
        }
        View.MeasureSpec.getMode(i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1990g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1990g);
        }
        this.f1990g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.e;
            if (view != null) {
                this.f1990g.setBounds(view.getLeft(), this.e.getTop(), this.e.getRight(), this.e.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1993j ? !(this.f1990g != null || this.f1991h != null) : this.f1992i == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1992i;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1992i);
        }
        this.f1992i = drawable;
        boolean z2 = this.f1993j;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1992i) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f1990g != null || this.f1991h != null) : this.f1992i == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1991h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1991h);
        }
        this.f1991h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1994k && this.f1991h != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1993j ? !(this.f1990g != null || this.f1991h != null) : this.f1992i == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f1988d = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z2 = i3 == 0;
        Drawable drawable = this.f1990g;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1991h;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1992i;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1990g;
        boolean z2 = this.f1993j;
        return (drawable == drawable2 && !z2) || (drawable == this.f1991h && this.f1994k) || ((drawable == this.f1992i && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }

    public void setTabContainer(AbstractC0758u0 abstractC0758u0) {
    }
}
