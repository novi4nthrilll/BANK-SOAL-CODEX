package L;

import R2.p;

/* JADX INFO: loaded from: classes.dex */
public final class b extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f823h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f824i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f825j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f826k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, u2.b bVar) {
        super(bVar);
        this.f825j = cVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f824i = obj;
        this.f826k |= Integer.MIN_VALUE;
        return c.a(this.f825j, this);
    }
}
