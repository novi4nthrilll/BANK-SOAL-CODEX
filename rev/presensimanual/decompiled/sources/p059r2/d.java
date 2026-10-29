package p059r2;

import A2.l;
import B2.h;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p013d1.AbstractC0473k3;
import p013d1.AbstractC0479l3;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends j {
    public static final void d(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, l lVar) {
        h.e(collection, "<this>");
        h.e(charSequence, "separator");
        h.e(charSequence2, "prefix");
        h.e(charSequence3, "postfix");
        h.e(charSequence4, "truncated");
        sb.append(charSequence2);
        Iterator it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i4++;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            if (lVar != null) {
                sb.append((CharSequence) lVar.i(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) next.toString());
                }
            }
        }
        if (i3 >= 0 && i4 > i3) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String e(Collection collection, String str, String str2, String str3, l lVar, int i3) {
        String str4 = (i3 & 2) != 0 ? "" : str2;
        String str5 = (i3 & 4) != 0 ? "" : str3;
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        h.e(collection, "<this>");
        h.e(str4, "prefix");
        h.e(str5, "postfix");
        StringBuilder sb = new StringBuilder();
        d(collection, sb, str, str4, str5, -1, "...", lVar);
        return sb.toString();
    }

    public static final void f(Iterable iterable, AbstractCollection abstractCollection) {
        h.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List g(Iterable iterable) {
        ArrayList arrayListH;
        h.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        l lVar = l.f5624d;
        if (z2) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return lVar;
            }
            if (size != 1) {
                return h(collection);
            }
            return AbstractC0473k3.a(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        if (z2) {
            arrayListH = h((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            f(iterable, arrayList);
            arrayListH = arrayList;
        }
        int size2 = arrayListH.size();
        if (size2 != 0) {
            return size2 != 1 ? arrayListH : AbstractC0473k3.a(arrayListH.get(0));
        }
        return lVar;
    }

    public static ArrayList h(Collection collection) {
        h.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set i(Iterable iterable) {
        h.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        n nVar = n.f5626d;
        if (!z2) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            f(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return nVar;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set setSingleton = Collections.singleton(linkedHashSet.iterator().next());
            h.d(setSingleton, "singleton(...)");
            return setSingleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return nVar;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC0479l3.a(collection.size()));
            f(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set setSingleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        h.d(setSingleton2, "singleton(...)");
        return setSingleton2;
    }
}
