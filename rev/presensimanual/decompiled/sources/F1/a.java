package F1;

import B2.h;
import S1.f;
import android.content.Context;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes.dex */
public final class a implements O1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D0.b f272d;
    public D0.b e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D0.b f273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public D0.b f274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f278k;

    @Override // O1.a
    public final void b(D0.b bVar) {
        h.e(bVar, "binding");
        Context context = (Context) bVar.e;
        h.d(context, "getApplicationContext(...)");
        f fVar = (f) bVar.f182f;
        h.d(fVar, "getBinaryMessenger(...)");
        Object systemService = context.getSystemService("sensor");
        h.c(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.f272d = new D0.b(fVar, "dev.fluttercommunity.plus/sensors/accelerometer");
        c cVar = new c(sensorManager, 1);
        this.f275h = cVar;
        D0.b bVar2 = this.f272d;
        if (bVar2 == null) {
            h.g("accelerometerChannel");
            throw null;
        }
        bVar2.R(cVar);
        this.e = new D0.b(fVar, "dev.fluttercommunity.plus/sensors/user_accel");
        c cVar2 = new c(sensorManager, 10);
        this.f276i = cVar2;
        D0.b bVar3 = this.e;
        if (bVar3 == null) {
            h.g("userAccelChannel");
            throw null;
        }
        bVar3.R(cVar2);
        this.f273f = new D0.b(fVar, "dev.fluttercommunity.plus/sensors/gyroscope");
        c cVar3 = new c(sensorManager, 4);
        this.f277j = cVar3;
        D0.b bVar4 = this.f273f;
        if (bVar4 == null) {
            h.g("gyroscopeChannel");
            throw null;
        }
        bVar4.R(cVar3);
        this.f274g = new D0.b(fVar, "dev.fluttercommunity.plus/sensors/magnetometer");
        c cVar4 = new c(sensorManager, 2);
        this.f278k = cVar4;
        D0.b bVar5 = this.f274g;
        if (bVar5 != null) {
            bVar5.R(cVar4);
        } else {
            h.g("magnetometerChannel");
            throw null;
        }
    }

    @Override // O1.a
    public final void k(D0.b bVar) {
        h.e(bVar, "binding");
        D0.b bVar2 = this.f272d;
        if (bVar2 == null) {
            h.g("accelerometerChannel");
            throw null;
        }
        bVar2.R(null);
        D0.b bVar3 = this.e;
        if (bVar3 == null) {
            h.g("userAccelChannel");
            throw null;
        }
        bVar3.R(null);
        D0.b bVar4 = this.f273f;
        if (bVar4 == null) {
            h.g("gyroscopeChannel");
            throw null;
        }
        bVar4.R(null);
        D0.b bVar5 = this.f274g;
        if (bVar5 == null) {
            h.g("magnetometerChannel");
            throw null;
        }
        bVar5.R(null);
        c cVar = this.f275h;
        if (cVar == null) {
            h.g("accelerationStreamHandler");
            throw null;
        }
        cVar.p();
        c cVar2 = this.f276i;
        if (cVar2 == null) {
            h.g("linearAccelerationStreamHandler");
            throw null;
        }
        cVar2.p();
        c cVar3 = this.f277j;
        if (cVar3 == null) {
            h.g("gyroScopeStreamHandler");
            throw null;
        }
        cVar3.p();
        c cVar4 = this.f278k;
        if (cVar4 != null) {
            cVar4.p();
        } else {
            h.g("magnetometerStreamHandler");
            throw null;
        }
    }
}
