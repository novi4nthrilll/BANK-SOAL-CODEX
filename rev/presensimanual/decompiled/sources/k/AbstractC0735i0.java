package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p013d1.AbstractC0457i;
import p013d1.G2;

/* JADX INFO: renamed from: k.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0735i0 implements p032j.r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Method f5184A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Method f5185B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Method f5186z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f5187d;
    public ListAdapter e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0745n0 f5188f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5194l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public H.b f5196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f5197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p032j.k f5198p;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Handler f5203u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Rect f5204w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5205x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0753s f5206y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5189g = -2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5195m = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RunnableC0729f0 f5199q = new RunnableC0729f0(this, 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ViewOnTouchListenerC0733h0 f5200r = new ViewOnTouchListenerC0733h0(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0731g0 f5201s = new C0731g0(this);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RunnableC0729f0 f5202t = new RunnableC0729f0(this, 0);
    public final Rect v = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f5186z = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f5185B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f5184A = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC0735i0(Context context, int i3) {
        int resourceId;
        this.f5187d = context;
        this.f5203u = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p011d.a.f3540k, i3, 0);
        this.f5190h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f5191i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f5192j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0753s c0753s = new C0753s(context, null, i3, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, p011d.a.f3544o, i3, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            AbstractC0457i.a(c0753s, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0753s.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : G2.b(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f5206y = c0753s;
        c0753s.setInputMethodMode(1);
    }

    @Override // p032j.r
    public final void b() {
        int i3;
        int iA;
        int iMakeMeasureSpec;
        C0745n0 c0745n0;
        int i4 = 0;
        C0745n0 c0745n1 = this.f5188f;
        C0753s c0753s = this.f5206y;
        Context context = this.f5187d;
        if (c0745n1 == null) {
            C0745n0 c0745n2 = new C0745n0(context, !this.f5205x);
            c0745n2.setHoverListener((C0747o0) this);
            this.f5188f = c0745n2;
            c0745n2.setAdapter(this.e);
            this.f5188f.setOnItemClickListener(this.f5198p);
            this.f5188f.setFocusable(true);
            this.f5188f.setFocusableInTouchMode(true);
            this.f5188f.setOnItemSelectedListener(new C0723c0(i4, this));
            this.f5188f.setOnScrollListener(this.f5201s);
            c0753s.setContentView(this.f5188f);
        }
        Drawable background = c0753s.getBackground();
        Rect rect = this.v;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i3 = rect.bottom + i5;
            if (!this.f5192j) {
                this.f5191i = -i5;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        boolean z2 = c0753s.getInputMethodMode() == 2;
        View view = this.f5197o;
        int i6 = this.f5191i;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f5184A;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(c0753s, view, Integer.valueOf(i6), Boolean.valueOf(z2))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                    iA = c0753s.getMaxAvailableHeight(view, i6);
                }
            } else {
                iA = c0753s.getMaxAvailableHeight(view, i6);
            }
        } else {
            iA = AbstractC0725d0.a(c0753s, view, i6, z2);
        }
        int i7 = this.f5189g;
        if (i7 != -2) {
            iMakeMeasureSpec = i7 != -1 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        int iA2 = this.f5188f.a(iMakeMeasureSpec, iA);
        int paddingBottom = iA2 + (iA2 > 0 ? this.f5188f.getPaddingBottom() + this.f5188f.getPaddingTop() + i3 : 0);
        this.f5206y.getInputMethodMode();
        if (Build.VERSION.SDK_INT >= 23) {
            G.k.d(c0753s, 1002);
        } else {
            if (!AbstractC0457i.f3824b) {
                try {
                    Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                    AbstractC0457i.f3823a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused2) {
                }
                AbstractC0457i.f3824b = true;
            }
            Method method2 = AbstractC0457i.f3823a;
            if (method2 != null) {
                try {
                    method2.invoke(c0753s, 1002);
                } catch (Exception unused3) {
                }
            }
        }
        if (c0753s.isShowing()) {
            View view2 = this.f5197o;
            Field field = B.D.f41a;
            if (view2.isAttachedToWindow()) {
                int width = this.f5189g;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f5197o.getWidth();
                }
                c0753s.setOutsideTouchable(true);
                c0753s.update(this.f5197o, this.f5190h, this.f5191i, width < 0 ? -1 : width, paddingBottom >= 0 ? paddingBottom : -1);
                return;
            }
            return;
        }
        int width2 = this.f5189g;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f5197o.getWidth();
        }
        c0753s.setWidth(width2);
        c0753s.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f5186z;
            if (method3 != null) {
                try {
                    method3.invoke(c0753s, Boolean.TRUE);
                } catch (Exception unused4) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0727e0.b(c0753s, true);
        }
        c0753s.setOutsideTouchable(true);
        c0753s.setTouchInterceptor(this.f5200r);
        if (this.f5194l) {
            AbstractC0457i.a(c0753s, this.f5193k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method4 = f5185B;
            if (method4 != null) {
                try {
                    method4.invoke(c0753s, this.f5204w);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC0727e0.a(c0753s, this.f5204w);
        }
        c0753s.showAsDropDown(this.f5197o, this.f5190h, this.f5191i, this.f5195m);
        this.f5188f.setSelection(-1);
        if ((!this.f5205x || this.f5188f.isInTouchMode()) && (c0745n0 = this.f5188f) != null) {
            c0745n0.setListSelectionHidden(true);
            c0745n0.requestLayout();
        }
        if (this.f5205x) {
            return;
        }
        this.f5203u.post(this.f5202t);
    }

    public final void c(ListAdapter listAdapter) {
        H.b bVar = this.f5196n;
        if (bVar == null) {
            this.f5196n = new H.b(1, this);
        } else {
            ListAdapter listAdapter2 = this.e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f5196n);
        }
        C0745n0 c0745n0 = this.f5188f;
        if (c0745n0 != null) {
            c0745n0.setAdapter(this.e);
        }
    }

    @Override // p032j.r
    public final void dismiss() {
        C0753s c0753s = this.f5206y;
        c0753s.dismiss();
        c0753s.setContentView(null);
        this.f5188f = null;
        this.f5203u.removeCallbacks(this.f5199q);
    }

    @Override // p032j.r
    public final boolean g() {
        return this.f5206y.isShowing();
    }

    @Override // p032j.r
    public final ListView h() {
        return this.f5188f;
    }
}
