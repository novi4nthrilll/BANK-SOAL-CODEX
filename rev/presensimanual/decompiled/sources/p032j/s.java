package p032j;

import B.D;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import id.go.bangkalankab.simpeg.R;
import java.lang.reflect.Field;
import k.C0745n0;
import k.C0747o0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f4972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f4973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f4976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0747o0 f4977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f4978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f4979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public l f4980n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f4981o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f4982p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o f4983q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewTreeObserver f4984r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4985s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4986t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4987u;
    public int v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4988w;

    public s(int i3, Context context, View view, i iVar, boolean z2) {
        int i4 = 1;
        this.f4978l = new c(this, i4);
        this.f4979m = new d(this, i4);
        this.e = context;
        this.f4972f = iVar;
        this.f4974h = z2;
        this.f4973g = new g(iVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f4976j = i3;
        Resources resources = context.getResources();
        this.f4975i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4981o = view;
        this.f4977k = new C0747o0(context, i3);
        iVar.b(this, context);
    }

    @Override // p032j.p
    public final void a(i iVar, boolean z2) {
        if (iVar != this.f4972f) {
            return;
        }
        dismiss();
        o oVar = this.f4983q;
        if (oVar != null) {
            oVar.a(iVar, z2);
        }
    }

    @Override // p032j.r
    public final void b() {
        View view;
        if (g()) {
            return;
        }
        if (this.f4985s || (view = this.f4981o) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f4982p = view;
        C0747o0 c0747o0 = this.f4977k;
        c0747o0.f5206y.setOnDismissListener(this);
        c0747o0.f5198p = this;
        c0747o0.f5205x = true;
        c0747o0.f5206y.setFocusable(true);
        View view2 = this.f4982p;
        boolean z2 = this.f4984r == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4984r = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4978l);
        }
        view2.addOnAttachStateChangeListener(this.f4979m);
        c0747o0.f5197o = view2;
        c0747o0.f5195m = this.v;
        boolean z3 = this.f4986t;
        Context context = this.e;
        g gVar = this.f4973g;
        if (!z3) {
            this.f4987u = k.m(gVar, context, this.f4975i);
            this.f4986t = true;
        }
        int i3 = this.f4987u;
        Drawable background = c0747o0.f5206y.getBackground();
        if (background != null) {
            Rect rect = c0747o0.v;
            background.getPadding(rect);
            c0747o0.f5189g = rect.left + rect.right + i3;
        } else {
            c0747o0.f5189g = i3;
        }
        c0747o0.f5206y.setInputMethodMode(2);
        Rect rect2 = this.f4960d;
        c0747o0.f5204w = rect2 != null ? new Rect(rect2) : null;
        c0747o0.b();
        C0745n0 c0745n0 = c0747o0.f5188f;
        c0745n0.setOnKeyListener(this);
        if (this.f4988w) {
            i iVar = this.f4972f;
            if (iVar.f4925l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0745n0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(iVar.f4925l);
                }
                frameLayout.setEnabled(false);
                c0745n0.addHeaderView(frameLayout, null, false);
            }
        }
        c0747o0.c(gVar);
        c0747o0.b();
    }

    @Override // p032j.p
    public final boolean d() {
        return false;
    }

    @Override // p032j.r
    public final void dismiss() {
        if (g()) {
            this.f4977k.dismiss();
        }
    }

    @Override // p032j.p
    public final void f() {
        this.f4986t = false;
        g gVar = this.f4973g;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // p032j.r
    public final boolean g() {
        return !this.f4985s && this.f4977k.f5206y.isShowing();
    }

    @Override // p032j.r
    public final ListView h() {
        return this.f4977k.f5188f;
    }

    @Override // p032j.p
    public final void j(o oVar) {
        this.f4983q = oVar;
    }

    @Override // p032j.p
    public final boolean k(t tVar) {
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f4976j, this.e, this.f4982p, tVar, this.f4974h);
            o oVar = this.f4983q;
            nVar.f4968h = oVar;
            k kVar = nVar.f4969i;
            if (kVar != null) {
                kVar.j(oVar);
            }
            boolean zU = k.u(tVar);
            nVar.f4967g = zU;
            k kVar2 = nVar.f4969i;
            if (kVar2 != null) {
                kVar2.o(zU);
            }
            nVar.f4970j = this.f4980n;
            this.f4980n = null;
            this.f4972f.c(false);
            C0747o0 c0747o0 = this.f4977k;
            int width = c0747o0.f5190h;
            int i3 = !c0747o0.f5192j ? 0 : c0747o0.f5191i;
            int i4 = this.v;
            View view = this.f4981o;
            Field field = D.f41a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                width += this.f4981o.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.e != null) {
                    nVar.d(width, i3, true, true);
                }
            }
            o oVar2 = this.f4983q;
            if (oVar2 != null) {
                oVar2.b(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // p032j.k
    public final void n(View view) {
        this.f4981o = view;
    }

    @Override // p032j.k
    public final void o(boolean z2) {
        this.f4973g.f4910f = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4985s = true;
        this.f4972f.c(true);
        ViewTreeObserver viewTreeObserver = this.f4984r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4984r = this.f4982p.getViewTreeObserver();
            }
            this.f4984r.removeGlobalOnLayoutListener(this.f4978l);
            this.f4984r = null;
        }
        this.f4982p.removeOnAttachStateChangeListener(this.f4979m);
        l lVar = this.f4980n;
        if (lVar != null) {
            lVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p032j.k
    public final void p(int i3) {
        this.v = i3;
    }

    @Override // p032j.k
    public final void q(int i3) {
        this.f4977k.f5190h = i3;
    }

    @Override // p032j.k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4980n = (l) onDismissListener;
    }

    @Override // p032j.k
    public final void s(boolean z2) {
        this.f4988w = z2;
    }

    @Override // p032j.k
    public final void t(int i3) {
        C0747o0 c0747o0 = this.f4977k;
        c0747o0.f5191i = i3;
        c0747o0.f5192j = true;
    }

    @Override // p032j.k
    public final void l(i iVar) {
    }
}
