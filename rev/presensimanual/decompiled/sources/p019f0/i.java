package p019f0;

import B2.h;
import N.d;
import java.math.BigInteger;
import p055q2.e;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f4466i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4467d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f4470h = new e(new d(4, this));

    static {
        new i(0, 0, 0, "");
        f4466i = new i(0, 1, 0, "");
        new i(1, 0, 0, "");
    }

    public i(int i3, int i4, int i5, String str) {
        this.f4467d = i3;
        this.e = i4;
        this.f4468f = i5;
        this.f4469g = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        h.e(iVar, "other");
        Object objA = this.f4470h.a();
        h.d(objA, "<get-bigInteger>(...)");
        Object objA2 = iVar.f4470h.a();
        h.d(objA2, "<get-bigInteger>(...)");
        return ((BigInteger) objA).compareTo((BigInteger) objA2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f4467d == iVar.f4467d && this.e == iVar.e && this.f4468f == iVar.f4468f;
    }

    public final int hashCode() {
        return ((((527 + this.f4467d) * 31) + this.e) * 31) + this.f4468f;
    }

    public final String toString() {
        String str;
        String str2 = this.f4469g;
        if (H2.i.e(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f4467d + '.' + this.e + '.' + this.f4468f + str;
    }
}
