package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import id.go.bangkalankab.simpeg.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Y0 f5119n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Y0 f5120o;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f5121d;
    public final CharSequence e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final X0 f5123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final X0 f5124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Z0 f5127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5129m;

    /* JADX WARN: Type inference failed for: r0v0, types: [k.X0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [k.X0] */
    public Y0(View view, CharSequence charSequence) {
        final int i3 = 0;
        this.f5123g = new Runnable(this) { // from class: k.X0
            public final /* synthetic */ Y0 e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        this.e.c(false);
                        break;
                    default:
                        this.e.a();
                        break;
                }
            }
        };
        final int i4 = 1;
        this.f5124h = new Runnable(this) { // from class: k.X0
            public final /* synthetic */ Y0 e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i4) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        this.e.c(false);
                        break;
                    default:
                        this.e.a();
                        break;
                }
            }
        };
        this.f5121d = view;
        this.e = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = B.H.f44a;
        this.f5122f = Build.VERSION.SDK_INT >= 28 ? B.F.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f5129m = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(Y0 y2) {
        Y0 y3 = f5119n;
        if (y3 != null) {
            y3.f5121d.removeCallbacks(y3.f5123g);
        }
        f5119n = y2;
        if (y2 != null) {
            y2.f5121d.postDelayed(y2.f5123g, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        Y0 y2 = f5120o;
        View view = this.f5121d;
        if (y2 == this) {
            f5120o = null;
            Z0 z2 = this.f5127k;
            if (z2 != null) {
                View view2 = (View) z2.e;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) z2.f5131d).getSystemService("window")).removeView(view2);
                }
                this.f5127k = null;
                this.f5129m = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f5119n == this) {
            b(null);
        }
        view.removeCallbacks(this.f5124h);
    }

    public final void c(boolean z2) {
        int height;
        int i3;
        int i4;
        long longPressTimeout;
        long j3;
        long j4;
        Field field = B.D.f41a;
        View view = this.f5121d;
        if (view.isAttachedToWindow()) {
            b(null);
            Y0 y2 = f5120o;
            if (y2 != null) {
                y2.a();
            }
            f5120o = this;
            this.f5128l = z2;
            Context context = view.getContext();
            Z0 z3 = new Z0();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            z3.f5133g = layoutParams;
            z3.f5134h = new Rect();
            z3.f5135i = new int[2];
            z3.f5136j = new int[2];
            z3.f5131d = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            z3.e = viewInflate;
            z3.f5132f = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(Z0.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f5127k = z3;
            int width = this.f5125i;
            int i5 = this.f5126j;
            boolean z4 = this.f5128l;
            View view2 = (View) z3.e;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) z3.f5131d;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) z3.f5132f).setText(this.e);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) z3.f5133g;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i5 + dimensionPixelOffset2;
                i3 = i5 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i3 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z4 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                Rect rect = (Rect) z3.f5134h;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i4 = 0;
                } else {
                    Resources resources = context2.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i4 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) z3.f5136j;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) z3.f5135i;
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i4] - iArr[i4];
                iArr2[i4] = i6;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams2.x = (i6 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, i4);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[1];
                int i8 = ((i3 + i7) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z4) {
                    if (i8 >= 0) {
                        layoutParams2.y = i8;
                    } else {
                        layoutParams2.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams2.y = i9;
                } else {
                    layoutParams2.y = i8;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f5128l) {
                j4 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 15000;
                }
                j4 = j3 - longPressTimeout;
            }
            X0 x3 = this.f5124h;
            view.removeCallbacks(x3);
            view.postDelayed(x3, j4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f5127k != null && this.f5128l) {
            return false;
        }
        View view2 = this.f5121d;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f5129m = true;
                a();
            }
        } else if (view2.isEnabled() && this.f5127k == null) {
            int x3 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (this.f5129m) {
                this.f5125i = x3;
                this.f5126j = y2;
                this.f5129m = false;
                b(this);
            } else {
                int iAbs = Math.abs(x3 - this.f5125i);
                int i3 = this.f5122f;
                if (iAbs > i3 || Math.abs(y2 - this.f5126j) > i3) {
                    this.f5125i = x3;
                    this.f5126j = y2;
                    this.f5129m = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f5125i = view.getWidth() / 2;
        this.f5126j = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
