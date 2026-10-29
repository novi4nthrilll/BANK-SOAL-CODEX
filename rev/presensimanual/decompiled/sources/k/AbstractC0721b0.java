package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: k.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0721b0 extends ViewGroup {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5140d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f5145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5146k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f5147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f5148m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f5149n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5150o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5153r;

    public AbstractC0721b0(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f5140d = true;
        this.e = -1;
        this.f5141f = 0;
        this.f5143h = 8388659;
        int[] iArr = p011d.a.f3539j;
        D0.b bVarL = D0.b.L(context, attributeSet, iArr, i3);
        B.D.c(this, context, iArr, attributeSet, (TypedArray) bVarL.f182f, i3);
        TypedArray typedArray = (TypedArray) bVarL.f182f;
        int i4 = typedArray.getInt(1, -1);
        if (i4 >= 0) {
            setOrientation(i4);
        }
        int i5 = typedArray.getInt(0, -1);
        if (i5 >= 0) {
            setGravity(i5);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f5145j = typedArray.getFloat(4, -1.0f);
        this.e = typedArray.getInt(3, -1);
        this.f5146k = typedArray.getBoolean(7, false);
        setDividerDrawable(bVarL.C(5));
        this.f5152q = typedArray.getInt(8, 0);
        this.f5153r = typedArray.getDimensionPixelSize(6, 0);
        bVarL.O();
    }

    public final void b(Canvas canvas, int i3) {
        this.f5149n.setBounds(getPaddingLeft() + this.f5153r, i3, (getWidth() - getPaddingRight()) - this.f5153r, this.f5151p + i3);
        this.f5149n.draw(canvas);
    }

    public final void c(Canvas canvas, int i3) {
        this.f5149n.setBounds(i3, getPaddingTop() + this.f5153r, this.f5150o + i3, (getHeight() - getPaddingBottom()) - this.f5153r);
        this.f5149n.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0719a0;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0719a0 generateDefaultLayoutParams() {
        int i3 = this.f5142g;
        if (i3 == 0) {
            return new C0719a0(-2, -2);
        }
        if (i3 == 1) {
            return new C0719a0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C0719a0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0719a0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0719a0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0719a0(layoutParams);
    }

    public final boolean g(int i3) {
        if (i3 == 0) {
            return (this.f5152q & 1) != 0;
        }
        if (i3 == getChildCount()) {
            return (this.f5152q & 4) != 0;
        }
        if ((this.f5152q & 2) == 0) {
            return false;
        }
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            if (getChildAt(i4).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i3;
        if (this.e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.e;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.e == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f5141f;
        if (this.f5142g == 1 && (i3 = this.f5143h & 112) != 48) {
            if (i3 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f5144i) / 2;
            } else if (i3 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f5144i;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0719a0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.e;
    }

    public Drawable getDividerDrawable() {
        return this.f5149n;
    }

    public int getDividerPadding() {
        return this.f5153r;
    }

    public int getDividerWidth() {
        return this.f5150o;
    }

    public int getGravity() {
        return this.f5143h;
    }

    public int getOrientation() {
        return this.f5142g;
    }

    public int getShowDividers() {
        return this.f5152q;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f5145j;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i3;
        int bottom;
        if (this.f5149n == null) {
            return;
        }
        int i4 = 0;
        if (this.f5142g == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i4 < virtualChildCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && g(i4)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0719a0) childAt.getLayoutParams())).topMargin) - this.f5151p);
                }
                i4++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f5151p;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0719a0) childAt2.getLayoutParams())).bottomMargin;
                }
                b(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = c1.a(this);
        while (i4 < virtualChildCount2) {
            View childAt3 = getChildAt(i4);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i4)) {
                C0719a0 c0719a0 = (C0719a0) childAt3.getLayoutParams();
                c(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0719a0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0719a0).leftMargin) - this.f5150o);
            }
            i4++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0719a0 c0719a1 = (C0719a0) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0719a1).leftMargin;
                    i3 = this.f5150o;
                    right = left - i3;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0719a1).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.f5150o;
                right = left - i3;
            }
            c(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x016f  */
    /* JADX WARN: Code duplicated, block: B:68:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int paddingLeft;
        int i7;
        int i8;
        int i9;
        int i10;
        int baseline;
        int i11;
        int i12;
        int measuredHeight;
        int paddingTop;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        if (this.f5142g == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i17 = i5 - i3;
            int paddingRight = i17 - getPaddingRight();
            int paddingRight2 = (i17 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i18 = this.f5143h;
            int i19 = i18 & 112;
            int i20 = 8388615 & i18;
            if (i19 != 16) {
                paddingTop = i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i6) - i4) - this.f5144i;
            } else {
                paddingTop = getPaddingTop() + (((i6 - i4) - this.f5144i) / 2);
            }
            int i21 = 0;
            while (i21 < virtualChildCount) {
                View childAt = getChildAt(i21);
                if (childAt != null && childAt.getVisibility() != i16) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C0719a0 c0719a0 = (C0719a0) childAt.getLayoutParams();
                    int i22 = ((LinearLayout.LayoutParams) c0719a0).gravity;
                    if (i22 < 0) {
                        i22 = i20;
                    }
                    Field field = B.D.f41a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i15 = ((LinearLayout.LayoutParams) c0719a0).leftMargin + paddingLeft2;
                        } else {
                            i13 = paddingRight - measuredWidth;
                            i14 = ((LinearLayout.LayoutParams) c0719a0).rightMargin;
                        }
                        if (g(i21)) {
                            paddingTop += this.f5151p;
                        }
                        int i23 = paddingTop + ((LinearLayout.LayoutParams) c0719a0).topMargin;
                        childAt.layout(i15, i23, measuredWidth + i15, i23 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0719a0).bottomMargin + i23;
                    } else {
                        i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) c0719a0).leftMargin;
                        i14 = ((LinearLayout.LayoutParams) c0719a0).rightMargin;
                    }
                    i15 = i13 - i14;
                    if (g(i21)) {
                        paddingTop += this.f5151p;
                    }
                    int i24 = paddingTop + ((LinearLayout.LayoutParams) c0719a0).topMargin;
                    childAt.layout(i15, i24, measuredWidth + i15, i24 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0719a0).bottomMargin + i24;
                }
                i21++;
                i16 = 8;
            }
            return;
        }
        boolean zA = c1.a(this);
        int paddingTop2 = getPaddingTop();
        int i25 = i6 - i4;
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i26 = this.f5143h;
        int i27 = 8388615 & i26;
        int i28 = i26 & 112;
        boolean z3 = this.f5140d;
        int[] iArr = this.f5147l;
        int[] iArr2 = this.f5148m;
        Field field2 = B.D.f41a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i27, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i5) - i3) - this.f5144i;
        } else {
            paddingLeft = getPaddingLeft() + (((i5 - i3) - this.f5144i) / 2);
        }
        if (zA) {
            i7 = virtualChildCount2 - 1;
            i8 = -1;
        } else {
            i7 = 0;
            i8 = 1;
        }
        int i29 = 0;
        while (i29 < virtualChildCount2) {
            int i30 = (i8 * i29) + i7;
            View childAt2 = getChildAt(i30);
            if (childAt2 == null) {
                i8 = i8;
                i9 = virtualChildCount2;
                i28 = i28;
                i10 = 1;
            } else {
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C0719a0 c0719a1 = (C0719a0) childAt2.getLayoutParams();
                    if (z3) {
                        i9 = virtualChildCount2;
                        baseline = ((LinearLayout.LayoutParams) c0719a1).height != -1 ? childAt2.getBaseline() : -1;
                        i11 = ((LinearLayout.LayoutParams) c0719a1).gravity;
                        if (i11 < 0) {
                            i11 = i28;
                        }
                        i12 = i11 & 112;
                        if (i12 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) c0719a1).topMargin) - ((LinearLayout.LayoutParams) c0719a1).bottomMargin;
                        } else if (i12 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) c0719a1).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i12 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c0719a1).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (g(i30)) {
                            paddingLeft += this.f5150o;
                        }
                        int i31 = paddingLeft + ((LinearLayout.LayoutParams) c0719a1).leftMargin;
                        childAt2.layout(i31, measuredHeight, i31 + measuredWidth2, measuredHeight + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c0719a1).rightMargin + i31;
                    } else {
                        i9 = virtualChildCount2;
                    }
                    i11 = ((LinearLayout.LayoutParams) c0719a1).gravity;
                    if (i11 < 0) {
                        i11 = i28;
                    }
                    i12 = i11 & 112;
                    if (i12 != 16) {
                        measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) c0719a1).topMargin) - ((LinearLayout.LayoutParams) c0719a1).bottomMargin;
                    } else if (i12 != 48) {
                        measuredHeight = ((LinearLayout.LayoutParams) c0719a1).topMargin + paddingTop2;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + measuredHeight;
                        }
                    } else if (i12 != 80) {
                        measuredHeight = paddingTop2;
                    } else {
                        measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c0719a1).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (g(i30)) {
                        paddingLeft += this.f5150o;
                    }
                    int i32 = paddingLeft + ((LinearLayout.LayoutParams) c0719a1).leftMargin;
                    childAt2.layout(i32, measuredHeight, i32 + measuredWidth2, measuredHeight + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c0719a1).rightMargin + i32;
                } else {
                    i9 = virtualChildCount2;
                }
                i10 = 1;
            }
            i29 += i10;
            i7 = i7;
            i8 = i8;
            virtualChildCount2 = i9;
            i28 = i28;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:213:0x0483  */
    /* JADX WARN: Code duplicated, block: B:214:0x0488  */
    /* JADX WARN: Code duplicated, block: B:217:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:221:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:222:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:224:0x04db  */
    /* JADX WARN: Code duplicated, block: B:230:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:240:0x0533  */
    /* JADX WARN: Code duplicated, block: B:246:0x0543  */
    /* JADX WARN: Code duplicated, block: B:249:0x054b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:250:0x054d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0556 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0558  */
    /* JADX WARN: Code duplicated, block: B:280:0x05df  */
    /* JADX WARN: Code duplicated, block: B:282:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:283:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:286:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:288:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:289:0x0607  */
    /* JADX WARN: Code duplicated, block: B:313:0x068c  */
    /* JADX WARN: Code duplicated, block: B:315:0x0693  */
    /* JADX WARN: Code duplicated, block: B:318:0x06af  */
    /* JADX WARN: Code duplicated, block: B:320:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:322:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:368:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:373:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:381:0x0800  */
    /* JADX WARN: Code duplicated, block: B:388:0x0837  */
    /* JADX WARN: Code duplicated, block: B:391:0x085a  */
    /* JADX WARN: Code duplicated, block: B:393:0x0868  */
    /* JADX WARN: Code duplicated, block: B:395:0x0874  */
    /* JADX WARN: Code duplicated, block: B:397:0x0880  */
    /* JADX WARN: Code duplicated, block: B:398:0x0895  */
    /* JADX WARN: Code duplicated, block: B:429:0x0617 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x0896 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        char c3;
        int iMax;
        int i5;
        float f3;
        int i6;
        int i7;
        int i8;
        char c4;
        int i9;
        View childAt;
        int i10;
        int i11;
        int i12;
        int baseline;
        int i13;
        int iMakeMeasureSpec;
        int i14;
        View childAt2;
        C0719a0 c0719a0;
        int i15;
        View childAt3;
        C0719a0 c0719a1;
        float f4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z2;
        boolean z3;
        C0719a0 c0719a2;
        int measuredWidth;
        boolean z4;
        int i22;
        boolean z5;
        int i23;
        int measuredHeight;
        boolean z6;
        int baseline2;
        int i24;
        int i25;
        boolean z7;
        int i26;
        int i27;
        C0719a0 c0719a3;
        boolean z8;
        int i28;
        boolean z9;
        int iMax2;
        int i29 = -2;
        int i30 = 1073741824;
        int i31 = 8;
        int i32 = Integer.MIN_VALUE;
        float f5 = 0.0f;
        if (this.f5142g == 1) {
            this.f5144i = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i4);
            int i33 = this.e;
            boolean z10 = this.f5146k;
            int i34 = 0;
            float f6 = 0.0f;
            int iMax3 = 0;
            int iMax4 = 0;
            boolean z11 = false;
            int iMax5 = 0;
            int i35 = 0;
            int i36 = 0;
            boolean z12 = true;
            boolean z13 = false;
            while (i34 < virtualChildCount) {
                View childAt4 = getChildAt(i34);
                if (childAt4 == null) {
                    this.f5144i = this.f5144i;
                } else {
                    if (childAt4.getVisibility() != i31) {
                        if (g(i34)) {
                            this.f5144i += this.f5151p;
                        }
                        C0719a0 c0719a4 = (C0719a0) childAt4.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) c0719a4).weight;
                        f6 += f7;
                        if (mode2 == i30 && ((LinearLayout.LayoutParams) c0719a4).height == 0 && f7 > f5) {
                            int i37 = this.f5144i;
                            this.f5144i = Math.max(i37, ((LinearLayout.LayoutParams) c0719a4).topMargin + i37 + ((LinearLayout.LayoutParams) c0719a4).bottomMargin);
                            c0719a3 = c0719a4;
                            z8 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) c0719a4).height != 0 || f7 <= f5) {
                                i27 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) c0719a4).height = i29;
                                i27 = 0;
                            }
                            int i38 = f6 == f5 ? this.f5144i : 0;
                            c0719a3 = c0719a4;
                            measureChildWithMargins(childAt4, i3, 0, i4, i38);
                            if (i27 != i32) {
                                ((LinearLayout.LayoutParams) c0719a3).height = i27;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i39 = this.f5144i;
                            this.f5144i = Math.max(i39, i39 + measuredHeight2 + ((LinearLayout.LayoutParams) c0719a3).topMargin + ((LinearLayout.LayoutParams) c0719a3).bottomMargin);
                            int i40 = iMax5;
                            if (z10) {
                                iMax5 = Math.max(measuredHeight2, i40);
                            }
                            z8 = z11;
                        }
                        if (i33 >= 0 && i33 == i34 + 1) {
                            this.f5141f = this.f5144i;
                        }
                        if (i34 < i33 && ((LinearLayout.LayoutParams) c0719a3).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i28 = mode;
                        if (i28 == 1073741824 || ((LinearLayout.LayoutParams) c0719a3).width != -1) {
                            z9 = false;
                        } else {
                            z9 = true;
                            z13 = true;
                        }
                        int i41 = ((LinearLayout.LayoutParams) c0719a3).leftMargin + ((LinearLayout.LayoutParams) c0719a3).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i41;
                        iMax2 = Math.max(i35, measuredWidth2);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i36, childAt4.getMeasuredState());
                        boolean z14 = z12 && ((LinearLayout.LayoutParams) c0719a3).width == -1;
                        if (((LinearLayout.LayoutParams) c0719a3).weight > 0.0f) {
                            if (!z9) {
                                i41 = measuredWidth2;
                            }
                            iMax4 = Math.max(iMax4, i41);
                        } else {
                            int i42 = iMax4;
                            if (!z9) {
                                i41 = measuredWidth2;
                            }
                            iMax3 = Math.max(iMax3, i41);
                            iMax4 = i42;
                        }
                        z11 = z8;
                        i36 = iCombineMeasuredStates;
                        z12 = z14;
                    }
                    i34++;
                    mode = i28;
                    i35 = iMax2;
                    i33 = i33;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i29 = -2;
                    i30 = 1073741824;
                    i31 = 8;
                    i32 = Integer.MIN_VALUE;
                    f5 = 0.0f;
                }
                i33 = i33;
                mode2 = mode2;
                i28 = mode;
                virtualChildCount = virtualChildCount;
                iMax2 = i35;
                i34++;
                mode = i28;
                i35 = iMax2;
                i33 = i33;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i29 = -2;
                i30 = 1073741824;
                i31 = 8;
                i32 = Integer.MIN_VALUE;
                f5 = 0.0f;
            }
            int i43 = mode2;
            int i44 = mode;
            int i45 = virtualChildCount;
            int iMax6 = iMax3;
            int i46 = iMax4;
            int i47 = iMax5;
            int i48 = i35;
            int iCombineMeasuredStates2 = i36;
            if (this.f5144i > 0 && g(i45)) {
                this.f5144i += this.f5151p;
            }
            int i49 = i43;
            if (z10 && (i49 == Integer.MIN_VALUE || i49 == 0)) {
                this.f5144i = 0;
                for (int i50 = 0; i50 < i45; i50++) {
                    View childAt5 = getChildAt(i50);
                    if (childAt5 == null) {
                        this.f5144i = this.f5144i;
                    } else if (childAt5.getVisibility() != 8) {
                        C0719a0 c0719a5 = (C0719a0) childAt5.getLayoutParams();
                        int i51 = this.f5144i;
                        this.f5144i = Math.max(i51, i51 + i47 + ((LinearLayout.LayoutParams) c0719a5).topMargin + ((LinearLayout.LayoutParams) c0719a5).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f5144i;
            this.f5144i = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, 0);
            int i52 = (16777215 & iResolveSizeAndState) - this.f5144i;
            if (z11 || (i52 != 0 && f6 > 0.0f)) {
                float f8 = this.f5145j;
                if (f8 > 0.0f) {
                    f6 = f8;
                }
                this.f5144i = 0;
                int i53 = 0;
                while (i53 < i45) {
                    View childAt6 = getChildAt(i53);
                    if (childAt6.getVisibility() == 8) {
                        i24 = i49;
                    } else {
                        C0719a0 c0719a6 = (C0719a0) childAt6.getLayoutParams();
                        float f9 = ((LinearLayout.LayoutParams) c0719a6).weight;
                        if (f9 > 0.0f) {
                            int i54 = (int) ((i52 * f9) / f6);
                            f6 -= f9;
                            int i55 = i52 - i54;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) c0719a6).leftMargin + ((LinearLayout.LayoutParams) c0719a6).rightMargin, ((LinearLayout.LayoutParams) c0719a6).width);
                            if (((LinearLayout.LayoutParams) c0719a6).height == 0) {
                                i26 = 1073741824;
                                if (i49 == 1073741824) {
                                    if (i54 <= 0) {
                                        i54 = 0;
                                    }
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i54, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                                i52 = i55;
                            } else {
                                i26 = 1073741824;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i54;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i26));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & (-256));
                            i52 = i55;
                        }
                        int i56 = ((LinearLayout.LayoutParams) c0719a6).leftMargin + ((LinearLayout.LayoutParams) c0719a6).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i56;
                        int iMax7 = Math.max(i48, measuredWidth3);
                        if (i44 != 1073741824) {
                            i24 = i49;
                            i25 = -1;
                            if (((LinearLayout.LayoutParams) c0719a6).width != -1) {
                            }
                            iMax6 = Math.max(iMax6, i56);
                            if (z12 || ((LinearLayout.LayoutParams) c0719a6).width != i25) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            int i57 = this.f5144i;
                            this.f5144i = Math.max(i57, childAt6.getMeasuredHeight() + i57 + ((LinearLayout.LayoutParams) c0719a6).topMargin + ((LinearLayout.LayoutParams) c0719a6).bottomMargin);
                            z12 = z7;
                            i48 = iMax7;
                        } else {
                            i24 = i49;
                            i25 = -1;
                        }
                        i56 = measuredWidth3;
                        iMax6 = Math.max(iMax6, i56);
                        if (z12) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        int i58 = this.f5144i;
                        this.f5144i = Math.max(i58, childAt6.getMeasuredHeight() + i58 + ((LinearLayout.LayoutParams) c0719a6).topMargin + ((LinearLayout.LayoutParams) c0719a6).bottomMargin);
                        z12 = z7;
                        i48 = iMax7;
                    }
                    i53++;
                    i49 = i24;
                }
                this.f5144i = getPaddingBottom() + getPaddingTop() + this.f5144i;
            } else {
                iMax6 = Math.max(iMax6, i46);
                if (z10 && i49 != 1073741824) {
                    for (int i59 = 0; i59 < i45; i59++) {
                        View childAt7 = getChildAt(i59);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0719a0) childAt7.getLayoutParams())).weight > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i47, 1073741824));
                        }
                    }
                }
            }
            int i60 = i48;
            if (z12 || i44 == 1073741824) {
                iMax6 = i60;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i3, iCombineMeasuredStates2), iResolveSizeAndState);
            if (z13) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i61 = 0; i61 < i45; i61++) {
                    View childAt8 = getChildAt(i61);
                    if (childAt8.getVisibility() != 8) {
                        C0719a0 c0719a7 = (C0719a0) childAt8.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0719a7).width == -1) {
                            int i62 = ((LinearLayout.LayoutParams) c0719a7).height;
                            ((LinearLayout.LayoutParams) c0719a7).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i4, 0);
                            ((LinearLayout.LayoutParams) c0719a7).height = i62;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f5144i = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i3);
        int mode4 = View.MeasureSpec.getMode(i4);
        if (this.f5147l == null || this.f5148m == null) {
            this.f5147l = new int[4];
            this.f5148m = new int[4];
        }
        int[] iArr = this.f5147l;
        int[] iArr2 = this.f5148m;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z15 = this.f5140d;
        boolean z16 = this.f5146k;
        boolean z17 = mode3 == 1073741824;
        int iMax8 = 0;
        float f10 = 0.0f;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        int iMax9 = 0;
        int iMax10 = 0;
        boolean z18 = true;
        boolean z19 = false;
        boolean z20 = false;
        while (i64 < virtualChildCount2) {
            View childAt9 = getChildAt(i64);
            if (childAt9 == null) {
                this.f5144i = this.f5144i;
                i21 = i64;
                z2 = z16;
                z3 = z15;
            } else {
                int i66 = iMax8;
                int i67 = i63;
                if (childAt9.getVisibility() == 8) {
                    z3 = z15;
                    iMax8 = i66;
                    i63 = i67;
                    i21 = i64;
                    z2 = z16;
                } else {
                    if (g(i64)) {
                        this.f5144i += this.f5150o;
                    }
                    C0719a0 c0719a8 = (C0719a0) childAt9.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) c0719a8).weight;
                    float f12 = f10 + f11;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c0719a8).width == 0 && f11 > 0.0f) {
                        if (z17) {
                            this.f5144i = ((LinearLayout.LayoutParams) c0719a8).leftMargin + ((LinearLayout.LayoutParams) c0719a8).rightMargin + this.f5144i;
                        } else {
                            int i68 = this.f5144i;
                            this.f5144i = Math.max(i68, ((LinearLayout.LayoutParams) c0719a8).leftMargin + i68 + ((LinearLayout.LayoutParams) c0719a8).rightMargin);
                        }
                        if (z15) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            c0719a2 = c0719a8;
                            i18 = i66;
                            i19 = i67;
                            i21 = i64;
                            z2 = z16;
                            z3 = z15;
                        } else {
                            c0719a2 = c0719a8;
                            i18 = i66;
                            i19 = i67;
                            i21 = i64;
                            i22 = 1073741824;
                            z2 = z16;
                            z3 = z15;
                            z4 = true;
                        }
                        if (mode4 == i22 && ((LinearLayout.LayoutParams) c0719a2).height == -1) {
                            z5 = true;
                            z20 = true;
                        } else {
                            z5 = false;
                        }
                        i23 = ((LinearLayout.LayoutParams) c0719a2).topMargin + ((LinearLayout.LayoutParams) c0719a2).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i23;
                        int iCombineMeasuredStates3 = View.combineMeasuredStates(i65, childAt9.getMeasuredState());
                        if (!z3 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i69 = ((LinearLayout.LayoutParams) c0719a2).gravity;
                            if (i69 < 0) {
                                i69 = this.f5143h;
                            }
                            int i70 = (((i69 & 112) >> 4) & (-2)) >> 1;
                            iArr[i70] = Math.max(iArr[i70], baseline2);
                            iArr2[i70] = Math.max(iArr2[i70], measuredHeight - baseline2);
                        }
                        int iMax11 = Math.max(i19, measuredHeight);
                        if (z18 || ((LinearLayout.LayoutParams) c0719a2).height != -1) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (((LinearLayout.LayoutParams) c0719a2).weight > 0.0f) {
                            if (z5) {
                                measuredHeight = i23;
                            }
                            iMax10 = Math.max(iMax10, measuredHeight);
                            iMax8 = i18;
                        } else {
                            if (z5) {
                                measuredHeight = i23;
                            }
                            iMax8 = Math.max(i18, measuredHeight);
                        }
                        i63 = iMax11;
                        i65 = iCombineMeasuredStates3;
                        z19 = z4;
                        z18 = z6;
                        f10 = f12;
                    } else {
                        int i71 = i64;
                        if (((LinearLayout.LayoutParams) c0719a8).width == 0) {
                            f4 = 0.0f;
                            if (f11 > 0.0f) {
                                ((LinearLayout.LayoutParams) c0719a8).width = -2;
                                i16 = 0;
                            }
                            if (f12 == f4) {
                                i17 = this.f5144i;
                            } else {
                                i17 = 0;
                            }
                            i18 = i66;
                            i19 = i67;
                            i20 = i16;
                            i21 = i71;
                            z2 = z16;
                            z3 = z15;
                            measureChildWithMargins(childAt9, i3, i17, i4, 0);
                            if (i20 != Integer.MIN_VALUE) {
                                c0719a2 = c0719a8;
                                ((LinearLayout.LayoutParams) c0719a2).width = i20;
                            } else {
                                c0719a2 = c0719a8;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            if (z17) {
                                this.f5144i = ((LinearLayout.LayoutParams) c0719a2).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) c0719a2).rightMargin + this.f5144i;
                            } else {
                                int i72 = this.f5144i;
                                this.f5144i = Math.max(i72, i72 + measuredWidth + ((LinearLayout.LayoutParams) c0719a2).leftMargin + ((LinearLayout.LayoutParams) c0719a2).rightMargin);
                            }
                            if (z2) {
                                iMax9 = Math.max(measuredWidth, iMax9);
                            }
                        } else {
                            f4 = 0.0f;
                        }
                        i16 = Integer.MIN_VALUE;
                        if (f12 == f4) {
                            i17 = this.f5144i;
                        } else {
                            i17 = 0;
                        }
                        i18 = i66;
                        i19 = i67;
                        i20 = i16;
                        i21 = i71;
                        z2 = z16;
                        z3 = z15;
                        measureChildWithMargins(childAt9, i3, i17, i4, 0);
                        if (i20 != Integer.MIN_VALUE) {
                            c0719a2 = c0719a8;
                            ((LinearLayout.LayoutParams) c0719a2).width = i20;
                        } else {
                            c0719a2 = c0719a8;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        if (z17) {
                            this.f5144i = ((LinearLayout.LayoutParams) c0719a2).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) c0719a2).rightMargin + this.f5144i;
                        } else {
                            int i73 = this.f5144i;
                            this.f5144i = Math.max(i73, i73 + measuredWidth + ((LinearLayout.LayoutParams) c0719a2).leftMargin + ((LinearLayout.LayoutParams) c0719a2).rightMargin);
                        }
                        if (z2) {
                            iMax9 = Math.max(measuredWidth, iMax9);
                        }
                    }
                    z4 = z19;
                    i22 = 1073741824;
                    if (mode4 == i22) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    i23 = ((LinearLayout.LayoutParams) c0719a2).topMargin + ((LinearLayout.LayoutParams) c0719a2).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i23;
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(i65, childAt9.getMeasuredState());
                    if (!z3) {
                    }
                    int iMax12 = Math.max(i19, measuredHeight);
                    if (z18) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (((LinearLayout.LayoutParams) c0719a2).weight > 0.0f) {
                        if (z5) {
                            measuredHeight = i23;
                        }
                        iMax10 = Math.max(iMax10, measuredHeight);
                        iMax8 = i18;
                    } else {
                        if (z5) {
                            measuredHeight = i23;
                        }
                        iMax8 = Math.max(i18, measuredHeight);
                    }
                    i63 = iMax12;
                    i65 = iCombineMeasuredStates4;
                    z19 = z4;
                    z18 = z6;
                    f10 = f12;
                }
            }
            i64 = i21 + 1;
            z16 = z2;
            z15 = z3;
        }
        int i74 = i63;
        boolean z21 = z16;
        boolean z22 = z15;
        if (this.f5144i > 0 && g(virtualChildCount2)) {
            this.f5144i += this.f5150o;
        }
        int i75 = iArr[1];
        if (i75 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c3 = 3;
            if (iArr[3] == -1) {
                iMax = i74;
            }
            if (z21 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.f5144i = 0;
                for (i15 = 0; i15 < virtualChildCount2; i15++) {
                    childAt3 = getChildAt(i15);
                    if (childAt3 == null) {
                        this.f5144i = this.f5144i;
                    } else if (childAt3.getVisibility() == 8) {
                        c0719a1 = (C0719a0) childAt3.getLayoutParams();
                        if (z17) {
                            this.f5144i = ((LinearLayout.LayoutParams) c0719a1).leftMargin + iMax9 + ((LinearLayout.LayoutParams) c0719a1).rightMargin + this.f5144i;
                        } else {
                            int i76 = this.f5144i;
                            this.f5144i = Math.max(i76, i76 + iMax9 + ((LinearLayout.LayoutParams) c0719a1).leftMargin + ((LinearLayout.LayoutParams) c0719a1).rightMargin);
                        }
                    }
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f5144i;
            this.f5144i = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i3, 0);
            i5 = (16777215 & iResolveSizeAndState2) - this.f5144i;
            if (!z19 || (i5 != 0 && f10 > 0.0f)) {
                f3 = this.f5145j;
                if (f3 > 0.0f) {
                    f10 = f3;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f5144i = 0;
                int iCombineMeasuredStates5 = i65;
                iMax = -1;
                i6 = 0;
                while (i6 < virtualChildCount2) {
                    childAt = getChildAt(i6);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        i10 = i5;
                        virtualChildCount2 = virtualChildCount2;
                    } else {
                        C0719a0 c0719a9 = (C0719a0) childAt.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) c0719a9).weight;
                        if (f13 > 0.0f) {
                            int i77 = (int) ((i5 * f13) / f10);
                            float f14 = f10 - f13;
                            int i78 = i5 - i77;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) c0719a9).topMargin + ((LinearLayout.LayoutParams) c0719a9).bottomMargin, ((LinearLayout.LayoutParams) c0719a9).height);
                            if (((LinearLayout.LayoutParams) c0719a9).width == 0) {
                                i13 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i77 <= 0) {
                                        i77 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i77, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                                f10 = f14;
                                i11 = i78;
                            } else {
                                i13 = 1073741824;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i77;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i13), childMeasureSpec2);
                            iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & (-16777216));
                            f10 = f14;
                            i11 = i78;
                        } else {
                            i11 = i5;
                        }
                        if (z17) {
                            this.f5144i = childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0719a9).leftMargin + ((LinearLayout.LayoutParams) c0719a9).rightMargin + this.f5144i;
                        } else {
                            int i79 = this.f5144i;
                            this.f5144i = Math.max(i79, childAt.getMeasuredWidth() + i79 + ((LinearLayout.LayoutParams) c0719a9).leftMargin + ((LinearLayout.LayoutParams) c0719a9).rightMargin);
                        }
                        boolean z23 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c0719a9).height == -1;
                        int i80 = ((LinearLayout.LayoutParams) c0719a9).topMargin + ((LinearLayout.LayoutParams) c0719a9).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i80;
                        iMax = Math.max(iMax, measuredHeight4);
                        if (!z23) {
                            i80 = measuredHeight4;
                        }
                        iMax8 = Math.max(iMax8, i80);
                        if (z18) {
                            i12 = -1;
                            boolean z24 = ((LinearLayout.LayoutParams) c0719a9).height == -1;
                            if (!z22 && (baseline = childAt.getBaseline()) != i12) {
                                int i81 = ((LinearLayout.LayoutParams) c0719a9).gravity;
                                if (i81 < 0) {
                                    i81 = this.f5143h;
                                }
                                int i82 = (((i81 & 112) >> 4) & (-2)) >> 1;
                                iArr[i82] = Math.max(iArr[i82], baseline);
                                iArr2[i82] = Math.max(iArr2[i82], measuredHeight4 - baseline);
                            }
                            z18 = z24;
                            i10 = i11;
                            f10 = f10;
                        } else {
                            i12 = -1;
                        }
                        if (!z22) {
                        }
                        z18 = z24;
                        i10 = i11;
                        f10 = f10;
                    }
                    i6++;
                    i5 = i10;
                    virtualChildCount2 = virtualChildCount2;
                }
                i7 = virtualChildCount2;
                this.f5144i = getPaddingRight() + getPaddingLeft() + this.f5144i;
                i8 = iArr[1];
                if (i8 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c4 = 3;
                    if (iArr[3] == -1) {
                        i9 = 0;
                    }
                    i65 = iCombineMeasuredStates5;
                } else {
                    c4 = 3;
                }
                i9 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c4], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c4], Math.max(iArr[0], Math.max(i8, iArr[2]))));
                i65 = iCombineMeasuredStates5;
            } else {
                iMax8 = Math.max(iMax8, iMax10);
                if (z21 && mode3 != 1073741824) {
                    for (int i83 = 0; i83 < virtualChildCount2; i83++) {
                        View childAt10 = getChildAt(i83);
                        if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0719a0) childAt10.getLayoutParams())).weight > 0.0f) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i7 = virtualChildCount2;
                i9 = 0;
            }
            if (z18 || mode4 == 1073741824) {
                iMax8 = iMax;
            }
            setMeasuredDimension((i65 & (-16777216)) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i4, i65 << 16));
            if (z20) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                i14 = i7;
                while (i9 < i14) {
                    childAt2 = getChildAt(i9);
                    if (childAt2.getVisibility() != 8) {
                        c0719a0 = (C0719a0) childAt2.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c0719a0).height == -1) {
                            int i84 = ((LinearLayout.LayoutParams) c0719a0).width;
                            ((LinearLayout.LayoutParams) c0719a0).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i3, 0, iMakeMeasureSpec, 0);
                            ((LinearLayout.LayoutParams) c0719a0).width = i84;
                        }
                    }
                    i9++;
                }
            }
        }
        c3 = 3;
        iMax = Math.max(i74, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(i75, iArr[2]))));
        if (z21) {
            this.f5144i = 0;
            while (i15 < virtualChildCount2) {
                childAt3 = getChildAt(i15);
                if (childAt3 == null) {
                    this.f5144i = this.f5144i;
                } else if (childAt3.getVisibility() == 8) {
                    c0719a1 = (C0719a0) childAt3.getLayoutParams();
                    if (z17) {
                        this.f5144i = ((LinearLayout.LayoutParams) c0719a1).leftMargin + iMax9 + ((LinearLayout.LayoutParams) c0719a1).rightMargin + this.f5144i;
                    } else {
                        int i710 = this.f5144i;
                        this.f5144i = Math.max(i710, i710 + iMax9 + ((LinearLayout.LayoutParams) c0719a1).leftMargin + ((LinearLayout.LayoutParams) c0719a1).rightMargin);
                    }
                }
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f5144i;
        this.f5144i = paddingRight2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i3, 0);
        i5 = (16777215 & iResolveSizeAndState3) - this.f5144i;
        if (z19) {
            f3 = this.f5145j;
            if (f3 > 0.0f) {
                f10 = f3;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f5144i = 0;
            int iCombineMeasuredStates6 = i65;
            iMax = -1;
            i6 = 0;
            while (i6 < virtualChildCount2) {
                childAt = getChildAt(i6);
                if (childAt != null) {
                    i10 = i5;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i10 = i5;
                    virtualChildCount2 = virtualChildCount2;
                }
                i6++;
                i5 = i10;
                virtualChildCount2 = virtualChildCount2;
            }
            i7 = virtualChildCount2;
            this.f5144i = getPaddingRight() + getPaddingLeft() + this.f5144i;
            i8 = iArr[1];
            if (i8 != -1) {
                c4 = 3;
                i9 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c4], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c4], Math.max(iArr[0], Math.max(i8, iArr[2]))));
            } else {
                c4 = 3;
                i9 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c4], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c4], Math.max(iArr[0], Math.max(i8, iArr[2]))));
            }
            i65 = iCombineMeasuredStates6;
        } else {
            f3 = this.f5145j;
            if (f3 > 0.0f) {
                f10 = f3;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f5144i = 0;
            int iCombineMeasuredStates7 = i65;
            iMax = -1;
            i6 = 0;
            while (i6 < virtualChildCount2) {
                childAt = getChildAt(i6);
                if (childAt != null) {
                    i10 = i5;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i10 = i5;
                    virtualChildCount2 = virtualChildCount2;
                }
                i6++;
                i5 = i10;
                virtualChildCount2 = virtualChildCount2;
            }
            i7 = virtualChildCount2;
            this.f5144i = getPaddingRight() + getPaddingLeft() + this.f5144i;
            i8 = iArr[1];
            if (i8 != -1) {
                c4 = 3;
                i9 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c4], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c4], Math.max(iArr[0], Math.max(i8, iArr[2]))));
            } else {
                c4 = 3;
                i9 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c4], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c4], Math.max(iArr[0], Math.max(i8, iArr[2]))));
            }
            i65 = iCombineMeasuredStates7;
        }
        if (z18) {
            iMax8 = iMax;
        } else {
            iMax8 = iMax;
        }
        setMeasuredDimension((i65 & (-16777216)) | iResolveSizeAndState3, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i4, i65 << 16));
        if (z20) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i14 = i7;
            while (i9 < i14) {
                childAt2 = getChildAt(i9);
                if (childAt2.getVisibility() != 8) {
                    c0719a0 = (C0719a0) childAt2.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c0719a0).height == -1) {
                        int i85 = ((LinearLayout.LayoutParams) c0719a0).width;
                        ((LinearLayout.LayoutParams) c0719a0).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i3, 0, iMakeMeasureSpec, 0);
                        ((LinearLayout.LayoutParams) c0719a0).width = i85;
                    }
                }
                i9++;
            }
        }
    }

    public void setBaselineAligned(boolean z2) {
        this.f5140d = z2;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.e = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f5149n) {
            return;
        }
        this.f5149n = drawable;
        if (drawable != null) {
            this.f5150o = drawable.getIntrinsicWidth();
            this.f5151p = drawable.getIntrinsicHeight();
        } else {
            this.f5150o = 0;
            this.f5151p = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.f5153r = i3;
    }

    public void setGravity(int i3) {
        if (this.f5143h != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f5143h = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i4 = i3 & 8388615;
        int i5 = this.f5143h;
        if ((8388615 & i5) != i4) {
            this.f5143h = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f5146k = z2;
    }

    public void setOrientation(int i3) {
        if (this.f5142g != i3) {
            this.f5142g = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.f5152q) {
            requestLayout();
        }
        this.f5152q = i3;
    }

    public void setVerticalGravity(int i3) {
        int i4 = i3 & 112;
        int i5 = this.f5143h;
        if ((i5 & 112) != i4) {
            this.f5143h = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f5145j = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
