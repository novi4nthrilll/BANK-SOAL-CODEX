package J;

/* JADX INFO: renamed from: J.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0063i extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E0.n f629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E0.n f631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f632j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0063i(E0.n nVar, u2.b bVar) {
        super(bVar);
        this.f631i = nVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f630h = obj;
        this.f632j |= Integer.MIN_VALUE;
        return this.f631i.a(this);
    }
}
