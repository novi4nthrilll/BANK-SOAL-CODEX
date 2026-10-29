package W1;

import k.Z0;

/* JADX INFO: renamed from: W1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0099g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z0 f1761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f1764d;

    public /* synthetic */ C0099g(Z0 z2, s sVar, String str, E e) {
        this.f1761a = z2;
        this.f1762b = sVar;
        this.f1763c = str;
        this.f1764d = e;
    }

    public final void a(String str, String str2) {
        String str3 = this.f1763c;
        E e = this.f1764d;
        Z0 z2 = this.f1761a;
        z2.getClass();
        s sVar = this.f1762b;
        if (str != null) {
            sVar.c(new u(str, str2, null));
            return;
        }
        try {
            sVar.b(z2.g(str3, e));
        } catch (Exception e3) {
            Z0.d(e3, sVar);
        }
    }
}
