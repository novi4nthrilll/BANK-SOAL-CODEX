package p073x0;

import A0.i;
import H0.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p006b1.c;
import p013d1.I;
import p076y0.b;
import p076y0.e;
import p076y0.f;
import p076y0.g;
import p076y0.h;
import p076y0.j;
import p076y0.k;
import p076y0.l;
import p076y0.n;
import p076y0.o;
import p076y0.q;
import p076y0.r;
import p076y0.s;
import p076y0.t;
import p076y0.u;
import p076y0.v;

/* JADX INFO: loaded from: classes.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f5831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f5832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f5834d;
    public final a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f5835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5836g;

    public d(Context context, a aVar, a aVar2) {
        p052p1.d dVar = new p052p1.d();
        p076y0.c cVar = p076y0.c.f5869a;
        dVar.a(o.class, cVar);
        dVar.a(p076y0.i.class, cVar);
        f fVar = f.f5881a;
        dVar.a(s.class, fVar);
        dVar.a(l.class, fVar);
        p076y0.d dVar2 = p076y0.d.f5871a;
        dVar.a(q.class, dVar2);
        dVar.a(j.class, dVar2);
        b bVar = b.f5857a;
        dVar.a(p076y0.a.class, bVar);
        dVar.a(h.class, bVar);
        e eVar = e.f5874a;
        dVar.a(r.class, eVar);
        dVar.a(k.class, eVar);
        g gVar = g.f5888a;
        dVar.a(v.class, gVar);
        dVar.a(n.class, gVar);
        dVar.f5552d = true;
        this.f5831a = new c(dVar);
        this.f5833c = context;
        this.f5832b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5834d = b(a.f5821c);
        this.e = aVar2;
        this.f5835f = aVar;
        this.f5836g = 40000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(I.g("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x0110  */
    public final p079z0.a a(p079z0.a aVar) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.f5832b.getActiveNetworkInfo();
        E0.k kVarC = aVar.c();
        int i3 = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) kVarC.f230i;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i3));
        kVarC.a("model", Build.MODEL);
        kVarC.a("hardware", Build.HARDWARE);
        kVarC.a("device", Build.DEVICE);
        kVarC.a("product", Build.PRODUCT);
        kVarC.a("os-uild", Build.ID);
        kVarC.a("manufacturer", Build.MANUFACTURER);
        kVarC.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) kVarC.f230i;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i4 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = u.f5920d;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) kVarC.f230i;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = t.f5919d;
                subtype = 100;
            } else if (((t) t.f5919d.get(subtype)) == null) {
            }
            map = (HashMap) kVarC.f230i;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            kVarC.a("country", Locale.getDefault().getCountry());
            kVarC.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f5833c;
            kVarC.a("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TransportRuntime.".concat("CctTransportBackend"), "Unable to find version code for package", e);
            }
            kVarC.a("application_build", Integer.toString(i4));
            return kVarC.c();
        }
        SparseArray sparseArray3 = t.f5919d;
        subtype = 0;
        map = (HashMap) kVarC.f230i;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        kVarC.a("country", Locale.getDefault().getCountry());
        kVarC.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f5833c;
        kVarC.a("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i4 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        kVarC.a("application_build", Integer.toString(i4));
        return kVarC.c();
    }
}
