package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import k.M;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f2042d;
    public TypedValue e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f2043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TypedValue f2044g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TypedValue f2045h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TypedValue f2046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f2047j;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2047j = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2045h == null) {
            this.f2045h = new TypedValue();
        }
        return this.f2045h;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2046i == null) {
            this.f2046i = new TypedValue();
        }
        return this.f2046i;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2043f == null) {
            this.f2043f = new TypedValue();
        }
        return this.f2043f;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2044g == null) {
            this.f2044g = new TypedValue();
        }
        return this.f2044g;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2042d == null) {
            this.f2042d = new TypedValue();
        }
        return this.f2042d;
    }

    public TypedValue getMinWidthMinor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int iMakeMeasureSpec;
        boolean z2;
        int iMakeMeasureSpec2;
        int i5;
        int i6;
        float fraction;
        int i7;
        int i8;
        float fraction2;
        int i9;
        int i10;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        boolean z4 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        Rect rect = this.f2047j;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i3;
            z2 = false;
        } else {
            TypedValue typedValue = z4 ? this.f2044g : this.f2043f;
            if (typedValue == null || (i9 = typedValue.type) == 0) {
                iMakeMeasureSpec = i3;
                z2 = false;
            } else {
                if (i9 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i9 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i11, i11);
                    } else {
                        i10 = 0;
                    }
                    if (i10 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.left + rect.right), View.MeasureSpec.getSize(i3)), 1073741824);
                        z2 = true;
                    } else {
                        iMakeMeasureSpec = i3;
                        z2 = false;
                    }
                }
                i10 = (int) fraction3;
                if (i10 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.left + rect.right), View.MeasureSpec.getSize(i3)), 1073741824);
                    z2 = true;
                } else {
                    iMakeMeasureSpec = i3;
                    z2 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i4;
        } else {
            TypedValue typedValue2 = z4 ? this.f2045h : this.f2046i;
            if (typedValue2 == null || (i7 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i4;
            } else {
                if (i7 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i12 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i12, i12);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i4)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i4;
                    }
                }
                i8 = (int) fraction2;
                if (i8 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i4)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i4;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z2 || mode != Integer.MIN_VALUE) {
            z3 = false;
        } else {
            TypedValue typedValue3 = z4 ? this.e : this.f2042d;
            if (typedValue3 == null || (i5 = typedValue3.type) == 0) {
                z3 = false;
            } else {
                if (i5 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i13 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i13, i13);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        i6 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i6) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                    } else {
                        z3 = false;
                    }
                }
                i6 = (int) fraction;
                if (i6 > 0) {
                    i6 -= rect.left + rect.right;
                }
                if (measuredWidth < i6) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else {
                    z3 = false;
                }
            }
        }
        if (z3) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(M m3) {
    }
}
