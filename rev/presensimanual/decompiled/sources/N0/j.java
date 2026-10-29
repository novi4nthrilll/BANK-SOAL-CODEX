package N0;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f1085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f1086c;

    public j(Looper looper, Object obj, String str) {
        this.f1084a = new o(looper);
        O0.u.g(obj, "Listener must not be null");
        this.f1085b = obj;
        O0.u.d(str);
        this.f1086c = new h(obj, str);
    }

    public void a(i iVar) {
        ((o) this.f1084a).execute(new E0.e(2, this, iVar));
    }

    public j(O.h hVar) {
        this.f1084a = hVar;
    }
}
