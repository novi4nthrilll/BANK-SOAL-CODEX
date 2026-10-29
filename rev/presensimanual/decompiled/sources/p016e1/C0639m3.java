package p016e1;

import E0.k;
import O0.u;
import java.util.Arrays;

/* JADX INFO: renamed from: e1.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0639m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0627k3 f4246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0609h3 f4247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC0633l3 f4248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC0615i3 f4249d;
    public final Boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f4250f;

    public /* synthetic */ C0639m3(k kVar) {
        this.f4246a = (EnumC0627k3) kVar.f226d;
        this.f4247b = (EnumC0609h3) kVar.e;
        this.f4248c = (EnumC0633l3) kVar.f227f;
        this.f4249d = (EnumC0615i3) kVar.f228g;
        this.e = (Boolean) kVar.f229h;
        this.f4250f = (Float) kVar.f230i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0639m3)) {
            return false;
        }
        C0639m3 c0639m3 = (C0639m3) obj;
        return u.i(this.f4246a, c0639m3.f4246a) && u.i(this.f4247b, c0639m3.f4247b) && u.i(this.f4248c, c0639m3.f4248c) && u.i(this.f4249d, c0639m3.f4249d) && u.i(this.e, c0639m3.e) && u.i(this.f4250f, c0639m3.f4250f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4246a, this.f4247b, this.f4248c, this.f4249d, this.e, this.f4250f});
    }
}
