package J;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class E extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Serializable f529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public B2.p f530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ P f534n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f535o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(P p3, u2.b bVar) {
        super(bVar);
        this.f534n = p3;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f533m = obj;
        this.f535o |= Integer.MIN_VALUE;
        return P.g(this.f534n, false, this);
    }
}
