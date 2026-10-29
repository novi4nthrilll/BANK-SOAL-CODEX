package p006b1;

import N0.C;
import N0.j;
import Z0.b;
import android.os.Parcel;
import androidx.lifecycle.y;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p023g1.l;

/* JADX INFO: loaded from: classes.dex */
public final class h extends b implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2523d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f2524c;

    public h(C c3) {
        super("com.google.android.gms.location.ILocationCallback", 2);
        this.f2524c = c3;
    }

    @Override // Z0.b
    public final boolean m(Parcel parcel, int i3) {
        C c3 = this.f2524c;
        if (i3 == 1) {
            LocationResult locationResult = (LocationResult) b.a(parcel, LocationResult.CREATOR);
            b.c(parcel);
            c3.c().a(new y(1, locationResult));
        } else if (i3 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) b.a(parcel, LocationAvailability.CREATOR);
            b.c(parcel);
            c3.c().a(new c(locationAvailability));
        } else {
            if (i3 != 3) {
                return false;
            }
            o();
        }
        return true;
    }

    public final void n(j jVar) {
        C c3 = this.f2524c;
        synchronized (c3) {
            j jVar2 = (j) c3.e;
            if (jVar2 != jVar) {
                jVar2.f1085b = null;
                jVar2.f1086c = null;
                c3.e = jVar;
            }
        }
    }

    public final void o() {
        this.f2524c.c().a(new y(2, this));
    }
}
