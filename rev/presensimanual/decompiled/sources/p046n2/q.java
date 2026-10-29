package p046n2;

import L2.l;
import p063s2.d;
import u2.b;

/* JADX INFO: loaded from: classes.dex */
public final class q extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f5473i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l lVar, d dVar) {
        super(dVar);
        this.f5473i = lVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f5471g = obj;
        this.f5472h |= Integer.MIN_VALUE;
        return this.f5473i.c(null, this);
    }
}
