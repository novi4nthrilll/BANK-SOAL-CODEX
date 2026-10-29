package androidx.appcompat.widget;

import B.AbstractC0018t;
import B.AbstractC0020v;
import B.C0011l;
import B.D;
import B.InterfaceC0009j;
import B.InterfaceC0010k;
import B.K;
import B.M;
import B.O;
import B.W;
import B.X;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import id.go.bangkalankab.simpeg.R;
import java.lang.reflect.Field;
import k.C0720b;
import k.C0726e;
import k.InterfaceC0724d;
import k.N;
import k.RunnableC0722c;
import k.V0;
import p013d1.G2;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0009j, InterfaceC0010k {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f2007B = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0011l f2008A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2009d;
    public ContentFrameLayout e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContainer f2010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public N f2011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f2012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f2019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f2020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f2021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public X f2022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public X f2023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public X f2024t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public X f2025u;
    public OverScroller v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f2026w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0720b f2027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RunnableC0722c f2028y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RunnableC0722c f2029z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2019o = new Rect();
        this.f2020p = new Rect();
        this.f2021q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        X x3 = X.f66b;
        this.f2022r = x3;
        this.f2023s = x3;
        this.f2024t = x3;
        this.f2025u = x3;
        this.f2027x = new C0720b(this);
        this.f2028y = new RunnableC0722c(this, 0);
        this.f2029z = new RunnableC0722c(this, 1);
        i(context);
        this.f2008A = new C0011l(0);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0726e c0726e = (C0726e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0726e).leftMargin;
        int i4 = rect.left;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0726e).leftMargin = i4;
            z3 = true;
        } else {
            z3 = false;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0726e).topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0726e).topMargin = i6;
            z3 = true;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) c0726e).rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c0726e).rightMargin = i8;
            z3 = true;
        }
        if (z2) {
            int i9 = ((ViewGroup.MarginLayoutParams) c0726e).bottomMargin;
            int i10 = rect.bottom;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) c0726e).bottomMargin = i10;
                return true;
            }
        }
        return z3;
    }

    @Override // B.InterfaceC0009j
    public final void a(View view, View view2, int i3, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    @Override // B.InterfaceC0009j
    public final void b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(viewGroup, i3, i4, i5, i6);
        }
    }

    @Override // B.InterfaceC0009j
    public final void c(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0726e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f2012h == null || this.f2013i) {
            return;
        }
        if (this.f2010f.getVisibility() == 0) {
            translationY = (int) (this.f2010f.getTranslationY() + this.f2010f.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f2012h.setBounds(0, translationY, getWidth(), this.f2012h.getIntrinsicHeight() + translationY);
        this.f2012h.draw(canvas);
    }

    @Override // B.InterfaceC0010k
    public final void e(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        b(viewGroup, i3, i4, i5, i6, i7);
    }

    @Override // B.InterfaceC0009j
    public final boolean f(View view, View view2, int i3, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i3);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0726e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0726e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2010f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0011l c0011l = this.f2008A;
        return c0011l.f90c | c0011l.f89b;
    }

    public CharSequence getTitle() {
        j();
        return ((V0) this.f2011g).f5094a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f2028y);
        removeCallbacks(this.f2029z);
        ViewPropertyAnimator viewPropertyAnimator = this.f2026w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2007B);
        this.f2009d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f2012h = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f2013i = context.getApplicationInfo().targetSdkVersion < 19;
        this.v = new OverScroller(context);
    }

    public final void j() {
        N wrapper;
        if (this.e == null) {
            this.e = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f2010f = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof N) {
                wrapper = (N) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f2011g = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        X xC = X.c(windowInsets, this);
        W w3 = xC.f67a;
        boolean zG = g(this.f2010f, new Rect(w3.g().f5672a, w3.g().f5673b, w3.g().f5674c, w3.g().f5675d), false);
        Field field = D.f41a;
        Rect rect = this.f2019o;
        AbstractC0020v.b(this, xC, rect);
        X xH = w3.h(rect.left, rect.top, rect.right, rect.bottom);
        this.f2022r = xH;
        boolean z2 = true;
        if (!this.f2023s.equals(xH)) {
            this.f2023s = this.f2022r;
            zG = true;
        }
        Rect rect2 = this.f2020p;
        if (rect2.equals(rect)) {
            z2 = zG;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return w3.a().f67a.c().f67a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = D.f41a;
        AbstractC0018t.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0726e c0726e = (C0726e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) c0726e).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) c0726e).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int measuredHeight;
        O m3;
        j();
        measureChildWithMargins(this.f2010f, i3, 0, i4, 0);
        C0726e c0726e = (C0726e) this.f2010f.getLayoutParams();
        int iMax = Math.max(0, this.f2010f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0726e).leftMargin + ((ViewGroup.MarginLayoutParams) c0726e).rightMargin);
        int iMax2 = Math.max(0, this.f2010f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0726e).topMargin + ((ViewGroup.MarginLayoutParams) c0726e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2010f.getMeasuredState());
        Field field = D.f41a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f2009d;
            if (this.f2015k && this.f2010f.getTabContainer() != null) {
                measuredHeight += this.f2009d;
            }
        } else {
            measuredHeight = this.f2010f.getVisibility() != 8 ? this.f2010f.getMeasuredHeight() : 0;
        }
        Rect rect = this.f2019o;
        Rect rect2 = this.f2021q;
        rect2.set(rect);
        X x3 = this.f2022r;
        this.f2024t = x3;
        if (this.f2014j || z2) {
            p064t.c cVarA = p064t.c.a(x3.f67a.g().f5672a, this.f2024t.f67a.g().f5673b + measuredHeight, this.f2024t.f67a.g().f5674c, this.f2024t.f67a.g().f5675d);
            X x4 = this.f2024t;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                m3 = new B.N(x4);
            } else {
                m3 = i5 >= 29 ? new M(x4) : new K(x4);
            }
            m3.d(cVarA);
            this.f2024t = m3.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f2024t = x3.f67a.h(0, measuredHeight, 0, 0);
        }
        g(this.e, rect2, true);
        if (!this.f2025u.equals(this.f2024t)) {
            X x5 = this.f2024t;
            this.f2025u = x5;
            ContentFrameLayout contentFrameLayout = this.e;
            WindowInsets windowInsetsB = x5.b();
            if (windowInsetsB != null) {
                WindowInsets windowInsetsA = AbstractC0018t.a(contentFrameLayout, windowInsetsB);
                if (!windowInsetsA.equals(windowInsetsB)) {
                    X.c(windowInsetsA, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.e, i3, 0, i4, 0);
        C0726e c0726e2 = (C0726e) this.e.getLayoutParams();
        int iMax3 = Math.max(iMax, this.e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0726e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0726e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0726e2).topMargin + ((ViewGroup.MarginLayoutParams) c0726e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i3, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i4, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        if (!this.f2016l || !z2) {
            return false;
        }
        this.v.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.v.getFinalY() > this.f2010f.getHeight()) {
            h();
            this.f2029z.run();
        } else {
            h();
            this.f2028y.run();
        }
        this.f2017m = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        int i7 = this.f2018n + i4;
        this.f2018n = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.f2008A.f89b = i3;
        this.f2018n = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.f2010f.getVisibility() != 0) {
            return false;
        }
        return this.f2016l;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f2016l || this.f2017m) {
            return;
        }
        if (this.f2018n <= this.f2010f.getHeight()) {
            h();
            postDelayed(this.f2028y, 600L);
        } else {
            h();
            postDelayed(this.f2029z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
    }

    public void setActionBarHideOffset(int i3) {
        h();
        this.f2010f.setTranslationY(-Math.max(0, Math.min(i3, this.f2010f.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0724d interfaceC0724d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f2015k = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f2016l) {
            this.f2016l = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i3) {
        j();
        V0 v3 = (V0) this.f2011g;
        v3.f5097d = i3 != 0 ? G2.b(v3.f5094a.getContext(), i3) : null;
        v3.c();
    }

    public void setLogo(int i3) {
        j();
        V0 v3 = (V0) this.f2011g;
        v3.e = i3 != 0 ? G2.b(v3.f5094a.getContext(), i3) : null;
        v3.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f2014j = z2;
        this.f2013i = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i3) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((V0) this.f2011g).f5103k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        V0 v3 = (V0) this.f2011g;
        if (v3.f5099g) {
            return;
        }
        v3.f5100h = charSequence;
        if ((v3.f5095b & 8) != 0) {
            Toolbar toolbar = v3.f5094a;
            toolbar.setTitle(charSequence);
            if (v3.f5099g) {
                D.e(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0726e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        V0 v3 = (V0) this.f2011g;
        v3.f5097d = drawable;
        v3.c();
    }

    @Override // B.InterfaceC0009j
    public final void d(int i3, int i4, int[] iArr, int i5) {
    }
}
