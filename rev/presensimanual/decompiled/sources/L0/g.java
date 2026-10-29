package L0;

import B.C0006g;
import O0.u;
import Y.C0112g;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p032j.o;
import p040l1.s;

/* JADX INFO: loaded from: classes.dex */
public final class g implements B0.b, Y0.d, o, p040l1.c {
    public static g e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f876d;

    public /* synthetic */ g(int i3) {
        this.f876d = i3;
    }

    public static void d(Context context) {
        u.f(context);
        synchronized (g.class) {
            try {
                if (e == null) {
                    n.a(context);
                    g gVar = new g(0);
                    context.getApplicationContext();
                    e = gVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final k e(PackageInfo packageInfo, k... kVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            l lVar = new l(packageInfo.signatures[0].toByteArray());
            for (int i3 = 0; i3 < kVarArr.length; i3++) {
                if (kVarArr[i3].equals(lVar)) {
                    return kVarArr[i3];
                }
            }
        }
        return null;
    }

    public static final boolean f(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z2;
        if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z2 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            } else {
                z2 = true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
            z2 = true;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z2 ? e(packageInfo2, m.f883a) : e(packageInfo2, m.f883a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p032j.o
    public boolean b(p032j.i iVar) {
        return false;
    }

    @Override // Y0.d
    public C0112g c(Context context, String str, Y0.c cVar) {
        C0112g c0112g = new C0112g();
        int iA = cVar.a(context, str);
        c0112g.f1881a = iA;
        if (iA != 0) {
            c0112g.f1883c = -1;
        } else {
            int iB = cVar.b(context, str, true);
            c0112g.f1882b = iB;
            if (iB != 0) {
                c0112g.f1883c = 1;
            }
        }
        return c0112g;
    }

    @Override // p053p2.a
    public Object get() {
        p065t0.e eVar = new p065t0.e();
        HashMap map = new HashMap();
        p070w0.c cVar = p070w0.c.f5774d;
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(cVar, new E0.c(30000L, 86400000L, setEmptySet));
        p070w0.c cVar2 = p070w0.c.f5775f;
        Set setEmptySet2 = Collections.emptySet();
        if (setEmptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(cVar2, new E0.c(1000L, 86400000L, setEmptySet2));
        p070w0.c cVar3 = p070w0.c.e;
        if (Collections.emptySet() == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(E0.f.f206d, E0.f.e)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(cVar3, new E0.c(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < p070w0.c.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new E0.b(eVar, map);
    }

    @Override // p040l1.c
    public Object h(s sVar) {
        switch (this.f876d) {
            case 10:
                return new p071w1.g();
            default:
                return new p068v1.b(sVar.b(p067u1.a.class));
        }
    }

    public g(K1.b bVar) {
        this.f876d = 4;
        new E0.n(bVar, "flutter/deferredcomponent", S1.s.f1597a, null, false).f(new C0006g(14, this));
        D0.b.J().getClass();
        new HashMap();
    }

    public g(RecyclerView recyclerView) {
        this.f876d = 7;
    }

    @Override // p032j.o
    public void a(p032j.i iVar, boolean z2) {
    }
}
