package p045n;

import C1.g;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p006b1.c;
import p033j1.e;
import p033j1.k;
import p062s1.a;
import p071w1.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5383c;

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public p033j1.k a(final Executor executor, final Callable callable, final c cVar) {
        if (((AtomicInteger) this.f5382b).get() <= 0) {
            throw new IllegalStateException();
        }
        if (((p033j1.k) cVar.f2515d).e()) {
            p033j1.k kVar = new p033j1.k();
            kVar.i();
            return kVar;
        }
        final c cVar2 = new c(4);
        final e eVar = new e((c) cVar2.f2515d);
        ((j) this.f5381a).a(new Executor() { // from class: w1.o
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (((k) cVar.f2515d).e()) {
                        cVar2.e();
                    } else {
                        eVar.f4990a.g(e);
                    }
                    throw e;
                }
            }
        }, new Runnable() { // from class: w1.p
            @Override // java.lang.Runnable
            public final void run() {
                p045n.k kVar2 = this.f5806d;
                c cVar3 = cVar;
                c cVar4 = cVar2;
                Callable callable2 = callable;
                e eVar2 = eVar;
                kVar2.getClass();
                try {
                    if (((k) cVar3.f2515d).e()) {
                        cVar4.e();
                        return;
                    }
                    try {
                        if (!((AtomicBoolean) kVar2.f5383c).get()) {
                            g gVar = (g) kVar2;
                            synchronized (gVar) {
                                gVar.f161h = gVar.f160g.a();
                            }
                            ((AtomicBoolean) kVar2.f5383c).set(true);
                        }
                        if (((k) cVar3.f2515d).e()) {
                            cVar4.e();
                            return;
                        }
                        Object objCall = callable2.call();
                        if (((k) cVar3.f2515d).e()) {
                            cVar4.e();
                        } else {
                            eVar2.a(objCall);
                        }
                    } catch (RuntimeException e) {
                        throw new a("Internal error has occurred when executing ML Kit tasks", 13, e);
                    }
                } catch (Exception e3) {
                    if (((k) cVar3.f2515d).e()) {
                        cVar4.e();
                    } else {
                        eVar2.f4990a.g(e3);
                    }
                }
            }
        });
        return eVar.f4990a;
    }

    public abstract void b();

    public abstract Object c(int i3, int i4);

    public abstract Map d();

    public abstract int e();

    public abstract int f(Object obj);

    public abstract int g(Object obj);

    public abstract void h(Object obj, Object obj2);

    public abstract void i(int i3);

    public abstract Object j(int i3, Object obj);

    public Object[] l(int i3, Object[] objArr) {
        int iE = e();
        if (objArr.length < iE) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iE);
        }
        for (int i4 = 0; i4 < iE; i4++) {
            objArr[i4] = c(i4, i3);
        }
        if (objArr.length > iE) {
            objArr[iE] = null;
        }
        return objArr;
    }
}
