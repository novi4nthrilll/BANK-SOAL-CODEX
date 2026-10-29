package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class z implements q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final z f2408l = new z();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2409d;
    public int e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Handler f2412h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2410f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2411g = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f2413i = new s(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final M1.c f2414j = new M1.c(9, this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y f2415k = new y(0, this);

    @Override // androidx.lifecycle.q
    public final s b() {
        return this.f2413i;
    }

    public final void c() {
        int i3 = this.e + 1;
        this.e = i3;
        if (i3 == 1) {
            if (this.f2410f) {
                this.f2413i.e(j.ON_RESUME);
                this.f2410f = false;
            } else {
                Handler handler = this.f2412h;
                B2.h.b(handler);
                handler.removeCallbacks(this.f2414j);
            }
        }
    }
}
