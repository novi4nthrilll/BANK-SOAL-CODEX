package androidx.appcompat.widget;

import L0.g;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.lifecycle.y;
import k.AbstractC0721b0;
import k.C0719a0;
import k.C0728f;
import k.C0732h;
import k.C0734i;
import k.C0738k;
import k.InterfaceC0736j;
import k.InterfaceC0740l;
import k.c1;
import p032j.h;
import p032j.i;
import p032j.j;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends AbstractC0721b0 implements h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f2030A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InterfaceC0740l f2031B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f2032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f2033t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2034u;
    public C0734i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y f2035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2036x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2037y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f2038z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f2038z = (int) (56.0f * f3);
        this.f2030A = (int) (f3 * 4.0f);
        this.f2033t = context;
        this.f2034u = 0;
    }

    public static C0738k h() {
        C0738k c0738k = new C0738k(-2, -2);
        c0738k.f5207a = false;
        ((LinearLayout.LayoutParams) c0738k).gravity = 16;
        return c0738k;
    }

    public static C0738k i(ViewGroup.LayoutParams layoutParams) {
        C0738k c0738k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C0738k) {
            C0738k c0738k2 = (C0738k) layoutParams;
            c0738k = new C0738k(c0738k2);
            c0738k.f5207a = c0738k2.f5207a;
        } else {
            c0738k = new C0738k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0738k).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0738k).gravity = 16;
        }
        return c0738k;
    }

    @Override // p032j.h
    public final boolean a(j jVar) {
        return this.f2032s.p(jVar, null, 0);
    }

    @Override // k.AbstractC0721b0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0738k;
    }

    @Override // k.AbstractC0721b0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ C0719a0 generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // k.AbstractC0721b0
    /* JADX INFO: renamed from: e */
    public final C0719a0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0738k(getContext(), attributeSet);
    }

    @Override // k.AbstractC0721b0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ C0719a0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // k.AbstractC0721b0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // k.AbstractC0721b0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f2032s == null) {
            Context context = getContext();
            i iVar = new i(context);
            this.f2032s = iVar;
            iVar.e = new y(10, this);
            C0734i c0734i = new C0734i(context);
            this.v = c0734i;
            c0734i.f5173n = true;
            c0734i.f5174o = true;
            c0734i.f5167h = new g(9);
            this.f2032s.b(c0734i, this.f2033t);
            C0734i c0734i2 = this.v;
            c0734i2.f5169j = this;
            this.f2032s = c0734i2.f5165f;
        }
        return this.f2032s;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0734i c0734i = this.v;
        C0732h c0732h = c0734i.f5170k;
        if (c0732h != null) {
            return c0732h.getDrawable();
        }
        if (c0734i.f5172m) {
            return c0734i.f5171l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f2034u;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i3) {
        boolean zA = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof InterfaceC0736j)) {
            zA = ((InterfaceC0736j) childAt).a();
        }
        return (i3 <= 0 || !(childAt2 instanceof InterfaceC0736j)) ? zA : zA | ((InterfaceC0736j) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0734i c0734i = this.v;
        if (c0734i != null) {
            c0734i.f();
            C0728f c0728f = this.v.f5180u;
            if (c0728f == null || !c0728f.b()) {
                return;
            }
            this.v.g();
            this.v.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0734i c0734i = this.v;
        if (c0734i != null) {
            c0734i.g();
            C0728f c0728f = c0734i.v;
            if (c0728f == null || !c0728f.b()) {
                return;
            }
            c0728f.f4969i.dismiss();
        }
    }

    @Override // k.AbstractC0721b0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int width;
        int paddingLeft;
        if (!this.f2036x) {
            super.onLayout(z2, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i5 - i3;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean zA = c1.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0738k c0738k = (C0738k) childAt.getLayoutParams();
                if (c0738k.f5207a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0738k).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0738k).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0738k).leftMargin) + ((LinearLayout.LayoutParams) c0738k).rightMargin;
                    j(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int iMax = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0738k c0738k2 = (C0738k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0738k2.f5207a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) c0738k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0738k2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0738k c0738k3 = (C0738k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0738k3.f5207a) {
                int i20 = paddingLeft2 + ((LinearLayout.LayoutParams) c0738k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0738k3).rightMargin + iMax + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // k.AbstractC0721b0, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        ?? r4;
        int i8;
        i iVar;
        boolean z4 = this.f2036x;
        boolean z5 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.f2036x = z5;
        if (z4 != z5) {
            this.f2037y = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.f2036x && (iVar = this.f2032s) != null && size != this.f2037y) {
            this.f2037y = size;
            iVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f2036x || childCount <= 0) {
            for (int i9 = 0; i9 < childCount; i9++) {
                C0738k c0738k = (C0738k) getChildAt(i9).getLayoutParams();
                ((LinearLayout.LayoutParams) c0738k).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0738k).leftMargin = 0;
            }
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
        int i10 = size2 - paddingRight;
        int i11 = this.f2038z;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = (i13 / i12) + i11;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i15 = 0;
        int iMax2 = 0;
        int i16 = 0;
        boolean z6 = false;
        long j3 = 0;
        int i17 = 0;
        while (true) {
            i5 = this.f2030A;
            if (i16 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i16);
            int i18 = size3;
            int i19 = i10;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i20 = i15 + 1;
                if (z7) {
                    childAt.setPadding(i5, 0, i5, 0);
                }
                C0738k c0738k2 = (C0738k) childAt.getLayoutParams();
                c0738k2.f5211f = false;
                c0738k2.f5209c = 0;
                c0738k2.f5208b = 0;
                c0738k2.f5210d = false;
                ((LinearLayout.LayoutParams) c0738k2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0738k2).rightMargin = 0;
                c0738k2.e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i21 = c0738k2.f5207a ? 1 : i12;
                C0738k c0738k3 = (C0738k) childAt.getLayoutParams();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i21 <= 0 || (z8 && i21 < 2)) {
                    i8 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i21 * i14, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i8 = measuredWidth / i14;
                    if (measuredWidth % i14 != 0) {
                        i8++;
                    }
                    if (z8 && i8 < 2) {
                        i8 = 2;
                    }
                }
                c0738k3.f5210d = !c0738k3.f5207a && z8;
                c0738k3.f5208b = i8;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i14, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i8);
                if (c0738k2.f5210d) {
                    i17++;
                }
                if (c0738k2.f5207a) {
                    z6 = true;
                }
                i12 -= i8;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i8 == 1) {
                    j3 |= (long) (1 << i16);
                }
                i15 = i20;
            }
            i16++;
            size3 = i18;
            i10 = i19;
            paddingBottom = paddingBottom;
            mode = mode;
        }
        int i22 = mode;
        int i23 = i10;
        int i24 = size3;
        boolean z9 = z6 && i15 == 2;
        boolean z10 = false;
        while (true) {
            if (i17 <= 0 || i12 <= 0) {
                z2 = z10;
                break;
            }
            int i25 = Integer.MAX_VALUE;
            int i26 = 0;
            int i27 = 0;
            long j4 = 0;
            while (i27 < childCount2) {
                C0738k c0738k4 = (C0738k) getChildAt(i27).getLayoutParams();
                boolean z11 = z10;
                if (c0738k4.f5210d) {
                    int i28 = c0738k4.f5208b;
                    if (i28 < i25) {
                        j4 = 1 << i27;
                        i25 = i28;
                        i26 = 1;
                    } else if (i28 == i25) {
                        j4 |= 1 << i27;
                        i26++;
                    }
                }
                i27++;
                z10 = z11;
            }
            z2 = z10;
            j3 |= j4;
            if (i26 > i12) {
                break;
            }
            int i29 = i25 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                C0738k c0738k5 = (C0738k) childAt2.getLayoutParams();
                int i31 = iMax;
                int i32 = childMeasureSpec;
                int i33 = childCount2;
                long j5 = 1 << i30;
                if ((j4 & j5) != 0) {
                    if (z9 && c0738k5.e) {
                        r4 = 1;
                        r4 = 1;
                        if (i12 == 1) {
                            childAt2.setPadding(i5 + i14, 0, i5, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0738k5.f5208b += r4;
                    c0738k5.f5211f = r4;
                    i12--;
                } else if (c0738k5.f5208b == i29) {
                    j3 |= j5;
                }
                i30++;
                childMeasureSpec = i32;
                iMax = i31;
                childCount2 = i33;
            }
            z10 = true;
        }
        int i34 = iMax;
        int i35 = childMeasureSpec;
        int i36 = childCount2;
        boolean z12 = !z6 && i15 == 1;
        if (i12 <= 0 || j3 == 0 || (i12 >= i15 - 1 && !z12 && iMax2 <= 1)) {
            i6 = i36;
            z3 = z2;
        } else {
            float fBitCount = Long.bitCount(j3);
            if (!z12) {
                if ((j3 & 1) != 0 && !((C0738k) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i37 = i36 - 1;
                if ((j3 & ((long) (1 << i37))) != 0 && !((C0738k) getChildAt(i37).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i38 = fBitCount > 0.0f ? (int) ((i12 * i14) / fBitCount) : 0;
            boolean z13 = z2;
            i6 = i36;
            for (int i39 = 0; i39 < i6; i39++) {
                if ((j3 & ((long) (1 << i39))) != 0) {
                    View childAt3 = getChildAt(i39);
                    C0738k c0738k6 = (C0738k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0738k6.f5209c = i38;
                        c0738k6.f5211f = true;
                        if (i39 == 0 && !c0738k6.e) {
                            ((LinearLayout.LayoutParams) c0738k6).leftMargin = (-i38) / 2;
                        }
                        z13 = true;
                    } else if (c0738k6.f5207a) {
                        c0738k6.f5209c = i38;
                        c0738k6.f5211f = true;
                        ((LinearLayout.LayoutParams) c0738k6).rightMargin = (-i38) / 2;
                        z13 = true;
                    } else {
                        if (i39 != 0) {
                            ((LinearLayout.LayoutParams) c0738k6).leftMargin = i38 / 2;
                        }
                        if (i39 != i6 - 1) {
                            ((LinearLayout.LayoutParams) c0738k6).rightMargin = i38 / 2;
                        }
                    }
                }
            }
            z3 = z13;
        }
        if (z3) {
            int i40 = 0;
            while (i40 < i6) {
                View childAt4 = getChildAt(i40);
                C0738k c0738k7 = (C0738k) childAt4.getLayoutParams();
                if (c0738k7.f5211f) {
                    i7 = i35;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0738k7.f5208b * i14) + c0738k7.f5209c, 1073741824), i7);
                } else {
                    i7 = i35;
                }
                i40++;
                i35 = i7;
            }
        }
        setMeasuredDimension(i23, i22 != 1073741824 ? i34 : i24);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.v.f5178s = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0740l interfaceC0740l) {
        this.f2031B = interfaceC0740l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0734i c0734i = this.v;
        C0732h c0732h = c0734i.f5170k;
        if (c0732h != null) {
            c0732h.setImageDrawable(drawable);
        } else {
            c0734i.f5172m = true;
            c0734i.f5171l = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
    }

    public void setPopupTheme(int i3) {
        if (this.f2034u != i3) {
            this.f2034u = i3;
            if (i3 == 0) {
                this.f2033t = getContext();
            } else {
                this.f2033t = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(C0734i c0734i) {
        this.v = c0734i;
        c0734i.f5169j = this;
        this.f2032s = c0734i.f5165f;
    }

    @Override // k.AbstractC0721b0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0738k(getContext(), attributeSet);
    }
}
