package A0;

import android.content.Context;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H0.a f9b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H0.a f10c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11d;

    public b(Context context, H0.a aVar, H0.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f8a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f9b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f10c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f11d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f8a.equals(((b) dVar).f8a)) {
            b bVar = (b) dVar;
            if (this.f9b.equals(bVar.f9b) && this.f10c.equals(bVar.f10c) && this.f11d.equals(bVar.f11d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f8a.hashCode() ^ 1000003) * 1000003) ^ this.f9b.hashCode()) * 1000003) ^ this.f10c.hashCode()) * 1000003) ^ this.f11d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f8a);
        sb.append(", wallClock=");
        sb.append(this.f9b);
        sb.append(", monotonicClock=");
        sb.append(this.f10c);
        sb.append(", backendName=");
        return I.h(sb, this.f11d, "}");
    }
}
