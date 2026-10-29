package p009c1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2649c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f2647a = obj;
        this.f2648b = obj2;
        this.f2649c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f2647a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj) + "=" + String.valueOf(this.f2648b) + " and " + String.valueOf(obj) + "=" + String.valueOf(this.f2649c));
    }
}
