package E0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F0.c f202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f203c;

    public d(Context context, F0.c cVar, b bVar) {
        this.f201a = context;
        this.f202b = cVar;
        this.f203c = bVar;
    }

    public final void a(p079z0.b bVar, int i3, boolean z2) {
        Context context = this.f201a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(bVar.f5936a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        p070w0.c cVar = bVar.f5938c;
        adler32.update(byteBufferAllocate.putInt(I0.a.a(cVar)).array());
        byte[] bArr = bVar.f5937b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z2) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i4 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i4 < i3) {
                        break;
                    }
                    p000a.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", bVar);
                    return;
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseA = ((F0.i) this.f202b).a();
        String strValueOf = String.valueOf(I0.a.a(cVar));
        String str = bVar.f5936a;
        Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            b bVar2 = this.f203c;
            Long l3 = lValueOf;
            builder.setMinimumLatency(bVar2.a(cVar, jLongValue, i3));
            Set set = ((c) bVar2.f197b.get(cVar)).f200c;
            if (set.contains(f.f206d)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(f.f207f)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(f.e)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i3);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", I0.a.a(cVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Log.d("TransportRuntime.".concat("JobInfoScheduler"), String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", bVar, Integer.valueOf(value), Long.valueOf(bVar2.a(cVar, jLongValue, i3)), l3, Integer.valueOf(i3)));
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
