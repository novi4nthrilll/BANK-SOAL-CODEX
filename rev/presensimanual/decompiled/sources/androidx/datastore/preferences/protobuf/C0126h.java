package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0126h implements Iterable, Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0126h f2295f = new C0126h(C.f2219b);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0124f f2296g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2297d = 0;
    public final byte[] e;

    static {
        f2296g = AbstractC0121c.a() ? new C0124f(1) : new C0124f(0);
    }

    public C0126h(byte[] bArr) {
        bArr.getClass();
        this.e = bArr;
    }

    public static int d(int i3, int i4, int i5) {
        int i6 = i4 - i3;
        if ((i3 | i4 | i6 | (i5 - i4)) >= 0) {
            return i6;
        }
        if (i3 >= 0) {
            if (i4 < i3) {
                throw new IndexOutOfBoundsException(A0.c.h("Beginning index larger than ending index: ", i3, ", ", i4));
            }
            throw new IndexOutOfBoundsException(A0.c.h("End index: ", i4, " >= ", i5));
        }
        throw new IndexOutOfBoundsException("Beginning index: " + i3 + " < 0");
    }

    public static C0126h e(byte[] bArr, int i3, int i4) {
        byte[] bArrCopyOfRange;
        d(i3, i3 + i4, bArr.length);
        switch (f2296g.f2286a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, i4 + i3);
                break;
            default:
                bArrCopyOfRange = new byte[i4];
                System.arraycopy(bArr, i3, bArrCopyOfRange, 0, i4);
                break;
        }
        return new C0126h(bArrCopyOfRange);
    }

    public byte c(int i3) {
        return this.e[i3];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0126h) || size() != ((C0126h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0126h)) {
            return obj.equals(this);
        }
        C0126h c0126h = (C0126h) obj;
        int i3 = this.f2297d;
        int i4 = c0126h.f2297d;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        int size = size();
        if (size > c0126h.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0126h.size()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + size + ", " + c0126h.size());
        }
        int iG = g() + size;
        int iG2 = g();
        int iG3 = c0126h.g();
        while (iG2 < iG) {
            if (this.e[iG2] != c0126h.e[iG3]) {
                return false;
            }
            iG2++;
            iG3++;
        }
        return true;
    }

    public void f(byte[] bArr, int i3) {
        System.arraycopy(this.e, 0, bArr, 0, i3);
    }

    public int g() {
        return 0;
    }

    public byte h(int i3) {
        return this.e[i3];
    }

    public final int hashCode() {
        int i3 = this.f2297d;
        if (i3 == 0) {
            int size = size();
            int iG = g();
            int i4 = size;
            for (int i5 = iG; i5 < iG + size; i5++) {
                i4 = (i4 * 31) + this.e[i5];
            }
            i3 = i4 == 0 ? 1 : i4;
            this.f2297d = i3;
        }
        return i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0123e(this);
    }

    public int size() {
        return this.e.length;
    }

    public final String toString() {
        C0126h c0125g;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = p013d1.G.a(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iD = d(0, 47, size());
            if (iD == 0) {
                c0125g = f2295f;
            } else {
                c0125g = new C0125g(this.e, g(), iD);
            }
            sb.append(p013d1.G.a(c0125g));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return p013d1.I.h(sb2, string, "\">");
    }
}
