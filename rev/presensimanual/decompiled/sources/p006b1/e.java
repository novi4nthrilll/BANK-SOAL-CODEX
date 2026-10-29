package p006b1;

import Z0.b;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0481m;
import p023g1.d;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p033j1.e f2519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i3, p033j1.e eVar) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks", 2);
        this.f2518c = i3;
        switch (i3) {
            case 1:
                this.f2519d = eVar;
                super("com.google.android.gms.location.internal.ILocationStatusCallback", 2);
                break;
            default:
                this.f2519d = eVar;
                break;
        }
    }

    @Override // Z0.b
    public final boolean m(Parcel parcel, int i3) {
        switch (this.f2518c) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (i3 != 1) {
                    return false;
                }
                p023g1.e eVar = (p023g1.e) b.a(parcel, p023g1.e.CREATOR);
                b.c(parcel);
                Status status = eVar.f4493a;
                d dVar = new d();
                dVar.f4492a = eVar;
                AbstractC0481m.a(status, dVar, this.f2519d);
                return true;
            default:
                if (i3 != 1) {
                    return false;
                }
                Status status2 = (Status) b.a(parcel, Status.CREATOR);
                Location location = (Location) b.a(parcel, Location.CREATOR);
                b.c(parcel);
                AbstractC0481m.a(status2, location, this.f2519d);
                return true;
        }
    }
}
