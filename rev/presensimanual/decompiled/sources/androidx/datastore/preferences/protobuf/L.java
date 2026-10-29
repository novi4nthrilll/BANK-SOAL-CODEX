package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0140w f2234b = new C0140w(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2235a;

    public L(C0132n c0132n) {
        C.a(c0132n, "output");
        this.f2235a = c0132n;
        c0132n.f2326a = this;
    }

    public void a(int i3, boolean z2) {
        ((C0132n) this.f2235a).G(i3, z2);
    }

    public void b(int i3, C0126h c0126h) {
        ((C0132n) this.f2235a).H(i3, c0126h);
    }

    public void c(int i3, double d3) {
        C0132n c0132n = (C0132n) this.f2235a;
        c0132n.getClass();
        c0132n.L(Double.doubleToRawLongBits(d3), i3);
    }

    public void d(int i3, int i4) {
        ((C0132n) this.f2235a).N(i3, i4);
    }

    public void e(int i3, int i4) {
        ((C0132n) this.f2235a).J(i3, i4);
    }

    public void f(long j3, int i3) {
        ((C0132n) this.f2235a).L(j3, i3);
    }

    public void g(int i3, float f3) {
        C0132n c0132n = (C0132n) this.f2235a;
        c0132n.getClass();
        c0132n.J(i3, Float.floatToRawIntBits(f3));
    }

    public void h(int i3, Object obj, c0 c0Var) {
        C0132n c0132n = (C0132n) this.f2235a;
        c0132n.R(i3, 3);
        c0Var.d((AbstractC0119a) obj, c0132n.f2326a);
        c0132n.R(i3, 4);
    }

    public void i(int i3, int i4) {
        ((C0132n) this.f2235a).N(i3, i4);
    }

    public void j(long j3, int i3) {
        ((C0132n) this.f2235a).U(j3, i3);
    }

    public void k(int i3, Object obj, c0 c0Var) {
        C0132n c0132n = (C0132n) this.f2235a;
        AbstractC0119a abstractC0119a = (AbstractC0119a) obj;
        c0132n.R(i3, 2);
        c0132n.T(abstractC0119a.a(c0Var));
        c0Var.d(abstractC0119a, c0132n.f2326a);
    }

    public void l(int i3, int i4) {
        ((C0132n) this.f2235a).J(i3, i4);
    }

    public void m(long j3, int i3) {
        ((C0132n) this.f2235a).L(j3, i3);
    }

    public void n(int i3, int i4) {
        ((C0132n) this.f2235a).S(i3, (i4 >> 31) ^ (i4 << 1));
    }

    public void o(long j3, int i3) {
        ((C0132n) this.f2235a).U((j3 >> 63) ^ (j3 << 1), i3);
    }

    public void p(int i3, int i4) {
        ((C0132n) this.f2235a).S(i3, i4);
    }

    public void q(long j3, int i3) {
        ((C0132n) this.f2235a).U(j3, i3);
    }

    public L() {
        Z z2 = Z.f2263c;
        S s3 = f2234b;
        try {
            s3 = (S) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        S[] sArr = {C0140w.f2351b, s3};
        K k3 = new K();
        k3.f2233a = sArr;
        Charset charset = C.f2218a;
        this.f2235a = k3;
    }
}
