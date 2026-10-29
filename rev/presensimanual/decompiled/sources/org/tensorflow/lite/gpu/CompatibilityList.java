package org.tensorflow.lite.gpu;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class CompatibilityList implements Closeable {
    private static final long INVALID_COMPATIBILITY_LIST_HANDLE = 0;
    private long compatibilityListHandle;

    public CompatibilityList() {
        this.compatibilityListHandle = 0L;
        GpuDelegateNative.init();
        this.compatibilityListHandle = createCompatibilityList();
    }

    private static native long createCompatibilityList();

    private static native void deleteCompatibilityList(long j3);

    private static native boolean nativeIsDelegateSupportedOnThisDevice(long j3);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j3 = this.compatibilityListHandle;
        if (j3 != 0) {
            deleteCompatibilityList(j3);
            this.compatibilityListHandle = 0L;
        }
    }

    public GpuDelegate.Options getBestOptionsForThisDevice() {
        return new GpuDelegate.Options();
    }

    public boolean isDelegateSupportedOnThisDevice() {
        long j3 = this.compatibilityListHandle;
        if (j3 != 0) {
            return nativeIsDelegateSupportedOnThisDevice(j3);
        }
        throw new IllegalStateException("Trying to query a closed compatibilityList.");
    }
}
