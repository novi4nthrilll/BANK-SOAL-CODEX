package B;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final X f64b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X f65a;

    static {
        O m3;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            m3 = new N();
        } else {
            m3 = i3 >= 29 ? new M() : new K();
        }
        f64b = m3.b().f67a.a().f67a.b().f67a.c();
    }

    public W(X x3) {
        this.f65a = x3;
    }

    public X a() {
        return this.f65a;
    }

    public X b() {
        return this.f65a;
    }

    public X c() {
        return this.f65a;
    }

    public C0005f e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w3 = (W) obj;
        return j() == w3.j() && i() == w3.i() && Objects.equals(g(), w3.g()) && Objects.equals(f(), w3.f()) && Objects.equals(e(), w3.e());
    }

    public p064t.c f() {
        return p064t.c.e;
    }

    public p064t.c g() {
        return p064t.c.e;
    }

    public X h(int i3, int i4, int i5, int i6) {
        return f64b;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(j()), Boolean.valueOf(i()), g(), f(), e());
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public void d(View view) {
    }

    public void k(p064t.c[] cVarArr) {
    }

    public void l(X x3) {
    }

    public void m(p064t.c cVar) {
    }
}
