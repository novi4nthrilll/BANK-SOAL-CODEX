package W1;

import B.AbstractC0004e;
import I1.AbstractActivityC0028d;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: W1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0098f implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p068v1.c f1737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public M f1739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1740d;
    public final io.flutter.embedding.engine.renderer.i e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N0.l f1741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f1742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D0.b f1743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0104l f1744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p067u1.a f1745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractActivityC0028d f1746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0100h f1747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Handler f1748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HandlerThread f1749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public A0.g f1750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CameraCaptureSession f1751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageReader f1752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public E0.i f1753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CaptureRequest.Builder f1754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public MediaRecorder f1755t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1756u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public File f1757w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0104l f1758x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final D0.b f1759y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public s f1760z;

    public C0098f(AbstractActivityC0028d abstractActivityC0028d, io.flutter.embedding.engine.renderer.i iVar, p067u1.a aVar, D0.b bVar, C0104l c0104l, N0.l lVar) {
        if (abstractActivityC0028d == null) {
            throw new IllegalStateException("No activity available!");
        }
        this.f1746k = abstractActivityC0028d;
        this.e = iVar;
        this.f1743h = bVar;
        this.f1742g = abstractActivityC0028d.getApplicationContext();
        this.f1744i = c0104l;
        this.f1745j = aVar;
        this.f1741f = lVar;
        this.f1737a = p068v1.c.g(aVar, c0104l, abstractActivityC0028d, bVar, lVar.f1087a);
        C0104l c0104l2 = new C0104l();
        c0104l2.e = new p037k2.a();
        c0104l2.f1774d = new p037k2.a();
        this.f1758x = c0104l2;
        D0.b bVar2 = new D0.b(21, false);
        this.f1759y = bVar2;
        this.f1747l = new C0100h(this, c0104l2, bVar2);
        if (this.f1749n != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f1749n = handlerThread;
        try {
            handlerThread.start();
        } catch (IllegalThreadStateException unused) {
        }
        this.f1748m = new Handler(this.f1749n.getLooper());
    }

    public final void a() {
        Log.i("Camera", "close");
        A0.g gVar = this.f1750o;
        if (gVar != null) {
            ((CameraDevice) gVar.e).close();
            this.f1750o = null;
            this.f1751p = null;
        } else if (this.f1751p != null) {
            Log.i("Camera", "closeCaptureSession");
            this.f1751p.close();
            this.f1751p = null;
        }
        ImageReader imageReader = this.f1752q;
        if (imageReader != null) {
            imageReader.close();
            this.f1752q = null;
        }
        E0.i iVar = this.f1753r;
        if (iVar != null) {
            ((ImageReader) iVar.f218f).close();
            this.f1753r = null;
        }
        MediaRecorder mediaRecorder = this.f1755t;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.f1755t.release();
            this.f1755t = null;
        }
        HandlerThread handlerThread = this.f1749n;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.f1749n = null;
        this.f1748m = null;
    }

    public final void b() {
        M m3 = this.f1739c;
        if (m3 != null) {
            m3.f1719m.interrupt();
            m3.f1723q.quitSafely();
            GLES20.glDeleteBuffers(2, m3.f1712f, 0);
            GLES20.glDeleteTextures(1, m3.f1708a, 0);
            EGL14.eglDestroyContext(m3.f1716j, m3.f1717k);
            EGL14.eglDestroySurface(m3.f1716j, m3.f1718l);
            GLES20.glDeleteProgram(m3.f1711d);
            m3.f1721o.release();
            this.f1739c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c8  */
    public final void c(int i3, Runnable runnable, Surface... surfaceArr) throws CameraAccessException {
        Size size;
        this.f1751p = null;
        this.f1754s = ((CameraDevice) this.f1750o.e).createCaptureRequest(i3);
        p024g2.a aVarD = this.f1737a.d();
        SurfaceTexture surfaceTexture = this.e.f4626b.surfaceTexture();
        surfaceTexture.setDefaultBufferSize(aVarD.f4510c.getWidth(), aVarD.f4510c.getHeight());
        Surface surface = new Surface(surfaceTexture);
        this.f1754s.addTarget(surface);
        List<Surface> listAsList = Arrays.asList(surfaceArr);
        if (i3 != 1) {
            Surface surface2 = this.f1752q.getSurface();
            for (Surface surface3 : listAsList) {
                if (surface3 != surface2) {
                    this.f1754s.addTarget(surface3);
                }
            }
        }
        C0104l c0104l = this.f1744i;
        CaptureRequest.Builder builder = this.f1754s;
        int i4 = J.f1705a;
        if (i4 < 28) {
            size = (Size) ((CameraCharacteristics) c0104l.e).get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        } else {
            int[] iArr = (int[]) ((CameraCharacteristics) c0104l.e).get(CameraCharacteristics.DISTORTION_CORRECTION_AVAILABLE_MODES);
            if (iArr == null) {
                iArr = new int[0];
            }
            if (Arrays.stream(iArr).filter(new C0105m()).count() > 0) {
                Integer num = (Integer) builder.get(CaptureRequest.DISTORTION_CORRECTION_MODE);
                CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) c0104l.e;
                Rect rect = (num == null || num.intValue() == 0) ? (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PRE_CORRECTION_ACTIVE_ARRAY_SIZE) : (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                size = new Size(rect.width(), rect.height());
            } else {
                size = (Size) ((CameraCharacteristics) c0104l.e).get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
            }
        }
        p007b2.a aVarB = this.f1737a.b();
        aVarB.f2557b = size;
        aVarB.b();
        p014d2.a aVarC = this.f1737a.c();
        aVarC.f3922b = size;
        aVarC.b();
        C0095c c0095c = new C0095c(this, runnable);
        if (i4 < 28) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(surface);
            arrayList.addAll(listAsList);
            A0.g gVar = this.f1750o;
            ((CameraDevice) gVar.e).createCaptureSession(arrayList, c0095c, ((C0098f) gVar.f19f).f1748m);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(C.b.e(surface));
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add(C.b.e((Surface) it.next()));
        }
        A0.g gVar2 = this.f1750o;
        AbstractC0004e.r();
        ((CameraDevice) gVar2.e).createCaptureSession(AbstractC0004e.i(arrayList2, Executors.newSingleThreadExecutor(), c0095c));
    }

    public final void d() {
        Log.i("Camera", "lockAutoFocus");
        if (this.f1751p == null) {
            Log.i("Camera", "[unlockAutoFocus] captureSession null, returning");
            return;
        }
        this.f1754s.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        try {
            this.f1751p.capture(this.f1754s.build(), null, this.f1748m);
        } catch (CameraAccessException e) {
            this.f1743h.Q(e.getMessage() == null ? "CameraAccessException occurred while locking autofocus." : e.getMessage());
        }
    }

    public final void e() {
        int iA;
        D0.b bVar = this.f1743h;
        Log.i("Camera", "captureStillPicture");
        this.f1747l.f1766b = 5;
        A0.g gVar = this.f1750o;
        if (gVar == null) {
            return;
        }
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = ((CameraDevice) gVar.e).createCaptureRequest(2);
            builderCreateCaptureRequest.addTarget(this.f1752q.getSurface());
            CaptureRequest.Key key = CaptureRequest.SCALER_CROP_REGION;
            builderCreateCaptureRequest.set(key, (Rect) this.f1754s.get(key));
            Iterator it = this.f1737a.f5762d.values().iterator();
            while (it.hasNext()) {
                ((X1.a) it.next()).a(builderCreateCaptureRequest);
            }
            int i3 = this.f1737a.e().f4525d;
            CaptureRequest.Key key2 = CaptureRequest.JPEG_ORIENTATION;
            if (i3 == 0) {
                p027h2.b bVar2 = this.f1737a.e().f4524c;
                iA = bVar2.a(bVar2.e);
            } else {
                iA = this.f1737a.e().f4524c.a(i3);
            }
            builderCreateCaptureRequest.set(key2, Integer.valueOf(iA));
            C0096d c0096d = new C0096d(this);
            try {
                Log.i("Camera", "sending capture request");
                this.f1751p.capture(builderCreateCaptureRequest.build(), c0096d, this.f1748m);
            } catch (CameraAccessException e) {
                bVar.z(this.f1760z, "cameraAccess", e.getMessage());
            }
        } catch (CameraAccessException e3) {
            bVar.z(this.f1760z, "cameraAccess", e3.getMessage());
        }
    }

    public final void f(Integer num) {
        this.f1738b = num.intValue();
        p024g2.a aVarD = this.f1737a.d();
        if (aVarD.f4512f < 0) {
            this.f1743h.Q(p013d1.I.h(new StringBuilder("Camera with name \""), (String) this.f1744i.f1774d, "\" is not supported by this plugin."));
        } else {
            this.f1752q = ImageReader.newInstance(aVarD.f4509b.getWidth(), aVarD.f4509b.getHeight(), 256, 1);
            this.f1753r = new E0.i(aVarD.f4510c.getWidth(), aVarD.f4510c.getHeight(), this.f1738b);
            ((CameraManager) this.f1746k.getSystemService("camera")).openCamera((String) this.f1744i.f1774d, new C0094b(this, aVarD), this.f1748m);
        }
    }

    public final void g(String str) {
        N0.l lVar;
        int iC;
        EncoderProfiles encoderProfiles;
        Log.i("Camera", "prepareMediaRecorder");
        MediaRecorder mediaRecorder = this.f1755t;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        b();
        int i3 = this.f1737a.e().f4525d;
        boolean zA = J.a();
        N0.l lVar2 = this.f1741f;
        if (!zA || this.f1737a.d().e == null) {
            CamcorderProfile camcorderProfile = this.f1737a.d().f4511d;
            E0.n nVar = new E0.n(str, (Integer) lVar2.f1089c, (Integer) lVar2.f1090d, (Integer) lVar2.e, false);
            lVar = new N0.l();
            lVar.f1089c = camcorderProfile;
            lVar.f1090d = null;
            lVar.e = nVar;
        } else {
            EncoderProfiles encoderProfiles2 = this.f1737a.d().e;
            E0.n nVar2 = new E0.n(str, (Integer) lVar2.f1089c, (Integer) lVar2.f1090d, (Integer) lVar2.e, false);
            lVar = new N0.l();
            lVar.f1090d = encoderProfiles2;
            lVar.f1089c = null;
            lVar.e = nVar2;
        }
        lVar.f1088b = lVar2.f1088b;
        if (i3 == 0) {
            p027h2.b bVar = this.f1737a.e().f4524c;
            iC = bVar.c(bVar.e);
        } else {
            iC = this.f1737a.e().f4524c.c(i3);
        }
        lVar.f1087a = iC;
        MediaRecorder mediaRecorder2 = new MediaRecorder();
        if (lVar.f1088b) {
            mediaRecorder2.setAudioSource(1);
        }
        mediaRecorder2.setVideoSource(2);
        boolean zA2 = J.a();
        E0.n nVar3 = (E0.n) lVar.e;
        Integer num = (Integer) nVar3.e;
        Integer num2 = (Integer) nVar3.f237f;
        Integer num3 = (Integer) nVar3.f238g;
        if (!zA2 || (encoderProfiles = (EncoderProfiles) lVar.f1090d) == null) {
            CamcorderProfile camcorderProfile2 = (CamcorderProfile) lVar.f1089c;
            if (camcorderProfile2 != null) {
                mediaRecorder2.setOutputFormat(camcorderProfile2.fileFormat);
                if (lVar.f1088b) {
                    mediaRecorder2.setAudioEncoder(camcorderProfile2.audioCodec);
                    mediaRecorder2.setAudioEncodingBitRate((num3 == null || num3.intValue() <= 0) ? camcorderProfile2.audioBitRate : num3.intValue());
                    mediaRecorder2.setAudioSamplingRate(camcorderProfile2.audioSampleRate);
                }
                mediaRecorder2.setVideoEncoder(camcorderProfile2.videoCodec);
                mediaRecorder2.setVideoEncodingBitRate((num2 == null || num2.intValue() <= 0) ? camcorderProfile2.videoBitRate : num2.intValue());
                mediaRecorder2.setVideoFrameRate((num == null || num.intValue() <= 0) ? camcorderProfile2.videoFrameRate : num.intValue());
                mediaRecorder2.setVideoSize(camcorderProfile2.videoFrameWidth, camcorderProfile2.videoFrameHeight);
            }
        } else {
            mediaRecorder2.setOutputFormat(encoderProfiles.getRecommendedFileFormat());
            EncoderProfiles.VideoProfile videoProfileF = I1.m.f(((EncoderProfiles) lVar.f1090d).getVideoProfiles().get(0));
            if (lVar.f1088b) {
                EncoderProfiles.AudioProfile audioProfileE = I1.m.e(((EncoderProfiles) lVar.f1090d).getAudioProfiles().get(0));
                mediaRecorder2.setAudioEncoder(audioProfileE.getCodec());
                mediaRecorder2.setAudioEncodingBitRate((num3 == null || num3.intValue() <= 0) ? audioProfileE.getBitrate() : num3.intValue());
                mediaRecorder2.setAudioSamplingRate(audioProfileE.getSampleRate());
            }
            mediaRecorder2.setVideoEncoder(videoProfileF.getCodec());
            mediaRecorder2.setVideoEncodingBitRate((num2 == null || num2.intValue() <= 0) ? videoProfileF.getBitrate() : num2.intValue());
            mediaRecorder2.setVideoFrameRate((num == null || num.intValue() <= 0) ? videoProfileF.getFrameRate() : num.intValue());
            mediaRecorder2.setVideoSize(videoProfileF.getWidth(), videoProfileF.getHeight());
        }
        mediaRecorder2.setOutputFile((String) nVar3.f236d);
        mediaRecorder2.setOrientationHint(lVar.f1087a);
        mediaRecorder2.prepare();
        this.f1755t = mediaRecorder2;
    }

    public final void h(Runnable runnable, q qVar) {
        Log.i("Camera", "refreshPreviewCaptureSession");
        CameraCaptureSession cameraCaptureSession = this.f1751p;
        if (cameraCaptureSession == null) {
            Log.i("Camera", "refreshPreviewCaptureSession: captureSession not yet initialized, skipping preview capture session refresh.");
            return;
        }
        try {
            if (!this.v) {
                cameraCaptureSession.setRepeatingRequest(this.f1754s.build(), this.f1747l, this.f1748m);
            }
            if (runnable != null) {
                runnable.run();
            }
        } catch (CameraAccessException e) {
            qVar.onError(e.getMessage());
        } catch (IllegalStateException e3) {
            qVar.onError("Camera is closed: " + e3.getMessage());
        }
    }

    public final void i() {
        C0100h c0100h = this.f1747l;
        Log.i("Camera", "runPrecaptureSequence");
        try {
            CaptureRequest.Builder builder = this.f1754s;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
            builder.set(key, 0);
            this.f1751p.capture(this.f1754s.build(), c0100h, this.f1748m);
            h(null, new C0093a(this, 1));
            c0100h.f1766b = 3;
            this.f1754s.set(key, 1);
            this.f1751p.capture(this.f1754s.build(), c0100h, this.f1748m);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }

    public final void j(C0104l c0104l) {
        if (!this.f1756u) {
            throw new u("setDescriptionWhileRecordingFailed", "Device was not recording", null);
        }
        if (J.f1705a < 26) {
            throw new u("setDescriptionWhileRecordingFailed", "Device does not support switching the camera while recording", null);
        }
        A0.g gVar = this.f1750o;
        if (gVar != null) {
            ((CameraDevice) gVar.e).close();
            this.f1750o = null;
            this.f1751p = null;
        } else if (this.f1751p != null) {
            Log.i("Camera", "closeCaptureSession");
            this.f1751p.close();
            this.f1751p = null;
        }
        if (this.f1739c == null) {
            p024g2.a aVarD = this.f1737a.d();
            this.f1739c = new M(this.f1755t.getSurface(), aVarD.f4509b.getWidth(), aVarD.f4509b.getHeight(), new C0097e(this));
        }
        this.f1744i = c0104l;
        int i3 = this.f1741f.f1087a;
        p068v1.c cVarG = p068v1.c.g(this.f1745j, c0104l, this.f1746k, this.f1743h, i3);
        this.f1737a = cVarG;
        cVarG.f5762d.put("AUTO_FOCUS", new Y1.a(this.f1744i, true));
        n(this.f1744i);
        try {
            f(Integer.valueOf(this.f1738b));
        } catch (CameraAccessException e) {
            throw new u("setDescriptionWhileRecordingFailed", e.getMessage(), null);
        }
    }

    public final void k(s sVar, int i3) {
        X1.a aVar = (X1.a) this.f1737a.f5762d.get("FLASH");
        Objects.requireNonNull(aVar);
        p010c2.a aVar2 = (p010c2.a) aVar;
        aVar2.f2679b = i3;
        aVar2.a(this.f1754s);
        h(new M1.c(7, sVar), new G1.a(8, sVar));
    }

    public final void l(int i3) {
        Y1.a aVar = (Y1.a) this.f1737a.f5762d.get("AUTO_FOCUS");
        aVar.f1935b = i3;
        aVar.a(this.f1754s);
        if (this.v) {
            return;
        }
        int iB = M.j.b(i3);
        if (iB == 0) {
            q();
            return;
        }
        if (iB != 1) {
            return;
        }
        if (this.f1751p == null) {
            Log.i("Camera", "[unlockAutoFocus] captureSession null, returning");
            return;
        }
        d();
        this.f1754s.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        try {
            this.f1751p.setRepeatingRequest(this.f1754s.build(), null, this.f1748m);
        } catch (CameraAccessException e) {
            throw new u("setFocusModeFailed", "Error setting focus mode: " + e.getMessage(), null);
        }
    }

    public final void m(s sVar, C0104l c0104l) {
        p014d2.a aVarC = this.f1737a.c();
        if (c0104l == null || ((Double) c0104l.e) == null || ((Double) c0104l.f1774d) == null) {
            c0104l = null;
        }
        aVarC.f3923c = c0104l;
        aVarC.b();
        aVarC.a(this.f1754s);
        h(new M1.c(5, sVar), new G1.a(5, sVar));
        l(((Y1.a) this.f1737a.f5762d.get("AUTO_FOCUS")).f1935b);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    public final void n(C0104l c0104l) {
        Integer numValueOf;
        N0.l lVar = this.f1741f;
        Integer num = (Integer) lVar.f1089c;
        if (num != null && num.intValue() > 0) {
            numValueOf = (Integer) lVar.f1089c;
        } else if (J.a()) {
            EncoderProfiles encoderProfiles = this.f1737a.d().e;
            if (encoderProfiles == null || encoderProfiles.getVideoProfiles().size() <= 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(I1.m.f(encoderProfiles.getVideoProfiles().get(0)).getFrameRate());
            }
        } else {
            CamcorderProfile camcorderProfile = this.f1737a.d().f4511d;
            if (camcorderProfile != null) {
                numValueOf = Integer.valueOf(camcorderProfile.videoFrameRate);
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf == null || numValueOf.intValue() <= 0) {
            return;
        }
        p017e2.a aVar = new p017e2.a(c0104l);
        aVar.f4389b = new Range(numValueOf, numValueOf);
        this.f1737a.f5762d.put("FPS_RANGE", aVar);
    }

    public final void o(boolean z2, boolean z3) {
        M1.c cVar;
        E0.i iVar;
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(this.f1755t.getSurface());
            cVar = new M1.c(4, this);
        } else {
            cVar = null;
        }
        if (z3 && (iVar = this.f1753r) != null) {
            arrayList.add(((ImageReader) iVar.f218f).getSurface());
        }
        arrayList.add(this.f1752q.getSurface());
        c(3, cVar, (Surface[]) arrayList.toArray(new Surface[0]));
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Log.i("Camera", "onImageAvailable");
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        if (imageAcquireNextImage == null) {
            return;
        }
        this.f1748m.post(new D0.a(imageAcquireNextImage, this.f1757w, new A0.f(26, this), 1));
        this.f1747l.f1766b = 1;
    }

    public final void p(W.g gVar) {
        int iC;
        Surface surface;
        if (!this.f1756u) {
            ImageReader imageReader = this.f1752q;
            if (imageReader != null && imageReader.getSurface() != null) {
                Log.i("Camera", "startPreview");
                c(1, gVar, this.f1752q.getSurface());
                return;
            } else {
                if (gVar != null) {
                    gVar.run();
                    return;
                }
                return;
            }
        }
        if (this.f1739c == null) {
            if (gVar != null) {
                gVar.run();
                return;
            }
            return;
        }
        int i3 = this.f1737a.e().f4525d;
        p027h2.b bVar = this.f1737a.e().f4524c;
        if (bVar != null) {
            iC = i3 == 0 ? bVar.c(bVar.e) : bVar.c(i3);
        } else {
            iC = 0;
        }
        if (((Integer) ((CameraCharacteristics) this.f1744i.e).get(CameraCharacteristics.LENS_FACING)).intValue() != this.f1740d) {
            iC = (iC + 180) % 360;
        }
        M m3 = this.f1739c;
        m3.v = iC;
        synchronized (m3.f1728w) {
            while (true) {
                try {
                    surface = m3.f1722p;
                    if (surface == null) {
                        m3.f1728w.wait();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c(3, gVar, surface);
    }

    public final void q() {
        Log.i("Camera", "unlockAutoFocus");
        if (this.f1751p == null) {
            Log.i("Camera", "[unlockAutoFocus] captureSession null, returning");
            return;
        }
        try {
            CaptureRequest.Builder builder = this.f1754s;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
            builder.set(key, 2);
            this.f1751p.capture(this.f1754s.build(), null, this.f1748m);
            this.f1754s.set(key, 0);
            this.f1751p.capture(this.f1754s.build(), null, this.f1748m);
            h(null, new C0093a(this, 2));
        } catch (CameraAccessException e) {
            this.f1743h.Q(e.getMessage() == null ? "CameraAccessException occurred while unlocking autofocus." : e.getMessage());
        }
    }
}
