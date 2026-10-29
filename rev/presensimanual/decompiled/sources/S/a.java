package S;

import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1553d;
    public final /* synthetic */ d e;

    public /* synthetic */ a(d dVar, int i3) {
        this.f1553d = i3;
        this.e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1553d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.e.f1566n.onDismiss(null);
                break;
            default:
                d dVar = this.e;
                if (dVar.f1560h != null) {
                    if (dVar.f1560h == null) {
                        D0.b bVar = new D0.b(10, false);
                        Object obj = d.f1556r;
                        bVar.e = obj;
                        bVar.f182f = obj;
                        bVar.f183g = obj;
                        dVar.f1560h = bVar;
                    }
                    dVar.f1560h.getClass();
                }
                break;
        }
    }
}
