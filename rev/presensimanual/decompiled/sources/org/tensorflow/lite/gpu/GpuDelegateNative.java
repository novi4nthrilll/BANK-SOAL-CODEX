package org.tensorflow.lite.gpu;

/* JADX INFO: loaded from: classes.dex */
class GpuDelegateNative {
    static final Throwable LOAD_LIBRARY_EXCEPTION;
    private static final String TFLITE_GPU_LIB = "tensorflowlite_gpu_jni";
    private static volatile boolean isInit = false;

    static {
        try {
            System.loadLibrary(TFLITE_GPU_LIB);
            e = null;
        } catch (UnsatisfiedLinkError e) {
            e = e;
        }
        LOAD_LIBRARY_EXCEPTION = e;
    }

    private GpuDelegateNative() {
    }

    public static void init() {
        if (isInit) {
            return;
        }
        try {
            nativeDoNothing();
            isInit = true;
        } catch (UnsatisfiedLinkError e) {
            Throwable th = LOAD_LIBRARY_EXCEPTION;
            if (th == null) {
                th = e;
            }
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load native GpuDelegate methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + th);
            unsatisfiedLinkError.initCause(e);
            unsatisfiedLinkError.addSuppressed(th);
            throw unsatisfiedLinkError;
        }
    }

    private static native void nativeDoNothing();
}
