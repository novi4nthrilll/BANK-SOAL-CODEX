package p076y0;

import n1.c;
import n1.d;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f5874a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f5875b = c.c("eventTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f5876c = c.c("eventCode");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f5877d = c.c("eventUptimeMs");
    public static final c e = c.c("sourceExtension");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f5878f = c.c("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f5879g = c.c("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f5880h = c.c("networkConnectionInfo");

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        n1.e eVar = (n1.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.d(f5875b, kVar.f5904a);
        eVar.c(f5876c, kVar.f5905b);
        eVar.d(f5877d, kVar.f5906c);
        eVar.c(e, kVar.f5907d);
        eVar.c(f5878f, kVar.e);
        eVar.d(f5879g, kVar.f5908f);
        eVar.c(f5880h, kVar.f5909g);
    }
}
