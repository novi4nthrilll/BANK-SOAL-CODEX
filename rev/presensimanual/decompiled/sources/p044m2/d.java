package p044m2;

import D0.b;
import M.k;
import O1.a;
import S1.f;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public class d implements a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f5350d;

    public final ArrayList a(c cVar) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f5350d;
        switch (cVar.ordinal()) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                str = null;
                break;
            case 1:
                str = "music";
                break;
            case 2:
                str = "podcasts";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "ringtones";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "alarms";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "notifications";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "pictures";
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "movies";
                break;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                str = "downloads";
                break;
            case 9:
                str = "dcim";
                break;
            case 10:
                str = "documents";
                break;
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // O1.a
    public final void b(b bVar) {
        try {
            I.k((f) bVar.f182f, this);
        } catch (Exception e) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e);
        }
        this.f5350d = (Context) bVar.e;
    }

    @Override // O1.a
    public final void k(b bVar) {
        I.k((f) bVar.f182f, null);
    }
}
