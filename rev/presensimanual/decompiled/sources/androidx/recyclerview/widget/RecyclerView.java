package androidx.recyclerview.widget;

import A.c;
import B.AbstractC0020v;
import B.AbstractC0022x;
import B.C0006g;
import B.C0008i;
import B.E;
import B.H;
import B2.h;
import D0.b;
import E0.l;
import L0.g;
import Y.A;
import Y.B;
import Y.C;
import Y.C0107b;
import Y.C0111f;
import Y.C0112g;
import Y.D;
import Y.F;
import Y.M;
import Y.RunnableC0114i;
import Y.n;
import Y.o;
import Y.p;
import Y.q;
import Y.r;
import Y.s;
import Y.t;
import Y.u;
import Y.w;
import Y.x;
import Y.y;
import Y.z;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p009c1.v;
import p045n.e;
import p067u1.a;
import p072x.j;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int[] f2438k0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int[] f2439l0 = {R.attr.clipToPadding};

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final boolean f2440m0 = true;
    public static final Class[] n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final n f2441o0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f2442A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public q f2443B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public EdgeEffect f2444C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public EdgeEffect f2445D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public EdgeEffect f2446E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public EdgeEffect f2447F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public r f2448G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f2449H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f2450I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public VelocityTracker f2451J;
    public int K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f2452L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f2453M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f2454N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f2455O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f2456P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f2457Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final float f2458R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final float f2459S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f2460T;
    public final D U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public RunnableC0114i f2461V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final C0112g f2462W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final B f2463a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ArrayList f2464b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final v f2465c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f2466d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public F f2467d0;
    public A e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C0008i f2468e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f2469f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int[] f2470f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f2471g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int[] f2472g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f2473h;
    public final int[] h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2474i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final ArrayList f2475i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f2476j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final l f2477j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f2478k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s f2479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f2480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f2481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0111f f2482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2488u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AccessibilityManager f2489w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2490x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2491y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2492z;

    static {
        Class cls = Integer.TYPE;
        n0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2441o0 = new n();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        float fA;
        int i3;
        char c3;
        char c4;
        Constructor constructor;
        super(context, attributeSet, 0);
        int i4 = 8;
        this.f2466d = new y(this);
        a aVar = new a();
        new p045n.b();
        new e();
        this.f2473h = aVar;
        this.f2476j = new Rect();
        this.f2478k = new Rect();
        new RectF();
        this.f2480m = new ArrayList();
        this.f2481n = new ArrayList();
        this.f2486s = 0;
        this.f2490x = false;
        this.f2491y = false;
        this.f2492z = 0;
        this.f2442A = 0;
        this.f2443B = new q();
        C0107b c0107b = new C0107b();
        Object[] objArr = null;
        c0107b.f1901a = null;
        c0107b.f1902b = new ArrayList();
        c0107b.f1903c = 250L;
        c0107b.f1904d = 250L;
        c0107b.e = new ArrayList();
        c0107b.f1845f = new ArrayList();
        c0107b.f1846g = new ArrayList();
        c0107b.f1847h = new ArrayList();
        c0107b.f1848i = new ArrayList();
        c0107b.f1849j = new ArrayList();
        c0107b.f1850k = new ArrayList();
        c0107b.f1851l = new ArrayList();
        c0107b.f1852m = new ArrayList();
        c0107b.f1853n = new ArrayList();
        c0107b.f1854o = new ArrayList();
        this.f2448G = c0107b;
        this.f2449H = 0;
        this.f2450I = -1;
        this.f2458R = Float.MIN_VALUE;
        this.f2459S = Float.MIN_VALUE;
        boolean z2 = true;
        this.f2460T = true;
        this.U = new D(this);
        this.f2462W = f2440m0 ? new C0112g() : null;
        B b3 = new B();
        b3.f1811a = 0;
        b3.f1812b = false;
        b3.f1813c = false;
        b3.f1814d = false;
        b3.e = false;
        this.f2463a0 = b3;
        v vVar = new v();
        this.f2465c0 = vVar;
        this.f2470f0 = new int[2];
        this.f2472g0 = new int[2];
        this.h0 = new int[2];
        this.f2475i0 = new ArrayList();
        this.f2477j0 = new l(i4, this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2439l0, 0, 0);
            this.f2474i = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f2474i = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2455O = viewConfiguration.getScaledTouchSlop();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = H.f44a;
            fA = E.a(viewConfiguration);
        } else {
            fA = H.a(viewConfiguration, context);
        }
        this.f2458R = fA;
        this.f2459S = i5 >= 26 ? E.b(viewConfiguration) : H.a(viewConfiguration, context);
        this.f2456P = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2457Q = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2448G.f1901a = vVar;
        this.f2469f = new b(new g(this));
        this.f2471g = new b(new C0006g(28, this));
        Field field = B.D.f41a;
        if ((i5 >= 26 ? AbstractC0022x.c(this) : 0) == 0 && i5 >= 26) {
            AbstractC0022x.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2489w = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new F(this));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, X.a.f1807a, 0, 0);
            String string = typedArrayObtainStyledAttributes2.getString(7);
            if (typedArrayObtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(5);
                Drawable drawable = typedArrayObtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = typedArrayObtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
                Resources resources = getContext().getResources();
                c3 = 3;
                i3 = 4;
                c4 = 2;
                new C0111f(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(id.go.bangkalankab.simpeg.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(id.go.bangkalankab.simpeg.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(id.go.bangkalankab.simpeg.R.dimen.fastscroll_margin));
            } else {
                i3 = 4;
                c3 = 3;
                c4 = 2;
            }
            typedArrayObtainStyledAttributes2.recycle();
            if (string != null) {
                String strTrim = string.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.charAt(0) == '.') {
                        strTrim = context.getPackageName() + strTrim;
                    } else if (!strTrim.contains(".")) {
                        strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                    }
                    try {
                        Class<? extends U> clsAsSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(strTrim).asSubclass(s.class);
                        try {
                            constructor = clsAsSubclass.getConstructor(n0);
                            Object[] objArr2 = new Object[i3];
                            objArr2[0] = context;
                            objArr2[1] = attributeSet;
                            objArr2[c4] = 0;
                            objArr2[c3] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e) {
                            try {
                                constructor = clsAsSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e3) {
                                e3.initCause(e);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e3);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((s) constructor.newInstance(objArr));
                    } catch (ClassCastException e4) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e4);
                    } catch (ClassNotFoundException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e5);
                    } catch (IllegalAccessException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e6);
                    } catch (InstantiationException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e7);
                    } catch (InvocationTargetException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e8);
                    }
                }
            }
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2438k0, 0, 0);
            z2 = typedArrayObtainStyledAttributes3.getBoolean(0, true);
            typedArrayObtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    private C0008i getScrollingChildHelper() {
        if (this.f2468e0 == null) {
            this.f2468e0 = new C0008i(this);
        }
        return this.f2468e0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((t) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i3, int i4) {
        s sVar = this.f2479l;
        if (sVar != null) {
            sVar.getClass();
        }
        super.addFocusables(arrayList, i3, i4);
    }

    public final void b(String str) {
        if (this.f2492z > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f2442A > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int i3, int i4) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f2444C;
        if (edgeEffect == null || edgeEffect.isFinished() || i3 <= 0) {
            zIsFinished = false;
        } else {
            this.f2444C.onRelease();
            zIsFinished = this.f2444C.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2446E;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.f2446E.onRelease();
            zIsFinished |= this.f2446E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2445D;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f2445D.onRelease();
            zIsFinished |= this.f2445D.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2447F;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f2447F.onRelease();
            zIsFinished |= this.f2447F.isFinished();
        }
        if (zIsFinished) {
            Field field = B.D.f41a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof t) && this.f2479l.d((t) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        s sVar = this.f2479l;
        if (sVar != null && sVar.b()) {
            return this.f2479l.f(this.f2463a0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        s sVar = this.f2479l;
        if (sVar != null && sVar.b()) {
            this.f2479l.g(this.f2463a0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        s sVar = this.f2479l;
        if (sVar != null && sVar.b()) {
            return this.f2479l.h(this.f2463a0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        s sVar = this.f2479l;
        if (sVar != null && sVar.c()) {
            return this.f2479l.i(this.f2463a0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        s sVar = this.f2479l;
        if (sVar != null && sVar.c()) {
            this.f2479l.j(this.f2463a0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        s sVar = this.f2479l;
        if (sVar != null && sVar.c()) {
            return this.f2479l.k(this.f2463a0);
        }
        return 0;
    }

    public final void d() {
        b bVar = this.f2469f;
        if (!this.f2485r || this.f2490x) {
            int i3 = j.f5820a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        if (((ArrayList) bVar.f182f).size() > 0) {
            bVar.getClass();
            if (((ArrayList) bVar.f182f).size() > 0) {
                int i4 = j.f5820a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f4, boolean z2) {
        return getScrollingChildHelper().a(f3, f4, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return getScrollingChildHelper().b(f3, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f2480m;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C0111f c0111f = (C0111f) arrayList.get(i3);
            if (c0111f.f1870l != c0111f.f1872n.getWidth() || c0111f.f1871m != c0111f.f1872n.getHeight()) {
                c0111f.f1870l = c0111f.f1872n.getWidth();
                c0111f.f1871m = c0111f.f1872n.getHeight();
                c0111f.e(0);
            } else if (c0111f.v != 0) {
                if (c0111f.f1873o) {
                    int i4 = c0111f.f1870l;
                    int i5 = c0111f.f1863d;
                    int i6 = i4 - i5;
                    int i7 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0111f.f1861b;
                    stateListDrawable.setBounds(0, 0, i5, 0);
                    int i8 = c0111f.f1871m;
                    Drawable drawable = c0111f.f1862c;
                    drawable.setBounds(0, 0, c0111f.e, i8);
                    RecyclerView recyclerView = c0111f.f1872n;
                    Field field = B.D.f41a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i5, i7);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i5, -i7);
                    } else {
                        canvas.translate(i6, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i7);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i6, -i7);
                    }
                }
                if (c0111f.f1874p) {
                    int i9 = c0111f.f1871m;
                    int i10 = c0111f.f1866h;
                    int i11 = i9 - i10;
                    int i12 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable2 = c0111f.f1864f;
                    stateListDrawable2.setBounds(0, 0, 0, i10);
                    int i13 = c0111f.f1870l;
                    Drawable drawable2 = c0111f.f1865g;
                    drawable2.setBounds(0, 0, i13, c0111f.f1867i);
                    canvas.translate(0.0f, i11);
                    drawable2.draw(canvas);
                    canvas.translate(i12, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i12, -i11);
                }
            }
        }
        EdgeEffect edgeEffect = this.f2444C;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f2474i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2444C;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f2445D;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f2474i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2445D;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f2446E;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2474i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2446E;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f2447F;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2474i) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2447F;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.f2448G == null || arrayList.size() <= 0 || !this.f2448G.b()) ? z2 : true) {
            Field field2 = B.D.f41a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(int i3, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = B.D.f41a;
        setMeasuredDimension(s.e(i3, paddingRight, getMinimumWidth()), s.e(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        return getScrollingChildHelper().c(i3, i4, iArr, iArr2, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i3) {
        int i4;
        this.f2479l.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i3);
        if (viewFindNextFocus != null && !viewFindNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i3);
            }
            o(viewFindNextFocus, null);
            return view;
        }
        if (viewFindNextFocus != null && viewFindNextFocus != this && i(viewFindNextFocus) != null) {
            if (view == null || i(view) == null) {
                return viewFindNextFocus;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f2476j;
            byte b3 = 0;
            rect.set(0, 0, width, height);
            int width2 = viewFindNextFocus.getWidth();
            int height2 = viewFindNextFocus.getHeight();
            Rect rect2 = this.f2478k;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect2);
            RecyclerView recyclerView = this.f2479l.f1906b;
            Field field = B.D.f41a;
            int i5 = recyclerView.getLayoutDirection() == 1 ? -1 : 1;
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                i4 = 1;
            } else {
                int i8 = rect.right;
                int i9 = rect2.right;
                i4 = ((i8 > i9 || i6 >= i9) && i6 > i7) ? -1 : 0;
            }
            int i10 = rect.top;
            int i11 = rect2.top;
            if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
                b3 = 1;
            } else {
                int i12 = rect.bottom;
                int i13 = rect2.bottom;
                if ((i12 > i13 || i10 >= i13) && i10 > i11) {
                    b3 = -1;
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 17) {
                        if (i3 != 33) {
                            if (i3 != 66) {
                                if (i3 != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i3 + h());
                                }
                                if (b3 > 0) {
                                    return viewFindNextFocus;
                                }
                            } else if (i4 > 0) {
                                return viewFindNextFocus;
                            }
                        } else if (b3 < 0) {
                            return viewFindNextFocus;
                        }
                    } else if (i4 < 0) {
                        return viewFindNextFocus;
                    }
                } else {
                    if (b3 > 0) {
                        return viewFindNextFocus;
                    }
                    if (b3 == 0 && i4 * i5 >= 0) {
                        return viewFindNextFocus;
                    }
                }
            } else {
                if (b3 < 0) {
                    return viewFindNextFocus;
                }
                if (b3 == 0 && i4 * i5 <= 0) {
                    return viewFindNextFocus;
                }
            }
        }
        return super.focusSearch(view, i3);
    }

    public final boolean g(int[] iArr, int i3) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i3, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        s sVar = this.f2479l;
        if (sVar != null) {
            return sVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        s sVar = this.f2479l;
        if (sVar != null) {
            return sVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public o getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        s sVar = this.f2479l;
        if (sVar == null) {
            return super.getBaseline();
        }
        sVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i3, int i4) {
        return super.getChildDrawingOrder(i3, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2474i;
    }

    public F getCompatAccessibilityDelegate() {
        return this.f2467d0;
    }

    public q getEdgeEffectFactory() {
        return this.f2443B;
    }

    public r getItemAnimator() {
        return this.f2448G;
    }

    public int getItemDecorationCount() {
        return this.f2480m.size();
    }

    public s getLayoutManager() {
        return this.f2479l;
    }

    public int getMaxFlingVelocity() {
        return this.f2457Q;
    }

    public int getMinFlingVelocity() {
        return this.f2456P;
    }

    public long getNanoTime() {
        if (f2440m0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public u getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2460T;
    }

    public x getRecycledViewPool() {
        y yVar = this.f2466d;
        if (yVar.e == null) {
            x xVar = new x();
            xVar.f1913a = new SparseArray();
            xVar.f1914b = 0;
            yVar.e = xVar;
        }
        return yVar.e;
    }

    public int getScrollState() {
        return this.f2449H;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f2479l + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final View i(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2483p;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f87d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.f2485r || this.f2490x || ((ArrayList) this.f2469f.f182f).size() > 0;
    }

    public final void m() {
        int iG = this.f2471g.G();
        for (int i3 = 0; i3 < iG; i3++) {
            ((t) this.f2471g.F(i3).getLayoutParams()).f1912b = true;
        }
        ArrayList arrayList = this.f2466d.f1916b;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2450I) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f2450I = motionEvent.getPointerId(i3);
            int x3 = (int) (motionEvent.getX(i3) + 0.5f);
            this.f2453M = x3;
            this.K = x3;
            int y2 = (int) (motionEvent.getY(i3) + 0.5f);
            this.f2454N = y2;
            this.f2452L = y2;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2476j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof t) {
            t tVar = (t) layoutParams;
            if (!tVar.f1912b) {
                int i3 = rect.left;
                Rect rect2 = tVar.f1911a;
                rect.left = i3 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2479l.G(this, view, this.f2476j, !this.f2485r, view2 == null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        boolean z2 = false;
        this.f2492z = 0;
        this.f2483p = true;
        if (this.f2485r && !isLayoutRequested()) {
            z2 = true;
        }
        this.f2485r = z2;
        s sVar = this.f2479l;
        if (sVar != null) {
            sVar.e = true;
        }
        if (f2440m0) {
            ThreadLocal threadLocal = RunnableC0114i.f1888h;
            RunnableC0114i runnableC0114i = (RunnableC0114i) threadLocal.get();
            this.f2461V = runnableC0114i;
            if (runnableC0114i == null) {
                RunnableC0114i runnableC0114i2 = new RunnableC0114i();
                runnableC0114i2.f1890d = new ArrayList();
                runnableC0114i2.f1892g = new ArrayList();
                this.f2461V = runnableC0114i2;
                Field field = B.D.f41a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC0114i runnableC0114i3 = this.f2461V;
                runnableC0114i3.f1891f = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC0114i3);
            }
            this.f2461V.f1890d.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        RunnableC0114i runnableC0114i;
        super.onDetachedFromWindow();
        r rVar = this.f2448G;
        if (rVar != null) {
            rVar.a();
        }
        setScrollState(0);
        D d3 = this.U;
        d3.f1820j.removeCallbacks(d3);
        d3.f1816f.abortAnimation();
        this.f2483p = false;
        s sVar = this.f2479l;
        if (sVar != null) {
            sVar.e = false;
            sVar.z(this);
        }
        this.f2475i0.clear();
        removeCallbacks(this.f2477j0);
        this.f2473h.getClass();
        do {
            c cVar = M.f1844a;
            int i3 = cVar.f2a;
            obj = null;
            if (i3 > 0) {
                int i4 = i3 - 1;
                Object[] objArr = (Object[]) cVar.f3b;
                Object obj2 = objArr[i4];
                h.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i4] = null;
                cVar.f2a--;
                obj = obj2;
            }
        } while (obj != null);
        if (!f2440m0 || (runnableC0114i = this.f2461V) == null) {
            return;
        }
        runnableC0114i.f1890d.remove(this);
        this.f2461V = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2480m;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0111f) arrayList.get(i3)).getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f3;
        float axisValue;
        if (this.f2479l != null && !this.f2487t && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.f2479l.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f2479l.b() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f2479l.c()) {
                    f3 = -axisValue2;
                } else if (this.f2479l.b()) {
                    axisValue = axisValue2;
                    f3 = 0.0f;
                } else {
                    f3 = 0.0f;
                }
            } else {
                f3 = 0.0f;
            }
            if (f3 != 0.0f || axisValue != 0.0f) {
                q((int) (axisValue * this.f2458R), (int) (f3 * this.f2459S), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f2487t) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f2482o = null;
        }
        ArrayList arrayList = this.f2481n;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0111f c0111f = (C0111f) arrayList.get(i3);
            if (c0111f.c(motionEvent) && action != 3) {
                this.f2482o = c0111f;
                p();
                setScrollState(0);
                return true;
            }
        }
        s sVar = this.f2479l;
        if (sVar == null) {
            return false;
        }
        boolean zB = sVar.b();
        boolean zC = this.f2479l.c();
        if (this.f2451J == null) {
            this.f2451J = VelocityTracker.obtain();
        }
        this.f2451J.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2488u) {
                this.f2488u = false;
            }
            this.f2450I = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f2453M = x3;
            this.K = x3;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f2454N = y2;
            this.f2452L = y2;
            if (this.f2449H == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.h0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i4 = zB;
            if (zC) {
                i4 = (zB ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(i4, 0);
        } else if (actionMasked == 1) {
            this.f2451J.clear();
            s(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f2450I);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2450I + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x4 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f2449H != 1) {
                int i5 = x4 - this.K;
                int i6 = y3 - this.f2452L;
                if (!zB || Math.abs(i5) <= this.f2455O) {
                    z2 = false;
                } else {
                    this.f2453M = x4;
                    z2 = true;
                }
                if (zC && Math.abs(i6) > this.f2455O) {
                    this.f2454N = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            p();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f2450I = motionEvent.getPointerId(actionIndex);
            int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2453M = x5;
            this.K = x5;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2454N = y4;
            this.f2452L = y4;
        } else if (actionMasked == 6) {
            n(motionEvent);
        }
        return this.f2449H == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int i7 = j.f5820a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.f2485r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        s sVar = this.f2479l;
        if (sVar == null) {
            e(i3, i4);
            return;
        }
        if (sVar.y()) {
            View.MeasureSpec.getMode(i3);
            View.MeasureSpec.getMode(i4);
            this.f2479l.f1906b.e(i3, i4);
        } else {
            if (this.f2484q) {
                this.f2479l.f1906b.e(i3, i4);
                return;
            }
            B b3 = this.f2463a0;
            if (b3.e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            b3.getClass();
            this.f2486s++;
            this.f2479l.f1906b.e(i3, i4);
            if (this.f2486s < 1) {
                this.f2486s = 1;
            }
            this.f2486s--;
            b3.f1813c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (this.f2492z > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        A a3 = (A) parcelable;
        this.e = a3;
        super.onRestoreInstanceState(a3.f337a);
        s sVar = this.f2479l;
        if (sVar == null || (parcelable2 = this.e.f1810c) == null) {
            return;
        }
        sVar.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        A a3 = new A(super.onSaveInstanceState());
        A a4 = this.e;
        if (a4 != null) {
            a3.f1810c = a4.f1810c;
        } else {
            s sVar = this.f2479l;
            if (sVar != null) {
                a3.f1810c = sVar.C();
            } else {
                a3.f1810c = null;
            }
        }
        return a3;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (i3 == i5 && i4 == i6) {
            return;
        }
        this.f2447F = null;
        this.f2445D = null;
        this.f2446E = null;
        this.f2444C = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0232  */
    /* JADX WARN: Code duplicated, block: B:101:0x0234  */
    /* JADX WARN: Code duplicated, block: B:103:0x0237  */
    /* JADX WARN: Code duplicated, block: B:105:0x023a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0242 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0244  */
    /* JADX WARN: Code duplicated, block: B:109:0x0247  */
    /* JADX WARN: Code duplicated, block: B:112:0x024c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0255  */
    /* JADX WARN: Code duplicated, block: B:117:0x0261  */
    /* JADX WARN: Code duplicated, block: B:118:0x0263  */
    /* JADX WARN: Code duplicated, block: B:120:0x0266  */
    /* JADX WARN: Code duplicated, block: B:126:0x0277  */
    /* JADX WARN: Code duplicated, block: B:128:0x0288  */
    /* JADX WARN: Code duplicated, block: B:129:0x0292  */
    /* JADX WARN: Code duplicated, block: B:131:0x0295  */
    /* JADX WARN: Code duplicated, block: B:132:0x029f  */
    /* JADX WARN: Code duplicated, block: B:137:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:143:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:147:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x02de  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:169:0x0336  */
    /* JADX WARN: Code duplicated, block: B:171:0x0352  */
    /* JADX WARN: Code duplicated, block: B:178:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:58:0x0130  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145 A[LOOP:0: B:57:0x012e->B:63:0x0145, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0171  */
    /* JADX WARN: Code duplicated, block: B:75:0x0182  */
    /* JADX WARN: Code duplicated, block: B:77:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x018a  */
    /* JADX WARN: Code duplicated, block: B:81:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0192  */
    /* JADX WARN: Code duplicated, block: B:85:0x0197  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0202  */
    /* JADX WARN: Code duplicated, block: B:96:0x0226 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0228  */
    /* JADX WARN: Code duplicated, block: B:99:0x0230 A[DONT_INVERT] */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x01c3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s sVar;
        boolean zB;
        boolean zC;
        MotionEvent motionEventObtain;
        int actionMasked;
        int actionIndex;
        int[] iArr;
        int i3;
        int i4;
        float f3;
        float f4;
        int i5;
        int i6;
        s sVar2;
        boolean zB2;
        boolean zC2;
        float f5;
        float f6;
        boolean z2;
        int i7;
        int iFindPointerIndex;
        int x3;
        int y2;
        int i8;
        int i9;
        boolean zF;
        int[] iArr2;
        int i10;
        int i11;
        RunnableC0114i runnableC0114i;
        boolean z3;
        int iAbs;
        int i12;
        int iAbs2;
        int i13;
        ArrayList arrayList;
        int size;
        int i14;
        C0111f c0111f;
        if (this.f2487t || this.f2488u) {
            return false;
        }
        int action = motionEvent.getAction();
        C0111f c0111f2 = this.f2482o;
        if (c0111f2 == null) {
            if (action != 0) {
                arrayList = this.f2481n;
                size = arrayList.size();
                for (i14 = 0; i14 < size; i14++) {
                    c0111f = (C0111f) arrayList.get(i14);
                    if (c0111f.c(motionEvent)) {
                        this.f2482o = c0111f;
                    }
                }
            }
            sVar = this.f2479l;
            if (sVar == null) {
                return false;
            }
            zB = sVar.b();
            zC = this.f2479l.c();
            if (this.f2451J == null) {
                this.f2451J = VelocityTracker.obtain();
            }
            motionEventObtain = MotionEvent.obtain(motionEvent);
            actionMasked = motionEvent.getActionMasked();
            actionIndex = motionEvent.getActionIndex();
            iArr = this.h0;
            if (actionMasked == 0) {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            motionEventObtain.offsetLocation(iArr[0], iArr[1]);
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    this.f2451J.addMovement(motionEventObtain);
                    VelocityTracker velocityTracker = this.f2451J;
                    i4 = this.f2457Q;
                    velocityTracker.computeCurrentVelocity(1000, i4);
                    if (zB) {
                        f3 = -this.f2451J.getXVelocity(this.f2450I);
                    } else {
                        f3 = 0.0f;
                    }
                    if (zC) {
                        f4 = -this.f2451J.getYVelocity(this.f2450I);
                    } else {
                        f4 = 0.0f;
                    }
                    if (f3 == 0.0f || f4 != 0.0f) {
                        i5 = (int) f3;
                        i6 = (int) f4;
                        sVar2 = this.f2479l;
                        if (sVar2 == null) {
                            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f2487t) {
                            zB2 = sVar2.b();
                            zC2 = this.f2479l.c();
                            int i15 = this.f2456P;
                            if (zB2 || Math.abs(i5) < i15) {
                                i5 = 0;
                            }
                            if (zC2 || Math.abs(i6) < i15) {
                                i6 = 0;
                            }
                            if (i5 == 0 || i6 != 0) {
                                f5 = i5;
                                f6 = i6;
                                if (!dispatchNestedPreFling(f5, f6)) {
                                    if (!zB2 || zC2) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    dispatchNestedFling(f5, f6, z2);
                                    i7 = zB2;
                                    if (z2) {
                                        if (zC2) {
                                            i7 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().g(i7, 1);
                                        int i16 = -i4;
                                        int iMax = Math.max(i16, Math.min(i5, i4));
                                        int iMax2 = Math.max(i16, Math.min(i6, i4));
                                        D d3 = this.U;
                                        d3.f1820j.setScrollState(2);
                                        d3.e = 0;
                                        d3.f1815d = 0;
                                        d3.f1816f.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        d3.a();
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                    } else {
                        setScrollState(0);
                    }
                    p();
                } else if (actionMasked != 2) {
                    iFindPointerIndex = motionEvent.findPointerIndex(this.f2450I);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2450I + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    i8 = this.f2453M - x3;
                    i9 = this.f2454N - y2;
                    zF = f(i8, i9, this.f2472g0, this.f2470f0, 0);
                    iArr2 = this.f2470f0;
                    if (zF) {
                        int[] iArr3 = this.f2472g0;
                        i8 -= iArr3[0];
                        i9 -= iArr3[1];
                        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                        iArr[0] = iArr[0] + iArr2[0];
                        iArr[1] = iArr[1] + iArr2[1];
                    }
                    if (this.f2449H != 1) {
                        if (zB) {
                            iAbs2 = Math.abs(i8);
                            i13 = this.f2455O;
                            if (iAbs2 > i13) {
                                if (i8 > 0) {
                                    i8 -= i13;
                                } else {
                                    i8 += i13;
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            z3 = false;
                        }
                        if (zC) {
                            iAbs = Math.abs(i9);
                            i12 = this.f2455O;
                            if (iAbs > i12) {
                                if (i9 > 0) {
                                    i9 -= i12;
                                } else {
                                    i9 += i12;
                                }
                                z3 = true;
                            }
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                    i10 = i9;
                    if (this.f2449H == 1) {
                        this.f2453M = x3 - iArr2[0];
                        this.f2454N = y2 - iArr2[1];
                        if (zB) {
                            i11 = i8;
                        } else {
                            i11 = 0;
                        }
                        q(i11, zC ? i10 : 0, motionEventObtain);
                        runnableC0114i = this.f2461V;
                        if (runnableC0114i != null && (i8 != 0 || i10 != 0)) {
                            runnableC0114i.a(this, i8, i10);
                        }
                    }
                } else if (actionMasked != 3) {
                    p();
                    setScrollState(0);
                } else if (actionMasked != 5) {
                    this.f2450I = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f2453M = x4;
                    this.K = x4;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f2454N = y3;
                    this.f2452L = y3;
                } else if (actionMasked == 6) {
                    n(motionEvent);
                }
                motionEventObtain.recycle();
                return true;
            }
            this.f2450I = motionEvent.getPointerId(0);
            int x5 = (int) (motionEvent.getX() + 0.5f);
            this.f2453M = x5;
            this.K = x5;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.f2454N = y4;
            this.f2452L = y4;
            if (zC) {
                i3 = zB;
                i3 = (zB ? 1 : 0) | 2;
            }
            i3 = zB;
            getScrollingChildHelper().g(i3, 0);
            this.f2451J.addMovement(motionEventObtain);
            motionEventObtain.recycle();
            return true;
        }
        if (action == 0) {
            this.f2482o = null;
            if (action != 0) {
                arrayList = this.f2481n;
                size = arrayList.size();
                while (i14 < size) {
                    c0111f = (C0111f) arrayList.get(i14);
                    if (c0111f.c(motionEvent)) {
                        this.f2482o = c0111f;
                    }
                }
            }
            sVar = this.f2479l;
            if (sVar == null) {
                return false;
            }
            zB = sVar.b();
            zC = this.f2479l.c();
            if (this.f2451J == null) {
                this.f2451J = VelocityTracker.obtain();
            }
            motionEventObtain = MotionEvent.obtain(motionEvent);
            actionMasked = motionEvent.getActionMasked();
            actionIndex = motionEvent.getActionIndex();
            iArr = this.h0;
            if (actionMasked == 0) {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            motionEventObtain.offsetLocation(iArr[0], iArr[1]);
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    this.f2451J.addMovement(motionEventObtain);
                    VelocityTracker velocityTracker2 = this.f2451J;
                    i4 = this.f2457Q;
                    velocityTracker2.computeCurrentVelocity(1000, i4);
                    if (zB) {
                        f3 = -this.f2451J.getXVelocity(this.f2450I);
                    } else {
                        f3 = 0.0f;
                    }
                    if (zC) {
                        f4 = -this.f2451J.getYVelocity(this.f2450I);
                    } else {
                        f4 = 0.0f;
                    }
                    if (f3 == 0.0f) {
                        i5 = (int) f3;
                        i6 = (int) f4;
                        sVar2 = this.f2479l;
                        if (sVar2 == null) {
                            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f2487t) {
                            zB2 = sVar2.b();
                            zC2 = this.f2479l.c();
                            int i17 = this.f2456P;
                            if (zB2) {
                                i5 = 0;
                            } else {
                                i5 = 0;
                            }
                            if (zC2) {
                                i6 = 0;
                            } else {
                                i6 = 0;
                            }
                            if (i5 == 0) {
                                f5 = i5;
                                f6 = i6;
                                if (!dispatchNestedPreFling(f5, f6)) {
                                    if (zB2) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    dispatchNestedFling(f5, f6, z2);
                                    i7 = zB2;
                                    if (z2) {
                                        if (zC2) {
                                            i7 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().g(i7, 1);
                                        int i18 = -i4;
                                        int iMax3 = Math.max(i18, Math.min(i5, i4));
                                        int iMax4 = Math.max(i18, Math.min(i6, i4));
                                        D d4 = this.U;
                                        d4.f1820j.setScrollState(2);
                                        d4.e = 0;
                                        d4.f1815d = 0;
                                        d4.f1816f.fling(0, 0, iMax3, iMax4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        d4.a();
                                    }
                                }
                            } else {
                                f5 = i5;
                                f6 = i6;
                                if (!dispatchNestedPreFling(f5, f6)) {
                                    if (zB2) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    dispatchNestedFling(f5, f6, z2);
                                    i7 = zB2;
                                    if (z2) {
                                        if (zC2) {
                                            i7 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().g(i7, 1);
                                        int i19 = -i4;
                                        int iMax5 = Math.max(i19, Math.min(i5, i4));
                                        int iMax6 = Math.max(i19, Math.min(i6, i4));
                                        D d5 = this.U;
                                        d5.f1820j.setScrollState(2);
                                        d5.e = 0;
                                        d5.f1815d = 0;
                                        d5.f1816f.fling(0, 0, iMax5, iMax6, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        d5.a();
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                    } else {
                        i5 = (int) f3;
                        i6 = (int) f4;
                        sVar2 = this.f2479l;
                        if (sVar2 == null) {
                            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        } else if (!this.f2487t) {
                            zB2 = sVar2.b();
                            zC2 = this.f2479l.c();
                            int i110 = this.f2456P;
                            if (zB2) {
                                i5 = 0;
                            } else {
                                i5 = 0;
                            }
                            if (zC2) {
                                i6 = 0;
                            } else {
                                i6 = 0;
                            }
                            if (i5 == 0) {
                                f5 = i5;
                                f6 = i6;
                                if (!dispatchNestedPreFling(f5, f6)) {
                                    if (zB2) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    dispatchNestedFling(f5, f6, z2);
                                    i7 = zB2;
                                    if (z2) {
                                        if (zC2) {
                                            i7 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().g(i7, 1);
                                        int i111 = -i4;
                                        int iMax7 = Math.max(i111, Math.min(i5, i4));
                                        int iMax8 = Math.max(i111, Math.min(i6, i4));
                                        D d6 = this.U;
                                        d6.f1820j.setScrollState(2);
                                        d6.e = 0;
                                        d6.f1815d = 0;
                                        d6.f1816f.fling(0, 0, iMax7, iMax8, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        d6.a();
                                    }
                                }
                            } else {
                                f5 = i5;
                                f6 = i6;
                                if (!dispatchNestedPreFling(f5, f6)) {
                                    if (zB2) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    dispatchNestedFling(f5, f6, z2);
                                    i7 = zB2;
                                    if (z2) {
                                        if (zC2) {
                                            i7 = (zB2 ? 1 : 0) | 2;
                                        }
                                        getScrollingChildHelper().g(i7, 1);
                                        int i112 = -i4;
                                        int iMax9 = Math.max(i112, Math.min(i5, i4));
                                        int iMax10 = Math.max(i112, Math.min(i6, i4));
                                        D d7 = this.U;
                                        d7.f1820j.setScrollState(2);
                                        d7.e = 0;
                                        d7.f1815d = 0;
                                        d7.f1816f.fling(0, 0, iMax9, iMax10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                        d7.a();
                                    }
                                }
                            }
                        }
                        setScrollState(0);
                    }
                    p();
                } else if (actionMasked != 2) {
                    iFindPointerIndex = motionEvent.findPointerIndex(this.f2450I);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2450I + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    i8 = this.f2453M - x3;
                    i9 = this.f2454N - y2;
                    zF = f(i8, i9, this.f2472g0, this.f2470f0, 0);
                    iArr2 = this.f2470f0;
                    if (zF) {
                        int[] iArr4 = this.f2472g0;
                        i8 -= iArr4[0];
                        i9 -= iArr4[1];
                        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                        iArr[0] = iArr[0] + iArr2[0];
                        iArr[1] = iArr[1] + iArr2[1];
                    }
                    if (this.f2449H != 1) {
                        if (zB) {
                            iAbs2 = Math.abs(i8);
                            i13 = this.f2455O;
                            if (iAbs2 > i13) {
                                if (i8 > 0) {
                                    i8 -= i13;
                                } else {
                                    i8 += i13;
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            z3 = false;
                        }
                        if (zC) {
                            iAbs = Math.abs(i9);
                            i12 = this.f2455O;
                            if (iAbs > i12) {
                                if (i9 > 0) {
                                    i9 -= i12;
                                } else {
                                    i9 += i12;
                                }
                                z3 = true;
                            }
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                    i10 = i9;
                    if (this.f2449H == 1) {
                        this.f2453M = x3 - iArr2[0];
                        this.f2454N = y2 - iArr2[1];
                        if (zB) {
                            i11 = i8;
                        } else {
                            i11 = 0;
                        }
                        q(i11, zC ? i10 : 0, motionEventObtain);
                        runnableC0114i = this.f2461V;
                        if (runnableC0114i != null) {
                            runnableC0114i.a(this, i8, i10);
                        }
                    }
                } else if (actionMasked != 3) {
                    p();
                    setScrollState(0);
                } else if (actionMasked != 5) {
                    this.f2450I = motionEvent.getPointerId(actionIndex);
                    int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f2453M = x6;
                    this.K = x6;
                    int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f2454N = y5;
                    this.f2452L = y5;
                } else if (actionMasked == 6) {
                    n(motionEvent);
                }
                motionEventObtain.recycle();
                return true;
            }
            this.f2450I = motionEvent.getPointerId(0);
            int x7 = (int) (motionEvent.getX() + 0.5f);
            this.f2453M = x7;
            this.K = x7;
            int y6 = (int) (motionEvent.getY() + 0.5f);
            this.f2454N = y6;
            this.f2452L = y6;
            if (zC) {
                i3 = zB;
                i3 = (zB ? 1 : 0) | 2;
            }
            i3 = zB;
            getScrollingChildHelper().g(i3, 0);
            this.f2451J.addMovement(motionEventObtain);
            motionEventObtain.recycle();
            return true;
        }
        if (c0111f2.f1875q != 0) {
            if (motionEvent.getAction() == 0) {
                boolean zB3 = c0111f2.b(motionEvent.getX(), motionEvent.getY());
                boolean zA = c0111f2.a(motionEvent.getX(), motionEvent.getY());
                if (zB3 || zA) {
                    if (zA) {
                        c0111f2.f1876r = 1;
                        c0111f2.f1869k = (int) motionEvent.getX();
                    } else if (zB3) {
                        c0111f2.f1876r = 2;
                        c0111f2.f1868j = (int) motionEvent.getY();
                    }
                    c0111f2.e(2);
                }
            } else if (motionEvent.getAction() == 1 && c0111f2.f1875q == 2) {
                c0111f2.f1868j = 0.0f;
                c0111f2.f1869k = 0.0f;
                c0111f2.e(1);
                c0111f2.f1876r = 0;
            } else if (motionEvent.getAction() == 2 && c0111f2.f1875q == 2) {
                c0111f2.f();
                int i20 = c0111f2.f1876r;
                int i21 = c0111f2.f1860a;
                if (i20 == 1) {
                    float x8 = motionEvent.getX();
                    int[] iArr5 = c0111f2.f1878t;
                    iArr5[0] = i21;
                    int i22 = c0111f2.f1870l - i21;
                    iArr5[1] = i22;
                    float fMax = Math.max(i21, Math.min(i22, x8));
                    if (Math.abs(0 - fMax) >= 2.0f) {
                        float f7 = c0111f2.f1869k;
                        int iComputeHorizontalScrollRange = c0111f2.f1872n.computeHorizontalScrollRange();
                        c0111f2.f1872n.computeHorizontalScrollOffset();
                        int iD = C0111f.d(f7, fMax, iArr5, iComputeHorizontalScrollRange, 0, c0111f2.f1870l);
                        if (iD != 0) {
                            c0111f2.f1872n.scrollBy(iD, 0);
                        }
                        c0111f2.f1869k = fMax;
                    }
                }
                if (c0111f2.f1876r == 2) {
                    float y7 = motionEvent.getY();
                    int[] iArr6 = c0111f2.f1877s;
                    iArr6[0] = i21;
                    int i23 = c0111f2.f1871m - i21;
                    iArr6[1] = i23;
                    float fMax2 = Math.max(i21, Math.min(i23, y7));
                    if (Math.abs(0 - fMax2) >= 2.0f) {
                        float f8 = c0111f2.f1868j;
                        int iComputeVerticalScrollRange = c0111f2.f1872n.computeVerticalScrollRange();
                        c0111f2.f1872n.computeVerticalScrollOffset();
                        int iD2 = C0111f.d(f8, fMax2, iArr6, iComputeVerticalScrollRange, 0, c0111f2.f1871m);
                        if (iD2 != 0) {
                            c0111f2.f1872n.scrollBy(0, iD2);
                        }
                        c0111f2.f1868j = fMax2;
                    }
                }
            }
        }
        if (action == 3 || action == 1) {
            this.f2482o = null;
        }
        p();
        setScrollState(0);
        return true;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f2451J;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        s(0);
        EdgeEffect edgeEffect = this.f2444C;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f2444C.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2445D;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f2445D.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2446E;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f2446E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2447F;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f2447F.isFinished();
        }
        if (zIsFinished) {
            Field field = B.D.f41a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x011a  */
    /* JADX WARN: Code duplicated, block: B:42:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:45:0x0153  */
    /* JADX WARN: Code duplicated, block: B:47:0x0171  */
    /* JADX WARN: Code duplicated, block: B:49:0x0175  */
    /* JADX WARN: Code duplicated, block: B:52:0x017a  */
    /* JADX WARN: Code duplicated, block: B:54:0x018e  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d6  */
    public final void q(int i3, int i4, MotionEvent motionEvent) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        d();
        if (!this.f2480m.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f2470f0;
        boolean z2 = false;
        boolean z3 = true;
        if (g(iArr, 0)) {
            int i5 = this.f2453M;
            int i6 = iArr[0];
            this.f2453M = i5 - i6;
            int i7 = this.f2454N;
            int i8 = iArr[1];
            this.f2454N = i7 - i8;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i6, i8);
            }
            int[] iArr2 = this.h0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x3 = motionEvent.getX();
                float f3 = 0;
                float y2 = motionEvent.getY();
                if (f3 < 0.0f) {
                    if (this.f2444C == null) {
                        this.f2443B.getClass();
                        EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                        this.f2444C = edgeEffect3;
                        if (this.f2474i) {
                            edgeEffect3.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect3.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    G.b.a(this.f2444C, (-f3) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f3 <= 0.0f) {
                    if (f3 < 0.0f) {
                        if (this.f2445D == null) {
                            this.f2443B.getClass();
                            edgeEffect2 = new EdgeEffect(getContext());
                            this.f2445D = edgeEffect2;
                            if (this.f2474i) {
                                edgeEffect2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect2.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        G.b.a(this.f2445D, (-f3) / getHeight(), x3 / getWidth());
                    } else if (f3 > 0.0f) {
                        if (this.f2447F == null) {
                            this.f2443B.getClass();
                            edgeEffect = new EdgeEffect(getContext());
                            this.f2447F = edgeEffect;
                            if (this.f2474i) {
                                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        G.b.a(this.f2447F, f3 / getHeight(), 1.0f - (x3 / getWidth()));
                    } else {
                        z3 = z2;
                    }
                    if (z3 || f3 != 0.0f || f3 != 0.0f) {
                        Field field = B.D.f41a;
                        postInvalidateOnAnimation();
                    }
                } else {
                    if (this.f2446E == null) {
                        this.f2443B.getClass();
                        EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                        this.f2446E = edgeEffect4;
                        if (this.f2474i) {
                            edgeEffect4.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect4.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    G.b.a(this.f2446E, f3 / getWidth(), y2 / getHeight());
                }
                z2 = true;
                if (f3 < 0.0f) {
                    if (this.f2445D == null) {
                        this.f2443B.getClass();
                        edgeEffect2 = new EdgeEffect(getContext());
                        this.f2445D = edgeEffect2;
                        if (this.f2474i) {
                            edgeEffect2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                        } else {
                            edgeEffect2.setSize(getMeasuredWidth(), getMeasuredHeight());
                        }
                    }
                    G.b.a(this.f2445D, (-f3) / getHeight(), x3 / getWidth());
                } else if (f3 > 0.0f) {
                    if (this.f2447F == null) {
                        this.f2443B.getClass();
                        edgeEffect = new EdgeEffect(getContext());
                        this.f2447F = edgeEffect;
                        if (this.f2474i) {
                            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                        } else {
                            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
                        }
                    }
                    G.b.a(this.f2447F, f3 / getHeight(), 1.0f - (x3 / getWidth()));
                } else {
                    z3 = z2;
                }
                if (z3) {
                    Field field2 = B.D.f41a;
                    postInvalidateOnAnimation();
                } else {
                    Field field3 = B.D.f41a;
                    postInvalidateOnAnimation();
                }
            }
            c(i3, i4);
        }
        if (awakenScrollBars()) {
            return;
        }
        invalidate();
    }

    public final void r(int i3, int i4) {
        int iRound;
        s sVar = this.f2479l;
        if (sVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2487t) {
            return;
        }
        int i5 = !sVar.b() ? 0 : i3;
        int i6 = !this.f2479l.c() ? 0 : i4;
        if (i5 == 0 && i6 == 0) {
            return;
        }
        D d3 = this.U;
        d3.getClass();
        int iAbs = Math.abs(i5);
        int iAbs2 = Math.abs(i6);
        boolean z2 = iAbs > iAbs2;
        int iSqrt = (int) Math.sqrt(0);
        int iSqrt2 = (int) Math.sqrt((i6 * i6) + (i5 * i5));
        RecyclerView recyclerView = d3.f1820j;
        int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i7 = width / 2;
        float f3 = width;
        float f4 = i7;
        float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f3) - 0.5f) * 0.47123894f)) * f4) + f4;
        if (iSqrt > 0) {
            iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
        } else {
            if (!z2) {
                iAbs = iAbs2;
            }
            iRound = (int) (((iAbs / f3) + 1.0f) * 300.0f);
        }
        int iMin = Math.min(iRound, 2000);
        Interpolator interpolator = d3.f1817g;
        n nVar = f2441o0;
        if (interpolator != nVar) {
            d3.f1817g = nVar;
            d3.f1816f = new OverScroller(recyclerView.getContext(), nVar);
        }
        recyclerView.setScrollState(2);
        d3.e = 0;
        d3.f1815d = 0;
        d3.f1816f.startScroll(0, 0, i5, i6, iMin);
        if (Build.VERSION.SDK_INT < 23) {
            d3.f1816f.computeScrollOffset();
        }
        d3.a();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f2479l.getClass();
        if (this.f2492z <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f2479l.G(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f2481n;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0111f) arrayList.get(i3)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2486s != 0 || this.f2487t) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i3) {
        getScrollingChildHelper().h(i3);
    }

    @Override // android.view.View
    public final void scrollBy(int i3, int i4) {
        s sVar = this.f2479l;
        if (sVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2487t) {
            return;
        }
        boolean zB = sVar.b();
        boolean zC = this.f2479l.c();
        if (zB || zC) {
            if (!zB) {
                i3 = 0;
            }
            if (!zC) {
                i4 = 0;
            }
            q(i3, i4, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f2492z <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.v |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(F f3) {
        this.f2467d0 = f3;
        B.D.d(this, f3);
    }

    public void setAdapter(o oVar) {
        setLayoutFrozen(false);
        r rVar = this.f2448G;
        if (rVar != null) {
            rVar.a();
        }
        s sVar = this.f2479l;
        y yVar = this.f2466d;
        if (sVar != null) {
            sVar.E();
            this.f2479l.F(yVar);
        }
        yVar.f1915a.clear();
        yVar.a();
        b bVar = this.f2469f;
        bVar.P((ArrayList) bVar.f182f);
        bVar.P((ArrayList) bVar.f183g);
        yVar.f1915a.clear();
        yVar.a();
        if (yVar.e == null) {
            x xVar = new x();
            xVar.f1913a = new SparseArray();
            xVar.f1914b = 0;
            yVar.e = xVar;
        }
        x xVar2 = yVar.e;
        if (xVar2.f1914b == 0) {
            SparseArray sparseArray = xVar2.f1913a;
            if (sparseArray.size() > 0) {
                ((w) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f2463a0.f1812b = true;
        this.f2491y = this.f2491y;
        this.f2490x = true;
        int iG = this.f2471g.G();
        for (int i3 = 0; i3 < iG; i3++) {
            j(this.f2471g.F(i3));
        }
        m();
        ArrayList arrayList = yVar.f1916b;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (arrayList.get(i4) != null) {
                throw new ClassCastException();
            }
        }
        yVar.f1919f.getClass();
        yVar.a();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(p pVar) {
        if (pVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f2474i) {
            this.f2447F = null;
            this.f2445D = null;
            this.f2446E = null;
            this.f2444C = null;
        }
        this.f2474i = z2;
        super.setClipToPadding(z2);
        if (this.f2485r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(q qVar) {
        qVar.getClass();
        this.f2443B = qVar;
        this.f2447F = null;
        this.f2445D = null;
        this.f2446E = null;
        this.f2444C = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f2484q = z2;
    }

    public void setItemAnimator(r rVar) {
        r rVar2 = this.f2448G;
        if (rVar2 != null) {
            rVar2.a();
            this.f2448G.f1901a = null;
        }
        this.f2448G = rVar;
        if (rVar != null) {
            rVar.f1901a = this.f2465c0;
        }
    }

    public void setItemViewCacheSize(int i3) {
        y yVar = this.f2466d;
        yVar.f1917c = i3;
        yVar.c();
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.f2487t) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z2) {
                this.f2487t = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2487t = true;
            this.f2488u = true;
            setScrollState(0);
            D d3 = this.U;
            d3.f1820j.removeCallbacks(d3);
            d3.f1816f.abortAnimation();
        }
    }

    public void setLayoutManager(s sVar) {
        C0006g c0006g;
        if (sVar == this.f2479l) {
            return;
        }
        setScrollState(0);
        D d3 = this.U;
        d3.f1820j.removeCallbacks(d3);
        d3.f1816f.abortAnimation();
        s sVar2 = this.f2479l;
        y yVar = this.f2466d;
        if (sVar2 != null) {
            r rVar = this.f2448G;
            if (rVar != null) {
                rVar.a();
            }
            this.f2479l.E();
            this.f2479l.F(yVar);
            yVar.f1915a.clear();
            yVar.a();
            if (this.f2483p) {
                s sVar3 = this.f2479l;
                sVar3.e = false;
                sVar3.z(this);
            }
            this.f2479l.I(null);
            this.f2479l = null;
        } else {
            yVar.f1915a.clear();
            yVar.a();
        }
        b bVar = this.f2471g;
        ((F0.e) bVar.f182f).d();
        ArrayList arrayList = (ArrayList) bVar.f183g;
        int size = arrayList.size() - 1;
        while (true) {
            c0006g = (C0006g) bVar.e;
            if (size < 0) {
                break;
            }
            j((View) arrayList.get(size));
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView = (RecyclerView) c0006g.e;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2479l = sVar;
        if (sVar != null) {
            if (sVar.f1906b != null) {
                throw new IllegalArgumentException("LayoutManager " + sVar + " is already attached to a RecyclerView:" + sVar.f1906b.h());
            }
            sVar.I(this);
            if (this.f2483p) {
                this.f2479l.e = true;
            }
        }
        yVar.c();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0008i scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f87d) {
            Field field = B.D.f41a;
            AbstractC0020v.z(scrollingChildHelper.f86c);
        }
        scrollingChildHelper.f87d = z2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f2460T = z2;
    }

    public void setRecycledViewPool(x xVar) {
        y yVar = this.f2466d;
        x xVar2 = yVar.e;
        if (xVar2 != null) {
            xVar2.f1914b--;
        }
        yVar.e = xVar;
        if (xVar != null) {
            yVar.f1919f.getAdapter();
        }
    }

    public void setScrollState(int i3) {
        if (i3 == this.f2449H) {
            return;
        }
        this.f2449H = i3;
        if (i3 != 2) {
            D d3 = this.U;
            d3.f1820j.removeCallbacks(d3);
            d3.f1816f.abortAnimation();
        }
        s sVar = this.f2479l;
        if (sVar != null) {
            sVar.D(i3);
        }
        ArrayList arrayList = this.f2464b0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Y.v) this.f2464b0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 0) {
            if (i3 == 1) {
                this.f2455O = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i3 + "; using default value");
        }
        this.f2455O = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C c3) {
        this.f2466d.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        s sVar = this.f2479l;
        if (sVar != null) {
            return sVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(u uVar) {
    }

    @Deprecated
    public void setOnScrollListener(Y.v vVar) {
    }

    public void setRecyclerListener(z zVar) {
    }
}
