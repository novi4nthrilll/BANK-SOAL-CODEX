package I1;

import B.C0006g;
import W1.C0104l;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import android.window.OnBackInvokedCallback;
import defpackage.Lidctfcodex26simpeg;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p013d1.AbstractC0534v;

/* JADX INFO: renamed from: I1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0028d extends Activity implements androidx.lifecycle.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f356h = View.generateViewId();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f357d = false;
    public g e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.s f358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OnBackInvokedCallback f359g;

    public AbstractActivityC0028d() {
        int i3 = Build.VERSION.SDK_INT;
        this.f359g = i3 < 33 ? null : i3 >= 34 ? new C0027c(this) : new C0026b(0, this);
        this.f358f = new androidx.lifecycle.s(this);
    }

    @Override // androidx.lifecycle.q
    public final androidx.lifecycle.s b() {
        return this.f358f;
    }

    public final String c() {
        String dataString;
        if ((getApplicationInfo().flags & 2) == 0 || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public final int d() {
        if (!getIntent().hasExtra("background_mode")) {
            return 1;
        }
        String stringExtra = getIntent().getStringExtra("background_mode");
        if (stringExtra == null) {
            throw new NullPointerException("Name is null");
        }
        if (stringExtra.equals("opaque")) {
            return 1;
        }
        if (stringExtra.equals("transparent")) {
            return 2;
        }
        throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
    }

    public final String e() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String f() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle bundleH = h();
            String string = bundleH != null ? bundleH.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String g() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle bundleH = h();
            if (bundleH != null) {
                return bundleH.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle h() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void i(boolean z2) {
        if (z2 && !this.f357d) {
            if (Build.VERSION.SDK_INT >= 33) {
                getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f359g);
                this.f357d = true;
                return;
            }
            return;
        }
        if (z2 || !this.f357d || Build.VERSION.SDK_INT < 33) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f359g);
        this.f357d = false;
    }

    public final boolean j() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (e() != null || this.e.f367f) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public final boolean k() {
        if (getIntent().hasExtra("enable_state_restoration")) {
            return getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        return e() == null;
    }

    public final boolean l(String str) {
        g gVar = this.e;
        if (gVar == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (gVar.f370i) {
            return true;
        }
        Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        if (!l("onActivityResult")) {
            return;
        }
        g gVar = this.e;
        gVar.c();
        if (gVar.f364b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Objects.toString(intent);
        J1.d dVar = gVar.f364b.f698d;
        if (!dVar.f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return;
        }
        o2.a.b("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            E0.k kVar = dVar.f719f;
            kVar.getClass();
            Iterator it = new HashSet((HashSet) kVar.f227f).iterator();
            while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        Trace.endSection();
                        return;
                    }
                    boolean z2 = ((S1.o) it.next()).a(i3, i4, intent) || z2;
                }
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (l("onBackPressed")) {
            g gVar = this.e;
            gVar.c();
            J1.c cVar = gVar.f364b;
            if (cVar != null) {
                ((E0.n) cVar.f702i.e).b("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0456  */
    /* JADX WARN: Code duplicated, block: B:185:0x045f  */
    /* JADX WARN: Code duplicated, block: B:192:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:195:0x0514  */
    /* JADX WARN: Code duplicated, block: B:198:0x051a  */
    /* JADX WARN: Code duplicated, block: B:200:0x051f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0571 A[LOOP:0: B:202:0x0569->B:204:0x0571, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x0588  */
    /* JADX WARN: Code duplicated, block: B:210:0x058e A[LOOP:1: B:206:0x0580->B:210:0x058e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:218:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:220:0x05b7 A[LOOP:2: B:216:0x05a9->B:220:0x05b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:227:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:229:0x05dd A[EDGE_INSN: B:229:0x05dd->B:230:0x05e0 BREAK  A[LOOP:1: B:206:0x0580->B:210:0x058e]] */
    /* JADX WARN: Code duplicated, block: B:242:0x0636  */
    /* JADX WARN: Code duplicated, block: B:244:0x0643  */
    /* JADX WARN: Code duplicated, block: B:246:0x0650  */
    /* JADX WARN: Code duplicated, block: B:266:0x057f A[EDGE_INSN: B:266:0x057f->B:205:0x057f BREAK  A[LOOP:0: B:202:0x0569->B:204:0x0571], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0596 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x059c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x05c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x05bf A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        byte[] byteArray;
        io.flutter.embedding.engine.renderer.l lVar;
        C0029e c0029e;
        boolean zIsEnabled;
        io.flutter.plugin.platform.i iVar;
        int i3;
        SparseArray sparseArray;
        int i4;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        io.flutter.plugin.platform.h hVar;
        int i5;
        SparseArray sparseArray4;
        SparseArray sparseArray5;
        Iterator it;
        boolean z2;
        int i6;
        try {
            Bundle bundleH = h();
            if (bundleH != null && (i6 = bundleH.getInt("io.flutter.embedding.android.NormalTheme", -1)) != -1) {
                setTheme(i6);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
        super.onCreate(bundle);
        if (bundle != null) {
            i(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        g gVar = new g(this);
        this.e = gVar;
        gVar.c();
        if (gVar.f364b == null) {
            String strE = gVar.f363a.e();
            if (strE != null) {
                if (J1.h.f730c == null) {
                    J1.h.f730c = new J1.h(1);
                }
                J1.c cVar = (J1.c) J1.h.f730c.f731a.get(strE);
                gVar.f364b = cVar;
                gVar.f367f = true;
                if (cVar == null) {
                    throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + strE + "'");
                }
            } else {
                gVar.f363a.getClass();
                gVar.f364b = null;
                String stringExtra = gVar.f363a.getIntent().getStringExtra("cached_engine_group_id");
                if (stringExtra != null) {
                    if (J1.h.f729b == null) {
                        synchronized (J1.h.class) {
                            try {
                                if (J1.h.f729b == null) {
                                    J1.h.f729b = new J1.h(0);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    J1.g gVar2 = (J1.g) J1.h.f729b.f731a.get(stringExtra);
                    if (gVar2 == null) {
                        throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + stringExtra + "'");
                    }
                    AbstractActivityC0028d abstractActivityC0028d = gVar.f363a;
                    abstractActivityC0028d.getClass();
                    J1.f fVar = new J1.f(abstractActivityC0028d);
                    gVar.a(fVar);
                    gVar.f364b = gVar2.a(fVar);
                    gVar.f367f = false;
                } else {
                    AbstractActivityC0028d abstractActivityC0028d2 = gVar.f363a;
                    abstractActivityC0028d2.getClass();
                    Intent intent = gVar.f363a.getIntent();
                    ArrayList arrayList = new ArrayList();
                    if (intent.getBooleanExtra("trace-startup", false)) {
                        arrayList.add("--trace-startup");
                    }
                    if (intent.getBooleanExtra("start-paused", false)) {
                        arrayList.add("--start-paused");
                    }
                    int intExtra = intent.getIntExtra("vm-service-port", 0);
                    if (intExtra > 0) {
                        arrayList.add("--vm-service-port=" + Integer.toString(intExtra));
                    } else {
                        int intExtra2 = intent.getIntExtra("observatory-port", 0);
                        if (intExtra2 > 0) {
                            arrayList.add("--vm-service-port=" + Integer.toString(intExtra2));
                        }
                    }
                    if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
                        arrayList.add("--disable-service-auth-codes");
                    }
                    if (intent.getBooleanExtra("endless-trace-buffer", false)) {
                        arrayList.add("--endless-trace-buffer");
                    }
                    if (intent.getBooleanExtra("use-test-fonts", false)) {
                        arrayList.add("--use-test-fonts");
                    }
                    if (intent.getBooleanExtra("enable-dart-profiling", false)) {
                        arrayList.add("--enable-dart-profiling");
                    }
                    if (intent.getBooleanExtra("enable-software-rendering", false)) {
                        arrayList.add("--enable-software-rendering");
                    }
                    if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
                        arrayList.add("--skia-deterministic-rendering");
                    }
                    if (intent.getBooleanExtra("trace-skia", false)) {
                        arrayList.add("--trace-skia");
                    }
                    String stringExtra2 = intent.getStringExtra("trace-skia-allowlist");
                    if (stringExtra2 != null) {
                        arrayList.add("--trace-skia-allowlist=".concat(stringExtra2));
                    }
                    if (intent.getBooleanExtra("trace-systrace", false)) {
                        arrayList.add("--trace-systrace");
                    }
                    if (intent.hasExtra("trace-to-file")) {
                        arrayList.add("--trace-to-file=" + intent.getStringExtra("trace-to-file"));
                    }
                    if (intent.hasExtra("enable-impeller")) {
                        if (intent.getBooleanExtra("enable-impeller", false)) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (intent.getBooleanExtra("enable-vulkan-validation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
                        arrayList.add("--dump-skp-on-shader-compilation");
                    }
                    if (intent.getBooleanExtra("cache-sksl", false)) {
                        arrayList.add("--cache-sksl");
                    }
                    if (intent.getBooleanExtra("purge-persistent-cache", false)) {
                        arrayList.add("--purge-persistent-cache");
                    }
                    if (intent.getBooleanExtra("verbose-logging", false)) {
                        arrayList.add("--verbose-logging");
                    }
                    if (intent.hasExtra("dart-flags")) {
                        arrayList.add("--dart-flags=" + intent.getStringExtra("dart-flags"));
                    }
                    HashSet hashSet = new HashSet(arrayList);
                    J1.g gVar3 = new J1.g(abstractActivityC0028d2, (String[]) hashSet.toArray(new String[hashSet.size()]));
                    AbstractActivityC0028d abstractActivityC0028d3 = gVar.f363a;
                    abstractActivityC0028d3.getClass();
                    J1.f fVar2 = new J1.f(abstractActivityC0028d3);
                    fVar2.e = false;
                    fVar2.f727f = gVar.f363a.k();
                    gVar.a(fVar2);
                    gVar.f364b = gVar3.a(fVar2);
                    gVar.f367f = false;
                }
            }
        }
        gVar.f363a.getClass();
        J1.d dVar = gVar.f364b.f698d;
        androidx.lifecycle.s sVar = gVar.f363a.f358f;
        dVar.getClass();
        o2.a.b("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            g gVar4 = dVar.e;
            if (gVar4 != null) {
                gVar4.b();
            }
            dVar.e();
            dVar.e = gVar;
            AbstractActivityC0028d abstractActivityC0028d4 = gVar.f363a;
            abstractActivityC0028d4.getClass();
            dVar.b(abstractActivityC0028d4, sVar);
            Trace.endSection();
            AbstractActivityC0028d abstractActivityC0028d5 = gVar.f363a;
            abstractActivityC0028d5.getClass();
            gVar.f366d = new E0.h(abstractActivityC0028d5, gVar.f364b.f705l, abstractActivityC0028d5);
            AbstractActivityC0028d abstractActivityC0028d6 = gVar.f363a;
            J1.c cVar2 = gVar.f364b;
            Lidctfcodex26simpeg lidctfcodex26simpeg = (Lidctfcodex26simpeg) abstractActivityC0028d6;
            lidctfcodex26simpeg.getClass();
            B2.h.e(cVar2, "flutterEngine");
            if (!lidctfcodex26simpeg.e.f367f) {
                AbstractC0534v.a(cVar2);
            }
            new E0.n(cVar2.f697c.f747h, lidctfcodex26simpeg.f954i).f(new G1.a(0, lidctfcodex26simpeg));
            gVar.f370i = true;
            g gVar5 = this.e;
            gVar5.c();
            if (bundle != null) {
                bundle.getBundle("plugins");
                byteArray = bundle.getByteArray("framework");
            } else {
                byteArray = null;
            }
            if (gVar5.f363a.k()) {
                R1.j jVar = gVar5.f364b.f704k;
                jVar.e = true;
                R1.i iVar2 = jVar.f1486d;
                if (iVar2 != null) {
                    iVar2.c(R1.j.a(byteArray));
                    jVar.f1486d = null;
                    jVar.f1484b = byteArray;
                } else if (jVar.f1487f) {
                    jVar.f1485c.b("push", R1.j.a(byteArray), new R1.i(0, jVar, byteArray));
                } else {
                    jVar.f1484b = byteArray;
                }
            }
            gVar5.f363a.getClass();
            J1.d dVar2 = gVar5.f364b.f698d;
            if (dVar2.f()) {
                o2.a.b("FlutterEngineConnectionRegistry#onRestoreInstanceState");
                try {
                    Iterator it2 = ((HashSet) dVar2.f719f.f230i).iterator();
                    if (it2.hasNext()) {
                        if (it2.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                    Trace.endSection();
                } catch (Throwable th2) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            }
            this.f358f.e(androidx.lifecycle.j.ON_CREATE);
            if (d() == 2) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            g gVar6 = this.e;
            boolean z3 = (d() == 1 ? (char) 1 : (char) 2) == 1;
            gVar6.c();
            if (gVar6.f363a.d() == 1) {
                AbstractActivityC0028d abstractActivityC0028d7 = gVar6.f363a;
                abstractActivityC0028d7.getClass();
                j jVar2 = new j(abstractActivityC0028d7, gVar6.f363a.d() != 1);
                gVar6.f363a.getClass();
                AbstractActivityC0028d abstractActivityC0028d8 = gVar6.f363a;
                abstractActivityC0028d8.getClass();
                gVar6.f365c = new p(abstractActivityC0028d8, jVar2);
            } else {
                AbstractActivityC0028d abstractActivityC0028d9 = gVar6.f363a;
                abstractActivityC0028d9.getClass();
                l lVar2 = new l(abstractActivityC0028d9, null);
                lVar2.f383d = false;
                lVar2.e = false;
                lVar2.setSurfaceTextureListener(new k(lVar2));
                lVar2.setOpaque(gVar6.f363a.d() == 1);
                gVar6.f363a.getClass();
                AbstractActivityC0028d abstractActivityC0028d10 = gVar6.f363a;
                abstractActivityC0028d10.getClass();
                gVar6.f365c = new p(abstractActivityC0028d10, lVar2);
            }
            gVar6.f365c.f396i.add(gVar6.f372k);
            gVar6.f363a.getClass();
            p pVar = gVar6.f365c;
            J1.c cVar3 = gVar6.f364b;
            pVar.getClass();
            Objects.toString(cVar3);
            if (!pVar.c()) {
                pVar.f398k = cVar3;
                lVar = cVar3.f696b;
                pVar.f397j = lVar.f4650d;
                pVar.f394g.a(lVar);
                c0029e = pVar.f411y;
                lVar.f4647a.addIsDisplayingFlutterUiListener(c0029e);
                if (lVar.f4650d) {
                    c0029e.b();
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    pVar.f400m = new A0.g(pVar, pVar.f398k.f701h);
                }
                J1.c cVar4 = pVar.f398k;
                pVar.f401n = new io.flutter.plugin.editing.h(pVar, cVar4.f710q, cVar4.f706m, cVar4.f711r, cVar4.f712s);
                try {
                    TextServicesManager textServicesManager = (TextServicesManager) pVar.getContext().getSystemService("textservices");
                    pVar.f407t = textServicesManager;
                    pVar.f402o = new io.flutter.plugin.editing.f(textServicesManager, pVar.f398k.f708o);
                    while (true) {
                        sparseArray = iVar.f4733m;
                        if (i3 < sparseArray.size()) {
                            break;
                        }
                        iVar.f4724c.addView((io.flutter.plugin.platform.e) sparseArray.valueAt(i3));
                        i3++;
                    }
                    while (true) {
                        sparseArray2 = iVar.f4731k;
                        if (i4 < sparseArray2.size()) {
                            sparseArray3 = iVar.f4730j;
                            if (sparseArray3.size() <= 0) {
                                sparseArray3.valueAt(0).getClass();
                                throw new ClassCastException();
                            }
                            hVar = cVar3.f712s;
                            hVar.f4712c = pVar;
                            i5 = 0;
                            while (true) {
                                sparseArray4 = hVar.f4716h;
                                if (i5 < sparseArray4.size()) {
                                    sparseArray5 = hVar.f4715g;
                                    if (sparseArray5.size() <= 0) {
                                        sparseArray5.valueAt(0).getClass();
                                        throw new ClassCastException();
                                    }
                                    it = pVar.f399l.iterator();
                                    if (it.hasNext()) {
                                        if (pVar.f397j) {
                                            break;
                                        }
                                        c0029e.b();
                                        break;
                                    }
                                    it.next().getClass();
                                    throw new ClassCastException();
                                }
                                if (sparseArray4.valueAt(i5) == null) {
                                    throw new ClassCastException();
                                }
                                hVar.f4712c.addView(null);
                                i5++;
                            }
                        } else {
                            if (sparseArray2.valueAt(i4) == null) {
                                throw new ClassCastException();
                            }
                            iVar.f4724c.addView(null);
                            i4++;
                        }
                    }
                } catch (Exception unused2) {
                    Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
                }
                InputMethodManager inputMethodManager = pVar.f401n.f4692b;
                A0.f fVar3 = pVar.f398k.f706m;
                C0104l c0104l = new C0104l();
                if (Build.VERSION.SDK_INT >= 33) {
                    pVar.setAutoHandwritingEnabled(false);
                }
                c0104l.f1774d = pVar;
                c0104l.e = inputMethodManager;
                fVar3.e = c0104l;
                pVar.f403p = pVar.f398k.e;
                pVar.f404q = new D0.b(pVar);
                pVar.f405r = new C0025a(pVar.f398k.f696b, false);
                io.flutter.view.m mVar = new io.flutter.view.m(pVar, cVar3.f699f, (AccessibilityManager) pVar.getContext().getSystemService("accessibility"), pVar.getContext().getContentResolver(), pVar.f398k.f711r);
                pVar.f406s = mVar;
                mVar.f4849r = pVar.f409w;
                zIsEnabled = mVar.f4835c.isEnabled();
                boolean zIsTouchExplorationEnabled = pVar.f406s.f4835c.isTouchExplorationEnabled();
                if (pVar.f398k.f696b.f4647a.getIsSoftwareRenderingEnabled()) {
                    pVar.setWillNotDraw(false);
                } else {
                    if (!zIsEnabled || zIsTouchExplorationEnabled) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    pVar.setWillNotDraw(z2);
                }
                J1.c cVar5 = pVar.f398k;
                cVar5.f711r.f4727g.f4706a = pVar.f406s;
                new C0025a(cVar5.f696b, true);
                J1.c cVar6 = pVar.f398k;
                cVar6.f712s.f4714f.f4706a = pVar.f406s;
                new C0025a(cVar6.f696b, true);
                pVar.f401n.f4692b.restartInput(pVar);
                pVar.d();
                pVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, pVar.f410x);
                pVar.e();
                iVar = cVar3.f711r;
                iVar.f4724c = pVar;
                i3 = 0;
                i4 = 0;
            } else if (cVar3 != pVar.f398k) {
                pVar.a();
                pVar.f398k = cVar3;
                lVar = cVar3.f696b;
                pVar.f397j = lVar.f4650d;
                pVar.f394g.a(lVar);
                c0029e = pVar.f411y;
                lVar.f4647a.addIsDisplayingFlutterUiListener(c0029e);
                if (lVar.f4650d) {
                    c0029e.b();
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    pVar.f400m = new A0.g(pVar, pVar.f398k.f701h);
                }
                J1.c cVar7 = pVar.f398k;
                pVar.f401n = new io.flutter.plugin.editing.h(pVar, cVar7.f710q, cVar7.f706m, cVar7.f711r, cVar7.f712s);
                TextServicesManager textServicesManager2 = (TextServicesManager) pVar.getContext().getSystemService("textservices");
                pVar.f407t = textServicesManager2;
                pVar.f402o = new io.flutter.plugin.editing.f(textServicesManager2, pVar.f398k.f708o);
                InputMethodManager inputMethodManager2 = pVar.f401n.f4692b;
                A0.f fVar4 = pVar.f398k.f706m;
                C0104l c0104l2 = new C0104l();
                if (Build.VERSION.SDK_INT >= 33) {
                    pVar.setAutoHandwritingEnabled(false);
                }
                c0104l2.f1774d = pVar;
                c0104l2.e = inputMethodManager2;
                fVar4.e = c0104l2;
                pVar.f403p = pVar.f398k.e;
                pVar.f404q = new D0.b(pVar);
                pVar.f405r = new C0025a(pVar.f398k.f696b, false);
                io.flutter.view.m mVar2 = new io.flutter.view.m(pVar, cVar3.f699f, (AccessibilityManager) pVar.getContext().getSystemService("accessibility"), pVar.getContext().getContentResolver(), pVar.f398k.f711r);
                pVar.f406s = mVar2;
                mVar2.f4849r = pVar.f409w;
                zIsEnabled = mVar2.f4835c.isEnabled();
                boolean zIsTouchExplorationEnabled2 = pVar.f406s.f4835c.isTouchExplorationEnabled();
                if (pVar.f398k.f696b.f4647a.getIsSoftwareRenderingEnabled()) {
                    if (zIsEnabled) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    pVar.setWillNotDraw(z2);
                } else {
                    pVar.setWillNotDraw(false);
                }
                J1.c cVar8 = pVar.f398k;
                cVar8.f711r.f4727g.f4706a = pVar.f406s;
                new C0025a(cVar8.f696b, true);
                J1.c cVar9 = pVar.f398k;
                cVar9.f712s.f4714f.f4706a = pVar.f406s;
                new C0025a(cVar9.f696b, true);
                pVar.f401n.f4692b.restartInput(pVar);
                pVar.d();
                pVar.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, pVar.f410x);
                pVar.e();
                iVar = cVar3.f711r;
                iVar.f4724c = pVar;
                i3 = 0;
                while (true) {
                    sparseArray = iVar.f4733m;
                    if (i3 < sparseArray.size()) {
                        break;
                        break;
                    } else {
                        iVar.f4724c.addView((io.flutter.plugin.platform.e) sparseArray.valueAt(i3));
                        i3++;
                    }
                }
                i4 = 0;
                while (true) {
                    sparseArray2 = iVar.f4731k;
                    if (i4 < sparseArray2.size()) {
                        sparseArray3 = iVar.f4730j;
                        if (sparseArray3.size() <= 0) {
                            sparseArray3.valueAt(0).getClass();
                            throw new ClassCastException();
                        }
                        hVar = cVar3.f712s;
                        hVar.f4712c = pVar;
                        i5 = 0;
                        while (true) {
                            sparseArray4 = hVar.f4716h;
                            if (i5 < sparseArray4.size()) {
                                sparseArray5 = hVar.f4715g;
                                if (sparseArray5.size() <= 0) {
                                    sparseArray5.valueAt(0).getClass();
                                    throw new ClassCastException();
                                }
                                it = pVar.f399l.iterator();
                                if (it.hasNext()) {
                                    it.next().getClass();
                                    throw new ClassCastException();
                                }
                                if (pVar.f397j) {
                                    break;
                                }
                                c0029e.b();
                                break;
                            }
                            if (sparseArray4.valueAt(i5) == null) {
                                throw new ClassCastException();
                            }
                            hVar.f4712c.addView(null);
                            i5++;
                        }
                    } else {
                        if (sparseArray2.valueAt(i4) == null) {
                            throw new ClassCastException();
                        }
                        iVar.f4724c.addView(null);
                        i4++;
                    }
                }
            }
            gVar6.f365c.setId(f356h);
            if (z3) {
                p pVar2 = gVar6.f365c;
                if (gVar6.f363a.d() != 1) {
                    throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
                }
                if (gVar6.e != null) {
                    pVar2.getViewTreeObserver().removeOnPreDrawListener(gVar6.e);
                }
                gVar6.e = new f(gVar6, pVar2);
                pVar2.getViewTreeObserver().addOnPreDrawListener(gVar6.e);
            }
            setContentView(gVar6.f365c);
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        } catch (Throwable th4) {
            try {
                Trace.endSection();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (l("onDestroy")) {
            this.e.e();
            this.e.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f359g);
            this.f357d = false;
        }
        g gVar = this.e;
        if (gVar != null) {
            gVar.f363a = null;
            gVar.f364b = null;
            gVar.f365c = null;
            gVar.f366d = null;
            this.e = null;
        }
        this.f358f.e(androidx.lifecycle.j.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (l("onNewIntent")) {
            g gVar = this.e;
            gVar.c();
            J1.c cVar = gVar.f364b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            J1.d dVar = cVar.f698d;
            if (dVar.f()) {
                o2.a.b("FlutterEngineConnectionRegistry#onNewIntent");
                try {
                    Iterator it = ((HashSet) dVar.f719f.f228g).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
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
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            }
            String strD = gVar.d(intent);
            if (strD == null || strD.isEmpty()) {
                return;
            }
            C0006g c0006g = gVar.f364b.f702i;
            c0006g.getClass();
            HashMap map = new HashMap();
            map.put("location", strD);
            ((E0.n) c0006g.e).b("pushRouteInformation", map, null);
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (l("onPause")) {
            g gVar = this.e;
            gVar.c();
            gVar.f363a.getClass();
            J1.c cVar = gVar.f364b;
            if (cVar != null) {
                R1.b bVar = cVar.f700g;
                bVar.a(3, bVar.f1447c);
            }
        }
        this.f358f.e(androidx.lifecycle.j.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (l("onPostResume")) {
            g gVar = this.e;
            gVar.c();
            if (gVar.f364b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            E0.h hVar = gVar.f366d;
            if (hVar != null) {
                hVar.j();
            }
            Iterator it = gVar.f364b.f711r.f4728h.values().iterator();
            if (it.hasNext()) {
                ((io.flutter.plugin.platform.o) it.next()).getClass();
                throw null;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (!l("onRequestPermissionsResult")) {
            return;
        }
        g gVar = this.e;
        gVar.c();
        if (gVar.f364b == null) {
            Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        Arrays.toString(strArr);
        Arrays.toString(iArr);
        J1.d dVar = gVar.f364b.f698d;
        if (!dVar.f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return;
        }
        o2.a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            Iterator it = ((HashSet) dVar.f719f.e).iterator();
            while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        Trace.endSection();
                        return;
                    }
                    boolean z2 = ((S1.p) it.next()).a(i3, strArr, iArr) || z2;
                }
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f358f.e(androidx.lifecycle.j.ON_RESUME);
        if (l("onResume")) {
            g gVar = this.e;
            gVar.c();
            gVar.f363a.getClass();
            J1.c cVar = gVar.f364b;
            if (cVar != null) {
                R1.b bVar = cVar.f700g;
                bVar.a(2, bVar.f1447c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (l("onSaveInstanceState")) {
            g gVar = this.e;
            gVar.c();
            if (gVar.f363a.k()) {
                bundle.putByteArray("framework", gVar.f364b.f704k.f1484b);
            }
            gVar.f363a.getClass();
            Bundle bundle2 = new Bundle();
            J1.d dVar = gVar.f364b.f698d;
            if (dVar.f()) {
                o2.a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) dVar.f719f.f230i).iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
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
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (gVar.f363a.e() == null || gVar.f363a.j()) {
                return;
            }
            bundle.putBoolean("enableOnBackInvokedCallbackState", gVar.f363a.f357d);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        String string;
        super.onStart();
        this.f358f.e(androidx.lifecycle.j.ON_START);
        if (l("onStart")) {
            g gVar = this.e;
            gVar.c();
            if (gVar.f363a.e() == null && !gVar.f364b.f697c.f748i) {
                String strG = gVar.f363a.g();
                if (strG == null) {
                    AbstractActivityC0028d abstractActivityC0028d = gVar.f363a;
                    abstractActivityC0028d.getClass();
                    strG = gVar.d(abstractActivityC0028d.getIntent());
                    if (strG == null) {
                        strG = "/";
                    }
                }
                AbstractActivityC0028d abstractActivityC0028d2 = gVar.f363a;
                abstractActivityC0028d2.getClass();
                try {
                    Bundle bundleH = abstractActivityC0028d2.h();
                    string = bundleH != null ? bundleH.getString("io.flutter.EntrypointUri") : null;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                gVar.f363a.f();
                ((E0.n) gVar.f364b.f702i.e).b("setInitialRoute", strG, null);
                String strC = gVar.f363a.c();
                if (strC == null || strC.isEmpty()) {
                    strC = ((M1.f) D0.b.J().e).f992d.f980b;
                }
                gVar.f364b.f697c.a(string == null ? new K1.a(strC, gVar.f363a.f()) : new K1.a(strC, string, gVar.f363a.f()), (List) gVar.f363a.getIntent().getSerializableExtra("dart_entrypoint_args"));
            }
            Integer num = gVar.f371j;
            if (num != null) {
                gVar.f365c.setVisibility(num.intValue());
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (l("onStop")) {
            g gVar = this.e;
            gVar.c();
            gVar.f363a.getClass();
            J1.c cVar = gVar.f364b;
            if (cVar != null) {
                R1.b bVar = cVar.f700g;
                bVar.a(5, bVar.f1447c);
            }
            gVar.f371j = Integer.valueOf(gVar.f365c.getVisibility());
            gVar.f365c.setVisibility(8);
            J1.c cVar2 = gVar.f364b;
            if (cVar2 != null) {
                cVar2.f696b.a(40);
            }
        }
        this.f358f.e(androidx.lifecycle.j.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        if (l("onTrimMemory")) {
            g gVar = this.e;
            gVar.c();
            J1.c cVar = gVar.f364b;
            if (cVar != null) {
                if (gVar.f369h && i3 >= 10) {
                    FlutterJNI flutterJNI = cVar.f697c.f744d;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    C0006g c0006g = gVar.f364b.f709p;
                    c0006g.getClass();
                    HashMap map = new HashMap(1);
                    map.put("type", "memoryPressure");
                    ((E0.n) c0006g.e).d(map, null);
                }
                gVar.f364b.f696b.a(i3);
                io.flutter.plugin.platform.i iVar = gVar.f364b.f711r;
                if (i3 < 40) {
                    iVar.getClass();
                    return;
                }
                Iterator it = iVar.f4728h.values().iterator();
                if (it.hasNext()) {
                    ((io.flutter.plugin.platform.o) it.next()).getClass();
                    throw null;
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (l("onUserLeaveHint")) {
            g gVar = this.e;
            gVar.c();
            J1.c cVar = gVar.f364b;
            if (cVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
                return;
            }
            J1.d dVar = cVar.f698d;
            if (!dVar.f()) {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            o2.a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                Iterator it = ((HashSet) dVar.f719f.f229h).iterator();
                if (!it.hasNext()) {
                    Trace.endSection();
                } else {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (l("onWindowFocusChanged")) {
            g gVar = this.e;
            gVar.c();
            gVar.f363a.getClass();
            J1.c cVar = gVar.f364b;
            if (cVar != null) {
                R1.b bVar = cVar.f700g;
                if (z2) {
                    bVar.a(bVar.f1445a, true);
                } else {
                    bVar.a(bVar.f1445a, false);
                }
            }
        }
    }
}
