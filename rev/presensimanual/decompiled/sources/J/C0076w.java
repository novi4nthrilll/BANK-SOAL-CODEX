package J;

import I2.C0041l;

/* JADX INFO: renamed from: J.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0076w extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public P f679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0041l f680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f683l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0076w(P p3, u2.b bVar) {
        super(bVar);
        this.f682k = p3;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f681j = obj;
        this.f683l |= Integer.MIN_VALUE;
        return P.b(this.f682k, null, this);
    }
}
