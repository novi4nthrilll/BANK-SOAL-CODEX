package M0;

import I1.x;
import N0.C0080a;
import N0.C0081b;
import N0.C0083d;
import N0.E;
import N0.F;
import N0.z;
import O0.u;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A0.g f969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f970d;
    public final C0081b e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0080a f972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0083d f973h;

    public f(Context context, A0.g gVar, b bVar, e eVar) {
        u.g(context, "Null context is not permitted.");
        u.g(gVar, "Api must not be null.");
        u.g(eVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        u.g(applicationContext, "The provided context did not have an application context.");
        this.f967a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f968b = attributionTag;
        this.f969c = gVar;
        this.f970d = bVar;
        this.e = new C0081b(gVar, bVar, attributionTag);
        C0083d c0083dF = C0083d.f(applicationContext);
        this.f973h = c0083dF;
        this.f971f = c0083dF.f1075h.getAndIncrement();
        this.f972g = eVar.f966a;
        Z0.f fVar = c0083dF.f1080m;
        fVar.sendMessage(fVar.obtainMessage(7, this));
    }

    public final D0.b a() {
        D0.b bVar = new D0.b(6, false);
        Set setEmptySet = Collections.emptySet();
        if (((p045n.c) bVar.e) == null) {
            bVar.e = new p045n.c(0);
        }
        ((p045n.c) bVar.e).addAll(setEmptySet);
        Context context = this.f967a;
        bVar.f183g = context.getClass().getName();
        bVar.f182f = context.getPackageName();
        return bVar;
    }

    public final p033j1.k b(N0.h hVar, int i3) {
        u.g(hVar, "Listener key cannot be null.");
        C0083d c0083d = this.f973h;
        c0083d.getClass();
        p033j1.e eVar = new p033j1.e();
        c0083d.e(eVar, i3, this);
        z zVar = new z(new E(hVar, eVar), c0083d.f1076i.get(), this);
        Z0.f fVar = c0083d.f1080m;
        fVar.sendMessage(fVar.obtainMessage(13, zVar));
        return eVar.f4990a;
    }

    public final p033j1.k c(int i3, x xVar) {
        p033j1.e eVar = new p033j1.e();
        C0083d c0083d = this.f973h;
        c0083d.getClass();
        c0083d.e(eVar, xVar.f430c, this);
        z zVar = new z(new F(i3, xVar, eVar, this.f972g), c0083d.f1076i.get(), this);
        Z0.f fVar = c0083d.f1080m;
        fVar.sendMessage(fVar.obtainMessage(4, zVar));
        return eVar.f4990a;
    }
}
