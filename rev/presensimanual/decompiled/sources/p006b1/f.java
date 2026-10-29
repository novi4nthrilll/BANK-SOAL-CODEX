package p006b1;

import N0.InterfaceC0084e;
import Z0.b;
import Z0.c;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p013d1.AbstractC0481m;
import p033j1.e;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b implements InterfaceC0084e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Boolean f2520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f2521d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Boolean bool, e eVar) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
        this.f2520c = bool;
        this.f2521d = eVar;
    }

    @Override // N0.InterfaceC0084e
    public final void c(Status status) {
        AbstractC0481m.a(status, this.f2520c, this.f2521d);
    }

    @Override // Z0.b
    public final boolean k(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        Status status = (Status) c.a(parcel, Status.CREATOR);
        c.b(parcel);
        c(status);
        return true;
    }
}
