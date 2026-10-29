package org.tensorflow.lite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface InterpreterApi extends AutoCloseable {
    void allocateTensors();

    @Override // java.lang.AutoCloseable
    void close();

    int getInputIndex(String str);

    Tensor getInputTensor(int i3);

    int getInputTensorCount();

    Long getLastNativeInferenceDurationNanoseconds();

    int getOutputIndex(String str);

    Tensor getOutputTensor(int i3);

    int getOutputTensorCount();

    void resizeInput(int i3, int[] iArr);

    void resizeInput(int i3, int[] iArr, boolean z2);

    void run(Object obj, Object obj2);

    void runForMultipleInputsOutputs(Object[] objArr, Map<Integer, Object> map);

    public static class Options {
        Boolean allowCancellation;
        private final List<DelegateFactory> delegateFactories;
        final List<Delegate> delegates;
        int numThreads;
        TfLiteRuntime runtime;
        Boolean useNNAPI;

        public enum TfLiteRuntime {
            FROM_APPLICATION_ONLY,
            FROM_SYSTEM_ONLY,
            PREFER_SYSTEM_OVER_APPLICATION
        }

        public Options() {
            this.runtime = TfLiteRuntime.FROM_APPLICATION_ONLY;
            this.numThreads = -1;
            this.delegates = new ArrayList();
            this.delegateFactories = new ArrayList();
        }

        public Options addDelegate(Delegate delegate) {
            this.delegates.add(delegate);
            return this;
        }

        public Options addDelegateFactory(DelegateFactory delegateFactory) {
            this.delegateFactories.add(delegateFactory);
            return this;
        }

        public List<DelegateFactory> getDelegateFactories() {
            return Collections.unmodifiableList(this.delegateFactories);
        }

        public List<Delegate> getDelegates() {
            return Collections.unmodifiableList(this.delegates);
        }

        public int getNumThreads() {
            return this.numThreads;
        }

        public TfLiteRuntime getRuntime() {
            return this.runtime;
        }

        public boolean getUseNNAPI() {
            Boolean bool = this.useNNAPI;
            return bool != null && bool.booleanValue();
        }

        public boolean isCancellable() {
            Boolean bool = this.allowCancellation;
            return bool != null && bool.booleanValue();
        }

        public Options setCancellable(boolean z2) {
            this.allowCancellation = Boolean.valueOf(z2);
            return this;
        }

        public Options setNumThreads(int i3) {
            this.numThreads = i3;
            return this;
        }

        public Options setRuntime(TfLiteRuntime tfLiteRuntime) {
            this.runtime = tfLiteRuntime;
            return this;
        }

        public Options setUseNNAPI(boolean z2) {
            this.useNNAPI = Boolean.valueOf(z2);
            return this;
        }

        public Options(Options options) {
            this.runtime = TfLiteRuntime.FROM_APPLICATION_ONLY;
            this.numThreads = -1;
            this.numThreads = options.numThreads;
            this.useNNAPI = options.useNNAPI;
            this.allowCancellation = options.allowCancellation;
            this.delegates = new ArrayList(options.delegates);
            this.delegateFactories = new ArrayList(options.delegateFactories);
            this.runtime = options.runtime;
        }
    }
}
