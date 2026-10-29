package R1;

import S1.t;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E0.n f1448d;

    public b(K1.b bVar) {
        E0.n nVar = new E0.n(bVar, "flutter/lifecycle", t.f1599b, null, false);
        this.f1445a = 0;
        this.f1446b = 0;
        this.f1447c = true;
        this.f1448d = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0029  */
    public final void a(int i3, boolean z2) {
        int i4;
        String str;
        int i5 = this.f1445a;
        if (i5 == i3 && z2 == this.f1447c) {
            return;
        }
        if (i3 == 0 && i5 == 0) {
            this.f1447c = z2;
            return;
        }
        int iB = M.j.b(i3);
        if (iB != 0) {
            if (iB == 1) {
                i4 = z2 ? 2 : 3;
            } else if (iB == 2 || iB == 3 || iB == 4) {
                i4 = i3;
            } else {
                i4 = 0;
            }
        } else {
            i4 = i3;
        }
        this.f1445a = i3;
        this.f1447c = z2;
        if (i4 == this.f1446b) {
            return;
        }
        StringBuilder sb = new StringBuilder("AppLifecycleState.");
        if (i4 == 1) {
            str = "DETACHED";
        } else if (i4 == 2) {
            str = "RESUMED";
        } else if (i4 == 3) {
            str = "INACTIVE";
        } else if (i4 == 4) {
            str = "HIDDEN";
        } else {
            if (i4 != 5) {
                throw null;
            }
            str = "PAUSED";
        }
        sb.append(str.toLowerCase(Locale.ROOT));
        this.f1448d.d(sb.toString(), null);
        this.f1446b = i4;
    }
}
