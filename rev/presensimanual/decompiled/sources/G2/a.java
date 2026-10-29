package G2;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f316a;

    public a(e eVar) {
        this.f316a = new AtomicReference(eVar);
    }

    @Override // G2.b
    public final Iterator iterator() {
        b bVar = (b) this.f316a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
