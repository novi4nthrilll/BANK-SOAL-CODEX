package O0;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f1306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1309d;
    public final Bundle e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1310f;

    public r(com.google.android.gms.common.internal.a aVar, int i3, Bundle bundle) {
        this.f1310f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f1308c = aVar;
        this.f1306a = bool;
        this.f1307b = false;
        this.f1309d = i3;
        this.e = bundle;
    }

    public abstract void a(L0.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f1306a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f1308c.f2721k) {
            this.f1308c.f2721k.remove(this);
        }
    }
}
