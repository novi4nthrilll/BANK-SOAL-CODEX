package B1;

import M.k;
import X0.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.media.Image;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0200f;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0160b;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0170c;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0180d;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0190e;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0263l2;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0285n4;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0319q8;
import com.google.android.gms.internal.mlkit_vision_face_bundled.E;
import com.google.android.gms.internal.mlkit_vision_face_bundled.H6;
import com.google.android.gms.internal.mlkit_vision_face_bundled.H8;
import com.google.android.gms.internal.mlkit_vision_face_bundled.I7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.InterfaceC0338s8;
import com.google.android.gms.internal.mlkit_vision_face_bundled.K1;
import com.google.android.gms.internal.mlkit_vision_face_bundled.K7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.L7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.M3;
import com.google.android.gms.internal.mlkit_vision_face_bundled.M7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.N7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.Q7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.T7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.V8;
import com.google.android.gms.internal.mlkit_vision_face_bundled.d9;
import com.google.android.gms.internal.mlkit_vision_face_bundled.e9;
import com.google.android.gms.internal.mlkit_vision_face_bundled.i9;
import com.google.android.gms.internal.mlkit_vision_face_bundled.j9;
import com.google.android.gms.internal.mlkit_vision_face_bundled.k9;
import com.google.android.gms.internal.mlkit_vision_face_bundled.m9;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class a extends N7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V8 f106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FaceDetectorV2Jni f107d;
    public long e = -1;

    public a(Context context, L7 l7, FaceDetectorV2Jni faceDetectorV2Jni) {
        this.f105b = context;
        int i3 = l7.f2845d;
        C0180d c0180dO = C0190e.o();
        c0180dO.g("models_bundled");
        C0190e c0190e = (C0190e) c0180dO.b();
        k9 k9VarO = m9.o();
        C0180d c0180dO2 = C0190e.o();
        c0180dO2.g("models_bundled");
        int i4 = l7.f2842a;
        String str = i4 == 2 ? "fssd_medium_8bit_v5.tflite" : "fssd_25_8bit_v2.tflite";
        c0180dO2.e();
        C0190e.q((C0190e) c0180dO2.e, str);
        C0190e c0190e2 = (C0190e) c0180dO2.b();
        k9VarO.e();
        m9.p((m9) k9VarO.e, c0190e2);
        C0180d c0180dO3 = C0190e.o();
        c0180dO3.g("models_bundled");
        String str2 = i4 == 2 ? "fssd_medium_8bit_gray_v5.tflite" : "fssd_25_8bit_gray_v2.tflite";
        c0180dO3.e();
        C0190e.q((C0190e) c0180dO3.e, str2);
        C0190e c0190e3 = (C0190e) c0180dO3.b();
        k9VarO.e();
        m9.q((m9) k9VarO.e, c0190e3);
        C0180d c0180dO4 = C0190e.o();
        c0180dO4.g("models_bundled");
        String str3 = i4 == 2 ? "fssd_anchors_v5.pb" : "fssd_anchors_v2.pb";
        c0180dO4.e();
        C0190e.q((C0190e) c0180dO4.e, str3);
        C0190e c0190e4 = (C0190e) c0180dO4.b();
        k9VarO.e();
        m9.s((m9) k9VarO.e, c0190e4);
        k9VarO.e();
        m9.r((m9) k9VarO.e, c0190e);
        m9 m9Var = (m9) k9VarO.b();
        H8 h8O = V8.o();
        h8O.e();
        V8.s((V8) h8O.e, m9Var);
        M3 m3O = C0285n4.o();
        m3O.e();
        C0285n4.p((C0285n4) m3O.e, c0190e);
        m3O.e();
        C0285n4.q((C0285n4) m3O.e, c0190e);
        h8O.e();
        V8.t((V8) h8O.e, (C0285n4) m3O.b());
        C0160b c0160bO = C0170c.o();
        c0160bO.e();
        C0170c.q((C0170c) c0160bO.e, c0190e);
        c0160bO.e();
        C0170c.r((C0170c) c0160bO.e, c0190e);
        c0160bO.e();
        C0170c.s((C0170c) c0160bO.e, c0190e);
        c0160bO.e();
        C0170c.t((C0170c) c0160bO.e, c0190e);
        h8O.e();
        V8.u((V8) h8O.e, (C0170c) c0160bO.b());
        boolean z2 = false;
        boolean z3 = i3 == 2;
        h8O.e();
        V8.v((V8) h8O.e, z3);
        if (!z3 && l7.e) {
            z2 = true;
        }
        h8O.e();
        V8.q((V8) h8O.e, z2);
        h8O.e();
        V8.p((V8) h8O.e, l7.f2846f);
        h8O.e();
        V8.r((V8) h8O.e);
        if (z3) {
            h8O.h(4);
            h8O.g(4);
        } else {
            if (i4 == 1) {
                h8O.h(2);
            } else if (i4 == 2) {
                h8O.h(3);
            }
            int i5 = l7.f2843b;
            if (i5 == 1) {
                h8O.g(2);
            } else if (i5 == 2) {
                h8O.g(3);
            }
            int i6 = l7.f2844c;
            if (i6 == 1) {
                h8O.e();
                V8.z((V8) h8O.e, 2);
            } else if (i6 == 2) {
                h8O.e();
                V8.z((V8) h8O.e, 3);
            }
        }
        this.f106c = (V8) h8O.b();
        this.f107d = faceDetectorV2Jni;
    }

    public static int g(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 1) {
            return 4;
        }
        if (i3 == 2) {
            return 3;
        }
        if (i3 == 3) {
            return 2;
        }
        throw new IllegalArgumentException(I.f("Unsupported rotation degree: ", i3));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.O7
    public final void a() {
        long j3 = this.e;
        if (j3 > 0) {
            this.f107d.f(j3);
            this.e = -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    public final ArrayList f(C0319q8 c0319q8) {
        float f3;
        float f4;
        float f5;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3;
        int i4;
        byte b3;
        ArrayList arrayList3 = new ArrayList();
        for (j9 j9Var : c0319q8.p().p()) {
            V8 v8 = this.f106c;
            int i5 = 1;
            if (v8.w() == 3) {
                float fO = -1.0f;
                float fO2 = -1.0f;
                float fO3 = -1.0f;
                for (d9 d9Var : j9Var.y()) {
                    String strP = d9Var.p();
                    int iHashCode = strP.hashCode();
                    if (iHashCode != -1940789646) {
                        if (iHashCode != -1837755075) {
                            if (iHashCode == 105428 && strP.equals("joy")) {
                                b3 = 0;
                            } else {
                                b3 = -1;
                            }
                        } else if (strP.equals("right_eye_closed")) {
                            b3 = 2;
                        } else {
                            b3 = -1;
                        }
                    } else if (strP.equals("left_eye_closed")) {
                        b3 = 1;
                    } else {
                        b3 = -1;
                    }
                    if (b3 == 0) {
                        fO3 = d9Var.o();
                    } else if (b3 == 1) {
                        fO = 1.0f - d9Var.o();
                    } else if (b3 == 2) {
                        fO2 = 1.0f - d9Var.o();
                    }
                }
                f3 = fO;
                f4 = fO2;
                f5 = fO3;
            } else {
                f3 = -1.0f;
                f4 = -1.0f;
                f5 = -1.0f;
            }
            int i6 = 9;
            if (v8.x() == 3) {
                InterfaceC0338s8<i9> interfaceC0338s8Z = j9Var.z();
                ArrayList arrayList4 = new ArrayList();
                for (i9 i9Var : interfaceC0338s8Z) {
                    int iQ = i9Var.q() - 1;
                    if (iQ == 0) {
                        i4 = 4;
                    } else if (iQ == i5) {
                        i4 = 10;
                    } else if (iQ != i6) {
                        switch (iQ) {
                            case 11:
                                i4 = 0;
                                break;
                            case 12:
                                i4 = 5;
                                break;
                            case 13:
                                i4 = 11;
                                break;
                            default:
                                switch (iQ) {
                                    case 238:
                                        i4 = 1;
                                        break;
                                    case 239:
                                        i4 = 7;
                                        break;
                                    case 240:
                                        i4 = 3;
                                        break;
                                    case 241:
                                        i4 = 9;
                                        break;
                                    case 242:
                                        i4 = 2;
                                        break;
                                    case 243:
                                        i4 = 8;
                                        break;
                                    default:
                                        Log.d("ThickFaceDetector", "Unknown landmark type: ".concat(Integer.toString(iQ)));
                                        i4 = -1;
                                        break;
                                }
                                break;
                        }
                    } else {
                        i4 = 6;
                    }
                    if (i4 >= 0) {
                        arrayList4.add(new T7(i4, new PointF(i9Var.o(), i9Var.p())));
                        i6 = 9;
                        i5 = 1;
                    } else {
                        i6 = 9;
                    }
                }
                arrayList = arrayList4;
            } else {
                arrayList = new ArrayList();
            }
            if (v8.x() == 4) {
                List<Q7> list = (List) j9Var.p(AbstractC0200f.f3051a);
                ArrayList arrayList5 = new ArrayList();
                for (Q7 q7 : list) {
                    int iQ2 = q7.q() - 1;
                    switch (iQ2) {
                        case 1:
                            i3 = 1;
                            break;
                        case 2:
                            i3 = 2;
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            i3 = 3;
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            i3 = 4;
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            i3 = 5;
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            i3 = 6;
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            i3 = 7;
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            i3 = 8;
                            break;
                        case 9:
                            i3 = 9;
                            break;
                        case 10:
                            i3 = 10;
                            break;
                        case 11:
                            i3 = 11;
                            break;
                        case 12:
                            i3 = 12;
                            break;
                        case 13:
                            i3 = 13;
                            break;
                        case 14:
                            i3 = 14;
                            break;
                        case 15:
                            i3 = 15;
                            break;
                        default:
                            Log.d("ThickFaceDetector", "Unknown contour type: " + iQ2);
                            i3 = -1;
                            break;
                    }
                    if (i3 != -1) {
                        ArrayList arrayList6 = new ArrayList();
                        for (H6 h6 : q7.p()) {
                            arrayList6.add(new PointF(h6.o(), h6.p()));
                        }
                        arrayList5.add(new K7(i3, arrayList6));
                    }
                }
                arrayList2 = arrayList5;
            } else {
                arrayList2 = new ArrayList();
            }
            e9 e9VarW = j9Var.w();
            arrayList3.add(new M7((int) j9Var.v(), new Rect((int) e9VarW.o(), (int) e9VarW.q(), (int) e9VarW.p(), (int) e9VarW.r()), j9Var.t(), j9Var.s(), j9Var.u(), f3, f4, f5, j9Var.q() ? j9Var.r() : -1.0f, arrayList, arrayList2));
        }
        return arrayList3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.O7
    public final ArrayList h(X0.a aVar, I7 i7) throws RemoteException {
        C0319q8 c0319q8C;
        int i3 = i7.f2817a;
        if (i3 == -1) {
            return k(E.a((Bitmap) b.o(aVar)), i7, 2);
        }
        if (i3 == 17) {
            return k((ByteBuffer) b.o(aVar), i7, 2);
        }
        if (i3 != 35) {
            if (i3 == 842094169) {
                return k((ByteBuffer) b.o(aVar), i7, 7);
            }
            String str = "Unsupported image format " + i3 + " at API " + Build.VERSION.SDK_INT;
            Log.e("ThickFaceDetector", str);
            throw new RemoteException(str);
        }
        Image.Plane[] planes = ((Image) b.o(aVar)).getPlanes();
        ByteBuffer buffer = planes[0].getBuffer();
        ByteBuffer buffer2 = planes[1].getBuffer();
        ByteBuffer buffer3 = planes[2].getBuffer();
        K1 k1O = C0263l2.o();
        k1O.e();
        C0263l2.p((C0263l2) k1O.e, i7.f2818b);
        k1O.e();
        C0263l2.r((C0263l2) k1O.e, i7.f2819c);
        int iG = g(i7.f2820d);
        k1O.e();
        C0263l2.t((C0263l2) k1O.e, iG);
        long j3 = i7.e;
        if (j3 > 0) {
            k1O.e();
            C0263l2.q((C0263l2) k1O.e, j3 * 1000);
        }
        C0263l2 c0263l2 = (C0263l2) k1O.b();
        if (buffer.isDirect()) {
            c0319q8C = this.f107d.e(this.e, buffer, buffer2, buffer3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), c0263l2);
        } else if (buffer.hasArray() && buffer.arrayOffset() == 0) {
            c0319q8C = this.f107d.c(this.e, buffer.array(), buffer2.array(), buffer3.array(), planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), c0263l2);
        } else {
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            byte[] bArr2 = new byte[buffer2.remaining()];
            buffer.get(bArr);
            byte[] bArr3 = new byte[buffer3.remaining()];
            buffer.get(bArr);
            c0319q8C = this.f107d.c(this.e, bArr, bArr2, bArr3, planes[0].getPixelStride(), planes[1].getPixelStride(), planes[2].getPixelStride(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), c0263l2);
        }
        return c0319q8C != null ? f(c0319q8C) : new ArrayList();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.O7
    public final void j() {
        this.e = this.f107d.a(this.f106c, this.f105b.getAssets());
    }

    public final ArrayList k(ByteBuffer byteBuffer, I7 i7, int i3) {
        C0319q8 c0319q8B;
        K1 k1O = C0263l2.o();
        int i4 = i7.f2818b;
        k1O.e();
        C0263l2.p((C0263l2) k1O.e, i4);
        k1O.e();
        C0263l2.r((C0263l2) k1O.e, i7.f2819c);
        int iG = g(i7.f2820d);
        k1O.e();
        C0263l2.t((C0263l2) k1O.e, iG);
        k1O.e();
        C0263l2.s((C0263l2) k1O.e, i3);
        long j3 = i7.e;
        if (j3 > 0) {
            k1O.e();
            C0263l2.q((C0263l2) k1O.e, j3 * 1000);
        }
        C0263l2 c0263l2 = (C0263l2) k1O.b();
        boolean zIsDirect = byteBuffer.isDirect();
        FaceDetectorV2Jni faceDetectorV2Jni = this.f107d;
        if (zIsDirect) {
            c0319q8B = faceDetectorV2Jni.d(this.e, byteBuffer, c0263l2);
        } else if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            c0319q8B = faceDetectorV2Jni.b(this.e, byteBuffer.array(), c0263l2);
        } else {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            c0319q8B = faceDetectorV2Jni.b(this.e, bArr, c0263l2);
        }
        return c0319q8B != null ? f(c0319q8B) : new ArrayList();
    }
}
