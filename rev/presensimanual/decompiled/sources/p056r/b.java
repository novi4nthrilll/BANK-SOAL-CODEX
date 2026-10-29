package p056r;

import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import java.util.Objects;
import p054q.d;
import p054q.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i3) {
        int iMyUid;
        int iC = 1;
        if ((i3 & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i3 & 1);
        }
        String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        int iMyPid = Process.myPid();
        int iMyUid2 = Process.myUid();
        String packageName = context.getPackageName();
        byte b3 = -1;
        if (context.checkPermission(str2, iMyPid, iMyUid2) != -1) {
            int i4 = Build.VERSION.SDK_INT;
            String strD = i4 >= 23 ? d.d(str2) : null;
            if (strD == null) {
                b3 = 0;
            } else if (packageName != null) {
                iMyUid = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid == iMyUid2 || !Objects.equals(packageName2, packageName)) {
                    if (i4 >= 23) {
                        iC = d.c((AppOpsManager) d.a(context, AppOpsManager.class), strD, packageName);
                    }
                } else if (i4 >= 29) {
                    AppOpsManager appOpsManagerC = e.c(context);
                    iC = e.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                    if (iC == 0) {
                        iC = e.a(appOpsManagerC, strD, iMyUid2, e.b(context));
                    }
                } else if (i4 >= 23) {
                    iC = d.c((AppOpsManager) d.a(context, AppOpsManager.class), strD, packageName);
                }
                if (iC == 0) {
                    b3 = 0;
                } else {
                    b3 = -2;
                }
            } else {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid2);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                    iMyUid = Process.myUid();
                    String packageName3 = context.getPackageName();
                    if (iMyUid == iMyUid2) {
                        if (i4 >= 23) {
                            iC = d.c((AppOpsManager) d.a(context, AppOpsManager.class), strD, packageName);
                        }
                    } else if (i4 >= 23) {
                        iC = d.c((AppOpsManager) d.a(context, AppOpsManager.class), strD, packageName);
                    }
                    if (iC == 0) {
                        b3 = 0;
                    } else {
                        b3 = -2;
                    }
                }
            }
        }
        if (b3 == 0) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
        }
        throw new RuntimeException("Permission " + str2 + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
