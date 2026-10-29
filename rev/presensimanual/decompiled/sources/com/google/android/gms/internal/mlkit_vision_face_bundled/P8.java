package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class P8 extends AbstractMap {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f2880j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f2881d;
    public int e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.h0 f2884h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f2882f = Collections.emptyMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f2885i = Collections.emptyMap();

    public final int a() {
        return this.e;
    }

    public final Set b() {
        return this.f2882f.isEmpty() ? Collections.emptySet() : this.f2882f.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((Q8) this.f2881d[iE]).setValue(obj);
        }
        h();
        if (this.f2881d == null) {
            this.f2881d = new Object[16];
        }
        int i3 = -(iE + 1);
        if (i3 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.e == 16) {
            Q8 q8 = (Q8) this.f2881d[15];
            this.e = 15;
            g().put(q8.f2893d, q8.e);
        }
        Object[] objArr = this.f2881d;
        int length = objArr.length;
        System.arraycopy(objArr, i3, objArr, i3 + 1, 15 - i3);
        this.f2881d[i3] = new Q8(this, comparable, obj);
        this.e++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.e != 0) {
            this.f2881d = null;
            this.e = 0;
        }
        if (this.f2882f.isEmpty()) {
            return;
        }
        this.f2882f.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f2882f.containsKey(comparable);
    }

    public final Q8 d(int i3) {
        if (i3 < this.e) {
            return (Q8) this.f2881d[i3];
        }
        throw new ArrayIndexOutOfBoundsException(i3);
    }

    public final int e(Comparable comparable) {
        int i3 = this.e;
        int i4 = i3 - 1;
        int i5 = 0;
        if (i4 >= 0) {
            int iCompareTo = comparable.compareTo(((Q8) this.f2881d[i4]).f2893d);
            if (iCompareTo > 0) {
                return -(i3 + 1);
            }
            if (iCompareTo == 0) {
                return i4;
            }
        }
        while (i5 <= i4) {
            int i6 = (i5 + i4) / 2;
            int iCompareTo2 = comparable.compareTo(((Q8) this.f2881d[i6]).f2893d);
            if (iCompareTo2 < 0) {
                i4 = i6 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i6;
                }
                i5 = i6 + 1;
            }
        }
        return -(i5 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2884h == null) {
            this.f2884h = new androidx.datastore.preferences.protobuf.h0(this, 1);
        }
        return this.f2884h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P8)) {
            return super.equals(obj);
        }
        P8 p8 = (P8) obj;
        int size = size();
        if (size != p8.size()) {
            return false;
        }
        int i3 = this.e;
        if (i3 != p8.e) {
            return entrySet().equals(p8.entrySet());
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!d(i4).equals(p8.d(i4))) {
                return false;
            }
        }
        if (i3 != size) {
            return this.f2882f.equals(p8.f2882f);
        }
        return true;
    }

    public final Object f(int i3) {
        h();
        Object[] objArr = this.f2881d;
        Object obj = ((Q8) objArr[i3]).e;
        System.arraycopy(objArr, i3 + 1, objArr, i3, (this.e - i3) - 1);
        this.e--;
        if (!this.f2882f.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f2881d;
            int i4 = this.e;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i4] = new Q8(this, (Comparable) entry.getKey(), entry.getValue());
            this.e++;
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        h();
        if (this.f2882f.isEmpty() && !(this.f2882f instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2882f = treeMap;
            this.f2885i = treeMap.descendingMap();
        }
        return (SortedMap) this.f2882f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((Q8) this.f2881d[iE]).e : this.f2882f.get(comparable);
    }

    public final void h() {
        if (this.f2883g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i3 = this.e;
        int iHashCode = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            iHashCode += this.f2881d[i4].hashCode();
        }
        return this.f2882f.size() > 0 ? this.f2882f.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return f(iE);
        }
        if (this.f2882f.isEmpty()) {
            return null;
        }
        return this.f2882f.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2882f.size() + this.e;
    }
}
