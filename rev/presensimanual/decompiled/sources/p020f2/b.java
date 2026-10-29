package p020f2;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    off("off"),
    fast("fast"),
    highQuality("highQuality"),
    minimal("minimal"),
    zeroShutterLag("zeroShutterLag");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4477d;

    b(String str) {
        this.f4477d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f4477d;
    }
}
