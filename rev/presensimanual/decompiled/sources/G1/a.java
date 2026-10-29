package G1;

import A0.g;
import B2.h;
import R1.i;
import S1.c;
import S1.m;
import W1.C0095c;
import W1.q;
import W1.s;
import W1.u;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import defpackage.Lidctfcodex26simpeg;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p013d1.I;
import p023g1.d;
import p023g1.f;
import p033j1.b;
import p033j1.k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements m, c, q, p033j1.a, p033j1.c, b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f315d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(int i3, Object obj) {
        this.f315d = i3;
        this.e = obj;
    }

    @Override // S1.m
    public void a(g gVar, i iVar) {
        boolean z2;
        int i3 = Lidctfcodex26simpeg.f953j;
        h.e(gVar, "call");
        if (!h.a((String) gVar.e, "checkMockNative")) {
            iVar.b();
            return;
        }
        Object systemService = ((Lidctfcodex26simpeg) this.e).getSystemService("location");
        h.c(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        List<String> allProviders = locationManager.getAllProviders();
        h.d(allProviders, "getAllProviders(...)");
        Iterator<String> it = allProviders.iterator();
        while (it.hasNext()) {
            try {
                Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
                if (lastKnownLocation != null && lastKnownLocation.isFromMockProvider()) {
                    z2 = true;
                    iVar.c(Boolean.valueOf(z2));
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
        z2 = false;
        iVar.c(Boolean.valueOf(z2));
    }

    @Override // p033j1.b
    public void b(Exception exc) {
        Log.e("Geolocator", "Error trying to get last the last known GPS location");
        ((E1.b) this.e).c(2);
    }

    @Override // p033j1.a
    public void d(k kVar) {
        boolean zF = kVar.f();
        p006b1.c cVar = (p006b1.c) this.e;
        if (!zF) {
            ((i) cVar.f2515d).a(I.c(3), I.b(3), null);
        }
        d dVar = (d) kVar.d();
        if (dVar == null) {
            ((i) cVar.f2515d).a(I.c(3), I.b(3), null);
        } else {
            f fVar = dVar.f4492a.f4494b;
            ((i) cVar.f2515d).c(Boolean.valueOf((fVar != null && fVar.f4495a) || (fVar != null && fVar.f4496b)));
        }
    }

    @Override // S1.c
    public void e(Object obj) {
        boolean z2 = false;
        if (obj != null) {
            try {
                z2 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e);
            }
        }
        ((C1.h) ((a) this.e).e).b(z2);
    }

    @Override // p033j1.c
    public void g(Object obj) {
        switch (this.f315d) {
            case 12:
                p065t0.c cVar = (p065t0.c) this.e;
                cVar.g(cVar.f5705f);
                break;
            default:
                ((E1.b) this.e).a((Location) obj);
                break;
        }
    }

    @Override // W1.q
    public void onError(String str) {
        switch (this.f315d) {
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((s) this.e).c(new u("setExposurePointFailed", "Could not set exposure point.", null));
                break;
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                ((s) this.e).c(new u("setZoomLevelFailed", "Could not set zoom level.", null));
                break;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                ((s) this.e).c(new u("setFocusPointFailed", "Could not set focus point.", null));
                break;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((s) this.e).c(new u("setExposureOffsetFailed", "Could not set exposure offset.", null));
                break;
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((s) this.e).c(new u("setExposureModeFailed", "Could not set exposure mode.", null));
                break;
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                ((s) this.e).c(new u("setFlashModeFailed", "Could not set flash mode.", null));
                break;
            default:
                ((C0095c) this.e).f1734c.f1743h.Q(str);
                break;
        }
    }
}
