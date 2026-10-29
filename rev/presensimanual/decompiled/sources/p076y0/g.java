package p076y0;

import n1.c;
import n1.d;
import n1.e;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f5888a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f5889b = c.c("networkType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f5890c = c.c("mobileSubtype");

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        e eVar = (e) obj2;
        n nVar = (n) ((v) obj);
        eVar.c(f5889b, nVar.f5916a);
        eVar.c(f5890c, nVar.f5917b);
    }
}
