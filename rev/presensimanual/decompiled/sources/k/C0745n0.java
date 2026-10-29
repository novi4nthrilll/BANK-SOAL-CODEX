package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: renamed from: k.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0745n0 extends X {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f5220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f5221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC0737j0 f5222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p032j.j f5223s;

    public C0745n0(Context context, boolean z2) {
        super(context, z2);
        if (1 == AbstractC0743m0.a(context.getResources().getConfiguration())) {
            this.f5220p = 21;
            this.f5221q = 22;
        } else {
            this.f5220p = 22;
            this.f5221q = 21;
        }
    }

    @Override // k.X, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        p032j.g gVar;
        int headersCount;
        int iPointToPosition;
        int i3;
        if (this.f5222r != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                gVar = (p032j.g) headerViewListAdapter.getWrappedAdapter();
            } else {
                gVar = (p032j.g) adapter;
                headersCount = 0;
            }
            p032j.j item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = iPointToPosition - headersCount) < 0 || i3 >= gVar.getCount()) ? null : gVar.getItem(i3);
            p032j.j jVar = this.f5223s;
            if (jVar != item) {
                p032j.i iVar = gVar.f4909d;
                if (jVar != null) {
                    this.f5222r.i(iVar, jVar);
                }
                this.f5223s = item;
                if (item != null) {
                    this.f5222r.a(iVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.f5220p) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i3 != this.f5221q) {
            return super.onKeyDown(i3, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (p032j.g) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (p032j.g) adapter).f4909d.c(false);
        return true;
    }

    public void setHoverListener(InterfaceC0737j0 interfaceC0737j0) {
        this.f5222r = interfaceC0737j0;
    }

    @Override // k.X, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
