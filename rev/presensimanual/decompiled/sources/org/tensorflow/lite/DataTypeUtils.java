package org.tensorflow.lite;

import M.k;

/* JADX INFO: loaded from: classes.dex */
class DataTypeUtils {

    /* JADX INFO: renamed from: org.tensorflow.lite.DataTypeUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$tensorflow$lite$DataType;

        static {
            int[] iArr = new int[DataType.values().length];
            $SwitchMap$org$tensorflow$lite$DataType = iArr;
            try {
                iArr[DataType.FLOAT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$DataType[DataType.INT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$DataType[DataType.INT16.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$DataType[DataType.INT8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$DataType[DataType.UINT8.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$DataType[DataType.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$DataType[DataType.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$DataType[DataType.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private DataTypeUtils() {
    }

    public static DataType fromC(int i3) {
        switch (i3) {
            case 1:
                return DataType.FLOAT32;
            case 2:
                return DataType.INT32;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return DataType.UINT8;
            case k.LONG_FIELD_NUMBER /* 4 */:
                return DataType.INT64;
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DataType.STRING;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                return DataType.BOOL;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                return DataType.INT16;
            case k.BYTES_FIELD_NUMBER /* 8 */:
            default:
                throw new IllegalArgumentException("DataType error: DataType " + i3 + " is not recognized in Java.");
            case 9:
                return DataType.INT8;
        }
    }

    public static String toStringName(DataType dataType) {
        switch (AnonymousClass1.$SwitchMap$org$tensorflow$lite$DataType[dataType.ordinal()]) {
            case 1:
                return "float";
            case 2:
                return "int";
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return "short";
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_FIELD_NUMBER /* 5 */:
                return "byte";
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "long";
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                return "bool";
            case k.BYTES_FIELD_NUMBER /* 8 */:
                return "string";
            default:
                throw new IllegalArgumentException("DataType error: DataType " + dataType + " is not supported yet");
        }
    }
}
