package p064t;

import D0.a;
import D0.d;
import E0.l;
import W1.C0104l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.y;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k.C0757u;
import p013d1.AbstractC0497o3;
import p045n.f;
import p060s.e;
import p060s.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0497o3 f5679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f5680b;

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            f5679a = new l();
        } else if (i3 >= 28) {
            f5679a = new k();
        } else if (i3 >= 26) {
            f5679a = new j();
        } else if (i3 < 24) {
            f5679a = new h();
        } else {
            Method method = i.f5687c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f5679a = new i();
            } else {
                f5679a = new h();
            }
        }
        f5680b = new f(16);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    public static Typeface a(Context context, e eVar, Resources resources, int i3, String str, int i4, int i5, C0757u c0757u) {
        Typeface typefaceA;
        Typeface typefaceCreate;
        Typeface typeface;
        int i6 = 17;
        int i7 = 1;
        int i8 = 7;
        int i9 = 0;
        if (eVar instanceof h) {
            h hVar = (h) eVar;
            String str2 = hVar.f5646d;
            typefaceA = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                    typefaceCreate = null;
                }
            }
            if (typefaceCreate != null) {
                new Handler(Looper.getMainLooper()).post(new W.g(i8, c0757u, typefaceCreate));
                return typefaceCreate;
            }
            boolean z2 = hVar.f5645c == 0;
            int i10 = hVar.f5644b;
            Handler handler = new Handler(Looper.getMainLooper());
            y yVar = new y(16);
            yVar.e = c0757u;
            d dVar = hVar.f5643a;
            C0104l c0104l = new C0104l(yVar, handler);
            if (z2) {
                f fVar = p075y.g.f5848a;
                String str3 = ((String) dVar.f193i) + "-" + i5;
                typeface = (Typeface) p075y.g.f5848a.a(str3);
                if (typeface != null) {
                    handler.post(new E0.e(i6, yVar, typeface));
                    typefaceA = typeface;
                } else if (i10 == -1) {
                    p075y.f fVarA = p075y.g.a(str3, context, dVar, i5);
                    c0104l.e(fVarA);
                    typefaceA = fVarA.f5846a;
                } else {
                    try {
                        try {
                            try {
                                p075y.f fVar2 = (p075y.f) p075y.g.f5849b.submit(new p075y.d(str3, context, dVar, i5, 0)).get(i10, TimeUnit.MILLISECONDS);
                                c0104l.e(fVar2);
                                typefaceA = fVar2.f5846a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) c0104l.f1774d).post(new l((y) c0104l.e, -3));
                    }
                }
            } else {
                f fVar3 = p075y.g.f5848a;
                String str4 = ((String) dVar.f193i) + "-" + i5;
                typeface = (Typeface) p075y.g.f5848a.a(str4);
                if (typeface != null) {
                    handler.post(new E0.e(i6, yVar, typeface));
                    typefaceA = typeface;
                } else {
                    p075y.e eVar2 = new p075y.e(i9, c0104l);
                    synchronized (p075y.g.f5850c) {
                        try {
                            p045n.l lVar = p075y.g.f5851d;
                            ArrayList arrayList = (ArrayList) lVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(eVar2);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(eVar2);
                                lVar.put(str4, arrayList2);
                                p075y.d dVar2 = new p075y.d(str4, context, dVar, i5, 1);
                                ThreadPoolExecutor threadPoolExecutor = p075y.g.f5849b;
                                p075y.e eVar3 = new p075y.e(i7, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                a aVar = new a();
                                aVar.e = dVar2;
                                aVar.f178f = eVar3;
                                aVar.f179g = handler2;
                                threadPoolExecutor.execute(aVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            typefaceA = f5679a.a(context, (p060s.f) eVar, resources, i5);
            if (typefaceA != null) {
                new Handler(Looper.getMainLooper()).post(new W.g(i8, c0757u, typefaceA));
            } else {
                c0757u.a();
            }
        }
        if (typefaceA != null) {
            f5680b.b(b(resources, i3, str, i4, i5), typefaceA);
        }
        return typefaceA;
    }

    public static String b(Resources resources, int i3, String str, int i4, int i5) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i4 + '-' + i3 + '-' + i5;
    }
}
