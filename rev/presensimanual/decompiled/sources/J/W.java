package J;

/* JADX INFO: loaded from: classes.dex */
public final class W extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Q2.d f597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z f599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f600k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Z z2, u2.b bVar) {
        super(bVar);
        this.f599j = z2;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f598i = obj;
        this.f600k |= Integer.MIN_VALUE;
        return this.f599j.b(null, this);
    }
}
