package J;

/* JADX INFO: renamed from: J.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0074u extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public P f671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Q2.d f672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f675k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0074u(P p3, u2.b bVar) {
        super(bVar);
        this.f674j = p3;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f673i = obj;
        this.f675k |= Integer.MIN_VALUE;
        return P.a(this.f674j, this);
    }
}
