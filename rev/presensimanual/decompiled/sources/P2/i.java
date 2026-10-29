package P2;

import I1.w;
import I2.AbstractC0052x;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f1347f;

    public i(Runnable runnable, long j3, w wVar) {
        super(j3, wVar);
        this.f1347f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1347f.run();
        } finally {
            this.e.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1347f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0052x.b(runnable));
        sb.append(", ");
        sb.append(this.f1346d);
        sb.append(", ");
        sb.append(this.e);
        sb.append(']');
        return sb.toString();
    }
}
