package C1;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import p016e1.S4;
import p016e1.T4;

/* JADX INFO: loaded from: classes.dex */
public final class e extends T.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p071w1.f f150b;

    public e(p071w1.f fVar) {
        super(2);
        this.f150b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    @Override // T.b
    public final Object a(Object obj) {
        c bVar;
        A1.d dVar = (A1.d) obj;
        Context contextB = this.f150b.b();
        S4 s4B = T4.b(true != i.b() ? "play-services-mlkit-face-detection" : "face-detection");
        if (Y0.e.a(contextB, ModuleDescriptor.MODULE_ID) > 0) {
            bVar = new b(contextB, dVar, s4B);
        } else {
            L0.e.f872b.getClass();
            if (L0.e.a(contextB) >= 204500000) {
                bVar = new b(contextB, dVar, s4B);
            } else {
                bVar = new k(contextB, dVar, s4B);
            }
        }
        return new g(T4.b(true != i.b() ? "play-services-mlkit-face-detection" : "face-detection"), dVar, bVar);
    }
}
