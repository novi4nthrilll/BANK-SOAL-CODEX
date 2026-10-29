package O;

import java.util.concurrent.ThreadPoolExecutor;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0487n;
import p013d1.AbstractC0493o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1188d;
    public final /* synthetic */ Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1190g;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i3) {
        this.f1188d = i3;
        this.e = obj;
        this.f1189f = obj2;
        this.f1190g = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1188d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                l lVar = (l) this.e;
                AbstractC0493o abstractC0493o = (AbstractC0493o) this.f1189f;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1190g;
                lVar.getClass();
                try {
                    q qVarA = AbstractC0487n.a(lVar.f1193a);
                    if (qVarA == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    p pVar = (p) qVarA.f1212a;
                    synchronized (pVar.f1207d) {
                        pVar.f1208f = threadPoolExecutor;
                        break;
                    }
                    qVarA.f1212a.a(new k(abstractC0493o, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC0493o.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                ((W1.s) this.e).c(new W1.u((String) this.f1189f, (String) this.f1190g, null));
                return;
        }
    }
}
