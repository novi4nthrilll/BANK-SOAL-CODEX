package J;

/* JADX INFO: loaded from: classes.dex */
public final class r extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0072s f665i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0072s c0072s, p063s2.d dVar) {
        super(dVar);
        this.f665i = c0072s;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f663g = obj;
        this.f664h |= Integer.MIN_VALUE;
        return this.f665i.c(null, this);
    }
}
