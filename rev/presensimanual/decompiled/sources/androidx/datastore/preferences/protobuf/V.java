package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class V implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0143z f2258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f2259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f2260c;

    public V(k0 k0Var, r rVar, AbstractC0143z abstractC0143z) {
        this.f2259b = k0Var;
        rVar.getClass();
        this.f2260c = rVar;
        this.f2258a = abstractC0143z;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final boolean a(Object obj) {
        this.f2260c.getClass();
        A0.c.o(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void b(Object obj, C0130l c0130l, C0135q c0135q) {
        this.f2259b.getClass();
        k0.a(obj);
        this.f2260c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void c(Object obj, Object obj2) {
        d0.A(this.f2259b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void d(Object obj, L l3) {
        this.f2260c.getClass();
        A0.c.o(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final int e(AbstractC0143z abstractC0143z) {
        this.f2259b.getClass();
        return abstractC0143z.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final int f(AbstractC0143z abstractC0143z) {
        this.f2259b.getClass();
        j0 j0Var = abstractC0143z.unknownFields;
        int i3 = j0Var.f2316d;
        if (i3 != -1) {
            return i3;
        }
        int iH = 0;
        for (int i4 = 0; i4 < j0Var.f2313a; i4++) {
            int i5 = j0Var.f2314b[i4] >>> 3;
            C0126h c0126h = (C0126h) j0Var.f2315c[i4];
            iH += C0132n.h(3, c0126h) + C0132n.y(2, i5) + (C0132n.x(1) * 2);
        }
        j0Var.f2316d = iH;
        return iH;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final AbstractC0143z g() {
        AbstractC0143z abstractC0143z = this.f2258a;
        return abstractC0143z instanceof AbstractC0143z ? abstractC0143z.k() : ((AbstractC0141x) abstractC0143z.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void h(Object obj) {
        this.f2259b.getClass();
        k0.b(obj);
        this.f2260c.getClass();
        A0.c.o(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final boolean i(AbstractC0143z abstractC0143z, Object obj) {
        this.f2259b.getClass();
        return abstractC0143z.unknownFields.equals(((AbstractC0143z) obj).unknownFields);
    }
}
