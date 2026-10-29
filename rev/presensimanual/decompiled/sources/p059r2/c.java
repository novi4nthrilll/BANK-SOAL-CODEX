package p059r2;

import B2.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void a(int i3, int i4, int i5, byte[] bArr, byte[] bArr2) {
        h.e(bArr, "<this>");
        h.e(bArr2, "destination");
        System.arraycopy(bArr, i4, bArr2, i3, i5 - i4);
    }

    public static final void b(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        h.e(objArr, "<this>");
        h.e(objArr2, "destination");
        System.arraycopy(objArr, i4, objArr2, i3, i5 - i4);
    }

    public static final void c(int i3, int i4) {
        if (i3 <= i4) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i4 + ").");
    }
}
