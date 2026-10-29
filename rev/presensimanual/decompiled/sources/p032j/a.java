package p032j;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.C0728f;
import k.C0730g;
import k.C0732h;
import k.C0734i;
import k.X;
import k.Z;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4871d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f4873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Z f4874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Z f4875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f4878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f4879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f4880n;

    public a(View view) {
        this.f4878l = new int[2];
        this.f4873g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f4871d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.e = tapTimeout;
        this.f4872f = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        Z z2 = this.f4875i;
        View view = this.f4873g;
        if (z2 != null) {
            view.removeCallbacks(z2);
        }
        Z z3 = this.f4874h;
        if (z3 != null) {
            view.removeCallbacks(z3);
        }
    }

    public final k b() {
        C0728f c0728f;
        switch (this.f4879m) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                b bVar = ((ActionMenuItemView) this.f4880n).f1965p;
                if (bVar == null || (c0728f = ((C0730g) bVar).f5160a.v) == null) {
                    return null;
                }
                return c0728f.a();
            default:
                C0728f c0728f2 = ((C0732h) this.f4880n).f5162g.f5180u;
                if (c0728f2 == null) {
                    return null;
                }
                return c0728f2.a();
        }
    }

    public final boolean c() {
        k kVarB;
        switch (this.f4879m) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f4880n;
                h hVar = actionMenuItemView.f1963n;
                return hVar != null && hVar.a(actionMenuItemView.f1960k) && (kVarB = b()) != null && kVarB.g();
            default:
                ((C0732h) this.f4880n).f5162g.h();
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        C0734i c0734i;
        boolean z3;
        k kVarB;
        X x3;
        boolean z4 = this.f4876j;
        View view2 = this.f4873g;
        if (z4) {
            k kVarB2 = b();
            if (kVarB2 == null || !kVarB2.g() || (x3 = (X) kVarB2.h()) == null || !x3.isShown()) {
                switch (this.f4879m) {
                    case 1:
                        c0734i = ((C0732h) this.f4880n).f5162g;
                        if (c0734i.f5181w != null) {
                            c0734i.g();
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        break;
                    default:
                        kVarB = b();
                        if (kVarB != null && kVarB.g()) {
                            kVarB.dismiss();
                        }
                        z3 = true;
                        break;
                }
                if (z3) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f4878l;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                x3.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = x3.b(this.f4877k, motionEventObtainNoHistory);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z5) {
                    z2 = true;
                } else {
                    switch (this.f4879m) {
                        case 1:
                            c0734i = ((C0732h) this.f4880n).f5162g;
                            if (c0734i.f5181w != null) {
                                c0734i.g();
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            break;
                        default:
                            kVarB = b();
                            if (kVarB != null) {
                                kVarB.dismiss();
                            }
                            z3 = true;
                            break;
                    }
                    if (z3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f4877k = motionEvent.getPointerId(0);
                    if (this.f4874h == null) {
                        this.f4874h = new Z(this, 0);
                    }
                    view2.postDelayed(this.f4874h, this.e);
                    if (this.f4875i == null) {
                        this.f4875i = new Z(this, 1);
                    }
                    view2.postDelayed(this.f4875i, this.f4872f);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f4877k);
                    if (iFindPointerIndex >= 0) {
                        float x4 = motionEvent.getX(iFindPointerIndex);
                        float y2 = motionEvent.getY(iFindPointerIndex);
                        float f3 = this.f4871d;
                        float f4 = -f3;
                        if (x4 < f4 || y2 < f4 || x4 >= (view2.getRight() - view2.getLeft()) + f3 || y2 >= (view2.getBottom() - view2.getTop()) + f3) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z2 = c();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
            }
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f4876j = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f4876j = false;
        this.f4877k = -1;
        Z z2 = this.f4874h;
        if (z2 != null) {
            this.f4873g.removeCallbacks(z2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f4879m = 0;
        this.f4880n = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(C0732h c0732h, C0732h c0732h2) {
        this(c0732h2);
        this.f4879m = 1;
        this.f4880n = c0732h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
