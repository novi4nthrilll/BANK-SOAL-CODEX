package I0;

import android.util.SparseArray;
import java.util.HashMap;
import p013d1.I;
import p070w0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f338a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f339b;

    static {
        HashMap map = new HashMap();
        f339b = map;
        map.put(c.f5774d, 0);
        map.put(c.e, 1);
        map.put(c.f5775f, 2);
        for (c cVar : map.keySet()) {
            f338a.append(((Integer) f339b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f339b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i3) {
        c cVar = (c) f338a.get(i3);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(I.f("Unknown Priority for value ", i3));
    }
}
