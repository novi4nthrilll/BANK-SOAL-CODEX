package E1;

import A0.g;
import E0.n;
import S1.f;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class c implements O1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f241d;

    @Override // O1.a
    public final void b(D0.b bVar) {
        n nVar = new n((f) bVar.f182f, "google_mlkit_face_detector");
        this.f241d = nVar;
        nVar.f(new g((Context) bVar.e, 3));
    }

    @Override // O1.a
    public final void k(D0.b bVar) {
        this.f241d.f(null);
    }
}
