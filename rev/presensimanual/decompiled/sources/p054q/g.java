package p054q;

import W1.C0104l;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import u.c;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5564a;
    public CharSequence e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f5568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f5569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5570h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C0104l f5572j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bundle f5574l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f5576n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f5577o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Notification f5578p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f5579q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5565b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5566c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5567d = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f5571i = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5573k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5575m = 0;

    public g(Context context, String str) {
        Notification notification = new Notification();
        this.f5578p = notification;
        this.f5564a = context;
        this.f5576n = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f5570h = 0;
        this.f5579q = new ArrayList();
        this.f5577o = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, long[]] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final Notification a() {
        ?? r4;
        CharSequence charSequence;
        Notification notificationBuild;
        Bundle bundle;
        int i3;
        ArrayList arrayList;
        Notification.Action.Builder builderE;
        Icon iconC;
        int i4;
        new ArrayList();
        Bundle bundle2 = new Bundle();
        Context context = this.f5564a;
        int i5 = Build.VERSION.SDK_INT;
        Notification.Builder builderA = i5 >= 26 ? l.a(context, this.f5576n) : new Notification.Builder(this.f5564a);
        Notification notification = this.f5578p;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f5568f).setContentInfo(null).setContentIntent(this.f5569g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        if (i5 < 23) {
            builderA.setLargeIcon((Bitmap) null);
        } else {
            j.b(builderA, null);
        }
        builderA.setSubText(null).setUsesChronometer(false).setPriority(this.f5570h);
        for (f fVar : this.f5565b) {
            int i6 = Build.VERSION.SDK_INT;
            if (fVar.f5559b == null && (i4 = fVar.e) != 0) {
                fVar.f5559b = IconCompat.b(i4);
            }
            IconCompat iconCompat = fVar.f5559b;
            PendingIntent pendingIntent = fVar.f5563g;
            CharSequence charSequence2 = fVar.f5562f;
            if (i6 >= 23) {
                if (iconCompat == null) {
                    iconC = null;
                } else {
                    if (i6 < 23) {
                        throw new UnsupportedOperationException("This method is only supported on API level 23+");
                    }
                    iconC = c.c(iconCompat, null);
                }
                builderE = j.a(iconC, charSequence2, pendingIntent);
            } else {
                builderE = h.e(iconCompat != null ? iconCompat.c() : 0, charSequence2, pendingIntent);
            }
            Bundle bundle3 = fVar.f5558a;
            Bundle bundle4 = bundle3 != null ? new Bundle(bundle3) : new Bundle();
            boolean z2 = fVar.f5560c;
            bundle4.putBoolean("android.support.allowGeneratedReplies", z2);
            if (i6 >= 24) {
                k.a(builderE, z2);
            }
            bundle4.putInt("android.support.action.semanticAction", 0);
            if (i6 >= 28) {
                m.b(builderE, 0);
            }
            if (i6 >= 29) {
                n.c(builderE, false);
            }
            if (i6 >= 31) {
                o.a(builderE, false);
            }
            bundle4.putBoolean("android.support.action.showsUserInterface", fVar.f5561d);
            h.b(builderE, bundle4);
            h.a(builderA, h.d(builderE));
        }
        Bundle bundle5 = this.f5574l;
        if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        int i7 = Build.VERSION.SDK_INT;
        builderA.setShowWhen(this.f5571i);
        h.i(builderA, this.f5573k);
        h.g(builderA, null);
        h.j(builderA, null);
        h.h(builderA, false);
        i.b(builderA, null);
        i.c(builderA, this.f5575m);
        i.f(builderA, 0);
        i.d(builderA, null);
        i.e(builderA, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = this.f5579q;
        ArrayList arrayList3 = this.f5566c;
        if (i7 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    p045n.c cVar = new p045n.c(arrayList2.size() + arrayList.size());
                    cVar.addAll(arrayList);
                    cVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(cVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                i.a(builderA, (String) it2.next());
            }
        }
        ArrayList arrayList4 = this.f5567d;
        if (arrayList4.size() > 0) {
            if (this.f5574l == null) {
                this.f5574l = new Bundle();
            }
            Bundle bundle6 = this.f5574l.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                String string = Integer.toString(i8);
                f fVar2 = (f) arrayList4.get(i8);
                Bundle bundle9 = new Bundle();
                if (fVar2.f5559b == null && (i3 = fVar2.e) != 0) {
                    fVar2.f5559b = IconCompat.b(i3);
                }
                IconCompat iconCompat2 = fVar2.f5559b;
                bundle9.putInt("icon", iconCompat2 != null ? iconCompat2.c() : 0);
                bundle9.putCharSequence("title", fVar2.f5562f);
                bundle9.putParcelable("actionIntent", fVar2.f5563g);
                Bundle bundle10 = fVar2.f5558a;
                Bundle bundle11 = bundle10 != null ? new Bundle(bundle10) : new Bundle();
                bundle11.putBoolean("android.support.allowGeneratedReplies", fVar2.f5560c);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", fVar2.f5561d);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(string, bundle9);
            }
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (this.f5574l == null) {
                this.f5574l = new Bundle();
            }
            this.f5574l.putBundle("android.car.EXTENSIONS", bundle6);
            bundle2.putBundle("android.car.EXTENSIONS", bundle7);
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 24) {
            builderA.setExtras(this.f5574l);
            r4 = 0;
            k.e(builderA, null);
        } else {
            r4 = 0;
        }
        if (i9 >= 26) {
            l.b(builderA, 0);
            l.e(builderA, r4);
            l.f(builderA, r4);
            l.g(builderA, 0L);
            l.d(builderA, 0);
            if (!TextUtils.isEmpty(this.f5576n)) {
                builderA.setSound(r4).setDefaults(0).setLights(0, 0, 0).setVibrate(r4);
            }
        }
        if (i9 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i9 >= 29) {
            n.a(builderA, this.f5577o);
            charSequence = null;
            n.b(builderA, null);
        } else {
            charSequence = null;
        }
        C0104l c0104l = this.f5572j;
        if (c0104l != null) {
            new Notification.BigTextStyle(builderA).setBigContentTitle(charSequence).bigText((CharSequence) c0104l.f1774d);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 && i10 < 24) {
            builderA.setExtras(bundle2);
            notificationBuild = builderA.build();
        } else {
            notificationBuild = builderA.build();
        }
        if (c0104l != null) {
            this.f5572j.getClass();
        }
        if (c0104l != null && (bundle = notificationBuild.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return notificationBuild;
    }

    public final void c(C0104l c0104l) {
        if (this.f5572j != c0104l) {
            this.f5572j = c0104l;
            if (((g) c0104l.e) != this) {
                c0104l.e = this;
                c(c0104l);
            }
        }
    }
}
