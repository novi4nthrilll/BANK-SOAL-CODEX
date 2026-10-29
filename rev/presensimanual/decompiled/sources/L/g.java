package L;

/* JADX INFO: loaded from: classes.dex */
public final class g extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f838i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f841l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, u2.b bVar) {
        super(bVar);
        this.f840k = iVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f839j = obj;
        this.f841l |= Integer.MIN_VALUE;
        return this.f840k.a(null, this);
    }
}
