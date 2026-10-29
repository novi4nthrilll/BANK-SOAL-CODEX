package com.google.android.gms.vision.face.mlkit;

import X0.a;
import X0.b;
import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.lifecycle.y;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.mlkit_vision_face_bundled.A7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.B7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.E7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.EnumC0306p5;
import com.google.android.gms.internal.mlkit_vision_face_bundled.EnumC0316q5;
import com.google.android.gms.internal.mlkit_vision_face_bundled.L7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.O7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.R7;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;
import p006b1.c;
import p071w1.i;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class FaceDetectorCreator extends R7 {
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.S7
    public O7 newFaceDetector(a aVar, L7 l7) throws RemoteException {
        SystemClock.elapsedRealtime();
        Context context = (Context) b.o(aVar);
        c cVar = new c();
        byte b3 = (byte) (((byte) 1) | 2);
        if (b3 != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b3 & 1) == 0) {
                sb.append(" enableFirelog");
            }
            if ((b3 & 2) == 0) {
                sb.append(" firelogEventType");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        cVar.f2515d = new y(13, new E7(context, new i(context), new B7(context, new A7(), 0)));
        y yVar = (y) cVar.f2515d;
        try {
            System.loadLibrary("face_detector_v2_jni");
            SystemClock.elapsedRealtime();
            yVar.y(l7, EnumC0316q5.OPTIONAL_MODULE_FACE_DETECTION_CREATE, EnumC0306p5.NO_ERROR);
            return new p036k1.a(context, l7, new FaceDetectorV2Jni(), cVar);
        } catch (UnsatisfiedLinkError e) {
            Log.e("FaceDetectorCreator", "Failed to load library face_detector_v2_jni");
            SystemClock.elapsedRealtime();
            yVar.y(l7, EnumC0316q5.OPTIONAL_MODULE_FACE_DETECTION_CREATE, EnumC0306p5.OPTIONAL_MODULE_CREATE_ERROR);
            throw ((RemoteException) new RemoteException("Failed to load library face_detector_v2_jni").initCause(e));
        }
    }
}
