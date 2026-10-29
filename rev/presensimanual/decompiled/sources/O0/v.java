package O0;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class v extends Z0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1315a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.google.android.gms.common.internal.a aVar, Looper looper) {
        super(looper, 1);
        this.f1315a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x018f  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f1315a.v.get() != message.arg1) {
            int i3 = message.what;
            if (i3 == 2 || i3 == 1 || i3 == 7) {
                r rVar = (r) message.obj;
                rVar.getClass();
                rVar.d();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 != 1 && i4 != 7) {
            if (i4 == 4) {
                this.f1315a.getClass();
            } else if (i4 == 5) {
            }
            if (!this.f1315a.a()) {
                r rVar2 = (r) message.obj;
                rVar2.getClass();
                rVar2.d();
                return;
            }
        } else if (!this.f1315a.a()) {
            r rVar3 = (r) message.obj;
            rVar3.getClass();
            rVar3.d();
            return;
        }
        int i5 = message.what;
        if (i5 == 4) {
            com.google.android.gms.common.internal.a aVar = this.f1315a;
            aVar.f2729s = new L0.a(message.arg2);
            if (!aVar.f2730t && !TextUtils.isEmpty(aVar.r()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.r());
                    com.google.android.gms.common.internal.a aVar2 = this.f1315a;
                    if (!aVar2.f2730t) {
                        aVar2.y(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.a aVar3 = this.f1315a;
            L0.a aVar4 = aVar3.f2729s;
            if (aVar4 == null) {
                aVar4 = new L0.a(8);
            }
            aVar3.f2719i.a(aVar4);
            this.f1315a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i5 == 5) {
            com.google.android.gms.common.internal.a aVar5 = this.f1315a;
            L0.a aVar6 = aVar5.f2729s;
            if (aVar6 == null) {
                aVar6 = new L0.a(8);
            }
            aVar5.f2719i.a(aVar6);
            this.f1315a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i5 == 3) {
            Object obj = message.obj;
            this.f1315a.f2719i.a(new L0.a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            this.f1315a.getClass();
            System.currentTimeMillis();
            return;
        }
        if (i5 == 6) {
            this.f1315a.y(5, null);
            j jVar = this.f1315a.f2724n;
            if (jVar != null) {
                ((M0.g) jVar.f1284a).d(message.arg2);
            }
            this.f1315a.u();
            com.google.android.gms.common.internal.a.x(this.f1315a, 5, 1, null);
            return;
        }
        if (i5 == 2 && !this.f1315a.c()) {
            r rVar4 = (r) message.obj;
            rVar4.getClass();
            rVar4.d();
            return;
        }
        int i6 = message.what;
        if (i6 != 2 && i6 != 1 && i6 != 7) {
            Log.wtf("GmsClient", I.f("Don't know how to handle message: ", i6), new Exception());
            return;
        }
        r rVar5 = (r) message.obj;
        synchronized (rVar5) {
            try {
                bool = rVar5.f1306a;
                if (rVar5.f1307b) {
                    Log.w("GmsClient", "Callback proxy " + rVar5.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.a aVar7 = rVar5.f1310f;
            int i7 = rVar5.f1309d;
            if (i7 != 0) {
                aVar7.y(1, null);
                Bundle bundle = rVar5.e;
                rVar5.a(new L0.a(i7, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!rVar5.b()) {
                aVar7.y(1, null);
                rVar5.a(new L0.a(8, null));
            }
        }
        synchronized (rVar5) {
            rVar5.f1307b = true;
        }
        rVar5.d();
    }
}
