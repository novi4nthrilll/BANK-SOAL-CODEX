package W1;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1711d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EGLDisplay f1716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EGLContext f1717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EGLSurface f1718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final L f1719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Surface f1720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SurfaceTexture f1721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Surface f1722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HandlerThread f1723q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1726t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f1727u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1708a = new int[1];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f1709b = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f1710c = {2, 1, 0, 0, 3, 2};
    public int e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1712f = new int[2];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1713g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1714h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1715i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f1724r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f1725s = Boolean.FALSE;
    public int v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f1728w = new Object();

    public M(Surface surface, int i3, int i4, C0097e c0097e) {
        this.f1720n = surface;
        this.f1727u = i4;
        this.f1726t = i3;
        Log.d("VideoRenderer", "Starting OpenGL Thread");
        L l3 = new L(this);
        this.f1719m = l3;
        l3.setUncaughtExceptionHandler(c0097e);
        this.f1719m.start();
        Log.d("VideoRenderer", "VideoRenderer setup complete");
    }

    public final void a() {
        synchronized (this.f1728w) {
            try {
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                this.f1716j = eGLDisplayEglGetDisplay;
                if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    throw new RuntimeException("eglDisplay == EGL14.EGL_NO_DISPLAY: " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                    throw new RuntimeException("eglInitialize(): " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                if (!EGL14.eglQueryString(this.f1716j, 12373).contains("EGL_ANDROID_presentation_time")) {
                    throw new RuntimeException("cannot configure OpenGL. missing EGL_ANDROID_presentation_time");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(this.f1716j, J.f1705a >= 26 ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344} : new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    throw new RuntimeException(GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                int iEglGetError = EGL14.eglGetError();
                if (iEglGetError != 12288) {
                    throw new RuntimeException(GLUtils.getEGLErrorString(iEglGetError));
                }
                this.f1717k = EGL14.eglCreateContext(this.f1716j, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                int iEglGetError2 = EGL14.eglGetError();
                if (iEglGetError2 != 12288) {
                    throw new RuntimeException(GLUtils.getEGLErrorString(iEglGetError2));
                }
                this.f1718l = EGL14.eglCreateWindowSurface(this.f1716j, eGLConfigArr[0], this.f1720n, new int[]{12344}, 0);
                int iEglGetError3 = EGL14.eglGetError();
                if (iEglGetError3 != 12288) {
                    throw new RuntimeException(GLUtils.getEGLErrorString(iEglGetError3));
                }
                EGLDisplay eGLDisplay = this.f1716j;
                EGLSurface eGLSurface = this.f1718l;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f1717k)) {
                    throw new RuntimeException("eglMakeCurrent(): " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
                }
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f1709b.length * 4);
                byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                byteBufferAllocateDirect.asFloatBuffer().put(this.f1709b);
                byteBufferAllocateDirect.asFloatBuffer().position(0);
                ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(this.f1710c.length * 4);
                byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
                byteBufferAllocateDirect2.asIntBuffer().put(this.f1710c);
                byteBufferAllocateDirect2.position(0);
                int iGlCreateShader = GLES20.glCreateShader(35633);
                GLES20.glShaderSource(iGlCreateShader, "  precision highp float;\n            attribute vec3 vertexPosition;\n            attribute vec2 uvs;\n            varying vec2 varUvs;\n            uniform mat4 texMatrix;\n            uniform mat4 mvp;\n\n            void main()\n            {\n                varUvs = (texMatrix * vec4(uvs.x, uvs.y, 0, 1.0)).xy;\n                gl_Position = mvp * vec4(vertexPosition, 1.0);\n            }");
                GLES20.glCompileShader(iGlCreateShader);
                int iGlCreateShader2 = GLES20.glCreateShader(35632);
                GLES20.glShaderSource(iGlCreateShader2, " #extension GL_OES_EGL_image_external : require\n            precision mediump float;\n\n            varying vec2 varUvs;\n            uniform samplerExternalOES texSampler;\n\n            void main()\n            {\n                vec4 c = texture2D(texSampler, varUvs);\n                gl_FragColor = vec4(c.r, c.g, c.b, c.a);\n            }");
                GLES20.glCompileShader(iGlCreateShader2);
                int iGlCreateProgram = GLES20.glCreateProgram();
                this.f1711d = iGlCreateProgram;
                GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
                GLES20.glAttachShader(this.f1711d, iGlCreateShader2);
                GLES20.glLinkProgram(this.f1711d);
                GLES20.glDeleteShader(iGlCreateShader);
                GLES20.glDeleteShader(iGlCreateShader2);
                this.e = GLES20.glGetAttribLocation(this.f1711d, "vertexPosition");
                this.f1713g = GLES20.glGetAttribLocation(this.f1711d, "uvs");
                this.f1714h = GLES20.glGetUniformLocation(this.f1711d, "texMatrix");
                this.f1715i = GLES20.glGetUniformLocation(this.f1711d, "mvp");
                GLES20.glGenBuffers(2, this.f1712f, 0);
                GLES20.glBindBuffer(34962, this.f1712f[0]);
                GLES20.glBufferData(34962, this.f1709b.length * 4, byteBufferAllocateDirect, 35048);
                GLES20.glBindBuffer(34963, this.f1712f[1]);
                GLES20.glBufferData(34963, this.f1710c.length * 4, byteBufferAllocateDirect2, 35048);
                GLES20.glGenTextures(1, this.f1708a, 0);
                GLES20.glBindTexture(36197, this.f1708a[0]);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f1708a[0]);
                this.f1721o = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.f1726t, this.f1727u);
                HandlerThread handlerThread = new HandlerThread("FrameHandlerThread");
                this.f1723q = handlerThread;
                handlerThread.start();
                this.f1722p = new Surface(this.f1721o);
                this.f1721o.setOnFrameAvailableListener(new K(this), new Handler(this.f1723q.getLooper()));
                this.f1728w.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i3, int i4, float[] fArr) {
        GLES20.glClear(16640);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glViewport(0, 0, i3, i4);
        GLES20.glUseProgram(this.f1711d);
        GLES20.glUniformMatrix4fv(this.f1714h, 1, false, fArr, 0);
        int i5 = this.f1715i;
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(fArr2, 0, this.v, 0.0f, 0.0f, 1.0f);
        GLES20.glUniformMatrix4fv(i5, 1, false, fArr2, 0);
        int[] iArr = this.f1712f;
        GLES20.glBindBuffer(34962, iArr[0]);
        GLES20.glBindBuffer(34963, iArr[1]);
        GLES20.glEnableVertexAttribArray(this.e);
        GLES20.glVertexAttribPointer(this.e, 3, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(this.f1713g);
        GLES20.glVertexAttribPointer(this.f1713g, 2, 5126, false, 20, 12);
        GLES20.glDrawElements(4, 6, 5125, 0);
        EGLExt.eglPresentationTimeANDROID(this.f1716j, this.f1718l, SystemClock.uptimeMillis() * 1000000);
        if (EGL14.eglSwapBuffers(this.f1716j, this.f1718l)) {
            return;
        }
        Log.w("VideoRenderer", "eglSwapBuffers() " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
    }
}
