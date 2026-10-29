package androidx.appcompat.widget;

import B.D;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import id.go.bangkalankab.simpeg.R;
import java.lang.reflect.Field;
import k.c1;
import p013d1.G2;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1996d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f1998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f1999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f2000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f2001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f2002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f2003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2006o;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p011d.a.f3534d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : G2.b(context, resourceId);
        Field field = D.f41a;
        setBackground(drawable);
        this.f2004m = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f2005n = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f1996d = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int b(View view, int i3, int i4, int i5, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = ((i5 - measuredHeight) / 2) + i4;
        if (z2) {
            view.layout(i3 - measuredWidth, i6, i3, measuredHeight + i6);
        } else {
            view.layout(i3, i6, i3 + measuredWidth, measuredHeight + i6);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f2001j == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2001j = linearLayout;
            this.f2002k = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f2003l = (TextView) this.f2001j.findViewById(R.id.action_bar_subtitle);
            int i3 = this.f2004m;
            if (i3 != 0) {
                this.f2002k.setTextAppearance(getContext(), i3);
            }
            int i4 = this.f2005n;
            if (i4 != 0) {
                this.f2003l.setTextAppearance(getContext(), i4);
            }
        }
        this.f2002k.setText(this.f1998g);
        this.f2003l.setText(this.f1999h);
        boolean zIsEmpty = TextUtils.isEmpty(this.f1998g);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f1999h);
        this.f2003l.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f2001j.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f2001j.getParent() == null) {
            addView(this.f2001j);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            super.setVisibility(i3);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1996d;
    }

    public CharSequence getSubtitle() {
        return this.f1999h;
    }

    public CharSequence getTitle() {
        return this.f1998g;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, p011d.a.f3531a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1997f = false;
        }
        if (!this.f1997f) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1997f = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1997f = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        boolean zA = c1.a(this);
        int paddingRight = zA ? (i5 - i3) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f2001j;
        if (linearLayout != null && this.f2000i == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f2001j, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view = this.f2000i;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, zA);
        }
        if (zA) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i4) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i3);
        int size2 = this.f1996d;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i4);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f2001j;
        if (linearLayout != null && this.f2000i == null) {
            if (this.f2006o) {
                this.f2001j.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f2001j.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f2001j.setVisibility(z2 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), iMakeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f2000i;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                iMin = Math.min(i7, iMin);
            }
            this.f2000i.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(iMin, i8));
        }
        if (this.f1996d > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e = false;
        }
        if (!this.e) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.e = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.e = false;
        }
        return true;
    }

    public void setContentHeight(int i3) {
        this.f1996d = i3;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2000i;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2000i = view;
        if (view != null && (linearLayout = this.f2001j) != null) {
            removeView(linearLayout);
            this.f2001j = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1999h = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1998g = charSequence;
        a();
        D.e(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f2006o) {
            requestLayout();
        }
        this.f2006o = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
