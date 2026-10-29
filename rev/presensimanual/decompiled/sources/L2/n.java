package L2;

import p046n2.C0782n;

/* JADX INFO: loaded from: classes.dex */
public final class n extends u2.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0782n f930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0782n f933j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f934k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0782n c0782n, p063s2.d dVar) {
        super(dVar);
        this.f933j = c0782n;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f931h = obj;
        this.f932i |= Integer.MIN_VALUE;
        return this.f933j.c(null, this);
    }
}
