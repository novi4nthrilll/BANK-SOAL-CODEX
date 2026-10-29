package p054q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p004b.a;
import p004b.b;
import p004b.c;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f5590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f5591c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f5592d = new HashSet();

    public u(Context context) {
        this.f5589a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f5590b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(t tVar) {
        boolean z2;
        ArrayDeque arrayDeque;
        boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = tVar.f5585a;
        if (zIsLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + tVar.f5588d.size() + " queued tasks");
        }
        if (tVar.f5588d.isEmpty()) {
            return;
        }
        if (tVar.f5586b) {
            z2 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f5589a;
            boolean zBindService = context.bindService(component, this, 33);
            tVar.f5586b = zBindService;
            if (zBindService) {
                tVar.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z2 = tVar.f5586b;
        }
        if (!z2 || tVar.f5587c == null) {
            b(tVar);
            return;
        }
        while (true) {
            arrayDeque = tVar.f5588d;
            r rVar = (r) arrayDeque.peek();
            if (rVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + rVar);
                }
                rVar.a(tVar.f5587c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(tVar);
    }

    public final void b(t tVar) {
        Handler handler = this.f5590b;
        ComponentName componentName = tVar.f5585a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i3 = tVar.e;
        int i4 = i3 + 1;
        tVar.e = i4;
        if (i4 <= 6) {
            int i5 = (1 << i3) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i5 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i5);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = tVar.f5588d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(tVar.e);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i3 = message.what;
        c cVar = null;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        return false;
                    }
                    t tVar = (t) this.f5591c.get((ComponentName) message.obj);
                    if (tVar != null) {
                        a(tVar);
                    }
                    return true;
                }
                t tVar2 = (t) this.f5591c.get((ComponentName) message.obj);
                if (tVar2 != null) {
                    if (tVar2.f5586b) {
                        this.f5589a.unbindService(this);
                        tVar2.f5586b = false;
                    }
                    tVar2.f5587c = null;
                }
                return true;
            }
            s sVar = (s) message.obj;
            ComponentName componentName = sVar.f5583a;
            IBinder iBinder = sVar.f5584b;
            t tVar3 = (t) this.f5591c.get(componentName);
            if (tVar3 != null) {
                int i4 = b.f2512b;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c.f2513a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) {
                        a aVar = new a();
                        aVar.f2511b = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (c) iInterfaceQueryLocalInterface;
                    }
                }
                tVar3.f5587c = cVar;
                tVar3.e = 0;
                a(tVar3);
            }
            return true;
        }
        r rVar = (r) message.obj;
        String string = Settings.Secure.getString(this.f5589a.getContentResolver(), "enabled_notification_listeners");
        synchronized (v.f5593b) {
            if (string != null) {
                try {
                    if (!string.equals(v.f5594c)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet2.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        v.f5595d = hashSet2;
                        v.f5594c = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = v.f5595d;
        }
        if (!hashSet.equals(this.f5592d)) {
            this.f5592d = hashSet;
            List<ResolveInfo> listQueryIntentServices = this.f5589a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet3 = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            for (ComponentName componentName3 : hashSet3) {
                if (!this.f5591c.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                    }
                    this.f5591c.put(componentName3, new t(componentName3));
                }
            }
            Iterator it = this.f5591c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    t tVar4 = (t) entry.getValue();
                    if (tVar4.f5586b) {
                        this.f5589a.unbindService(this);
                        tVar4.f5586b = false;
                    }
                    tVar4.f5587c = null;
                    it.remove();
                }
            }
        }
        for (t tVar5 : this.f5591c.values()) {
            tVar5.f5588d.add(rVar);
            a(tVar5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f5590b.obtainMessage(1, new s(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f5590b.obtainMessage(2, componentName).sendToTarget();
    }
}
