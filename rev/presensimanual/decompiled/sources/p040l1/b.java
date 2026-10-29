package p040l1;

import A0.g;
import B.C0006g;
import B0.a;
import D0.d;
import E0.k;
import E0.n;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import p013d1.L4;
import p079z0.c;
import p079z0.f;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f5304a;

    public c a() {
        Context context = this.f5304a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        c cVar = new c();
        cVar.f5939d = a.a(f.f5945a);
        A0.f fVar = new A0.f(1, context);
        cVar.e = fVar;
        cVar.f5940f = a.a(new g(1, fVar, new A0.f(0, fVar)));
        p053p2.a aVarA = a.a(new A0.f(4, new C0006g(3, cVar.e)));
        cVar.f5941g = aVarA;
        L0.g gVar = new L0.g(1);
        A0.f fVar2 = cVar.e;
        D0.b bVar = new D0.b(fVar2, aVarA, gVar, 1);
        p053p2.a aVar = cVar.f5939d;
        p053p2.a aVar2 = cVar.f5940f;
        d dVar = new d(aVar, aVar2, bVar, aVarA, aVarA);
        k kVar = new k();
        kVar.f226d = fVar2;
        kVar.e = aVar2;
        kVar.f227f = aVarA;
        kVar.f230i = bVar;
        kVar.f228g = aVar;
        kVar.f229h = aVarA;
        cVar.f5942h = a.a(new D0.b(dVar, kVar, new n(aVar, aVarA, bVar, aVarA), 28));
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    public ArrayList b() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = this.f5304a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) MlKitComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", MlKitComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new L4(4, (String) it.next()));
        }
        return arrayList2;
    }
}
