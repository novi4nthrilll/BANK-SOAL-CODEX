package com.google.android.gms.common.api;

import L0.a;
import L0.d;
import N0.C0083d;
import O0.u;
import Z0.f;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2704d = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        super.onActivityResult(i3, i4, intent);
        if (i3 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2704d = 0;
            setResult(i4, intent);
            if (booleanExtra) {
                C0083d c0083dF = C0083d.f(this);
                if (i4 == -1) {
                    f fVar = c0083dF.f1080m;
                    fVar.sendMessage(fVar.obtainMessage(3));
                } else if (i4 == 0) {
                    c0083dF.g(new a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i3 == 2) {
            this.f2704d = 0;
            setResult(i4, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f2704d = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2704d = bundle.getInt("resolution");
        }
        if (this.f2704d != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
                return;
            }
            if (pendingIntent == null) {
                u.f(num);
                d.f870d.d(this, num.intValue(), this);
                this.f2704d = 1;
                return;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f2704d = 1;
            } catch (ActivityNotFoundException e3) {
                if (extras.getBoolean("notify_manager", true)) {
                    C0083d.f(this).g(new a(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strConcat = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (Build.FINGERPRINT.contains("generic")) {
                        strConcat = strConcat.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strConcat, e3);
                }
                this.f2704d = 1;
                finish();
            } catch (IntentSender.SendIntentException e4) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e4);
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2704d);
        super.onSaveInstanceState(bundle);
    }
}
