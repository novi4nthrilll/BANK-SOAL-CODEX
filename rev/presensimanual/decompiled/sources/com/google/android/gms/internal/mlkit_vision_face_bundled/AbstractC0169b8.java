package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.datastore.preferences.protobuf.C0123e;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0169b8 implements Iterable, Serializable {
    public static final C0159a8 e = new C0159a8(AbstractC0348t8.f3461b);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2995d;

    static {
        int i3 = W7.f2943a;
    }

    public static int f(int i3, int i4, int i5) {
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

    public static C0159a8 g(byte[] bArr, int i3, int i4) {
        f(i3, i3 + i4, bArr.length);
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i3, bArr2, 0, i4);
        return new C0159a8(bArr2);
    }

    public abstract byte c(int i3);

    public abstract byte d(int i3);

    public abstract int e();

    public final int hashCode() {
        int i3 = this.f2995d;
        if (i3 != 0) {
            return i3;
        }
        int iE = e();
        C0159a8 c0159a8 = (C0159a8) this;
        int i4 = iE;
        for (int i5 = 0; i5 < iE; i5++) {
            i4 = (i4 * 31) + c0159a8.f2989f[i5];
        }
        if (i4 == 0) {
            i4 = 1;
        }
        this.f2995d = i4;
        return i4;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0123e(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iE = e();
        if (e() <= 50) {
            strConcat = J.a(this);
        } else {
            C0159a8 c0159a8 = (C0159a8) this;
            int iF = f(0, 47, c0159a8.e());
            strConcat = J.a(iF == 0 ? e : new Z7(c0159a8.f2989f, iF)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iE);
        sb.append(" contents=\"");
        return p013d1.I.h(sb, strConcat, "\">");
    }
}
