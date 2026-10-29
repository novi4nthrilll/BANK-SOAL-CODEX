package p013d1;

import D0.d;
import O.c;
import O.p;
import O.q;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p071w1.b;

/* JADX INFO: renamed from: d1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0487n {
    public static q a(Context context) {
        ProviderInfo providerInfo;
        d dVar;
        ApplicationInfo applicationInfo;
        b cVar = Build.VERSION.SDK_INT >= 28 ? new c(2) : new b(2);
        PackageManager packageManager = context.getPackageManager();
        A.d.b(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            dVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrC = cVar.c(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrC) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                dVar = null;
            }
        }
        if (dVar == null) {
            return null;
        }
        return new q(new p(context, dVar));
    }
}
