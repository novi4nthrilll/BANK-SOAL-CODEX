package p013d1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p040l1.a;
import p040l1.h;
import p040l1.i;
import p040l1.j;
import p040l1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class R2 {
    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (h hVar : (Set) it2.next()) {
                        for (j jVar : hVar.f5314a.f5301b) {
                            if (jVar.f5321c == 0) {
                                Set<h> set = (Set) map.get(new i(jVar.f5319a, jVar.f5320b == 2));
                                if (set != null) {
                                    for (h hVar2 : set) {
                                        hVar.f5315b.add(hVar2);
                                        hVar2.f5316c.add(hVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<h> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (h hVar3 : hashSet) {
                    if (hVar3.f5316c.isEmpty()) {
                        hashSet2.add(hVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    h hVar4 = (h) hashSet2.iterator().next();
                    hashSet2.remove(hVar4);
                    i3++;
                    for (h hVar5 : hVar4.f5315b) {
                        hVar5.f5316c.remove(hVar4);
                        if (hVar5.f5316c.isEmpty()) {
                            hashSet2.add(hVar5);
                        }
                    }
                }
                if (i3 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (h hVar6 : hashSet) {
                    if (!hVar6.f5316c.isEmpty() && !hVar6.f5315b.isEmpty()) {
                        arrayList2.add(hVar6.f5314a);
                    }
                }
                throw new k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            a aVar = (a) it.next();
            h hVar7 = new h(aVar);
            for (Class cls : aVar.f5300a) {
                boolean z2 = aVar.f5302c == 0;
                i iVar = new i(cls, !z2);
                if (!map.containsKey(iVar)) {
                    map.put(iVar, new HashSet());
                }
                Set set2 = (Set) map.get(iVar);
                if (!set2.isEmpty() && z2) {
                    throw new IllegalArgumentException("Multiple components provide " + cls + ".");
                }
                set2.add(hVar7);
            }
        }
    }
}
