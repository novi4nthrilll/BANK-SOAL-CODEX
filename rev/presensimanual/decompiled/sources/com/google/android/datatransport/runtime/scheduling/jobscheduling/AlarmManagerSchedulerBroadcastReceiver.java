package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import E0.g;
import E0.j;
import I0.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p070w0.c;
import p079z0.b;
import p079z0.h;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2690a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i3 = intent.getExtras().getInt("attemptNumber");
        h.b(context);
        if (queryParameter == null) {
            throw new NullPointerException("Null backendName");
        }
        c cVarB = a.b(iIntValue);
        byte[] bArrDecode = queryParameter2 != null ? Base64.decode(queryParameter2, 0) : null;
        j jVar = h.a().f5953d;
        b bVar = new b(queryParameter, bArrDecode, cVarB);
        E0.a aVar = E0.a.f195d;
        jVar.getClass();
        jVar.e.execute(new g(jVar, bVar, i3, aVar));
    }
}
