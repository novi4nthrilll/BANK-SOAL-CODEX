package p051p0;

import R1.i;
import java.util.List;
import java.util.Locale;
import p013d1.AbstractC0425c3;

/* JADX INFO: loaded from: classes.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f5541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f5542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f5543c;

    public e(i iVar, double d3, double d4) {
        this.f5541a = iVar;
        this.f5542b = d3;
        this.f5543c = d4;
    }

    @Override // p051p0.a
    public final void onError(String str) {
        this.f5541a.a("IO_ERROR", String.format(str, new Object[0]), null);
    }

    @Override // p051p0.a
    public final void onGeocode(List list) {
        i iVar = this.f5541a;
        if (list == null || list.size() <= 0) {
            iVar.a("NOT_FOUND", String.format(Locale.ENGLISH, "No address information found for supplied coordinates (latitude: %f, longitude: %f).", Double.valueOf(this.f5542b), Double.valueOf(this.f5543c)), null);
        } else {
            iVar.c(AbstractC0425c3.a(list));
        }
    }
}
