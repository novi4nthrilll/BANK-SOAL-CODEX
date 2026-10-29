package J2;

import B2.h;
import I2.A;
import I2.AbstractC0048t;
import I2.C0049u;
import I2.D;
import I2.S;
import N2.o;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import p063s2.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0048t implements A {
    private volatile c _immediate;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f736i;

    public c(Handler handler, String str, boolean z2) {
        this.f733f = handler;
        this.f734g = str;
        this.f735h = z2;
        this._immediate = z2 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f736i = cVar;
    }

    @Override // I2.AbstractC0048t
    public final void d(i iVar, Runnable runnable) {
        if (this.f733f.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        S s3 = (S) iVar.f(C0049u.e);
        if (s3 != null) {
            s3.a(cancellationException);
        }
        D.f435b.d(iVar, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f733f == this.f733f;
    }

    @Override // I2.AbstractC0048t
    public final boolean g() {
        return (this.f735h && h.a(Looper.myLooper(), this.f733f.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f733f);
    }

    @Override // I2.AbstractC0048t
    public final String toString() {
        c cVar;
        String str;
        P2.d dVar = D.f434a;
        c cVar2 = o.f1159a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f736i;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f734g;
        if (string == null) {
            string = this.f733f.toString();
        }
        if (!this.f735h) {
            return string;
        }
        return string + ".immediate";
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
