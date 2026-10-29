package L2;

import p046n2.C0782n;

/* JADX INFO: loaded from: classes.dex */
public final class m extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A0.g f928i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0782n f929j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(A0.g gVar, p063s2.d dVar) {
        super(dVar);
        this.f928i = gVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f926g = obj;
        this.f927h |= Integer.MIN_VALUE;
        return this.f928i.q(null, this);
    }
}
