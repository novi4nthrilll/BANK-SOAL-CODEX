package p046n2;

import J.C0072s;
import p063s2.d;
import u2.b;

/* JADX INFO: loaded from: classes.dex */
public final class z extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0072s f5511i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0072s c0072s, d dVar) {
        super(dVar);
        this.f5511i = c0072s;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f5509g = obj;
        this.f5510h |= Integer.MIN_VALUE;
        return this.f5511i.c(null, this);
    }
}
