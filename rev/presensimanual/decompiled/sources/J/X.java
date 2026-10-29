package J;

/* JADX INFO: loaded from: classes.dex */
public final class X extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Q2.d f601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Z f604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f605k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Z z2, u2.b bVar) {
        super(bVar);
        this.f604j = z2;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f603i = obj;
        this.f605k |= Integer.MIN_VALUE;
        return this.f604j.c(null, this);
    }
}
