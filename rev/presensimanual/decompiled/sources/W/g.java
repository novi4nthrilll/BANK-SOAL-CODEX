package W;

import W1.C0094b;
import W1.C0098f;
import W1.C0104l;
import W1.s;
import W1.t;
import W1.v;
import android.content.Context;
import android.graphics.Typeface;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import k.C0757u;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1670d;
    public final /* synthetic */ Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1671f;

    public /* synthetic */ g(int i3, Object obj, Object obj2) {
        this.f1670d = i3;
        this.e = obj;
        this.f1671f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f1670d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((ProfileInstallerInitializer) this.e).getClass();
                (Build.VERSION.SDK_INT >= 28 ? k.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h((Context) this.f1671f, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 1:
                ((s) this.e).b(Double.valueOf(((p003a2.a) this.f1671f).f1959b));
                break;
            case 2:
                C0098f c0098f = ((C0094b) this.e).f1731b;
                final D0.b bVar = c0098f.f1743h;
                p024g2.a aVar = (p024g2.a) this.f1671f;
                final Integer numValueOf = Integer.valueOf(aVar.f4510c.getWidth());
                final Integer numValueOf2 = Integer.valueOf(aVar.f4510c.getHeight());
                final int i3 = ((Z1.a) c0098f.f1737a.f5762d.get("EXPOSURE_LOCK")).f1953b;
                final int i4 = ((Y1.a) c0098f.f1737a.f5762d.get("AUTO_FOCUS")).f1935b;
                Integer num = (Integer) ((CameraCharacteristics) c0098f.f1737a.b().f1809a.e).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                boolean z2 = false;
                final Boolean boolValueOf = Boolean.valueOf(num != null && num.intValue() > 0);
                Integer num2 = (Integer) ((CameraCharacteristics) c0098f.f1737a.c().f1809a.e).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                if (num2 != null && num2.intValue() > 0) {
                    z2 = true;
                }
                final Boolean boolValueOf2 = Boolean.valueOf(z2);
                ((Handler) bVar.e).post(new Runnable() { // from class: W1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.b bVar2 = bVar;
                        Double dValueOf = Double.valueOf(numValueOf.doubleValue());
                        Double dValueOf2 = Double.valueOf(numValueOf2.doubleValue());
                        H h3 = new H();
                        h3.f1703a = dValueOf;
                        h3.f1704b = dValueOf2;
                        int iB = M.j.b(i3);
                        A a3 = A.AUTO;
                        if (iB != 0 && iB == 1) {
                            a3 = A.LOCKED;
                        }
                        int iB2 = M.j.b(i4);
                        C c3 = C.AUTO;
                        if (iB2 != 0 && iB2 == 1) {
                            c3 = C.LOCKED;
                        }
                        y yVar = new y();
                        yVar.f1798a = h3;
                        yVar.f1799b = a3;
                        yVar.f1800c = c3;
                        yVar.f1801d = boolValueOf;
                        yVar.e = boolValueOf2;
                        p065t0.e eVar = new p065t0.e();
                        StringBuilder sb = new StringBuilder("dev.flutter.pigeon.camera_android.CameraEventApi.initialized");
                        C0104l c0104l = (C0104l) bVar2.f183g;
                        sb.append((String) c0104l.f1774d);
                        String string = sb.toString();
                        new E0.n((S1.f) c0104l.e, string, v.f1790d, null, false).d(new ArrayList(Collections.singletonList(yVar)), new t(eVar, string, 0));
                    }
                });
                break;
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((s) this.e).b((String) this.f1671f);
                break;
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                p065t0.e eVar = new p065t0.e();
                StringBuilder sb = new StringBuilder("dev.flutter.pigeon.camera_android.CameraEventApi.error");
                C0104l c0104l = (C0104l) ((D0.b) this.e).f183g;
                sb.append((String) c0104l.f1774d);
                String string = sb.toString();
                new E0.n((S1.f) c0104l.e, string, v.f1790d, null, false).d(new ArrayList(Collections.singletonList((String) this.f1671f)), new t(eVar, string, 1));
                break;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                ((S1.g) this.e).b((HashMap) this.f1671f);
                break;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((S1.g) this.e).a("IllegalStateException", "Caught IllegalStateException: " + ((IllegalStateException) this.f1671f).getMessage(), null);
                break;
            default:
                ((C0757u) this.e).b((Typeface) this.f1671f);
                break;
        }
    }
}
