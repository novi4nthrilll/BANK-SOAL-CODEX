package com.google.mlkit.vision.face.bundled.internal;

import X0.a;
import X0.b;
import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.mlkit_vision_face_bundled.L7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.O7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.R7;
import com.google.android.gms.vision.face.FaceDetectorV2Jni;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class ThickFaceDetectorCreator extends R7 {
    static {
        System.loadLibrary("face_detector_v2_jni");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.S7
    public O7 newFaceDetector(a aVar, L7 l7) {
        return new B1.a((Context) b.o(aVar), l7, new FaceDetectorV2Jni());
    }
}
