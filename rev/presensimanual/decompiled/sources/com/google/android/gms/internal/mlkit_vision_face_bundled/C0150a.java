package com.google.android.gms.internal.mlkit_vision_face_bundled;

import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0150a implements InterfaceC0328r8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0150a f2976b = new C0150a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0150a f2977c = new C0150a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0150a f2978d = new C0150a(2);
    public static final C0150a e = new C0150a(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0150a f2979f = new C0150a(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0150a f2980g = new C0150a(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0150a f2981h = new C0150a(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0150a f2982i = new C0150a(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0150a f2983j = new C0150a(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2984a;

    public /* synthetic */ C0150a(int i3) {
        this.f2984a = i3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.InterfaceC0328r8
    public final boolean a(int i3) {
        switch (this.f2984a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3;
            case 1:
                return i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3;
            case 2:
                switch (i3) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    case 1:
                    case 2:
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        return true;
                    default:
                        return false;
                }
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                return i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3;
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                return i3 == 0 || i3 == 1 || i3 == 2;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                return F.a(i3) != 0;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                switch (i3) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    case 1:
                    case 2:
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                        return true;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                    default:
                        return false;
                }
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return L.a(i3) != 0;
            default:
                return i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4;
        }
    }
}
