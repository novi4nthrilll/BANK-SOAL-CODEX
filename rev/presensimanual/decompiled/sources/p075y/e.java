package p075y;

import A.a;
import W1.C0104l;
import java.util.ArrayList;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p045n.l;

/* JADX INFO: loaded from: classes.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5845b;

    public /* synthetic */ e(int i3, Object obj) {
        this.f5844a = i3;
        this.f5845b = obj;
    }

    @Override // A.a
    public final void accept(Object obj) {
        switch (this.f5844a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((C0104l) this.f5845b).e(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f5850c) {
                    try {
                        l lVar = g.f5851d;
                        ArrayList arrayList = (ArrayList) lVar.getOrDefault((String) this.f5845b, null);
                        if (arrayList == null) {
                            return;
                        }
                        lVar.remove((String) this.f5845b);
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            ((a) arrayList.get(i3)).accept(fVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
