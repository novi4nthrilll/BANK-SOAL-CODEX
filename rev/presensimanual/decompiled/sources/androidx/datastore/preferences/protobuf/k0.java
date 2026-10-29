package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public static j0 a(Object obj) {
        AbstractC0143z abstractC0143z = (AbstractC0143z) obj;
        j0 j0Var = abstractC0143z.unknownFields;
        if (j0Var != j0.f2312f) {
            return j0Var;
        }
        j0 j0Var2 = new j0(0, new int[8], new Object[8], true);
        abstractC0143z.unknownFields = j0Var2;
        return j0Var2;
    }

    public static void b(Object obj) {
        j0 j0Var = ((AbstractC0143z) obj).unknownFields;
        if (j0Var.e) {
            j0Var.e = false;
        }
    }

    public static boolean c(int i3, C0130l c0130l, Object obj) throws E {
        int i4 = c0130l.f2320b;
        int i5 = i4 >>> 3;
        int i6 = i4 & 7;
        AbstractC0129k abstractC0129k = c0130l.f2319a;
        if (i6 == 0) {
            c0130l.w(0);
            ((j0) obj).c(i5 << 3, Long.valueOf(abstractC0129k.n()));
            return true;
        }
        if (i6 == 1) {
            c0130l.w(1);
            ((j0) obj).c((i5 << 3) | 1, Long.valueOf(abstractC0129k.k()));
            return true;
        }
        if (i6 == 2) {
            ((j0) obj).c((i5 << 3) | 2, c0130l.e());
            return true;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                return false;
            }
            if (i6 != 5) {
                throw E.b();
            }
            c0130l.w(5);
            ((j0) obj).c(5 | (i5 << 3), Integer.valueOf(abstractC0129k.j()));
            return true;
        }
        j0 j0Var = new j0(0, new int[8], new Object[8], true);
        int i7 = i5 << 3;
        int i8 = i7 | 4;
        int i9 = i3 + 1;
        if (i9 >= 100) {
            throw new E("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0130l.a() != Integer.MAX_VALUE && c(i9, c0130l, j0Var)) {
        }
        if (i8 != c0130l.f2320b) {
            throw new E("Protocol message end-group tag did not match expected tag.");
        }
        if (j0Var.e) {
            j0Var.e = false;
        }
        ((j0) obj).c(i7 | 3, j0Var);
        return true;
    }
}
