package E1;

import R1.i;
import android.location.Location;
import p013d1.AbstractC0509q3;
import p013d1.I;
import p065t0.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p033j1.b, p061s0.a, m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f240d;
    public final /* synthetic */ i e;

    public /* synthetic */ b(i iVar, int i3) {
        this.f240d = i3;
        this.e = iVar;
    }

    @Override // p065t0.m
    public void a(Location location) {
        this.e.c(AbstractC0509q3.a(location));
    }

    @Override // p033j1.b
    public void b(Exception exc) {
        this.e.a("FaceDetectorError", exc.toString(), null);
    }

    @Override // p061s0.a
    public void c(int i3) {
        switch (this.f240d) {
            case 2:
                this.e.a(I.c(i3), I.b(i3), null);
                break;
            default:
                this.e.a(I.c(i3), I.b(i3), null);
                break;
        }
    }
}
