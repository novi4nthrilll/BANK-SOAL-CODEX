package L2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f922k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, p063s2.d dVar) {
        super(dVar);
        this.f921j = lVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f920i = obj;
        this.f922k |= Integer.MIN_VALUE;
        return this.f921j.c(null, this);
    }
}
