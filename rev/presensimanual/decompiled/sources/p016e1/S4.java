package p016e1;

import O0.h;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p009c1.p;
import p009c1.q;
import p033j1.k;
import p071w1.c;
import p071w1.e;
import p071w1.i;
import p071w1.l;

/* JADX INFO: loaded from: classes.dex */
public final class S4 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static C0712z f4117k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r f4118l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P4 f4121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f4122d;
    public final k e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f4123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f4126i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f4127j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f4118l = new r(2, objArr);
    }

    public S4(Context context, i iVar, P4 p4, String str) {
        this.f4119a = context.getPackageName();
        this.f4120b = c.a(context);
        this.f4122d = iVar;
        this.f4121c = p4;
        U4.b();
        this.f4124g = str;
        e eVarA = e.a();
        p pVar = new p(2, this);
        eVarA.getClass();
        this.e = e.b(pVar);
        e eVarA2 = e.a();
        iVar.getClass();
        q qVar = new q(iVar, 2);
        eVarA2.getClass();
        this.f4123f = e.b(qVar);
        r rVar = f4118l;
        this.f4125h = rVar.containsKey(str) ? Y0.e.d(context, (String) rVar.get(str), false) : -1;
    }

    public static long a(ArrayList arrayList, double d3) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d3 / 100.0d) * ((double) arrayList.size()))) - 1, 0))).longValue();
    }

    public final void b(R4 r4, EnumC0710y3 enumC0710y3) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (d(enumC0710y3, jElapsedRealtime)) {
            this.f4126i.put(enumC0710y3, Long.valueOf(jElapsedRealtime));
            l.f5800d.execute(new C7(this, r4.a(), enumC0710y3, c(), 1));
        }
    }

    public final String c() {
        k kVar = this.e;
        return kVar.f() ? (String) kVar.d() : h.f1272c.a(this.f4124g);
    }

    public final boolean d(EnumC0710y3 enumC0710y3, long j3) {
        HashMap map = this.f4126i;
        return map.get(enumC0710y3) == null || j3 - ((Long) map.get(enumC0710y3)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
