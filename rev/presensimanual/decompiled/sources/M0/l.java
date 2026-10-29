package M0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends UnsupportedOperationException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L0.c f974d;

    public l(L0.c cVar) {
        this.f974d = cVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f974d));
    }
}
