package p029i0;

import B2.h;
import B2.q;
import android.content.Context;
import j0.a;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import p039l0.i;
import p039l0.k;
import p055q2.e;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f4578a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f4579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4580c;

    static {
        q.a(h.class).b();
        f4579b = new e(f.e);
        f4580c = a.f4562a;
    }

    public static b a(Context context) {
        h.e(context, "context");
        a aVar = (a) f4579b.a();
        if (aVar == null) {
            k kVar = k.f5296c;
            if (k.f5296c == null) {
                ReentrantLock reentrantLock = k.f5297d;
                reentrantLock.lock();
                try {
                    if (k.f5296c == null) {
                        i iVar = null;
                        try {
                            p019f0.i iVarC = p039l0.g.c();
                            if (iVarC != null) {
                                p019f0.i iVar2 = p019f0.i.f4466i;
                                h.e(iVar2, "other");
                                Object objA = iVarC.f4470h.a();
                                h.d(objA, "<get-bigInteger>(...)");
                                Object objA2 = iVar2.f4470h.a();
                                h.d(objA2, "<get-bigInteger>(...)");
                                if (((BigInteger) objA).compareTo((BigInteger) objA2) >= 0) {
                                    i iVar3 = new i(context);
                                    if (iVar3.i()) {
                                        iVar = iVar3;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        k.f5296c = new k(iVar);
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            aVar = k.f5296c;
            h.b(aVar);
        }
        int i3 = n.f4591b;
        b bVar = new b(aVar);
        f4580c.getClass();
        return bVar;
    }
}
