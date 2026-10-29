package p032j;

import B.F;
import B.H;
import S.f;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.y;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k.InterfaceC0740l;
import p006b1.c;
import p056r.a;

/* JADX INFO: loaded from: classes.dex */
public class i implements Menu {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f4914u = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f4916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4918d;
    public y e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f4919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f4920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f4922i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f4923j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4924k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f4925l;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f4932s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4926m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4927n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4928o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4929p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f4930q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CopyOnWriteArrayList f4931r = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4933t = false;

    public i(Context context) {
        boolean zB;
        boolean z2 = false;
        this.f4915a = context;
        Resources resources = context.getResources();
        this.f4916b = resources;
        this.f4919f = new ArrayList();
        this.f4920g = new ArrayList();
        this.f4921h = true;
        this.f4922i = new ArrayList();
        this.f4923j = new ArrayList();
        this.f4924k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = H.f44a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB = F.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z2 = true;
            }
        }
        this.f4918d = z2;
    }

    public final j a(int i3, int i4, int i5, CharSequence charSequence) {
        int i6;
        int i7 = ((-65536) & i5) >> 16;
        if (i7 < 0 || i7 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i8 = (f4914u[i7] << 16) | (65535 & i5);
        j jVar = new j(this, i3, i4, i5, i8, charSequence);
        ArrayList arrayList = this.f4919f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((j) arrayList.get(size)).f4939d <= i8) {
                i6 = size + 1;
                arrayList.add(i6, jVar);
                o(true);
                return jVar;
            }
        }
        i6 = 0;
        arrayList.add(i6, jVar);
        o(true);
        return jVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        int i7;
        PackageManager packageManager = this.f4915a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i6 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i8 = 0; i8 < size; i8++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i8);
            int i9 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i9 < 0 ? intent : intentArr[i9]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            j jVarA = a(i3, i4, i5, resolveInfo.loadLabel(packageManager));
            jVarA.setIcon(resolveInfo.loadIcon(packageManager));
            jVarA.f4941g = intent2;
            if (menuItemArr != null && (i7 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i7] = jVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(p pVar, Context context) {
        this.f4931r.add(new WeakReference(pVar));
        pVar.c(context, this);
        this.f4924k = true;
    }

    public final void c(boolean z2) {
        if (this.f4929p) {
            return;
        }
        this.f4929p = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f4931r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.a(this, z2);
            }
        }
        this.f4929p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        j jVar = this.f4932s;
        if (jVar != null) {
            d(jVar);
        }
        this.f4919f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f4925l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(j jVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f4931r;
        boolean zI = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f4932s == jVar) {
            s();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                p pVar = (p) weakReference.get();
                if (pVar != null) {
                    zI = pVar.i(jVar);
                    if (zI) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            r();
            if (zI) {
                this.f4932s = null;
            }
        }
        return zI;
    }

    public boolean e(i iVar, MenuItem menuItem) {
        InterfaceC0740l interfaceC0740l;
        y yVar = this.e;
        if (yVar == null || (interfaceC0740l = ((ActionMenuView) yVar.e).f2031B) == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((c) interfaceC0740l).f2515d).f2139J.e).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((f) it.next()).getClass();
        throw null;
    }

    public boolean f(j jVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f4931r;
        boolean zE = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar != null) {
                zE = pVar.e(jVar);
                if (zE) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        r();
        if (zE) {
            this.f4932s = jVar;
        }
        return zE;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i3) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f4919f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            j jVar = (j) arrayList.get(i4);
            if (jVar.f4936a == i3) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (menuItemFindItem = jVar.f4949o.findItem(i3)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final j g(int i3, KeyEvent keyEvent) {
        ArrayList arrayList = this.f4930q;
        arrayList.clear();
        h(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (j) arrayList.get(0);
        }
        boolean zM = m();
        for (int i4 = 0; i4 < size; i4++) {
            j jVar = (j) arrayList.get(i4);
            char c3 = zM ? jVar.f4944j : jVar.f4942h;
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (zM && c3 == '\b' && i3 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i3) {
        return (MenuItem) this.f4919f.get(i3);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    public final void h(ArrayList arrayList, int i3, KeyEvent keyEvent) {
        boolean zM = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            ArrayList arrayList2 = this.f4919f;
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar = (j) arrayList2.get(i4);
                if (jVar.hasSubMenu()) {
                    jVar.f4949o.h(arrayList, i3, keyEvent);
                }
                char c3 = zM ? jVar.f4944j : jVar.f4942h;
                if ((modifiers & 69647) == ((zM ? jVar.f4945k : jVar.f4943i) & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if (c3 != cArr[0] && c3 != cArr[2]) {
                        if (zM && c3 == '\b') {
                            if (i3 == 67) {
                            }
                        }
                    }
                    if (jVar.isEnabled()) {
                        arrayList.add(jVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f4919f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((j) arrayList.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListK = k();
        if (this.f4924k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f4931r;
            boolean zD = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= pVar.d();
                }
            }
            ArrayList arrayList = this.f4922i;
            ArrayList arrayList2 = this.f4923j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListK.size();
                for (int i3 = 0; i3 < size; i3++) {
                    j jVar = (j) arrayListK.get(i3);
                    if (jVar.d()) {
                        arrayList.add(jVar);
                    } else {
                        arrayList2.add(jVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(k());
            }
            this.f4924k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return g(i3, keyEvent) != null;
    }

    public final ArrayList k() {
        boolean z2 = this.f4921h;
        ArrayList arrayList = this.f4920g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f4919f;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = (j) arrayList2.get(i3);
            if (jVar.isVisible()) {
                arrayList.add(jVar);
            }
        }
        this.f4921h = false;
        this.f4924k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f4933t;
    }

    public boolean m() {
        return this.f4917c;
    }

    public boolean n() {
        return this.f4918d;
    }

    public final void o(boolean z2) {
        if (this.f4926m) {
            this.f4927n = true;
            if (z2) {
                this.f4928o = true;
                return;
            }
            return;
        }
        if (z2) {
            this.f4921h = true;
            this.f4924k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f4931r;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.f();
            }
        }
        r();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    public final boolean p(MenuItem menuItem, k kVar, int i3) {
        boolean zExpandActionView;
        j jVar = (j) menuItem;
        boolean zK = false;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = jVar.f4950p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(jVar)) {
            i iVar = jVar.f4948n;
            if (iVar.e(iVar, jVar)) {
                zExpandActionView = true;
            } else {
                Intent intent = jVar.f4941g;
                if (intent != null) {
                    try {
                        iVar.f4915a.startActivity(intent);
                        zExpandActionView = true;
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                        zExpandActionView = false;
                    }
                }
                zExpandActionView = false;
            }
        } else {
            zExpandActionView = true;
        }
        if (jVar.c()) {
            zExpandActionView |= jVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (jVar.hasSubMenu()) {
            if ((i3 & 4) == 0) {
                c(false);
            }
            if (!jVar.hasSubMenu()) {
                t tVar = new t(this.f4915a, this, jVar);
                jVar.f4949o = tVar;
                tVar.setHeaderTitle(jVar.e);
            }
            t tVar2 = jVar.f4949o;
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f4931r;
            if (!copyOnWriteArrayList.isEmpty()) {
                zK = kVar != null ? kVar.k(tVar2) : false;
                for (WeakReference weakReference : copyOnWriteArrayList) {
                    p pVar = (p) weakReference.get();
                    if (pVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zK) {
                        zK = pVar.k(tVar2);
                    }
                }
            }
            zExpandActionView |= zK;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i3 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i3, int i4) {
        return p(findItem(i3), null, i4);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        j jVarG = g(i3, keyEvent);
        boolean zP = jVarG != null ? p(jVarG, null, i4) : false;
        if ((i4 & 2) != 0) {
            c(true);
        }
        return zP;
    }

    public final void q(int i3, CharSequence charSequence, int i4, View view) {
        if (view != null) {
            this.f4925l = null;
        } else {
            if (i3 > 0) {
                this.f4925l = this.f4916b.getText(i3);
            } else if (charSequence != null) {
                this.f4925l = charSequence;
            }
            if (i4 > 0) {
                a.b(this.f4915a, i4);
            }
        }
        o(false);
    }

    public final void r() {
        this.f4926m = false;
        if (this.f4927n) {
            this.f4927n = false;
            o(this.f4928o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i3) {
        ArrayList arrayList = this.f4919f;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (((j) arrayList.get(i5)).f4937b == i3) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            int size2 = arrayList.size() - i5;
            while (true) {
                int i6 = i4 + 1;
                if (i4 >= size2 || ((j) arrayList.get(i5)).f4937b != i3) {
                    break;
                }
                if (i5 >= 0) {
                    ArrayList arrayList2 = this.f4919f;
                    if (i5 < arrayList2.size()) {
                        arrayList2.remove(i5);
                    }
                }
                i4 = i6;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i3) {
        ArrayList arrayList = this.f4919f;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((j) arrayList.get(i4)).f4936a == i3) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            ArrayList arrayList2 = this.f4919f;
            if (i4 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i4);
            o(true);
        }
    }

    public final void s() {
        if (this.f4926m) {
            return;
        }
        this.f4926m = true;
        this.f4927n = false;
        this.f4928o = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i3, boolean z2, boolean z3) {
        ArrayList arrayList = this.f4919f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            j jVar = (j) arrayList.get(i4);
            if (jVar.f4937b == i3) {
                jVar.f4957x = (jVar.f4957x & (-5)) | (z3 ? 4 : 0);
                jVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f4933t = z2;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i3, boolean z2) {
        ArrayList arrayList = this.f4919f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            j jVar = (j) arrayList.get(i4);
            if (jVar.f4937b == i3) {
                jVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i3, boolean z2) {
        ArrayList arrayList = this.f4919f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            j jVar = (j) arrayList.get(i4);
            if (jVar.f4937b == i3) {
                int i5 = jVar.f4957x;
                int i6 = (i5 & (-9)) | (z2 ? 0 : 8);
                jVar.f4957x = i6;
                if (i5 != i6) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f4917c = z2;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4919f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3) {
        return a(0, 0, 0, this.f4916b.getString(i3));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f4916b.getString(i3));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return a(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        j jVarA = a(i3, i4, i5, charSequence);
        t tVar = new t(this.f4915a, this, jVarA);
        jVarA.f4949o = tVar;
        tVar.setHeaderTitle(jVarA.e);
        return tVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i3, int i4, int i5, int i6) {
        return a(i3, i4, i5, this.f4916b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return addSubMenu(i3, i4, i5, this.f4916b.getString(i6));
    }

    public i j() {
        return this;
    }
}
