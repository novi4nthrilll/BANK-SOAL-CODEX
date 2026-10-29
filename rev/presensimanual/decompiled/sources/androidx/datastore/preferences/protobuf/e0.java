package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends AbstractMap {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f2281i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f2282d;
    public Map e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile h0 f2284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f2285h;

    public static e0 f() {
        e0 e0Var = new e0();
        e0Var.f2282d = Collections.emptyList();
        e0Var.e = Collections.emptyMap();
        e0Var.f2285h = Collections.emptyMap();
        return e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i3;
        int i4;
        int i5;
        int iCompareTo;
        int size = this.f2282d.size();
        int i6 = size - 1;
        if (i6 < 0) {
            i3 = 0;
            while (i3 <= i6) {
                i5 = (i3 + i6) / 2;
                iCompareTo = comparable.compareTo(((f0) this.f2282d.get(i5)).f2287d);
                if (iCompareTo < 0) {
                    i6 = i5 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i5;
                    }
                    i3 = i5 + 1;
                }
            }
            i4 = i3 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((f0) this.f2282d.get(i6)).f2287d);
            if (iCompareTo2 > 0) {
                i4 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i6;
                }
                i3 = 0;
                while (i3 <= i6) {
                    i5 = (i3 + i6) / 2;
                    iCompareTo = comparable.compareTo(((f0) this.f2282d.get(i5)).f2287d);
                    if (iCompareTo < 0) {
                        i6 = i5 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i5;
                        }
                        i3 = i5 + 1;
                    }
                }
                i4 = i3 + 1;
            }
        }
        return -i4;
    }

    public final void b() {
        if (this.f2283f) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i3) {
        return (Map.Entry) this.f2282d.get(i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f2282d.isEmpty()) {
            this.f2282d.clear();
        }
        if (this.e.isEmpty()) {
            return;
        }
        this.e.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.e.containsKey(comparable);
    }

    public final Set d() {
        return this.e.isEmpty() ? Collections.emptySet() : this.e.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.e.isEmpty() && !(this.e instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.e = treeMap;
            this.f2285h = treeMap.descendingMap();
        }
        return (SortedMap) this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2284g == null) {
            this.f2284g = new h0(this, 0);
        }
        return this.f2284g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return super.equals(obj);
        }
        e0 e0Var = (e0) obj;
        int size = size();
        if (size != e0Var.size()) {
            return false;
        }
        int size2 = this.f2282d.size();
        if (size2 != e0Var.f2282d.size()) {
            return ((AbstractSet) entrySet()).equals(e0Var.entrySet());
        }
        for (int i3 = 0; i3 < size2; i3++) {
            if (!c(i3).equals(e0Var.c(i3))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.e.equals(e0Var.e);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((f0) this.f2282d.get(iA)).setValue(obj);
        }
        b();
        if (this.f2282d.isEmpty() && !(this.f2282d instanceof ArrayList)) {
            this.f2282d = new ArrayList(16);
        }
        int i3 = -(iA + 1);
        if (i3 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f2282d.size() == 16) {
            f0 f0Var = (f0) this.f2282d.remove(15);
            e().put(f0Var.f2287d, f0Var.e);
        }
        this.f2282d.add(i3, new f0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((f0) this.f2282d.get(iA)).e : this.e.get(comparable);
    }

    public final Object h(int i3) {
        b();
        Object obj = ((f0) this.f2282d.remove(i3)).e;
        if (!this.e.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f2282d;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new f0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2282d.size();
        int iHashCode = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iHashCode += ((f0) this.f2282d.get(i3)).hashCode();
        }
        return this.e.size() > 0 ? iHashCode + this.e.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.e.isEmpty()) {
            return null;
        }
        return this.e.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.e.size() + this.f2282d.size();
    }
}
