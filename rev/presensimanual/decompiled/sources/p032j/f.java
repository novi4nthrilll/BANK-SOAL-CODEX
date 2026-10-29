package p032j;

import B.D;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.y;
import id.go.bangkalankab.simpeg.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.AbstractC0739k0;
import k.AbstractC0741l0;
import k.C0745n0;
import k.C0747o0;
import k.C0753s;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ViewTreeObserver f4886A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public l f4887B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f4888C;
    public final Context e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f4892i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f4895l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f4896m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f4900q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f4901r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4902s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4903t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4904u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4905w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4907y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f4908z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f4893j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f4894k = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y f4897n = new y(7, this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4898o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4899p = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4906x = false;

    public f(Context context, View view, int i3, boolean z2) {
        int i4 = 0;
        this.f4895l = new c(this, i4);
        this.f4896m = new d(this, i4);
        this.e = context;
        this.f4900q = view;
        this.f4890g = i3;
        this.f4891h = z2;
        Field field = D.f41a;
        this.f4902s = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f4889f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4892i = new Handler();
    }

    @Override // p032j.p
    public final void a(i iVar, boolean z2) {
        ArrayList arrayList = this.f4894k;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (iVar == ((e) arrayList.get(i3)).f4884b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i4 = i3 + 1;
        if (i4 < arrayList.size()) {
            ((e) arrayList.get(i4)).f4884b.c(false);
        }
        e eVar = (e) arrayList.remove(i3);
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = eVar.f4884b.f4931r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        boolean z3 = this.f4888C;
        C0747o0 c0747o0 = eVar.f4883a;
        if (z3) {
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC0739k0.b(c0747o0.f5206y, null);
            }
            c0747o0.f5206y.setAnimationStyle(0);
        }
        c0747o0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f4902s = ((e) arrayList.get(size2 - 1)).f4885c;
        } else {
            View view = this.f4900q;
            Field field = D.f41a;
            this.f4902s = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((e) arrayList.get(0)).f4884b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o oVar = this.f4908z;
        if (oVar != null) {
            oVar.a(iVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f4886A;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f4886A.removeGlobalOnLayoutListener(this.f4895l);
            }
            this.f4886A = null;
        }
        this.f4901r.removeOnAttachStateChangeListener(this.f4896m);
        this.f4887B.onDismiss();
    }

    @Override // p032j.r
    public final void b() {
        if (g()) {
            return;
        }
        ArrayList arrayList = this.f4893j;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((i) it.next());
        }
        arrayList.clear();
        View view = this.f4900q;
        this.f4901r = view;
        if (view != null) {
            boolean z2 = this.f4886A == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f4886A = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4895l);
            }
            this.f4901r.addOnAttachStateChangeListener(this.f4896m);
        }
    }

    @Override // p032j.p
    public final boolean d() {
        return false;
    }

    @Override // p032j.r
    public final void dismiss() {
        ArrayList arrayList = this.f4894k;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                e eVar = eVarArr[i3];
                if (eVar.f4883a.f5206y.isShowing()) {
                    eVar.f4883a.dismiss();
                }
            }
        }
    }

    @Override // p032j.p
    public final void f() {
        Iterator it = this.f4894k.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((e) it.next()).f4883a.f5188f.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((g) adapter).notifyDataSetChanged();
        }
    }

    @Override // p032j.r
    public final boolean g() {
        ArrayList arrayList = this.f4894k;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).f4883a.f5206y.isShowing();
    }

    @Override // p032j.r
    public final ListView h() {
        ArrayList arrayList = this.f4894k;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) arrayList.get(arrayList.size() - 1)).f4883a.f5188f;
    }

    @Override // p032j.p
    public final void j(o oVar) {
        this.f4908z = oVar;
    }

    @Override // p032j.p
    public final boolean k(t tVar) {
        for (e eVar : this.f4894k) {
            if (tVar == eVar.f4884b) {
                eVar.f4883a.f5188f.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        l(tVar);
        o oVar = this.f4908z;
        if (oVar != null) {
            oVar.b(tVar);
        }
        return true;
    }

    @Override // p032j.k
    public final void l(i iVar) {
        iVar.b(this, this.e);
        if (g()) {
            v(iVar);
        } else {
            this.f4893j.add(iVar);
        }
    }

    @Override // p032j.k
    public final void n(View view) {
        if (this.f4900q != view) {
            this.f4900q = view;
            int i3 = this.f4898o;
            Field field = D.f41a;
            this.f4899p = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // p032j.k
    public final void o(boolean z2) {
        this.f4906x = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f4894k;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i3);
            if (!eVar.f4883a.f5206y.isShowing()) {
                break;
            } else {
                i3++;
            }
        }
        if (eVar != null) {
            eVar.f4884b.c(false);
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
        if (this.f4898o != i3) {
            this.f4898o = i3;
            View view = this.f4900q;
            Field field = D.f41a;
            this.f4899p = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // p032j.k
    public final void q(int i3) {
        this.f4903t = true;
        this.v = i3;
    }

    @Override // p032j.k
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4887B = (l) onDismissListener;
    }

    @Override // p032j.k
    public final void s(boolean z2) {
        this.f4907y = z2;
    }

    @Override // p032j.k
    public final void t(int i3) {
        this.f4904u = true;
        this.f4905w = i3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    public final void v(i iVar) {
        View childAt;
        e eVar;
        char c3;
        int i3;
        int i4;
        int width;
        MenuItem item;
        g gVar;
        int headersCount;
        int i5;
        int firstVisiblePosition;
        Context context = this.e;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        g gVar2 = new g(iVar, layoutInflaterFrom, this.f4891h, R.layout.abc_cascading_menu_item_layout);
        if (!g() && this.f4906x) {
            gVar2.f4910f = true;
        } else if (g()) {
            gVar2.f4910f = k.u(iVar);
        }
        int iM = k.m(gVar2, context, this.f4889f);
        C0747o0 c0747o0 = new C0747o0(context, this.f4890g);
        C0753s c0753s = c0747o0.f5206y;
        c0747o0.f5228C = this.f4897n;
        c0747o0.f5198p = this;
        c0753s.setOnDismissListener(this);
        c0747o0.f5197o = this.f4900q;
        c0747o0.f5195m = this.f4899p;
        c0747o0.f5205x = true;
        c0753s.setFocusable(true);
        c0753s.setInputMethodMode(2);
        c0747o0.c(gVar2);
        Drawable background = c0753s.getBackground();
        if (background != null) {
            Rect rect = c0747o0.v;
            background.getPadding(rect);
            c0747o0.f5189g = rect.left + rect.right + iM;
        } else {
            c0747o0.f5189g = iM;
        }
        c0747o0.f5195m = this.f4899p;
        ArrayList arrayList = this.f4894k;
        if (arrayList.size() > 0) {
            eVar = (e) arrayList.get(arrayList.size() - 1);
            i iVar2 = eVar.f4884b;
            int size = iVar2.f4919f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    item = null;
                    break;
                }
                item = iVar2.getItem(i6);
                if (item.hasSubMenu() && iVar == item.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (item == null) {
                childAt = null;
            } else {
                C0745n0 c0745n0 = eVar.f4883a.f5188f;
                ListAdapter adapter = c0745n0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    gVar = (g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gVar = (g) adapter;
                    headersCount = 0;
                }
                int count = gVar.getCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= count) {
                        i5 = -1;
                        i7 = -1;
                        break;
                    } else {
                        if (item == gVar.getItem(i7)) {
                            i5 = -1;
                            break;
                        }
                        i7++;
                    }
                }
                if (i7 != i5 && (firstVisiblePosition = (i7 + headersCount) - c0745n0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0745n0.getChildCount()) {
                    childAt = c0745n0.getChildAt(firstVisiblePosition);
                } else {
                    childAt = null;
                }
            }
        } else {
            childAt = null;
            eVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C0747o0.f5227D;
                if (method != null) {
                    try {
                        method.invoke(c0753s, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                AbstractC0741l0.a(c0753s, false);
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 23) {
                AbstractC0739k0.a(c0753s, null);
            }
            C0745n0 c0745n1 = ((e) arrayList.get(arrayList.size() - 1)).f4883a.f5188f;
            int[] iArr = new int[2];
            c0745n1.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.f4901r.getWindowVisibleDisplayFrame(rect2);
            int i9 = (this.f4902s != 1 ? iArr[0] - iM >= 0 : (c0745n1.getWidth() + iArr[0]) + iM > rect2.right) ? 0 : 1;
            boolean z2 = i9 == 1;
            this.f4902s = i9;
            if (i8 >= 26) {
                c0747o0.f5197o = childAt;
                i4 = 0;
                i3 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f4900q.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f4899p & 7) == 5) {
                    c3 = 0;
                    iArr2[0] = this.f4900q.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                } else {
                    c3 = 0;
                }
                i3 = iArr3[c3] - iArr2[c3];
                i4 = iArr3[1] - iArr2[1];
            }
            if ((this.f4899p & 5) == 5) {
                width = z2 ? i3 + iM : i3 - childAt.getWidth();
            } else {
                width = z2 ? i3 + childAt.getWidth() : i3 - iM;
            }
            c0747o0.f5190h = width;
            c0747o0.f5194l = true;
            c0747o0.f5193k = true;
            c0747o0.f5191i = i4;
            c0747o0.f5192j = true;
        } else {
            if (this.f4903t) {
                c0747o0.f5190h = this.v;
            }
            if (this.f4904u) {
                c0747o0.f5191i = this.f4905w;
                c0747o0.f5192j = true;
            }
            Rect rect3 = this.f4960d;
            c0747o0.f5204w = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new e(c0747o0, iVar, this.f4902s));
        c0747o0.b();
        C0745n0 c0745n2 = c0747o0.f5188f;
        c0745n2.setOnKeyListener(this);
        if (eVar == null && this.f4907y && iVar.f4925l != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0745n2, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(iVar.f4925l);
            c0745n2.addHeaderView(frameLayout, null, false);
            c0747o0.b();
        }
    }
}
