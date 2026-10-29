package p016e1;

import n1.c;
import n1.d;
import n1.e;
import p013d1.I;

/* JADX INFO: renamed from: e1.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0713z0 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0713z0 f4371a = new C0713z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f4372b = new c("errorCode", A0.c.k(I.i(I.class, new F(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f4373c = new c("isColdCall", A0.c.k(I.i(I.class, new F(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f4374d = new c("imageInfo", A0.c.k(I.i(I.class, new F(3))));
    public static final c e = new c("detectorOptions", A0.c.k(I.i(I.class, new F(4))));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f4375f = new c("contourDetectedFaces", A0.c.k(I.i(I.class, new F(5))));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f4376g = new c("nonContourDetectedFaces", A0.c.k(I.i(I.class, new F(6))));

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        X x3 = (X) obj;
        e eVar = (e) obj2;
        eVar.c(f4372b, x3.f4148a);
        eVar.c(f4373c, x3.f4149b);
        eVar.c(f4374d, null);
        eVar.c(e, x3.f4150c);
        eVar.c(f4375f, x3.f4151d);
        eVar.c(f4376g, x3.e);
    }
}
