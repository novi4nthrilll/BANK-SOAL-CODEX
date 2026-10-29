package Q0;

import E0.k;
import M0.g;
import M0.h;
import N0.r;
import O0.m;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p006b1.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1380a;

    public M0.c a(Context context, Looper looper, k kVar, Object obj, g gVar, h hVar) {
        switch (this.f1380a) {
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                kVar.getClass();
                Integer num = (Integer) kVar.f230i;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new p030i1.a(context, looper, kVar, bundle, gVar, hVar);
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                throw A0.c.g(obj);
            default:
                r rVar = (r) gVar;
                r rVar2 = (r) hVar;
                switch (this.f1380a) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        return new d(context, looper, kVar, (m) obj, rVar, rVar2);
                    case 1:
                        return new S0.h(context, looper, 308, kVar, rVar, rVar2);
                    case 2:
                        return new i(context, looper, kVar, rVar, rVar2);
                    default:
                        throw new UnsupportedOperationException("buildClient must be implemented");
                }
        }
    }
}
