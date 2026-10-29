package W;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p009c1.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p047o.h f1678a = new p047o.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f1679b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static v f1680c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? l.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static v b() {
        v vVar = new v();
        f1680c = vVar;
        p047o.h hVar = f1678a;
        hVar.getClass();
        if (p047o.g.f5525f.b(hVar, null, vVar)) {
            p047o.g.b(hVar);
        }
        return f1680c;
    }

    public static void c(Context context, boolean z2) {
        m mVarA;
        int i3;
        if (z2 || f1680c == null) {
            synchronized (f1679b) {
                if (!z2) {
                    try {
                        if (f1680c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 28 && i4 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i5 = 0;
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                mVarA = m.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            mVarA = null;
                        }
                        if (mVarA != null && mVarA.f1676c == jA && (i3 = mVarA.f1675b) != 2) {
                            i5 = i3;
                        } else if (z3) {
                            i5 = 1;
                        } else if (z4) {
                            i5 = 2;
                        }
                        if (z2 && z4 && i5 != 1) {
                            i5 = 2;
                        }
                        m mVar = new m(1, (mVarA == null || mVarA.f1675b != 2 || i5 != 1 || length >= mVarA.f1677d) ? i5 : 3, jA, length2);
                        if (mVarA == null || !mVarA.equals(mVar)) {
                            try {
                                mVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
