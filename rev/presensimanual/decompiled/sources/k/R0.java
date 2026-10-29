package k;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class R0 implements p032j.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p032j.i f5083d;
    public p032j.j e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Toolbar f5084f;

    public R0(Toolbar toolbar) {
        this.f5084f = toolbar;
    }

    @Override // p032j.p
    public final void c(Context context, p032j.i iVar) {
        p032j.j jVar;
        p032j.i iVar2 = this.f5083d;
        if (iVar2 != null && (jVar = this.e) != null) {
            iVar2.d(jVar);
        }
        this.f5083d = iVar;
    }

    @Override // p032j.p
    public final boolean d() {
        return false;
    }

    @Override // p032j.p
    public final boolean e(p032j.j jVar) {
        Toolbar toolbar = this.f5084f;
        toolbar.c();
        ViewParent parent = toolbar.f2154k.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f2154k);
            }
            toolbar.addView(toolbar.f2154k);
        }
        View view = jVar.f4959z;
        if (view == null) {
            view = null;
        }
        toolbar.f2155l = view;
        this.e = jVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f2155l);
            }
            S0 s0G = Toolbar.g();
            s0G.f5085a = (toolbar.f2160q & 112) | 8388611;
            s0G.f5086b = 2;
            toolbar.f2155l.setLayoutParams(s0G);
            toolbar.addView(toolbar.f2155l);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((S0) childAt.getLayoutParams()).f5086b != 2 && childAt != toolbar.f2148d) {
                toolbar.removeViewAt(childCount);
                toolbar.f2137H.add(childAt);
            }
        }
        toolbar.requestLayout();
        jVar.f4935B = true;
        jVar.f4948n.o(false);
        KeyEvent.Callback callback = toolbar.f2155l;
        if (callback instanceof p028i.a) {
            SearchView searchView = (SearchView) ((p028i.a) callback);
            if (!searchView.f2072c0) {
                searchView.f2072c0 = true;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f2078s;
                int imeOptions = searchAutoComplete.getImeOptions();
                searchView.f2073d0 = imeOptions;
                searchAutoComplete.setImeOptions(imeOptions | 33554432);
                searchAutoComplete.setText("");
                searchView.setIconified(false);
            }
        }
        toolbar.t();
        return true;
    }

    @Override // p032j.p
    public final void f() {
        if (this.e != null) {
            p032j.i iVar = this.f5083d;
            if (iVar != null) {
                int size = iVar.f4919f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f5083d.getItem(i3) == this.e) {
                        return;
                    }
                }
            }
            i(this.e);
        }
    }

    @Override // p032j.p
    public final boolean i(p032j.j jVar) {
        Toolbar toolbar = this.f5084f;
        KeyEvent.Callback callback = toolbar.f2155l;
        if (callback instanceof p028i.a) {
            SearchView searchView = (SearchView) ((p028i.a) callback);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f2078s;
            searchAutoComplete.setText("");
            searchAutoComplete.setSelection(searchAutoComplete.length());
            searchView.f2071b0 = "";
            searchView.clearFocus();
            searchView.u(true);
            searchAutoComplete.setImeOptions(searchView.f2073d0);
            searchView.f2072c0 = false;
        }
        toolbar.removeView(toolbar.f2155l);
        toolbar.removeView(toolbar.f2154k);
        toolbar.f2155l = null;
        ArrayList arrayList = toolbar.f2137H;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.e = null;
        toolbar.requestLayout();
        jVar.f4935B = false;
        jVar.f4948n.o(false);
        toolbar.t();
        return true;
    }

    @Override // p032j.p
    public final boolean k(p032j.t tVar) {
        return false;
    }

    @Override // p032j.p
    public final void a(p032j.i iVar, boolean z2) {
    }
}
