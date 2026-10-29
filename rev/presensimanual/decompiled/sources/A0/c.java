package A0;

import B.C0006g;
import E0.n;
import I1.AbstractActivityC0028d;
import M.j;
import W1.C0104l;
import W1.v;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import android.util.Range;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0179c8;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0329s;
import com.google.android.gms.internal.mlkit_vision_face_bundled.M8;
import com.google.android.gms.internal.mlkit_vision_face_bundled.V7;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k.Z0;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0419b3;
import p013d1.C0409a;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static int a(String str) throws NoSuchFieldException {
        String str2;
        for (int i3 : j.c(2)) {
            if (i3 == 1) {
                str2 = "Brightness.light";
            } else {
                if (i3 != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i3;
            }
        }
        throw new NoSuchFieldException(I.g("No such Brightness: ", str));
    }

    public static int b(String str) throws NoSuchFieldException {
        for (int i3 : j.c(5)) {
            String str2 = null;
            if (i3 != 1) {
                if (i3 == 2) {
                    str2 = "HapticFeedbackType.lightImpact";
                } else if (i3 == 3) {
                    str2 = "HapticFeedbackType.mediumImpact";
                } else if (i3 == 4) {
                    str2 = "HapticFeedbackType.heavyImpact";
                } else {
                    if (i3 != 5) {
                        throw null;
                    }
                    str2 = "HapticFeedbackType.selectionClick";
                }
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i3;
            }
        }
        throw new NoSuchFieldException(I.g("No such HapticFeedbackType: ", str));
    }

    public static int c(String str) throws NoSuchFieldException {
        String str2;
        for (int i3 : j.c(2)) {
            if (i3 == 1) {
                str2 = "SystemSoundType.click";
            } else {
                if (i3 != 2) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i3;
            }
        }
        throw new NoSuchFieldException(I.g("No such SoundType: ", str));
    }

    public static int d(int i3, int i4, int i5) {
        return C0179c8.r(i3) + i4 + i5;
    }

    public static C0329s e(HashMap map, int i3) {
        Collections.unmodifiableMap(new HashMap(map));
        return new C0329s(i3);
    }

    public static C0409a f(HashMap map, int i3) {
        Collections.unmodifiableMap(new HashMap(map));
        return new C0409a(i3);
    }

    public static ClassCastException g(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String h(String str, int i3, String str2, int i4) {
        return str + i3 + str2 + i4;
    }

    public static HashMap i(Class cls, C0329s c0329s) {
        HashMap map = new HashMap();
        map.put(cls, c0329s);
        return map;
    }

    public static HashMap j(Class cls, C0409a c0409a) {
        HashMap map = new HashMap();
        map.put(cls, c0409a);
        return map;
    }

    public static Map k(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static n1.c l(int i3, C0104l c0104l) {
        c0104l.h(new C0329s(i3));
        return c0104l.b();
    }

    public static /* synthetic */ void m(V7 v7) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void n(M8 m8) {
        if (m8 != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void o(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void p(String str, int i3) {
        if (i3 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = B2.h.class.getName();
            int i4 = 0;
            while (!stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            while (stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            B2.h.f(nullPointerException, B2.h.class.getName());
            throw nullPointerException;
        }
    }

    public static void q(S1.f fVar, final Z0 z2) {
        v vVar = v.f1790d;
        Object obj = null;
        n nVar = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.getAvailableCameras", vVar, obj, false);
        if (z2 != null) {
            final int i3 = 0;
            nVar.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i4 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i4 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i4;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i4 = 6;
                    int i5 = 4;
                    int i6 = 3;
                    int i7 = 2;
                    int i8 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i9 = 0;
                    switch (i3) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i8, sVar, aVarA), new G1.a(i4, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i9);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i7 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i7);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i4);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i6, sVar4), new G1.a(i5, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i9));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i8 = 0;
                                        }
                                        if (i8 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i5 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i5 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i5 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i5;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i8);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i8 = 0;
                                        }
                                        if (i8 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i7);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i5 = 1;
                            } else if (iOrdinal3 == 1) {
                                i5 = 2;
                            } else if (iOrdinal3 == 2) {
                                i5 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i5);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar.e(null);
        }
        n nVar2 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.create", vVar, obj, false);
        if (z2 != null) {
            final int i4 = 2;
            nVar2.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i5 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i5 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i5;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i5 = 6;
                    int i6 = 4;
                    int i7 = 3;
                    int i8 = 2;
                    int i9 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i10 = 0;
                    switch (i4) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i9, sVar, aVarA), new G1.a(i5, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i10);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i8 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i8);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i5);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i7, sVar4), new G1.a(i6, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i10));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i9 = 0;
                                        }
                                        if (i9 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i6 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i6 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i6 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i6;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i9);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i9 = 0;
                                        }
                                        if (i9 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i8);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i6 = 1;
                            } else if (iOrdinal3 == 1) {
                                i6 = 2;
                            } else if (iOrdinal3 == 2) {
                                i6 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i6);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar2.e(null);
        }
        n nVar3 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.initialize", vVar, obj, false);
        if (z2 != null) {
            final int i5 = 12;
            nVar3.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i6 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i6 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i6;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i6 = 6;
                    int i7 = 4;
                    int i8 = 3;
                    int i9 = 2;
                    int i10 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i11 = 0;
                    switch (i5) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i10, sVar, aVarA), new G1.a(i6, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i11);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i9 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i9);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i6);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i8, sVar4), new G1.a(i7, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i11));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i10 = 0;
                                        }
                                        if (i10 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i7 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i7 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i7 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i7;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i10);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i10 = 0;
                                        }
                                        if (i10 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i9);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i7 = 1;
                            } else if (iOrdinal3 == 1) {
                                i7 = 2;
                            } else if (iOrdinal3 == 2) {
                                i7 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i7);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar3.e(null);
        }
        n nVar4 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.dispose", vVar, obj, false);
        if (z2 != null) {
            final int i6 = 13;
            nVar4.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i7 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i7 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i7;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i7 = 6;
                    int i8 = 4;
                    int i9 = 3;
                    int i10 = 2;
                    int i11 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i12 = 0;
                    switch (i6) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i11, sVar, aVarA), new G1.a(i7, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i12);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i10 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i10);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i7);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i9, sVar4), new G1.a(i8, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i12));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i11 = 0;
                                        }
                                        if (i11 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i8 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i8 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i8 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i8;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i11);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i11 = 0;
                                        }
                                        if (i11 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i10);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i8 = 1;
                            } else if (iOrdinal3 == 1) {
                                i8 = 2;
                            } else if (iOrdinal3 == 2) {
                                i8 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i8);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar4.e(null);
        }
        n nVar5 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.lockCaptureOrientation", vVar, obj, false);
        if (z2 != null) {
            final int i7 = 14;
            nVar5.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i8 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i8 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i8;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i8 = 6;
                    int i9 = 4;
                    int i10 = 3;
                    int i11 = 2;
                    int i12 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i13 = 0;
                    switch (i7) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i12, sVar, aVarA), new G1.a(i8, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i13);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i11 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i11);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i8);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i10, sVar4), new G1.a(i9, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i13));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i12 = 0;
                                        }
                                        if (i12 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i9 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i9 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i9 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i9;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i12);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i12 = 0;
                                        }
                                        if (i12 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i11);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i9 = 1;
                            } else if (iOrdinal3 == 1) {
                                i9 = 2;
                            } else if (iOrdinal3 == 2) {
                                i9 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i9);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar5.e(null);
        }
        n nVar6 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.unlockCaptureOrientation", vVar, obj, false);
        if (z2 != null) {
            final int i8 = 15;
            nVar6.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i9 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i9 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i9;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i9 = 6;
                    int i10 = 4;
                    int i11 = 3;
                    int i12 = 2;
                    int i13 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i14 = 0;
                    switch (i8) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i13, sVar, aVarA), new G1.a(i9, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i14);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i12 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i12);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i9);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i11, sVar4), new G1.a(i10, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i14));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i13 = 0;
                                        }
                                        if (i13 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i10 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i10 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i10 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i10;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i13);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i13 = 0;
                                        }
                                        if (i13 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i12);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i10 = 1;
                            } else if (iOrdinal3 == 1) {
                                i10 = 2;
                            } else if (iOrdinal3 == 2) {
                                i10 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i10);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar6.e(null);
        }
        n nVar7 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.takePicture", vVar, obj, false);
        if (z2 != null) {
            final int i9 = 16;
            nVar7.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i10 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i10 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i10;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i10 = 6;
                    int i11 = 4;
                    int i12 = 3;
                    int i13 = 2;
                    int i14 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i15 = 0;
                    switch (i9) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i14, sVar, aVarA), new G1.a(i10, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i15);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i13 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i13);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i10);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i12, sVar4), new G1.a(i11, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i15));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i14 = 0;
                                        }
                                        if (i14 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i11 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i11 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i11 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i11;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i14);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i14 = 0;
                                        }
                                        if (i14 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i13);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i11 = 1;
                            } else if (iOrdinal3 == 1) {
                                i11 = 2;
                            } else if (iOrdinal3 == 2) {
                                i11 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i11);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar7.e(null);
        }
        n nVar8 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.startVideoRecording", vVar, obj, false);
        if (z2 != null) {
            final int i10 = 17;
            nVar8.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i11 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i11 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i11;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i11 = 6;
                    int i12 = 4;
                    int i13 = 3;
                    int i14 = 2;
                    int i15 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i16 = 0;
                    switch (i10) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i15, sVar, aVarA), new G1.a(i11, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i16);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i14 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i14);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i11);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i13, sVar4), new G1.a(i12, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i16));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i15 = 0;
                                        }
                                        if (i15 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i12 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i12 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i12 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i12;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i15);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i15 = 0;
                                        }
                                        if (i15 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i14);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i12 = 1;
                            } else if (iOrdinal3 == 1) {
                                i12 = 2;
                            } else if (iOrdinal3 == 2) {
                                i12 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i12);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar8.e(null);
        }
        n nVar9 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.stopVideoRecording", vVar, obj, false);
        if (z2 != null) {
            final int i11 = 18;
            nVar9.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i12 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i12 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i12;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i12 = 6;
                    int i13 = 4;
                    int i14 = 3;
                    int i15 = 2;
                    int i16 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i17 = 0;
                    switch (i11) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i16, sVar, aVarA), new G1.a(i12, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i17);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i15 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i15);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i12);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i14, sVar4), new G1.a(i13, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i17));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i13 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i13 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i13 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i13;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i16);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i16 = 0;
                                        }
                                        if (i16 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i15);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i13 = 1;
                            } else if (iOrdinal3 == 1) {
                                i13 = 2;
                            } else if (iOrdinal3 == 2) {
                                i13 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i13);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar9.e(null);
        }
        n nVar10 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.pauseVideoRecording", vVar, obj, false);
        if (z2 != null) {
            final int i12 = 19;
            nVar10.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i13 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i13 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i13;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i13 = 6;
                    int i14 = 4;
                    int i15 = 3;
                    int i16 = 2;
                    int i17 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i18 = 0;
                    switch (i12) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i17, sVar, aVarA), new G1.a(i13, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i18);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i16 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i16);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i13);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i15, sVar4), new G1.a(i14, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i18));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i17 = 0;
                                        }
                                        if (i17 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i14 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i14 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i14 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i14;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i17);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i17 = 0;
                                        }
                                        if (i17 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i16);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i14 = 1;
                            } else if (iOrdinal3 == 1) {
                                i14 = 2;
                            } else if (iOrdinal3 == 2) {
                                i14 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i14);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar10.e(null);
        }
        n nVar11 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.resumeVideoRecording", vVar, obj, false);
        if (z2 != null) {
            final int i13 = 11;
            nVar11.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i14 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i14 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i14;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i14 = 6;
                    int i15 = 4;
                    int i16 = 3;
                    int i17 = 2;
                    int i18 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i19 = 0;
                    switch (i13) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i18, sVar, aVarA), new G1.a(i14, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i19);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i17 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i17);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i14);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i16, sVar4), new G1.a(i15, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i19));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i18 = 0;
                                        }
                                        if (i18 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i15 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i15 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i15 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i15;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i18);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i18 = 0;
                                        }
                                        if (i18 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i17);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i15 = 1;
                            } else if (iOrdinal3 == 1) {
                                i15 = 2;
                            } else if (iOrdinal3 == 2) {
                                i15 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i15);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar11.e(null);
        }
        n nVar12 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.startImageStream", vVar, obj, false);
        if (z2 != null) {
            final int i14 = 20;
            nVar12.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i15 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i15 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i15;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i15 = 6;
                    int i16 = 4;
                    int i17 = 3;
                    int i18 = 2;
                    int i19 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i110 = 0;
                    switch (i14) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i19, sVar, aVarA), new G1.a(i15, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i110);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i18 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i18);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i15);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i17, sVar4), new G1.a(i16, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i110));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i19 = 0;
                                        }
                                        if (i19 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i16 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i16 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i16 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i16;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i19);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i19 = 0;
                                        }
                                        if (i19 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i18);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i16 = 1;
                            } else if (iOrdinal3 == 1) {
                                i16 = 2;
                            } else if (iOrdinal3 == 2) {
                                i16 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i16);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar12.e(null);
        }
        n nVar13 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.stopImageStream", vVar, obj, false);
        if (z2 != null) {
            final int i15 = 21;
            nVar13.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i16 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i16 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i16;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i16 = 6;
                    int i17 = 4;
                    int i18 = 3;
                    int i19 = 2;
                    int i110 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i111 = 0;
                    switch (i15) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i110, sVar, aVarA), new G1.a(i16, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i111);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i19 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i19);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i16);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i18, sVar4), new G1.a(i17, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i111));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i110 = 0;
                                        }
                                        if (i110 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i17 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i17 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i17 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i17;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i110);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i110 = 0;
                                        }
                                        if (i110 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i19);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i17 = 1;
                            } else if (iOrdinal3 == 1) {
                                i17 = 2;
                            } else if (iOrdinal3 == 2) {
                                i17 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i17);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar13.e(null);
        }
        n nVar14 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.setFlashMode", vVar, obj, false);
        if (z2 != null) {
            final int i16 = 22;
            nVar14.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i17 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i17 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i17;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i17 = 6;
                    int i18 = 4;
                    int i19 = 3;
                    int i110 = 2;
                    int i111 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i112 = 0;
                    switch (i16) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i111, sVar, aVarA), new G1.a(i17, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i112);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i110 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i110);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i17);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i19, sVar4), new G1.a(i18, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i112));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i111 = 0;
                                        }
                                        if (i111 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i18 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i18 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i18 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i18;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i111);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i111 = 0;
                                        }
                                        if (i111 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i110);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i18 = 1;
                            } else if (iOrdinal3 == 1) {
                                i18 = 2;
                            } else if (iOrdinal3 == 2) {
                                i18 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i18);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar14.e(null);
        }
        n nVar15 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.setExposureMode", vVar, obj, false);
        if (z2 != null) {
            final int i17 = 23;
            nVar15.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i18 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i18 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i18;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i18 = 6;
                    int i19 = 4;
                    int i110 = 3;
                    int i111 = 2;
                    int i112 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i113 = 0;
                    switch (i17) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i112, sVar, aVarA), new G1.a(i18, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i113);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i111 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i111);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i18);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i110, sVar4), new G1.a(i19, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i113));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i112 = 0;
                                        }
                                        if (i112 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i19 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i19 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i19 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i19;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i112);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i112 = 0;
                                        }
                                        if (i112 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i111);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i19 = 1;
                            } else if (iOrdinal3 == 1) {
                                i19 = 2;
                            } else if (iOrdinal3 == 2) {
                                i19 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i19);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar15.e(null);
        }
        v vVar2 = v.f1790d;
        n nVar16 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.setExposurePoint", vVar, obj, false);
        if (z2 != null) {
            final int i18 = 24;
            nVar16.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i19 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i19 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i19;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i19 = 6;
                    int i110 = 4;
                    int i111 = 3;
                    int i112 = 2;
                    int i113 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i114 = 0;
                    switch (i18) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i113, sVar, aVarA), new G1.a(i19, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i114);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i112 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i112);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i19);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i111, sVar4), new G1.a(i110, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i114));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i113 = 0;
                                        }
                                        if (i113 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i110 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i110 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i110 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i110;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i113);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i113 = 0;
                                        }
                                        if (i113 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i112);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i110 = 1;
                            } else if (iOrdinal3 == 1) {
                                i110 = 2;
                            } else if (iOrdinal3 == 2) {
                                i110 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i110);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar16.e(null);
        }
        v vVar3 = v.f1790d;
        n nVar17 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.getMinExposureOffset", vVar, obj, false);
        if (z2 != null) {
            final int i19 = 25;
            nVar17.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i110 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i110 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i110;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i110 = 6;
                    int i111 = 4;
                    int i112 = 3;
                    int i113 = 2;
                    int i114 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i115 = 0;
                    switch (i19) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i114, sVar, aVarA), new G1.a(i110, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i115);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i113 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i113);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i110);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i112, sVar4), new G1.a(i111, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i115));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i111 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i111 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i111 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i111;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i114);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i113);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i111 = 1;
                            } else if (iOrdinal3 == 1) {
                                i111 = 2;
                            } else if (iOrdinal3 == 2) {
                                i111 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i111);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar17.e(null);
        }
        v vVar4 = v.f1790d;
        n nVar18 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.getMaxExposureOffset", vVar, obj, false);
        if (z2 != null) {
            final int i20 = 26;
            nVar18.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i110 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i110 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i110;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i110 = 6;
                    int i111 = 4;
                    int i112 = 3;
                    int i113 = 2;
                    int i114 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i115 = 0;
                    switch (i20) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i114, sVar, aVarA), new G1.a(i110, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i115);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i113 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i113);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i110);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i112, sVar4), new G1.a(i111, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i115));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i111 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i111 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i111 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i111;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i114);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i113);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i111 = 1;
                            } else if (iOrdinal3 == 1) {
                                i111 = 2;
                            } else if (iOrdinal3 == 2) {
                                i111 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i111);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar18.e(null);
        }
        v vVar5 = v.f1790d;
        n nVar19 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.getExposureOffsetStepSize", vVar, obj, false);
        if (z2 != null) {
            final int i21 = 27;
            nVar19.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i110 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i110 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i110;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i110 = 6;
                    int i111 = 4;
                    int i112 = 3;
                    int i113 = 2;
                    int i114 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i115 = 0;
                    switch (i21) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i114, sVar, aVarA), new G1.a(i110, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i115);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i113 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i113);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i110);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i112, sVar4), new G1.a(i111, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i115));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i111 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i111 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i111 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i111;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i114);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i113);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i111 = 1;
                            } else if (iOrdinal3 == 1) {
                                i111 = 2;
                            } else if (iOrdinal3 == 2) {
                                i111 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i111);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar19.e(null);
        }
        v vVar6 = v.f1790d;
        n nVar20 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.setExposureOffset", vVar, obj, false);
        if (z2 != null) {
            final int i22 = 1;
            nVar20.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i110 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i110 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i110;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i110 = 6;
                    int i111 = 4;
                    int i112 = 3;
                    int i113 = 2;
                    int i114 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i115 = 0;
                    switch (i22) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i114, sVar, aVarA), new G1.a(i110, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i115);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i113 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i113);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i110);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i112, sVar4), new G1.a(i111, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i115));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i111 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i111 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i111 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i111;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i114);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i113);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i111 = 1;
                            } else if (iOrdinal3 == 1) {
                                i111 = 2;
                            } else if (iOrdinal3 == 2) {
                                i111 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i111);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar20.e(null);
        }
        v vVar7 = v.f1790d;
        n nVar21 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.setFocusMode", vVar, obj, false);
        if (z2 != null) {
            final int i23 = 3;
            nVar21.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i110 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i110 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i110;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i110 = 6;
                    int i111 = 4;
                    int i112 = 3;
                    int i113 = 2;
                    int i114 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i115 = 0;
                    switch (i23) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i114, sVar, aVarA), new G1.a(i110, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i115);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i113 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i113);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i110);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i112, sVar4), new G1.a(i111, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i115));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i111 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i111 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i111 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i111;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i114);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i113);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i111 = 1;
                            } else if (iOrdinal3 == 1) {
                                i111 = 2;
                            } else if (iOrdinal3 == 2) {
                                i111 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i111);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar21.e(null);
        }
        v vVar8 = v.f1790d;
        n nVar22 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.setFocusPoint", vVar, obj, false);
        if (z2 != null) {
            final int i24 = 4;
            nVar22.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i110 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i110 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i110;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i110 = 6;
                    int i111 = 4;
                    int i112 = 3;
                    int i113 = 2;
                    int i114 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i115 = 0;
                    switch (i24) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i114, sVar, aVarA), new G1.a(i110, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i115);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i113 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i113);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i110);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i112, sVar4), new G1.a(i111, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i115));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i111 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i111 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i111 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i111;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i114);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i113);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i111 = 1;
                            } else if (iOrdinal3 == 1) {
                                i111 = 2;
                            } else if (iOrdinal3 == 2) {
                                i111 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i111);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar22.e(null);
        }
        v vVar9 = v.f1790d;
        n nVar23 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.getMaxZoomLevel", vVar, obj, false);
        if (z2 != null) {
            final int i25 = 5;
            nVar23.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i110 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i110 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i110;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i110 = 6;
                    int i111 = 4;
                    int i112 = 3;
                    int i113 = 2;
                    int i114 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i115 = 0;
                    switch (i25) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i114, sVar, aVarA), new G1.a(i110, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i115);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i113 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i113);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i110);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i112, sVar4), new G1.a(i111, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i115));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i111 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i111 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i111 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i111;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i114);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i113);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i111 = 1;
                            } else if (iOrdinal3 == 1) {
                                i111 = 2;
                            } else if (iOrdinal3 == 2) {
                                i111 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i111);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar23.e(null);
        }
        v vVar10 = v.f1790d;
        n nVar24 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.getMinZoomLevel", vVar, obj, false);
        if (z2 != null) {
            final int i26 = 6;
            nVar24.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i110 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i110 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i110;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i110 = 6;
                    int i111 = 4;
                    int i112 = 3;
                    int i113 = 2;
                    int i114 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i115 = 0;
                    switch (i26) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i114, sVar, aVarA), new G1.a(i110, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i115);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i113 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i113);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i110);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i112, sVar4), new G1.a(i111, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i115));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i111 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i111 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i111 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i111;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i114);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i113);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i111 = 1;
                            } else if (iOrdinal3 == 1) {
                                i111 = 2;
                            } else if (iOrdinal3 == 2) {
                                i111 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i111);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar24.e(null);
        }
        v vVar11 = v.f1790d;
        n nVar25 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.setZoomLevel", vVar, obj, false);
        if (z2 != null) {
            final int i27 = 7;
            nVar25.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i110 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i110 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i110;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i110 = 6;
                    int i111 = 4;
                    int i112 = 3;
                    int i113 = 2;
                    int i114 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i115 = 0;
                    switch (i27) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i114, sVar, aVarA), new G1.a(i110, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i115);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i113 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i113);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i110);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i112, sVar4), new G1.a(i111, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i115));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i111 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i111 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i111 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i111;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i114);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i113);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i111 = 1;
                            } else if (iOrdinal3 == 1) {
                                i111 = 2;
                            } else if (iOrdinal3 == 2) {
                                i111 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i111);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar25.e(null);
        }
        v vVar12 = v.f1790d;
        n nVar26 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.pausePreview", vVar, obj, false);
        if (z2 != null) {
            final int i28 = 8;
            nVar26.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i110 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i110 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i110;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i110 = 6;
                    int i111 = 4;
                    int i112 = 3;
                    int i113 = 2;
                    int i114 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i115 = 0;
                    switch (i28) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i114, sVar, aVarA), new G1.a(i110, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i115);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i113 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i113);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i110);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i112, sVar4), new G1.a(i111, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i115));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i111 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i111 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i111 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i111;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i114);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i113);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i111 = 1;
                            } else if (iOrdinal3 == 1) {
                                i111 = 2;
                            } else if (iOrdinal3 == 2) {
                                i111 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i111);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar26.e(null);
        }
        v vVar13 = v.f1790d;
        n nVar27 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.resumePreview", vVar, obj, false);
        if (z2 != null) {
            final int i29 = 9;
            nVar27.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i110 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i110 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i110;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i110 = 6;
                    int i111 = 4;
                    int i112 = 3;
                    int i113 = 2;
                    int i114 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i115 = 0;
                    switch (i29) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i114, sVar, aVarA), new G1.a(i110, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i115);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i113 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i113);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i110);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i112, sVar4), new G1.a(i111, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i115));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i111 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i111 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i111 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i111;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i114);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i113);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i111 = 1;
                            } else if (iOrdinal3 == 1) {
                                i111 = 2;
                            } else if (iOrdinal3 == 2) {
                                i111 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i111);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        } else {
            nVar27.e(null);
        }
        v vVar14 = v.f1790d;
        n nVar28 = new n(fVar, "dev.flutter.pigeon.camera_android.CameraApi.setDescriptionWhileRecording", vVar, obj, false);
        if (z2 == null) {
            nVar28.e(null);
        } else {
            final int i30 = 10;
            nVar28.e(new S1.b() { // from class: W1.r
                private final void a(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    A a3 = (A) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 3);
                    Z0 z3 = z2;
                    z3.getClass();
                    int iOrdinal = a3.ordinal();
                    int i110 = 1;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw new IllegalStateException("Unreachable code");
                        }
                        i110 = 2;
                    }
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        Z1.a aVar = (Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK");
                        aVar.f1953b = i110;
                        aVar.a(c0098f.f1754s);
                        c0098f.h(new M1.c(6, sVar), new G1.a(7, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void b(Object obj2, A0.g gVar) {
                    ArrayList arrayList = new ArrayList();
                    F f3 = (F) ((ArrayList) obj2).get(0);
                    s sVar = new s(arrayList, gVar, 4);
                    Z0 z3 = z2;
                    z3.getClass();
                    try {
                        C0098f c0098f = (C0098f) z3.f5136j;
                        C0104l c0104l = null;
                        C0104l c0104l2 = f3 == null ? null : new C0104l(f3.f1700a, f3.f1701b);
                        p007b2.a aVarB = c0098f.f1737a.b();
                        if (c0104l2 != null && ((Double) c0104l2.e) != null && ((Double) c0104l2.f1774d) != null) {
                            c0104l = c0104l2;
                        }
                        aVarB.f2558c = c0104l;
                        aVarB.b();
                        aVarB.a(c0098f.f1754s);
                        c0098f.h(new M1.c(2, sVar), new G1.a(3, sVar));
                    } catch (Exception e) {
                        Z0.e(e, sVar);
                    }
                }

                private final void c(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getLower()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                private final void e(Object obj2, A0.g gVar) {
                    Z0 z3 = z2;
                    ArrayList arrayList = new ArrayList();
                    try {
                        p003a2.a aVarA = ((C0098f) z3.f5136j).f1737a.a();
                        Range range = (Range) ((CameraCharacteristics) aVarA.f1809a.e).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                        arrayList.add(0, Double.valueOf(aVarA.b() * (range == null ? 0.0d : ((Integer) range.getUpper()).intValue())));
                    } catch (Throwable th) {
                        arrayList = p013d1.D.b(th);
                    }
                    gVar.e(arrayList);
                }

                @Override // S1.b
                public final void d(Object obj2, A0.g gVar) {
                    List listA;
                    int i110 = 6;
                    int i111 = 4;
                    int i112 = 3;
                    int i113 = 2;
                    int i114 = 1;
                    C0104l c0104l = null;
                    Z0 z3 = z2;
                    int i115 = 0;
                    switch (i30) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            ArrayList arrayList = new ArrayList();
                            try {
                                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) z3.f5131d;
                                if (abstractActivityC0028d == null) {
                                    listA = Collections.emptyList();
                                } else {
                                    try {
                                        listA = p013d1.C.a(abstractActivityC0028d);
                                    } catch (CameraAccessException e) {
                                        throw new RuntimeException(e);
                                    }
                                }
                                arrayList.add(0, listA);
                                break;
                            } catch (Throwable th) {
                                arrayList = p013d1.D.b(th);
                            }
                            gVar.e(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            Double d3 = (Double) ((ArrayList) obj2).get(0);
                            s sVar = new s(arrayList2, gVar, 5);
                            z3.getClass();
                            try {
                                C0098f c0098f = (C0098f) z3.f5136j;
                                double dDoubleValue = d3.doubleValue();
                                p003a2.a aVarA = c0098f.f1737a.a();
                                aVarA.f1959b = dDoubleValue / aVarA.b();
                                aVarA.a(c0098f.f1754s);
                                c0098f.h(new W.g(i114, sVar, aVarA), new G1.a(i110, sVar));
                                return;
                            } catch (Exception e3) {
                                Z0.d(e3, sVar);
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = (ArrayList) obj2;
                            String str = (String) arrayList4.get(0);
                            E e4 = (E) arrayList4.get(1);
                            s sVar2 = new s(arrayList3, gVar, i115);
                            C0098f c0098f2 = (C0098f) z3.f5136j;
                            if (c0098f2 != null) {
                                c0098f2.a();
                            }
                            boolean zBooleanValue = e4.e.booleanValue();
                            C0099g c0099g = new C0099g(z3, sVar2, str, e4);
                            C0102j c0102j = (C0102j) z3.f5132f;
                            if (c0102j.f1772a) {
                                c0099g.a("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once.");
                                return;
                            }
                            AbstractActivityC0028d abstractActivityC0028d2 = (AbstractActivityC0028d) z3.f5131d;
                            if (AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.CAMERA") == 0 && (!zBooleanValue || AbstractC0419b3.a(abstractActivityC0028d2, "android.permission.RECORD_AUDIO") == 0)) {
                                c0099g.a(null, null);
                                return;
                            }
                            ((HashSet) ((E0.k) ((G1.a) z3.f5133g).e).e).add(new C0101i(new E1.a(c0102j, c0099g)));
                            c0102j.f1772a = true;
                            AbstractC0419b3.b(abstractActivityC0028d2, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            ArrayList arrayList5 = new ArrayList();
                            C c3 = (C) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f3 = (C0098f) z3.f5136j;
                                int iOrdinal = c3.ordinal();
                                if (iOrdinal == 0) {
                                    i113 = 1;
                                } else if (iOrdinal != 1) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f3.l(i113);
                                arrayList5.add(0, null);
                            } catch (Throwable th2) {
                                arrayList5 = p013d1.D.b(th2);
                            }
                            gVar.e(arrayList5);
                            return;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            ArrayList arrayList6 = new ArrayList();
                            F f3 = (F) ((ArrayList) obj2).get(0);
                            s sVar3 = new s(arrayList6, gVar, i110);
                            z3.getClass();
                            try {
                                C0098f c0098f4 = (C0098f) z3.f5136j;
                                if (f3 != null) {
                                    c0104l = new C0104l(f3.f1700a, f3.f1701b);
                                }
                                c0098f4.m(sVar3, c0104l);
                                return;
                            } catch (Exception e5) {
                                Z0.e(e5, sVar3);
                                return;
                            }
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            ArrayList arrayList7 = new ArrayList();
                            try {
                                arrayList7.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().f4607f.floatValue()));
                                break;
                            } catch (Throwable th3) {
                                arrayList7 = p013d1.D.b(th3);
                            }
                            gVar.e(arrayList7);
                            return;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.f().e.floatValue()));
                                break;
                            } catch (Throwable th4) {
                                arrayList8 = p013d1.D.b(th4);
                            }
                            gVar.e(arrayList8);
                            return;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            ArrayList arrayList9 = new ArrayList();
                            Double d4 = (Double) ((ArrayList) obj2).get(0);
                            s sVar4 = new s(arrayList9, gVar, 7);
                            C0098f c0098f5 = (C0098f) z3.f5136j;
                            float fFloatValue = d4.floatValue();
                            p031i2.a aVarF = c0098f5.f1737a.f();
                            Float f4 = aVarF.f4607f;
                            float fFloatValue2 = f4.floatValue();
                            Float f5 = aVarF.e;
                            float fFloatValue3 = f5.floatValue();
                            if (fFloatValue > fFloatValue2 || fFloatValue < fFloatValue3) {
                                sVar4.c(new u("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", f5, f4), null));
                                return;
                            }
                            aVarF.f4606d = Float.valueOf(fFloatValue);
                            aVarF.a(c0098f5.f1754s);
                            c0098f5.h(new M1.c(i112, sVar4), new G1.a(i111, sVar4));
                            return;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f6 = (C0098f) z3.f5136j;
                                    if (!c0098f6.v) {
                                        c0098f6.v = true;
                                        CameraCaptureSession cameraCaptureSession = c0098f6.f1751p;
                                        if (cameraCaptureSession != null) {
                                            cameraCaptureSession.stopRepeating();
                                        }
                                    }
                                    arrayList10.add(0, null);
                                } catch (CameraAccessException e6) {
                                    throw new u("CameraAccessException", e6.getMessage(), null);
                                }
                                break;
                            } catch (Throwable th5) {
                                arrayList10 = p013d1.D.b(th5);
                            }
                            gVar.e(arrayList10);
                            return;
                        case 9:
                            ArrayList arrayList11 = new ArrayList();
                            try {
                                C0098f c0098f7 = (C0098f) z3.f5136j;
                                c0098f7.v = false;
                                c0098f7.h(null, new C0093a(c0098f7, i115));
                                arrayList11.add(0, null);
                                break;
                            } catch (Throwable th6) {
                                arrayList11 = p013d1.D.b(th6);
                            }
                            gVar.e(arrayList11);
                            return;
                        case 10:
                            ArrayList arrayList12 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj2).get(0);
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).j(new C0104l(str2, (CameraManager) ((AbstractActivityC0028d) z3.f5131d).getSystemService("camera")));
                                    arrayList12.add(0, null);
                                } catch (CameraAccessException e7) {
                                    throw new u("CameraAccessException", e7.getMessage(), null);
                                }
                            } catch (Throwable th7) {
                                arrayList12 = p013d1.D.b(th7);
                            }
                            gVar.e(arrayList12);
                            return;
                        case 11:
                            ArrayList arrayList13 = new ArrayList();
                            try {
                                C0098f c0098f8 = (C0098f) z3.f5136j;
                                if (c0098f8.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f8.f1755t.resume();
                                    } catch (IllegalStateException e8) {
                                        throw new u("videoRecordingFailed", e8.getMessage(), null);
                                    }
                                }
                                arrayList13.add(0, null);
                            } catch (Throwable th8) {
                                arrayList13 = p013d1.D.b(th8);
                            }
                            gVar.e(arrayList13);
                            return;
                        case 12:
                            ArrayList arrayList14 = new ArrayList();
                            try {
                                z3.f((D) ((ArrayList) obj2).get(0));
                                arrayList14.add(0, null);
                                break;
                            } catch (Throwable th9) {
                                arrayList14 = p013d1.D.b(th9);
                            }
                            gVar.e(arrayList14);
                            return;
                        case 13:
                            ArrayList arrayList15 = new ArrayList();
                            try {
                                C0098f c0098f9 = (C0098f) z3.f5136j;
                                if (c0098f9 != null) {
                                    Log.i("Camera", "dispose");
                                    c0098f9.a();
                                    c0098f9.e.release();
                                    p027h2.b bVar = c0098f9.f1737a.e().f4524c;
                                    p027h2.a aVar = bVar.f4522f;
                                    if (aVar != null) {
                                        bVar.f4518a.unregisterReceiver(aVar);
                                        bVar.f4522f = null;
                                    }
                                }
                                arrayList15.add(0, null);
                                break;
                            } catch (Throwable th10) {
                                arrayList15 = p013d1.D.b(th10);
                            }
                            gVar.e(arrayList15);
                            return;
                        case 14:
                            ArrayList arrayList16 = new ArrayList();
                            z zVar = (z) ((ArrayList) obj2).get(0);
                            try {
                                C0098f c0098f10 = (C0098f) z3.f5136j;
                                int iOrdinal2 = zVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i111 = 1;
                                } else if (iOrdinal2 == 1) {
                                    i111 = 2;
                                } else if (iOrdinal2 == 2) {
                                    i111 = 3;
                                } else if (iOrdinal2 != 3) {
                                    throw new IllegalStateException("Unreachable code");
                                }
                                c0098f10.f1737a.e().f4525d = i111;
                                arrayList16.add(0, null);
                            } catch (Throwable th11) {
                                arrayList16 = p013d1.D.b(th11);
                            }
                            gVar.e(arrayList16);
                            return;
                        case 15:
                            ArrayList arrayList17 = new ArrayList();
                            try {
                                ((C0098f) z3.f5136j).f1737a.e().f4525d = 0;
                                arrayList17.add(0, null);
                                break;
                            } catch (Throwable th12) {
                                arrayList17 = p013d1.D.b(th12);
                            }
                            gVar.e(arrayList17);
                            return;
                        case 16:
                            s sVar5 = new s(new ArrayList(), gVar, i114);
                            C0098f c0098f11 = (C0098f) z3.f5136j;
                            C0100h c0100h = c0098f11.f1747l;
                            if (c0100h.f1766b != 1) {
                                sVar5.c(new u("captureAlreadyActive", "Picture is currently already being captured", null));
                                return;
                            }
                            c0098f11.f1760z = sVar5;
                            try {
                                c0098f11.f1757w = File.createTempFile("CAP", ".jpg", c0098f11.f1742g.getCacheDir());
                                C0104l c0104l2 = c0098f11.f1758x;
                                c0104l2.getClass();
                                c0104l2.e = new p037k2.a();
                                c0104l2.f1774d = new p037k2.a();
                                c0098f11.f1752q.setOnImageAvailableListener(c0098f11, c0098f11.f1748m);
                                Y1.a aVar2 = (Y1.a) c0098f11.f1737a.f5762d.get("AUTO_FOCUS");
                                if (!aVar2.b() || aVar2.f1935b != 1) {
                                    c0098f11.i();
                                    return;
                                }
                                Log.i("Camera", "runPictureAutoFocus");
                                c0100h.f1766b = 2;
                                c0098f11.d();
                                return;
                            } catch (IOException | SecurityException e9) {
                                c0098f11.f1743h.z(c0098f11.f1760z, "cannotCreateFile", e9.getMessage());
                                return;
                            }
                        case 17:
                            ArrayList arrayList18 = new ArrayList();
                            try {
                                z3.h((Boolean) ((ArrayList) obj2).get(0));
                                arrayList18.add(0, null);
                                break;
                            } catch (Throwable th13) {
                                arrayList18 = p013d1.D.b(th13);
                            }
                            gVar.e(arrayList18);
                            return;
                        case 18:
                            ArrayList arrayList19 = new ArrayList();
                            try {
                                arrayList19.add(0, z3.j());
                                break;
                            } catch (Throwable th14) {
                                arrayList19 = p013d1.D.b(th14);
                            }
                            gVar.e(arrayList19);
                            return;
                        case 19:
                            ArrayList arrayList20 = new ArrayList();
                            try {
                                C0098f c0098f12 = (C0098f) z3.f5136j;
                                if (c0098f12.f1756u) {
                                    try {
                                        if (J.f1705a < 24) {
                                            i114 = 0;
                                        }
                                        if (i114 == 0) {
                                            throw new u("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
                                        }
                                        c0098f12.f1755t.pause();
                                    } catch (IllegalStateException e10) {
                                        throw new u("videoRecordingFailed", e10.getMessage(), null);
                                    }
                                }
                                arrayList20.add(0, null);
                            } catch (Throwable th15) {
                                arrayList20 = p013d1.D.b(th15);
                            }
                            gVar.e(arrayList20);
                            return;
                        case 20:
                            ArrayList arrayList21 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    C0098f c0098f13 = (C0098f) z3.f5136j;
                                    D0.b bVar2 = (D0.b) z3.f5135i;
                                    c0098f13.getClass();
                                    bVar2.R(new C0006g(27, c0098f13));
                                    c0098f13.o(false, true);
                                    Log.i("Camera", "startPreviewWithImageStream");
                                    arrayList21.add(0, null);
                                    gVar.e(arrayList21);
                                    return;
                                } catch (CameraAccessException e11) {
                                    throw new u("CameraAccessException", e11.getMessage(), null);
                                }
                            } catch (Throwable th16) {
                                arrayList21 = p013d1.D.b(th16);
                            }
                            break;
                        case 21:
                            ArrayList arrayList22 = new ArrayList();
                            try {
                                z3.getClass();
                                try {
                                    ((C0098f) z3.f5136j).p(null);
                                    arrayList22.add(0, null);
                                } catch (Exception e12) {
                                    throw new u(e12.getClass().getName(), e12.getMessage(), null);
                                }
                            } catch (Throwable th17) {
                                arrayList22 = p013d1.D.b(th17);
                            }
                            gVar.e(arrayList22);
                            return;
                        case 22:
                            ArrayList arrayList23 = new ArrayList();
                            B b3 = (B) ((ArrayList) obj2).get(0);
                            s sVar6 = new s(arrayList23, gVar, i113);
                            z3.getClass();
                            int iOrdinal3 = b3.ordinal();
                            if (iOrdinal3 == 0) {
                                i111 = 1;
                            } else if (iOrdinal3 == 1) {
                                i111 = 2;
                            } else if (iOrdinal3 == 2) {
                                i111 = 3;
                            } else if (iOrdinal3 != 3) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            try {
                                ((C0098f) z3.f5136j).k(sVar6, i111);
                                return;
                            } catch (Exception e13) {
                                Z0.e(e13, sVar6);
                                return;
                            }
                        case 23:
                            a(obj2, gVar);
                            return;
                        case 24:
                            b(obj2, gVar);
                            return;
                        case 25:
                            c(obj2, gVar);
                            return;
                        case 26:
                            e(obj2, gVar);
                            return;
                        default:
                            ArrayList arrayList24 = new ArrayList();
                            try {
                                arrayList24.add(0, Double.valueOf(((C0098f) z3.f5136j).f1737a.a().b()));
                                break;
                            } catch (Throwable th18) {
                                arrayList24 = p013d1.D.b(th18);
                            }
                            gVar.e(arrayList24);
                            return;
                    }
                }
            });
        }
    }
}
