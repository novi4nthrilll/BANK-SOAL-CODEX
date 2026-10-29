package p076y0;

import n1.c;
import n1.d;
import n1.e;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f5881a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f5882b = c.c("requestTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f5883c = c.c("requestUptimeMs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f5884d = c.c("clientInfo");
    public static final c e = c.c("logSource");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f5885f = c.c("logSourceName");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f5886g = c.c("logEvent");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f5887h = c.c("qosTier");

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        l lVar = (l) ((s) obj);
        eVar.d(f5882b, lVar.f5910a);
        eVar.d(f5883c, lVar.f5911b);
        eVar.c(f5884d, lVar.f5912c);
        eVar.c(e, lVar.f5913d);
        eVar.c(f5885f, lVar.e);
        eVar.c(f5886g, lVar.f5914f);
        eVar.c(f5887h, w.f5921d);
    }
}
