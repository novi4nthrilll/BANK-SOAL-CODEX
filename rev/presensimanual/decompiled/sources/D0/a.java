package D0;

import A0.f;
import A0.i;
import O0.C0092f;
import W.g;
import W1.C0098f;
import W1.C0104l;
import android.content.res.Resources;
import android.media.Image;
import android.os.Handler;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0198e7;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.Logger;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0544w3;
import p013d1.C0474k4;
import p013d1.EnumC0461i3;
import p013d1.K4;
import p013d1.Q4;
import p013d1.R0;
import p013d1.S4;
import p013d1.U4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f177d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f179g;

    public /* synthetic */ a() {
        this.f177d = 3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0048  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        String str;
        U4 u4;
        FileOutputStream fileOutputStream2 = null;
        Object objCall = null;
        fileOutputStream2 = null;
        int i3 = 0;
        switch (this.f177d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                c cVar = (c) this.e;
                p079z0.b bVar = (p079z0.b) this.f178f;
                String str2 = bVar.f5936a;
                p079z0.a aVar = (p079z0.a) this.f179g;
                Logger logger = c.f184f;
                try {
                    i iVarA = cVar.f187c.a(str2);
                    if (iVarA == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        new IllegalArgumentException(str3);
                    } else {
                        ((F0.i) cVar.e).d(new b(cVar, bVar, ((p073x0.d) iVarA).a(aVar), i3));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 1:
                File file = (File) this.f178f;
                C0098f c0098f = (C0098f) ((f) this.f179g).e;
                Image image = (Image) this.e;
                ByteBuffer buffer = image.getPlanes()[0].getBuffer();
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            fileOutputStream.write(bArr);
                            ((Handler) c0098f.f1743h.e).post(new g(3, c0098f.f1760z, file.getAbsolutePath()));
                            image.close();
                            try {
                                fileOutputStream.close();
                                return;
                            } catch (IOException e3) {
                                e = e3;
                                c0098f.f1743h.z(c0098f.f1760z, "cameraAccess", e.getMessage());
                                return;
                            }
                        } catch (IOException unused) {
                            fileOutputStream2 = fileOutputStream;
                            c0098f.f1743h.z(c0098f.f1760z, "IOError", "Failed saving image");
                            image.close();
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                    return;
                                } catch (IOException e4) {
                                    e = e4;
                                    c0098f.f1743h.z(c0098f.f1760z, "cameraAccess", e.getMessage());
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            image.close();
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e5) {
                                    c0098f.f1743h.z(c0098f.f1760z, "cameraAccess", e5.getMessage());
                                }
                                break;
                            }
                            throw th;
                        }
                    } catch (IOException unused2) {
                    }
                } catch (Throwable th3) {
                    fileOutputStream = fileOutputStream2;
                    th = th3;
                }
                break;
            case 2:
                K4 k4 = (K4) this.e;
                C0104l c0104l = (C0104l) this.f178f;
                EnumC0461i3 enumC0461i3 = EnumC0461i3.INPUT_IMAGE_CONSTRUCTION;
                String str4 = (String) this.f179g;
                b bVar2 = (b) c0104l.e;
                bVar2.f182f = enumC0461i3;
                C0474k4 c0474k4 = (C0474k4) bVar2.e;
                if (c0474k4 != null) {
                    int i4 = R0.f3636a;
                    str = c0474k4.f3845d;
                    if (str == null || str.isEmpty()) {
                        str = "NA";
                    }
                } else {
                    str = "NA";
                }
                C0198e7 c0198e7 = new C0198e7();
                c0198e7.f3039a = k4.f3598a;
                c0198e7.f3040b = k4.f3599b;
                synchronized (K4.class) {
                    u4 = K4.f3596j;
                    if (u4 == null) {
                        p072x.e eVarA = AbstractC0544w3.a(Resources.getSystem().getConfiguration());
                        Object[] objArrCopyOf = new Object[4];
                        int i5 = 0;
                        while (i3 < eVarA.f5816a.size()) {
                            Locale locale = eVarA.f5816a.get(i3);
                            C0092f c0092f = p071w1.c.f5780a;
                            String languageTag = locale.toLanguageTag();
                            languageTag.getClass();
                            int i6 = i5 + 1;
                            int length = objArrCopyOf.length;
                            if (length < i6) {
                                int i7 = length + (length >> 1) + 1;
                                if (i7 < i6) {
                                    int iHighestOneBit = Integer.highestOneBit(i5);
                                    i7 = iHighestOneBit + iHighestOneBit;
                                }
                                if (i7 < 0) {
                                    i7 = Integer.MAX_VALUE;
                                }
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i7);
                            }
                            objArrCopyOf[i5] = languageTag;
                            i3++;
                            i5 = i6;
                        }
                        Q4 q4 = S4.e;
                        u4 = i5 == 0 ? U4.f3650h : new U4(i5, objArrCopyOf);
                        K4.f3596j = u4;
                    }
                }
                c0198e7.f3048k = u4;
                c0198e7.f3044g = Boolean.TRUE;
                c0198e7.f3042d = str;
                c0198e7.f3041c = str4;
                c0198e7.e = k4.f3602f.f() ? (String) k4.f3602f.d() : k4.f3601d.a();
                c0198e7.f3046i = 10;
                c0198e7.f3047j = Integer.valueOf(k4.f3604h);
                c0104l.f1774d = c0198e7;
                k4.f3600c.a(c0104l);
                return;
            default:
                try {
                    objCall = ((p075y.d) this.e).call();
                    break;
                } catch (Exception unused3) {
                }
                ((Handler) this.f179g).post(new E0.e(18, (p075y.e) this.f178f, objCall));
                return;
        }
    }

    public /* synthetic */ a(K4 k4, C0104l c0104l, String str) {
        this.f177d = 2;
        this.e = k4;
        this.f178f = c0104l;
        this.f179g = str;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i3) {
        this.f177d = i3;
        this.e = obj;
        this.f178f = obj2;
        this.f179g = obj3;
    }
}
