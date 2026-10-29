package L2;

import B.C0006g;

/* JADX INFO: loaded from: classes.dex */
public final class a extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public M2.n f887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0006g f889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f890j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0006g c0006g, p063s2.d dVar) {
        super(dVar);
        this.f889i = c0006g;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f888h = obj;
        this.f890j |= Integer.MIN_VALUE;
        return this.f889i.q(null, this);
    }
}
