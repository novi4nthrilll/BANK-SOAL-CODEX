package p042m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f5343d;
    public c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakHashMap f5344f = new WeakHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5345g = 0;

    public c c(Object obj) {
        c cVar = this.f5343d;
        while (cVar != null && !cVar.f5338d.equals(obj)) {
            cVar = cVar.f5339f;
        }
        return cVar;
    }

    public Object d(Object obj) {
        c cVarC = c(obj);
        if (cVarC == null) {
            return null;
        }
        this.f5345g--;
        WeakHashMap weakHashMap = this.f5344f;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarC);
            }
        }
        c cVar = cVarC.f5340g;
        if (cVar != null) {
            cVar.f5339f = cVarC.f5339f;
        } else {
            this.f5343d = cVarC.f5339f;
        }
        c cVar2 = cVarC.f5339f;
        if (cVar2 != null) {
            cVar2.f5340g = cVar;
        } else {
            this.e = cVar;
        }
        cVarC.f5339f = null;
        cVarC.f5340g = null;
        return cVarC.e;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f5345g != fVar.f5345g) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f5343d, this.e, 0);
        this.f5344f.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
