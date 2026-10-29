package M1;

import android.content.Context;
import android.os.Trace;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.F4;
import p013d1.G4;
import p013d1.O4;
import p013d1.P4;
import p013d1.Z2;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f984a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f986c;

    public /* synthetic */ d(C1.a aVar, p077y1.a aVar2) {
        this.f985b = aVar;
        this.f986c = aVar2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        G4 g4;
        Object obj = this.f985b;
        Object obj2 = this.f986c;
        int i3 = 0;
        switch (this.f984a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Context context = (Context) obj;
                f fVar = (f) obj2;
                o2.a.b("FlutterLoader initTask");
                try {
                    fVar.getClass();
                    FlutterJNI flutterJNI = fVar.e;
                    try {
                        flutterJNI.loadLibrary(context);
                        flutterJNI.updateRefreshRate();
                        fVar.f993f.execute(new c(i3, this));
                        File filesDir = context.getFilesDir();
                        if (filesDir == null) {
                            filesDir = new File(Z2.a(context), "files");
                        }
                        String path = filesDir.getPath();
                        File codeCacheDir = context.getCodeCacheDir();
                        if (codeCacheDir == null) {
                            codeCacheDir = context.getCacheDir();
                        }
                        if (codeCacheDir == null) {
                            codeCacheDir = new File(Z2.a(context), "cache");
                        }
                        String path2 = codeCacheDir.getPath();
                        File dir = context.getDir("flutter", 0);
                        if (dir == null) {
                            dir = new File(Z2.a(context), "app_flutter");
                        }
                        dir.getPath();
                        e eVar = new e(path, path2);
                        Trace.endSection();
                        return eVar;
                    } catch (UnsatisfiedLinkError e) {
                        if (!e.toString().contains("couldn't find \"libflutter.so\"") && !e.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                            throw e;
                        }
                        String property = System.getProperty("os.arch");
                        File file = new File(fVar.f992d.f982d);
                        String[] list = file.list();
                        StringBuilder sb = new StringBuilder("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                        sb.append(property);
                        sb.append(", and the native libraries directory (with path ");
                        sb.append(file.getAbsolutePath());
                        sb.append(") ");
                        if (file.exists()) {
                            str = "contains the following files: " + Arrays.toString(list);
                        } else {
                            str = "does not exist.";
                        }
                        sb.append(str);
                        throw new UnsupportedOperationException(sb.toString(), e);
                    }
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                p077y1.a aVar = (p077y1.a) obj2;
                C1.a aVar2 = (C1.a) obj;
                HashMap map = G4.f3580i;
                P4.b();
                int i4 = O4.f3623a;
                P4.b();
                if (Boolean.parseBoolean("")) {
                    HashMap map2 = G4.f3580i;
                    if (map2.get("detectorTaskWithResource#run") == null) {
                        map2.put("detectorTaskWithResource#run", new G4("detectorTaskWithResource#run"));
                    }
                    g4 = (G4) map2.get("detectorTaskWithResource#run");
                } else {
                    g4 = F4.f3577j;
                }
                g4.a();
                try {
                    List listM = aVar2.e.m(aVar);
                    g4.close();
                    return listM;
                } catch (Throwable th3) {
                    try {
                        g4.close();
                        break;
                    } catch (Throwable th4) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    throw th3;
                }
        }
    }

    public d(f fVar, Context context) {
        this.f986c = fVar;
        this.f985b = context;
    }
}
