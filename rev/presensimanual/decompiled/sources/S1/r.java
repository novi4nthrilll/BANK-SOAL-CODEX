package S1;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public class r implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f1594a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f1595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f1596c;

    static {
        f1595b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f1596c = Charset.forName("UTF8");
    }

    public static final void c(ByteBuffer byteBuffer, int i3) {
        int iPosition = byteBuffer.position() % i3;
        if (iPosition != 0) {
            byteBuffer.position((byteBuffer.position() + i3) - iPosition);
        }
    }

    public static final int d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i3 = byteBuffer.get() & 255;
        if (i3 < 254) {
            return i3;
        }
        return i3 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static final void g(q qVar, int i3) {
        int size = qVar.size() % i3;
        if (size != 0) {
            for (int i4 = 0; i4 < i3 - size; i4++) {
                qVar.write(0);
            }
        }
    }

    public static final void h(q qVar, int i3) {
        if (f1595b) {
            qVar.write(i3);
            qVar.write(i3 >>> 8);
            qVar.write(i3 >>> 16);
            qVar.write(i3 >>> 24);
            return;
        }
        qVar.write(i3 >>> 24);
        qVar.write(i3 >>> 16);
        qVar.write(i3 >>> 8);
        qVar.write(i3);
    }

    public static final void i(q qVar, long j3) {
        if (f1595b) {
            qVar.write((byte) j3);
            qVar.write((byte) (j3 >>> 8));
            qVar.write((byte) (j3 >>> 16));
            qVar.write((byte) (j3 >>> 24));
            qVar.write((byte) (j3 >>> 32));
            qVar.write((byte) (j3 >>> 40));
            qVar.write((byte) (j3 >>> 48));
            qVar.write((byte) (j3 >>> 56));
            return;
        }
        qVar.write((byte) (j3 >>> 56));
        qVar.write((byte) (j3 >>> 48));
        qVar.write((byte) (j3 >>> 40));
        qVar.write((byte) (j3 >>> 32));
        qVar.write((byte) (j3 >>> 24));
        qVar.write((byte) (j3 >>> 16));
        qVar.write((byte) (j3 >>> 8));
        qVar.write((byte) j3);
    }

    public static final void j(q qVar, int i3) {
        if (i3 < 254) {
            qVar.write(i3);
            return;
        }
        if (i3 > 65535) {
            qVar.write(255);
            h(qVar, i3);
            return;
        }
        qVar.write(254);
        if (f1595b) {
            qVar.write(i3);
            qVar.write(i3 >>> 8);
        } else {
            qVar.write(i3 >>> 8);
            qVar.write(i3);
        }
    }

    @Override // S1.l
    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object objE = e(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return objE;
    }

    @Override // S1.l
    public final ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        k(qVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(qVar.size());
        byteBufferAllocateDirect.put(qVar.a(), 0, qVar.size());
        return byteBufferAllocateDirect;
    }

    public final Object e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return f(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object f(byte b3, ByteBuffer byteBuffer) {
        Object bigInteger;
        Charset charset = f1596c;
        int i3 = 0;
        switch (b3) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                return Integer.valueOf(byteBuffer.getInt());
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                return Long.valueOf(byteBuffer.getLong());
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                byte[] bArr = new byte[d(byteBuffer)];
                byteBuffer.get(bArr);
                bigInteger = new BigInteger(new String(bArr, charset), 16);
                break;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                byte[] bArr2 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr2);
                bigInteger = new String(bArr2, charset);
                break;
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                byte[] bArr3 = new byte[d(byteBuffer)];
                byteBuffer.get(bArr3);
                return bArr3;
            case 9:
                int iD = d(byteBuffer);
                int[] iArr = new int[iD];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position((iD * 4) + byteBuffer.position());
                return iArr;
            case 10:
                int iD2 = d(byteBuffer);
                long[] jArr = new long[iD2];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position((iD2 * 8) + byteBuffer.position());
                return jArr;
            case 11:
                int iD3 = d(byteBuffer);
                double[] dArr = new double[iD3];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position((iD3 * 8) + byteBuffer.position());
                return dArr;
            case 12:
                int iD4 = d(byteBuffer);
                ArrayList arrayList = new ArrayList(iD4);
                while (i3 < iD4) {
                    arrayList.add(e(byteBuffer));
                    i3++;
                }
                return arrayList;
            case 13:
                int iD5 = d(byteBuffer);
                HashMap map = new HashMap();
                while (i3 < iD5) {
                    map.put(e(byteBuffer), e(byteBuffer));
                    i3++;
                }
                return map;
            case 14:
                int iD6 = d(byteBuffer);
                float[] fArr = new float[iD6];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position((iD6 * 4) + byteBuffer.position());
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return bigInteger;
    }

    public void k(q qVar, Object obj) {
        int i3 = 0;
        if (obj == null || obj.equals(null)) {
            qVar.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            qVar.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        boolean z2 = obj instanceof Number;
        Charset charset = f1596c;
        if (z2) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                qVar.write(3);
                h(qVar, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                qVar.write(4);
                i(qVar, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                qVar.write(6);
                g(qVar, 8);
                i(qVar, Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                qVar.write(5);
                byte[] bytes = ((BigInteger) obj).toString(16).getBytes(charset);
                j(qVar, bytes.length);
                qVar.write(bytes, 0, bytes.length);
                return;
            }
        }
        if (obj instanceof CharSequence) {
            qVar.write(7);
            byte[] bytes2 = obj.toString().getBytes(charset);
            j(qVar, bytes2.length);
            qVar.write(bytes2, 0, bytes2.length);
            return;
        }
        if (obj instanceof byte[]) {
            qVar.write(8);
            byte[] bArr = (byte[]) obj;
            j(qVar, bArr.length);
            qVar.write(bArr, 0, bArr.length);
            return;
        }
        if (obj instanceof int[]) {
            qVar.write(9);
            int[] iArr = (int[]) obj;
            j(qVar, iArr.length);
            g(qVar, 4);
            int length = iArr.length;
            while (i3 < length) {
                h(qVar, iArr[i3]);
                i3++;
            }
            return;
        }
        if (obj instanceof long[]) {
            qVar.write(10);
            long[] jArr = (long[]) obj;
            j(qVar, jArr.length);
            g(qVar, 8);
            int length2 = jArr.length;
            while (i3 < length2) {
                i(qVar, jArr[i3]);
                i3++;
            }
            return;
        }
        if (obj instanceof double[]) {
            qVar.write(11);
            double[] dArr = (double[]) obj;
            j(qVar, dArr.length);
            g(qVar, 8);
            int length3 = dArr.length;
            while (i3 < length3) {
                i(qVar, Double.doubleToLongBits(dArr[i3]));
                i3++;
            }
            return;
        }
        if (obj instanceof List) {
            qVar.write(12);
            List list = (List) obj;
            j(qVar, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k(qVar, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            qVar.write(13);
            Map map = (Map) obj;
            j(qVar, map.size());
            for (Map.Entry entry : map.entrySet()) {
                k(qVar, entry.getKey());
                k(qVar, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        qVar.write(14);
        float[] fArr = (float[]) obj;
        j(qVar, fArr.length);
        g(qVar, 4);
        int length4 = fArr.length;
        while (i3 < length4) {
            h(qVar, Float.floatToIntBits(fArr[i3]));
            i3++;
        }
    }
}
