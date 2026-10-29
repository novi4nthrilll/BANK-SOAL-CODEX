package J;

/* JADX INFO: renamed from: J.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0077x extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public P f684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Q2.d f685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f688k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0077x(P p3, u2.b bVar) {
        super(bVar);
        this.f687j = p3;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f686i = obj;
        this.f688k |= Integer.MIN_VALUE;
        return P.c(this.f687j, this);
    }
}
