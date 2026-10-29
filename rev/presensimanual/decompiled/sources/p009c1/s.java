package p009c1;

import T.b;
import android.content.Context;
import java.util.ArrayList;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.H4;
import p013d1.J4;
import p013d1.K4;
import p016e1.O4;
import p016e1.P4;
import p016e1.S4;
import p067u1.a;
import p071w1.f;
import p071w1.i;
import p079z0.h;

/* JADX INFO: loaded from: classes.dex */
public final class s extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2675b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i3) {
        super(2);
        this.f2675b = i3;
    }

    @Override // T.b
    public final Object a(Object obj) {
        switch (this.f2675b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                f fVarC = f.c();
                Context contextB = f.c().b();
                ArrayList arrayList = new ArrayList();
                a aVar = new a();
                p073x0.a aVar2 = p073x0.a.e;
                h.b(contextB);
                h.a().c(aVar2);
                p073x0.a.f5822d.contains(new p070w0.b("json"));
                arrayList.add(aVar);
                return new r(fVarC.b(), (i) fVarC.a(i.class));
            case 1:
                f fVarC2 = f.c();
                return new K4(fVarC2.b(), (i) fVarC2.a(i.class), new J4(f.c().b(), (H4) obj));
            default:
                O4 o4 = (O4) obj;
                f fVarC3 = f.c();
                return new S4(fVarC3.b(), (i) fVarC3.a(i.class), new P4(f.c().b(), o4, 0), o4.f4097a);
        }
    }
}
