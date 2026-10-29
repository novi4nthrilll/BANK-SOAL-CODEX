package J1;

import B.C0006g;
import I1.AbstractActivityC0028d;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.l;
import java.util.HashMap;
import java.util.HashSet;
import p013d1.AbstractC0413a3;
import p013d1.AbstractC0534v;

/* JADX INFO: loaded from: classes.dex */
public final class c implements o2.b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static long f693w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final HashMap f694x = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K1.b f697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f698d;
    public final T1.a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D0.b f699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final R1.b f700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A0.f f701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0006g f702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final A0.f f703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final R1.j f704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A0.g f705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A0.f f706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final R1.l f707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A0.f f708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0006g f709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A0.g f710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final io.flutter.plugin.platform.i f711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final io.flutter.plugin.platform.h f712s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f714u;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashSet f713t = new HashSet();
    public final a v = new a(this);

    public c(AbstractActivityC0028d abstractActivityC0028d, FlutterJNI flutterJNI, io.flutter.plugin.platform.i iVar, boolean z2, boolean z3) {
        AssetManager assets;
        long j3 = f693w;
        f693w = 1 + j3;
        this.f714u = j3;
        f694x.put(Long.valueOf(j3), this);
        try {
            assets = abstractActivityC0028d.createPackageContext(abstractActivityC0028d.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = abstractActivityC0028d.getAssets();
        }
        D0.b bVarJ = D0.b.J();
        if (flutterJNI == null) {
            Object obj = bVarJ.f182f;
            flutterJNI = new FlutterJNI();
        }
        this.f695a = flutterJNI;
        K1.b bVar = new K1.b(flutterJNI, assets, this.f714u);
        this.f697c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f746g);
        D0.b.J().getClass();
        this.f699f = new D0.b(bVar, flutterJNI);
        new L0.g(bVar);
        this.f700g = new R1.b(bVar);
        A0.g gVar = new A0.g(bVar, 19);
        this.f701h = new A0.f(bVar, 16);
        this.f702i = new C0006g(bVar, 17);
        this.f703j = new A0.f(bVar, 13);
        this.f705l = new A0.g(bVar, 20);
        A0.g gVar2 = new A0.g(bVar, abstractActivityC0028d.getPackageManager());
        this.f704k = new R1.j(bVar, z3);
        this.f706m = new A0.f(bVar, 21);
        this.f707n = new R1.l(bVar);
        this.f708o = new A0.f(bVar, 22);
        this.f709p = new C0006g(bVar, 23);
        this.f710q = new A0.g(bVar, 23);
        T1.a aVar = new T1.a(abstractActivityC0028d, gVar);
        this.e = aVar;
        M1.f fVar = (M1.f) bVarJ.e;
        if (!flutterJNI.isAttached()) {
            fVar.b(abstractActivityC0028d.getApplicationContext());
            fVar.a(abstractActivityC0028d, null);
        }
        io.flutter.plugin.platform.h hVar = new io.flutter.plugin.platform.h();
        hVar.f4710a = iVar.f4722a;
        hVar.f4713d = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.v);
        flutterJNI.setPlatformViewsController(iVar);
        flutterJNI.setPlatformViewsController2(hVar);
        flutterJNI.setLocalizationPlugin(aVar);
        bVarJ.getClass();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f696b = new l(flutterJNI);
        this.f711r = iVar;
        this.f712s = hVar;
        d dVar = new d(abstractActivityC0028d.getApplicationContext(), this);
        this.f698d = dVar;
        aVar.b(abstractActivityC0028d.getResources().getConfiguration());
        if (z2 && fVar.f992d.e) {
            AbstractC0534v.a(this);
        }
        AbstractC0413a3.a(abstractActivityC0028d, this);
        dVar.a(new V1.a(gVar2));
    }
}
