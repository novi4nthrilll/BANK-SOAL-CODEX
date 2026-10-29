package com.google.android.gms.internal.mlkit_vision_face_bundled;

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

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0389y implements n1.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f3490f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n1.c f3491g = new n1.c("key", A0.c.k(A0.c.i(InterfaceC0369w.class, new C0329s(1))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n1.c f3492h = new n1.c("value", A0.c.k(A0.c.i(InterfaceC0369w.class, new C0329s(2))));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0379x f3493i = new C0379x(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f3494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0379x f3497d;
    public final A e = new A(this, 0);

    public C0389y(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C0379x c0379x) {
        this.f3494a = byteArrayOutputStream;
        this.f3495b = map;
        this.f3496c = map2;
        this.f3497d = c0379x;
    }

    public static int e(n1.c cVar) {
        InterfaceC0369w interfaceC0369w = (InterfaceC0369w) cVar.b(InterfaceC0369w.class);
        if (interfaceC0369w != null) {
            return ((C0329s) interfaceC0369w).f3451a;
        }
        throw new n1.b("Field has no @Protobuf config");
    }

    public final void a(n1.c cVar, Object obj, boolean z2) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z2 && charSequence.length() == 0) {
                return;
            }
            g((e(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f3490f);
            g(bytes.length);
            this.f3494a.write(bytes);
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
                f(f3493i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z2 && dDoubleValue == 0.0d) {
                return;
            }
            g((e(cVar) << 3) | 1);
            this.f3494a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z2 && fFloatValue == 0.0f) {
                return;
            }
            g((e(cVar) << 3) | 5);
            this.f3494a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z2 && jLongValue == 0) {
                return;
            }
            InterfaceC0369w interfaceC0369w = (InterfaceC0369w) cVar.b(InterfaceC0369w.class);
            if (interfaceC0369w == null) {
                throw new n1.b("Field has no @Protobuf config");
            }
            g(((C0329s) interfaceC0369w).f3451a << 3);
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
            this.f3494a.write(bArr);
            return;
        }
        n1.d dVar = (n1.d) this.f3495b.get(obj.getClass());
        if (dVar != null) {
            f(dVar, cVar, obj, z2);
            return;
        }
        n1.f fVar = (n1.f) this.f3496c.get(obj.getClass());
        if (fVar != null) {
            A a3 = this.e;
            a3.f2734b = false;
            a3.f2736d = cVar;
            a3.f2735c = z2;
            fVar.a(obj, a3);
            return;
        }
        if (obj instanceof InterfaceC0349u) {
            b(cVar, ((InterfaceC0349u) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(cVar, ((Enum) obj).ordinal(), true);
        } else {
            f(this.f3497d, cVar, obj, z2);
        }
    }

    public final void b(n1.c cVar, int i3, boolean z2) {
        if (z2 && i3 == 0) {
            return;
        }
        InterfaceC0369w interfaceC0369w = (InterfaceC0369w) cVar.b(InterfaceC0369w.class);
        if (interfaceC0369w == null) {
            throw new n1.b("Field has no @Protobuf config");
        }
        g(((C0329s) interfaceC0369w).f3451a << 3);
        g(i3);
    }

    @Override // n1.e
    public final n1.e c(n1.c cVar, Object obj) {
        a(cVar, obj, true);
        return this;
    }

    @Override // n1.e
    public final n1.e d(n1.c cVar, long j3) throws IOException {
        if (j3 != 0) {
            InterfaceC0369w interfaceC0369w = (InterfaceC0369w) cVar.b(InterfaceC0369w.class);
            if (interfaceC0369w == null) {
                throw new n1.b("Field has no @Protobuf config");
            }
            g(((C0329s) interfaceC0369w).f3451a << 3);
            h(j3);
        }
        return this;
    }

    public final void f(n1.d dVar, n1.c cVar, Object obj, boolean z2) throws IOException {
        C0339t c0339t = new C0339t(0);
        c0339t.e = 0L;
        try {
            OutputStream outputStream = this.f3494a;
            this.f3494a = c0339t;
            try {
                dVar.a(obj, this);
                this.f3494a = outputStream;
                long j3 = c0339t.e;
                c0339t.close();
                if (z2 && j3 == 0) {
                    return;
                }
                g((e(cVar) << 3) | 2);
                h(j3);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f3494a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c0339t.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void g(int i3) throws IOException {
        while (true) {
            int i4 = i3 & 127;
            if ((i3 & (-128)) == 0) {
                this.f3494a.write(i4);
                return;
            } else {
                this.f3494a.write(i4 | 128);
                i3 >>>= 7;
            }
        }
    }

    public final void h(long j3) throws IOException {
        while (true) {
            int i3 = ((int) j3) & 127;
            if (((-128) & j3) == 0) {
                this.f3494a.write(i3);
                return;
            } else {
                this.f3494a.write(i3 | 128);
                j3 >>>= 7;
            }
        }
    }
}
