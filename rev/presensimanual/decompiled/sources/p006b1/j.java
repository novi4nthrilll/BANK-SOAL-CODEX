package p006b1;

import B2.h;
import G.i;
import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new i(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2531d;
    public final r e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f2532f;

    static {
        Process.myUid();
        Process.myPid();
    }

    public j(int i3, String str, String str2, String str3, ArrayList arrayList, j jVar) {
        h.e(str, "packageName");
        if (jVar != null && jVar.f2532f != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f2528a = i3;
        this.f2529b = str;
        this.f2530c = str2;
        this.f2531d = str3 == null ? jVar != null ? jVar.f2531d : null : str3;
        Collection collection = arrayList;
        if (arrayList == null) {
            r rVar = jVar != null ? jVar.e : null;
            collection = rVar;
            if (rVar == null) {
                p pVar = r.e;
                s sVar = s.f2552h;
                h.d(sVar, "of(...)");
                collection = sVar;
            }
        }
        p pVar2 = r.e;
        Object[] array = collection.toArray();
        int length = array.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (array[i4] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 9);
                sb.append("at index ");
                sb.append(i4);
                throw new NullPointerException(sb.toString());
            }
        }
        s sVar2 = length == 0 ? s.f2552h : new s(length, array);
        h.d(sVar2, "copyOf(...)");
        this.e = sVar2;
        this.f2532f = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f2528a == jVar.f2528a && h.a(this.f2529b, jVar.f2529b) && h.a(this.f2530c, jVar.f2530c) && h.a(this.f2531d, jVar.f2531d) && h.a(this.f2532f, jVar.f2532f) && h.a(this.e, jVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2528a), this.f2529b, this.f2530c, this.f2531d, this.f2532f});
    }

    public final String toString() {
        String str = this.f2529b;
        int length = str.length() + 18;
        String str2 = this.f2530c;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.f2528a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (H2.i.h(str2, str)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.f2531d;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        String string = sb.toString();
        h.d(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        h.e(parcel, "dest");
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f2528a);
        AbstractC0522t.c(parcel, 3, this.f2529b);
        AbstractC0522t.c(parcel, 4, this.f2530c);
        AbstractC0522t.c(parcel, 6, this.f2531d);
        AbstractC0522t.b(parcel, 7, this.f2532f, i3);
        AbstractC0522t.e(parcel, 8, this.e);
        AbstractC0522t.g(parcel, iF);
    }
}
