package p051p0;

import D0.b;
import E0.n;
import O1.a;
import S1.f;
import S1.s;
import W1.C0104l;
import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0104l f5537d;

    @Override // O1.a
    public final void b(b bVar) {
        C0104l c0104l = new C0104l(new C0104l((Context) bVar.e));
        this.f5537d = c0104l;
        if (((n) c0104l.f1774d) != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            n nVar = (n) c0104l.f1774d;
            if (nVar == null) {
                Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                nVar.f(null);
                c0104l.f1774d = null;
            }
        }
        f fVar = (f) bVar.f182f;
        n nVar2 = new n(fVar, "flutter.baseflow.com/geocoding", s.f1597a, fVar.l(), false);
        c0104l.f1774d = nVar2;
        nVar2.f(c0104l);
    }

    @Override // O1.a
    public final void k(b bVar) {
        C0104l c0104l = this.f5537d;
        if (c0104l == null) {
            Log.wtf("GeocodingPlugin", "Already detached from the engine.");
            return;
        }
        n nVar = (n) c0104l.f1774d;
        if (nVar == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            nVar.f(null);
            c0104l.f1774d = null;
        }
        this.f5537d = null;
    }
}
