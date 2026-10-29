package p057r0;

import S1.g;
import android.location.Location;
import com.baseflow.geolocator.GeolocatorLocationService;
import java.io.IOException;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0509q3;
import p013d1.I;
import p065t0.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements m, p061s0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5604d;
    public final /* synthetic */ g e;

    public /* synthetic */ a(g gVar, int i3) {
        this.f5604d = i3;
        this.e = gVar;
    }

    @Override // p065t0.m
    public void a(Location location) throws IOException {
        g gVar = this.e;
        switch (this.f5604d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                int i3 = GeolocatorLocationService.f2680n;
                gVar.b(AbstractC0509q3.a(location));
                break;
            default:
                gVar.b(AbstractC0509q3.a(location));
                break;
        }
    }

    @Override // p061s0.a
    public void c(int i3) throws IOException {
        g gVar = this.e;
        switch (this.f5604d) {
            case 1:
                int i4 = GeolocatorLocationService.f2680n;
                gVar.a(I.c(i3), I.b(i3), null);
                break;
            default:
                gVar.a(I.c(i3), I.b(i3), null);
                break;
        }
    }
}
