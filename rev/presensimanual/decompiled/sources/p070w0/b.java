package p070w0;

import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5773a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f5773a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f5773a.equals(((b) obj).f5773a);
    }

    public final int hashCode() {
        return this.f5773a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return I.h(new StringBuilder("Encoding{name=\""), this.f5773a, "\"}");
    }
}
