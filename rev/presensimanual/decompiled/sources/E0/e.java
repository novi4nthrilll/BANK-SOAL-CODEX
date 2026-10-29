package E0;

import I2.AbstractC0052x;
import N0.D;
import N0.r;
import N0.t;
import O0.AbstractBinderC0087a;
import O0.F;
import O0.u;
import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import androidx.appcompat.widget.ActionMenuView;
import androidx.lifecycle.y;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C7;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k.C0728f;
import k.C0734i;
import k.C0757u;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p016e1.C0587e;
import p016e1.C0593f;
import p016e1.C0597f3;
import p016e1.C0605h;
import p016e1.C0623k;
import p016e1.EnumC0698w3;
import p016e1.EnumC0710y3;
import p016e1.S4;
import p016e1.X;
import p016e1.Y;
import p040l1.o;
import p040l1.p;
import p040l1.q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f204d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f205f;

    public /* synthetic */ e(int i3, Object obj, Object obj2) {
        this.f204d = i3;
        this.e = obj;
        this.f205f = obj2;
    }

    private final void a() {
        synchronized (((p033j1.h) this.f205f).f4995c) {
            try {
                p033j1.b bVar = (p033j1.b) ((p033j1.h) this.f205f).f4996d;
                if (bVar != null) {
                    Exception excC = ((p033j1.k) this.e).c();
                    u.f(excC);
                    bVar.b(excC);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (((p033j1.h) this.f205f).f4995c) {
            try {
                p033j1.c cVar = (p033j1.c) ((p033j1.h) this.f205f).f4996d;
                if (cVar != null) {
                    cVar.g(((p033j1.k) this.e).d());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        p pVar;
        q qVar = (q) this.e;
        p058r1.a aVar = (p058r1.a) this.f205f;
        if (qVar.f5330b != p040l1.f.f5308c) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (qVar) {
            pVar = qVar.f5329a;
            qVar.f5329a = null;
            qVar.f5330b = aVar;
        }
        pVar.getClass();
    }

    private final void d() {
        o oVar = (o) this.e;
        p058r1.a aVar = (p058r1.a) this.f205f;
        synchronized (oVar) {
            try {
                if (oVar.f5327b == null) {
                    oVar.f5326a.add(aVar);
                } else {
                    oVar.f5327b.add(aVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void e() {
        C1.g gVar = (C1.g) this.e;
        p033j1.e eVar = (p033j1.e) this.f205f;
        int iDecrementAndGet = ((AtomicInteger) gVar.f5382b).decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException();
        }
        if (iDecrementAndGet == 0) {
            synchronized (gVar) {
                try {
                    gVar.f160g.b();
                    C1.g.f156j.set(true);
                    S4 s4 = gVar.e;
                    k kVar = new k();
                    kVar.f227f = gVar.f161h ? EnumC0698w3.TYPE_THICK : EnumC0698w3.TYPE_THIN;
                    p071w1.l.f5800d.execute(new C7(s4, new i(kVar, 0), EnumC0710y3.ON_DEVICE_FACE_CLOSE, s4.c(), 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((AtomicBoolean) gVar.f5383c).set(false);
        }
        p009c1.n.f2668d.clear();
        p009c1.u.f2677a.clear();
        eVar.a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    @Override // java.lang.Runnable
    public final void run() {
        N2.i iVar;
        O0.g gVar;
        Set set;
        Collection arrayList;
        y yVar;
        O0.g f3 = null;
        int i3 = 0;
        switch (this.f204d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                int i4 = JobInfoSchedulerService.f2691d;
                ((JobInfoSchedulerService) this.e).jobFinished((JobParameters) this.f205f, false);
                return;
            case 1:
                t tVar = (t) this.f205f;
                r rVar = (r) tVar.f1113f.f1077j.get(tVar.f1110b);
                if (rVar == null) {
                    return;
                }
                L0.a aVar = (L0.a) this.e;
                if (!(aVar.f861b == 0)) {
                    rVar.o(aVar, null);
                    return;
                }
                tVar.e = true;
                M0.c cVar = tVar.f1109a;
                if (cVar.l()) {
                    if (!tVar.e || (gVar = tVar.f1111c) == null) {
                        return;
                    }
                    cVar.e(gVar, tVar.f1112d);
                    return;
                }
                try {
                    cVar.e(null, cVar.g());
                    return;
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    cVar.j("Failed to get service from broker.");
                    rVar.o(new L0.a(10), null);
                    return;
                }
            case 2:
                N0.j jVar = (N0.j) this.e;
                N0.i iVar2 = (N0.i) this.f205f;
                Object obj = jVar.f1085b;
                if (obj == null) {
                    return;
                }
                iVar2.c(obj);
                return;
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                p030i1.f fVar = (p030i1.f) this.e;
                L0.a aVar2 = fVar.f4602b;
                boolean z2 = aVar2.f861b == 0;
                D d3 = (D) this.f205f;
                if (z2) {
                    O0.q qVar = fVar.f4603c;
                    u.f(qVar);
                    L0.a aVar3 = qVar.f1304c;
                    if (aVar3.f861b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar3)), new Exception());
                        d3.f1049i.b(aVar3);
                        d3.f1048h.i();
                        return;
                    }
                    t tVar2 = d3.f1049i;
                    IBinder iBinder = qVar.f1303b;
                    if (iBinder != null) {
                        int i5 = AbstractBinderC0087a.f1246c;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        f3 = iInterfaceQueryLocalInterface instanceof O0.g ? (O0.g) iInterfaceQueryLocalInterface : new F(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    tVar2.getClass();
                    if (f3 == null || (set = d3.f1046f) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        tVar2.b(new L0.a(4));
                    } else {
                        tVar2.f1111c = f3;
                        tVar2.f1112d = set;
                        if (tVar2.e) {
                            tVar2.f1109a.e(f3, set);
                        }
                    }
                } else {
                    d3.f1049i.b(aVar2);
                }
                d3.f1048h.i();
                return;
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                break;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                S4 s4 = (S4) this.e;
                HashMap map = s4.f4127j;
                EnumC0710y3 enumC0710y3 = EnumC0710y3.AGGREGATED_ON_DEVICE_FACE_DETECTION;
                C0623k c0623k = (C0623k) map.get(enumC0710y3);
                if (c0623k != null) {
                    C0587e c0587e = c0623k.f4220d;
                    if (c0587e == null) {
                        c0587e = new C0587e(c0623k, c0623k.f4224f);
                        c0623k.f4220d = c0587e;
                    }
                    for (Object obj2 : c0587e) {
                        Collection collection = (Collection) c0623k.f4224f.get(obj2);
                        if (collection == null) {
                            arrayList = collection;
                            arrayList = new ArrayList(3);
                        }
                        arrayList = collection;
                        List list = (List) arrayList;
                        ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new C0593f(c0623k, obj2, list, null) : new C0605h(c0623k, obj2, list, null));
                        Collections.sort(arrayList2);
                        k kVar = new k();
                        Iterator it = arrayList2.iterator();
                        long jLongValue = 0;
                        while (it.hasNext()) {
                            jLongValue += ((Long) it.next()).longValue();
                        }
                        kVar.f227f = Long.valueOf((jLongValue / ((long) arrayList2.size())) & Long.MAX_VALUE);
                        kVar.f226d = Long.valueOf(S4.a(arrayList2, 100.0d) & Long.MAX_VALUE);
                        kVar.f230i = Long.valueOf(S4.a(arrayList2, 75.0d) & Long.MAX_VALUE);
                        kVar.f229h = Long.valueOf(S4.a(arrayList2, 50.0d) & Long.MAX_VALUE);
                        kVar.f228g = Long.valueOf(S4.a(arrayList2, 25.0d) & Long.MAX_VALUE);
                        kVar.e = Long.valueOf(S4.a(arrayList2, 0.0d) & Long.MAX_VALUE);
                        C0597f3 c0597f3 = new C0597f3(kVar);
                        int size = arrayList2.size();
                        A0.f fVar2 = (A0.f) this.f205f;
                        X x3 = (X) obj2;
                        k kVar2 = new k();
                        kVar2.f227f = ((C1.g) fVar2.e).f161h ? EnumC0698w3.TYPE_THICK : EnumC0698w3.TYPE_THIN;
                        D0.b bVar = new D0.b(17, (boolean) i3);
                        bVar.f182f = Integer.valueOf(size & Integer.MAX_VALUE);
                        bVar.e = x3;
                        bVar.f183g = c0597f3;
                        kVar2.f230i = new Y(bVar);
                        p071w1.l.f5800d.execute(new C7(s4, new i(kVar2, 0), enumC0710y3, s4.c(), 1));
                    }
                    map.remove(enumC0710y3);
                    return;
                }
                return;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                if (((p033j1.k) this.e).f5000d) {
                    ((p033j1.g) this.f205f).f4992a.i();
                    return;
                }
                try {
                    ((p033j1.g) this.f205f).getClass();
                    ((p033j1.g) this.f205f).f4992a.h(null);
                    return;
                } catch (p033j1.d e3) {
                    if (e3.getCause() instanceof Exception) {
                        ((p033j1.g) this.f205f).f4992a.g((Exception) e3.getCause());
                        return;
                    } else {
                        ((p033j1.g) this.f205f).f4992a.g(e3);
                        return;
                    }
                } catch (Exception e4) {
                    ((p033j1.g) this.f205f).f4992a.g(e4);
                    return;
                }
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                synchronized (((p033j1.h) this.f205f).f4995c) {
                    ((p033j1.a) ((p033j1.h) this.f205f).f4996d).d((p033j1.k) this.e);
                    break;
                }
                return;
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                a();
                return;
            case 9:
                b();
                return;
            case 10:
                C0734i c0734i = (C0734i) this.f205f;
                p032j.i iVar3 = c0734i.f5165f;
                if (iVar3 != null && (yVar = iVar3.e) != null) {
                    yVar.s(iVar3);
                }
                ActionMenuView actionMenuView = c0734i.f5169j;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C0728f c0728f = (C0728f) this.e;
                    if (c0728f.b()) {
                        c0734i.f5180u = c0728f;
                    } else if (c0728f.e != null) {
                        c0728f.d(0, 0, false, false);
                        c0734i.f5180u = c0728f;
                    }
                }
                c0734i.f5181w = null;
                return;
            case 11:
                c();
                return;
            case 12:
                d();
                return;
            case 13:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.e;
                while (!((Set) this.f205f).isEmpty()) {
                    try {
                        p071w1.k kVar3 = (p071w1.k) referenceQueue.remove();
                        if (kVar3.f5798a.remove(kVar3)) {
                            kVar3.clear();
                            kVar3.f5799b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 14:
                Callable callable = (Callable) this.e;
                p033j1.e eVar = (p033j1.e) this.f205f;
                p033j1.k kVar4 = eVar.f4990a;
                try {
                    eVar.a(callable.call());
                    return;
                } catch (p062s1.a e5) {
                    kVar4.g(e5);
                    return;
                } catch (Exception e6) {
                    kVar4.g(new p062s1.a("Internal error has occurred when executing ML Kit tasks", 13, e6));
                    return;
                }
            case 15:
                e();
                return;
            case 16:
                p071w1.j jVar2 = (p071w1.j) this.e;
                AtomicReference atomicReference = jVar2.f5797d;
                AtomicReference atomicReference2 = jVar2.f5797d;
                if (((Thread) atomicReference.getAndSet(Thread.currentThread())) != null) {
                    throw new IllegalStateException();
                }
                try {
                    ((Runnable) this.f205f).run();
                    atomicReference2.set(null);
                    jVar2.b();
                    return;
                } catch (Throwable th) {
                    try {
                        atomicReference2.set(null);
                        jVar2.b();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 17:
                C0757u c0757u = (C0757u) ((y) this.e).e;
                if (c0757u != null) {
                    c0757u.b((Typeface) this.f205f);
                    return;
                }
                return;
            default:
                ((p075y.e) this.e).accept(this.f205f);
                return;
        }
        do {
            try {
                ((Runnable) this.e).run();
            } catch (Throwable th3) {
                AbstractC0052x.d(th3, p063s2.j.f5670d);
            }
            iVar = (N2.i) this.f205f;
            Runnable runnableI = iVar.i();
            if (runnableI == null) {
                return;
            }
            this.e = runnableI;
            i3++;
        } while (i3 < 16);
        P2.k kVar5 = iVar.f1145f;
        kVar5.getClass();
        kVar5.d(iVar, this);
    }

    public /* synthetic */ e(Object obj, Object obj2, int i3, boolean z2) {
        this.f204d = i3;
        this.f205f = obj;
        this.e = obj2;
    }
}
