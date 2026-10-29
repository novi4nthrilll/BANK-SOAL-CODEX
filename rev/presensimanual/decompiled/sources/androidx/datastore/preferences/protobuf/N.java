package androidx.datastore.preferences.protobuf;

import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f2239a;

    public N(t0 t0Var, v0 v0Var, M.k kVar) {
        this.f2239a = new M(t0Var, v0Var, kVar);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x0109  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0120  */
    /* JADX WARN: Code duplicated, block: B:45:0x0132  */
    /* JADX WARN: Code duplicated, block: B:47:0x013c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:50:0x0153  */
    /* JADX WARN: Code duplicated, block: B:51:0x0160  */
    /* JADX WARN: Code duplicated, block: B:53:0x0164  */
    /* JADX WARN: Code duplicated, block: B:54:0x016d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0179  */
    /* JADX WARN: Code duplicated, block: B:57:0x0187  */
    /* JADX WARN: Code duplicated, block: B:58:0x0191  */
    /* JADX WARN: Code duplicated, block: B:60:0x0195  */
    /* JADX WARN: Code duplicated, block: B:61:0x019d  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e8  */
    public static int a(M m3, Object obj, Object obj2) {
        int iB;
        int iA;
        int iZ;
        int i3;
        int iX;
        v0 v0Var;
        int iA2;
        int iZ2;
        int iB2 = 1;
        int i4 = C0137t.f2344c;
        int iX2 = C0132n.x(1);
        u0 u0Var = x0.f2355g;
        t0 t0Var = m3.f2236a;
        if (t0Var == u0Var) {
            iX2 *= 2;
        }
        switch (t0Var.ordinal()) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((Double) obj).getClass();
                iB = 8;
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue >> 31) ^ (iIntValue << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue >> 63) ^ (jLongValue << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                iB = 4;
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue2 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue2 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 2:
                iB = C0132n.B(((Long) obj).longValue());
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue3 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue3 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                iB = C0132n.B(((Long) obj).longValue());
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue4 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue4 >> 31) ^ (iIntValue4 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue4 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue4 >> 63) ^ (jLongValue4 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                iB = C0132n.B(((Integer) obj).intValue());
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue5 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue5 >> 31) ^ (iIntValue5 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue5 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue5 >> 63) ^ (jLongValue5 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                iB = 8;
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue6 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue6 >> 31) ^ (iIntValue6 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue6 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue6 >> 63) ^ (jLongValue6 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                iB = 4;
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue7 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue7 >> 31) ^ (iIntValue7 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue7 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue7 >> 63) ^ (jLongValue7 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                iB = 1;
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue8 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue8 >> 31) ^ (iIntValue8 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue8 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue8 >> 63) ^ (jLongValue8 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                iB = obj instanceof C0126h ? C0132n.i((C0126h) obj) : C0132n.w((String) obj);
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue9 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue9 >> 31) ^ (iIntValue9 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue9 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue9 >> 63) ^ (jLongValue9 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 9:
                iB = ((AbstractC0143z) ((AbstractC0119a) obj)).a(null);
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue10 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue10 >> 31) ^ (iIntValue10 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue10 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue10 >> 63) ^ (jLongValue10 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 10:
                iA = ((AbstractC0143z) ((AbstractC0119a) obj)).a(null);
                iZ = C0132n.z(iA);
                iB = iA + iZ;
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue11 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue11 >> 31) ^ (iIntValue11 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue11 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue11 >> 63) ^ (jLongValue11 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 11:
                if (obj instanceof C0126h) {
                    iB = C0132n.i((C0126h) obj);
                } else {
                    iA = ((byte[]) obj).length;
                    iZ = C0132n.z(iA);
                    iB = iA + iZ;
                }
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue12 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue12 >> 31) ^ (iIntValue12 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue12 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue12 >> 63) ^ (jLongValue12 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 12:
                iB = C0132n.z(((Integer) obj).intValue());
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue13 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue13 >> 31) ^ (iIntValue13 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue13 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue13 >> 63) ^ (jLongValue13 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 13:
                iB = C0132n.B(((Integer) obj).intValue());
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue14 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue14 >> 31) ^ (iIntValue14 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue14 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue14 >> 63) ^ (jLongValue14 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 14:
                ((Integer) obj).getClass();
                iB = 4;
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue15 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue15 >> 31) ^ (iIntValue15 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue15 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue15 >> 63) ^ (jLongValue15 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 15:
                ((Long) obj).getClass();
                iB = 8;
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue16 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue16 >> 31) ^ (iIntValue16 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue16 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue16 >> 63) ^ (jLongValue16 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 16:
                int iIntValue17 = ((Integer) obj).intValue();
                iB = C0132n.z((iIntValue17 >> 31) ^ (iIntValue17 << 1));
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue18 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue18 >> 31) ^ (iIntValue18 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue17 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue17 >> 63) ^ (jLongValue17 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 17:
                long jLongValue18 = ((Long) obj).longValue();
                iB = C0132n.B((jLongValue18 >> 63) ^ (jLongValue18 << 1));
                i3 = iB + iX2;
                iX = C0132n.x(2);
                v0Var = m3.f2237b;
                if (v0Var == u0Var) {
                    iX *= 2;
                }
                switch (v0Var.ordinal()) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        ((Double) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 2:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        iB2 = C0132n.B(((Long) obj2).longValue());
                        return iB2 + iX + i3;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return iB2 + iX + i3;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iB2 = C0132n.w((String) obj2);
                        }
                        return iB2 + iX + i3;
                    case 9:
                        iB2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        return iB2 + iX + i3;
                    case 10:
                        iA2 = ((AbstractC0143z) ((AbstractC0119a) obj2)).a(null);
                        iZ2 = C0132n.z(iA2);
                        iB2 = iZ2 + iA2;
                        return iB2 + iX + i3;
                    case 11:
                        if (obj2 instanceof C0126h) {
                            iB2 = C0132n.i((C0126h) obj2);
                        } else {
                            iA2 = ((byte[]) obj2).length;
                            iZ2 = C0132n.z(iA2);
                            iB2 = iZ2 + iA2;
                        }
                        return iB2 + iX + i3;
                    case 12:
                        iB2 = C0132n.z(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 13:
                        iB2 = C0132n.B(((Integer) obj2).intValue());
                        return iB2 + iX + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        iB2 = 4;
                        return iB2 + iX + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        iB2 = 8;
                        return iB2 + iX + i3;
                    case 16:
                        int iIntValue19 = ((Integer) obj2).intValue();
                        iB2 = C0132n.z((iIntValue19 >> 31) ^ (iIntValue19 << 1));
                        return iB2 + iX + i3;
                    case 17:
                        long jLongValue19 = ((Long) obj2).longValue();
                        iB2 = C0132n.B((jLongValue19 >> 63) ^ (jLongValue19 << 1));
                        return iB2 + iX + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
