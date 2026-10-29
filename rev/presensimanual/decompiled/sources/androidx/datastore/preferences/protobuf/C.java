package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f2218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f2219b;

    static {
        Charset.forName("US-ASCII");
        f2218a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2219b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0127i(bArr, 0, 0, false).e(0);
        } catch (E e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }
}
