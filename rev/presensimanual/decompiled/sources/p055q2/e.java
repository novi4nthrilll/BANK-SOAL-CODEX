package p055q2;

import A2.a;
import B2.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f5600d;
    public volatile Object e = f.f5602a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f5601f = this;

    public e(a aVar) {
        this.f5600d = aVar;
    }

    public final Object a() {
        Object objA;
        Object obj = this.e;
        f fVar = f.f5602a;
        if (obj != fVar) {
            return obj;
        }
        synchronized (this.f5601f) {
            objA = this.e;
            if (objA == fVar) {
                a aVar = this.f5600d;
                h.b(aVar);
                objA = aVar.a();
                this.e = objA;
                this.f5600d = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.e != f.f5602a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
