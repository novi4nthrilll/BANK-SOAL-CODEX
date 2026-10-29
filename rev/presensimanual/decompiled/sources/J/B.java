package J;

/* JADX INFO: loaded from: classes.dex */
public final class B extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public P f513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a0 f514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f518l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(P p3, p063s2.d dVar) {
        super(dVar);
        this.f517k = p3;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f516j = obj;
        this.f518l |= Integer.MIN_VALUE;
        return P.d(this.f517k, false, this);
    }
}
