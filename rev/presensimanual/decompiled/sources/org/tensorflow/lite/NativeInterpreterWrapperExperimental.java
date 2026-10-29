package org.tensorflow.lite;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class NativeInterpreterWrapperExperimental extends NativeInterpreterWrapper {
    public NativeInterpreterWrapperExperimental(String str, InterpreterImpl.Options options) {
        super(str, options);
    }

    private static native void resetVariableTensors(long j3, long j4);

    public void resetVariableTensors() {
        resetVariableTensors(this.interpreterHandle, this.errorHandle);
    }

    public NativeInterpreterWrapperExperimental(ByteBuffer byteBuffer, InterpreterImpl.Options options) {
        super(byteBuffer, options);
    }
}
