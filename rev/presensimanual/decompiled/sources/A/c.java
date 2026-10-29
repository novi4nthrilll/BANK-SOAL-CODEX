package A;

import O0.u;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3b;

    public /* synthetic */ c(int i3, Object[] objArr) {
        this.f2a = i3;
        this.f3b = objArr;
    }

    public c(L0.a aVar, int i3) {
        u.f(aVar);
        this.f3b = aVar;
        this.f2a = i3;
    }

    public c(int i3) {
        if (i3 > 0) {
            this.f3b = new Object[i3];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
