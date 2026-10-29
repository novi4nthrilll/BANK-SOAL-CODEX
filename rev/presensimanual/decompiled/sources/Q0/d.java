package Q0;

import E0.k;
import N0.r;
import O0.m;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m f1382y;

    public d(Context context, Looper looper, k kVar, m mVar, r rVar, r rVar2) {
        super(context, looper, 270, kVar, rVar, rVar2);
        this.f1382y = mVar;
    }

    @Override // M0.c
    public final int m() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final L0.c[] o() {
        return Z0.d.f1949b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        m mVar = this.f1382y;
        mVar.getClass();
        Bundle bundle = new Bundle();
        String str = mVar.f1292b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
