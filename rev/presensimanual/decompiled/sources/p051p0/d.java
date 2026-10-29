package p051p0;

import R1.i;
import android.location.Address;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0425c3;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f5539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5540c;

    public /* synthetic */ d(i iVar, String str, int i3) {
        this.f5538a = i3;
        this.f5539b = iVar;
        this.f5540c = str;
    }

    @Override // p051p0.a
    public final void onError(String str) {
        switch (this.f5538a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.f5539b.a("IO_ERROR", String.format(str, new Object[0]), null);
                break;
            default:
                this.f5539b.a("IO_ERROR", String.format(str, new Object[0]), null);
                break;
        }
    }

    @Override // p051p0.a
    public final void onGeocode(List list) {
        switch (this.f5538a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                i iVar = this.f5539b;
                if (list != null && list.size() > 0) {
                    ArrayList arrayList = new ArrayList(list.size());
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Address address = (Address) it.next();
                        HashMap map = new HashMap();
                        map.put("latitude", Double.valueOf(address.getLatitude()));
                        map.put("longitude", Double.valueOf(address.getLongitude()));
                        map.put("timestamp", Long.valueOf(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTimeInMillis()));
                        arrayList.add(map);
                    }
                    iVar.c(arrayList);
                } else {
                    iVar.a("NOT_FOUND", I.h(new StringBuilder("No coordinates found for '"), this.f5540c, "'"), null);
                }
                break;
            default:
                i iVar2 = this.f5539b;
                if (list != null && list.size() > 0) {
                    iVar2.c(AbstractC0425c3.a(list));
                } else {
                    iVar2.a("NOT_FOUND", I.h(new StringBuilder("No coordinates found for '"), this.f5540c, "'"), null);
                }
                break;
        }
    }
}
