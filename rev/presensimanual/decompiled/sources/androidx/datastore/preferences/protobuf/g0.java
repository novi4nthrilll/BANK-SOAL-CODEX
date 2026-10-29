package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.mlkit_vision_face_bundled.P8;
import com.google.android.gms.internal.mlkit_vision_face_bundled.Q8;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2291d;
    public int e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f2293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f2294h;

    public /* synthetic */ g0(AbstractMap abstractMap, int i3) {
        this.f2291d = i3;
        this.f2294h = abstractMap;
    }

    public Iterator a() {
        if (this.f2293g == null) {
            this.f2293g = ((e0) this.f2294h).e.entrySet().iterator();
        }
        return this.f2293g;
    }

    public Iterator b() {
        if (this.f2293g == null) {
            this.f2293g = ((P8) this.f2294h).f2882f.entrySet().iterator();
        }
        return this.f2293g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2291d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                int i3 = this.e + 1;
                e0 e0Var = (e0) this.f2294h;
                if (i3 >= e0Var.f2282d.size()) {
                    return !e0Var.e.isEmpty() && a().hasNext();
                }
                return true;
            default:
                boolean z2 = true;
                int i4 = this.e + 1;
                P8 p8 = (P8) this.f2294h;
                if (i4 >= p8.e) {
                    if (p8.f2882f.isEmpty()) {
                        z2 = false;
                    } else if (!b().hasNext()) {
                        return false;
                    }
                }
                return z2;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2291d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.f2292f = true;
                int i3 = this.e + 1;
                this.e = i3;
                e0 e0Var = (e0) this.f2294h;
                return i3 < e0Var.f2282d.size() ? (Map.Entry) e0Var.f2282d.get(this.e) : (Map.Entry) a().next();
            default:
                this.f2292f = true;
                int i4 = this.e + 1;
                this.e = i4;
                P8 p8 = (P8) this.f2294h;
                return i4 < p8.e ? (Q8) p8.f2881d[i4] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f2294h;
        switch (this.f2291d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (!this.f2292f) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f2292f = false;
                int i3 = e0.f2281i;
                e0 e0Var = (e0) abstractMap;
                e0Var.b();
                if (this.e >= e0Var.f2282d.size()) {
                    a().remove();
                    return;
                }
                int i4 = this.e;
                this.e = i4 - 1;
                e0Var.h(i4);
                return;
            default:
                if (!this.f2292f) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f2292f = false;
                int i5 = P8.f2880j;
                P8 p8 = (P8) abstractMap;
                p8.h();
                int i6 = this.e;
                if (i6 >= p8.e) {
                    b().remove();
                    return;
                } else {
                    this.e = i6 - 1;
                    p8.f(i6);
                    return;
                }
        }
    }
}
