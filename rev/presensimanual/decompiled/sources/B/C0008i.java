package B;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: B.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0008i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f84a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f85b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f86c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f87d;
    public int[] e;

    public C0008i(ViewGroup viewGroup) {
        this.f86c = viewGroup;
    }

    public final boolean a(float f3, float f4, boolean z2) {
        ViewParent viewParentE;
        if (!this.f87d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return I.a(viewParentE, this.f86c, f3, f4, z2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public final boolean b(float f3, float f4) {
        ViewParent viewParentE;
        if (!this.f87d || (viewParentE = e(0)) == null) {
            return false;
        }
        try {
            return I.b(viewParentE, this.f86c, f3, f4);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public final boolean c(int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        ViewParent viewParentE;
        int i6;
        int i7;
        if (!this.f87d || (viewParentE = e(i5)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f86c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr = this.e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentE instanceof InterfaceC0009j) {
            ((InterfaceC0009j) viewParentE).d(i3, i4, iArr, i5);
        } else if (i5 == 0) {
            try {
                I.c(viewParentE, viewGroup, i3, i4, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean d(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        ViewParent viewParentE;
        int i8;
        int i9;
        int[] iArr3;
        if (!this.f87d || (viewParentE = e(i7)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f86c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i8 = iArr[0];
            i9 = iArr[1];
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (viewParentE instanceof InterfaceC0010k) {
            ((InterfaceC0010k) viewParentE).e(viewGroup, i3, i4, i5, i6, i7, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i5;
            iArr3[1] = iArr3[1] + i6;
            if (viewParentE instanceof InterfaceC0009j) {
                ((InterfaceC0009j) viewParentE).b(viewGroup, i3, i4, i5, i6, i7);
            } else if (i7 == 0) {
                try {
                    I.d(viewParentE, viewGroup, i3, i4, i5, i6);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onNestedScroll", e);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i8;
            iArr[1] = iArr[1] - i9;
        }
        return true;
    }

    public final ViewParent e(int i3) {
        if (i3 == 0) {
            return this.f84a;
        }
        if (i3 != 1) {
            return null;
        }
        return this.f85b;
    }

    public final boolean f(int i3) {
        return e(i3) != null;
    }

    public final boolean g(int i3, int i4) {
        boolean zF;
        if (f(i4)) {
            return true;
        }
        if (this.f87d) {
            ViewGroup viewGroup = this.f86c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC0009j;
                if (z2) {
                    zF = ((InterfaceC0009j) parent).f(view, viewGroup, i3, i4);
                } else if (i4 == 0) {
                    try {
                        zF = I.f(parent, view, viewGroup, i3);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        zF = false;
                    }
                } else {
                    zF = false;
                }
                if (zF) {
                    if (i4 == 0) {
                        this.f84a = parent;
                    } else if (i4 == 1) {
                        this.f85b = parent;
                    }
                    if (z2) {
                        ((InterfaceC0009j) parent).a(view, viewGroup, i3, i4);
                    } else if (i4 == 0) {
                        try {
                            I.e(parent, view, viewGroup, i3);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i3) {
        ViewParent viewParentE = e(i3);
        if (viewParentE != null) {
            boolean z2 = viewParentE instanceof InterfaceC0009j;
            ViewGroup viewGroup = this.f86c;
            if (z2) {
                ((InterfaceC0009j) viewParentE).c(viewGroup, i3);
            } else if (i3 == 0) {
                try {
                    I.g(viewParentE, viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentE + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i3 == 0) {
                this.f84a = null;
            } else {
                if (i3 != 1) {
                    return;
                }
                this.f85b = null;
            }
        }
    }
}
