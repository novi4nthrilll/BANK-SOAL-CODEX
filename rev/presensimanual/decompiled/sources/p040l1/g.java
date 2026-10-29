package p040l1;

import E0.e;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p013d1.Q2;
import p013d1.R2;
import q1.a;
import q1.b;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Q2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f5313d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5310a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5311b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f5312c = new HashMap();
    public final AtomicReference e = new AtomicReference();

    public g(ArrayList arrayList, ArrayList arrayList2) {
        l lVar = new l();
        new HashMap();
        lVar.f5322a = new ArrayDeque();
        this.f5313d = lVar;
        ArrayList<a> arrayList3 = new ArrayList();
        arrayList3.add(a.b(lVar, l.class, b.class, a.class));
        arrayList3.add(a.b(this, g.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    d dVar = (d) ((p058r1.a) it3.next()).get();
                    if (dVar != null) {
                        arrayList3.addAll(dVar.a());
                        it3.remove();
                    }
                } catch (m e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f5310a.isEmpty()) {
                R2.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f5310a.keySet());
                arrayList6.addAll(arrayList3);
                R2.a(arrayList6);
            }
            for (final a aVar2 : arrayList3) {
                this.f5310a.put(aVar2, new n(new p058r1.a(this, aVar2) { // from class: l1.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final g f5305a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final a f5306b;

                    {
                        this.f5305a = this;
                        this.f5306b = aVar2;
                    }

                    @Override // p058r1.a
                    public final Object get() {
                        a aVar3 = this.f5306b;
                        return aVar3.f5303d.h(new s(aVar3, this.f5305a));
                    }
                }));
            }
            arrayList5.addAll(h(arrayList3));
            arrayList5.addAll(i());
            g();
        }
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = (Boolean) this.e.get();
        if (bool != null) {
            e(this.f5310a, bool.booleanValue());
        }
    }

    @Override // p013d1.Q2
    public final synchronized p058r1.a b(Class cls) {
        return (p058r1.a) this.f5311b.get(cls);
    }

    @Override // p013d1.Q2
    public final synchronized p058r1.a d(Class cls) {
        o oVar = (o) this.f5312c.get(cls);
        if (oVar != null) {
            return oVar;
        }
        return f.f5307b;
    }

    public final void e(HashMap map, boolean z2) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getKey();
            aVar.getClass();
        }
        l lVar = this.f5313d;
        synchronized (lVar) {
            arrayDeque = lVar.f5322a;
            if (arrayDeque != null) {
                lVar.f5322a = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void f() {
        HashMap map;
        AtomicReference atomicReference = this.e;
        Boolean bool = Boolean.TRUE;
        while (!atomicReference.compareAndSet(null, bool)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap(this.f5310a);
        }
        e(map, true);
    }

    public final void g() {
        for (a aVar : this.f5310a.keySet()) {
            for (j jVar : aVar.f5301b) {
                if (jVar.f5320b == 2 && !this.f5312c.containsKey(jVar.f5319a)) {
                    HashMap map = this.f5312c;
                    Class cls = jVar.f5319a;
                    Set setEmptySet = Collections.emptySet();
                    o oVar = new o();
                    oVar.f5327b = null;
                    oVar.f5326a = Collections.newSetFromMap(new ConcurrentHashMap());
                    oVar.f5326a.addAll(setEmptySet);
                    map.put(cls, oVar);
                } else if (this.f5311b.containsKey(jVar.f5319a)) {
                    continue;
                } else {
                    int i3 = jVar.f5320b;
                    if (i3 == 1) {
                        throw new k("Unsatisfied dependency for component " + aVar + ": " + jVar.f5319a);
                    }
                    if (i3 != 2) {
                        HashMap map2 = this.f5311b;
                        Class cls2 = jVar.f5319a;
                        p pVar = p.f5328a;
                        f fVar = f.f5308c;
                        q qVar = new q();
                        qVar.f5329a = pVar;
                        qVar.f5330b = fVar;
                        map2.put(cls2, qVar);
                    }
                }
            }
        }
    }

    public final ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f5302c == 0) {
                p058r1.a aVar2 = (p058r1.a) this.f5310a.get(aVar);
                for (Class cls : aVar.f5300a) {
                    HashMap map = this.f5311b;
                    if (map.containsKey(cls)) {
                        arrayList2.add(new e(11, (q) ((p058r1.a) map.get(cls)), aVar2));
                    } else {
                        map.put(cls, aVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f5310a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f5302c != 0) {
                p058r1.a aVar2 = (p058r1.a) entry.getValue();
                for (Class cls : aVar.f5300a) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(aVar2);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f5312c;
            if (map2.containsKey(key)) {
                o oVar = (o) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new e(12, oVar, (p058r1.a) it.next()));
                }
            } else {
                Class cls2 = (Class) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                o oVar2 = new o();
                oVar2.f5327b = null;
                oVar2.f5326a = Collections.newSetFromMap(new ConcurrentHashMap());
                oVar2.f5326a.addAll(set);
                map2.put(cls2, oVar2);
            }
        }
        return arrayList;
    }
}
