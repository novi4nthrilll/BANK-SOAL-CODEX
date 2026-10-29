package p016e1;

import n1.c;
import n1.d;
import n1.e;
import p013d1.I;

/* JADX INFO: renamed from: e1.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0643n1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0643n1 f4253a = new C0643n1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f4254b = new c("maxMs", A0.c.k(I.i(I.class, new F(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f4255c = new c("minMs", A0.c.k(I.i(I.class, new F(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f4256d = new c("avgMs", A0.c.k(I.i(I.class, new F(3))));
    public static final c e = new c("firstQuartileMs", A0.c.k(I.i(I.class, new F(4))));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f4257f = new c("medianMs", A0.c.k(I.i(I.class, new F(5))));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f4258g = new c("thirdQuartileMs", A0.c.k(I.i(I.class, new F(6))));

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        C0597f3 c0597f3 = (C0597f3) obj;
        e eVar = (e) obj2;
        eVar.c(f4254b, c0597f3.f4195a);
        eVar.c(f4255c, c0597f3.f4196b);
        eVar.c(f4256d, c0597f3.f4197c);
        eVar.c(e, c0597f3.f4198d);
        eVar.c(f4257f, c0597f3.e);
        eVar.c(f4258g, c0597f3.f4199f);
    }
}
