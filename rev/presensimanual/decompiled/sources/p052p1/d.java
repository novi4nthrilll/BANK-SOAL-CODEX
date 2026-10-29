package p052p1;

import java.util.Date;
import java.util.HashMap;
import p049o1.a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {
    public static final c e = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f5551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5552d;

    public d() {
        HashMap map = new HashMap();
        this.f5549a = map;
        HashMap map2 = new HashMap();
        this.f5550b = map2;
        this.f5551c = a.f5544a;
        this.f5552d = false;
        map2.put(String.class, b.f5545b);
        map.remove(String.class);
        map2.put(Boolean.class, b.f5546c);
        map.remove(Boolean.class);
        map2.put(Date.class, e);
        map.remove(Date.class);
    }

    @Override // p049o1.a
    public final a a(Class cls, n1.d dVar) {
        this.f5549a.put(cls, dVar);
        this.f5550b.remove(cls);
        return this;
    }
}
