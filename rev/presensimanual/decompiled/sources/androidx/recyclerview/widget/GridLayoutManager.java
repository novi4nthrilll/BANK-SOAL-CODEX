package androidx.recyclerview.widget;

import A0.f;
import Y.B;
import Y.C0115j;
import Y.s;
import Y.t;
import Y.y;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f2429q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f2428p = -1;
        new SparseIntArray();
        new SparseIntArray();
        f fVar = new f();
        this.f2429q = fVar;
        new Rect();
        int i5 = s.w(context, attributeSet, i3, i4).f1895c;
        if (i5 == this.f2428p) {
            return;
        }
        if (i5 < 1) {
            throw new IllegalArgumentException(I.f("Span count should be at least 1. Provided ", i5));
        }
        this.f2428p = i5;
        ((SparseIntArray) fVar.e).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(y yVar, B b3, int i3) {
        boolean z2 = b3.f1813c;
        f fVar = this.f2429q;
        if (!z2) {
            int i4 = this.f2428p;
            fVar.getClass();
            return f.s(i3, i4);
        }
        RecyclerView recyclerView = yVar.f1919f;
        if (i3 < 0 || i3 >= recyclerView.f2463a0.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + recyclerView.f2463a0.a() + recyclerView.h());
        }
        int iA = !recyclerView.f2463a0.f1813c ? i3 : recyclerView.f2469f.A(i3, 0);
        if (iA != -1) {
            int i5 = this.f2428p;
            fVar.getClass();
            return f.s(iA, i5);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
        return 0;
    }

    @Override // Y.s
    public final boolean d(t tVar) {
        return tVar instanceof C0115j;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, Y.s
    public final t l() {
        return this.f2430h == 0 ? new C0115j(-2, -1) : new C0115j(-1, -2);
    }

    @Override // Y.s
    public final t m(Context context, AttributeSet attributeSet) {
        return new C0115j(context, attributeSet);
    }

    @Override // Y.s
    public final t n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0115j((ViewGroup.MarginLayoutParams) layoutParams) : new C0115j(layoutParams);
    }

    @Override // Y.s
    public final int q(y yVar, B b3) {
        if (this.f2430h == 1) {
            return this.f2428p;
        }
        if (b3.a() < 1) {
            return 0;
        }
        return R(yVar, b3, b3.a() - 1) + 1;
    }

    @Override // Y.s
    public final int x(y yVar, B b3) {
        if (this.f2430h == 0) {
            return this.f2428p;
        }
        if (b3.a() < 1) {
            return 0;
        }
        return R(yVar, b3, b3.a() - 1) + 1;
    }
}
