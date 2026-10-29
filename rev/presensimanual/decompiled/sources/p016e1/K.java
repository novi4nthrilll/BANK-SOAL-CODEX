package p016e1;

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
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class K implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f4052f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f4053g = new c("key", A0.c.k(I.i(I.class, new F(1))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f4054h = new c("value", A0.c.k(I.i(I.class, new F(2))));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final J f4055i = J.f4047b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f4056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f4059d;
    public final A e = new A(this, 2);

    public K(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, J j3) {
        this.f4056a = byteArrayOutputStream;
        this.f4057b = map;
        this.f4058c = map2;
        this.f4059d = j3;
    }

    public static int e(c cVar) {
        I i3 = (I) cVar.b(I.class);
        if (i3 != null) {
            return ((F) i3).f4033a;
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
            byte[] bytes = charSequence.toString().getBytes(f4052f);
            g(bytes.length);
            this.f4056a.write(bytes);
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
                f(f4055i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z2 && dDoubleValue == 0.0d) {
                return;
            }
            g((e(cVar) << 3) | 1);
            this.f4056a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z2 && fFloatValue == 0.0f) {
                return;
            }
            g((e(cVar) << 3) | 5);
            this.f4056a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z2 && jLongValue == 0) {
                return;
            }
            I i3 = (I) cVar.b(I.class);
            if (i3 == null) {
                throw new b("Field has no @Protobuf config");
            }
            g(((F) i3).f4033a << 3);
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
            this.f4056a.write(bArr);
            return;
        }
        d dVar = (d) this.f4057b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z2);
            return;
        }
        f fVar = (f) this.f4058c.get(obj.getClass());
        if (fVar != null) {
            A a3 = this.e;
            a3.f2734b = false;
            a3.f2736d = cVar;
            a3.f2735c = z2;
            fVar.a(obj, a3);
            return;
        }
        if (obj instanceof G) {
            b(cVar, ((G) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f4059d, cVar, obj, z2);
        }
    }

    public final void b(c cVar, int i3, boolean z2) {
        if (z2 && i3 == 0) {
            return;
        }
        I i4 = (I) cVar.b(I.class);
        if (i4 == null) {
            throw new b("Field has no @Protobuf config");
        }
        g(((F) i4).f4033a << 3);
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
            I i3 = (I) cVar.b(I.class);
            if (i3 == null) {
                throw new b("Field has no @Protobuf config");
            }
            g(((F) i3).f4033a << 3);
            h(j3);
        }
        return this;
    }

    public final void f(d dVar, c cVar, Object obj, boolean z2) throws IOException {
        C0339t c0339t = new C0339t(2);
        c0339t.e = 0L;
        try {
            OutputStream outputStream = this.f4056a;
            this.f4056a = c0339t;
            try {
                dVar.a(obj, this);
                this.f4056a = outputStream;
                long j3 = c0339t.e;
                c0339t.close();
                if (z2 && j3 == 0) {
                    return;
                }
                g((e(cVar) << 3) | 2);
                h(j3);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f4056a = outputStream;
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
            OutputStream outputStream = this.f4056a;
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
            OutputStream outputStream = this.f4056a;
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
