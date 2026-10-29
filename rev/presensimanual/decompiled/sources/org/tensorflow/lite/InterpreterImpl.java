package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class InterpreterImpl implements InterpreterApi {
    NativeInterpreterWrapper wrapper;

    public static class Options extends InterpreterApi.Options {
        Boolean allowBufferHandleOutput;
        Boolean allowFp16PrecisionForFp32;
        Boolean useXNNPACK;

        public Options() {
        }

        public Options(InterpreterApi.Options options) {
            super(options);
        }

        public Options(Options options) {
            super(options);
            this.allowFp16PrecisionForFp32 = options.allowFp16PrecisionForFp32;
            this.allowBufferHandleOutput = options.allowBufferHandleOutput;
            this.useXNNPACK = options.useXNNPACK;
        }
    }

    public InterpreterImpl(File file, Options options) {
        this.wrapper = new NativeInterpreterWrapper(file.getAbsolutePath(), options);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void allocateTensors() {
        checkNotClosed();
        this.wrapper.allocateTensors();
    }

    public void checkNotClosed() {
        if (this.wrapper == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    @Override // org.tensorflow.lite.InterpreterApi, java.lang.AutoCloseable
    public void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.wrapper;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.wrapper = null;
        }
    }

    public void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public int getExecutionPlanLength() {
        checkNotClosed();
        return this.wrapper.getExecutionPlanLength();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getInputIndex(String str) {
        checkNotClosed();
        return this.wrapper.getInputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Tensor getInputTensor(int i3) {
        checkNotClosed();
        return this.wrapper.getInputTensor(i3);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getInputTensorCount() {
        checkNotClosed();
        return this.wrapper.getInputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Long getLastNativeInferenceDurationNanoseconds() {
        checkNotClosed();
        return this.wrapper.getLastNativeInferenceDurationNanoseconds();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getOutputIndex(String str) {
        checkNotClosed();
        return this.wrapper.getOutputIndex(str);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public Tensor getOutputTensor(int i3) {
        checkNotClosed();
        return this.wrapper.getOutputTensor(i3);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public int getOutputTensorCount() {
        checkNotClosed();
        return this.wrapper.getOutputTensorCount();
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void resizeInput(int i3, int[] iArr) {
        checkNotClosed();
        this.wrapper.resizeInput(i3, iArr, false);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void run(Object obj, Object obj2) {
        Object[] objArr = {obj};
        HashMap map = new HashMap();
        map.put(0, obj2);
        runForMultipleInputsOutputs(objArr, map);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void runForMultipleInputsOutputs(Object[] objArr, Map<Integer, Object> map) {
        checkNotClosed();
        this.wrapper.run(objArr, map);
    }

    public InterpreterImpl(ByteBuffer byteBuffer, Options options) {
        this.wrapper = new NativeInterpreterWrapper(byteBuffer, options);
    }

    @Override // org.tensorflow.lite.InterpreterApi
    public void resizeInput(int i3, int[] iArr, boolean z2) {
        checkNotClosed();
        this.wrapper.resizeInput(i3, iArr, z2);
    }

    public InterpreterImpl(NativeInterpreterWrapper nativeInterpreterWrapper) {
        this.wrapper = nativeInterpreterWrapper;
    }
}
