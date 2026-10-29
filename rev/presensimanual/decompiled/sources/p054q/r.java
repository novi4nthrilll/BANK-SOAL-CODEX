package p054q;

import android.app.Notification;
import android.os.Parcel;
import p004b.a;
import p004b.c;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f5582c;

    public r(String str, int i3, Notification notification) {
        this.f5580a = str;
        this.f5581b = i3;
        this.f5582c = notification;
    }

    public final void a(c cVar) {
        String str = this.f5580a;
        int i3 = this.f5581b;
        a aVar = (a) cVar;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.f2513a);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i3);
            parcelObtain.writeString(null);
            Notification notification = this.f5582c;
            parcelObtain.writeInt(1);
            notification.writeToParcel(parcelObtain, 0);
            aVar.f2511b.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.f5580a + ", id:" + this.f5581b + ", tag:null]";
    }
}
