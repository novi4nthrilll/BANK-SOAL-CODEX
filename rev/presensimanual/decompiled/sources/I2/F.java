package I2;

/* JADX INFO: loaded from: classes.dex */
public final class F implements e0, A2.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f436d;

    public F(E e) {
        this.f436d = e;
    }

    public final void b(Throwable th) {
        this.f436d.c();
    }

    @Override // A2.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        b((Throwable) obj);
        return p055q2.g.f5603a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f436d + ']';
    }
}
