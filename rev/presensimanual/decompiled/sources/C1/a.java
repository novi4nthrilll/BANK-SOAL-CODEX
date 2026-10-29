package C1;

import com.google.android.gms.internal.mlkit_vision_face_bundled.C7;
import java.util.concurrent.Executor;
import p016e1.EnumC0698w3;
import p016e1.EnumC0710y3;
import p016e1.N3;
import p016e1.S4;
import p016e1.T4;
import p071w1.l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p080z1.c implements A1.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f140i;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(g gVar, p071w1.d dVar, A1.d dVar2) {
        Executor executor = (Executor) dVar.f5781a.get();
        S4 s4B = T4.b(true != i.b() ? "play-services-mlkit-face-detection" : "face-detection");
        super(gVar, executor);
        boolean zB = i.b();
        this.f140i = zB;
        E0.k kVar = new E0.k();
        kVar.f227f = zB ? EnumC0698w3.TYPE_THICK : EnumC0698w3.TYPE_THIN;
        D0.d dVar3 = new D0.d(3);
        dVar3.f191g = i.a(dVar2);
        kVar.f228g = new N3(dVar3);
        l.f5800d.execute(new C7(s4B, new E0.i(kVar, 1), EnumC0710y3.ON_DEVICE_FACE_CREATE, s4B.c(), 1));
    }

    @Override // M0.j
    public final L0.c[] d() {
        return this.f140i ? p071w1.h.f5789a : new L0.c[]{p071w1.h.f5790b};
    }
}
