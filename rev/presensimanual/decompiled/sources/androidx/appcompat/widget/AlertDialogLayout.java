package androidx.appcompat.widget;

import B.D;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import id.go.bangkalankab.simpeg.R;
import java.lang.reflect.Field;
import k.AbstractC0721b0;
import k.C0719a0;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC0721b0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int h(View view) {
        Field field = D.f41a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return h(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    @Override // k.AbstractC0721b0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int paddingLeft = getPaddingLeft();
        int i10 = i5 - i3;
        int paddingRight = i10 - getPaddingRight();
        int paddingRight2 = (i10 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i11 = gravity & 112;
        int i12 = gravity & 8388615;
        int paddingTop = i11 != 16 ? i11 != 80 ? getPaddingTop() : ((getPaddingTop() + i6) - i4) - measuredHeight : (((i6 - i4) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C0719a0 c0719a0 = (C0719a0) childAt.getLayoutParams();
                int i14 = ((LinearLayout.LayoutParams) c0719a0).gravity;
                if (i14 < 0) {
                    i14 = i12;
                }
                Field field = D.f41a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i14, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i9 = ((LinearLayout.LayoutParams) c0719a0).leftMargin + paddingLeft;
                    } else {
                        i7 = paddingRight - measuredWidth;
                        i8 = ((LinearLayout.LayoutParams) c0719a0).rightMargin;
                    }
                    if (g(i13)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i15 = paddingTop + ((LinearLayout.LayoutParams) c0719a0).topMargin;
                    childAt.layout(i9, i15, measuredWidth + i9, i15 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0719a0).bottomMargin + i15;
                } else {
                    i7 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0719a0).leftMargin;
                    i8 = ((LinearLayout.LayoutParams) c0719a0).rightMargin;
                }
                i9 = i7 - i8;
                if (g(i13)) {
                    paddingTop += intrinsicHeight;
                }
                int i16 = paddingTop + ((LinearLayout.LayoutParams) c0719a0).topMargin;
                childAt.layout(i9, i16, measuredWidth + i9, i16 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0719a0).bottomMargin + i16;
            }
        }
    }

    @Override // k.AbstractC0721b0, android.view.View
    public final void onMeasure(int i3, int i4) {
        int iCombineMeasuredStates;
        int iH;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == R.id.topPanel) {
                    view = childAt;
                } else if (id2 == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id2 != R.id.contentPanel && id2 != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i3, i4);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i3);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i3, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i3, 0);
            iH = h(view2);
            measuredHeight = view2.getMeasuredHeight() - iH;
            paddingBottom += iH;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iH = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i3, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i6 = size - paddingBottom;
        if (view2 != null) {
            int i7 = paddingBottom - iH;
            int iMin = Math.min(i6, measuredHeight);
            if (iMin > 0) {
                i6 -= iMin;
                iH += iMin;
            }
            view2.measure(i3, View.MeasureSpec.makeMeasureSpec(iH, 1073741824));
            paddingBottom = i7 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i6 > 0) {
            view3.measure(i3, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i6, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = getChildAt(i8);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + iMax, i3, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i4, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt3 = getChildAt(i9);
                if (childAt3.getVisibility() != 8) {
                    C0719a0 c0719a0 = (C0719a0) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c0719a0).width == -1) {
                        int i10 = ((LinearLayout.LayoutParams) c0719a0).height;
                        ((LinearLayout.LayoutParams) c0719a0).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i4, 0);
                        ((LinearLayout.LayoutParams) c0719a0).height = i10;
                    }
                }
            }
        }
    }
}
