package p040l1;

import I2.C0045p;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p013d1.Q2;
import q1.a;

/* JADX INFO: loaded from: classes.dex */
public final class s extends Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f5331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f5332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f5333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f5334d;
    public final Q2 e;

    public s(a aVar, Q2 q3) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (j jVar : aVar.f5301b) {
            int i3 = jVar.f5321c;
            boolean z2 = i3 == 0;
            int i4 = jVar.f5320b;
            Class cls = jVar.f5319a;
            if (z2) {
                if (i4 == 2) {
                    hashSet4.add(cls);
                } else {
                    hashSet.add(cls);
                }
            } else if (i3 == 2) {
                hashSet3.add(cls);
            } else if (i4 == 2) {
                hashSet5.add(cls);
            } else {
                hashSet2.add(cls);
            }
        }
        if (!aVar.e.isEmpty()) {
            hashSet.add(a.class);
        }
        this.f5331a = Collections.unmodifiableSet(hashSet);
        this.f5332b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f5333c = Collections.unmodifiableSet(hashSet4);
        this.f5334d = Collections.unmodifiableSet(hashSet5);
        this.e = q3;
    }

    @Override // p013d1.Q2
    public final Object a(Class cls) {
        if (!this.f5331a.contains(cls)) {
            throw new C0045p("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object objA = this.e.a(cls);
        if (!cls.equals(a.class)) {
            return objA;
        }
        return new r();
    }

    @Override // p013d1.Q2
    public final p058r1.a b(Class cls) {
        if (this.f5332b.contains(cls)) {
            return this.e.b(cls);
        }
        throw new C0045p("Attempting to request an undeclared dependency Provider<" + cls + ">.");
    }

    @Override // p013d1.Q2
    public final Set c(Class cls) {
        if (this.f5333c.contains(cls)) {
            return this.e.c(cls);
        }
        throw new C0045p("Attempting to request an undeclared dependency Set<" + cls + ">.");
    }

    @Override // p013d1.Q2
    public final p058r1.a d(Class cls) {
        if (this.f5334d.contains(cls)) {
            return this.e.d(cls);
        }
        throw new C0045p("Attempting to request an undeclared dependency Provider<Set<" + cls + ">>.");
    }
}
