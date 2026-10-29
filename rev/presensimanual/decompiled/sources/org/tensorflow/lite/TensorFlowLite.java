package org.tensorflow.lite;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class TensorFlowLite {
    private static final Throwable LOAD_LIBRARY_EXCEPTION;
    private static final String[][] TFLITE_RUNTIME_LIBNAMES;
    private static final AtomicBoolean[] haveLogged;
    private static final Logger logger = Logger.getLogger(InterpreterApi.class.getName());
    private static volatile boolean isInit = false;

    /* JADX INFO: renamed from: org.tensorflow.lite.TensorFlowLite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime;

        static {
            int[] iArr = new int[InterpreterApi.Options.TfLiteRuntime.values().length];
            $SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime = iArr;
            try {
                iArr[InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime[InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class PossiblyAvailableRuntime {
        private final Exception exception;
        private final InterpreterFactoryApi factory;

        public PossiblyAvailableRuntime(String str, String str2) {
            InterpreterFactoryApi interpreterFactoryApi;
            Exception exc = null;
            try {
                Constructor<?> declaredConstructor = Class.forName(str + ".InterpreterFactoryImpl").getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                interpreterFactoryApi = (InterpreterFactoryApi) declaredConstructor.newInstance(null);
                try {
                    if (interpreterFactoryApi != null) {
                        TensorFlowLite.logger.info("Found " + str2 + " TF Lite runtime client in " + str);
                    } else {
                        TensorFlowLite.logger.warning("Failed to construct TF Lite runtime client from " + str);
                    }
                } catch (ClassNotFoundException e) {
                    e = e;
                    exc = e;
                    TensorFlowLite.logger.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                } catch (IllegalAccessException e3) {
                    e = e3;
                    exc = e;
                    TensorFlowLite.logger.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                } catch (IllegalArgumentException e4) {
                    e = e4;
                    exc = e;
                    TensorFlowLite.logger.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                } catch (InstantiationException e5) {
                    e = e5;
                    exc = e;
                    TensorFlowLite.logger.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                } catch (NoSuchMethodException e6) {
                    e = e6;
                    exc = e;
                    TensorFlowLite.logger.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                } catch (SecurityException e7) {
                    e = e7;
                    exc = e;
                    TensorFlowLite.logger.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                } catch (InvocationTargetException e8) {
                    e = e8;
                    exc = e;
                    TensorFlowLite.logger.info("Didn't find " + str2 + " TF Lite runtime client in " + str);
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e9) {
                e = e9;
                interpreterFactoryApi = null;
            }
            this.exception = exc;
            this.factory = interpreterFactoryApi;
        }

        public Exception getException() {
            return this.exception;
        }

        public InterpreterFactoryApi getFactory() {
            return this.factory;
        }
    }

    public static class RuntimeFromApplication {
        static final PossiblyAvailableRuntime TFLITE = new PossiblyAvailableRuntime("org.tensorflow.lite", "application");

        private RuntimeFromApplication() {
        }
    }

    public static class RuntimeFromSystem {
        static final PossiblyAvailableRuntime TFLITE = new PossiblyAvailableRuntime("com.google.android.gms.tflite", "system");

        private RuntimeFromSystem() {
        }
    }

    static {
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        TFLITE_RUNTIME_LIBNAMES = strArr;
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (String[] strArr2 : strArr) {
            for (String str : strArr2) {
                try {
                    System.loadLibrary(str);
                    logger.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e) {
                    logger.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e);
                    }
                }
            }
        }
        LOAD_LIBRARY_EXCEPTION = unsatisfiedLinkError;
        haveLogged = new AtomicBoolean[InterpreterApi.Options.TfLiteRuntime.values().length];
        for (int i3 = 0; i3 < InterpreterApi.Options.TfLiteRuntime.values().length; i3++) {
            haveLogged[i3] = new AtomicBoolean();
        }
    }

    private TensorFlowLite() {
    }

    public static InterpreterFactoryApi getFactory(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getFactory(tfLiteRuntime, "org.tensorflow.lite.InterpreterApi.Options", "setRuntime");
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
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + th);
            unsatisfiedLinkError.initCause(e);
            throw unsatisfiedLinkError;
        }
    }

    private static native void nativeDoNothing();

    public static String runtimeVersion(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getFactory(tfLiteRuntime, "org.tensorflow.lite.TensorFlowLite", "runtimeVersion").runtimeVersion();
    }

    public static String schemaVersion(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getFactory(tfLiteRuntime, "org.tensorflow.lite.TensorFlowLite", "schemaVersion").schemaVersion();
    }

    @Deprecated
    public static String version() {
        return schemaVersion();
    }

    private static InterpreterFactoryApi getFactory(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime, String str, String str2) {
        Exception exception;
        String strH;
        if (tfLiteRuntime == null) {
            tfLiteRuntime = InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY;
        }
        InterpreterApi.Options.TfLiteRuntime tfLiteRuntime2 = InterpreterApi.Options.TfLiteRuntime.PREFER_SYSTEM_OVER_APPLICATION;
        if (tfLiteRuntime == tfLiteRuntime2 || tfLiteRuntime == InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY) {
            PossiblyAvailableRuntime possiblyAvailableRuntime = RuntimeFromSystem.TFLITE;
            if (possiblyAvailableRuntime.getFactory() != null) {
                if (!haveLogged[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    logger.info("TfLiteRuntime." + tfLiteRuntime.name() + ": Using system TF Lite runtime client from com.google.android.gms");
                }
                return possiblyAvailableRuntime.getFactory();
            }
            exception = possiblyAvailableRuntime.getException();
        } else {
            exception = null;
        }
        if (tfLiteRuntime == tfLiteRuntime2 || tfLiteRuntime == InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY) {
            PossiblyAvailableRuntime possiblyAvailableRuntime2 = RuntimeFromApplication.TFLITE;
            if (possiblyAvailableRuntime2.getFactory() != null) {
                if (!haveLogged[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    logger.info("TfLiteRuntime." + tfLiteRuntime.name() + ": Using application TF Lite runtime client from org.tensorflow.lite");
                }
                return possiblyAvailableRuntime2.getFactory();
            }
            if (exception == null) {
                exception = possiblyAvailableRuntime2.getException();
            } else if (exception.getSuppressed().length == 0) {
                exception.addSuppressed(possiblyAvailableRuntime2.getException());
            }
        }
        int i3 = AnonymousClass1.$SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime[tfLiteRuntime.ordinal()];
        if (i3 == 1) {
            StringBuilder sb = new StringBuilder("You should declare a build dependency on org.tensorflow.lite:tensorflow-lite, or call .");
            sb.append(str2);
            sb.append(" with a value other than TfLiteRuntime.FROM_APPLICATION_ONLY (see docs for ");
            sb.append(str);
            sb.append("#");
            strH = I.h(sb, str2, "(TfLiteRuntime)).");
        } else if (i3 != 2) {
            strH = "You should declare a build dependency on org.tensorflow.lite:tensorflow-lite or com.google.android.gms:play-services-tflite-java";
        } else {
            StringBuilder sb2 = new StringBuilder("You should declare a build dependency on com.google.android.gms:play-services-tflite-java, or call .");
            sb2.append(str2);
            sb2.append(" with a value other than TfLiteRuntime.FROM_SYSTEM_ONLY  (see docs for ");
            sb2.append(str);
            sb2.append("#");
            strH = I.h(sb2, str2, ").");
        }
        throw new IllegalStateException("Couldn't find TensorFlow Lite runtime's InterpreterFactoryImpl class -- make sure your app links in the right TensorFlow Lite runtime. ".concat(strH), exception);
    }

    public static String runtimeVersion() {
        return runtimeVersion(null);
    }

    public static String schemaVersion() {
        return schemaVersion(null);
    }
}
