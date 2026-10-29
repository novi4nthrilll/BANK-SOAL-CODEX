package androidx.core.widget;

import B.AbstractC0013n;
import B.AbstractC0014o;
import B.AbstractC0020v;
import B.C0003d;
import B.C0008i;
import B.C0011l;
import B.C0015p;
import B.D;
import B.G;
import B.H;
import B.InterfaceC0010k;
import G.c;
import G.f;
import G.g;
import G.h;
import G.j;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import p013d1.AbstractC0451h;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0010k {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final float f2190E = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final f f2191F = new f();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int[] f2192G = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0011l f2193A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0008i f2194B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f2195C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C0003d f2196D;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2197d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f2198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OverScroller f2199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EdgeEffect f2200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final EdgeEffect f2201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f2205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2206n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public VelocityTracker f2207o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2212t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2213u;
    public final int[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f2214w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2215x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2216y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j f2217z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, id.go.bangkalankab.simpeg.R.attr.nestedScrollViewStyle);
        this.f2198f = new Rect();
        this.f2203k = true;
        this.f2204l = false;
        this.f2205m = null;
        this.f2206n = false;
        this.f2209q = true;
        this.f2213u = -1;
        this.v = new int[2];
        this.f2214w = new int[2];
        this.f2196D = new C0003d(getContext(), new A0.f(5, this));
        int i3 = Build.VERSION.SDK_INT;
        this.f2200h = i3 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f2201i = i3 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f2197d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2199g = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2210r = viewConfiguration.getScaledTouchSlop();
        this.f2211s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2212t = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2192G, id.go.bangkalankab.simpeg.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f2193A = new C0011l(0);
        this.f2194B = new C0008i(this);
        setNestedScrollingEnabled(true);
        D.d(this, f2191F);
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // B.InterfaceC0009j
    public final void a(View view, View view2, int i3, int i4) {
        C0011l c0011l = this.f2193A;
        if (i4 == 1) {
            c0011l.f90c = i3;
        } else {
            c0011l.f89b = i3;
        }
        u(2, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // B.InterfaceC0009j
    public final void b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        m(i6, i7, null);
    }

    @Override // B.InterfaceC0009j
    public final void c(View view, int i3) {
        C0011l c0011l = this.f2193A;
        if (i3 == 1) {
            c0011l.f90c = 0;
        } else {
            c0011l.f89b = 0;
        }
        w(i3);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i3;
        int scrollRange;
        int overScrollMode;
        if (this.f2199g.isFinished()) {
            return;
        }
        this.f2199g.computeScrollOffset();
        int currY = this.f2199g.getCurrY();
        int i4 = currY - this.f2216y;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f2201i;
        EdgeEffect edgeEffect2 = this.f2200h;
        if (i4 <= 0 || AbstractC0451h.a(edgeEffect2) == 0.0f) {
            if (i4 < 0 && AbstractC0451h.a(edgeEffect) != 0.0f) {
                float f3 = height;
                iRound = Math.round(AbstractC0451h.b(edgeEffect, (i4 * 4.0f) / f3, 0.5f) * (f3 / 4.0f));
                if (iRound != i4) {
                    edgeEffect.finish();
                }
            }
            this.f2216y = currY;
            iArr = this.f2214w;
            iArr[1] = 0;
            this.f2194B.c(0, i4, iArr, null, 1);
            i3 = i4 - iArr[1];
            scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                o(i3, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i5 = i3 - scrollY2;
                iArr[1] = 0;
                this.f2194B.d(0, scrollY2, 0, i5, this.v, 1, iArr);
                i3 = i5 - iArr[1];
            }
            if (i3 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i3 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f2199g.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f2199g.getCurrVelocity());
                    }
                }
                this.f2199g.abortAnimation();
                w(1);
            }
            if (this.f2199g.isFinished()) {
                w(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(AbstractC0451h.b(edgeEffect2, ((-i4) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i4) {
            edgeEffect2.finish();
        }
        i4 -= iRound;
        this.f2216y = currY;
        iArr = this.f2214w;
        iArr[1] = 0;
        this.f2194B.c(0, i4, iArr, null, 1);
        i3 = i4 - iArr[1];
        scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY3 = getScrollY();
            o(i3, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i6 = i3 - scrollY4;
            iArr[1] = 0;
            this.f2194B.d(0, scrollY4, 0, i6, this.v, 1, iArr);
            i3 = i6 - iArr[1];
        }
        if (i3 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i3 < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f2199g.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f2199g.getCurrVelocity());
                }
            } else if (i3 < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f2199g.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f2199g.getCurrVelocity());
            }
            this.f2199g.abortAnimation();
            w(1);
        }
        if (this.f2199g.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            w(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // B.InterfaceC0009j
    public final void d(int i3, int i4, int[] iArr, int i5) {
        this.f2194B.c(i3, i4, iArr, null, i5);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zJ;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        this.f2198f.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    zJ = false;
                } else {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        zJ = keyEvent.isAltPressed() ? j(33) : g(33);
                    } else if (keyCode != 20) {
                        if (keyCode == 62) {
                            p(keyEvent.isShiftPressed() ? 33 : 130);
                        } else if (keyCode == 92) {
                            zJ = j(33);
                        } else if (keyCode == 93) {
                            zJ = j(130);
                        } else if (keyCode == 122) {
                            p(33);
                        } else if (keyCode == 123) {
                            p(130);
                        }
                        zJ = false;
                    } else {
                        zJ = keyEvent.isAltPressed() ? j(130) : g(130);
                    }
                }
            } else if (isFocused() || keyEvent.getKeyCode() == 4) {
                zJ = false;
            } else {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) {
                    zJ = false;
                } else {
                    zJ = true;
                }
            }
        } else if (isFocused()) {
            zJ = false;
        } else {
            zJ = false;
        }
        return zJ;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f4, boolean z2) {
        return this.f2194B.a(f3, f4, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return this.f2194B.b(f3, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return this.f2194B.c(i3, i4, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return this.f2194B.d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f2200h;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (g.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (g.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f2201i;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (g.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (g.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // B.InterfaceC0010k
    public final void e(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        m(i6, i7, iArr);
    }

    @Override // B.InterfaceC0009j
    public final boolean f(View view, View view2, int i3, int i4) {
        return (i3 & 2) != 0;
    }

    public final boolean g(int i3) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !l(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f2198f;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            r(h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i3);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !l(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0011l c0011l = this.f2193A;
        return c0011l.f90c | c0011l.f89b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f2195C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2195C = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2195C;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f2194B.f(0);
    }

    public final void i(int i3) {
        if (getChildCount() > 0) {
            this.f2199g.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f2216y = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f2194B.f87d;
    }

    public final boolean j(int i3) {
        int childCount;
        boolean z2 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f2198f;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i3, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i3, int i4) {
        Rect rect = this.f2198f;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i4;
    }

    public final void m(int i3, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2194B.d(0, scrollY2, 0, i3 - scrollY2, null, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2213u) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f2202j = (int) motionEvent.getY(i3);
            this.f2213u = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f2207o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i3, int i4, int i5, int i6) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i5 + i3;
        if (i4 <= 0 && i4 >= 0) {
            z2 = false;
        } else {
            i4 = 0;
            z2 = true;
        }
        if (i7 > i6) {
            z3 = true;
        } else if (i7 < 0) {
            z3 = true;
            i6 = 0;
        } else {
            i6 = i7;
            z3 = false;
        }
        if (z3 && !this.f2194B.f(1)) {
            this.f2199g.springBack(i4, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i4, i6);
        return z2 || z3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2204l = false;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x0107  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:70:0x010f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0122  */
    /* JADX WARN: Code duplicated, block: B:78:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x012a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0131  */
    /* JADX WARN: Code duplicated, block: B:84:0x0134  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i3;
        float axisValue;
        int width;
        char c3;
        int iB;
        int scaledMinimumFlingVelocity;
        int deviceId;
        int source;
        InputDevice device;
        boolean z2;
        Resources resources;
        int identifier;
        int scaledMaximumFlingVelocity;
        char c4;
        boolean z3;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f3;
        long j3;
        float fSqrt;
        int i4;
        if (motionEvent.getAction() != 8 || this.f2206n) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            i3 = 9;
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            axisValue = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            i3 = 26;
        } else {
            i3 = 0;
            axisValue = 0.0f;
            width = 0;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * axisValue)), width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i3 == 0) {
            return true;
        }
        C0003d c0003d = this.f2196D;
        c0003d.getClass();
        int source2 = motionEvent.getSource();
        int deviceId2 = motionEvent.getDeviceId();
        int i5 = c0003d.f79f;
        int[] iArr = c0003d.f81h;
        if (i5 == source2 && c0003d.f80g == deviceId2 && c0003d.e == i3) {
            c4 = 0;
            z3 = false;
        } else {
            Context context = c0003d.f75a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 34) {
                Method method = H.f44a;
                iB = G.b(viewConfiguration, deviceId3, i3, source3);
            } else {
                Method method2 = H.f44a;
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i3, source3) == null) {
                    c3 = 0;
                    iB = Integer.MAX_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i3 == 26) ? resources2.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier2 != 0) {
                        scaledMinimumFlingVelocity = resources2.getDimensionPixelSize(identifier2);
                        if (scaledMinimumFlingVelocity < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    } else {
                        iB = Integer.MAX_VALUE;
                    }
                    iB = scaledMinimumFlingVelocity;
                }
                iArr[c3] = iB;
                deviceId = motionEvent.getDeviceId();
                source = motionEvent.getSource();
                if (i6 >= 34) {
                    scaledMaximumFlingVelocity = G.a(viewConfiguration, deviceId, i3, source);
                } else {
                    device = InputDevice.getDevice(deviceId);
                    if (device != null || device.getMotionRange(i3, source) == null) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        resources = context.getResources();
                        if (source == 4194304 || i3 != 26) {
                            identifier = -1;
                        } else {
                            identifier = resources.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android");
                        }
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier != -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier != 0) {
                            int dimensionPixelSize = resources.getDimensionPixelSize(identifier);
                            scaledMaximumFlingVelocity = dimensionPixelSize >= 0 ? dimensionPixelSize : Integer.MIN_VALUE;
                        } else {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    } else {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                c0003d.f79f = source2;
                c0003d.f80g = deviceId2;
                c0003d.e = i3;
                c4 = 0;
                z3 = true;
            }
            c3 = 0;
            iArr[c3] = iB;
            deviceId = motionEvent.getDeviceId();
            source = motionEvent.getSource();
            if (i6 >= 34) {
                scaledMaximumFlingVelocity = G.a(viewConfiguration, deviceId, i3, source);
            } else {
                device = InputDevice.getDevice(deviceId);
                if (device != null) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    resources = context.getResources();
                    if (source == 4194304) {
                        identifier = -1;
                    } else {
                        identifier = -1;
                    }
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier != -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier != 0) {
                        int dimensionPixelSize2 = resources.getDimensionPixelSize(identifier);
                        scaledMaximumFlingVelocity = dimensionPixelSize2 >= 0 ? dimensionPixelSize2 : Integer.MIN_VALUE;
                    } else {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            c0003d.f79f = source2;
            c0003d.f80g = deviceId2;
            c0003d.e = i3;
            c4 = 0;
            z3 = true;
        }
        if (iArr[c4] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker2 = c0003d.f77c;
            if (velocityTracker2 == null) {
                return true;
            }
            velocityTracker2.recycle();
            c0003d.f77c = null;
            return true;
        }
        if (c0003d.f77c == null) {
            c0003d.f77c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker3 = c0003d.f77c;
        Map map = AbstractC0014o.f91a;
        velocityTracker3.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC0014o.f91a;
            if (!map2.containsKey(velocityTracker3)) {
                map2.put(velocityTracker3, new C0015p());
            }
            C0015p c0015p = (C0015p) map2.get(velocityTracker3);
            c0015p.getClass();
            long eventTime = motionEvent.getEventTime();
            int i7 = c0015p.f95d;
            long[] jArr = c0015p.f93b;
            if (i7 != 0 && eventTime - jArr[c0015p.e] > 40) {
                c0015p.f95d = 0;
                c0015p.f94c = 0.0f;
            }
            int i8 = (c0015p.e + 1) % 20;
            c0015p.e = i8;
            int i9 = c0015p.f95d;
            if (i9 != 20) {
                c0015p.f95d = i9 + 1;
            }
            c0015p.f92a[i8] = motionEvent.getAxisValue(26);
            jArr[c0015p.e] = eventTime;
        }
        velocityTracker3.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C0015p c0015p2 = (C0015p) AbstractC0014o.f91a.get(velocityTracker3);
        if (c0015p2 != null) {
            int i10 = c0015p2.f95d;
            if (i10 < 2) {
                velocityTracker = velocityTracker3;
                fSqrt = 0.0f;
            } else {
                int i11 = c0015p2.e;
                int i12 = ((i11 + 20) - (i10 - 1)) % 20;
                long[] jArr2 = c0015p2.f93b;
                long j4 = jArr2[i11];
                while (true) {
                    j3 = jArr2[i12];
                    if (j4 - j3 <= 100) {
                        break;
                    }
                    c0015p2.f95d--;
                    i12 = (i12 + 1) % 20;
                }
                int i13 = c0015p2.f95d;
                if (i13 < 2) {
                    velocityTracker = velocityTracker3;
                    fSqrt = 0.0f;
                } else {
                    float[] fArr = c0015p2.f92a;
                    if (i13 == 2) {
                        int i14 = (i12 + 1) % 20;
                        long j5 = jArr2[i14];
                        if (j3 == j5) {
                            velocityTracker = velocityTracker3;
                            fSqrt = 0.0f;
                        } else {
                            velocityTracker = velocityTracker3;
                            fSqrt = fArr[i14] / (j5 - j3);
                        }
                    } else {
                        float f4 = 0.0f;
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            if (i15 >= c0015p2.f95d - 1) {
                                break;
                            }
                            int i17 = i15 + i12;
                            long j6 = jArr2[i17 % 20];
                            int i18 = (i17 + 1) % 20;
                            if (jArr2[i18] == j6) {
                                i4 = 1;
                            } else {
                                i16++;
                                float fSqrt2 = (f4 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f4) * 2.0f));
                                float f5 = fArr[i18] / (jArr2[i18] - j6);
                                float fAbs = (Math.abs(f5) * (f5 - fSqrt2)) + f4;
                                i4 = 1;
                                if (i16 == 1) {
                                    fAbs *= 0.5f;
                                }
                                f4 = fAbs;
                            }
                            i15 += i4;
                            fArr = fArr;
                            velocityTracker3 = velocityTracker3;
                        }
                        velocityTracker = velocityTracker3;
                        fSqrt = ((float) Math.sqrt(Math.abs(f4) * 2.0f)) * (f4 < 0.0f ? -1.0f : 1.0f);
                    }
                }
            }
            float f6 = fSqrt * 1000;
            c0015p2.f94c = f6;
            if (f6 < (-Math.abs(Float.MAX_VALUE))) {
                c0015p2.f94c = -Math.abs(Float.MAX_VALUE);
            } else if (c0015p2.f94c > Math.abs(Float.MAX_VALUE)) {
                c0015p2.f94c = Math.abs(Float.MAX_VALUE);
            }
        } else {
            velocityTracker = velocityTracker3;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC0013n.a(velocityTracker, i3);
        } else {
            VelocityTracker velocityTracker4 = velocityTracker;
            if (i3 == 0) {
                yVelocity = velocityTracker4.getXVelocity();
            } else if (i3 == 1) {
                yVelocity = velocityTracker4.getYVelocity();
            } else {
                C0015p c0015p3 = (C0015p) AbstractC0014o.f91a.get(velocityTracker4);
                yVelocity = (c0015p3 == null || i3 != 26) ? 0.0f : c0015p3.f94c;
            }
        }
        NestedScrollView nestedScrollView = (NestedScrollView) c0003d.f76b.e;
        float f7 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
        float fSignum = Math.signum(f7);
        if (z3 || (fSignum != Math.signum(c0003d.f78d) && fSignum != 0.0f)) {
            nestedScrollView.f2199g.abortAnimation();
        }
        if (Math.abs(f7) < iArr[0]) {
            return true;
        }
        int i19 = iArr[1];
        float fMax = Math.max(-i19, Math.min(f7, i19));
        if (fMax == 0.0f) {
            f3 = 0.0f;
        } else {
            nestedScrollView.f2199g.abortAnimation();
            nestedScrollView.i((int) fMax);
            f3 = fMax;
        }
        c0003d.f78d = f3;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f2206n) {
            return true;
        }
        int i3 = action & 255;
        if (i3 == 0) {
            int y2 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 < childAt.getTop() - scrollY || y2 >= childAt.getBottom() - scrollY || x3 < childAt.getLeft() || x3 >= childAt.getRight()) {
                    if (!v(motionEvent) && this.f2199g.isFinished()) {
                        z2 = false;
                    }
                    this.f2206n = z2;
                    velocityTracker = this.f2207o;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f2207o = null;
                    }
                } else {
                    this.f2202j = y2;
                    this.f2213u = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f2207o;
                    if (velocityTracker3 == null) {
                        this.f2207o = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f2207o.addMovement(motionEvent);
                    this.f2199g.computeScrollOffset();
                    if (!v(motionEvent) && this.f2199g.isFinished()) {
                        z2 = false;
                    }
                    this.f2206n = z2;
                    u(2, 0);
                }
            } else {
                if (!v(motionEvent)) {
                    z2 = false;
                }
                this.f2206n = z2;
                velocityTracker = this.f2207o;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f2207o = null;
                }
            }
        } else if (i3 == 1) {
            this.f2206n = false;
            this.f2213u = -1;
            velocityTracker2 = this.f2207o;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f2207o = null;
            }
            if (this.f2199g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i3 == 2) {
            int i4 = this.f2213u;
            if (i4 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i4);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y3 - this.f2202j) > this.f2210r && (2 & getNestedScrollAxes()) == 0) {
                        this.f2206n = true;
                        this.f2202j = y3;
                        if (this.f2207o == null) {
                            this.f2207o = VelocityTracker.obtain();
                        }
                        this.f2207o.addMovement(motionEvent);
                        this.f2215x = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i3 == 3) {
            this.f2206n = false;
            this.f2213u = -1;
            velocityTracker2 = this.f2207o;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f2207o = null;
            }
            if (this.f2199g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i3 == 6) {
            n(motionEvent);
        }
        return this.f2206n;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int measuredHeight;
        super.onLayout(z2, i3, i4, i5, i6);
        int i7 = 0;
        this.f2203k = false;
        View view = this.f2205m;
        if (view != null && k(view, this)) {
            View view2 = this.f2205m;
            Rect rect = this.f2198f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f2205m = null;
        if (!this.f2204l) {
            if (this.f2217z != null) {
                scrollTo(getScrollX(), this.f2217z.f309a);
                this.f2217z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i7 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i7 != scrollY) {
                scrollTo(getScrollX(), i7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2204l = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f2208p && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f4, true);
        i((int) f4);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return this.f2194B.b(f3, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        this.f2194B.c(i3, i4, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        m(i6, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i3, int i4, boolean z2, boolean z3) {
        super.scrollTo(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i3) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        if (viewFindNextFocus != null && l(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i3, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f2217z = jVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f309a = getScrollY();
        return jVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !l(viewFindFocus, 0, i6)) {
            return;
        }
        Rect rect = this.f2198f;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.f2209q) {
                t(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f2207o == null) {
            this.f2207o = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2215x = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f3 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f2215x);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f2201i;
            EdgeEffect edgeEffect2 = this.f2200h;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2207o;
                velocityTracker.computeCurrentVelocity(1000, this.f2212t);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2213u);
                if (Math.abs(yVelocity) >= this.f2211s) {
                    if (AbstractC0451h.a(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (AbstractC0451h.a(edgeEffect) != 0.0f) {
                        int i3 = -yVelocity;
                        if (s(edgeEffect, i3)) {
                            edgeEffect.onAbsorb(i3);
                        } else {
                            i(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f4 = i4;
                        if (!this.f2194B.b(0.0f, f4)) {
                            dispatchNestedFling(0.0f, f4, true);
                            i(i4);
                        }
                    }
                } else if (this.f2199g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2213u = -1;
                this.f2206n = false;
                VelocityTracker velocityTracker2 = this.f2207o;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f2207o = null;
                }
                w(0);
                this.f2200h.onRelease();
                this.f2201i.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2213u);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f2213u + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i5 = this.f2202j - y2;
                    float x3 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (AbstractC0451h.a(edgeEffect2) != 0.0f) {
                        float f5 = -AbstractC0451h.b(edgeEffect2, -height, x3);
                        if (AbstractC0451h.a(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f3 = f5;
                    } else if (AbstractC0451h.a(edgeEffect) != 0.0f) {
                        float fB = AbstractC0451h.b(edgeEffect, height, 1.0f - x3);
                        if (AbstractC0451h.a(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f3 = fB;
                    }
                    int iRound = Math.round(f3 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i6 = i5 - iRound;
                    if (!this.f2206n && Math.abs(i6) > this.f2210r) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2206n = true;
                        i6 = i6 > 0 ? i6 - this.f2210r : i6 + this.f2210r;
                    }
                    if (this.f2206n) {
                        int iR = r(i6, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f2202j = y2 - iR;
                        this.f2215x += iR;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2206n && getChildCount() > 0 && this.f2199g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2213u = -1;
                this.f2206n = false;
                VelocityTracker velocityTracker3 = this.f2207o;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f2207o = null;
                }
                w(0);
                this.f2200h.onRelease();
                this.f2201i.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2202j = (int) motionEvent.getY(actionIndex);
                this.f2213u = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f2202j = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2213u));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f2206n && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2199g.isFinished()) {
                this.f2199g.abortAnimation();
                w(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f2202j = y3;
            this.f2213u = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f2207o;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(int i3) {
        boolean z2 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f2198f;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i4 = rect.top;
        int i5 = height + i4;
        rect.bottom = i5;
        q(i3, i4, i5);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean q(int i3, int i4, int i5) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        boolean z3 = i3 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                boolean z5 = i4 < top && bottom < i5;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5 && z6) {
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (z6) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i4 < scrollY || i5 > i6) {
            r(z3 ? i4 - scrollY : i5 - i6, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i3);
        }
        return z2;
    }

    public final int r(int i3, int i4, int i5, boolean z2) {
        int i6;
        int i7;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i5 == 1) {
            u(2, i5);
        }
        boolean zC = this.f2194B.c(0, i3, this.f2214w, this.v, i5);
        int[] iArr = this.f2214w;
        int[] iArr2 = this.v;
        if (zC) {
            i6 = i3 - iArr[1];
            i7 = iArr2[1];
        } else {
            i6 = i3;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = o(i6, 0, scrollY, scrollRange) && !this.f2194B.f(i5);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f2194B.d(0, scrollY2, 0, i6 - scrollY2, this.v, i5, iArr);
        int i8 = i7 + iArr2[1];
        int i9 = i6 - iArr[1];
        int i10 = scrollY + i9;
        EdgeEffect edgeEffect = this.f2201i;
        EdgeEffect edgeEffect2 = this.f2200h;
        if (i10 < 0) {
            if (z4) {
                AbstractC0451h.b(edgeEffect2, (-i9) / getHeight(), i4 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i10 > scrollRange && z4) {
            AbstractC0451h.b(edgeEffect, i9 / getHeight(), 1.0f - (i4 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
            z3 = false;
        }
        if (z3 && i5 == 0 && (velocityTracker = this.f2207o) != null) {
            velocityTracker.clear();
        }
        if (i5 == 1) {
            w(i5);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f2203k) {
            this.f2205m = view2;
        } else {
            Rect rect = this.f2198f;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z3 = iH != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iH);
            } else {
                t(0, iH, false);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f2207o) != null) {
            velocityTracker.recycle();
            this.f2207o = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2203k = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float fA = AbstractC0451h.a(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i3) * 0.35f;
        float f3 = this.f2197d * 0.015f;
        double dLog = Math.log(fAbs / f3);
        double d3 = f2190E;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * dLog) * ((double) f3))) < fA;
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i3 < 0) {
                i3 = 0;
            } else if (width + i3 > width2) {
                i3 = width2 - width;
            }
            if (height >= height2 || i4 < 0) {
                i4 = 0;
            } else if (height + i4 > height2) {
                i4 = height2 - height;
            }
            if (i3 == getScrollX() && i4 == getScrollY()) {
                return;
            }
            super.scrollTo(i3, i4);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f2208p) {
            this.f2208p = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0008i c0008i = this.f2194B;
        if (c0008i.f87d) {
            Field field = D.f41a;
            AbstractC0020v.z(c0008i.f86c);
        }
        c0008i.f87d = z2;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f2209q = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return this.f2194B.g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i3, int i4, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.e > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f2199g.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f2216y = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f2199g.isFinished()) {
                this.f2199g.abortAnimation();
                w(1);
            }
            scrollBy(i3, i4);
        }
        this.e = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i3, int i4) {
        this.f2194B.g(2, i4);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f2200h;
        if (AbstractC0451h.a(edgeEffect) != 0.0f) {
            AbstractC0451h.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f2201i;
        if (AbstractC0451h.a(edgeEffect2) == 0.0f) {
            return z2;
        }
        AbstractC0451h.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i3) {
        this.f2194B.h(i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(h hVar) {
    }
}
