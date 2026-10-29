package J1;

import B.C0006g;
import I1.AbstractActivityC0028d;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.s;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D0.b f717c;
    public I1.g e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public E0.k f719f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f715a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f718d = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f720g = false;

    public d(Context context, c cVar) {
        new HashMap();
        new HashMap();
        new HashMap();
        this.f716b = cVar;
        K1.b bVar = cVar.f697c;
        h hVar = cVar.f711r.f4722a;
        this.f717c = new D0.b(context, bVar, cVar.f696b, 7);
    }

    public final void a(O1.a aVar) {
        o2.a.b("FlutterEngineConnectionRegistry#add ".concat(aVar.getClass().getSimpleName()));
        try {
            Class<?> cls = aVar.getClass();
            HashMap map = this.f715a;
            if (map.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f716b + ").");
                Trace.endSection();
                return;
            }
            aVar.toString();
            map.put(aVar.getClass(), aVar);
            aVar.b(this.f717c);
            if (aVar instanceof P1.a) {
                P1.a aVar2 = (P1.a) aVar;
                this.f718d.put(aVar.getClass(), aVar2);
                if (f()) {
                    aVar2.e(this.f719f);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(AbstractActivityC0028d abstractActivityC0028d, s sVar) {
        E0.k kVar = new E0.k();
        kVar.e = new HashSet();
        kVar.f227f = new HashSet();
        kVar.f228g = new HashSet();
        kVar.f229h = new HashSet();
        new HashSet();
        kVar.f230i = new HashSet();
        kVar.f226d = abstractActivityC0028d;
        new HiddenLifecycleReference(sVar);
        this.f719f = kVar;
        if (abstractActivityC0028d.getIntent() != null) {
            abstractActivityC0028d.getIntent().getBooleanExtra("enable-software-rendering", false);
        }
        c cVar = this.f716b;
        io.flutter.plugin.platform.i iVar = cVar.f711r;
        iVar.getClass();
        if (iVar.f4723b != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        iVar.f4723b = abstractActivityC0028d;
        iVar.f4725d = cVar.f696b;
        K1.b bVar = cVar.f697c;
        A0.f fVar = new A0.f(bVar, 19);
        iVar.f4726f = fVar;
        fVar.e = iVar.f4740t;
        io.flutter.plugin.platform.h hVar = cVar.f712s;
        if (hVar.f4711b != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        hVar.f4711b = abstractActivityC0028d;
        C0006g c0006g = new C0006g(bVar, 19);
        hVar.e = c0006g;
        c0006g.e = hVar.f4721m;
        for (P1.a aVar : this.f718d.values()) {
            if (this.f720g) {
                aVar.f(this.f719f);
            } else {
                aVar.e(this.f719f);
            }
        }
        this.f720g = false;
    }

    public final void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        o2.a.b("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = this.f718d.values().iterator();
            while (it.hasNext()) {
                ((P1.a) it.next()).c();
            }
            d();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d() {
        c cVar = this.f716b;
        io.flutter.plugin.platform.i iVar = cVar.f711r;
        A0.f fVar = iVar.f4726f;
        if (fVar != null) {
            fVar.e = null;
        }
        iVar.e();
        iVar.f4726f = null;
        iVar.f4723b = null;
        iVar.f4725d = null;
        io.flutter.plugin.platform.h hVar = cVar.f712s;
        C0006g c0006g = hVar.e;
        if (c0006g != null) {
            c0006g.e = null;
        }
        Surface surface = hVar.f4719k;
        if (surface != null) {
            surface.release();
            hVar.f4719k = null;
            hVar.f4720l = null;
        }
        hVar.e = null;
        hVar.f4711b = null;
        this.e = null;
        this.f719f = null;
    }

    public final void e() {
        if (f()) {
            c();
        }
    }

    public final boolean f() {
        return this.e != null;
    }
}
