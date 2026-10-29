package p079z0;

import android.util.Base64;
import java.util.Arrays;
import p070w0.c;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f5938c;

    public b(String str, byte[] bArr, c cVar) {
        this.f5936a = str;
        this.f5937b = bArr;
        this.f5938c = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5936a.equals(bVar.f5936a) && Arrays.equals(this.f5937b, bVar.f5937b) && this.f5938c.equals(bVar.f5938c);
    }

    public final int hashCode() {
        return ((((this.f5936a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5937b)) * 1000003) ^ this.f5938c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f5937b;
        return "TransportContext(" + this.f5936a + ", " + this.f5938c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }
}
