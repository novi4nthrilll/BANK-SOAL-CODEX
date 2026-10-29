package I2;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: I2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0042m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A2.l f486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f487d;
    public final Throwable e;

    public C0042m(Object obj, F f3, A2.l lVar, Object obj2, Throwable th) {
        this.f484a = obj;
        this.f485b = f3;
        this.f486c = lVar;
        this.f487d = obj2;
        this.e = th;
    }

    public static C0042m a(C0042m c0042m, F f3, CancellationException cancellationException, int i3) {
        Object obj = c0042m.f484a;
        if ((i3 & 2) != 0) {
            f3 = c0042m.f485b;
        }
        F f4 = f3;
        A2.l lVar = c0042m.f486c;
        Object obj2 = c0042m.f487d;
        Throwable th = cancellationException;
        if ((i3 & 16) != 0) {
            th = c0042m.e;
        }
        c0042m.getClass();
        return new C0042m(obj, f4, lVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0042m)) {
            return false;
        }
        C0042m c0042m = (C0042m) obj;
        return B2.h.a(this.f484a, c0042m.f484a) && B2.h.a(this.f485b, c0042m.f485b) && B2.h.a(this.f486c, c0042m.f486c) && B2.h.a(this.f487d, c0042m.f487d) && B2.h.a(this.e, c0042m.e);
    }

    public final int hashCode() {
        Object obj = this.f484a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        F f3 = this.f485b;
        int iHashCode2 = (iHashCode + (f3 == null ? 0 : f3.hashCode())) * 31;
        A2.l lVar = this.f486c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f487d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f484a + ", cancelHandler=" + this.f485b + ", onCancellation=" + this.f486c + ", idempotentResume=" + this.f487d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ C0042m(Object obj, F f3, A2.l lVar, CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : f3, (i3 & 4) != 0 ? null : lVar, (Object) null, (i3 & 16) != 0 ? null : cancellationException);
    }
}
