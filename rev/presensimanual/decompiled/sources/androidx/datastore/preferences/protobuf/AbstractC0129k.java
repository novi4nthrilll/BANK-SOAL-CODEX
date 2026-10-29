package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0129k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0130l f2318b;

    public abstract void a(int i3);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i3);

    public abstract int e(int i3);

    public abstract boolean f();

    public abstract C0126h g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i3);

    public final void y() {
        boolean zX;
        do {
            int iU = u();
            if (iU == 0) {
                return;
            }
            int i3 = this.f2317a;
            if (i3 >= 100) {
                throw new E("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f2317a = i3 + 1;
            zX = x(iU);
            this.f2317a--;
        } while (zX);
    }
}
