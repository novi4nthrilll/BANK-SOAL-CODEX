package N0;

import W1.C0104l;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class E extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p033j1.e f1050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1052d;

    public E(int i3, p033j1.e eVar) {
        super(i3);
        this.f1050b = eVar;
    }

    @Override // N0.w
    public final boolean a(r rVar) {
        switch (this.f1051c) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return ((A) this.f1052d).f1038a.f1041d;
            default:
                A a3 = (A) rVar.f1099g.get((h) this.f1052d);
                return a3 != null && a3.f1038a.f1041d;
        }
    }

    @Override // N0.w
    public final L0.c[] b(r rVar) {
        switch (this.f1051c) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                break;
            default:
                break;
        }
        return null;
    }

    @Override // N0.w
    public final void c(Status status) {
        this.f1050b.b(new M0.d(status));
    }

    @Override // N0.w
    public final void d(RuntimeException runtimeException) {
        this.f1050b.b(runtimeException);
    }

    @Override // N0.w
    public final void e(r rVar) throws DeadObjectException {
        try {
            h(rVar);
        } catch (DeadObjectException e) {
            c(w.g(e));
            throw e;
        } catch (RemoteException e3) {
            c(w.g(e3));
        } catch (RuntimeException e4) {
            this.f1050b.b(e4);
        }
    }

    @Override // N0.w
    public final /* bridge */ /* synthetic */ void f(A0.g gVar, boolean z2) {
        int i3 = this.f1051c;
    }

    public final void h(r rVar) {
        switch (this.f1051c) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                C c3 = ((A) this.f1052d).f1038a;
                ((C0104l) ((l) c3.f1042f).f1089c).r(rVar.f1096c, this.f1050b);
                h hVar = (h) ((j) ((A) this.f1052d).f1038a.e).f1086c;
                if (hVar != null) {
                    rVar.f1099g.put(hVar, (A) this.f1052d);
                }
                break;
            default:
                A a3 = (A) rVar.f1099g.remove((h) this.f1052d);
                p033j1.e eVar = this.f1050b;
                if (a3 == null) {
                    eVar.f4990a.j(Boolean.FALSE);
                } else {
                    ((C) ((l) a3.f1039b.e).f1090d).r(rVar.f1096c, eVar);
                    j jVar = (j) a3.f1038a.e;
                    jVar.f1085b = null;
                    jVar.f1086c = null;
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E(h hVar, p033j1.e eVar) {
        this(4, eVar);
        this.f1051c = 1;
        this.f1052d = hVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E(A a3, p033j1.e eVar) {
        this(3, eVar);
        this.f1051c = 0;
        this.f1052d = a3;
    }

    private final /* bridge */ /* synthetic */ void i(A0.g gVar, boolean z2) {
    }

    private final /* bridge */ /* synthetic */ void j(A0.g gVar, boolean z2) {
    }
}
