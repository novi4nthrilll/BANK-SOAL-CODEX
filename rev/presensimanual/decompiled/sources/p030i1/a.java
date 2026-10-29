package p030i1;

import E0.k;
import M0.c;
import M0.g;
import M0.h;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.a implements c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Bundle f4592A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Integer f4593B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f4594y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k f4595z;

    public a(Context context, Looper looper, k kVar, Bundle bundle, g gVar, h hVar) {
        super(context, looper, 44, kVar, gVar, hVar);
        this.f4594y = true;
        this.f4595z = kVar;
        this.f4592A = bundle;
        this.f4593B = (Integer) kVar.f230i;
    }

    @Override // com.google.android.gms.common.internal.a, M0.c
    public final boolean l() {
        return this.f4594y;
    }

    @Override // M0.c
    public final int m() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        k kVar = this.f4595z;
        boolean zEquals = this.f2714c.getPackageName().equals((String) kVar.f227f);
        Bundle bundle = this.f4592A;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) kVar.f227f);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.signin.service.START";
    }
}
