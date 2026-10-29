package p013d1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p016e1.E;
import p016e1.InterfaceC0706y;

/* JADX INFO: loaded from: classes.dex */
public abstract class L2 {
    public static boolean a(E e, Collection collection) {
        collection.getClass();
        if (collection instanceof InterfaceC0706y) {
            collection = ((InterfaceC0706y) collection).a();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= e.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= e.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = e.iterator();
        collection.getClass();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }
}
