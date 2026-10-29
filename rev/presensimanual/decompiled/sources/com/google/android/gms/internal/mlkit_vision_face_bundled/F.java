package com.google.android.gms.internal.mlkit_vision_face_bundled;

import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    public static int a(int i3) {
        switch (i3) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                return 6;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            default:
                return 0;
        }
    }
}
