package p016e1;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: e1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0581d extends AbstractMap {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient C0569b f4185d;
    public transient C0647o e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient C0653p f4186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0623k f4187g;

    public C0581d(C0623k c0623k, C0653p c0653p) {
        this.f4187g = c0623k;
        this.f4186f = c0653p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C0623k c0623k = this.f4187g;
        C0653p c0653p = c0623k.f4224f;
        if (this.f4186f != c0653p) {
            C0575c c0575c = new C0575c(this);
            while (c0575c.hasNext()) {
                c0575c.next();
                c0575c.remove();
            }
            return;
        }
        Iterator it = c0653p.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        c0653p.clear();
        c0623k.f4225g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C0653p c0653p = this.f4186f;
        c0653p.getClass();
        try {
            return c0653p.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0569b c0569b = this.f4185d;
        if (c0569b != null) {
            return c0569b;
        }
        C0569b c0569b2 = new C0569b(this);
        this.f4185d = c0569b2;
        return c0569b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f4186f.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        C0653p c0653p = this.f4186f;
        c0653p.getClass();
        try {
            obj2 = c0653p.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        C0623k c0623k = this.f4187g;
        List list = (List) collection;
        return list instanceof RandomAccess ? new C0593f(c0623k, obj, list, null) : new C0605h(c0623k, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f4186f.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0623k c0623k = this.f4187g;
        C0587e c0587e = c0623k.f4220d;
        if (c0587e != null) {
            return c0587e;
        }
        C0587e c0587e2 = new C0587e(c0623k, c0623k.f4224f);
        c0623k.f4220d = c0587e2;
        return c0587e2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f4186f.remove(obj);
        if (collection == null) {
            return null;
        }
        C0623k c0623k = this.f4187g;
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(collection);
        c0623k.f4225g -= collection.size();
        collection.clear();
        return arrayList;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4186f.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f4186f.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0647o c0647o = this.e;
        if (c0647o != null) {
            return c0647o;
        }
        C0647o c0647o2 = new C0647o(this);
        this.e = c0647o2;
        return c0647o2;
    }
}
