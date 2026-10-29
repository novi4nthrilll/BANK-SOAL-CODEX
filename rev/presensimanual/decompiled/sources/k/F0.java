package k;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends I.c {
    public static final Parcelable.Creator<F0> CREATOR = new I.b(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5028c;

    public F0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5028c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f5028c + "}";
    }

    @Override // I.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeValue(Boolean.valueOf(this.f5028c));
    }
}
