package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import E0.e;
import E0.g;
import E0.j;
import I0.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p070w0.c;
import p079z0.b;
import p079z0.h;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2691d = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i3 = jobParameters.getExtras().getInt("priority");
        int i4 = jobParameters.getExtras().getInt("attemptNumber");
        h.b(getApplicationContext());
        if (string == null) {
            throw new NullPointerException("Null backendName");
        }
        c cVarB = a.b(i3);
        byte[] bArrDecode = string2 != null ? Base64.decode(string2, 0) : null;
        j jVar = h.a().f5953d;
        b bVar = new b(string, bArrDecode, cVarB);
        e eVar = new e(0, this, jobParameters);
        jVar.getClass();
        jVar.e.execute(new g(jVar, bVar, i4, eVar));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
