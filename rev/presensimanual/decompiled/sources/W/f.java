package W;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p071w1.b f1661a = new p071w1.b(5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f1662b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f1663c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f1664d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f1665f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f1666g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f1667h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f1668i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f1669j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int length = 0;
        for (c cVar : cVarArr) {
            length += ((((cVar.f1658g * 2) + 7) & (-8)) / 8) + (cVar.e * 2) + d(cVar.f1653a, cVar.f1654b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f1657f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f1665f)) {
            for (c cVar2 : cVarArr) {
                p(byteArrayOutputStream, cVar2, d(cVar2.f1653a, cVar2.f1654b, bArr));
                r(byteArrayOutputStream, cVar2);
                int[] iArr = cVar2.f1659h;
                int length2 = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2) {
                    int i5 = iArr[i3];
                    u(byteArrayOutputStream, i5 - i4);
                    i3++;
                    i4 = i5;
                }
                q(byteArrayOutputStream, cVar2);
            }
        } else {
            for (c cVar3 : cVarArr) {
                p(byteArrayOutputStream, cVar3, d(cVar3.f1653a, cVar3.f1654b, bArr));
            }
            for (c cVar4 : cVarArr) {
                r(byteArrayOutputStream, cVar4);
                int[] iArr2 = cVar4.f1659h;
                int length3 = iArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length3) {
                    int i8 = iArr2[i6];
                    u(byteArrayOutputStream, i8 - i7);
                    i6++;
                    i7 = i8;
                }
                q(byteArrayOutputStream, cVar4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = c(file2) && z2;
        }
        return z2;
    }

    public static String d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f1667h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f1666g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            return ":".equals(obj) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return I.h(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i3) throws IOException {
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = inputStream.read(bArr, i4, i3 - i4);
            if (i5 < 0) {
                throw new IllegalStateException(I.f("Not enough bytes to read: ", i3));
            }
            i4 += i5;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int iM = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i4] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i3, int i4) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i4];
            byte[] bArr2 = new byte[2048];
            int i5 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i5 < i3) {
                int i6 = fileInputStream.read(bArr2);
                if (i6 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i3 + " bytes");
                }
                inflater.setInput(bArr2, 0, i6);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i4 - iInflate);
                    i5 += i6;
                } catch (DataFormatException e3) {
                    throw new IllegalStateException(e3.getMessage());
                }
            }
            if (i5 == i3) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i3 + " actual=" + i5);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) throws IOException {
        byte[] bArr3 = f1668i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f1669j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                c[] cVarArrK = k(byteArrayInputStream, bArr2, iM, cVarArr);
                byteArrayInputStream.close();
                return cVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f1664d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            c[] cVarArrJ = j(byteArrayInputStream2, iM2, cVarArr);
            byteArrayInputStream2.close();
            return cVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i3, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i4] = (int) m(byteArrayInputStream, 2);
            strArr[i4] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i5 = 0; i5 < i3; i5++) {
            c cVar = cVarArr[i5];
            if (!cVar.f1654b.equals(strArr[i5])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i6 = iArr[i5];
            cVar.e = i6;
            cVar.f1659h = g(byteArrayInputStream, i6);
        }
        return cVarArr;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, c[] cVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 != cVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i4 = 0; i4 < i3; i4++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            c cVar = null;
            if (cVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i5 = 0; i5 < cVarArr.length; i5++) {
                    if (cVarArr[i5].f1654b.equals(strSubstring)) {
                        cVar = cVarArr[i5];
                        break;
                    }
                }
            }
            if (cVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            cVar.f1656d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f1667h)) {
                cVar.e = iM;
                cVar.f1659h = iArrG;
            }
        }
        return cVarArr;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            c[] cVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return cVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i3) throws IOException {
        byte[] bArrF = f(inputStream, i3);
        long j3 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j3 += ((long) (bArrF[i4] & 255)) << (i4 * 8);
        }
        return j3;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i3) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            cVarArr[i4] = new c(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        for (int i5 = 0; i5 < i3; i5++) {
            c cVar = cVarArr[i5];
            int iAvailable = byteArrayInputStream.available() - cVar.f1657f;
            int iM3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = cVar.f1660i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                for (int iM4 = (int) m(byteArrayInputStream, 2); iM4 > 0; iM4--) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            cVar.f1659h = g(byteArrayInputStream, cVar.e);
            int i6 = cVar.f1658g;
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = bitSetValueOf.get(i7) ? 2 : 0;
                if (bitSetValueOf.get(i7 + i6)) {
                    i8 |= 4;
                }
                if (i8 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i7));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i7), Integer.valueOf(i8 | num.intValue()));
                }
            }
        }
        return cVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) throws IOException {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f1664d;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(cVarArr, bArr3);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                t(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f1666g;
            if (Arrays.equals(bArr, bArr4)) {
                t(byteArrayOutputStream, cVarArr.length, 1);
                for (c cVar : cVarArr) {
                    int size = cVar.f1660i.size() * 4;
                    String strD = d(cVar.f1653a, cVar.f1654b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream, strD.getBytes(charset).length);
                    u(byteArrayOutputStream, cVar.f1659h.length);
                    t(byteArrayOutputStream, size, 4);
                    t(byteArrayOutputStream, cVar.f1655c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = cVar.f1660i.keySet().iterator();
                    while (it.hasNext()) {
                        u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        u(byteArrayOutputStream, 0);
                    }
                    for (int i4 : cVar.f1659h) {
                        u(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr5 = f1665f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(cVarArr, bArr5);
                t(byteArrayOutputStream, cVarArr.length, 1);
                t(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                t(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f1667h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            u(byteArrayOutputStream, cVarArr.length);
            for (c cVar2 : cVarArr) {
                String strD2 = d(cVar2.f1653a, cVar2.f1654b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, strD2.getBytes(charset2).length);
                TreeMap treeMap = cVar2.f1660i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, cVar2.f1659h.length);
                t(byteArrayOutputStream, cVar2.f1655c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : cVar2.f1659h) {
                    u(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            u(byteArrayOutputStream2, cVarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (c cVar3 : cVarArr) {
                t(byteArrayOutputStream2, cVar3.f1655c, 4);
                t(byteArrayOutputStream2, cVar3.f1656d, 4);
                t(byteArrayOutputStream2, cVar3.f1658g, 4);
                String strD3 = d(cVar3.f1653a, cVar3.f1654b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                u(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            o oVar = new o(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(oVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < cVarArr.length) {
                try {
                    c cVar4 = cVarArr[i8];
                    u(byteArrayOutputStream3, i8);
                    u(byteArrayOutputStream3, cVar4.e);
                    i9 = i9 + 4 + (cVar4.e * 2);
                    int[] iArr = cVar4.f1659h;
                    int length3 = iArr.length;
                    int i10 = 0;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        u(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            o oVar2 = new o(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(oVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < cVarArr.length) {
                try {
                    c cVar5 = cVarArr[i12];
                    Iterator it3 = cVar5.f1660i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        q(byteArrayOutputStream5, cVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            r(byteArrayOutputStream6, cVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            u(byteArrayOutputStream4, i12);
                            int length4 = byteArray3.length + i6 + byteArray4.length;
                            int i14 = i13 + 6;
                            ArrayList arrayList4 = arrayList3;
                            t(byteArrayOutputStream4, length4, 4);
                            u(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i13 = i14 + length4;
                            i12++;
                            arrayList3 = arrayList4;
                            i6 = 2;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            o oVar3 = new o(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(oVar3);
            long j4 = 4;
            long size2 = j4 + j4 + 4 + ((long) (arrayList2.size() * 16));
            t(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                o oVar4 = (o) arrayList2.get(i15);
                int i16 = oVar4.f1681a;
                if (i16 == 1) {
                    j3 = 0;
                } else if (i16 == 2) {
                    j3 = 1;
                } else if (i16 == 3) {
                    j3 = 2;
                } else if (i16 == 4) {
                    j3 = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    j3 = 4;
                }
                t(byteArrayOutputStream, j3, 4);
                t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = oVar4.f1682b;
                if (oVar4.f1683c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    t(byteArrayOutputStream, bArrA3.length, 4);
                    t(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    t(byteArrayOutputStream, bArr7.length, 4);
                    t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, cVar.e);
        t(byteArrayOutputStream, cVar.f1657f, 4);
        t(byteArrayOutputStream, cVar.f1655c, 4);
        t(byteArrayOutputStream, cVar.f1658g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        byte[] bArr = new byte[(((cVar.f1658g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f1660i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i3 = iIntValue / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i4 = iIntValue + cVar.f1658g;
                int i5 = i4 / 8;
                bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, c cVar) throws IOException {
        int i3 = 0;
        for (Map.Entry entry : cVar.f1660i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, iIntValue - i3);
                u(byteArrayOutputStream, 0);
                i3 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x018b A[Catch: all -> 0x01a1, TRY_LEAVE, TryCatch #1 {all -> 0x01a1, blocks: (B:101:0x017f, B:103:0x018b, B:114:0x01a4, B:115:0x01a9), top: B:237:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a4 A[Catch: all -> 0x01a1, TRY_ENTER, TryCatch #1 {all -> 0x01a1, blocks: (B:101:0x017f, B:103:0x018b, B:114:0x01a4, B:115:0x01a9), top: B:237:0x017f }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x01b6 A[Catch: IllegalStateException -> 0x019a, IOException -> 0x019c, FileNotFoundException -> 0x019f, TRY_LEAVE, TryCatch #29 {FileNotFoundException -> 0x019f, IOException -> 0x019c, IllegalStateException -> 0x019a, blocks: (B:99:0x0177, B:104:0x0195, B:123:0x01b6, B:121:0x01b3, B:120:0x01b0), top: B:278:0x0177 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:134:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f0 A[Catch: all -> 0x01ff, TRY_LEAVE, TryCatch #20 {all -> 0x01ff, blocks: (B:140:0x01e4, B:142:0x01f0, B:151:0x0202), top: B:255:0x01e4, outer: #32 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0202 A[Catch: all -> 0x01ff, TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x01ff, blocks: (B:140:0x01e4, B:142:0x01f0, B:151:0x0202), top: B:255:0x01e4, outer: #32 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0220  */
    /* JADX WARN: Code duplicated, block: B:167:0x022a  */
    /* JADX WARN: Code duplicated, block: B:168:0x022e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0248 A[Catch: all -> 0x026b, TRY_LEAVE, TryCatch #10 {all -> 0x026b, blocks: (B:173:0x0240, B:174:0x0242, B:176:0x0248), top: B:240:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x029a  */
    /* JADX WARN: Code duplicated, block: B:222:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:227:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:229:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:237:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0232 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x024d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0161  */
    public static void s(Context context, Executor executor, e eVar, boolean z2) throws Throwable {
        byte[] bArr;
        FileInputStream fileInputStreamA;
        IOException iOException;
        int i3;
        c[] cVarArrL;
        c[] cVarArr;
        b bVar;
        e eVar2;
        c[] cVarArr2;
        byte[] bArr2;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i4;
        byte[] bArr4;
        ByteArrayOutputStream byteArrayOutputStream;
        int i5;
        FileInputStream fileInputStreamA2;
        boolean z4;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j3 = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j3 == packageInfo.lastUpdateTime;
                            if (z5) {
                                eVar.d(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    n.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i6 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            b bVar2 = new b(assets, executor, eVar, name, file2);
            byte[] bArr5 = bVar2.f1648c;
            if (bArr5 == null) {
                bVar2.b(3, Integer.valueOf(i6));
            } else {
                try {
                    try {
                        if (file2.exists()) {
                            if (!file2.canWrite()) {
                                bVar2.b(4, null);
                            }
                            if (z3 || !z2) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            n.c(context, z4);
                        }
                        try {
                            file2.createNewFile();
                        } catch (IOException unused2) {
                            bVar2.b(4, null);
                            z3 = false;
                        }
                        fileInputStreamA = bVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e3) {
                        eVar.d(6, e3);
                        fileInputStreamA = null;
                    } catch (IOException e4) {
                        eVar.d(7, e4);
                        fileInputStreamA = null;
                    }
                    if (fileInputStreamA != null) {
                        try {
                            if (!Arrays.equals(bArr, f(fileInputStreamA, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            cVarArrL = l(fileInputStreamA, f(fileInputStreamA, 4), bVar2.e);
                            try {
                                fileInputStreamA.close();
                            } catch (IOException e5) {
                                eVar.d(7, e5);
                            }
                            bVar2.f1651g = cVarArrL;
                        } catch (IOException e6) {
                            i3 = 7;
                            eVar.d(7, e6);
                            try {
                                fileInputStreamA.close();
                            } catch (IOException e7) {
                                iOException = e7;
                                eVar.d(i3, iOException);
                                cVarArrL = null;
                                bVar2.f1651g = cVarArrL;
                                cVarArr = bVar2.f1651g;
                                if (cVarArr != null) {
                                    bVar = bVar2;
                                } else {
                                    bVar = bVar2;
                                }
                                eVar2 = bVar.f1647b;
                                cVarArr2 = bVar.f1651g;
                                if (cVarArr2 != null) {
                                    if (!bVar.f1650f) {
                                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    }
                                    try {
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        try {
                                            byteArrayOutputStream.write(bArr);
                                            byteArrayOutputStream.write(bArr4);
                                            if (o(byteArrayOutputStream, bArr4, cVarArr2)) {
                                                bVar.f1652h = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                bVar.f1651g = null;
                                            } else {
                                                eVar2.d(5, null);
                                                bVar.f1651g = null;
                                                byteArrayOutputStream.close();
                                            }
                                        } catch (Throwable th4) {
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th4;
                                            } catch (Throwable th5) {
                                                th4.addSuppressed(th5);
                                                throw th4;
                                            }
                                        }
                                    } catch (IOException e8) {
                                        eVar2.d(7, e8);
                                    } catch (IllegalStateException e9) {
                                        eVar2.d(8, e9);
                                    }
                                }
                                bArr2 = bVar.f1652h;
                                if (bArr2 == null) {
                                    z3 = false;
                                } else {
                                    try {
                                        if (!bVar.f1650f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            try {
                                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                try {
                                                    fileOutputStream = new FileOutputStream(bVar.f1649d);
                                                    try {
                                                        try {
                                                            bArr3 = new byte[512];
                                                            while (true) {
                                                                i4 = byteArrayInputStream.read(bArr3);
                                                                if (i4 > 0) {
                                                                    fileOutputStream.write(bArr3, 0, i4);
                                                                } else {
                                                                    try {
                                                                        bVar.b(1, null);
                                                                        fileOutputStream.close();
                                                                        byteArrayInputStream.close();
                                                                        bVar.f1652h = null;
                                                                        bVar.f1651g = null;
                                                                        z3 = true;
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                    }
                                                                }
                                                                th = th;
                                                                try {
                                                                    fileOutputStream.close();
                                                                    throw th;
                                                                } catch (Throwable th7) {
                                                                    th.addSuppressed(th7);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            Throwable th9 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th9;
                                                            } catch (Throwable th10) {
                                                                th9.addSuppressed(th10);
                                                                throw th9;
                                                            }
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                    }
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                }
                                            } catch (FileNotFoundException e10) {
                                                e = e10;
                                                bVar.b(6, e);
                                                bVar.f1652h = null;
                                                bVar.f1651g = null;
                                                z3 = false;
                                            } catch (IOException e11) {
                                                e = e11;
                                                bVar.b(7, e);
                                                bVar.f1652h = null;
                                                bVar.f1651g = null;
                                                z3 = false;
                                            }
                                        } catch (FileNotFoundException e12) {
                                            e = e12;
                                            bVar.b(6, e);
                                            bVar.f1652h = null;
                                            bVar.f1651g = null;
                                            z3 = false;
                                        } catch (IOException e13) {
                                            e = e13;
                                            bVar.b(7, e);
                                            bVar.f1652h = null;
                                            bVar.f1651g = null;
                                            z3 = false;
                                        }
                                    } catch (Throwable th13) {
                                        bVar.f1652h = null;
                                        bVar.f1651g = null;
                                        throw th13;
                                    }
                                }
                                if (z3) {
                                    e(packageInfo, filesDir);
                                }
                                if (z3) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                n.c(context, z4);
                            }
                            cVarArrL = null;
                        } catch (IllegalStateException e14) {
                            try {
                                eVar.d(8, e14);
                                try {
                                    fileInputStreamA.close();
                                } catch (IOException e15) {
                                    iOException = e15;
                                    i3 = 7;
                                    eVar.d(i3, iOException);
                                    cVarArrL = null;
                                    bVar2.f1651g = cVarArrL;
                                    cVarArr = bVar2.f1651g;
                                    if (cVarArr != null) {
                                        bVar = bVar2;
                                    } else {
                                        bVar = bVar2;
                                    }
                                    eVar2 = bVar.f1647b;
                                    cVarArr2 = bVar.f1651g;
                                    if (cVarArr2 != null) {
                                        if (!bVar.f1650f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        byteArrayOutputStream.write(bArr);
                                        byteArrayOutputStream.write(bArr4);
                                        if (o(byteArrayOutputStream, bArr4, cVarArr2)) {
                                            eVar2.d(5, null);
                                            bVar.f1651g = null;
                                            byteArrayOutputStream.close();
                                        } else {
                                            bVar.f1652h = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            bVar.f1651g = null;
                                        }
                                    }
                                    bArr2 = bVar.f1652h;
                                    if (bArr2 == null) {
                                        if (!bVar.f1650f) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        fileOutputStream = new FileOutputStream(bVar.f1649d);
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i4 = byteArrayInputStream.read(bArr3);
                                            if (i4 > 0) {
                                                fileOutputStream.write(bArr3, 0, i4);
                                            } else {
                                                bVar.b(1, null);
                                                fileOutputStream.close();
                                                byteArrayInputStream.close();
                                                bVar.f1652h = null;
                                                bVar.f1651g = null;
                                                z3 = true;
                                            }
                                            th = th;
                                            fileOutputStream.close();
                                            throw th;
                                        }
                                    }
                                    z3 = false;
                                    if (z3) {
                                        e(packageInfo, filesDir);
                                    }
                                    if (z3) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    n.c(context, z4);
                                }
                                cVarArrL = null;
                            } catch (Throwable th14) {
                                th = th14;
                                Throwable th15 = th;
                                try {
                                    fileInputStreamA.close();
                                    throw th15;
                                } catch (IOException e16) {
                                    eVar.d(7, e16);
                                    throw th15;
                                }
                            }
                        }
                    }
                    cVarArr = bVar2.f1651g;
                    if (cVarArr != null || (i5 = Build.VERSION.SDK_INT) < 24 || i5 > 34) {
                        bVar = bVar2;
                    } else if (i5 != 24 && i5 != 25) {
                        switch (i5) {
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                                fileInputStreamA2 = bVar2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA2 == null) {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    bVar = null;
                                } else {
                                    if (Arrays.equals(f1663c, f(fileInputStreamA2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVar2.f1651g = i(fileInputStreamA2, f(fileInputStreamA2, 4), bArr5, cVarArr);
                                    fileInputStreamA2.close();
                                    bVar = bVar2;
                                }
                                if (bVar == null) {
                                    bVar = bVar2;
                                }
                                break;
                            default:
                                bVar = bVar2;
                                break;
                        }
                    } else {
                        try {
                            fileInputStreamA2 = bVar2.a(assets, "dexopt/baseline.profm");
                            if (fileInputStreamA2 == null) {
                                try {
                                    if (Arrays.equals(f1663c, f(fileInputStreamA2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVar2.f1651g = i(fileInputStreamA2, f(fileInputStreamA2, 4), bArr5, cVarArr);
                                    fileInputStreamA2.close();
                                    bVar = bVar2;
                                } catch (Throwable th16) {
                                    try {
                                        fileInputStreamA2.close();
                                        throw th16;
                                    } catch (Throwable th17) {
                                        th16.addSuppressed(th17);
                                        throw th16;
                                    }
                                }
                            } else {
                                if (fileInputStreamA2 != null) {
                                    fileInputStreamA2.close();
                                }
                                bVar = null;
                            }
                        } catch (FileNotFoundException e17) {
                            eVar.d(9, e17);
                        } catch (IOException e18) {
                            eVar.d(7, e18);
                        } catch (IllegalStateException e19) {
                            bVar2.f1651g = null;
                            eVar.d(8, e19);
                        }
                        if (bVar == null) {
                            bVar = bVar2;
                        }
                    }
                    eVar2 = bVar.f1647b;
                    cVarArr2 = bVar.f1651g;
                    if (cVarArr2 != null && (bArr4 = bVar.f1648c) != null) {
                        if (!bVar.f1650f) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr);
                        byteArrayOutputStream.write(bArr4);
                        if (o(byteArrayOutputStream, bArr4, cVarArr2)) {
                            eVar2.d(5, null);
                            bVar.f1651g = null;
                            byteArrayOutputStream.close();
                        } else {
                            bVar.f1652h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            bVar.f1651g = null;
                        }
                    }
                    bArr2 = bVar.f1652h;
                    if (bArr2 == null) {
                        if (!bVar.f1650f) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                        fileOutputStream = new FileOutputStream(bVar.f1649d);
                        bArr3 = new byte[512];
                        while (true) {
                            i4 = byteArrayInputStream.read(bArr3);
                            if (i4 > 0) {
                                fileOutputStream.write(bArr3, 0, i4);
                            } else {
                                bVar.b(1, null);
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                bVar.f1652h = null;
                                bVar.f1651g = null;
                                z3 = true;
                            }
                            th = th;
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    z3 = false;
                    if (z3) {
                        e(packageInfo, filesDir);
                    }
                    if (z3) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    n.c(context, z4);
                } catch (Throwable th18) {
                    th = th18;
                }
                bVar2.f1650f = true;
                bArr = f1662b;
            }
            z3 = false;
            if (z3) {
                z4 = false;
            } else {
                z4 = false;
            }
            n.c(context, z4);
        } catch (PackageManager.NameNotFoundException e20) {
            eVar.d(7, e20);
            n.c(context, false);
        }
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j3, int i3) throws IOException {
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = (byte) ((j3 >> (i4 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i3) throws IOException {
        t(byteArrayOutputStream, i3, 2);
    }
}
