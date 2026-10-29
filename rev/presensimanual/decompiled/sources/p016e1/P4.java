package p016e1;

import D0.b;
import E0.i;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.L4;
import p040l1.n;
import p070w0.c;
import p073x0.a;
import p079z0.g;
import p079z0.h;

/* JADX INFO: loaded from: classes.dex */
public final class P4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4101b;

    public P4(Context context, O4 o4, int i3) {
        this.f4100a = i3;
        switch (i3) {
            case 1:
                a aVar = a.e;
                h.b(context);
                b bVarC = h.a().c(aVar);
                if (a.f5822d.contains(new p070w0.b("json"))) {
                    new n(new L4(2, bVarC));
                }
                this.f4101b = new n(new L4(3, bVarC));
                break;
            default:
                ArrayList arrayList = new ArrayList();
                this.f4101b = arrayList;
                arrayList.add(new P4(context, o4, 1));
                break;
        }
    }

    public final void a(i iVar) {
        switch (this.f4100a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Iterator it = ((ArrayList) this.f4101b).iterator();
                while (it.hasNext()) {
                    ((P4) it.next()).a(iVar);
                }
                break;
            default:
                ((g) ((n) this.f4101b).get()).a(iVar.e != 0 ? new p070w0.a(iVar.f(), c.f5774d) : new p070w0.a(iVar.f(), c.e));
                break;
        }
    }
}
