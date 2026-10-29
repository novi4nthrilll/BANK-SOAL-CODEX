package J;

/* JADX INFO: loaded from: classes.dex */
public final class U extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E0.n f588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Q2.a f589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E0.n f591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f592k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(E0.n nVar, u2.b bVar) {
        super(bVar);
        this.f591j = nVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f590i = obj;
        this.f592k |= Integer.MIN_VALUE;
        return this.f591j.c(this);
    }
}
