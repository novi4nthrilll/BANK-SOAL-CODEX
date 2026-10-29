package V1;

import A0.g;
import D0.b;
import E0.k;
import I1.AbstractActivityC0028d;
import R1.i;
import S1.o;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class a implements O1.a, P1.a, o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PackageManager f1641d;
    public k e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f1642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f1643g = new HashMap();

    public a(g gVar) {
        this.f1641d = (PackageManager) gVar.e;
        gVar.f19f = this;
    }

    @Override // S1.o
    public final boolean a(int i3, int i4, Intent intent) {
        HashMap map = this.f1643g;
        if (!map.containsKey(Integer.valueOf(i3))) {
            return false;
        }
        ((i) map.remove(Integer.valueOf(i3))).c(i4 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // P1.a
    public final void c() {
        ((HashSet) this.e.f227f).remove(this);
        this.e = null;
    }

    @Override // P1.a
    public final void d() {
        ((HashSet) this.e.f227f).remove(this);
        this.e = null;
    }

    @Override // P1.a
    public final void e(k kVar) {
        this.e = kVar;
        ((HashSet) kVar.f227f).add(this);
    }

    @Override // P1.a
    public final void f(k kVar) {
        this.e = kVar;
        ((HashSet) kVar.f227f).add(this);
    }

    public final void g(String str, String str2, boolean z2, i iVar) {
        if (this.e == null) {
            iVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            iVar.a("error", "Android version not supported", null);
            return;
        }
        HashMap map = this.f1642f;
        if (map == null) {
            iVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            iVar.a("error", "Text processing activity not found", null);
            return;
        }
        int iHashCode = iVar.hashCode();
        this.f1643g.put(Integer.valueOf(iHashCode), iVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        ((AbstractActivityC0028d) this.e.f226d).startActivityForResult(intent, iHashCode);
    }

    public final HashMap h() {
        HashMap map = this.f1642f;
        PackageManager packageManager = this.f1641d;
        if (map == null) {
            this.f1642f = new HashMap();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 23) {
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                for (ResolveInfo resolveInfo : i3 >= 33 ? packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(type, 0)) {
                    String str = resolveInfo.activityInfo.name;
                    resolveInfo.loadLabel(packageManager).toString();
                    this.f1642f.put(str, resolveInfo);
                }
            }
        }
        HashMap map2 = new HashMap();
        for (String str2 : this.f1642f.keySet()) {
            map2.put(str2, ((ResolveInfo) this.f1642f.get(str2)).loadLabel(packageManager).toString());
        }
        return map2;
    }

    @Override // O1.a
    public final void b(b bVar) {
    }

    @Override // O1.a
    public final void k(b bVar) {
    }
}
