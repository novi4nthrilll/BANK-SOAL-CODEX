package R;

import M.k;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f1408c;

    public b(byte[] bArr, int i3, int i4) {
        this.f1406a = i3;
        this.f1407b = i4;
        this.f1408c = bArr;
    }

    public static b a(long j3, ByteOrder byteOrder) {
        long[] jArr = {j3};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[e.f1422q[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new b(byteBufferWrap.array(), 4, 1);
    }

    public static b b(d dVar, ByteOrder byteOrder) {
        d[] dVarArr = {dVar};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[e.f1422q[5]]);
        byteBufferWrap.order(byteOrder);
        d dVar2 = dVarArr[0];
        byteBufferWrap.putInt((int) dVar2.f1413a);
        byteBufferWrap.putInt((int) dVar2.f1414b);
        return new b(byteBufferWrap.array(), 5, 1);
    }

    public static b c(int i3, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[e.f1422q[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i3}[0]);
        return new b(byteBufferWrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objG instanceof String) {
            return Double.parseDouble((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof d[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        d[] dVarArr = (d[]) objG;
        if (dVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        d dVar = dVarArr[0];
        return dVar.f1413a / dVar.f1414b;
    }

    public final int e(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objG instanceof String) {
            return Integer.parseInt((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objG;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            return null;
        }
        if (objG instanceof String) {
            return (String) objG;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            while (i3 < jArr.length) {
                sb.append(jArr[i3]);
                i3++;
                if (i3 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            while (i3 < iArr.length) {
                sb.append(iArr[i3]);
                i3++;
                if (i3 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            while (i3 < dArr.length) {
                sb.append(dArr[i3]);
                i3++;
                if (i3 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objG instanceof d[])) {
            return null;
        }
        d[] dVarArr = (d[]) objG;
        while (i3 < dVarArr.length) {
            sb.append(dVarArr[i3].f1413a);
            sb.append('/');
            sb.append(dVarArr[i3].f1414b);
            i3++;
            if (i3 != dVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [R.d[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [R.d[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    public final Serializable g(ByteOrder byteOrder) throws Throwable {
        a aVar;
        InputStream inputStream;
        byte b3;
        int length = 0;
        byte[] bArr = this.f1408c;
        InputStream inputStream2 = null;
        try {
            try {
                aVar = new a(bArr);
                try {
                    aVar.e = byteOrder;
                    int i3 = this.f1406a;
                    int i4 = this.f1407b;
                    switch (i3) {
                        case 1:
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (bArr.length != 1 || (b3 = bArr[0]) < 0 || b3 > 1) {
                                String str = new String(bArr, e.f1430z);
                                try {
                                    aVar.close();
                                    break;
                                } catch (IOException e) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b3 + 48)});
                            try {
                                aVar.close();
                                break;
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                            }
                            return str2;
                        case 2:
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (i4 >= e.f1423r.length) {
                                int i5 = 0;
                                while (true) {
                                    byte[] bArr2 = e.f1423r;
                                    if (i5 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (bArr[i5] == bArr2[i5]) {
                                        i5++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            try {
                                while (length < i4) {
                                    byte b4 = bArr[length];
                                    if (b4 == 0) {
                                        String string = sb.toString();
                                        aVar.close();
                                        return string;
                                    }
                                    if (b4 >= 32) {
                                        sb.append((char) b4);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                aVar.close();
                                break;
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                            }
                            String string2 = sb.toString();
                            return string2;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            ?? r15 = new int[i4];
                            while (length < i4) {
                                r15[length] = aVar.readUnsignedShort();
                                length++;
                            }
                            try {
                                aVar.close();
                                break;
                            } catch (IOException e5) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                            }
                            return r15;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            ?? r16 = new long[i4];
                            while (length < i4) {
                                r16[length] = ((long) aVar.readInt()) & 4294967295L;
                                length++;
                            }
                            try {
                                aVar.close();
                                break;
                            } catch (IOException e6) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                            }
                            return r16;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            ?? r17 = new d[i4];
                            while (length < i4) {
                                r17[length] = new d(((long) aVar.readInt()) & 4294967295L, ((long) aVar.readInt()) & 4294967295L);
                                length++;
                            }
                            try {
                                aVar.close();
                                break;
                            } catch (IOException e7) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                            }
                            return r17;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            ?? r18 = new int[i4];
                            while (length < i4) {
                                r18[length] = aVar.readShort();
                                length++;
                            }
                            try {
                                aVar.close();
                                break;
                            } catch (IOException e8) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                            }
                            return r18;
                        case 9:
                            ?? r19 = new int[i4];
                            while (length < i4) {
                                r19[length] = aVar.readInt();
                                length++;
                            }
                            try {
                                aVar.close();
                                break;
                            } catch (IOException e9) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                            }
                            return r19;
                        case 10:
                            ?? r110 = new d[i4];
                            while (length < i4) {
                                r110[length] = new d(aVar.readInt(), aVar.readInt());
                                length++;
                            }
                            try {
                                aVar.close();
                                break;
                            } catch (IOException e10) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                            }
                            return r110;
                        case 11:
                            ?? r111 = new double[i4];
                            while (length < i4) {
                                r111[length] = aVar.readFloat();
                                length++;
                            }
                            try {
                                aVar.close();
                                break;
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                            }
                            return r111;
                        case 12:
                            ?? r112 = new double[i4];
                            while (length < i4) {
                                r112[length] = aVar.readDouble();
                                length++;
                            }
                            try {
                                aVar.close();
                                break;
                            } catch (IOException e12) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            }
                            return r112;
                        default:
                            try {
                                aVar.close();
                                break;
                            } catch (IOException e13) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                            }
                            return null;
                    }
                } catch (IOException e14) {
                    e = e14;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (aVar != null) {
                        try {
                            aVar.close();
                        } catch (IOException e15) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e16) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                    }
                }
                throw th;
            }
        } catch (IOException e17) {
            e = e17;
            aVar = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public final String toString() {
        return "(" + e.f1421p[this.f1406a] + ", data length:" + this.f1408c.length + ")";
    }
}
