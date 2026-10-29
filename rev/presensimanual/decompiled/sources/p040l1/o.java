package p040l1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p058r1.a;

/* JADX INFO: loaded from: classes.dex */
public final class o implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f5326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f5327b;

    public final synchronized void a() {
        try {
            Iterator it = this.f5326a.iterator();
            while (it.hasNext()) {
                this.f5327b.add(((a) it.next()).get());
            }
            this.f5326a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p058r1.a
    public final Object get() {
        if (this.f5327b == null) {
            synchronized (this) {
                try {
                    if (this.f5327b == null) {
                        this.f5327b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableSet(this.f5327b);
    }
}
