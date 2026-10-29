package p079z0;

import java.util.Arrays;
import p070w0.b;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5944b;

    public e(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f5943a = bVar;
        this.f5944b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f5943a.equals(eVar.f5943a)) {
            return Arrays.equals(this.f5944b, eVar.f5944b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5943a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5944b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f5943a + ", bytes=[...]}";
    }
}
