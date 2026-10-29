package p028i;

import B.AbstractC0007h;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import p032j.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f4529A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ d f4532D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f4533a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f4542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f4543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public char f4545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4546o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f4547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4548q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4550s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4551t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4552u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f4554x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f4555y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f4556z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f4530B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public PorterDuff.Mode f4531C = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4534b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4535c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4536d = 0;
    public int e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4537f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4538g = true;

    public c(d dVar, Menu menu) {
        this.f4532D = dVar;
        this.f4533a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f4532D.f4560c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z2 = false;
        menuItem.setChecked(this.f4550s).setVisible(this.f4551t).setEnabled(this.f4552u).setCheckable(this.f4549r >= 1).setTitleCondensed(this.f4543l).setIcon(this.f4544m);
        int i3 = this.v;
        if (i3 >= 0) {
            menuItem.setShowAsAction(i3);
        }
        String str = this.f4555y;
        d dVar = this.f4532D;
        if (str != null) {
            if (dVar.f4560c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (dVar.f4561d == null) {
                dVar.f4561d = d.a(dVar.f4560c);
            }
            Object obj = dVar.f4561d;
            String str2 = this.f4555y;
            b bVar = new b();
            bVar.f4527a = obj;
            Class<?> cls = obj.getClass();
            try {
                bVar.f4528b = cls.getMethod(str2, b.f4526c);
                menuItem.setOnMenuItemClickListener(bVar);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.f4549r >= 2 && (menuItem instanceof j)) {
            j jVar = (j) menuItem;
            jVar.f4957x = (jVar.f4957x & (-5)) | 4;
        }
        String str3 = this.f4554x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, d.e, dVar.f4558a));
            z2 = true;
        }
        int i4 = this.f4553w;
        if (i4 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i4);
            }
        }
        CharSequence charSequence = this.f4556z;
        boolean z3 = menuItem instanceof j;
        if (z3) {
            ((j) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0007h.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f4529A;
        if (z3) {
            ((j) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0007h.m(menuItem, charSequence2);
        }
        char c3 = this.f4545n;
        int i5 = this.f4546o;
        if (z3) {
            ((j) menuItem).setAlphabeticShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0007h.g(menuItem, c3, i5);
        }
        char c4 = this.f4547p;
        int i6 = this.f4548q;
        if (z3) {
            ((j) menuItem).setNumericShortcut(c4, i6);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0007h.k(menuItem, c4, i6);
        }
        PorterDuff.Mode mode = this.f4531C;
        if (mode != null) {
            if (z3) {
                ((j) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0007h.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f4530B;
        if (colorStateList != null) {
            if (z3) {
                ((j) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0007h.i(menuItem, colorStateList);
            }
        }
    }
}
