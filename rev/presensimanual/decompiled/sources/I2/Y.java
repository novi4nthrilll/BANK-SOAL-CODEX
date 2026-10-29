package I2;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends W {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Z f457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0039j f458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f459k;

    public Y(b0 b0Var, Z z2, C0039j c0039j, Object obj) {
        this.f456h = b0Var;
        this.f457i = z2;
        this.f458j = c0039j;
        this.f459k = obj;
    }

    @Override // A2.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return p055q2.g.f5603a;
    }

    @Override // I2.W
    public final void o(Throwable th) {
        C0039j c0039j = this.f458j;
        b0 b0Var = this.f456h;
        b0Var.getClass();
        C0039j c0039jM = b0.M(c0039j);
        Z z2 = this.f457i;
        Object obj = this.f459k;
        if (c0039jM != null) {
            while (AbstractC0052x.e(c0039jM.f480h, false, new Y(b0Var, z2, c0039jM, obj), 1) == d0.f472d) {
                c0039jM = b0.M(c0039jM);
                if (c0039jM == null) {
                }
            }
            return;
        }
        b0Var.q(b0Var.z(z2, obj));
    }
}
