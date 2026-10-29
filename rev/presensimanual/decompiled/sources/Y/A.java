package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class A extends I.c {
    public static final Parcelable.Creator<A> CREATOR = new I.b(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f1810c;

    public A(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1810c = parcel.readParcelable(classLoader == null ? s.class.getClassLoader() : classLoader);
    }

    @Override // I.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.f1810c, 0);
    }
}
