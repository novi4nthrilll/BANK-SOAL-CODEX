package androidx.recyclerview.widget;

import B.C0011l;
import B.D;
import E0.l;
import S.h;
import T.b;
import Y.B;
import Y.C0116k;
import Y.G;
import Y.I;
import Y.J;
import Y.s;
import Y.t;
import Y.y;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.util.BitSet;
import p013d1.E;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J[] f2494i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f2495j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f2496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f2498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2499n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h f2500o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public I f2502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f2503r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f2504s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f2493h = -1;
        this.f2498m = false;
        h hVar = new h();
        this.f2500o = hVar;
        this.f2501p = 2;
        new Rect();
        this.f2503r = true;
        this.f2504s = new l(9, this);
        C0116k c0116kW = s.w(context, attributeSet, i3, i4);
        int i5 = c0116kW.f1894b;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i5 != this.f2497l) {
            this.f2497l = i5;
            b bVar = this.f2495j;
            this.f2495j = this.f2496k;
            this.f2496k = bVar;
            H();
        }
        int i6 = c0116kW.f1895c;
        a(null);
        if (i6 != this.f2493h) {
            hVar.f1572a = null;
            H();
            this.f2493h = i6;
            new BitSet(this.f2493h);
            this.f2494i = new J[this.f2493h];
            for (int i7 = 0; i7 < this.f2493h; i7++) {
                this.f2494i[i7] = new J(this, i7);
            }
            H();
        }
        boolean z2 = c0116kW.f1896d;
        a(null);
        I i8 = this.f2502q;
        if (i8 != null && i8.f1833h != z2) {
            i8.f1833h = z2;
        }
        this.f2498m = z2;
        H();
        C0011l c0011l = new C0011l(1);
        c0011l.f89b = 0;
        c0011l.f90c = 0;
        this.f2495j = b.b(this, this.f2497l);
        this.f2496k = b.b(this, 1 - this.f2497l);
    }

    @Override // Y.s
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View viewO = O(false);
            View viewN = N(false);
            if (viewO == null || viewN == null) {
                return;
            }
            ((t) viewO.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // Y.s
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof I) {
            this.f2502q = (I) parcelable;
            H();
        }
    }

    @Override // Y.s
    public final Parcelable C() {
        I i3 = this.f2502q;
        if (i3 != null) {
            I i4 = new I();
            i4.f1829c = i3.f1829c;
            i4.f1827a = i3.f1827a;
            i4.f1828b = i3.f1828b;
            i4.f1830d = i3.f1830d;
            i4.e = i3.e;
            i4.f1831f = i3.f1831f;
            i4.f1833h = i3.f1833h;
            i4.f1834i = i3.f1834i;
            i4.f1835j = i3.f1835j;
            i4.f1832g = i3.f1832g;
            return i4;
        }
        I i5 = new I();
        i5.f1833h = this.f2498m;
        i5.f1834i = false;
        i5.f1835j = false;
        i5.e = 0;
        if (p() > 0) {
            P();
            i5.f1827a = 0;
            View viewN = this.f2499n ? N(true) : O(true);
            if (viewN != null) {
                ((t) viewN.getLayoutParams()).getClass();
                throw null;
            }
            i5.f1828b = -1;
            int i6 = this.f2493h;
            i5.f1829c = i6;
            i5.f1830d = new int[i6];
            for (int i7 = 0; i7 < this.f2493h; i7++) {
                J j3 = this.f2494i[i7];
                int iG = j3.f1837b;
                if (iG == Integer.MIN_VALUE) {
                    if (j3.f1836a.size() == 0) {
                        iG = Integer.MIN_VALUE;
                    } else {
                        View view = (View) j3.f1836a.get(0);
                        G g3 = (G) view.getLayoutParams();
                        j3.f1837b = j3.e.f2495j.e(view);
                        g3.getClass();
                        iG = j3.f1837b;
                    }
                }
                if (iG != Integer.MIN_VALUE) {
                    iG -= this.f2495j.g();
                }
                i5.f1830d[i7] = iG;
            }
        } else {
            i5.f1827a = -1;
            i5.f1828b = -1;
            i5.f1829c = 0;
        }
        return i5;
    }

    @Override // Y.s
    public final void D(int i3) {
        if (i3 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i3 = this.f2493h;
        boolean z2 = this.f2499n;
        if (p() == 0 || this.f2501p == 0 || !this.e) {
            return false;
        }
        if (z2) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int iP = p();
        int i4 = iP - 1;
        new BitSet(i3).set(0, i3, true);
        if (this.f2497l == 1) {
            RecyclerView recyclerView = this.f1906b;
            Field field = D.f41a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z2) {
            iP = -1;
        } else {
            i4 = 0;
        }
        if (i4 == iP) {
            return false;
        }
        ((G) o(i4).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(B b3) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.f2495j;
        boolean z2 = !this.f2503r;
        return E.a(b3, bVar, O(z2), N(z2), this, this.f2503r);
    }

    public final void L(B b3) {
        if (p() == 0) {
            return;
        }
        boolean z2 = !this.f2503r;
        View viewO = O(z2);
        View viewN = N(z2);
        if (p() == 0 || b3.a() == 0 || viewO == null || viewN == null) {
            return;
        }
        ((t) viewO.getLayoutParams()).getClass();
        throw null;
    }

    public final int M(B b3) {
        if (p() == 0) {
            return 0;
        }
        b bVar = this.f2495j;
        boolean z2 = !this.f2503r;
        return E.b(b3, bVar, O(z2), N(z2), this, this.f2503r);
    }

    public final View N(boolean z2) {
        int iG = this.f2495j.g();
        int iF = this.f2495j.f();
        View view = null;
        for (int iP = p() - 1; iP >= 0; iP--) {
            View viewO = o(iP);
            int iE = this.f2495j.e(viewO);
            int iD = this.f2495j.d(viewO);
            if (iD > iG && iE < iF) {
                if (iD <= iF || !z2) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final View O(boolean z2) {
        int iG = this.f2495j.g();
        int iF = this.f2495j.f();
        int iP = p();
        View view = null;
        for (int i3 = 0; i3 < iP; i3++) {
            View viewO = o(i3);
            int iE = this.f2495j.e(viewO);
            if (this.f2495j.d(viewO) > iG && iE < iF) {
                if (iE >= iG || !z2) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final void P() {
        if (p() == 0) {
            return;
        }
        s.v(o(0));
        throw null;
    }

    public final void Q() {
        int iP = p();
        if (iP == 0) {
            return;
        }
        s.v(o(iP - 1));
        throw null;
    }

    @Override // Y.s
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2502q != null || (recyclerView = this.f1906b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // Y.s
    public final boolean b() {
        return this.f2497l == 0;
    }

    @Override // Y.s
    public final boolean c() {
        return this.f2497l == 1;
    }

    @Override // Y.s
    public final boolean d(t tVar) {
        return tVar instanceof G;
    }

    @Override // Y.s
    public final int f(B b3) {
        return K(b3);
    }

    @Override // Y.s
    public final void g(B b3) {
        L(b3);
    }

    @Override // Y.s
    public final int h(B b3) {
        return M(b3);
    }

    @Override // Y.s
    public final int i(B b3) {
        return K(b3);
    }

    @Override // Y.s
    public final void j(B b3) {
        L(b3);
    }

    @Override // Y.s
    public final int k(B b3) {
        return M(b3);
    }

    @Override // Y.s
    public final t l() {
        return this.f2497l == 0 ? new G(-2, -1) : new G(-1, -2);
    }

    @Override // Y.s
    public final t m(Context context, AttributeSet attributeSet) {
        return new G(context, attributeSet);
    }

    @Override // Y.s
    public final t n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new G((ViewGroup.MarginLayoutParams) layoutParams) : new G(layoutParams);
    }

    @Override // Y.s
    public final int q(y yVar, B b3) {
        if (this.f2497l == 1) {
            return this.f2493h;
        }
        super.q(yVar, b3);
        return 1;
    }

    @Override // Y.s
    public final int x(y yVar, B b3) {
        if (this.f2497l == 0) {
            return this.f2493h;
        }
        super.x(yVar, b3);
        return 1;
    }

    @Override // Y.s
    public final boolean y() {
        return this.f2501p != 0;
    }

    @Override // Y.s
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1906b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2504s);
        }
        for (int i3 = 0; i3 < this.f2493h; i3++) {
            J j3 = this.f2494i[i3];
            j3.f1836a.clear();
            j3.f1837b = Integer.MIN_VALUE;
            j3.f1838c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
