package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z f2263c = new Z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2265b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f2264a = new L();

    public final c0 a(Class cls) {
        r rVar;
        c0 c0VarX;
        V v;
        Class cls2;
        C.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2265b;
        c0 c0Var = (c0) concurrentHashMap.get(cls);
        if (c0Var != null) {
            return c0Var;
        }
        L l3 = this.f2264a;
        l3.getClass();
        Class cls3 = d0.f2275a;
        if (!AbstractC0143z.class.isAssignableFrom(cls) && (cls2 = d0.f2275a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        b0 b0VarB = ((K) l3.f2235a).b(cls);
        if ((b0VarB.f2272d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC0143z.class.isAssignableFrom(cls);
            AbstractC0143z abstractC0143z = b0VarB.f2269a;
            if (zIsAssignableFrom) {
                v = new V(d0.f2277c, AbstractC0136s.f2341a, abstractC0143z);
            } else {
                k0 k0Var = d0.f2276b;
                r rVar2 = AbstractC0136s.f2342b;
                if (rVar2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                v = new V(k0Var, rVar2, abstractC0143z);
            }
            c0VarX = v;
        } else if (AbstractC0143z.class.isAssignableFrom(cls)) {
            W w3 = X.f2262b;
            H h3 = I.f2232b;
            k0 k0Var2 = d0.f2277c;
            r rVar3 = M.j.b(b0VarB.d()) != 1 ? AbstractC0136s.f2341a : null;
            P p3 = Q.f2242b;
            int[] iArr = U.f2244n;
            if (!(b0VarB instanceof b0)) {
                b0VarB.getClass();
                throw new ClassCastException();
            }
            c0VarX = U.x(b0VarB, w3, h3, k0Var2, rVar3, p3);
        } else {
            W w4 = X.f2261a;
            H h4 = I.f2231a;
            k0 k0Var3 = d0.f2276b;
            if (M.j.b(b0VarB.d()) != 1) {
                rVar = AbstractC0136s.f2342b;
                if (rVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                rVar = null;
            }
            P p4 = Q.f2241a;
            int[] iArr2 = U.f2244n;
            if (!(b0VarB instanceof b0)) {
                b0VarB.getClass();
                throw new ClassCastException();
            }
            c0VarX = U.x(b0VarB, w4, h4, k0Var3, rVar, p4);
        }
        c0 c0Var2 = (c0) concurrentHashMap.putIfAbsent(cls, c0VarX);
        return c0Var2 != null ? c0Var2 : c0VarX;
    }
}
