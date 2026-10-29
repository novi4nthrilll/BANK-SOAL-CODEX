package p048o0;

import A0.g;
import B2.h;
import D0.b;
import E0.n;
import R1.i;
import S1.f;
import S1.m;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class a implements O1.a, m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f5530d;

    @Override // S1.m
    public final void a(g gVar, i iVar) {
        h.e(gVar, "call");
        String str = (String) gVar.e;
        if (h.a(str, "loadRiveLibrary")) {
            try {
                System.loadLibrary("rive_text");
                iVar.c(null);
                return;
            } catch (Throwable th) {
                iVar.a(th.toString(), null, null);
                return;
            }
        }
        if (!h.a(str, "getPlatformVersion")) {
            iVar.b();
            return;
        }
        iVar.c("Android " + Build.VERSION.RELEASE);
    }

    @Override // O1.a
    public final void b(b bVar) {
        h.e(bVar, "flutterPluginBinding");
        n nVar = new n((f) bVar.f182f, "rive");
        this.f5530d = nVar;
        nVar.f(this);
    }

    @Override // O1.a
    public final void k(b bVar) {
        h.e(bVar, "binding");
        n nVar = this.f5530d;
        if (nVar != null) {
            nVar.f(null);
        } else {
            h.g("channel");
            throw null;
        }
    }
}
