package L2;

/* JADX INFO: loaded from: classes.dex */
public final class b extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public K2.p f891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f893i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f894j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, u2.b bVar) {
        super(bVar);
        this.f893i = cVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f892h = obj;
        this.f894j |= Integer.MIN_VALUE;
        return this.f893i.a(null, this);
    }
}
