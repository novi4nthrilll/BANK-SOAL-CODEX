package p013d1;

import android.content.Context;
import com.google.android.gms.internal.mlkit_vision_face_bundled.r;
import java.util.HashMap;
import p009c1.p;
import p009c1.q;
import p033j1.k;
import p071w1.c;
import p071w1.e;
import p071w1.i;

/* JADX INFO: loaded from: classes.dex */
public final class K4 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static U4 f3596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f3597k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J4 f3600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f3601d;
    public final k e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f3602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f3605i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        f3597k = new r(1, objArr);
    }

    public K4(Context context, i iVar, J4 j4) {
        new HashMap();
        this.f3598a = context.getPackageName();
        this.f3599b = c.a(context);
        this.f3601d = iVar;
        this.f3600c = j4;
        P4.b();
        this.f3603g = "vision-common";
        e eVarA = e.a();
        p pVar = new p(1, this);
        eVarA.getClass();
        this.e = e.b(pVar);
        e eVarA2 = e.a();
        iVar.getClass();
        q qVar = new q(iVar, 1);
        eVarA2.getClass();
        this.f3602f = e.b(qVar);
        r rVar = f3597k;
        this.f3604h = rVar.containsKey("vision-common") ? Y0.e.d(context, (String) rVar.get("vision-common"), false) : -1;
    }
}
