package p040l1;

import E0.h;
import androidx.lifecycle.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p013d1.S2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f5300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f5301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f5303d;
    public final Set e;

    public a(HashSet hashSet, HashSet hashSet2, int i3, c cVar, HashSet hashSet3) {
        this.f5300a = Collections.unmodifiableSet(hashSet);
        this.f5301b = Collections.unmodifiableSet(hashSet2);
        this.f5302c = i3;
        this.f5303d = cVar;
        this.e = Collections.unmodifiableSet(hashSet3);
    }

    public static h a(Class cls) {
        return new h(cls, new Class[0]);
    }

    public static a b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            S2.a(cls2, "Null interface");
        }
        Collections.addAll(hashSet, clsArr);
        return new a(new HashSet(hashSet), new HashSet(hashSet2), 0, new y(14, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f5300a.toArray()) + ">{0, type=" + this.f5302c + ", deps=" + Arrays.toString(this.f5301b.toArray()) + "}";
    }
}
