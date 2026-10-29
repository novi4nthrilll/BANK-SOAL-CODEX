package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.datastore.preferences.protobuf.C0131m;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class A8 implements D8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H7 f2741b = new H7(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2742a;

    public A8(D8... d8Arr) {
        this.f2742a = d8Arr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.D8
    public M8 a(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            D8 d8 = ((D8[]) this.f2742a)[i3];
            if (d8.b(cls)) {
                return d8.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.D8
    public boolean b(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (((D8[]) this.f2742a)[i3].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i3, int i4) throws C0131m {
        ((C0179c8) this.f2742a).k(i3, (i4 >> 31) ^ (i4 + i4));
    }

    public void d(long j3, int i3) throws C0131m {
        ((C0179c8) this.f2742a).m((j3 >> 63) ^ (j3 + j3), i3);
    }

    public void e(int i3, int i4) throws C0131m {
        ((C0179c8) this.f2742a).k(i3, i4);
    }

    public void f(long j3, int i3) throws C0131m {
        ((C0179c8) this.f2742a).m(j3, i3);
    }

    public void g(int i3, boolean z2) throws C0131m {
        C0179c8 c0179c8 = (C0179c8) this.f2742a;
        c0179c8.l(i3 << 3);
        c0179c8.b(z2 ? (byte) 1 : (byte) 0);
    }

    public void h(int i3, AbstractC0169b8 abstractC0169b8) throws C0131m {
        ((C0179c8) this.f2742a).d(i3, abstractC0169b8);
    }

    public void i(int i3, double d3) throws C0131m {
        ((C0179c8) this.f2742a).g(Double.doubleToRawLongBits(d3), i3);
    }

    public void j(int i3, int i4) throws C0131m {
        C0179c8 c0179c8 = (C0179c8) this.f2742a;
        c0179c8.l(i3 << 3);
        if (i4 >= 0) {
            c0179c8.l(i4);
        } else {
            c0179c8.n(i4);
        }
    }

    public void k(int i3, int i4) throws C0131m {
        ((C0179c8) this.f2742a).e(i3, i4);
    }

    public void l(long j3, int i3) throws C0131m {
        ((C0179c8) this.f2742a).g(j3, i3);
    }

    public void m(int i3, float f3) throws C0131m {
        ((C0179c8) this.f2742a).e(i3, Float.floatToRawIntBits(f3));
    }

    public void n(int i3, Object obj, N8 n8) throws C0131m {
        C0179c8 c0179c8 = (C0179c8) this.f2742a;
        c0179c8.j(i3, 3);
        n8.c((U7) obj, c0179c8.f3005a);
        c0179c8.j(i3, 4);
    }

    public void o(int i3, int i4) throws C0131m {
        C0179c8 c0179c8 = (C0179c8) this.f2742a;
        c0179c8.l(i3 << 3);
        if (i4 >= 0) {
            c0179c8.l(i4);
        } else {
            c0179c8.n(i4);
        }
    }

    public void p(long j3, int i3) throws C0131m {
        ((C0179c8) this.f2742a).m(j3, i3);
    }

    public void q(int i3, Object obj, N8 n8) throws C0131m {
        U7 u7 = (U7) obj;
        C0179c8 c0179c8 = (C0179c8) this.f2742a;
        c0179c8.l((i3 << 3) | 2);
        c0179c8.l(u7.b(n8));
        n8.c(u7, c0179c8.f3005a);
    }

    public void r(int i3, int i4) throws C0131m {
        ((C0179c8) this.f2742a).e(i3, i4);
    }

    public void s(long j3, int i3) throws C0131m {
        ((C0179c8) this.f2742a).g(j3, i3);
    }

    public A8() {
        K8 k8 = K8.f2835c;
        A8 a8 = new A8(H7.f2810d, f2741b);
        Charset charset = AbstractC0348t8.f3460a;
        this.f2742a = a8;
    }

    public A8(C0179c8 c0179c8) {
        Charset charset = AbstractC0348t8.f3460a;
        this.f2742a = c0179c8;
        c0179c8.f3005a = this;
    }
}
