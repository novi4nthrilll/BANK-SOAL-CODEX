package Y;

import B.C0006g;
import W1.C0104l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D0.b f1905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f1906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0104l f1907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0104l f1908d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1910g;

    public s() {
        A0.f fVar = new A0.f(29, this);
        C0006g c0006g = new C0006g(29, this);
        this.f1907c = new C0104l((L) fVar);
        this.f1908d = new C0104l((L) c0006g);
        this.e = false;
    }

    public static int e(int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i4, i5) : size;
        }
        return Math.min(size, Math.max(i4, i5));
    }

    public static void v(View view) {
        ((t) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0116k w(Context context, AttributeSet attributeSet, int i3, int i4) {
        C0116k c0116k = new C0116k(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, X.a.f1807a, i3, i4);
        c0116k.f1894b = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0116k.f1895c = typedArrayObtainStyledAttributes.getInt(9, 1);
        c0116k.f1896d = typedArrayObtainStyledAttributes.getBoolean(8, false);
        c0116k.e = typedArrayObtainStyledAttributes.getBoolean(10, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0116k;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f1906b;
        y yVar = recyclerView.f2466d;
        B b3 = recyclerView.f2463a0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z2 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f1906b.canScrollVertically(-1) && !this.f1906b.canScrollHorizontally(-1) && !this.f1906b.canScrollHorizontally(1)) {
            z2 = false;
        }
        accessibilityEvent.setScrollable(z2);
        this.f1906b.getClass();
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int iP = p() - 1;
        if (iP < 0) {
            return;
        }
        RecyclerView.j(o(iP));
        throw null;
    }

    public final void F(y yVar) {
        int size = yVar.f1915a.size();
        int i3 = size - 1;
        ArrayList arrayList = yVar.f1915a;
        if (i3 >= 0) {
            arrayList.get(i3).getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        if (size > 0) {
            this.f1906b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        int iS = s();
        int iU = u();
        int iT = this.f1909f - t();
        int iR = this.f1910g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i3 = left - iS;
        int iMin = Math.min(0, i3);
        int i4 = top - iU;
        int iMin2 = Math.min(0, i4);
        int i5 = iWidth - iT;
        int iMax = Math.max(0, i5);
        int iMax2 = Math.max(0, iHeight - iR);
        RecyclerView recyclerView2 = this.f1906b;
        Field field = B.D.f41a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i3, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i5);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i4, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i6 = iArr[0];
        int i7 = iArr[1];
        if (z3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iS2 = s();
            int iU2 = u();
            int iT2 = this.f1909f - t();
            int iR2 = this.f1910g - r();
            Rect rect2 = this.f1906b.f2476j;
            int[] iArr2 = RecyclerView.f2438k0;
            t tVar = (t) focusedChild.getLayoutParams();
            Rect rect3 = tVar.f1911a;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) tVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) tVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) tVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) tVar).bottomMargin);
            if (rect2.left - i6 >= iT2 || rect2.right - i6 <= iS2 || rect2.top - i7 >= iR2 || rect2.bottom - i7 <= iU2) {
                return false;
            }
        }
        if (i6 == 0 && i7 == 0) {
            return false;
        }
        if (z2) {
            recyclerView.scrollBy(i6, i7);
            return true;
        }
        recyclerView.r(i6, i7);
        return true;
    }

    public final void H() {
        RecyclerView recyclerView = this.f1906b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f1906b = null;
            this.f1905a = null;
            this.f1909f = 0;
            this.f1910g = 0;
            return;
        }
        this.f1906b = recyclerView;
        this.f1905a = recyclerView.f2471g;
        this.f1909f = recyclerView.getWidth();
        this.f1910g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(t tVar) {
        return tVar != null;
    }

    public abstract int f(B b3);

    public abstract void g(B b3);

    public abstract int h(B b3);

    public abstract int i(B b3);

    public abstract void j(B b3);

    public abstract int k(B b3);

    public abstract t l();

    public t m(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    public t n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof t) {
            return new t((t) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new t((ViewGroup.MarginLayoutParams) layoutParams) : new t(layoutParams);
    }

    public final View o(int i3) {
        D0.b bVar = this.f1905a;
        if (bVar == null) {
            return null;
        }
        int i4 = -1;
        if (i3 >= 0) {
            int childCount = ((RecyclerView) ((C0006g) bVar.e).e).getChildCount();
            int i5 = i3;
            while (i5 < childCount) {
                F0.e eVar = (F0.e) bVar.f182f;
                int iA = i3 - (i5 - eVar.a(i5));
                if (iA == 0) {
                    i4 = i5;
                    while (eVar.c(i4)) {
                        i4++;
                    }
                    break;
                }
                i5 += iA;
            }
        }
        return ((RecyclerView) ((C0006g) bVar.e).e).getChildAt(i4);
    }

    public final int p() {
        D0.b bVar = this.f1905a;
        if (bVar != null) {
            return ((RecyclerView) ((C0006g) bVar.e).e).getChildCount() - ((ArrayList) bVar.f183g).size();
        }
        return 0;
    }

    public int q(y yVar, B b3) {
        RecyclerView recyclerView = this.f1906b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f1906b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f1906b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f1906b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f1906b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(y yVar, B b3) {
        RecyclerView recyclerView = this.f1906b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int i3) {
    }
}
