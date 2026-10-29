package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class F7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q0.c f2783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f2784b;

    public F7(Context context, int i3) {
        switch (i3) {
            case 1:
                this.f2784b = new AtomicLong(-1L);
                this.f2783a = new Q0.c(context, Q0.c.f1381i, new O0.m("mlkit:vision"), M0.e.f965b);
                break;
            default:
                this.f2784b = new AtomicLong(-1L);
                this.f2783a = new Q0.c(context, Q0.c.f1381i, new O0.m("mlkit:vision"), M0.e.f965b);
                break;
        }
    }

    public synchronized void a(int i3, int i4, long j3, long j4) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f2784b.get() != -1 && jElapsedRealtime - this.f2784b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f2783a.d(new O0.l(0, Arrays.asList(new O0.i(i3, i4, 0, j3, j4, null, null, 0, -1)))).a(new F0.e(this, jElapsedRealtime, 3));
    }

    public synchronized void b(int i3, long j3, long j4) {
        AtomicLong atomicLong = this.f2784b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.f2784b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f2783a.d(new O0.l(0, Arrays.asList(new O0.i(25503, i3, 0, j3, j4, null, null, 0, -1)))).a(new F0.e(this, jElapsedRealtime, 2));
    }
}
