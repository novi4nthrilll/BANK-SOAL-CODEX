package S1;

import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f1589a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D0.b f1590b;

    public g(D0.b bVar) {
        this.f1590b = bVar;
    }

    public final void a(String str, String str2, String str3) throws IOException {
        if (this.f1589a.get()) {
            return;
        }
        D0.b bVar = this.f1590b;
        if (((AtomicReference) bVar.f182f).get() != this) {
            return;
        }
        D0.b bVar2 = (D0.b) bVar.f183g;
        ((f) bVar2.e).f((String) bVar2.f182f, ((s) bVar2.f183g).f(str, str2, str3));
    }

    public final void b(Serializable serializable) throws IOException {
        if (this.f1589a.get()) {
            return;
        }
        D0.b bVar = this.f1590b;
        if (((AtomicReference) bVar.f182f).get() != this) {
            return;
        }
        D0.b bVar2 = (D0.b) bVar.f183g;
        ((f) bVar2.e).f((String) bVar2.f182f, ((s) bVar2.f183g).a(serializable));
    }
}
