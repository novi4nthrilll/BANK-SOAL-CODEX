package p051p0;

import android.location.Geocoder;
import java.util.List;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Geocoder.GeocodeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f5536b;

    public /* synthetic */ b(a aVar, int i3) {
        this.f5535a = i3;
        this.f5536b = aVar;
    }

    @Override // android.location.Geocoder.GeocodeListener
    public final void onError(String str) {
        switch (this.f5535a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.f5536b.onError(str);
                break;
            default:
                ((e) this.f5536b).onError(str);
                break;
        }
    }

    @Override // android.location.Geocoder.GeocodeListener
    public final void onGeocode(List list) {
        switch (this.f5535a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.f5536b.onGeocode(list);
                break;
            default:
                ((e) this.f5536b).onGeocode(list);
                break;
        }
    }
}
