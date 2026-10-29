package p057r0;

import R1.i;
import android.location.Location;
import java.util.HashMap;
import k.Z0;
import p013d1.AbstractC0509q3;
import p013d1.I;
import p061s0.a;
import p065t0.d;
import p065t0.f;
import p065t0.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements m, a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z0 f5615d;
    public final /* synthetic */ boolean[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f5616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f5617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f5618h;

    public /* synthetic */ e(Z0 z2, boolean[] zArr, f fVar, String str, i iVar) {
        this.f5615d = z2;
        this.e = zArr;
        this.f5616f = fVar;
        this.f5617g = str;
        this.f5618h = iVar;
    }

    @Override // p065t0.m
    public void a(Location location) {
        Z0 z2 = this.f5615d;
        z2.getClass();
        boolean[] zArr = this.e;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        f fVar = this.f5616f;
        ((d) z2.f5132f).f5708d.remove(fVar);
        fVar.d();
        ((HashMap) z2.f5134h).remove(this.f5617g);
        this.f5618h.c(AbstractC0509q3.a(location));
    }

    @Override // p061s0.a
    public void c(int i3) {
        Z0 z2 = this.f5615d;
        z2.getClass();
        boolean[] zArr = this.e;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        f fVar = this.f5616f;
        ((d) z2.f5132f).f5708d.remove(fVar);
        fVar.d();
        ((HashMap) z2.f5134h).remove(this.f5617g);
        this.f5618h.a(I.c(i3), I.b(i3), null);
    }
}
