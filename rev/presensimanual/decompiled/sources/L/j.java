package L;

import R2.n;

/* JADX INFO: loaded from: classes.dex */
public final class j extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public R2.h f854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public R2.h f855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n f856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f859l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, u2.b bVar) {
        super(bVar);
        this.f858k = kVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f857j = obj;
        this.f859l |= Integer.MIN_VALUE;
        return this.f858k.b(null, this);
    }
}
