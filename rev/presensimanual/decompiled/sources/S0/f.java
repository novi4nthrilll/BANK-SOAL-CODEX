package S0;

import O0.u;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Z0.b implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p033j1.e f1584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p033j1.e eVar) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", 0);
        this.f1584c = eVar;
    }

    @Override // S0.d
    public final void i(Status status, R0.c cVar) {
        p033j1.e eVar = this.f1584c;
        if (status.f2707a <= 0) {
            eVar.f4990a.j(cVar);
        } else {
            eVar.b(u.j(status));
        }
    }

    @Override // Z0.b
    public final boolean k(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            Z0.c.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i3 == 2) {
            Status status = (Status) Z0.c.a(parcel, Status.CREATOR);
            R0.c cVar = (R0.c) Z0.c.a(parcel, R0.c.CREATOR);
            Z0.c.b(parcel);
            i(status, cVar);
            return true;
        }
        if (i3 == 3) {
            Z0.c.b(parcel);
            throw new UnsupportedOperationException();
        }
        if (i3 != 4) {
            return false;
        }
        Z0.c.b(parcel);
        throw new UnsupportedOperationException();
    }
}
