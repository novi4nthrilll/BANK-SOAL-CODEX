package p013d1;

import n1.c;
import n1.d;
import n1.e;

/* JADX INFO: renamed from: d1.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0417b1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0417b1 f3689a = new C0417b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f3690b = new c("durationMs", A0.c.k(A0.c.j(InterfaceC0427d.class, new C0409a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f3691c = new c("imageSource", A0.c.k(A0.c.j(InterfaceC0427d.class, new C0409a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f3692d = new c("imageFormat", A0.c.k(A0.c.j(InterfaceC0427d.class, new C0409a(3))));
    public static final c e = new c("imageByteSize", A0.c.k(A0.c.j(InterfaceC0427d.class, new C0409a(4))));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f3693f = new c("imageWidth", A0.c.k(A0.c.j(InterfaceC0427d.class, new C0409a(5))));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f3694g = new c("imageHeight", A0.c.k(A0.c.j(InterfaceC0427d.class, new C0409a(6))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f3695h = new c("rotationDegrees", A0.c.k(A0.c.j(InterfaceC0427d.class, new C0409a(7))));

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        C0437e3 c0437e3 = (C0437e3) obj;
        e eVar = (e) obj2;
        eVar.c(f3690b, c0437e3.f3716a);
        eVar.c(f3691c, c0437e3.f3717b);
        eVar.c(f3692d, c0437e3.f3718c);
        eVar.c(e, c0437e3.f3719d);
        eVar.c(f3693f, c0437e3.e);
        eVar.c(f3694g, c0437e3.f3720f);
        eVar.c(f3695h, c0437e3.f3721g);
    }
}
