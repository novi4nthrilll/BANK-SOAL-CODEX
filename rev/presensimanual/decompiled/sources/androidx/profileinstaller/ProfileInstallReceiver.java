package androidx.profileinstaller;

import W.d;
import W.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras;
        File codeCacheDir;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            f.s(context, new d(), new A0.f(25, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                A0.f fVar = new A0.f(25, this);
                try {
                    f.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    fVar.d(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    fVar.d(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            A0.f fVar2 = new A0.f(25, this);
            if (Build.VERSION.SDK_INT < 24) {
                fVar2.d(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                fVar2.d(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        A0.f fVar3 = new A0.f(25, this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            fVar3.d(16, null);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            codeCacheDir = context.createDeviceProtectedStorageContext().getCodeCacheDir();
        } else {
            codeCacheDir = i3 >= 23 ? context.getCodeCacheDir() : context.getCacheDir();
        }
        if (f.c(codeCacheDir)) {
            fVar3.d(14, null);
        } else {
            fVar3.d(15, null);
        }
    }
}
