package N0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class F extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I1.x f1053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p033j1.e f1054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0080a f1055d;

    public F(int i3, I1.x xVar, p033j1.e eVar, C0080a c0080a) {
        super(i3);
        this.f1054c = eVar;
        this.f1053b = xVar;
        this.f1055d = c0080a;
        if (i3 == 2 && xVar.f429b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // N0.w
    public final boolean a(r rVar) {
        return this.f1053b.f429b;
    }

    @Override // N0.w
    public final L0.c[] b(r rVar) {
        return (L0.c[]) this.f1053b.f431d;
    }

    @Override // N0.w
    public final void c(Status status) {
        this.f1055d.getClass();
        this.f1054c.b(O0.u.j(status));
    }

    @Override // N0.w
    public final void d(RuntimeException runtimeException) {
        this.f1054c.b(runtimeException);
    }

    @Override // N0.w
    public final void e(r rVar) throws DeadObjectException {
        p033j1.e eVar = this.f1054c;
        try {
            I1.x xVar = this.f1053b;
            ((m) ((I1.x) xVar.e).f431d).r(rVar.f1096c, eVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e3) {
            c(w.g(e3));
        } catch (RuntimeException e4) {
            eVar.b(e4);
        }
    }

    @Override // N0.w
    public final void f(A0.g gVar, boolean z2) {
        Boolean boolValueOf = Boolean.valueOf(z2);
        Map map = (Map) gVar.e;
        p033j1.e eVar = this.f1054c;
        map.put(eVar, boolValueOf);
        A0.g gVar2 = new A0.g(gVar, eVar, 11, false);
        p033j1.k kVar = eVar.f4990a;
        kVar.getClass();
        kVar.f4998b.d(new p033j1.h(p033j1.f.f4991a, gVar2));
        kVar.l();
    }
}
