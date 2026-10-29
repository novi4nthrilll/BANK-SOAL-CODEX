package p006b1;

import E0.k;
import L0.c;
import N0.r;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;
import p023g1.j;
import p045n.l;

/* JADX INFO: loaded from: classes.dex */
public final class i extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final l f2525A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l f2526y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final l f2527z;

    public i(Context context, Looper looper, k kVar, r rVar, r rVar2) {
        super(context, looper, 23, kVar, rVar, rVar2);
        this.f2526y = new l();
        this.f2527z = new l();
        this.f2525A = new l();
    }

    @Override // M0.c
    public final int m() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof y ? (y) iInterfaceQueryLocalInterface : new y(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 2);
    }

    @Override // com.google.android.gms.common.internal.a
    public final c[] o() {
        return j.f4507a;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final void u() {
        System.currentTimeMillis();
        synchronized (this.f2526y) {
            this.f2526y.clear();
        }
        synchronized (this.f2527z) {
            this.f2527z.clear();
        }
        synchronized (this.f2525A) {
            this.f2525A.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean v() {
        return true;
    }
}
