package p075y;

import A.c;
import D0.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p045n.f;
import p045n.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f5848a = new f(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f5849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f5850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f5851d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, ModuleDescriptor.MODULE_VERSION, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f5849b = threadPoolExecutor;
        f5850c = new Object();
        f5851d = new l();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[EDGE_INSN: B:10:0x0020->B:24:0x003d BREAK  A[LOOP:0: B:17:0x002d->B:23:0x003a]] */
    public static f a(String str, Context context, d dVar, int i3) {
        f fVar = f5848a;
        Typeface typeface = (Typeface) fVar.a(str);
        if (typeface != null) {
            return new f(typeface);
        }
        try {
            c cVarA = c.a(context, dVar);
            int i4 = 1;
            h[] hVarArr = (h[]) cVarA.f3b;
            int i5 = cVarA.f2a;
            if (i5 != 0) {
                if (i5 != 1) {
                    i4 = -3;
                    break;
                }
                i4 = -2;
            } else if (hVarArr != null && hVarArr.length != 0) {
                i4 = 0;
                for (h hVar : hVarArr) {
                    int i6 = hVar.e;
                    if (i6 != 0) {
                        if (i6 >= 0) {
                            i4 = i6;
                            break;
                        }
                        i4 = -3;
                        break;
                    }
                }
            }
            if (i4 != 0) {
                return new f(i4);
            }
            Typeface typefaceB = p064t.g.f5679a.b(context, hVarArr, i3);
            if (typefaceB == null) {
                return new f(-3);
            }
            fVar.b(str, typefaceB);
            return new f(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new f(-1);
        }
    }
}
