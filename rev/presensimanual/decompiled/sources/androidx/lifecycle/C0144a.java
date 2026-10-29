package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0144a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2374a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2375b;

    public C0144a(HashMap map) {
        this.f2375b = map;
        for (Map.Entry entry : map.entrySet()) {
            j jVar = (j) entry.getValue();
            List arrayList = (List) this.f2374a.get(jVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f2374a.put(jVar, arrayList);
            }
            arrayList.add((C0145b) entry.getKey());
        }
    }

    public static void a(List list, q qVar, j jVar, p pVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0145b c0145b = (C0145b) list.get(size);
                c0145b.getClass();
                try {
                    int i3 = c0145b.f2376a;
                    Method method = c0145b.f2377b;
                    if (i3 == 0) {
                        method.invoke(pVar, null);
                    } else if (i3 == 1) {
                        method.invoke(pVar, qVar);
                    } else if (i3 == 2) {
                        method.invoke(pVar, qVar, jVar);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
