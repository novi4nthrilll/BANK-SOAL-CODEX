package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class x0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t0 f2354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u0 f2355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v0 f2356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ x0[] f2357i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f2358d;
    public final int e;

    /* JADX INFO: Fake field, exist only in values array */
    x0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    x0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    x0 EF12;

    static {
        x0 x0Var = new x0("DOUBLE", 0, y0.DOUBLE, 1);
        x0 x0Var2 = new x0("FLOAT", 1, y0.FLOAT, 5);
        y0 y0Var = y0.LONG;
        x0 x0Var3 = new x0("INT64", 2, y0Var, 0);
        x0 x0Var4 = new x0("UINT64", 3, y0Var, 0);
        y0 y0Var2 = y0.INT;
        x0 x0Var5 = new x0("INT32", 4, y0Var2, 0);
        x0 x0Var6 = new x0("FIXED64", 5, y0Var, 1);
        x0 x0Var7 = new x0("FIXED32", 6, y0Var2, 5);
        x0 x0Var8 = new x0("BOOL", 7, y0.BOOLEAN, 0);
        t0 t0Var = new t0("STRING", 8, y0.STRING, 2);
        f2354f = t0Var;
        y0 y0Var3 = y0.MESSAGE;
        u0 u0Var = new u0("GROUP", 9, y0Var3, 3);
        f2355g = u0Var;
        v0 v0Var = new v0("MESSAGE", 10, y0Var3, 2);
        f2356h = v0Var;
        f2357i = new x0[]{x0Var, x0Var2, x0Var3, x0Var4, x0Var5, x0Var6, x0Var7, x0Var8, t0Var, u0Var, v0Var, new w0("BYTES", 11, y0.BYTE_STRING, 2), new x0("UINT32", 12, y0Var2, 0), new x0("ENUM", 13, y0.ENUM, 0), new x0("SFIXED32", 14, y0Var2, 5), new x0("SFIXED64", 15, y0Var, 1), new x0("SINT32", 16, y0Var2, 0), new x0("SINT64", 17, y0Var, 0)};
    }

    public x0(String str, int i3, y0 y0Var, int i4) {
        super(str, i3);
        this.f2358d = y0Var;
        this.e = i4;
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) f2357i.clone();
    }
}
