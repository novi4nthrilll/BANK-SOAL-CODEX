package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0138u {
    public static final EnumC0138u e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC0138u f2347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC0138u[] f2348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0138u[] f2349h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2350d;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0138u EF6;

    static {
        F f3 = F.DOUBLE;
        EnumC0138u enumC0138u = new EnumC0138u("DOUBLE", 0, 0, 1, f3);
        F f4 = F.FLOAT;
        EnumC0138u enumC0138u2 = new EnumC0138u("FLOAT", 1, 1, 1, f4);
        F f5 = F.LONG;
        EnumC0138u enumC0138u3 = new EnumC0138u("INT64", 2, 2, 1, f5);
        EnumC0138u enumC0138u4 = new EnumC0138u("UINT64", 3, 3, 1, f5);
        F f6 = F.INT;
        EnumC0138u enumC0138u5 = new EnumC0138u("INT32", 4, 4, 1, f6);
        EnumC0138u enumC0138u6 = new EnumC0138u("FIXED64", 5, 5, 1, f5);
        EnumC0138u enumC0138u7 = new EnumC0138u("FIXED32", 6, 6, 1, f6);
        F f7 = F.BOOLEAN;
        EnumC0138u enumC0138u8 = new EnumC0138u("BOOL", 7, 7, 1, f7);
        F f8 = F.STRING;
        EnumC0138u enumC0138u9 = new EnumC0138u("STRING", 8, 8, 1, f8);
        F f9 = F.MESSAGE;
        EnumC0138u enumC0138u10 = new EnumC0138u("MESSAGE", 9, 9, 1, f9);
        F f10 = F.BYTE_STRING;
        EnumC0138u enumC0138u11 = new EnumC0138u("BYTES", 10, 10, 1, f10);
        EnumC0138u enumC0138u12 = new EnumC0138u("UINT32", 11, 11, 1, f6);
        F f11 = F.ENUM;
        EnumC0138u enumC0138u13 = new EnumC0138u("ENUM", 12, 12, 1, f11);
        EnumC0138u enumC0138u14 = new EnumC0138u("SFIXED32", 13, 13, 1, f6);
        EnumC0138u enumC0138u15 = new EnumC0138u("SFIXED64", 14, 14, 1, f5);
        EnumC0138u enumC0138u16 = new EnumC0138u("SINT32", 15, 15, 1, f6);
        EnumC0138u enumC0138u17 = new EnumC0138u("SINT64", 16, 16, 1, f5);
        EnumC0138u enumC0138u18 = new EnumC0138u("GROUP", 17, 17, 1, f9);
        EnumC0138u enumC0138u19 = new EnumC0138u("DOUBLE_LIST", 18, 18, 2, f3);
        EnumC0138u enumC0138u20 = new EnumC0138u("FLOAT_LIST", 19, 19, 2, f4);
        EnumC0138u enumC0138u21 = new EnumC0138u("INT64_LIST", 20, 20, 2, f5);
        EnumC0138u enumC0138u22 = new EnumC0138u("UINT64_LIST", 21, 21, 2, f5);
        EnumC0138u enumC0138u23 = new EnumC0138u("INT32_LIST", 22, 22, 2, f6);
        EnumC0138u enumC0138u24 = new EnumC0138u("FIXED64_LIST", 23, 23, 2, f5);
        EnumC0138u enumC0138u25 = new EnumC0138u("FIXED32_LIST", 24, 24, 2, f6);
        EnumC0138u enumC0138u26 = new EnumC0138u("BOOL_LIST", 25, 25, 2, f7);
        EnumC0138u enumC0138u27 = new EnumC0138u("STRING_LIST", 26, 26, 2, f8);
        EnumC0138u enumC0138u28 = new EnumC0138u("MESSAGE_LIST", 27, 27, 2, f9);
        EnumC0138u enumC0138u29 = new EnumC0138u("BYTES_LIST", 28, 28, 2, f10);
        EnumC0138u enumC0138u30 = new EnumC0138u("UINT32_LIST", 29, 29, 2, f6);
        EnumC0138u enumC0138u31 = new EnumC0138u("ENUM_LIST", 30, 30, 2, f11);
        EnumC0138u enumC0138u32 = new EnumC0138u("SFIXED32_LIST", 31, 31, 2, f6);
        EnumC0138u enumC0138u33 = new EnumC0138u("SFIXED64_LIST", 32, 32, 2, f5);
        EnumC0138u enumC0138u34 = new EnumC0138u("SINT32_LIST", 33, 33, 2, f6);
        EnumC0138u enumC0138u35 = new EnumC0138u("SINT64_LIST", 34, 34, 2, f5);
        EnumC0138u enumC0138u36 = new EnumC0138u("DOUBLE_LIST_PACKED", 35, 35, 3, f3);
        e = enumC0138u36;
        EnumC0138u enumC0138u37 = new EnumC0138u("FLOAT_LIST_PACKED", 36, 36, 3, f4);
        EnumC0138u enumC0138u38 = new EnumC0138u("INT64_LIST_PACKED", 37, 37, 3, f5);
        EnumC0138u enumC0138u39 = new EnumC0138u("UINT64_LIST_PACKED", 38, 38, 3, f5);
        EnumC0138u enumC0138u40 = new EnumC0138u("INT32_LIST_PACKED", 39, 39, 3, f6);
        EnumC0138u enumC0138u41 = new EnumC0138u("FIXED64_LIST_PACKED", 40, 40, 3, f5);
        EnumC0138u enumC0138u42 = new EnumC0138u("FIXED32_LIST_PACKED", 41, 41, 3, f6);
        EnumC0138u enumC0138u43 = new EnumC0138u("BOOL_LIST_PACKED", 42, 42, 3, f7);
        EnumC0138u enumC0138u44 = new EnumC0138u("UINT32_LIST_PACKED", 43, 43, 3, f6);
        EnumC0138u enumC0138u45 = new EnumC0138u("ENUM_LIST_PACKED", 44, 44, 3, f11);
        EnumC0138u enumC0138u46 = new EnumC0138u("SFIXED32_LIST_PACKED", 45, 45, 3, f6);
        EnumC0138u enumC0138u47 = new EnumC0138u("SFIXED64_LIST_PACKED", 46, 46, 3, f5);
        EnumC0138u enumC0138u48 = new EnumC0138u("SINT32_LIST_PACKED", 47, 47, 3, f6);
        EnumC0138u enumC0138u49 = new EnumC0138u("SINT64_LIST_PACKED", 48, 48, 3, f5);
        f2347f = enumC0138u49;
        f2349h = new EnumC0138u[]{enumC0138u, enumC0138u2, enumC0138u3, enumC0138u4, enumC0138u5, enumC0138u6, enumC0138u7, enumC0138u8, enumC0138u9, enumC0138u10, enumC0138u11, enumC0138u12, enumC0138u13, enumC0138u14, enumC0138u15, enumC0138u16, enumC0138u17, enumC0138u18, enumC0138u19, enumC0138u20, enumC0138u21, enumC0138u22, enumC0138u23, enumC0138u24, enumC0138u25, enumC0138u26, enumC0138u27, enumC0138u28, enumC0138u29, enumC0138u30, enumC0138u31, enumC0138u32, enumC0138u33, enumC0138u34, enumC0138u35, enumC0138u36, enumC0138u37, enumC0138u38, enumC0138u39, enumC0138u40, enumC0138u41, enumC0138u42, enumC0138u43, enumC0138u44, enumC0138u45, enumC0138u46, enumC0138u47, enumC0138u48, enumC0138u49, new EnumC0138u("GROUP_LIST", 49, 49, 2, f9), new EnumC0138u("MAP", 50, 50, 4, F.VOID)};
        EnumC0138u[] enumC0138uArrValues = values();
        f2348g = new EnumC0138u[enumC0138uArrValues.length];
        for (EnumC0138u enumC0138u50 : enumC0138uArrValues) {
            f2348g[enumC0138u50.f2350d] = enumC0138u50;
        }
    }

    public EnumC0138u(String str, int i3, int i4, int i5, F f3) {
        super(str, i3);
        this.f2350d = i4;
        int iB = M.j.b(i5);
        if (iB == 1 || iB == 3) {
            f3.getClass();
        }
        if (i5 == 1) {
            f3.ordinal();
        }
    }

    public static EnumC0138u valueOf(String str) {
        return (EnumC0138u) Enum.valueOf(EnumC0138u.class, str);
    }

    public static EnumC0138u[] values() {
        return (EnumC0138u[]) f2349h.clone();
    }

    public final int a() {
        return this.f2350d;
    }
}
