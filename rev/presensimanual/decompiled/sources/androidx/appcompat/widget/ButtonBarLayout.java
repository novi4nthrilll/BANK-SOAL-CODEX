package androidx.appcompat.widget;

import B.D;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import id.go.bangkalankab.simpeg.R;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2040d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2041f;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2041f = -1;
        int[] iArr = p011d.a.f3538i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        D.c(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f2040d = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f2040d);
        }
    }

    private void setStacked(boolean z2) {
        if (this.e != z2) {
            if (!z2 || this.f2040d) {
                this.e = z2;
                setOrientation(z2 ? 1 : 0);
                setGravity(z2 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z2 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int iMakeMeasureSpec;
        boolean z2;
        int i5;
        int size = View.MeasureSpec.getSize(i3);
        int paddingBottom = 0;
        if (this.f2040d) {
            if (size > this.f2041f && this.e) {
                setStacked(false);
            }
            this.f2041f = size;
        }
        if (this.e || View.MeasureSpec.getMode(i3) != 1073741824) {
            iMakeMeasureSpec = i3;
            z2 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i4);
        if (this.f2040d && !this.e && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z2 = true;
        }
        if (z2) {
            super.onMeasure(i3, i4);
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i5 = -1;
            if (i6 >= childCount) {
                i6 = -1;
                break;
            } else if (getChildAt(i6).getVisibility() == 0) {
                break;
            } else {
                i6++;
            }
        }
        if (i6 >= 0) {
            View childAt = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.e) {
                int childCount2 = getChildCount();
                for (int i7 = i6 + 1; i7 < childCount2; i7++) {
                    if (getChildAt(i7).getVisibility() == 0) {
                        i5 = i7;
                        break;
                    }
                }
                paddingBottom = i5 >= 0 ? getChildAt(i5).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        Field field = D.f41a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i4 == 0) {
                super.onMeasure(i3, i4);
            }
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f2040d != z2) {
            this.f2040d = z2;
            if (!z2 && this.e) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
