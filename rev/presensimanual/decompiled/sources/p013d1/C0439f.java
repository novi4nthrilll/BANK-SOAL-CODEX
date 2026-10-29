package p013d1;

import com.google.android.gms.internal.mlkit_vision_face_bundled.A;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0339t;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import n1.b;
import n1.c;
import n1.d;
import n1.e;
import n1.f;

/* JADX INFO: renamed from: d1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0439f implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f3722f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f3723g = new c("key", A0.c.k(A0.c.j(InterfaceC0427d.class, new C0409a(1))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f3724h = new c("value", A0.c.k(A0.c.j(InterfaceC0427d.class, new C0409a(2))));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0433e f3725i = C0433e.f3710b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f3726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0433e f3729d;
    public final A e = new A(this, 1);

    public C0439f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C0433e c0433e) {
        this.f3726a = byteArrayOutputStream;
        this.f3727b = map;
        this.f3728c = map2;
        this.f3729d = c0433e;
    }

    public static int e(c cVar) {
        InterfaceC0427d interfaceC0427d = (InterfaceC0427d) cVar.b(InterfaceC0427d.class);
        if (interfaceC0427d != null) {
            return ((C0409a) interfaceC0427d).f3684a;
        }
        throw new b("Field has no @Protobuf config");
    }

    public final void a(c cVar, Object obj, boolean z2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z2 && charSequence.length() == 0) {
                return;
            }
            g((e(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f3722f);
            g(bytes.length);
            this.f3726a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                a(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                f(f3725i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z2 && dDoubleValue == 0.0d) {
                return;
            }
            g((e(cVar) << 3) | 1);
            this.f3726a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z2 && fFloatValue == 0.0f) {
                return;
            }
            g((e(cVar) << 3) | 5);
            this.f3726a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z2 && jLongValue == 0) {
                return;
            }
            InterfaceC0427d interfaceC0427d = (InterfaceC0427d) cVar.b(InterfaceC0427d.class);
            if (interfaceC0427d == null) {
                throw new b("Field has no @Protobuf config");
            }
            g(((C0409a) interfaceC0427d).f3684a << 3);
            h(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z2);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z2 && bArr.length == 0) {
                return;
            }
            g((e(cVar) << 3) | 2);
            g(bArr.length);
            this.f3726a.write(bArr);
            return;
        }
        d dVar = (d) this.f3727b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z2);
            return;
        }
        f fVar = (f) this.f3728c.get(obj.getClass());
        if (fVar != null) {
            A a3 = this.e;
            a3.f2734b = false;
            a3.f2736d = cVar;
            a3.f2735c = z2;
            fVar.a(obj, a3);
            return;
        }
        if (obj instanceof InterfaceC0415b) {
            b(cVar, ((InterfaceC0415b) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f3729d, cVar, obj, z2);
        }
    }

    public final void b(c cVar, int i3, boolean z2) {
        if (z2 && i3 == 0) {
            return;
        }
        InterfaceC0427d interfaceC0427d = (InterfaceC0427d) cVar.b(InterfaceC0427d.class);
        if (interfaceC0427d == null) {
            throw new b("Field has no @Protobuf config");
        }
        g(((C0409a) interfaceC0427d).f3684a << 3);
        g(i3);
    }

    @Override // n1.e
    public final e c(c cVar, Object obj) {
        a(cVar, obj, true);
        return this;
    }

    @Override // n1.e
    public final e d(c cVar, long j3) throws IOException {
        if (j3 != 0) {
            InterfaceC0427d interfaceC0427d = (InterfaceC0427d) cVar.b(InterfaceC0427d.class);
            if (interfaceC0427d == null) {
                throw new b("Field has no @Protobuf config");
            }
            g(((C0409a) interfaceC0427d).f3684a << 3);
            h(j3);
        }
        return this;
    }

    public final void f(d dVar, c cVar, Object obj, boolean z2) throws IOException {
        C0339t c0339t = new C0339t(1);
        c0339t.e = 0L;
        try {
            OutputStream outputStream = this.f3726a;
            this.f3726a = c0339t;
            try {
                dVar.a(obj, this);
                this.f3726a = outputStream;
                long j3 = c0339t.e;
                c0339t.close();
                if (z2 && j3 == 0) {
                    return;
                }
                g((e(cVar) << 3) | 2);
                h(j3);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f3726a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c0339t.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void g(int i3) throws IOException {
        while (true) {
            long j3 = i3 & (-128);
            OutputStream outputStream = this.f3726a;
            if (j3 == 0) {
                outputStream.write(i3 & 127);
                return;
            } else {
                outputStream.write((i3 & 127) | 128);
                i3 >>>= 7;
            }
        }
    }

    public final void h(long j3) throws IOException {
        while (true) {
            long j4 = (-128) & j3;
            OutputStream outputStream = this.f3726a;
            if (j4 == 0) {
                outputStream.write(((int) j3) & 127);
                return;
            } else {
                outputStream.write((((int) j3) & 127) | 128);
                j3 >>>= 7;
            }
        }
    }
}
