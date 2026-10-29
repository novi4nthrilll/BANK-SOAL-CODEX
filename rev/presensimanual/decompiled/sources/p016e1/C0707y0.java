package p016e1;

import n1.c;
import n1.d;
import n1.e;
import p013d1.I;

/* JADX INFO: renamed from: e1.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0707y0 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0707y0 f4356a = new C0707y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f4357b = new c("logEventKey", A0.c.k(I.i(I.class, new F(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f4358c = new c("eventCount", A0.c.k(I.i(I.class, new F(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f4359d = new c("inferenceDurationStats", A0.c.k(I.i(I.class, new F(3))));

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        Y y2 = (Y) obj;
        e eVar = (e) obj2;
        eVar.c(f4357b, y2.f4164a);
        eVar.c(f4358c, y2.f4165b);
        eVar.c(f4359d, y2.f4166c);
    }
}
