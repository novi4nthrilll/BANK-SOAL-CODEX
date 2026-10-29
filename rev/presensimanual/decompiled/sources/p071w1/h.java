package p071w1;

import B.C0006g;
import E0.i;
import I1.x;
import L0.c;
import M0.j;
import O0.u;
import S0.a;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;
import p009c1.b;
import p009c1.d;
import p009c1.e;
import p009c1.g;
import p009c1.l;
import p013d1.A2;
import p033j1.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c[] f5789a = new c[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f5790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f5791c;

    static {
        c cVar = new c(1L, "vision.barcode");
        c cVar2 = new c(1L, "vision.custom.ica");
        c cVar3 = new c(1L, "vision.face");
        f5790b = cVar3;
        c cVar4 = new c(1L, "vision.ica");
        c cVar5 = new c(1L, "vision.ocr");
        c cVar6 = new c(1L, "mlkit.langid");
        c cVar7 = new c(1L, "mlkit.nlclassifier");
        c cVar8 = new c(1L, "tflite_dynamite");
        c cVar9 = new c(1L, "mlkit.barcode.ui");
        c cVar10 = new c(1L, "mlkit.smartreply");
        i iVar = new i();
        iVar.e("barcode", cVar);
        iVar.e("custom_ica", cVar2);
        iVar.e("face", cVar3);
        iVar.e("ica", cVar4);
        iVar.e("ocr", cVar5);
        iVar.e("langid", cVar6);
        iVar.e("nlclassifier", cVar7);
        iVar.e("tflite_dynamite", cVar8);
        iVar.e("barcode_ui", cVar9);
        iVar.e("smart_reply", cVar10);
        e eVar = (e) iVar.f219g;
        if (eVar != null) {
            throw eVar.a();
        }
        l lVarA = l.a(iVar.e, (Object[]) iVar.f218f, iVar);
        e eVar2 = (e) iVar.f219g;
        if (eVar2 != null) {
            throw eVar2.a();
        }
        f5791c = lVarA;
        i iVar2 = new i();
        iVar2.e("com.google.android.gms.vision.barcode", cVar);
        iVar2.e("com.google.android.gms.vision.custom.ica", cVar2);
        iVar2.e("com.google.android.gms.vision.face", cVar3);
        iVar2.e("com.google.android.gms.vision.ica", cVar4);
        iVar2.e("com.google.android.gms.vision.ocr", cVar5);
        iVar2.e("com.google.android.gms.mlkit.langid", cVar6);
        iVar2.e("com.google.android.gms.mlkit.nlclassifier", cVar7);
        iVar2.e("com.google.android.gms.tflite_dynamite", cVar8);
        iVar2.e("com.google.android.gms.mlkit_smartreply", cVar10);
        e eVar3 = (e) iVar2.f219g;
        if (eVar3 != null) {
            throw eVar3.a();
        }
        l.a(iVar2.e, (Object[]) iVar2.f218f, iVar2);
        e eVar4 = (e) iVar2.f219g;
        if (eVar4 != null) {
            throw eVar4.a();
        }
    }

    public static void a(Context context, String str) {
        k kVarC;
        b bVar = d.e;
        Object[] objArr = {str};
        A2.a(1, objArr);
        g gVar = new g(1, objArr);
        L0.e.f872b.getClass();
        if (L0.e.a(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", gVar));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        int i3 = gVar.f2652g;
        final c[] cVarArr = new c[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            c cVar = (c) f5791c.get(gVar.get(i4));
            u.f(cVar);
            cVarArr[i4] = cVar;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j() { // from class: w1.q
            @Override // M0.j
            public final c[] d() {
                c[] cVarArr2 = h.f5789a;
                return cVarArr;
            }
        });
        u.a("APIs must not be empty.", !arrayList.isEmpty());
        S0.g gVar2 = new S0.g(context, S0.g.f1585i, M0.b.f963a, M0.e.f965b);
        TreeSet treeSet = new TreeSet(S0.b.f1583a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((j) it.next()).d());
        }
        a aVar = new a(new ArrayList(treeSet), true, null, null);
        if (aVar.f1579a.isEmpty()) {
            R0.c cVar2 = new R0.c(0, false);
            kVarC = new k();
            kVarC.h(cVar2);
        } else {
            x xVar = new x();
            xVar.e = new c[]{Z0.d.f1950c};
            xVar.f429b = true;
            xVar.f430c = 27304;
            xVar.f431d = new C0006g(gVar2, aVar);
            kVarC = gVar2.c(0, xVar.a());
        }
        kVarC.a(new p067u1.a());
    }
}
