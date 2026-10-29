package androidx.appcompat.widget;

import B.C0006g;
import B.D;
import E0.l;
import S.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.y;
import id.go.bangkalankab.simpeg.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.C0728f;
import k.C0734i;
import k.C0750q;
import k.C0756t0;
import k.E;
import k.N;
import k.O0;
import k.P0;
import k.Q0;
import k.R0;
import k.S0;
import k.T0;
import k.U0;
import k.V0;
import k.c1;
import k.r;
import p013d1.G2;
import p013d1.O2;
import p032j.i;
import p032j.j;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f2130A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CharSequence f2131B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ColorStateList f2132C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f2133D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f2134E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f2135F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final ArrayList f2136G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ArrayList f2137H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int[] f2138I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0006g f2139J;
    public ArrayList K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p006b1.c f2140L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public V0 f2141M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public R0 f2142N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f2143O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public OnBackInvokedCallback f2144P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public OnBackInvokedDispatcher f2145Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f2146R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final l f2147S;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionMenuView f2148d;
    public E e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public E f2149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0750q f2150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f2151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Drawable f2152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CharSequence f2153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0750q f2154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f2155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f2156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f2160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2162s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2163t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2164u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0756t0 f2165w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2166x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2167y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f2168z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f2168z = 8388627;
        this.f2136G = new ArrayList();
        this.f2137H = new ArrayList();
        this.f2138I = new int[2];
        this.f2139J = new C0006g(new O0(this, 1));
        this.K = new ArrayList();
        this.f2140L = new p006b1.c(this);
        this.f2147S = new l(12, this);
        Context context2 = getContext();
        int[] iArr = p011d.a.f3549t;
        D0.b bVarL = D0.b.L(context2, attributeSet, iArr, R.attr.toolbarStyle);
        D.c(this, context, iArr, attributeSet, (TypedArray) bVarL.f182f, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) bVarL.f182f;
        this.f2158o = typedArray.getResourceId(28, 0);
        this.f2159p = typedArray.getResourceId(19, 0);
        this.f2168z = typedArray.getInteger(0, 8388627);
        this.f2160q = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.v = dimensionPixelOffset;
        this.f2164u = dimensionPixelOffset;
        this.f2163t = dimensionPixelOffset;
        this.f2162s = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f2162s = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f2163t = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f2164u = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.v = dimensionPixelOffset5;
        }
        this.f2161r = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C0756t0 c0756t0 = this.f2165w;
        c0756t0.f5251h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0756t0.e = dimensionPixelSize;
            c0756t0.f5245a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0756t0.f5249f = dimensionPixelSize2;
            c0756t0.f5246b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0756t0.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f2166x = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f2167y = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f2152i = bVarL.C(4);
        this.f2153j = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f2156m = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableC = bVarL.C(16);
        if (drawableC != null) {
            setNavigationIcon(drawableC);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableC2 = bVarL.C(11);
        if (drawableC2 != null) {
            setLogo(drawableC2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(bVarL.B(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(bVarL.B(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        bVarL.O();
    }

    public static S0 g() {
        S0 s3 = new S0(-2, -2);
        s3.f5086b = 0;
        s3.f5085a = 8388627;
        return s3;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i3 = 0; i3 < menu.size(); i3++) {
            arrayList.add(menu.getItem(i3));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new p028i.d(getContext());
    }

    public static S0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof S0;
        if (z2) {
            S0 s3 = (S0) layoutParams;
            S0 s4 = new S0(s3);
            s4.f5086b = 0;
            s4.f5086b = s3.f5086b;
            return s4;
        }
        if (z2) {
            S0 s5 = new S0((S0) layoutParams);
            s5.f5086b = 0;
            return s5;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            S0 s6 = new S0(layoutParams);
            s6.f5086b = 0;
            return s6;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        S0 s7 = new S0(marginLayoutParams);
        s7.f5086b = 0;
        ((ViewGroup.MarginLayoutParams) s7).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) s7).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) s7).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) s7).bottomMargin = marginLayoutParams.bottomMargin;
        return s7;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i3, ArrayList arrayList) {
        Field field = D.f41a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                S0 s3 = (S0) childAt.getLayoutParams();
                if (s3.f5086b == 0 && s(childAt) && i(s3.f5085a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            S0 s4 = (S0) childAt2.getLayoutParams();
            if (s4.f5086b == 0 && s(childAt2) && i(s4.f5085a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z2) {
        S0 s0H;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            s0H = g();
        } else {
            s0H = !checkLayoutParams(layoutParams) ? h(layoutParams) : (S0) layoutParams;
        }
        s0H.f5086b = 1;
        if (!z2 || this.f2155l == null) {
            addView(view, s0H);
        } else {
            view.setLayoutParams(s0H);
            this.f2137H.add(view);
        }
    }

    public final void c() {
        if (this.f2154k == null) {
            C0750q c0750q = new C0750q(getContext());
            this.f2154k = c0750q;
            c0750q.setImageDrawable(this.f2152i);
            this.f2154k.setContentDescription(this.f2153j);
            S0 s0G = g();
            s0G.f5085a = (this.f2160q & 112) | 8388611;
            s0G.f5086b = 2;
            this.f2154k.setLayoutParams(s0G);
            this.f2154k.setOnClickListener(new P0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof S0);
    }

    public final void d() {
        if (this.f2165w == null) {
            C0756t0 c0756t0 = new C0756t0();
            c0756t0.f5245a = 0;
            c0756t0.f5246b = 0;
            c0756t0.f5247c = Integer.MIN_VALUE;
            c0756t0.f5248d = Integer.MIN_VALUE;
            c0756t0.e = 0;
            c0756t0.f5249f = 0;
            c0756t0.f5250g = false;
            c0756t0.f5251h = false;
            this.f2165w = c0756t0;
        }
    }

    public final void e() {
        if (this.f2148d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f2148d = actionMenuView;
            actionMenuView.setPopupTheme(this.f2157n);
            this.f2148d.setOnMenuItemClickListener(this.f2140L);
            ActionMenuView actionMenuView2 = this.f2148d;
            y yVar = new y(12, this);
            actionMenuView2.getClass();
            actionMenuView2.f2035w = yVar;
            S0 s0G = g();
            s0G.f5085a = (this.f2160q & 112) | 8388613;
            this.f2148d.setLayoutParams(s0G);
            b(this.f2148d, false);
        }
        ActionMenuView actionMenuView3 = this.f2148d;
        if (actionMenuView3.f2032s == null) {
            i iVar = (i) actionMenuView3.getMenu();
            if (this.f2142N == null) {
                this.f2142N = new R0(this);
            }
            this.f2148d.setExpandedActionViewsExclusive(true);
            iVar.b(this.f2142N, this.f2156m);
            t();
        }
    }

    public final void f() {
        if (this.f2150g == null) {
            this.f2150g = new C0750q(getContext());
            S0 s0G = g();
            s0G.f5085a = (this.f2160q & 112) | 8388611;
            this.f2150g.setLayoutParams(s0G);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0750q c0750q = this.f2154k;
        if (c0750q != null) {
            return c0750q.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0750q c0750q = this.f2154k;
        if (c0750q != null) {
            return c0750q.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0756t0 c0756t0 = this.f2165w;
        if (c0756t0 != null) {
            return c0756t0.f5250g ? c0756t0.f5245a : c0756t0.f5246b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.f2167y;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0756t0 c0756t0 = this.f2165w;
        if (c0756t0 != null) {
            return c0756t0.f5245a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0756t0 c0756t0 = this.f2165w;
        if (c0756t0 != null) {
            return c0756t0.f5246b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0756t0 c0756t0 = this.f2165w;
        if (c0756t0 != null) {
            return c0756t0.f5250g ? c0756t0.f5246b : c0756t0.f5245a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f2166x;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        i iVar;
        ActionMenuView actionMenuView = this.f2148d;
        return (actionMenuView == null || (iVar = actionMenuView.f2032s) == null || !iVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f2167y, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = D.f41a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = D.f41a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2166x, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        r rVar = this.f2151h;
        if (rVar != null) {
            return rVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        r rVar = this.f2151h;
        if (rVar != null) {
            return rVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f2148d.getMenu();
    }

    public View getNavButtonView() {
        return this.f2150g;
    }

    public CharSequence getNavigationContentDescription() {
        C0750q c0750q = this.f2150g;
        if (c0750q != null) {
            return c0750q.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0750q c0750q = this.f2150g;
        if (c0750q != null) {
            return c0750q.getDrawable();
        }
        return null;
    }

    public C0734i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f2148d.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f2156m;
    }

    public int getPopupTheme() {
        return this.f2157n;
    }

    public CharSequence getSubtitle() {
        return this.f2131B;
    }

    public final TextView getSubtitleTextView() {
        return this.f2149f;
    }

    public CharSequence getTitle() {
        return this.f2130A;
    }

    public int getTitleMarginBottom() {
        return this.v;
    }

    public int getTitleMarginEnd() {
        return this.f2163t;
    }

    public int getTitleMarginStart() {
        return this.f2162s;
    }

    public int getTitleMarginTop() {
        return this.f2164u;
    }

    public final TextView getTitleTextView() {
        return this.e;
    }

    public N getWrapper() {
        Drawable drawable;
        if (this.f2141M == null) {
            V0 v3 = new V0();
            v3.f5104l = 0;
            v3.f5094a = this;
            v3.f5100h = getTitle();
            v3.f5101i = getSubtitle();
            v3.f5099g = v3.f5100h != null;
            v3.f5098f = getNavigationIcon();
            D0.b bVarL = D0.b.L(getContext(), null, p011d.a.f3531a, R.attr.actionBarStyle);
            v3.f5105m = bVarL.C(15);
            TypedArray typedArray = (TypedArray) bVarL.f182f;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                v3.f5099g = true;
                v3.f5100h = text;
                if ((v3.f5095b & 8) != 0) {
                    Toolbar toolbar = v3.f5094a;
                    toolbar.setTitle(text);
                    if (v3.f5099g) {
                        D.e(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                v3.f5101i = text2;
                if ((v3.f5095b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableC = bVarL.C(20);
            if (drawableC != null) {
                v3.e = drawableC;
                v3.c();
            }
            Drawable drawableC2 = bVarL.C(17);
            if (drawableC2 != null) {
                v3.f5097d = drawableC2;
                v3.c();
            }
            if (v3.f5098f == null && (drawable = v3.f5105m) != null) {
                v3.f5098f = drawable;
                int i3 = v3.f5095b & 4;
                Toolbar toolbar2 = v3.f5094a;
                if (i3 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            v3.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = v3.f5096c;
                if (view != null && (v3.f5095b & 16) != 0) {
                    removeView(view);
                }
                v3.f5096c = viewInflate;
                if (viewInflate != null && (v3.f5095b & 16) != 0) {
                    addView(viewInflate);
                }
                v3.a(v3.f5095b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f2165w.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f2158o = resourceId2;
                E e = this.e;
                if (e != null) {
                    e.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f2159p = resourceId3;
                E e3 = this.f2149f;
                if (e3 != null) {
                    e3.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            bVarL.O();
            if (R.string.abc_action_bar_up_description != v3.f5104l) {
                v3.f5104l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i4 = v3.f5104l;
                    v3.f5102j = i4 != 0 ? getContext().getString(i4) : null;
                    v3.b();
                }
            }
            v3.f5102j = getNavigationContentDescription();
            setNavigationOnClickListener(new P0(v3));
            this.f2141M = v3;
        }
        return this.f2141M;
    }

    public final int i(int i3) {
        Field field = D.f41a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    public final int j(View view, int i3) {
        S0 s3 = (S0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int i5 = s3.f5085a & 112;
        if (i5 != 16 && i5 != 48 && i5 != 80) {
            i5 = this.f2168z & 112;
        }
        if (i5 == 48) {
            return getPaddingTop() - i4;
        }
        if (i5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) s3).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) s3).topMargin;
        if (iMax < i6) {
            iMax = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) s3).bottomMargin;
            if (i7 < i8) {
                iMax = Math.max(0, iMax - (i8 - i7));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f2139J.e).iterator();
        if (it2.hasNext()) {
            ((f) it2.next()).getClass();
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.K = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.f2137H.contains(view);
    }

    public final int o(View view, int i3, int i4, int[] iArr) {
        S0 s3 = (S0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) s3).leftMargin - iArr[0];
        int iMax = Math.max(0, i5) + i3;
        iArr[0] = Math.max(0, -i5);
        int iJ = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) s3).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2147S);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2135F = false;
        }
        if (!this.f2135F) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f2135F = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2135F = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0262  */
    /* JADX WARN: Code duplicated, block: B:101:0x0284  */
    /* JADX WARN: Code duplicated, block: B:103:0x0287  */
    /* JADX WARN: Code duplicated, block: B:104:0x028c  */
    /* JADX WARN: Code duplicated, block: B:107:0x029b A[LOOP:0: B:106:0x0299->B:107:0x029b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x02b8 A[LOOP:1: B:109:0x02b6->B:110:0x02b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02d6 A[LOOP:2: B:112:0x02d4->B:113:0x02d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0317 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0319  */
    /* JADX WARN: Code duplicated, block: B:119:0x031d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0325 A[LOOP:3: B:121:0x0323->B:122:0x0325, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147  */
    /* JADX WARN: Code duplicated, block: B:58:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x016a  */
    /* JADX WARN: Code duplicated, block: B:67:0x016e  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x017f  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0196  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x0216  */
    /* JADX WARN: Code duplicated, block: B:89:0x0219  */
    /* JADX WARN: Code duplicated, block: B:91:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0224  */
    /* JADX WARN: Code duplicated, block: B:94:0x0228  */
    /* JADX WARN: Code duplicated, block: B:97:0x023c  */
    /* JADX WARN: Code duplicated, block: B:98:0x025f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int iO;
        int iP;
        int iMax;
        int iMin;
        boolean zS;
        boolean zS2;
        int measuredHeight;
        E e;
        E e3;
        S0 s3;
        S0 s4;
        boolean z3;
        int i7;
        int i8;
        int paddingTop;
        int i9;
        int iMax2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMax3;
        int i15;
        int i16;
        int i17;
        int i18;
        ArrayList arrayList;
        int size;
        int iO2;
        int i19;
        int i20;
        int size2;
        int i21;
        int size3;
        int i22;
        int i23;
        int i24;
        int measuredWidth;
        int i25;
        int i26;
        int size4;
        int i27;
        Field field = D.f41a;
        boolean z4 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i28 = width - paddingRight;
        int[] iArr = this.f2138I;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i6 - i4) : 0;
        if (s(this.f2150g)) {
            if (z4) {
                iP = p(this.f2150g, i28, iMin2, iArr);
                iO = paddingLeft;
            } else {
                iO = o(this.f2150g, paddingLeft, iMin2, iArr);
            }
            if (s(this.f2154k)) {
                if (z4) {
                    iP = p(this.f2154k, iP, iMin2, iArr);
                } else {
                    iO = o(this.f2154k, iO, iMin2, iArr);
                }
            }
            if (s(this.f2148d)) {
                if (z4) {
                    iO = o(this.f2148d, iO, iMin2, iArr);
                } else {
                    iP = p(this.f2148d, iP, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i28 - iP));
            iMax = Math.max(iO, currentContentInsetLeft);
            iMin = Math.min(iP, i28 - currentContentInsetRight);
            if (s(this.f2155l)) {
                if (z4) {
                    iMin = p(this.f2155l, iMin, iMin2, iArr);
                } else {
                    iMax = o(this.f2155l, iMax, iMin2, iArr);
                }
            }
            if (s(this.f2151h)) {
                if (z4) {
                    iMin = p(this.f2151h, iMin, iMin2, iArr);
                } else {
                    iMax = o(this.f2151h, iMax, iMin2, iArr);
                }
            }
            zS = s(this.e);
            zS2 = s(this.f2149f);
            if (zS) {
                S0 s5 = (S0) this.e.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) s5).bottomMargin + this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s5).topMargin;
            } else {
                measuredHeight = 0;
            }
            if (zS2) {
                S0 s6 = (S0) this.f2149f.getLayoutParams();
                measuredHeight += this.f2149f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s6).topMargin + ((ViewGroup.MarginLayoutParams) s6).bottomMargin;
            }
            if (!zS || zS2) {
                if (zS) {
                    e = this.e;
                } else {
                    e = this.f2149f;
                }
                if (zS2) {
                    e3 = this.f2149f;
                } else {
                    e3 = this.e;
                }
                s3 = (S0) e.getLayoutParams();
                s4 = (S0) e3.getLayoutParams();
                z3 = (!zS && this.e.getMeasuredWidth() > 0) || (zS2 && this.f2149f.getMeasuredWidth() > 0);
                i7 = this.f2168z & 112;
                i8 = iMin2;
                if (i7 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) s3).topMargin + this.f2164u;
                } else if (i7 != 80) {
                    iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i15 = ((ViewGroup.MarginLayoutParams) s3).topMargin + this.f2164u;
                    if (iMax3 < i15) {
                        iMax3 = i15;
                    } else {
                        i16 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                        i17 = ((ViewGroup.MarginLayoutParams) s3).bottomMargin;
                        i18 = this.v;
                        if (i16 < i17 + i18) {
                            iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) s4).bottomMargin + i18) - i16));
                        }
                    }
                    paddingTop = paddingTop2 + iMax3;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) s4).bottomMargin) - this.v) - measuredHeight;
                }
                if (z4) {
                    if (z3) {
                        i12 = this.f2162s;
                    } else {
                        i12 = 0;
                    }
                    int i29 = i12 - iArr[1];
                    iMin -= Math.max(0, i29);
                    iArr[1] = Math.max(0, -i29);
                    if (zS) {
                        S0 s7 = (S0) this.e.getLayoutParams();
                        int measuredWidth2 = iMin - this.e.getMeasuredWidth();
                        int measuredHeight2 = this.e.getMeasuredHeight() + paddingTop;
                        this.e.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i13 = measuredWidth2 - this.f2163t;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) s7).bottomMargin;
                    } else {
                        i13 = iMin;
                    }
                    if (zS2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((S0) this.f2149f.getLayoutParams())).topMargin;
                        this.f2149f.layout(iMin - this.f2149f.getMeasuredWidth(), i30, iMin, this.f2149f.getMeasuredHeight() + i30);
                        i14 = iMin - this.f2163t;
                    } else {
                        i14 = iMin;
                    }
                    if (z3) {
                        iMin = Math.min(i13, i14);
                    }
                    iMax = iMax;
                } else {
                    if (z3) {
                        i9 = this.f2162s;
                    } else {
                        i9 = 0;
                    }
                    int i31 = i9 - iArr[0];
                    iMax2 = Math.max(0, i31) + iMax;
                    iArr[0] = Math.max(0, -i31);
                    if (zS) {
                        S0 s8 = (S0) this.e.getLayoutParams();
                        int measuredWidth3 = this.e.getMeasuredWidth() + iMax2;
                        int measuredHeight3 = this.e.getMeasuredHeight() + paddingTop;
                        this.e.layout(iMax2, paddingTop, measuredWidth3, measuredHeight3);
                        i10 = measuredWidth3 + this.f2163t;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) s8).bottomMargin;
                    } else {
                        i10 = iMax2;
                    }
                    if (zS2) {
                        int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((S0) this.f2149f.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f2149f.getMeasuredWidth() + iMax2;
                        this.f2149f.layout(iMax2, i32, measuredWidth4, this.f2149f.getMeasuredHeight() + i32);
                        i11 = measuredWidth4 + this.f2163t;
                    } else {
                        i11 = iMax2;
                    }
                    if (z3) {
                        iMax = Math.max(i10, i11);
                    } else {
                        iMax = iMax2;
                    }
                }
            } else {
                paddingLeft = paddingLeft;
                i8 = iMin2;
            }
            arrayList = this.f2136G;
            a(3, arrayList);
            size = arrayList.size();
            iO2 = iMax;
            for (i19 = 0; i19 < size; i19++) {
                iO2 = o((View) arrayList.get(i19), iO2, i8, iArr);
            }
            i20 = i8;
            a(5, arrayList);
            size2 = arrayList.size();
            for (i21 = 0; i21 < size2; i21++) {
                iMin = p((View) arrayList.get(i21), iMin, i20, iArr);
            }
            a(1, arrayList);
            int i33 = iArr[0];
            int i34 = iArr[1];
            size3 = arrayList.size();
            i22 = i34;
            i23 = i33;
            i24 = 0;
            measuredWidth = 0;
            while (i24 < size3) {
                View view = (View) arrayList.get(i24);
                S0 s9 = (S0) view.getLayoutParams();
                int i35 = ((ViewGroup.MarginLayoutParams) s9).leftMargin - i23;
                int i36 = ((ViewGroup.MarginLayoutParams) s9).rightMargin - i22;
                int iMax4 = Math.max(0, i35);
                int iMax5 = Math.max(0, i36);
                int iMax6 = Math.max(0, -i35);
                int iMax7 = Math.max(0, -i36);
                measuredWidth += view.getMeasuredWidth() + iMax4 + iMax5;
                i24++;
                i22 = iMax7;
                i23 = iMax6;
            }
            i25 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i26 = measuredWidth + i25;
            if (i25 >= iO2) {
                if (i26 > iMin) {
                    iO2 = i25 - (i26 - iMin);
                } else {
                    iO2 = i25;
                }
            }
            size4 = arrayList.size();
            for (i27 = 0; i27 < size4; i27++) {
                iO2 = o((View) arrayList.get(i27), iO2, i20, iArr);
            }
            arrayList.clear();
        }
        iO = paddingLeft;
        iP = i28;
        if (s(this.f2154k)) {
            if (z4) {
                iP = p(this.f2154k, iP, iMin2, iArr);
            } else {
                iO = o(this.f2154k, iO, iMin2, iArr);
            }
        }
        if (s(this.f2148d)) {
            if (z4) {
                iO = o(this.f2148d, iO, iMin2, iArr);
            } else {
                iP = p(this.f2148d, iP, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i28 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        iMin = Math.min(iP, i28 - currentContentInsetRight2);
        if (s(this.f2155l)) {
            if (z4) {
                iMin = p(this.f2155l, iMin, iMin2, iArr);
            } else {
                iMax = o(this.f2155l, iMax, iMin2, iArr);
            }
        }
        if (s(this.f2151h)) {
            if (z4) {
                iMin = p(this.f2151h, iMin, iMin2, iArr);
            } else {
                iMax = o(this.f2151h, iMax, iMin2, iArr);
            }
        }
        zS = s(this.e);
        zS2 = s(this.f2149f);
        if (zS) {
            S0 s10 = (S0) this.e.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) s10).bottomMargin + this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s10).topMargin;
        } else {
            measuredHeight = 0;
        }
        if (zS2) {
            S0 s11 = (S0) this.f2149f.getLayoutParams();
            measuredHeight += this.f2149f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s11).topMargin + ((ViewGroup.MarginLayoutParams) s11).bottomMargin;
        }
        if (zS) {
            if (zS) {
                e = this.e;
            } else {
                e = this.f2149f;
            }
            if (zS2) {
                e3 = this.f2149f;
            } else {
                e3 = this.e;
            }
            s3 = (S0) e.getLayoutParams();
            s4 = (S0) e3.getLayoutParams();
            if (zS) {
            }
            i7 = this.f2168z & 112;
            i8 = iMin2;
            if (i7 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) s3).topMargin + this.f2164u;
            } else if (i7 != 80) {
                iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) s3).topMargin + this.f2164u;
                if (iMax3 < i15) {
                    iMax3 = i15;
                } else {
                    i16 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                    i17 = ((ViewGroup.MarginLayoutParams) s3).bottomMargin;
                    i18 = this.v;
                    if (i16 < i17 + i18) {
                        iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) s4).bottomMargin + i18) - i16));
                    }
                }
                paddingTop = paddingTop2 + iMax3;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) s4).bottomMargin) - this.v) - measuredHeight;
            }
            if (z4) {
                if (z3) {
                    i12 = this.f2162s;
                } else {
                    i12 = 0;
                }
                int i210 = i12 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zS) {
                    S0 s12 = (S0) this.e.getLayoutParams();
                    int measuredWidth5 = iMin - this.e.getMeasuredWidth();
                    int measuredHeight4 = this.e.getMeasuredHeight() + paddingTop;
                    this.e.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i13 = measuredWidth5 - this.f2163t;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) s12).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zS2) {
                    int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((S0) this.f2149f.getLayoutParams())).topMargin;
                    this.f2149f.layout(iMin - this.f2149f.getMeasuredWidth(), i37, iMin, this.f2149f.getMeasuredHeight() + i37);
                    i14 = iMin - this.f2163t;
                } else {
                    i14 = iMin;
                }
                if (z3) {
                    iMin = Math.min(i13, i14);
                }
                iMax = iMax;
            } else {
                if (z3) {
                    i9 = this.f2162s;
                } else {
                    i9 = 0;
                }
                int i38 = i9 - iArr[0];
                iMax2 = Math.max(0, i38) + iMax;
                iArr[0] = Math.max(0, -i38);
                if (zS) {
                    S0 s13 = (S0) this.e.getLayoutParams();
                    int measuredWidth6 = this.e.getMeasuredWidth() + iMax2;
                    int measuredHeight5 = this.e.getMeasuredHeight() + paddingTop;
                    this.e.layout(iMax2, paddingTop, measuredWidth6, measuredHeight5);
                    i10 = measuredWidth6 + this.f2163t;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) s13).bottomMargin;
                } else {
                    i10 = iMax2;
                }
                if (zS2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((S0) this.f2149f.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f2149f.getMeasuredWidth() + iMax2;
                    this.f2149f.layout(iMax2, i39, measuredWidth7, this.f2149f.getMeasuredHeight() + i39);
                    i11 = measuredWidth7 + this.f2163t;
                } else {
                    i11 = iMax2;
                }
                if (z3) {
                    iMax = Math.max(i10, i11);
                } else {
                    iMax = iMax2;
                }
            }
        } else {
            if (zS) {
                e = this.e;
            } else {
                e = this.f2149f;
            }
            if (zS2) {
                e3 = this.f2149f;
            } else {
                e3 = this.e;
            }
            s3 = (S0) e.getLayoutParams();
            s4 = (S0) e3.getLayoutParams();
            if (zS) {
            }
            i7 = this.f2168z & 112;
            i8 = iMin2;
            if (i7 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) s3).topMargin + this.f2164u;
            } else if (i7 != 80) {
                iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i15 = ((ViewGroup.MarginLayoutParams) s3).topMargin + this.f2164u;
                if (iMax3 < i15) {
                    iMax3 = i15;
                } else {
                    i16 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                    i17 = ((ViewGroup.MarginLayoutParams) s3).bottomMargin;
                    i18 = this.v;
                    if (i16 < i17 + i18) {
                        iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) s4).bottomMargin + i18) - i16));
                    }
                }
                paddingTop = paddingTop2 + iMax3;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) s4).bottomMargin) - this.v) - measuredHeight;
            }
            if (z4) {
                if (z3) {
                    i12 = this.f2162s;
                } else {
                    i12 = 0;
                }
                int i211 = i12 - iArr[1];
                iMin -= Math.max(0, i211);
                iArr[1] = Math.max(0, -i211);
                if (zS) {
                    S0 s14 = (S0) this.e.getLayoutParams();
                    int measuredWidth8 = iMin - this.e.getMeasuredWidth();
                    int measuredHeight6 = this.e.getMeasuredHeight() + paddingTop;
                    this.e.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i13 = measuredWidth8 - this.f2163t;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) s14).bottomMargin;
                } else {
                    i13 = iMin;
                }
                if (zS2) {
                    int i310 = paddingTop + ((ViewGroup.MarginLayoutParams) ((S0) this.f2149f.getLayoutParams())).topMargin;
                    this.f2149f.layout(iMin - this.f2149f.getMeasuredWidth(), i310, iMin, this.f2149f.getMeasuredHeight() + i310);
                    i14 = iMin - this.f2163t;
                } else {
                    i14 = iMin;
                }
                if (z3) {
                    iMin = Math.min(i13, i14);
                }
                iMax = iMax;
            } else {
                if (z3) {
                    i9 = this.f2162s;
                } else {
                    i9 = 0;
                }
                int i311 = i9 - iArr[0];
                iMax2 = Math.max(0, i311) + iMax;
                iArr[0] = Math.max(0, -i311);
                if (zS) {
                    S0 s15 = (S0) this.e.getLayoutParams();
                    int measuredWidth9 = this.e.getMeasuredWidth() + iMax2;
                    int measuredHeight7 = this.e.getMeasuredHeight() + paddingTop;
                    this.e.layout(iMax2, paddingTop, measuredWidth9, measuredHeight7);
                    i10 = measuredWidth9 + this.f2163t;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) s15).bottomMargin;
                } else {
                    i10 = iMax2;
                }
                if (zS2) {
                    int i312 = paddingTop + ((ViewGroup.MarginLayoutParams) ((S0) this.f2149f.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f2149f.getMeasuredWidth() + iMax2;
                    this.f2149f.layout(iMax2, i312, measuredWidth10, this.f2149f.getMeasuredHeight() + i312);
                    i11 = measuredWidth10 + this.f2163t;
                } else {
                    i11 = iMax2;
                }
                if (z3) {
                    iMax = Math.max(i10, i11);
                } else {
                    iMax = iMax2;
                }
            }
        }
        arrayList = this.f2136G;
        a(3, arrayList);
        size = arrayList.size();
        iO2 = iMax;
        while (i19 < size) {
            iO2 = o((View) arrayList.get(i19), iO2, i8, iArr);
        }
        i20 = i8;
        a(5, arrayList);
        size2 = arrayList.size();
        while (i21 < size2) {
            iMin = p((View) arrayList.get(i21), iMin, i20, iArr);
        }
        a(1, arrayList);
        int i313 = iArr[0];
        int i314 = iArr[1];
        size3 = arrayList.size();
        i22 = i314;
        i23 = i313;
        i24 = 0;
        measuredWidth = 0;
        while (i24 < size3) {
            View view2 = (View) arrayList.get(i24);
            S0 s16 = (S0) view2.getLayoutParams();
            int i315 = ((ViewGroup.MarginLayoutParams) s16).leftMargin - i23;
            int i316 = ((ViewGroup.MarginLayoutParams) s16).rightMargin - i22;
            int iMax8 = Math.max(0, i315);
            int iMax9 = Math.max(0, i316);
            int iMax10 = Math.max(0, -i315);
            int iMax11 = Math.max(0, -i316);
            measuredWidth += view2.getMeasuredWidth() + iMax8 + iMax9;
            i24++;
            i22 = iMax11;
            i23 = iMax10;
        }
        i25 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i26 = measuredWidth + i25;
        if (i25 >= iO2) {
            if (i26 > iMin) {
                iO2 = i25 - (i26 - iMin);
            } else {
                iO2 = i25;
            }
        }
        size4 = arrayList.size();
        while (i27 < size4) {
            iO2 = o((View) arrayList.get(i27), iO2, i20, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iCombineMeasuredStates2;
        int iMax2;
        int iL;
        boolean zA = c1.a(this);
        int i5 = !zA ? 1 : 0;
        int i6 = 0;
        if (s(this.f2150g)) {
            r(this.f2150g, i3, 0, i4, this.f2161r);
            iK = k(this.f2150g) + this.f2150g.getMeasuredWidth();
            iMax = Math.max(0, l(this.f2150g) + this.f2150g.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2150g.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.f2154k)) {
            r(this.f2154k, i3, 0, i4, this.f2161r);
            iK = k(this.f2154k) + this.f2154k.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f2154k) + this.f2154k.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2154k.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.f2138I;
        iArr[zA ? 1 : 0] = iMax4;
        if (s(this.f2148d)) {
            r(this.f2148d, i3, iMax3, i4, this.f2161r);
            iK2 = k(this.f2148d) + this.f2148d.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f2148d) + this.f2148d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2148d.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[i5] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.f2155l)) {
            iMax5 += q(this.f2155l, i3, iMax5, i4, 0, iArr);
            iMax = Math.max(iMax, l(this.f2155l) + this.f2155l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2155l.getMeasuredState());
        }
        if (s(this.f2151h)) {
            iMax5 += q(this.f2151h, i3, iMax5, i4, 0, iArr);
            iMax = Math.max(iMax, l(this.f2151h) + this.f2151h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2151h.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (((S0) childAt.getLayoutParams()).f5086b == 0 && s(childAt)) {
                iMax5 += q(childAt, i3, iMax5, i4, 0, iArr);
                iMax = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i8 = this.f2164u + this.v;
        int i9 = this.f2162s + this.f2163t;
        if (s(this.e)) {
            q(this.e, i3, iMax5 + i9, i4, i8, iArr);
            int iK3 = k(this.e) + this.e.getMeasuredWidth();
            iL = l(this.e) + this.e.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
            iMax2 = iK3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iL = 0;
        }
        if (s(this.f2149f)) {
            iMax2 = Math.max(iMax2, q(this.f2149f, i3, iMax5 + i9, i4, iL + i8, iArr));
            iL += l(this.f2149f) + this.f2149f.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f2149f.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i3, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, iCombineMeasuredStates2 << 16);
        if (!this.f2143O) {
            i6 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i10 = 0; i10 < childCount2; i10++) {
            View childAt2 = getChildAt(i10);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i6 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i6);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof U0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        U0 u3 = (U0) parcelable;
        super.onRestoreInstanceState(u3.f337a);
        ActionMenuView actionMenuView = this.f2148d;
        i iVar = actionMenuView != null ? actionMenuView.f2032s : null;
        int i3 = u3.f5091c;
        if (i3 != 0 && this.f2142N != null && iVar != null && (menuItemFindItem = iVar.findItem(i3)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (u3.f5092d) {
            l lVar = this.f2147S;
            removeCallbacks(lVar);
            post(lVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        d();
        C0756t0 c0756t0 = this.f2165w;
        boolean z2 = i3 == 1;
        if (z2 == c0756t0.f5250g) {
            return;
        }
        c0756t0.f5250g = z2;
        if (!c0756t0.f5251h) {
            c0756t0.f5245a = c0756t0.e;
            c0756t0.f5246b = c0756t0.f5249f;
            return;
        }
        if (z2) {
            int i4 = c0756t0.f5248d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = c0756t0.e;
            }
            c0756t0.f5245a = i4;
            int i5 = c0756t0.f5247c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = c0756t0.f5249f;
            }
            c0756t0.f5246b = i5;
            return;
        }
        int i6 = c0756t0.f5247c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = c0756t0.e;
        }
        c0756t0.f5245a = i6;
        int i7 = c0756t0.f5248d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = c0756t0.f5249f;
        }
        c0756t0.f5246b = i7;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0734i c0734i;
        C0728f c0728f;
        j jVar;
        U0 u3 = new U0(super.onSaveInstanceState());
        R0 r3 = this.f2142N;
        if (r3 != null && (jVar = r3.e) != null) {
            u3.f5091c = jVar.f4936a;
        }
        ActionMenuView actionMenuView = this.f2148d;
        u3.f5092d = (actionMenuView == null || (c0734i = actionMenuView.v) == null || (c0728f = c0734i.f5180u) == null || !c0728f.b()) ? false : true;
        return u3;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2134E = false;
        }
        if (!this.f2134E) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f2134E = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2134E = false;
        }
        return true;
    }

    public final int p(View view, int i3, int i4, int[] iArr) {
        S0 s3 = (S0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) s3).rightMargin - iArr[1];
        int iMax = i3 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int iJ = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) s3).leftMargin);
    }

    public final int q(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i8) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + iMax + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f2146R != z2) {
            this.f2146R = z2;
            t();
        }
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(G2.b(getContext(), i3));
    }

    public void setCollapsible(boolean z2) {
        this.f2143O = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f2167y) {
            this.f2167y = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f2166x) {
            this.f2166x = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(G2.b(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(G2.b(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f2150g.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f2148d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f2157n != i3) {
            this.f2157n = i3;
            if (i3 == 0) {
                this.f2156m = getContext();
            } else {
                this.f2156m = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.v = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f2163t = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f2162s = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f2164u = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    public final void t() {
        boolean z2;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = Q0.a(this);
            R0 r3 = this.f2142N;
            if (r3 == null || r3.e == null || onBackInvokedDispatcherA == null) {
                z2 = false;
            } else {
                Field field = D.f41a;
                if (isAttachedToWindow() && this.f2146R) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2 && this.f2145Q == null) {
                if (this.f2144P == null) {
                    this.f2144P = Q0.b(new O0(this, i3));
                }
                Q0.c(onBackInvokedDispatcherA, this.f2144P);
                this.f2145Q = onBackInvokedDispatcherA;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f2145Q) == null) {
                return;
            }
            Q0.d(onBackInvokedDispatcher, this.f2144P);
            this.f2145Q = null;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        S0 s3 = new S0(context, attributeSet);
        s3.f5085a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p011d.a.f3532b);
        s3.f5085a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        s3.f5086b = 0;
        return s3;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0750q c0750q = this.f2154k;
        if (c0750q != null) {
            c0750q.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f2154k.setImageDrawable(drawable);
        } else {
            C0750q c0750q = this.f2154k;
            if (c0750q != null) {
                c0750q.setImageDrawable(this.f2152i);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f2151h == null) {
                this.f2151h = new r(getContext(), 0);
            }
            if (!n(this.f2151h)) {
                b(this.f2151h, true);
            }
        } else {
            r rVar = this.f2151h;
            if (rVar != null && n(rVar)) {
                removeView(this.f2151h);
                this.f2137H.remove(this.f2151h);
            }
        }
        r rVar2 = this.f2151h;
        if (rVar2 != null) {
            rVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2151h == null) {
            this.f2151h = new r(getContext(), 0);
        }
        r rVar = this.f2151h;
        if (rVar != null) {
            rVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0750q c0750q = this.f2150g;
        if (c0750q != null) {
            c0750q.setContentDescription(charSequence);
            O2.a(this.f2150g, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!n(this.f2150g)) {
                b(this.f2150g, true);
            }
        } else {
            C0750q c0750q = this.f2150g;
            if (c0750q != null && n(c0750q)) {
                removeView(this.f2150g);
                this.f2137H.remove(this.f2150g);
            }
        }
        C0750q c0750q2 = this.f2150g;
        if (c0750q2 != null) {
            c0750q2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            E e = this.f2149f;
            if (e != null && n(e)) {
                removeView(this.f2149f);
                this.f2137H.remove(this.f2149f);
            }
        } else {
            if (this.f2149f == null) {
                Context context = getContext();
                E e3 = new E(context, null);
                this.f2149f = e3;
                e3.setSingleLine();
                this.f2149f.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f2159p;
                if (i3 != 0) {
                    this.f2149f.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f2133D;
                if (colorStateList != null) {
                    this.f2149f.setTextColor(colorStateList);
                }
            }
            if (!n(this.f2149f)) {
                b(this.f2149f, true);
            }
        }
        E e4 = this.f2149f;
        if (e4 != null) {
            e4.setText(charSequence);
        }
        this.f2131B = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f2133D = colorStateList;
        E e = this.f2149f;
        if (e != null) {
            e.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            E e = this.e;
            if (e != null && n(e)) {
                removeView(this.e);
                this.f2137H.remove(this.e);
            }
        } else {
            if (this.e == null) {
                Context context = getContext();
                E e3 = new E(context, null);
                this.e = e3;
                e3.setSingleLine();
                this.e.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f2158o;
                if (i3 != 0) {
                    this.e.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f2132C;
                if (colorStateList != null) {
                    this.e.setTextColor(colorStateList);
                }
            }
            if (!n(this.e)) {
                b(this.e, true);
            }
        }
        E e4 = this.e;
        if (e4 != null) {
            e4.setText(charSequence);
        }
        this.f2130A = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f2132C = colorStateList;
        E e = this.e;
        if (e != null) {
            e.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(T0 t1) {
    }
}
