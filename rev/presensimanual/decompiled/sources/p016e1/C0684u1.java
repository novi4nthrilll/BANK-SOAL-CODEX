package p016e1;

import n1.c;
import n1.d;
import n1.e;
import p013d1.I;

/* JADX INFO: renamed from: e1.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0684u1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0684u1 f4316a = new C0684u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f4317b = new c("durationMs", A0.c.k(I.i(I.class, new F(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f4318c = new c("errorCode", A0.c.k(I.i(I.class, new F(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f4319d = new c("isColdCall", A0.c.k(I.i(I.class, new F(3))));
    public static final c e = new c("autoManageModelOnBackground", A0.c.k(I.i(I.class, new F(4))));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f4320f = new c("autoManageModelOnLowMemory", A0.c.k(I.i(I.class, new F(5))));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f4321g = new c("isNnApiEnabled", A0.c.k(I.i(I.class, new F(6))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f4322h = new c("eventsCount", A0.c.k(I.i(I.class, new F(7))));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f4323i = new c("otherErrors", A0.c.k(I.i(I.class, new F(8))));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f4324j = new c("remoteConfigValueForAcceleration", A0.c.k(I.i(I.class, new F(9))));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f4325k = new c("isAccelerated", A0.c.k(I.i(I.class, new F(10))));

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        C0663q3 c0663q3 = (C0663q3) obj;
        e eVar = (e) obj2;
        eVar.c(f4317b, c0663q3.f4293a);
        eVar.c(f4318c, c0663q3.f4294b);
        eVar.c(f4319d, c0663q3.f4295c);
        eVar.c(e, c0663q3.f4296d);
        eVar.c(f4320f, c0663q3.e);
        eVar.c(f4321g, null);
        eVar.c(f4322h, null);
        eVar.c(f4323i, null);
        eVar.c(f4324j, null);
        eVar.c(f4325k, null);
    }
}
