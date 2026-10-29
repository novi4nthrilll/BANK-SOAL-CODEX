package J;

/* JADX INFO: loaded from: classes.dex */
public final class N extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public B2.n f560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P f562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f563j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(P p3, u2.b bVar) {
        super(bVar);
        this.f562i = p3;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f561h = obj;
        this.f563j |= Integer.MIN_VALUE;
        return this.f562i.k(null, false, this);
    }
}
