package p032j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f4909d;
    public int e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LayoutInflater f4912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4913i;

    public g(i iVar, LayoutInflater layoutInflater, boolean z2, int i3) {
        this.f4911g = z2;
        this.f4912h = layoutInflater;
        this.f4909d = iVar;
        this.f4913i = i3;
        a();
    }

    public final void a() {
        i iVar = this.f4909d;
        j jVar = iVar.f4932s;
        if (jVar != null) {
            iVar.i();
            ArrayList arrayList = iVar.f4923j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((j) arrayList.get(i3)) == jVar) {
                    this.e = i3;
                    return;
                }
            }
        }
        this.e = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j getItem(int i3) {
        ArrayList arrayListK;
        i iVar = this.f4909d;
        if (this.f4911g) {
            iVar.i();
            arrayListK = iVar.f4923j;
        } else {
            arrayListK = iVar.k();
        }
        int i4 = this.e;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (j) arrayListK.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListK;
        i iVar = this.f4909d;
        if (this.f4911g) {
            iVar.i();
            arrayListK = iVar.f4923j;
        } else {
            arrayListK = iVar.k();
        }
        return this.e < 0 ? arrayListK.size() : arrayListK.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f4912h.inflate(this.f4913i, viewGroup, false);
        }
        int i4 = getItem(i3).f4937b;
        int i5 = i3 - 1;
        int i6 = i5 >= 0 ? getItem(i5).f4937b : i4;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f4909d.l() && i4 != i6) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        q qVar = (q) view;
        if (this.f4910f) {
            listMenuItemView.setForceShowIcon(true);
        }
        qVar.c(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
