package I1;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractActivityC0028d f363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J1.c f364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E0.h f366d;
    public f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f368g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0029e f372k = new C0029e(0, this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f369h = false;

    public g(AbstractActivityC0028d abstractActivityC0028d) {
        this.f363a = abstractActivityC0028d;
    }

    public final void a(J1.f fVar) {
        String strC = this.f363a.c();
        if (strC == null || strC.isEmpty()) {
            strC = ((M1.f) D0.b.J().e).f992d.f980b;
        }
        K1.a aVar = new K1.a(strC, this.f363a.f());
        String strG = this.f363a.g();
        if (strG == null) {
            AbstractActivityC0028d abstractActivityC0028d = this.f363a;
            abstractActivityC0028d.getClass();
            strG = d(abstractActivityC0028d.getIntent());
            if (strG == null) {
                strG = "/";
            }
        }
        fVar.f724b = aVar;
        fVar.f725c = strG;
        fVar.f726d = (List) this.f363a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (this.f363a.j()) {
            throw new AssertionError("The internal FlutterEngine created by " + this.f363a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
        }
        AbstractActivityC0028d abstractActivityC0028d = this.f363a;
        abstractActivityC0028d.getClass();
        Log.w("FlutterActivity", "FlutterActivity " + abstractActivityC0028d + " connection to the engine " + abstractActivityC0028d.e.f364b + " evicted by another attaching activity");
        g gVar = abstractActivityC0028d.e;
        if (gVar != null) {
            gVar.e();
            abstractActivityC0028d.e.f();
        }
    }

    public final void c() {
        if (this.f363a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    public final String d(Intent intent) {
        boolean z2;
        Uri data;
        AbstractActivityC0028d abstractActivityC0028d = this.f363a;
        abstractActivityC0028d.getClass();
        try {
            Bundle bundleH = abstractActivityC0028d.h();
            z2 = (bundleH == null || !bundleH.containsKey("flutter_deeplinking_enabled")) ? true : bundleH.getBoolean("flutter_deeplinking_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            z2 = false;
        }
        if (!z2 || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public final void e() {
        c();
        if (this.e != null) {
            this.f365c.getViewTreeObserver().removeOnPreDrawListener(this.e);
            this.e = null;
        }
        p pVar = this.f365c;
        if (pVar != null) {
            pVar.a();
            p pVar2 = this.f365c;
            pVar2.f396i.remove(this.f372k);
        }
    }

    public final void f() {
        if (this.f370i) {
            c();
            this.f363a.getClass();
            this.f363a.getClass();
            AbstractActivityC0028d abstractActivityC0028d = this.f363a;
            abstractActivityC0028d.getClass();
            if (abstractActivityC0028d.isChangingConfigurations()) {
                J1.d dVar = this.f364b.f698d;
                if (dVar.f()) {
                    o2.a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                    try {
                        dVar.f720g = true;
                        Iterator it = dVar.f718d.values().iterator();
                        while (it.hasNext()) {
                            ((P1.a) it.next()).d();
                        }
                        dVar.d();
                        Trace.endSection();
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                }
            } else {
                this.f364b.f698d.c();
            }
            E0.h hVar = this.f366d;
            if (hVar != null) {
                ((A0.g) hVar.f214g).f19f = null;
                this.f366d = null;
            }
            this.f363a.getClass();
            J1.c cVar = this.f364b;
            if (cVar != null) {
                R1.b bVar = cVar.f700g;
                bVar.a(1, bVar.f1447c);
            }
            if (this.f363a.j()) {
                J1.c cVar2 = this.f364b;
                Iterator it2 = cVar2.f713t.iterator();
                while (it2.hasNext()) {
                    ((J1.b) it2.next()).b();
                }
                J1.d dVar2 = cVar2.f698d;
                dVar2.e();
                HashMap map = dVar2.f715a;
                for (Class cls : new HashSet(map.keySet())) {
                    O1.a aVar = (O1.a) map.get(cls);
                    if (aVar != null) {
                        o2.a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                        try {
                            if (aVar instanceof P1.a) {
                                if (dVar2.f()) {
                                    ((P1.a) aVar).c();
                                }
                                dVar2.f718d.remove(cls);
                            }
                            aVar.k(dVar2.f717c);
                            map.remove(cls);
                            Trace.endSection();
                        } catch (Throwable th3) {
                            try {
                                Trace.endSection();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                }
                map.clear();
                while (true) {
                    io.flutter.plugin.platform.i iVar = cVar2.f711r;
                    SparseArray sparseArray = iVar.f4730j;
                    if (sparseArray.size() <= 0) {
                        break;
                    }
                    iVar.f4740t.m(sparseArray.keyAt(0));
                }
                while (true) {
                    io.flutter.plugin.platform.h hVar2 = cVar2.f712s;
                    SparseArray sparseArray2 = hVar2.f4715g;
                    if (sparseArray2.size() <= 0) {
                        break;
                    }
                    hVar2.f4721m.f(sparseArray2.keyAt(0));
                }
                cVar2.f697c.f744d.setPlatformMessageHandler(null);
                FlutterJNI flutterJNI = cVar2.f695a;
                flutterJNI.removeEngineLifecycleListener(cVar2.v);
                flutterJNI.setDeferredComponentManager(null);
                flutterJNI.detachFromNativeAndReleaseResources();
                D0.b.J().getClass();
                J1.c.f694x.remove(Long.valueOf(cVar2.f714u));
                if (this.f363a.e() != null) {
                    if (J1.h.f730c == null) {
                        J1.h.f730c = new J1.h(1);
                    }
                    J1.h hVar3 = J1.h.f730c;
                    hVar3.f731a.remove(this.f363a.e());
                }
                this.f364b = null;
            }
            this.f370i = false;
        }
    }
}
