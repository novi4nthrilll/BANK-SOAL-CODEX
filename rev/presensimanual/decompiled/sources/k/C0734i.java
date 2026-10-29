package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import id.go.bangkalankab.simpeg.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: k.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0734i implements p032j.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f5164d;
    public Context e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p032j.i f5165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LayoutInflater f5166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p032j.o f5167h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ActionMenuView f5169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0732h f5170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f5171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5178s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0728f f5180u;
    public C0728f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public E0.e f5181w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0730g f5182x;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5168i = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SparseBooleanArray f5179t = new SparseBooleanArray();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p006b1.c f5183y = new p006b1.c(this);

    public C0734i(Context context) {
        this.f5164d = context;
        this.f5166g = LayoutInflater.from(context);
    }

    @Override // p032j.p
    public final void a(p032j.i iVar, boolean z2) {
        g();
        C0728f c0728f = this.v;
        if (c0728f != null && c0728f.b()) {
            c0728f.f4969i.dismiss();
        }
        p032j.o oVar = this.f5167h;
        if (oVar != null) {
            oVar.a(iVar, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b(p032j.j jVar, View view, ActionMenuView actionMenuView) {
        p032j.q qVar;
        View view2 = jVar.f4959z;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 == null || jVar.c()) {
            if (view instanceof p032j.q) {
                qVar = (p032j.q) view;
            } else {
                qVar = (p032j.q) this.f5166g.inflate(this.f5168i, (ViewGroup) actionMenuView, false);
            }
            qVar.c(jVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) qVar;
            actionMenuItemView.setItemInvoker(this.f5169j);
            if (this.f5182x == null) {
                this.f5182x = new C0730g(this);
            }
            actionMenuItemView.setPopupCallback(this.f5182x);
            view2 = (View) qVar;
        }
        view2.setVisibility(jVar.f4935B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0738k)) {
            view2.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view2;
    }

    @Override // p032j.p
    public final void c(Context context, p032j.i iVar) {
        this.e = context;
        LayoutInflater.from(context);
        this.f5165f = iVar;
        Resources resources = context.getResources();
        if (!this.f5174o) {
            this.f5173n = true;
        }
        int i3 = 2;
        this.f5175p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i5 > 720) || (i4 > 720 && i5 > 960))) {
            i3 = 5;
        } else if (i4 >= 500 || ((i4 > 640 && i5 > 480) || (i4 > 480 && i5 > 640))) {
            i3 = 4;
        } else if (i4 >= 360) {
            i3 = 3;
        }
        this.f5177r = i3;
        int measuredWidth = this.f5175p;
        if (this.f5173n) {
            if (this.f5170k == null) {
                C0732h c0732h = new C0732h(this, this.f5164d);
                this.f5170k = c0732h;
                if (this.f5172m) {
                    c0732h.setImageDrawable(this.f5171l);
                    this.f5171l = null;
                    this.f5172m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f5170k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f5170k.getMeasuredWidth();
        } else {
            this.f5170k = null;
        }
        this.f5176q = measuredWidth;
        float f3 = resources.getDisplayMetrics().density;
    }

    @Override // p032j.p
    public final boolean d() {
        ArrayList arrayListK;
        int size;
        int i3;
        boolean z2;
        p032j.i iVar = this.f5165f;
        if (iVar != null) {
            arrayListK = iVar.k();
            size = arrayListK.size();
        } else {
            arrayListK = null;
            size = 0;
        }
        int i4 = this.f5177r;
        int i5 = this.f5176q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = this.f5169j;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z2 = true;
            if (i6 >= size) {
                break;
            }
            p032j.j jVar = (p032j.j) arrayListK.get(i6);
            int i9 = jVar.f4958y;
            if ((i9 & 2) == 2) {
                i7++;
            } else if ((i9 & 1) == 1) {
                i8++;
            } else {
                z3 = true;
            }
            if (this.f5178s && jVar.f4935B) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f5173n && (z3 || i8 + i7 > i4)) {
            i4--;
        }
        int i10 = i4 - i7;
        SparseBooleanArray sparseBooleanArray = this.f5179t;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            p032j.j jVar2 = (p032j.j) arrayListK.get(i11);
            int i13 = jVar2.f4958y;
            boolean z4 = (i13 & 2) == i3;
            int i14 = jVar2.f4937b;
            if (z4) {
                View viewB = b(jVar2, null, actionMenuView);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z2);
                }
                jVar2.f(z2);
            } else {
                if ((i13 & 1) == z2) {
                    boolean z5 = sparseBooleanArray.get(i14);
                    boolean z6 = (i10 > 0 || z5) && i5 > 0;
                    if (z6) {
                        View viewB2 = b(jVar2, null, actionMenuView);
                        viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewB2.getMeasuredWidth();
                        i5 -= measuredWidth2;
                        if (i12 == 0) {
                            i12 = measuredWidth2;
                        }
                        z6 &= i5 + i12 > 0;
                    }
                    if (z6 && i14 != 0) {
                        sparseBooleanArray.put(i14, true);
                    } else if (z5) {
                        sparseBooleanArray.put(i14, false);
                        for (int i15 = 0; i15 < i11; i15++) {
                            p032j.j jVar3 = (p032j.j) arrayListK.get(i15);
                            if (jVar3.f4937b == i14) {
                                if (jVar3.d()) {
                                    i10++;
                                }
                                jVar3.f(false);
                            }
                        }
                    }
                    if (z6) {
                        i10--;
                    }
                    jVar2.f(z6);
                } else {
                    jVar2.f(false);
                }
                i11++;
                i3 = 2;
                z2 = true;
            }
            i11++;
            i3 = 2;
            z2 = true;
        }
        return true;
    }

    @Override // p032j.p
    public final boolean e(p032j.j jVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p032j.p
    public final void f() {
        int i3;
        ActionMenuView actionMenuView = this.f5169j;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (actionMenuView != null) {
            p032j.i iVar = this.f5165f;
            if (iVar != null) {
                iVar.i();
                ArrayList arrayListK = this.f5165f.k();
                int size = arrayListK.size();
                i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    p032j.j jVar = (p032j.j) arrayListK.get(i4);
                    if (jVar.d()) {
                        View childAt = actionMenuView.getChildAt(i3);
                        p032j.j itemData = childAt instanceof p032j.q ? ((p032j.q) childAt).getItemData() : null;
                        View viewB = b(jVar, childAt, actionMenuView);
                        if (jVar != itemData) {
                            viewB.setPressed(false);
                            viewB.jumpDrawablesToCurrentState();
                        }
                        if (viewB != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewB.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewB);
                            }
                            this.f5169j.addView(viewB, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i3) == this.f5170k) {
                    i3++;
                } else {
                    actionMenuView.removeViewAt(i3);
                }
            }
        }
        this.f5169j.requestLayout();
        p032j.i iVar2 = this.f5165f;
        if (iVar2 != null) {
            iVar2.i();
            ArrayList arrayList2 = iVar2.f4922i;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((p032j.j) arrayList2.get(i5)).getClass();
            }
        }
        p032j.i iVar3 = this.f5165f;
        if (iVar3 != null) {
            iVar3.i();
            arrayList = iVar3.f4923j;
        }
        if (this.f5173n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((p032j.j) arrayList.get(0)).f4935B;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f5170k == null) {
                this.f5170k = new C0732h(this, this.f5164d);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f5170k.getParent();
            if (viewGroup2 != this.f5169j) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f5170k);
                }
                ActionMenuView actionMenuView2 = this.f5169j;
                C0732h c0732h = this.f5170k;
                actionMenuView2.getClass();
                C0738k c0738kH = ActionMenuView.h();
                c0738kH.f5207a = true;
                actionMenuView2.addView(c0732h, c0738kH);
            }
        } else {
            C0732h c0732h2 = this.f5170k;
            if (c0732h2 != null) {
                ViewParent parent = c0732h2.getParent();
                ActionMenuView actionMenuView3 = this.f5169j;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f5170k);
                }
            }
        }
        this.f5169j.setOverflowReserved(this.f5173n);
    }

    public final boolean g() {
        ActionMenuView actionMenuView;
        E0.e eVar = this.f5181w;
        if (eVar != null && (actionMenuView = this.f5169j) != null) {
            actionMenuView.removeCallbacks(eVar);
            this.f5181w = null;
            return true;
        }
        C0728f c0728f = this.f5180u;
        if (c0728f == null) {
            return false;
        }
        if (c0728f.b()) {
            c0728f.f4969i.dismiss();
        }
        return true;
    }

    public final boolean h() {
        p032j.i iVar;
        if (!this.f5173n) {
            return false;
        }
        C0728f c0728f = this.f5180u;
        if ((c0728f != null && c0728f.b()) || (iVar = this.f5165f) == null || this.f5169j == null || this.f5181w != null) {
            return false;
        }
        iVar.i();
        if (iVar.f4923j.isEmpty()) {
            return false;
        }
        E0.e eVar = new E0.e(this, new C0728f(this, this.e, this.f5165f, this.f5170k), 10, false);
        this.f5181w = eVar;
        this.f5169j.post(eVar);
        return true;
    }

    @Override // p032j.p
    public final boolean i(p032j.j jVar) {
        return false;
    }

    @Override // p032j.p
    public final void j(p032j.o oVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p032j.p
    public final boolean k(p032j.t tVar) {
        boolean z2;
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        p032j.t tVar2 = tVar;
        while (true) {
            p032j.i iVar = tVar2.v;
            if (iVar == this.f5165f) {
                break;
            }
            tVar2 = (p032j.t) iVar;
        }
        ActionMenuView actionMenuView = this.f5169j;
        View view = null;
        view = null;
        if (actionMenuView != null) {
            int childCount = actionMenuView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = actionMenuView.getChildAt(i3);
                if ((childAt instanceof p032j.q) && ((p032j.q) childAt).getItemData() == tVar2.f4989w) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        tVar.f4989w.getClass();
        int size = tVar.f4919f.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = tVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i4++;
        }
        C0728f c0728f = new C0728f(this, this.e, tVar, view);
        this.v = c0728f;
        c0728f.f4967g = z2;
        p032j.k kVar = c0728f.f4969i;
        if (kVar != null) {
            kVar.o(z2);
        }
        C0728f c0728f2 = this.v;
        if (!c0728f2.b()) {
            if (c0728f2.e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0728f2.d(0, 0, false, false);
        }
        p032j.o oVar = this.f5167h;
        if (oVar != null) {
            oVar.b(tVar);
        }
        return true;
    }
}
