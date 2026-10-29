package L2;

/* JADX INFO: loaded from: classes.dex */
public final class h extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f910k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, p063s2.d dVar) {
        super(dVar);
        this.f908i = iVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f906g = obj;
        this.f907h |= Integer.MIN_VALUE;
        return this.f908i.q(null, this);
    }
}
