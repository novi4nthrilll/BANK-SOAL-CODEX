package M2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c[] f996d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f997f;

    public final void a(L2.s sVar) {
        synchronized (this) {
            try {
                int i3 = this.e - 1;
                this.e = i3;
                if (i3 == 0) {
                    this.f997f = 0;
                }
                B2.h.c(sVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                L2.s.f951a.set(sVar, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
