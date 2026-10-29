package Y0;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Z0.a {
    public final X0.a m(X0.b bVar, String str, int i3) {
        Parcel parcelG = g();
        p002a1.a.c(parcelG, bVar);
        parcelG.writeString(str);
        parcelG.writeInt(i3);
        Parcel parcelF = f(parcelG, 2);
        X0.a aVarN = X0.b.n(parcelF.readStrongBinder());
        parcelF.recycle();
        return aVarN;
    }

    public final X0.a n(X0.b bVar, String str, int i3, X0.b bVar2) {
        Parcel parcelG = g();
        p002a1.a.c(parcelG, bVar);
        parcelG.writeString(str);
        parcelG.writeInt(i3);
        p002a1.a.c(parcelG, bVar2);
        Parcel parcelF = f(parcelG, 8);
        X0.a aVarN = X0.b.n(parcelF.readStrongBinder());
        parcelF.recycle();
        return aVarN;
    }

    public final X0.a o(X0.b bVar, String str, int i3) {
        Parcel parcelG = g();
        p002a1.a.c(parcelG, bVar);
        parcelG.writeString(str);
        parcelG.writeInt(i3);
        Parcel parcelF = f(parcelG, 4);
        X0.a aVarN = X0.b.n(parcelF.readStrongBinder());
        parcelF.recycle();
        return aVarN;
    }

    public final X0.a p(X0.b bVar, String str, boolean z2, long j3) {
        Parcel parcelG = g();
        p002a1.a.c(parcelG, bVar);
        parcelG.writeString(str);
        parcelG.writeInt(z2 ? 1 : 0);
        parcelG.writeLong(j3);
        Parcel parcelF = f(parcelG, 7);
        X0.a aVarN = X0.b.n(parcelF.readStrongBinder());
        parcelF.recycle();
        return aVarN;
    }
}
