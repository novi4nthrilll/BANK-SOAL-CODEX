package E0;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.y;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import k.Z0;
import p076y0.t;
import p076y0.u;
import p076y0.w;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.h f221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F0.c f222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f223d;
    public final Executor e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final G0.c f224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final H0.a f225g;

    public j(Context context, A0.h hVar, F0.c cVar, d dVar, Executor executor, G0.c cVar2, H0.a aVar) {
        this.f220a = context;
        this.f221b = hVar;
        this.f222c = cVar;
        this.f223d = dVar;
        this.e = executor;
        this.f224f = cVar2;
        this.f225g = aVar;
    }

    public final void a(p079z0.b bVar, int i3) {
        A0.a aVar;
        String str;
        p073x0.c cVarJ;
        String str2;
        Integer numValueOf;
        Z0 z2;
        A0.i iVarA = this.f221b.a(bVar.f5936a);
        A0.g gVar = new A0.g(2, this, bVar);
        F0.i iVar = (F0.i) this.f224f;
        Iterable iterable = (Iterable) iVar.d(gVar);
        if (iterable.iterator().hasNext()) {
            if (iVarA == null) {
                p000a.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", bVar);
                aVar = new A0.a(-1L, 3);
            } else {
                ArrayList<p079z0.a> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((F0.b) it.next()).f254c);
                }
                p073x0.d dVar = (p073x0.d) iVarA;
                HashMap map = new HashMap();
                for (p079z0.a aVar2 : arrayList) {
                    String str3 = aVar2.f5931a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(aVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(aVar2);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    p079z0.a aVar3 = (p079z0.a) ((List) entry.getValue()).get(0);
                    w wVar = w.f5921d;
                    long jB = dVar.f5835f.b();
                    long jB2 = dVar.e.b();
                    p076y0.j jVar = new p076y0.j(new p076y0.h(Integer.valueOf(aVar3.b("sdk-version")), aVar3.a("model"), aVar3.a("hardware"), aVar3.a("device"), aVar3.a("product"), aVar3.a("os-uild"), aVar3.a("manufacturer"), aVar3.a("fingerprint"), aVar3.a("locale"), aVar3.a("country"), aVar3.a("mcc_mnc"), aVar3.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (p079z0.a aVar4 : (List) entry.getValue()) {
                        p079z0.e eVar = aVar4.f5933c;
                        p070w0.b bVar2 = eVar.f5943a;
                        Iterator it3 = it2;
                        boolean zEquals = bVar2.equals(new p070w0.b("proto"));
                        byte[] bArr = eVar.f5944b;
                        if (zEquals) {
                            z2 = new Z0();
                            z2.f5133g = bArr;
                        } else {
                            if (bVar2.equals(new p070w0.b("json"))) {
                                String str4 = new String(bArr, Charset.forName("UTF-8"));
                                Z0 z3 = new Z0();
                                z3.f5134h = str4;
                                z2 = z3;
                            } else {
                                Log.w("TransportRuntime.".concat("CctTransportBackend"), "Received event of unsupported encoding " + bVar2 + ". Skipping...");
                            }
                            it2 = it3;
                        }
                        z2.f5131d = Long.valueOf(aVar4.f5934d);
                        z2.f5132f = Long.valueOf(aVar4.e);
                        String str5 = (String) aVar4.f5935f.get("tz-offset");
                        z2.f5135i = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        z2.f5136j = new p076y0.n((u) u.f5920d.get(aVar4.b("net-type")), (t) t.f5919d.get(aVar4.b("mobile-subtype")));
                        Integer num = aVar4.f5932b;
                        if (num != null) {
                            z2.e = num;
                        }
                        String strConcat = ((Long) z2.f5131d) == null ? " eventTimeMs" : "";
                        if (((Long) z2.f5132f) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) z2.f5135i) == null) {
                            strConcat = strConcat + " timezoneOffsetSeconds";
                        }
                        if (!strConcat.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strConcat));
                        }
                        arrayList4.add(new p076y0.k(((Long) z2.f5131d).longValue(), (Integer) z2.e, ((Long) z2.f5132f).longValue(), (byte[]) z2.f5133g, (String) z2.f5134h, ((Long) z2.f5135i).longValue(), (p076y0.n) z2.f5136j));
                        it2 = it3;
                    }
                    arrayList3.add(new p076y0.l(jB, jB2, jVar, numValueOf, str2, arrayList4));
                    it2 = it2;
                }
                p076y0.i iVar2 = new p076y0.i(arrayList3);
                byte[] bArr2 = bVar.f5937b;
                URL urlB = dVar.f5834d;
                if (bArr2 != null) {
                    try {
                        p073x0.a aVarA = p073x0.a.a(bArr2);
                        str = aVarA.f5824b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = aVarA.f5823a;
                        if (str6 != null) {
                            urlB = p073x0.d.b(str6);
                        }
                    } catch (IllegalArgumentException unused2) {
                        aVar = new A0.a(-1L, 3);
                    }
                } else {
                    str = null;
                }
                try {
                    p073x0.b bVar3 = new p073x0.b(urlB, iVar2, str);
                    y yVar = new y(17, dVar);
                    int i4 = 5;
                    do {
                        cVarJ = yVar.j(bVar3);
                        URL url = cVarJ.f5829b;
                        if (url != null) {
                            p000a.a.a("CctTransportBackend", "Following redirect to: %s", url);
                            bVar3 = new p073x0.b(url, bVar3.f5826b, bVar3.f5827c);
                        } else {
                            bVar3 = null;
                        }
                        if (bVar3 == null) {
                            break;
                        } else {
                            i4--;
                        }
                    } while (i4 >= 1);
                    int i5 = cVarJ.f5828a;
                    aVar = i5 == 200 ? new A0.a(cVarJ.f5830c, 1) : (i5 >= 500 || i5 == 404) ? new A0.a(-1L, 2) : new A0.a(-1L, 3);
                } catch (IOException e) {
                    Log.e("TransportRuntime.".concat("CctTransportBackend"), "Could not make request to the backend", e);
                    aVar = new A0.a(-1L, 2);
                }
            }
            iVar.d(new h(this, aVar, iterable, bVar, i3));
        }
    }
}
