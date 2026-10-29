package p040l1;

import p058r1.a;

/* JADX INFO: loaded from: classes.dex */
public final class n implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f5323c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f5324a = f5323c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile a f5325b;

    public n(a aVar) {
        this.f5325b = aVar;
    }

    @Override // p058r1.a
    public final Object get() {
        Object obj = this.f5324a;
        Object obj2 = f5323c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f5324a;
                    if (obj == obj2) {
                        obj = this.f5325b.get();
                        this.f5324a = obj;
                        this.f5325b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
