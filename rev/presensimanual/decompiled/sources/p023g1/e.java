package p023g1;

import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new g(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f4493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f4494b;

    public e(Status status, f fVar) {
        this.f4493a = status;
        this.f4494b = fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.b(parcel, 1, this.f4493a, i3);
        AbstractC0522t.b(parcel, 2, this.f4494b, i3);
        AbstractC0522t.g(parcel, iF);
    }
}
