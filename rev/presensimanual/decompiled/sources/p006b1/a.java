package p006b1;

import A0.g;
import M0.f;
import N0.h;
import O0.u;
import Q0.b;
import p009c1.v;
import p033j1.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f2514i = new g("LocationServices.API", new b(2), new v());

    public k d(p065t0.b bVar) {
        String simpleName = p065t0.b.class.getSimpleName();
        u.g(bVar, "Listener must not be null");
        u.e(simpleName, "Listener type must not be empty");
        k kVarB = b(new h(bVar, simpleName), 2418);
        kVarB.getClass();
        k kVar = new k();
        kVarB.f4998b.d(new p033j1.g(kVar));
        kVarB.l();
        return kVar;
    }
}
