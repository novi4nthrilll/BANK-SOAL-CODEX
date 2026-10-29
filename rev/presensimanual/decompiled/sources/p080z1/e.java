package p080z1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import p033j1.b;
import p040l1.c;
import p040l1.s;

/* JADX INFO: loaded from: classes.dex */
public final class e implements b, c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e f5963d = new e();
    public static final /* synthetic */ e e = new e();

    @Override // p033j1.b
    public void b(Exception exc) {
        c.f5959h.a("MobileVisionBase", "Error preloading model resource", exc);
    }

    @Override // p040l1.c
    public Object h(s sVar) {
        Set setC = sVar.c(d.class);
        e eVar = new e();
        new HashMap();
        new HashMap();
        Iterator it = setC.iterator();
        if (!it.hasNext()) {
            return eVar;
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
