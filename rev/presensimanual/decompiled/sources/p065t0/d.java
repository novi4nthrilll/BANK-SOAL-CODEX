package p065t0;

import L0.e;
import S1.o;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d implements o {
    public static d e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f5708d = new CopyOnWriteArrayList();

    public static f b(Context context, boolean z2, h hVar) {
        if (z2) {
            return new g(context, hVar);
        }
        try {
            if (L0.d.f870d.c(context, e.f871a) == 0) {
                return new c(context, hVar);
            }
        } catch (NoClassDefFoundError unused) {
        }
        return new g(context, hVar);
    }

    public static synchronized d c() {
        try {
            if (e == null) {
                e = new d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    @Override // S1.o
    public final boolean a(int i3, int i4, Intent intent) {
        Iterator it = this.f5708d.iterator();
        while (it.hasNext()) {
            if (((f) it.next()).b(i3, i4)) {
                return true;
            }
        }
        return false;
    }
}
