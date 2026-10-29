package p013d1;

import D0.b;
import W1.C0104l;
import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0198e7;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import p040l1.n;
import p070w0.c;
import p073x0.a;
import p079z0.g;
import p079z0.h;

/* JADX INFO: loaded from: classes.dex */
public final class M4 implements I4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f3614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H4 f3615b;

    public M4(Context context, H4 h4) {
        this.f3615b = h4;
        a aVar = a.e;
        h.b(context);
        b bVarC = h.a().c(aVar);
        if (a.f5822d.contains(new p070w0.b("json"))) {
            new n(new L4(0, bVarC));
        }
        this.f3614a = new n(new L4(1, bVarC));
    }

    @Override // p013d1.I4
    public final void a(C0104l c0104l) {
        g gVar = (g) this.f3614a.get();
        ((C0198e7) c0104l.f1774d).f3045h = false;
        C0198e7 c0198e7 = (C0198e7) c0104l.f1774d;
        c0198e7.f3043f = Boolean.FALSE;
        C0474k4 c0474k4 = new C0474k4(c0198e7);
        b bVar = (b) c0104l.e;
        bVar.e = c0474k4;
        try {
            P4.b();
            P4 p4 = P4.f3628c;
            C0467j3 c0467j3 = new C0467j3(bVar);
            C0445g c0445g = new C0445g();
            p4.a(c0445g);
            gVar.a(new p070w0.a(new C0445g(new HashMap(c0445g.f3733a), new HashMap(c0445g.f3734b), c0445g.f3735c).b(c0467j3), c.e));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
