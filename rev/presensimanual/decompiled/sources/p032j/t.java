package p032j;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class t extends i implements SubMenu {
    public final i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f4989w;

    public t(Context context, i iVar, j jVar) {
        super(context);
        this.v = iVar;
        this.f4989w = jVar;
    }

    @Override // p032j.i
    public final boolean d(j jVar) {
        return this.v.d(jVar);
    }

    @Override // p032j.i
    public final boolean e(i iVar, MenuItem menuItem) {
        return super.e(iVar, menuItem) || this.v.e(iVar, menuItem);
    }

    @Override // p032j.i
    public final boolean f(j jVar) {
        return this.v.f(jVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f4989w;
    }

    @Override // p032j.i
    public final i j() {
        return this.v.j();
    }

    @Override // p032j.i
    public final boolean l() {
        return this.v.l();
    }

    @Override // p032j.i
    public final boolean m() {
        return this.v.m();
    }

    @Override // p032j.i
    public final boolean n() {
        return this.v.n();
    }

    @Override // p032j.i, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.v.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        q(0, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        q(0, charSequence, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        q(0, null, 0, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f4989w.setIcon(drawable);
        return this;
    }

    @Override // p032j.i, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.v.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i3) {
        q(0, null, i3, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i3) {
        q(i3, null, 0, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i3) {
        this.f4989w.setIcon(i3);
        return this;
    }
}
