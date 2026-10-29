package p019f0;

import A0.c;
import A2.l;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f4465c;

    public h(Object obj, int i3, a aVar) {
        B2.h.e(obj, "value");
        c.p("verificationMode", i3);
        this.f4463a = obj;
        this.f4464b = i3;
        this.f4465c = aVar;
    }

    @Override // p019f0.g
    public final Object a() {
        return this.f4463a;
    }

    @Override // p019f0.g
    public final g d(String str, l lVar) {
        Object obj = this.f4463a;
        return ((Boolean) lVar.i(obj)).booleanValue() ? this : new f(obj, str, this.f4465c, this.f4464b);
    }
}
