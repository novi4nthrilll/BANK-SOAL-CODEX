package androidx.recyclerview.widget;

import Y.B;
import Y.C0116k;
import Y.C0117l;
import Y.s;
import Y.t;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p013d1.E;
import p013d1.I;
import p071w1.b;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f2431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final T.b f2432j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2433k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2434l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2435m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2436n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0117l f2437o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f2430h = 1;
        this.f2433k = false;
        C0116k c0116k = new C0116k(0);
        c0116k.f1894b = -1;
        c0116k.f1895c = Integer.MIN_VALUE;
        c0116k.f1896d = false;
        c0116k.e = false;
        C0116k c0116kW = s.w(context, attributeSet, i3, i4);
        int i5 = c0116kW.f1894b;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException(I.f("invalid orientation:", i5));
        }
        a(null);
        if (i5 != this.f2430h || this.f2432j == null) {
            this.f2432j = T.b.b(this, i5);
            this.f2430h = i5;
            H();
        }
        boolean z2 = c0116kW.f1896d;
        a(null);
        if (z2 != this.f2433k) {
            this.f2433k = z2;
            H();
        }
        Q(c0116kW.e);
    }

    @Override // Y.s
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View viewP = P(0, p(), false);
            if (viewP != null) {
                ((t) viewP.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View viewP2 = P(p() - 1, -1, false);
            if (viewP2 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((t) viewP2.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // Y.s
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0117l) {
            this.f2437o = (C0117l) parcelable;
            H();
        }
    }

    @Override // Y.s
    public final Parcelable C() {
        C0117l c0117l = this.f2437o;
        if (c0117l != null) {
            C0117l c0117l2 = new C0117l();
            c0117l2.f1897a = c0117l.f1897a;
            c0117l2.f1898b = c0117l.f1898b;
            c0117l2.f1899c = c0117l.f1899c;
            return c0117l2;
        }
        C0117l c0117l3 = new C0117l();
        if (p() <= 0) {
            c0117l3.f1897a = -1;
            return c0117l3;
        }
        M();
        boolean z2 = this.f2434l;
        c0117l3.f1899c = z2;
        if (!z2) {
            s.v(o(z2 ? p() - 1 : 0));
            throw null;
        }
        View viewO = o(z2 ? 0 : p() - 1);
        c0117l3.f1898b = this.f2432j.f() - this.f2432j.d(viewO);
        s.v(viewO);
        throw null;
    }

    public final int J(B b3) {
        if (p() == 0) {
            return 0;
        }
        M();
        T.b bVar = this.f2432j;
        boolean z2 = !this.f2436n;
        return E.a(b3, bVar, O(z2), N(z2), this, this.f2436n);
    }

    public final void K(B b3) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z2 = !this.f2436n;
        View viewO = O(z2);
        View viewN = N(z2);
        if (p() == 0 || b3.a() == 0 || viewO == null || viewN == null) {
            return;
        }
        ((t) viewO.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(B b3) {
        if (p() == 0) {
            return 0;
        }
        M();
        T.b bVar = this.f2432j;
        boolean z2 = !this.f2436n;
        return E.b(b3, bVar, O(z2), N(z2), this, this.f2436n);
    }

    public final void M() {
        if (this.f2431i == null) {
            this.f2431i = new b(6);
        }
    }

    public final View N(boolean z2) {
        return this.f2434l ? P(0, p(), z2) : P(p() - 1, -1, z2);
    }

    public final View O(boolean z2) {
        return this.f2434l ? P(p() - 1, -1, z2) : P(0, p(), z2);
    }

    public final View P(int i3, int i4, boolean z2) {
        M();
        int i5 = z2 ? 24579 : 320;
        return this.f2430h == 0 ? this.f1907c.c(i3, i4, i5, 320) : this.f1908d.c(i3, i4, i5, 320);
    }

    public void Q(boolean z2) {
        a(null);
        if (this.f2435m == z2) {
            return;
        }
        this.f2435m = z2;
        H();
    }

    @Override // Y.s
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2437o != null || (recyclerView = this.f1906b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // Y.s
    public final boolean b() {
        return this.f2430h == 0;
    }

    @Override // Y.s
    public final boolean c() {
        return this.f2430h == 1;
    }

    @Override // Y.s
    public final int f(B b3) {
        return J(b3);
    }

    @Override // Y.s
    public final void g(B b3) {
        K(b3);
    }

    @Override // Y.s
    public final int h(B b3) {
        return L(b3);
    }

    @Override // Y.s
    public final int i(B b3) {
        return J(b3);
    }

    @Override // Y.s
    public final void j(B b3) {
        K(b3);
    }

    @Override // Y.s
    public final int k(B b3) {
        return L(b3);
    }

    @Override // Y.s
    public t l() {
        return new t(-2, -2);
    }

    @Override // Y.s
    public final boolean y() {
        return true;
    }

    @Override // Y.s
    public final void z(RecyclerView recyclerView) {
    }
}
