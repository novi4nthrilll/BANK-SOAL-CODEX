package M;

import androidx.datastore.preferences.protobuf.AbstractC0141x;
import androidx.datastore.preferences.protobuf.AbstractC0143z;
import androidx.datastore.preferences.protobuf.C0126h;
import androidx.datastore.preferences.protobuf.C0142y;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.b0;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0143z {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final k DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Y PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        AbstractC0143z.l(k.class, kVar);
    }

    public static i F() {
        return (i) ((AbstractC0141x) DEFAULT_INSTANCE.e(5));
    }

    public static void n(k kVar, long j3) {
        kVar.valueCase_ = 4;
        kVar.value_ = Long.valueOf(j3);
    }

    public static void o(k kVar, String str) {
        kVar.getClass();
        str.getClass();
        kVar.valueCase_ = 5;
        kVar.value_ = str;
    }

    public static void p(k kVar, h hVar) {
        kVar.getClass();
        kVar.value_ = hVar;
        kVar.valueCase_ = 6;
    }

    public static void q(k kVar, double d3) {
        kVar.valueCase_ = 7;
        kVar.value_ = Double.valueOf(d3);
    }

    public static void r(k kVar, C0126h c0126h) {
        kVar.getClass();
        kVar.valueCase_ = 8;
        kVar.value_ = c0126h;
    }

    public static void s(k kVar, boolean z2) {
        kVar.valueCase_ = 1;
        kVar.value_ = Boolean.valueOf(z2);
    }

    public static void t(k kVar, float f3) {
        kVar.valueCase_ = 2;
        kVar.value_ = Float.valueOf(f3);
    }

    public static void u(k kVar, int i3) {
        kVar.valueCase_ = 3;
        kVar.value_ = Integer.valueOf(i3);
    }

    public static k x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long B() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String C() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final h D() {
        return this.valueCase_ == 6 ? (h) this.value_ : h.o();
    }

    public final int E() {
        switch (this.valueCase_) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0143z
    public final Object e(int i3) {
        switch (j.b(i3)) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new b0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", h.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new k();
            case LONG_FIELD_NUMBER /* 4 */:
                return new i(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                Y c0142y = PARSER;
                if (c0142y == null) {
                    synchronized (k.class) {
                        try {
                            c0142y = PARSER;
                            if (c0142y == null) {
                                c0142y = new C0142y();
                                PARSER = c0142y;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return c0142y;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean v() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0126h w() {
        return this.valueCase_ == 8 ? (C0126h) this.value_ : C0126h.f2295f;
    }

    public final double y() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float z() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}
