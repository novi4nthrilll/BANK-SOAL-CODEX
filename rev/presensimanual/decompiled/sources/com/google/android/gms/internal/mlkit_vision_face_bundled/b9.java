package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class b9 {
    public static final b9 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b9 f2996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b9 f2997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ b9[] f2998h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c9 f2999d;

    /* JADX INFO: Fake field, exist only in values array */
    b9 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    b9 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    b9 EF2;

    static {
        b9 b9Var = new b9("DOUBLE", 0, c9.f3011g);
        b9 b9Var2 = new b9("FLOAT", 1, c9.f3010f);
        c9 c9Var = c9.e;
        b9 b9Var3 = new b9("INT64", 2, c9Var);
        b9 b9Var4 = new b9("UINT64", 3, c9Var);
        c9 c9Var2 = c9.f3009d;
        b9 b9Var5 = new b9("INT32", 4, c9Var2);
        b9 b9Var6 = new b9("FIXED64", 5, c9Var);
        b9 b9Var7 = new b9("FIXED32", 6, c9Var2);
        b9 b9Var8 = new b9("BOOL", 7, c9.f3012h);
        b9 b9Var9 = new b9("STRING", 8, c9.f3013i);
        c9 c9Var3 = c9.f3016l;
        b9 b9Var10 = new b9("GROUP", 9, c9Var3);
        e = b9Var10;
        b9 b9Var11 = new b9("MESSAGE", 10, c9Var3);
        f2996f = b9Var11;
        b9 b9Var12 = new b9("BYTES", 11, c9.f3014j);
        b9 b9Var13 = new b9("UINT32", 12, c9Var2);
        b9 b9Var14 = new b9("ENUM", 13, c9.f3015k);
        f2997g = b9Var14;
        f2998h = new b9[]{b9Var, b9Var2, b9Var3, b9Var4, b9Var5, b9Var6, b9Var7, b9Var8, b9Var9, b9Var10, b9Var11, b9Var12, b9Var13, b9Var14, new b9("SFIXED32", 14, c9Var2), new b9("SFIXED64", 15, c9Var), new b9("SINT32", 16, c9Var2), new b9("SINT64", 17, c9Var)};
    }

    public b9(String str, int i3, c9 c9Var) {
        super(str, i3);
        this.f2999d = c9Var;
    }

    public static b9[] values() {
        return (b9[]) f2998h.clone();
    }
}
