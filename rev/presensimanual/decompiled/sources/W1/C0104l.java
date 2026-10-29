package W1;

import O0.C0092f;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraManager;
import android.location.Geocoder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0329s;
import com.google.android.gms.internal.mlkit_vision_face_bundled.InterfaceC0369w;
import com.google.android.gms.location.LocationRequest;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.StringTokenizer;
import p013d1.AbstractC0543w2;

/* JADX INFO: renamed from: W1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0104l implements N0.m, p029i0.h, S1.m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1774d;
    public Object e;

    public /* synthetic */ C0104l(Object obj) {
        this.e = obj;
    }

    @Override // S1.m
    public void a(A0.g gVar, R1.i iVar) {
        int i3 = 1;
        int i4 = 0;
        String str = (String) gVar.e;
        str.getClass();
        C0104l c0104l = (C0104l) this.e;
        Locale locale = null;
        switch (str) {
            case "placemarkFromCoordinates":
                double dDoubleValue = ((Double) gVar.k("latitude")).doubleValue();
                double dDoubleValue2 = ((Double) gVar.k("longitude")).doubleValue();
                p051p0.e eVar = new p051p0.e(iVar, dDoubleValue, dDoubleValue2);
                Locale locale2 = (Locale) c0104l.f1774d;
                Context context = (Context) c0104l.e;
                Geocoder geocoder = locale2 != null ? new Geocoder(context, locale2) : new Geocoder(context);
                if (Build.VERSION.SDK_INT < 33) {
                    try {
                        eVar.onGeocode(geocoder.getFromLocation(dDoubleValue, dDoubleValue2, 5));
                    } catch (IOException e) {
                        eVar.onError(e.getMessage());
                    }
                    break;
                } else {
                    geocoder.getFromLocation(dDoubleValue, dDoubleValue2, 5, new p051p0.b(eVar, i3));
                    break;
                }
                break;
            case "isPresent":
                iVar.c(Boolean.valueOf(Geocoder.isPresent()));
                break;
            case "locationFromAddress":
                String str2 = (String) gVar.k("address");
                if (str2 == null || str2.isEmpty()) {
                    iVar.a("ARGUMENT_ERROR", "Supply a valid value for the 'address' parameter.", null);
                }
                c0104l.f(str2, new p051p0.d(iVar, str2, i4));
                break;
            case "placemarkFromAddress":
                String str3 = (String) gVar.k("address");
                if (str3 == null || str3.isEmpty()) {
                    iVar.a("ARGUMENT_ERROR", "Supply a valid value for the 'address' parameter.", null);
                }
                c0104l.f(str3, new p051p0.d(iVar, str3, i3));
                break;
            case "setLocaleIdentifier":
                String str4 = (String) gVar.k("localeIdentifier");
                if (str4 != null && !str4.isEmpty()) {
                    StringTokenizer stringTokenizer = new StringTokenizer(str4, "_", false);
                    String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
                    String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
                    String strNextToken3 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
                    if (strNextToken != null && strNextToken2 != null && strNextToken3 != null) {
                        locale = new Locale(strNextToken, strNextToken2, strNextToken3);
                    } else if (strNextToken != null && strNextToken2 != null) {
                        locale = new Locale(strNextToken, strNextToken2);
                    } else if (strNextToken != null) {
                        locale = new Locale(strNextToken);
                    }
                }
                c0104l.f1774d = locale;
                iVar.c(Boolean.TRUE);
                break;
            default:
                iVar.b();
                break;
        }
    }

    public n1.c b() {
        return new n1.c((String) this.f1774d, ((HashMap) this.e) == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap((HashMap) this.e)));
    }

    public View c(int i3, int i4, int i5, int i6) {
        Y.L l3 = (Y.L) this.e;
        int iK = l3.k();
        int iJ = l3.j();
        int i7 = i4 > i3 ? 1 : -1;
        View view = null;
        while (i3 != i4) {
            View viewI = l3.i(i3);
            int iO = l3.o(viewI);
            int iM = l3.m(viewI);
            Y.K k3 = (Y.K) this.f1774d;
            k3.f1841b = iK;
            k3.f1842c = iJ;
            k3.f1843d = iO;
            k3.e = iM;
            if (i5 != 0) {
                k3.f1840a = i5;
                if (k3.a()) {
                    return viewI;
                }
            }
            if (i6 != 0) {
                k3.f1840a = i6;
                if (k3.a()) {
                    view = viewI;
                }
            }
            i3 += i7;
        }
        return view;
    }

    public androidx.lifecycle.E d(Class cls, String str) {
        B2.h.e(str, "key");
        throw null;
    }

    public void e(p075y.f fVar) {
        int i3 = fVar.f5847b;
        Handler handler = (Handler) this.f1774d;
        androidx.lifecycle.y yVar = (androidx.lifecycle.y) this.e;
        if (i3 != 0) {
            handler.post(new E0.l(yVar, i3));
        } else {
            handler.post(new E0.e(17, yVar, fVar.f5846a));
        }
    }

    public void f(String str, p051p0.a aVar) {
        Locale locale = (Locale) this.f1774d;
        Context context = (Context) this.e;
        Geocoder geocoder = locale != null ? new Geocoder(context, locale) : new Geocoder(context);
        if (Build.VERSION.SDK_INT >= 33) {
            geocoder.getFromLocationName(str, 5, new p051p0.b(aVar, 0));
            return;
        }
        try {
            aVar.onGeocode(geocoder.getFromLocationName(str, 5));
        } catch (IOException e) {
            aVar.onError(e.getMessage());
        }
    }

    public void g(C1.b bVar, boolean z2) {
        PendingIntent activity;
        C0092f c0092f = (C0092f) bVar.f146g;
        String str = c0092f.f1269a;
        String str2 = c0092f.f1270b;
        Context context = (Context) this.e;
        int identifier = context.getResources().getIdentifier(str, str2, context.getPackageName());
        if (identifier == 0) {
            Context context2 = (Context) this.e;
            context2.getResources().getIdentifier("ic_launcher.png", "mipmap", context2.getPackageName());
        }
        p054q.g gVar = (p054q.g) this.f1774d;
        String str3 = (String) bVar.f144d;
        gVar.getClass();
        gVar.e = p054q.g.b(str3);
        gVar.f5578p.icon = identifier;
        gVar.f5568f = p054q.g.b((String) bVar.e);
        Context context3 = (Context) this.e;
        Intent launchIntentForPackage = context3.getPackageManager().getLaunchIntentForPackage(context3.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setPackage(null);
            launchIntentForPackage.setFlags(270532608);
            activity = PendingIntent.getActivity(context3, 0, launchIntentForPackage, Build.VERSION.SDK_INT > 23 ? 201326592 : 134217728);
        } else {
            activity = null;
        }
        gVar.f5569g = activity;
        boolean z3 = bVar.f143c;
        Notification notification = gVar.f5578p;
        if (z3) {
            notification.flags |= 2;
        } else {
            notification.flags &= -3;
        }
        this.f1774d = gVar;
        Integer num = (Integer) bVar.f147h;
        if (num != null) {
            gVar.f5575m = num.intValue();
            this.f1774d = gVar;
        }
        if (z2) {
            Context context4 = (Context) this.e;
            p054q.v vVar = new p054q.v(context4);
            Notification notificationA = ((p054q.g) this.f1774d).a();
            Bundle bundle = notificationA.extras;
            if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
                vVar.f5597a.notify(null, 75415, notificationA);
                return;
            }
            p054q.r rVar = new p054q.r(context4.getPackageName(), 75415, notificationA);
            synchronized (p054q.v.e) {
                try {
                    if (p054q.v.f5596f == null) {
                        p054q.v.f5596f = new p054q.u(context4.getApplicationContext());
                    }
                    p054q.v.f5596f.f5590b.obtainMessage(0, rVar).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            vVar.f5597a.cancel(null, 75415);
        }
    }

    public void h(C0329s c0329s) {
        if (((HashMap) this.e) == null) {
            this.e = new HashMap();
        }
        ((HashMap) this.e).put(InterfaceC0369w.class, c0329s);
    }

    @Override // N0.m
    public void r(Object obj, Object obj2) {
        p006b1.h hVar;
        L0.c cVar;
        p033j1.e eVar = (p033j1.e) obj2;
        p006b1.i iVar = (p006b1.i) obj;
        N0.C c3 = (N0.C) this.e;
        LocationRequest locationRequest = (LocationRequest) this.f1774d;
        iVar.getClass();
        N0.j jVarC = c3.c();
        N0.h hVar2 = (N0.h) jVarC.f1086c;
        Objects.requireNonNull(hVar2);
        L0.c[] cVarArrB = iVar.b();
        boolean z2 = false;
        if (cVarArrB != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= cVarArrB.length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrB[i3];
                if ("location_updates_with_callback".equals(cVar.f866a)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (cVar != null && cVar.a() >= 1) {
                z2 = true;
            }
        }
        synchronized (iVar.f2527z) {
            try {
                p006b1.h hVar3 = (p006b1.h) iVar.f2527z.getOrDefault(hVar2, null);
                if (hVar3 == null || z2) {
                    hVar = new p006b1.h(c3);
                    iVar.f2527z.put(hVar2, hVar);
                } else {
                    hVar3.n(jVarC);
                    hVar = hVar3;
                    hVar3 = null;
                }
                if (z2) {
                    p006b1.y yVar = (p006b1.y) iVar.q();
                    p006b1.k kVar = new p006b1.k(2, hVar3 == null ? null : hVar3, hVar, null, hVar2.f1083b + "@" + System.identityHashCode(hVar2.f1082a));
                    p006b1.f fVar = new p006b1.f(null, eVar);
                    Parcel parcelG = yVar.g();
                    p006b1.b.b(parcelG, kVar);
                    p006b1.b.b(parcelG, locationRequest);
                    parcelG.writeStrongBinder(fVar);
                    yVar.l(parcelG, 88);
                } else {
                    p006b1.y yVar2 = (p006b1.y) iVar.q();
                    p006b1.m mVar = new p006b1.m(1, new p006b1.l(locationRequest, null, false, false, false, false, Long.MAX_VALUE), null, hVar, null, new p006b1.d(eVar, hVar), hVar2.f1083b + "@" + System.identityHashCode(hVar2.f1082a));
                    Parcel parcelG2 = yVar2.g();
                    p006b1.b.b(parcelG2, mVar);
                    yVar2.l(parcelG2, 59);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ C0104l(Object obj, Object obj2) {
        this.e = obj;
        this.f1774d = obj2;
    }

    public C0104l(String str, CameraManager cameraManager) {
        this.f1774d = str;
        this.e = cameraManager.getCameraCharacteristics(str);
    }

    public C0104l(AbstractC0543w2 abstractC0543w2, androidx.lifecycle.F f3, T.b bVar) {
        B2.h.e(abstractC0543w2, "store");
        B2.h.e(bVar, "defaultCreationExtras");
        this.e = f3;
        this.f1774d = bVar;
    }

    public C0104l(Y.L l3) {
        this.e = l3;
        Y.K k3 = new Y.K();
        k3.f1840a = 0;
        this.f1774d = k3;
    }
}
