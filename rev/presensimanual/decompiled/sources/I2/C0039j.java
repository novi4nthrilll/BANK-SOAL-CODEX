package I2;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: I2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0039j extends U implements InterfaceC0038i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f480h;

    public C0039j(b0 b0Var) {
        this.f480h = b0Var;
    }

    @Override // I2.InterfaceC0038i
    public final boolean e(Throwable th) {
        return n().w(th);
    }

    @Override // A2.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) throws IllegalAccessException, InvocationTargetException {
        o((Throwable) obj);
        return p055q2.g.f5603a;
    }

    @Override // I2.W
    public final void o(Throwable th) throws IllegalAccessException, InvocationTargetException {
        this.f480h.s(n());
    }
}
