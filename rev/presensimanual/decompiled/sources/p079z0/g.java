package p079z0;

import D0.c;
import E0.k;
import java.util.HashMap;
import p070w0.a;
import p070w0.b;
import p070w0.d;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f5947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f5948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f5949d;

    public g(b bVar, b bVar2, d dVar, h hVar) {
        this.f5946a = bVar;
        this.f5947b = bVar2;
        this.f5948c = dVar;
        this.f5949d = hVar;
    }

    public final void a(a aVar) {
        b bVar = this.f5946a;
        d dVar = this.f5948c;
        b bVar2 = this.f5947b;
        h hVar = this.f5949d;
        String str = bVar.f5936a;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        b bVar3 = new b(str, bVar.f5937b, aVar.f5772b);
        k kVar = new k();
        kVar.f230i = new HashMap();
        kVar.f228g = Long.valueOf(hVar.f5950a.b());
        kVar.f229h = Long.valueOf(hVar.f5951b.b());
        kVar.f226d = "FIREBASE_ML_SDK";
        kVar.f227f = new e(bVar2, (byte[]) dVar.apply(aVar.f5771a));
        kVar.e = null;
        a aVarC = kVar.c();
        c cVar = (c) hVar.f5952c;
        cVar.getClass();
        cVar.f186b.execute(new D0.a(cVar, bVar3, aVarC, 0));
    }
}
