package p016e1;

import n1.c;
import n1.d;
import n1.e;
import p013d1.I;

/* JADX INFO: renamed from: e1.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0672s1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0672s1 f4304a = new C0672s1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f4305b = new c("imageFormat", A0.c.k(I.i(I.class, new F(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f4306c = new c("originalImageSize", A0.c.k(I.i(I.class, new F(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f4307d = new c("compressedImageSize", A0.c.k(I.i(I.class, new F(3))));
    public static final c e = new c("isOdmlImage", A0.c.k(I.i(I.class, new F(4))));

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        C0651o3 c0651o3 = (C0651o3) obj;
        e eVar = (e) obj2;
        eVar.c(f4305b, c0651o3.f4270a);
        eVar.c(f4306c, c0651o3.f4271b);
        eVar.c(f4307d, null);
        eVar.c(e, null);
    }
}
