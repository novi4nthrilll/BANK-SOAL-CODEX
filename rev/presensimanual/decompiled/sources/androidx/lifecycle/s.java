package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class s extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p042m.a f2394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f2395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f2396d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f2399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L2.q f2400i;

    public s(q qVar) {
        new AtomicReference();
        this.f2393a = true;
        this.f2394b = new p042m.a();
        k kVar = k.e;
        this.f2395c = kVar;
        this.f2399h = new ArrayList();
        this.f2396d = new WeakReference(qVar);
        this.f2400i = new L2.q(kVar);
    }

    @Override // androidx.lifecycle.l
    public final void a(p pVar) {
        d("removeObserver");
        this.f2394b.d(pVar);
    }

    public final void b(p pVar) {
        o c0148e;
        q qVar;
        ArrayList arrayList = this.f2399h;
        Object obj = null;
        int i3 = 1;
        d("addObserver");
        k kVar = this.f2395c;
        k kVar2 = k.f2385d;
        if (kVar != kVar2) {
            kVar2 = k.e;
        }
        r rVar = new r();
        HashMap map = t.f2401a;
        boolean z2 = pVar instanceof o;
        boolean z3 = pVar instanceof DefaultLifecycleObserver;
        if (z2 && z3) {
            c0148e = new C0148e((DefaultLifecycleObserver) pVar, (o) pVar);
        } else if (z3) {
            c0148e = new C0148e((DefaultLifecycleObserver) pVar, null);
        } else if (z2) {
            c0148e = (o) pVar;
        } else {
            Class<?> cls = pVar.getClass();
            if (t.b(cls) == 2) {
                Object obj2 = t.f2402b.get(cls);
                B2.h.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    t.a((Constructor) list.get(0), pVar);
                    throw null;
                }
                int size = list.size();
                g[] gVarArr = new g[size];
                if (size > 0) {
                    t.a((Constructor) list.get(0), pVar);
                    throw null;
                }
                c0148e = new Z.a(i3, gVarArr);
            } else {
                c0148e = new C0148e(pVar);
            }
        }
        rVar.f2392b = c0148e;
        rVar.f2391a = kVar2;
        p042m.a aVar = this.f2394b;
        p042m.c cVarC = aVar.c(pVar);
        if (cVarC != null) {
            obj = cVarC.e;
        } else {
            HashMap map2 = aVar.f5335h;
            p042m.c cVar = new p042m.c(pVar, rVar);
            aVar.f5345g++;
            p042m.c cVar2 = aVar.e;
            if (cVar2 == null) {
                aVar.f5343d = cVar;
                aVar.e = cVar;
            } else {
                cVar2.f5339f = cVar;
                cVar.f5340g = cVar2;
                aVar.e = cVar;
            }
            map2.put(pVar, cVar);
        }
        if (((r) obj) == null && (qVar = (q) this.f2396d.get()) != null) {
            boolean z4 = this.e != 0 || this.f2397f;
            k kVarC = c(pVar);
            this.e++;
            while (rVar.f2391a.compareTo(kVarC) < 0 && this.f2394b.f5335h.containsKey(pVar)) {
                arrayList.add(rVar.f2391a);
                h hVar = j.Companion;
                k kVar3 = rVar.f2391a;
                hVar.getClass();
                j jVarA = h.a(kVar3);
                if (jVarA == null) {
                    throw new IllegalStateException("no event up from " + rVar.f2391a);
                }
                rVar.a(qVar, jVarA);
                arrayList.remove(arrayList.size() - 1);
                kVarC = c(pVar);
            }
            if (!z4) {
                f();
            }
            this.e--;
        }
    }

    public final k c(p pVar) {
        HashMap map = this.f2394b.f5335h;
        p042m.c cVar = map.containsKey(pVar) ? ((p042m.c) map.get(pVar)).f5340g : null;
        k kVar = cVar != null ? ((r) cVar.e).f2391a : null;
        ArrayList arrayList = this.f2399h;
        k kVar2 = arrayList.isEmpty() ? null : (k) arrayList.get(arrayList.size() - 1);
        k kVar3 = this.f2395c;
        B2.h.e(kVar3, "state1");
        if (kVar == null || kVar.compareTo(kVar3) >= 0) {
            kVar = kVar3;
        }
        return (kVar2 == null || kVar2.compareTo(kVar) >= 0) ? kVar : kVar2;
    }

    public final void d(String str) {
        p038l.a aVar;
        if (this.f2393a) {
            if (p038l.a.f5284b != null) {
                aVar = p038l.a.f5284b;
            } else {
                synchronized (p038l.a.class) {
                    try {
                        if (p038l.a.f5284b == null) {
                            p038l.a.f5284b = new p038l.a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                aVar = p038l.a.f5284b;
            }
            ((p038l.a) aVar.f5285a).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void e(j jVar) {
        B2.h.e(jVar, "event");
        d("handleLifecycleEvent");
        k kVarA = jVar.a();
        k kVar = this.f2395c;
        if (kVar == kVarA) {
            return;
        }
        k kVar2 = k.e;
        k kVar3 = k.f2385d;
        if (kVar == kVar2 && kVarA == kVar3) {
            throw new IllegalStateException(("no event down from " + this.f2395c + " in component " + this.f2396d.get()).toString());
        }
        this.f2395c = kVarA;
        if (this.f2397f || this.e != 0) {
            this.f2398g = true;
            return;
        }
        this.f2397f = true;
        f();
        this.f2397f = false;
        if (this.f2395c == kVar3) {
            this.f2394b = new p042m.a();
        }
    }

    public final void f() {
        j jVar;
        q qVar = (q) this.f2396d.get();
        if (qVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            p042m.a aVar = this.f2394b;
            if (aVar.f5345g != 0) {
                p042m.c cVar = aVar.f5343d;
                B2.h.b(cVar);
                k kVar = ((r) cVar.e).f2391a;
                p042m.c cVar2 = this.f2394b.e;
                B2.h.b(cVar2);
                k kVar2 = ((r) cVar2.e).f2391a;
                if (kVar == kVar2 && this.f2395c == kVar2) {
                    break;
                }
                this.f2398g = false;
                k kVar3 = this.f2395c;
                p042m.c cVar3 = this.f2394b.f5343d;
                B2.h.b(cVar3);
                if (kVar3.compareTo(((r) cVar3.e).f2391a) < 0) {
                    p042m.a aVar2 = this.f2394b;
                    p042m.b bVar = new p042m.b(aVar2.e, aVar2.f5343d, 1);
                    aVar2.f5344f.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f2398g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        B2.h.d(entry, "next()");
                        p pVar = (p) entry.getKey();
                        r rVar = (r) entry.getValue();
                        while (rVar.f2391a.compareTo(this.f2395c) > 0 && !this.f2398g && this.f2394b.f5335h.containsKey(pVar)) {
                            h hVar = j.Companion;
                            k kVar4 = rVar.f2391a;
                            hVar.getClass();
                            B2.h.e(kVar4, "state");
                            int iOrdinal = kVar4.ordinal();
                            if (iOrdinal == 2) {
                                jVar = j.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                jVar = iOrdinal != 4 ? null : j.ON_PAUSE;
                            } else {
                                jVar = j.ON_STOP;
                            }
                            if (jVar == null) {
                                throw new IllegalStateException("no event down from " + rVar.f2391a);
                            }
                            this.f2399h.add(jVar.a());
                            rVar.a(qVar, jVar);
                            ArrayList arrayList = this.f2399h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                p042m.c cVar4 = this.f2394b.e;
                if (!this.f2398g && cVar4 != null && this.f2395c.compareTo(((r) cVar4.e).f2391a) > 0) {
                    p042m.a aVar3 = this.f2394b;
                    aVar3.getClass();
                    p042m.d dVar = new p042m.d(aVar3);
                    aVar3.f5344f.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f2398g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        p pVar2 = (p) entry2.getKey();
                        r rVar2 = (r) entry2.getValue();
                        while (rVar2.f2391a.compareTo(this.f2395c) < 0 && !this.f2398g && this.f2394b.f5335h.containsKey(pVar2)) {
                            this.f2399h.add(rVar2.f2391a);
                            h hVar2 = j.Companion;
                            k kVar5 = rVar2.f2391a;
                            hVar2.getClass();
                            j jVarA = h.a(kVar5);
                            if (jVarA == null) {
                                throw new IllegalStateException("no event up from " + rVar2.f2391a);
                            }
                            rVar2.a(qVar, jVarA);
                            ArrayList arrayList2 = this.f2399h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f2398g = false;
        this.f2400i.d(this.f2395c);
    }
}
