package p009c1;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;
import p071w1.c;
import p071w1.e;
import p071w1.i;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f2673b = l.a(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2674a;

    public r(Context context, i iVar) {
        new HashMap();
        new HashMap();
        context.getPackageName();
        c.a(context);
        synchronized (v.class) {
            if (v.f2678d == null) {
                v.f2678d = new v();
            }
        }
        this.f2674a = "common";
        e eVarA = e.a();
        p pVar = new p(0, this);
        eVarA.getClass();
        e.b(pVar);
        e eVarA2 = e.a();
        Objects.requireNonNull(iVar);
        q qVar = new q(iVar, 0);
        eVarA2.getClass();
        e.b(qVar);
        l lVar = f2673b;
        if (lVar.containsKey("common")) {
            Y0.e.d(context, (String) lVar.get("common"), false);
        }
    }
}
