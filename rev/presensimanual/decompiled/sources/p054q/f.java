package p054q;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import id.go.bangkalankab.simpeg.R;
import java.lang.reflect.InvocationTargetException;
import u.e;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f5558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f5559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5561d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f5562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f5563g;

    public f(String str, PendingIntent pendingIntent) {
        int i3;
        IconCompat iconCompatB = IconCompat.b(R.drawable.common_full_open_on_phone);
        Bundle bundle = new Bundle();
        this.f5561d = true;
        this.f5559b = iconCompatB;
        int iIntValue = iconCompatB.f2181a;
        if (iIntValue == -1 && (i3 = Build.VERSION.SDK_INT) >= 23) {
            Object obj = iconCompatB.f2182b;
            if (i3 >= 28) {
                iIntValue = e.c(obj);
            } else {
                try {
                    iIntValue = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                } catch (IllegalAccessException e) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e);
                    iIntValue = -1;
                } catch (NoSuchMethodException e3) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                    iIntValue = -1;
                } catch (InvocationTargetException e4) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                    iIntValue = -1;
                }
            }
        }
        if (iIntValue == 2) {
            this.e = iconCompatB.c();
        }
        this.f5562f = g.b(str);
        this.f5563g = pendingIntent;
        this.f5558a = bundle;
        this.f5560c = true;
        this.f5561d = true;
    }
}
