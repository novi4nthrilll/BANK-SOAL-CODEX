package p039l0;

import I1.n;
import W.d;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import j0.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import p006b1.c;
import p029i0.j;
import p055q2.g;
import p059r2.l;

/* JADX INFO: loaded from: classes.dex */
public final class k implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile k f5296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f5297d = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f5298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f5299b = new CopyOnWriteArrayList();

    public k(i iVar) {
        this.f5298a = iVar;
        if (iVar != null) {
            iVar.h(new c(this));
        }
    }

    @Override // j0.a
    public final void a(n nVar) {
        synchronized (f5297d) {
            try {
                if (this.f5298a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (j jVar : this.f5299b) {
                    if (jVar.f5294b == nVar) {
                        arrayList.add(jVar);
                    }
                }
                this.f5299b.removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Activity activity = ((j) it.next()).f5293a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f5299b;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((j) it2.next()).f5293a.equals(activity)) {
                                }
                            }
                        }
                    }
                    i iVar = this.f5298a;
                    if (iVar != null) {
                        iVar.f(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // j0.a
    public final void b(Context context, d dVar, n nVar) {
        Object next;
        WindowManager.LayoutParams attributes;
        g gVar = null;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        l lVar = l.f5624d;
        if (activity != null) {
            ReentrantLock reentrantLock = f5297d;
            reentrantLock.lock();
            try {
                i iVar = this.f5298a;
                if (iVar == null) {
                    nVar.accept(new j(lVar));
                    reentrantLock.unlock();
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f5299b;
                boolean z2 = false;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        if (((j) it.next()).f5293a.equals(activity)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                j jVar = new j(activity, dVar, nVar);
                copyOnWriteArrayList.add(jVar);
                if (z2) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!activity.equals(((j) next).f5293a));
                    j jVar2 = (j) next;
                    j jVar3 = jVar2 != null ? jVar2.f5295c : null;
                    if (jVar3 != null) {
                        jVar.f5295c = jVar3;
                        jVar.f5294b.accept(jVar3);
                    }
                } else {
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        iVar.g(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new h(iVar, activity));
                    }
                }
                reentrantLock.unlock();
                gVar = g.f5603a;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        if (gVar == null) {
            nVar.accept(new j(lVar));
        }
    }
}
