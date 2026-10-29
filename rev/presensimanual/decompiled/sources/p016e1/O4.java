package p016e1;

import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class O4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4097a;

    public O4(String str) {
        this.f4097a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O4) {
            if (this.f4097a.equals(((O4) obj).f4097a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4097a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return I.h(new StringBuilder("MLKitLoggingOptions{libraryName="), this.f4097a, ", enableFirelog=true, firelogEventType=1}");
    }
}
