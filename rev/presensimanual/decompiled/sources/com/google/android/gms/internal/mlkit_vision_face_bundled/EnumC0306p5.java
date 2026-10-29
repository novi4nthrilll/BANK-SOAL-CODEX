package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0306p5 implements InterfaceC0349u {
    NO_ERROR(0),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_INPUT(1),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_OUTPUT(2),
    /* JADX INFO: Fake field, exist only in values array */
    INCOMPATIBLE_TFLITE_VERSION(3),
    /* JADX INFO: Fake field, exist only in values array */
    MISSING_OP(4),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_TYPE_ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    TFLITE_INTERNAL_ERROR(7),
    /* JADX INFO: Fake field, exist only in values array */
    TFLITE_UNKNOWN_ERROR(8),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIAPIPE_ERROR(9),
    /* JADX INFO: Fake field, exist only in values array */
    TIME_OUT_FETCHING_MODEL_METADATA(5),
    /* JADX INFO: Fake field, exist only in values array */
    MODEL_NOT_DOWNLOADED(100),
    /* JADX INFO: Fake field, exist only in values array */
    URI_EXPIRED(101),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_MODEL_LOADER_ERROR(102),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(103),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(104),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_MODEL_LOADER_ERROR(105),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(106),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(107),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_MODEL_LOADER_ERROR(108),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(109),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(110),
    /* JADX INFO: Fake field, exist only in values array */
    REMOTE_MODEL_LOADER_ERROR(111),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(112),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(113),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(114),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(115),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(116),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(201),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(202),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(203),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(204),
    /* JADX INFO: Fake field, exist only in values array */
    OPTIONAL_TFLITE_MODULE_INIT_ERROR(205),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_LIBRARY_LOAD_ERROR(206),
    OPTIONAL_MODULE_CREATE_ERROR(207),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERAX_SOURCE_ERROR(301),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_CANT_START_ERROR(302),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_NO_SUITABLE_SIZE_ERROR(303),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_NO_SUITABLE_FPS_ERROR(304),
    /* JADX INFO: Fake field, exist only in values array */
    CAMERA1_SOURCE_NO_BYTE_SOURCE_FOUND_ERROR(305),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_UNAVAILABLE(400),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_CANCELLED(401),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED(402),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_APP_NAME_UNAVAILABLE(403),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_TASK_IN_PROGRESS(404),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR(405),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_PIPELINE_INFERENCE_ERROR(406),
    /* JADX INFO: Fake field, exist only in values array */
    CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(407),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE(500),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE(501),
    /* JADX INFO: Fake field, exist only in values array */
    PERMISSION_DENIED(600),
    /* JADX INFO: Fake field, exist only in values array */
    CANCELLED(601),
    /* JADX INFO: Fake field, exist only in values array */
    GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD(602),
    /* JADX INFO: Fake field, exist only in values array */
    LOW_MEMORY(603),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_ERROR(9999);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3254d;

    EnumC0306p5(int i3) {
        this.f3254d = i3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.InterfaceC0349u
    public final int a() {
        return this.f3254d;
    }
}
