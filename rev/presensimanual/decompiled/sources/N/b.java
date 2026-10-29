package N;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p013d1.AbstractC0479l3;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L.a f1027b;

    public b(Map map, boolean z2) {
        B2.h.e(map, "preferencesMap");
        this.f1026a = map;
        this.f1027b = new L.a(z2);
    }

    public final Map a() {
        p055q2.b bVar;
        Set<Map.Entry> setEntrySet = this.f1026a.entrySet();
        int iA = AbstractC0479l3.a(p059r2.f.c(setEntrySet));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                B2.h.d(bArrCopyOf, "copyOf(this, size)");
                bVar = new p055q2.b(key, bArrCopyOf);
            } else {
                bVar = new p055q2.b(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(bVar.f5598d, bVar.e);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        B2.h.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (this.f1027b.f821a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(e eVar) {
        B2.h.e(eVar, "key");
        Object obj = this.f1026a.get(eVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        B2.h.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void d(e eVar, Object obj) {
        b();
        Map map = this.f1026a;
        if (obj == null) {
            b();
            map.remove(eVar);
            return;
        }
        if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(p059r2.d.i((Set) obj));
            B2.h.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(eVar, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                map.put(eVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            B2.h.d(bArrCopyOf, "copyOf(this, size)");
            map.put(eVar, bArrCopyOf);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    public final boolean equals(Object obj) {
        boolean zA;
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Map map = bVar.f1026a;
        Map map2 = this.f1026a;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        Map map3 = bVar.f1026a;
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                Object obj2 = map2.get(entry.getKey());
                if (obj2 != null) {
                    Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        zA = B2.h.a(value, obj2);
                    } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                } else {
                    zA = false;
                }
                if (!zA) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f1026a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return p059r2.d.e(this.f1026a.entrySet(), ",\n", "{\n", "\n}", a.e, 24);
    }

    public /* synthetic */ b(boolean z2) {
        this(new LinkedHashMap(), z2);
    }
}
