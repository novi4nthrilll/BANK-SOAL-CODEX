package com.google.android.gms.vision.face;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0200f;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0199e8;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0209f8;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0263l2;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0289n8;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0319q8;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0368v8;
import com.google.android.gms.internal.mlkit_vision_face_bundled.K8;
import com.google.android.gms.internal.mlkit_vision_face_bundled.V8;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class FaceDetectorV2Jni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0209f8 f3530a;

    public FaceDetectorV2Jni() {
        C0209f8 c0209f8 = C0209f8.f3066b;
        K8 k8 = K8.f2835c;
        C0209f8 c0209f9 = new C0209f8();
        this.f3530a = c0209f9;
        C0289n8 c0289n8 = AbstractC0200f.f3051a;
        c0209f9.f3067a.put(new C0199e8(c0289n8.f3234a, 202056002), c0289n8);
    }

    @Keep
    private native void closeDetectorJni(long j3);

    @Keep
    private native byte[] detectFacesImageByteArrayJni(long j3, byte[] bArr, byte[] bArr2);

    @Keep
    private native byte[] detectFacesImageByteArrayMultiPlanesJni(long j3, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4, int i5, int i6, int i7, int i8, byte[] bArr4);

    @Keep
    private native byte[] detectFacesImageByteBufferJni(long j3, ByteBuffer byteBuffer, byte[] bArr);

    @Keep
    private native byte[] detectFacesImageByteBufferMultiPlanesJni(long j3, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, byte[] bArr);

    @Keep
    private native long initDetectorJni(byte[] bArr, AssetManager assetManager);

    public final long a(V8 v8, AssetManager assetManager) {
        Log.v("FaceDetectorV2Jni", "initialize.start()");
        long jInitDetectorJni = initDetectorJni(v8.c(), assetManager);
        Log.v("FaceDetectorV2Jni", "initialize.end()");
        return jInitDetectorJni;
    }

    public final C0319q8 b(long j3, byte[] bArr, C0263l2 c0263l2) {
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteArray.start()");
        C0319q8 c0319q8O = null;
        try {
            byte[] bArrDetectFacesImageByteArrayJni = detectFacesImageByteArrayJni(j3, bArr, c0263l2.c());
            if (bArrDetectFacesImageByteArrayJni != null && bArrDetectFacesImageByteArrayJni.length > 0) {
                c0319q8O = C0319q8.o(bArrDetectFacesImageByteArrayJni, this.f3530a);
            }
        } catch (C0368v8 e) {
            Log.e("FaceDetectorV2Jni", "detectFacesImageByteArray failed to parse result: ".concat(String.valueOf(e.getMessage())));
        }
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteArray.end()");
        return c0319q8O;
    }

    public final C0319q8 c(long j3, byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, int i4, int i5, int i6, int i7, int i8, C0263l2 c0263l2) {
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteArrayMultiPlanes.start()");
        C0319q8 c0319q8O = null;
        try {
            byte[] bArrDetectFacesImageByteArrayMultiPlanesJni = detectFacesImageByteArrayMultiPlanesJni(j3, bArr, bArr2, bArr3, i3, i4, i5, i6, i7, i8, c0263l2.c());
            if (bArrDetectFacesImageByteArrayMultiPlanesJni != null && bArrDetectFacesImageByteArrayMultiPlanesJni.length > 0) {
                try {
                    c0319q8O = C0319q8.o(bArrDetectFacesImageByteArrayMultiPlanesJni, this.f3530a);
                } catch (C0368v8 e) {
                    e = e;
                    Log.e("FaceDetectorV2Jni", "detectFacesImageByteArrayMultiPlanes failed to parse result: ".concat(String.valueOf(e.getMessage())));
                }
            }
        } catch (C0368v8 e3) {
            e = e3;
        }
        Log.v("FaceDetectorV2Jni", "%s detectFacesImageByteArrayMultiPlanes.end()");
        return c0319q8O;
    }

    public final C0319q8 d(long j3, ByteBuffer byteBuffer, C0263l2 c0263l2) {
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteBuffer.start()");
        C0319q8 c0319q8O = null;
        try {
            byte[] bArrDetectFacesImageByteBufferJni = detectFacesImageByteBufferJni(j3, byteBuffer, c0263l2.c());
            if (bArrDetectFacesImageByteBufferJni != null && bArrDetectFacesImageByteBufferJni.length > 0) {
                c0319q8O = C0319q8.o(bArrDetectFacesImageByteBufferJni, this.f3530a);
            }
        } catch (C0368v8 e) {
            Log.e("FaceDetectorV2Jni", "detectFacesImageByteBuffer failed to parse result: ".concat(String.valueOf(e.getMessage())));
        }
        Log.v("FaceDetectorV2Jni", "%s detectFacesImageByteBuffer.end()");
        return c0319q8O;
    }

    public final C0319q8 e(long j3, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, C0263l2 c0263l2) {
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteBufferMultiPlanes.start()");
        C0319q8 c0319q8O = null;
        try {
            byte[] bArrDetectFacesImageByteBufferMultiPlanesJni = detectFacesImageByteBufferMultiPlanesJni(j3, byteBuffer, byteBuffer2, byteBuffer3, i3, i4, i5, i6, i7, i8, c0263l2.c());
            if (bArrDetectFacesImageByteBufferMultiPlanesJni != null && bArrDetectFacesImageByteBufferMultiPlanesJni.length > 0) {
                try {
                    c0319q8O = C0319q8.o(bArrDetectFacesImageByteBufferMultiPlanesJni, this.f3530a);
                } catch (C0368v8 e) {
                    e = e;
                    Log.e("FaceDetectorV2Jni", "detectFacesImageByteBufferMultiPlanes failed to parse result: ".concat(String.valueOf(e.getMessage())));
                }
            }
        } catch (C0368v8 e3) {
            e = e3;
        }
        Log.v("FaceDetectorV2Jni", "detectFacesImageByteBuffer.end()");
        return c0319q8O;
    }

    public final void f(long j3) {
        Log.v("FaceDetectorV2Jni", "closeDetector.start()");
        closeDetectorJni(j3);
        Log.v("FaceDetectorV2Jni", "closeDetector.end()");
    }
}
