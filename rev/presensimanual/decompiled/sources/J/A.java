package J;

/* JADX INFO: loaded from: classes.dex */
public final class A extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public P f508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f512k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(P p3, u2.b bVar) {
        super(bVar);
        this.f511j = p3;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f510i = obj;
        this.f512k |= Integer.MIN_VALUE;
        return this.f511j.i(this);
    }
}
