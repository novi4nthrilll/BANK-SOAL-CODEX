package p032j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p013d1.AbstractC0520s3;
import p013d1.G2;
import u.a;

/* JADX INFO: loaded from: classes.dex */
public final class j implements MenuItem {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f4934A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4939d;
    public CharSequence e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f4940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f4941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f4942h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f4944j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f4946l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f4948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t f4949o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f4950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f4951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f4952r;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f4959z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4943i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4945k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4947m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f4953s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f4954t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4955u = false;
    public boolean v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4956w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4957x = 16;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f4935B = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4958y = 0;

    public j(i iVar, int i3, int i4, int i5, int i6, CharSequence charSequence) {
        this.f4948n = iVar;
        this.f4936a = i4;
        this.f4937b = i3;
        this.f4938c = i5;
        this.f4939d = i6;
        this.e = charSequence;
    }

    public static void a(StringBuilder sb, int i3, int i4, String str) {
        if ((i3 & i4) == i4) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f4956w && (this.f4955u || this.v)) {
            drawable = AbstractC0520s3.d(drawable).mutate();
            if (this.f4955u) {
                a.h(drawable, this.f4953s);
            }
            if (this.v) {
                a.i(drawable, this.f4954t);
            }
            this.f4956w = false;
        }
        return drawable;
    }

    public final boolean c() {
        return ((this.f4958y & 8) == 0 || this.f4959z == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f4958y & 8) == 0) {
            return false;
        }
        if (this.f4959z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4934A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f4948n.d(this);
        }
        return false;
    }

    public final boolean d() {
        return (this.f4957x & 32) == 32;
    }

    public final j e(CharSequence charSequence) {
        this.f4951q = charSequence;
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4934A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f4948n.f(this);
        }
        return false;
    }

    public final void f(boolean z2) {
        if (z2) {
            this.f4957x |= 32;
        } else {
            this.f4957x &= -33;
        }
    }

    public final j g(CharSequence charSequence) {
        this.f4952r = charSequence;
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f4959z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4945k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4944j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4951q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4937b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f4946l;
        if (drawable != null) {
            return b(drawable);
        }
        int i3 = this.f4947m;
        if (i3 == 0) {
            return null;
        }
        Drawable drawableB = G2.b(this.f4948n.f4915a, i3);
        this.f4947m = 0;
        this.f4946l = drawableB;
        return b(drawableB);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4953s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4954t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4941g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f4936a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4943i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4942h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f4938c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f4949o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4940f;
        return charSequence != null ? charSequence : this.e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4952r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f4949o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f4935B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4957x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4957x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4957x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f4957x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i3;
        this.f4959z = view;
        if (view != null && view.getId() == -1 && (i3 = this.f4936a) > 0) {
            view.setId(i3);
        }
        i iVar = this.f4948n;
        iVar.f4924k = true;
        iVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f4944j == c3) {
            return this;
        }
        this.f4944j = Character.toLowerCase(c3);
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i3 = this.f4957x;
        int i4 = (z2 ? 1 : 0) | (i3 & (-2));
        this.f4957x = i4;
        if (i3 != i4) {
            this.f4948n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i3 = this.f4957x;
        if ((i3 & 4) != 0) {
            i iVar = this.f4948n;
            iVar.getClass();
            ArrayList arrayList = iVar.f4919f;
            int size = arrayList.size();
            iVar.s();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar = (j) arrayList.get(i4);
                if (jVar.f4937b == this.f4937b && (jVar.f4957x & 4) != 0 && jVar.isCheckable()) {
                    boolean z3 = jVar == this;
                    int i5 = jVar.f4957x;
                    int i6 = (z3 ? 2 : 0) | (i5 & (-3));
                    jVar.f4957x = i6;
                    if (i5 != i6) {
                        jVar.f4948n.o(false);
                    }
                }
            }
            iVar.r();
        } else {
            int i7 = (i3 & (-3)) | (z2 ? 2 : 0);
            this.f4957x = i7;
            if (i3 != i7) {
                this.f4948n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f4957x |= 16;
        } else {
            this.f4957x &= -17;
        }
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4947m = 0;
        this.f4946l = drawable;
        this.f4956w = true;
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4953s = colorStateList;
        this.f4955u = true;
        this.f4956w = true;
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4954t = mode;
        this.v = true;
        this.f4956w = true;
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4941g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f4942h == c3) {
            return this;
        }
        this.f4942h = c3;
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4934A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4950p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4) {
        this.f4942h = c3;
        this.f4944j = Character.toLowerCase(c4);
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        int i4 = i3 & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f4958y = i3;
        i iVar = this.f4948n;
        iVar.f4924k = true;
        iVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.f4948n.o(false);
        t tVar = this.f4949o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4940f = charSequence;
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i3 = this.f4957x;
        int i4 = (z2 ? 0 : 8) | (i3 & (-9));
        this.f4957x = i4;
        if (i3 != i4) {
            i iVar = this.f4948n;
            iVar.f4921h = true;
            iVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i3) {
        if (this.f4944j == c3 && this.f4945k == i3) {
            return this;
        }
        this.f4944j = Character.toLowerCase(c3);
        this.f4945k = KeyEvent.normalizeMetaState(i3);
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i3) {
        if (this.f4942h == c3 && this.f4943i == i3) {
            return this;
        }
        this.f4942h = c3;
        this.f4943i = KeyEvent.normalizeMetaState(i3);
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.f4942h = c3;
        this.f4943i = KeyEvent.normalizeMetaState(i3);
        this.f4944j = Character.toLowerCase(c4);
        this.f4945k = KeyEvent.normalizeMetaState(i4);
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f4946l = null;
        this.f4947m = i3;
        this.f4956w = true;
        this.f4948n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        setTitle(this.f4948n.f4915a.getString(i3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        int i4;
        Context context = this.f4948n.f4915a;
        View viewInflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) new LinearLayout(context), false);
        this.f4959z = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i4 = this.f4936a) > 0) {
            viewInflate.setId(i4);
        }
        i iVar = this.f4948n;
        iVar.f4924k = true;
        iVar.o(true);
        return this;
    }
}
