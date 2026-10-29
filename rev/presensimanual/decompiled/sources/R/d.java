package R;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1414b;

    public d(long j3, long j4) {
        if (j4 == 0) {
            this.f1413a = 0L;
            this.f1414b = 1L;
        } else {
            this.f1413a = j3;
            this.f1414b = j4;
        }
    }

    public final String toString() {
        return this.f1413a + "/" + this.f1414b;
    }
}
