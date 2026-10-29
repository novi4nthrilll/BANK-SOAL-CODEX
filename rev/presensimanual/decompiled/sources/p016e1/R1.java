package p016e1;

import n1.c;
import n1.d;
import n1.e;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class R1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R1 f4108a = new R1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f4109b = new c("inferenceCommonLogEvent", A0.c.k(I.i(I.class, new F(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f4110c = new c("options", A0.c.k(I.i(I.class, new F(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f4111d = new c("imageInfo", A0.c.k(I.i(I.class, new F(3))));
    public static final c e = new c("detectorOptions", A0.c.k(I.i(I.class, new F(4))));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f4112f = new c("contourDetectedFaces", A0.c.k(I.i(I.class, new F(5))));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f4113g = new c("nonContourDetectedFaces", A0.c.k(I.i(I.class, new F(6))));

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        N3 n3 = (N3) obj;
        e eVar = (e) obj2;
        eVar.c(f4109b, n3.f4090a);
        eVar.c(f4110c, null);
        eVar.c(f4111d, n3.f4091b);
        eVar.c(e, n3.f4092c);
        eVar.c(f4112f, n3.f4093d);
        eVar.c(f4113g, n3.e);
    }
}
