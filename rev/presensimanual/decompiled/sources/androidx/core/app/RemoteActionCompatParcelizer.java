package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p012d0.a;
import p012d0.b;
import p012d0.c;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f2175a;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f2175a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f2176b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).e);
        }
        remoteActionCompat.f2176b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2177c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).e);
        }
        remoteActionCompat.f2177c = charSequence2;
        remoteActionCompat.f2178d = (PendingIntent) aVar.f(remoteActionCompat.f2178d, 4);
        boolean z2 = remoteActionCompat.e;
        if (aVar.e(5)) {
            z2 = ((b) aVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f2179f;
        if (aVar.e(6)) {
            z3 = ((b) aVar).e.readInt() != 0;
        }
        remoteActionCompat.f2179f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f2175a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2176b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f2177c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f2178d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.e;
        aVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f2179f;
        aVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
