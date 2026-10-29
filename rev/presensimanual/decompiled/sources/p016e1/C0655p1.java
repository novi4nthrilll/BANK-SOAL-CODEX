package p016e1;

import n1.c;
import n1.d;
import n1.e;
import p013d1.I;

/* JADX INFO: renamed from: e1.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0655p1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0655p1 f4282a = new C0655p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f4283b = new c("landmarkMode", A0.c.k(I.i(I.class, new F(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f4284c = new c("classificationMode", A0.c.k(I.i(I.class, new F(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f4285d = new c("performanceMode", A0.c.k(I.i(I.class, new F(3))));
    public static final c e = new c("contourMode", A0.c.k(I.i(I.class, new F(4))));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f4286f = new c("isTrackingEnabled", A0.c.k(I.i(I.class, new F(5))));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f4287g = new c("minFaceSize", A0.c.k(I.i(I.class, new F(6))));

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        C0639m3 c0639m3 = (C0639m3) obj;
        e eVar = (e) obj2;
        eVar.c(f4283b, c0639m3.f4246a);
        eVar.c(f4284c, c0639m3.f4247b);
        eVar.c(f4285d, c0639m3.f4248c);
        eVar.c(e, c0639m3.f4249d);
        eVar.c(f4286f, c0639m3.e);
        eVar.c(f4287g, c0639m3.f4250f);
    }
}
