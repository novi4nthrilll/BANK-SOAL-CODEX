package G2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013d1.AbstractC0473k3;
import p059r2.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {
    public static List a(b bVar) {
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return l.f5624d;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0473k3.a(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
