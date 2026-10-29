package M1;

import E0.n;
import L0.g;
import M.k;
import O.p;
import W1.C0098f;
import W1.C0104l;
import W1.s;
import W1.t;
import W1.v;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.lifecycle.z;
import io.flutter.plugin.platform.i;
import java.nio.MappedByteBuffer;
import k.C0757u;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0493o;
import p013d1.AbstractC0499p;
import p013d1.AbstractC0503p3;
import p072x.j;
import p075y.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f983d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(int i3, Object obj) {
        this.f983d = i3;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f983d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((f) ((d) this.e).f986c).e.prefetchDefaultFontManager();
                return;
            case 1:
                p pVar = (p) this.e;
                synchronized (pVar.f1207d) {
                    try {
                        if (pVar.f1210h == null) {
                            return;
                        }
                        try {
                            h hVarD = pVar.d();
                            int i3 = hVarD.e;
                            if (i3 == 2) {
                                synchronized (pVar.f1207d) {
                                }
                            }
                            if (i3 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                            }
                            try {
                                int i4 = j.f5820a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                g gVar = pVar.f1206c;
                                Context context = pVar.f1204a;
                                gVar.getClass();
                                Typeface typefaceB = p064t.g.f5679a.b(context, new h[]{hVarD}, 0);
                                MappedByteBuffer mappedByteBufferE = AbstractC0503p3.e(pVar.f1204a, hVarD.f5852a);
                                if (mappedByteBufferE == null || typefaceB == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    n nVar = new n(typefaceB, AbstractC0499p.a(mappedByteBufferE));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (pVar.f1207d) {
                                        try {
                                            AbstractC0493o abstractC0493o = pVar.f1210h;
                                            if (abstractC0493o != null) {
                                                abstractC0493o.b(nVar);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    pVar.b();
                                    return;
                                } catch (Throwable th2) {
                                    int i5 = j.f5820a;
                                    Trace.endSection();
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                int i6 = j.f5820a;
                                Trace.endSection();
                                throw th3;
                            }
                            break;
                        } catch (Throwable th4) {
                            synchronized (pVar.f1207d) {
                                try {
                                    AbstractC0493o abstractC0493o2 = pVar.f1210h;
                                    if (abstractC0493o2 != null) {
                                        abstractC0493o2.a(th4);
                                    }
                                    pVar.b();
                                    return;
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            case 2:
                ((s) this.e).a();
                return;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                ((s) this.e).a();
                return;
            case k.LONG_FIELD_NUMBER /* 4 */:
                ((C0098f) this.e).f1755t.start();
                return;
            case k.STRING_FIELD_NUMBER /* 5 */:
                ((s) this.e).a();
                return;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((s) this.e).a();
                return;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((s) this.e).a();
                return;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                p065t0.e eVar = new p065t0.e();
                StringBuilder sb = new StringBuilder("dev.flutter.pigeon.camera_android.CameraEventApi.closed");
                C0104l c0104l = (C0104l) ((D0.b) this.e).f183g;
                sb.append((String) c0104l.f1774d);
                String string = sb.toString();
                new n((S1.f) c0104l.e, string, v.f1790d, null, false).d(null, new t(eVar, string, 2));
                return;
            case 9:
                z zVar = (z) this.e;
                B2.h.e(zVar, "this$0");
                int i7 = zVar.e;
                androidx.lifecycle.s sVar = zVar.f2413i;
                if (i7 == 0) {
                    zVar.f2410f = true;
                    sVar.e(androidx.lifecycle.j.ON_PAUSE);
                }
                if (zVar.f2409d == 0 && zVar.f2410f) {
                    sVar.e(androidx.lifecycle.j.ON_STOP);
                    zVar.f2411g = true;
                    return;
                }
                return;
            case 10:
                ((i) this.e).f(false);
                return;
            default:
                ((C0757u) this.e).getClass();
                return;
        }
    }
}
