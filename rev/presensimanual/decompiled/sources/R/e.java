package R;

import M.k;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final byte[] f1415A;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f1416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f1417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte[] f1418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f1419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f1420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f1421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f1422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f1423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f1424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c[][] f1425t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c[] f1426u;
    public static final HashMap[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final HashMap[] f1427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final HashSet f1428x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final HashMap f1429y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Charset f1430z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager.AssetInputStream f1431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap[] f1433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f1434d;
    public ByteOrder e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1438i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1439j;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f1416k = new int[]{8, 8, 8};
        f1417l = new int[]{8};
        f1418m = new byte[]{-1, -40, -1};
        f1419n = new byte[]{79, 76, 89, 77, 80, 0};
        f1420o = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f1421p = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
        f1422q = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f1423r = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        c[] cVarArr = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256), new c("ImageLength", 257), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278), new c("StripByteCounts", 279), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
        c[] cVarArr2 = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962), new c("PixelYDimension", 40963), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720)};
        c[] cVarArr3 = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
        c[] cVarArr4 = {new c("InteroperabilityIndex", 1, 2)};
        c[] cVarArr5 = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256), new c("ThumbnailImageLength", 257), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278), new c("StripByteCounts", 279), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720)};
        f1424s = new c("StripOffsets", 273, 3);
        f1425t = new c[][]{cVarArr, cVarArr2, cVarArr3, cVarArr4, cVarArr5, cVarArr, new c[]{new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)}, new c[]{new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)}, new c[]{new c("AspectFrame", 4371, 3)}, new c[]{new c("ColorSpace", 55, 3)}};
        f1426u = new c[]{new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
        v = new HashMap[10];
        f1427w = new HashMap[10];
        f1428x = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f1429y = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f1430z = charsetForName;
        f1415A = "Exif\u0000\u0000".getBytes(charsetForName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i3 = 0;
        while (true) {
            c[][] cVarArr6 = f1425t;
            if (i3 >= cVarArr6.length) {
                HashMap map = f1429y;
                c[] cVarArr7 = f1426u;
                map.put(Integer.valueOf(cVarArr7[0].f1409a), 5);
                map.put(Integer.valueOf(cVarArr7[1].f1409a), 1);
                map.put(Integer.valueOf(cVarArr7[2].f1409a), 2);
                map.put(Integer.valueOf(cVarArr7[3].f1409a), 3);
                map.put(Integer.valueOf(cVarArr7[4].f1409a), 7);
                map.put(Integer.valueOf(cVarArr7[5].f1409a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            v[i3] = new HashMap();
            f1427w[i3] = new HashMap();
            for (c cVar : cVarArr6[i3]) {
                v[i3].put(Integer.valueOf(cVar.f1409a), cVar);
                f1427w[i3].put(cVar.f1410b, cVar);
            }
            i3++;
        }
    }

    public e(InputStream inputStream) {
        c[][] cVarArr = f1425t;
        this.f1433c = new HashMap[cVarArr.length];
        this.f1434d = new HashSet(cVarArr.length);
        this.e = ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f1431a = (AssetManager.AssetInputStream) inputStream;
        } else {
            this.f1431a = null;
        }
        for (int i3 = 0; i3 < cVarArr.length; i3++) {
            try {
                this.f1433c[i3] = new HashMap();
            } catch (IOException unused) {
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.f1432b = f(bufferedInputStream);
        a aVar = new a(bufferedInputStream);
        switch (this.f1432b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
            case 1:
            case 2:
            case k.INTEGER_FIELD_NUMBER /* 3 */:
            case k.STRING_FIELD_NUMBER /* 5 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
            case k.BYTES_FIELD_NUMBER /* 8 */:
            case 11:
                i(aVar);
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                e(aVar, 0, 0);
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                g(aVar);
                break;
            case 9:
                h(aVar);
                break;
            case 10:
                j(aVar);
                break;
        }
        p(aVar);
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] b(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            jArr[i3] = iArr[i3];
        }
        return jArr;
    }

    public static ByteOrder n(a aVar) throws IOException {
        short s3 = aVar.readShort();
        if (s3 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s3 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s3));
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap[] mapArr = this.f1433c;
        if (strC != null && c("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strC.concat("\u0000").getBytes(f1430z);
            map.put("DateTime", new b(bytes, 2, bytes.length));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", b.a(0L, this.e));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", b.a(0L, this.e));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", b.a(0L, this.e));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", b.a(0L, this.e));
        }
    }

    public final String c(String str) {
        b bVarD = d(str);
        if (bVarD != null) {
            if (!f1428x.contains(str)) {
                return bVarD.f(this.e);
            }
            if (str.equals("GPSTimeStamp")) {
                int i3 = bVarD.f1406a;
                if (i3 != 5 && i3 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i3);
                    return null;
                }
                d[] dVarArr = (d[]) bVarD.g(this.e);
                if (dVarArr == null || dVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(dVarArr));
                    return null;
                }
                d dVar = dVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (dVar.f1413a / dVar.f1414b));
                d dVar2 = dVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (dVar2.f1413a / dVar2.f1414b));
                d dVar3 = dVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (dVar3.f1413a / dVar3.f1414b)));
            }
            try {
                return Double.toString(bVarD.d(this.e));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final b d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i3 = 0; i3 < f1425t.length; i3++) {
            b bVar = (b) this.f1433c[i3].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0056 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0084 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void e(R.a r12, int r13, int r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R.e.e(R.a, int, int):void");
    }

    public final int f(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f1418m;
            if (i3 >= bArr2.length) {
                return 4;
            }
            if (bArr[i3] != bArr2[i3]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i4 = 0; i4 < bytes.length; i4++) {
                    if (bArr[i4] != bytes[i4]) {
                        a aVar = new a(bArr);
                        ByteOrder byteOrderN = n(aVar);
                        this.e = byteOrderN;
                        aVar.e = byteOrderN;
                        short s3 = aVar.readShort();
                        aVar.close();
                        if (s3 == 20306 || s3 == 21330) {
                            return 7;
                        }
                        a aVar2 = new a(bArr);
                        ByteOrder byteOrderN2 = n(aVar2);
                        this.e = byteOrderN2;
                        aVar2.e = byteOrderN2;
                        short s4 = aVar2.readShort();
                        aVar2.close();
                        return s4 == 85 ? 10 : 0;
                    }
                }
                return 9;
            }
            i3++;
        }
    }

    public final void g(a aVar) throws Throwable {
        int i3;
        int i4;
        i(aVar);
        HashMap[] mapArr = this.f1433c;
        b bVar = (b) mapArr[1].get("MakerNote");
        if (bVar != null) {
            a aVar2 = new a(bVar.f1408c);
            aVar2.e = this.e;
            byte[] bArr = f1419n;
            byte[] bArr2 = new byte[bArr.length];
            aVar2.readFully(bArr2);
            aVar2.a(0L);
            byte[] bArr3 = f1420o;
            byte[] bArr4 = new byte[bArr3.length];
            aVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                aVar2.a(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                aVar2.a(12L);
            }
            o(aVar2, 6);
            b bVar2 = (b) mapArr[7].get("PreviewImageStart");
            b bVar3 = (b) mapArr[7].get("PreviewImageLength");
            if (bVar2 != null && bVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", bVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            b bVar4 = (b) mapArr[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.g(this.e);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i5 = iArr[2];
                int i6 = iArr[0];
                if (i5 <= i6 || (i3 = iArr[3]) <= (i4 = iArr[1])) {
                    return;
                }
                int i7 = (i5 - i6) + 1;
                int i8 = (i3 - i4) + 1;
                if (i7 < i8) {
                    int i9 = i7 + i8;
                    i8 = i9 - i8;
                    i7 = i9 - i8;
                }
                b bVarC = b.c(i7, this.e);
                b bVarC2 = b.c(i8, this.e);
                mapArr[0].put("ImageWidth", bVarC);
                mapArr[0].put("ImageLength", bVarC2);
            }
        }
    }

    public final void h(a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i3 = ByteBuffer.wrap(bArr).getInt();
        int i4 = ByteBuffer.wrap(bArr2).getInt();
        e(aVar, i3, 5);
        aVar.a(i4);
        aVar.e = ByteOrder.BIG_ENDIAN;
        int i5 = aVar.readInt();
        for (int i6 = 0; i6 < i5; i6++) {
            int unsignedShort = aVar.readUnsignedShort();
            int unsignedShort2 = aVar.readUnsignedShort();
            if (unsignedShort == f1424s.f1409a) {
                short s3 = aVar.readShort();
                short s4 = aVar.readShort();
                b bVarC = b.c(s3, this.e);
                b bVarC2 = b.c(s4, this.e);
                HashMap[] mapArr = this.f1433c;
                mapArr[0].put("ImageLength", bVarC);
                mapArr[0].put("ImageWidth", bVarC2);
                return;
            }
            aVar.skipBytes(unsignedShort2);
        }
    }

    public final void i(a aVar) throws Throwable {
        b bVar;
        m(aVar, aVar.f1403d.available());
        o(aVar, 0);
        r(aVar, 0);
        r(aVar, 5);
        r(aVar, 4);
        q(0, 5);
        q(0, 4);
        q(5, 4);
        HashMap[] mapArr = this.f1433c;
        b bVar2 = (b) mapArr[1].get("PixelXDimension");
        b bVar3 = (b) mapArr[1].get("PixelYDimension");
        if (bVar2 != null && bVar3 != null) {
            mapArr[0].put("ImageWidth", bVar2);
            mapArr[0].put("ImageLength", bVar3);
        }
        if (mapArr[4].isEmpty() && l(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!l(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.f1432b != 8 || (bVar = (b) mapArr[1].get("MakerNote")) == null) {
            return;
        }
        a aVar2 = new a(bVar.f1408c);
        aVar2.e = this.e;
        aVar2.a(6L);
        o(aVar2, 9);
        b bVar4 = (b) mapArr[9].get("ColorSpace");
        if (bVar4 != null) {
            mapArr[1].put("ColorSpace", bVar4);
        }
    }

    public final void j(a aVar) throws Throwable {
        i(aVar);
        HashMap[] mapArr = this.f1433c;
        if (((b) mapArr[0].get("JpgFromRaw")) != null) {
            e(aVar, this.f1439j, 5);
        }
        b bVar = (b) mapArr[0].get("ISO");
        b bVar2 = (b) mapArr[1].get("PhotographicSensitivity");
        if (bVar == null || bVar2 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", bVar);
    }

    public final void k(a aVar, HashMap map) throws Throwable {
        int i3;
        b bVar = (b) map.get("JPEGInterchangeFormat");
        b bVar2 = (b) map.get("JPEGInterchangeFormatLength");
        if (bVar == null || bVar2 == null) {
            return;
        }
        int iE = bVar.e(this.e);
        int iMin = Math.min(bVar2.e(this.e), aVar.f1403d.available() - iE);
        int i4 = this.f1432b;
        if (i4 != 4 && i4 != 9 && i4 != 10) {
            if (i4 == 7) {
                i3 = this.f1436g;
            }
            if (iE > 0 || iMin <= 0 || this.f1431a != null) {
                return;
            }
            aVar.a(iE);
            aVar.readFully(new byte[iMin]);
            return;
        }
        i3 = this.f1435f;
        iE += i3;
        if (iE > 0) {
        }
    }

    public final boolean l(HashMap map) {
        b bVar = (b) map.get("ImageLength");
        b bVar2 = (b) map.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.e(this.e) <= 512 && bVar2.e(this.e) <= 512;
    }

    public final void m(a aVar, int i3) throws IOException {
        ByteOrder byteOrderN = n(aVar);
        this.e = byteOrderN;
        aVar.e = byteOrderN;
        int unsignedShort = aVar.readUnsignedShort();
        int i4 = this.f1432b;
        if (i4 != 7 && i4 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i5 = aVar.readInt();
        if (i5 < 8 || i5 >= i3) {
            throw new IOException(I.f("Invalid first Ifd offset: ", i5));
        }
        int i6 = i5 - 8;
        if (i6 > 0 && aVar.skipBytes(i6) != i6) {
            throw new IOException(I.f("Couldn't jump to first Ifd: ", i6));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0201  */
    /* JADX WARN: Code duplicated, block: B:103:0x0206  */
    /* JADX WARN: Code duplicated, block: B:104:0x0212  */
    /* JADX WARN: Code duplicated, block: B:107:0x021b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0257  */
    /* JADX WARN: Code duplicated, block: B:115:0x026e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0290  */
    /* JADX WARN: Code duplicated, block: B:131:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0077  */
    /* JADX WARN: Code duplicated, block: B:61:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x0129  */
    /* JADX WARN: Code duplicated, block: B:65:0x012f  */
    /* JADX WARN: Code duplicated, block: B:67:0x013c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0190  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ee  */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x0257, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x01b4, please report this as an issue */
    public final void o(a aVar, int i3) throws IOException {
        HashMap[] mapArr;
        short s3;
        HashSet hashSet;
        short s4;
        long j3;
        boolean z2;
        int i4;
        int i5;
        Integer num;
        int i6;
        HashSet hashSet2;
        String str;
        int i7;
        int unsignedShort;
        long j4;
        int i8;
        int i9;
        long j5;
        long j6;
        Integer numValueOf = Integer.valueOf(aVar.f1405g);
        HashSet hashSet3 = this.f1434d;
        hashSet3.add(numValueOf);
        int i10 = aVar.f1405g + 2;
        int i11 = aVar.f1404f;
        if (i10 > i11) {
            return;
        }
        short s5 = aVar.readShort();
        if ((s5 * 12) + aVar.f1405g > i11 || s5 <= 0) {
            return;
        }
        short s6 = 0;
        while (true) {
            mapArr = this.f1433c;
            if (s6 >= s5) {
                break;
            }
            int unsignedShort2 = aVar.readUnsignedShort();
            int unsignedShort3 = aVar.readUnsignedShort();
            int i12 = aVar.readInt();
            long j7 = ((long) aVar.f1405g) + 4;
            c cVar = (c) v[i3].get(Integer.valueOf(unsignedShort2));
            if (cVar == null) {
                s3 = s5;
                Log.w("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
                hashSet = hashSet3;
                s4 = s6;
            } else {
                s3 = s5;
                if (unsignedShort3 > 0) {
                    int[] iArr = f1422q;
                    if (unsignedShort3 >= iArr.length) {
                        hashSet = hashSet3;
                        s4 = s6;
                        Log.w("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                    } else {
                        int i13 = cVar.f1411c;
                        s4 = s6;
                        if (i13 == 7 || unsignedShort3 == 7 || i13 == unsignedShort3 || (i4 = cVar.f1412d) == unsignedShort3) {
                            hashSet = hashSet3;
                        } else {
                            hashSet = hashSet3;
                            if (((i13 != 4 && i4 != 4) || unsignedShort3 != 3) && (((i13 != 9 && i4 != 9) || unsignedShort3 != 8) && ((i13 != 12 && i4 != 12) || unsignedShort3 != 11))) {
                                Log.w("ExifInterface", "Skip the tag entry since data format (" + f1421p[unsignedShort3] + ") is unexpected for tag: " + cVar.f1410b);
                            }
                        }
                        i11 = i11;
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i13;
                        }
                        unsignedShort2 = unsignedShort2;
                        int i14 = unsignedShort3;
                        j3 = ((long) i12) * ((long) iArr[unsignedShort3]);
                        if (j3 < 0 || j3 > 2147483647L) {
                            Log.w("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i12);
                            unsignedShort3 = i14;
                            z2 = false;
                        } else {
                            z2 = true;
                            unsignedShort3 = i14;
                        }
                    }
                } else {
                    hashSet = hashSet3;
                    s4 = s6;
                    Log.w("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                if (z2) {
                    if (j3 > 4) {
                        i8 = aVar.readInt();
                        i9 = this.f1432b;
                        if (i9 == 7) {
                            if ("MakerNote".equals(cVar.f1410b)) {
                                this.f1436g = i8;
                            } else if (i3 != 6 && "ThumbnailImage".equals(cVar.f1410b)) {
                                this.f1437h = i8;
                                this.f1438i = i12;
                                b bVarC = b.c(6, this.e);
                                i5 = i12;
                                b bVarA = b.a(this.f1437h, this.e);
                                j5 = j7;
                                b bVarA2 = b.a(this.f1438i, this.e);
                                mapArr[4].put("Compression", bVarC);
                                mapArr[4].put("JPEGInterchangeFormat", bVarA);
                                mapArr[4].put("JPEGInterchangeFormatLength", bVarA2);
                            }
                            j5 = j7;
                            i5 = i12;
                        } else {
                            j5 = j7;
                            i5 = i12;
                            if (i9 == 10 && "JpgFromRaw".equals(cVar.f1410b)) {
                                this.f1439j = i8;
                            }
                        }
                        j6 = i8;
                        if (j6 + j3 <= i11) {
                            aVar.a(j6);
                            j7 = j5;
                        } else {
                            Log.w("ExifInterface", "Skip the tag entry since data offset is invalid: " + i8);
                            aVar.a(j5);
                        }
                    } else {
                        i5 = i12;
                    }
                    num = (Integer) f1429y.get(Integer.valueOf(unsignedShort2));
                    if (num != null) {
                        if (i7 != 3) {
                            if (i7 != 4) {
                                i7 = unsignedShort3;
                                j4 = ((long) aVar.readInt()) & 4294967295L;
                            } else if (i7 == 8) {
                                i7 = unsignedShort3;
                                unsignedShort = aVar.readShort();
                            } else if (i7 != 9 || i7 == 13) {
                                i7 = unsignedShort3;
                                i7 = unsignedShort3;
                                unsignedShort = aVar.readInt();
                            } else {
                                i7 = unsignedShort3;
                                j4 = -1;
                            }
                            if (j4 > 0 || j4 >= i11) {
                                hashSet2 = hashSet;
                                Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                            } else {
                                hashSet2 = hashSet;
                                if (hashSet2.contains(Integer.valueOf((int) j4))) {
                                    Log.w("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j4 + ")");
                                } else {
                                    aVar.a(j4);
                                    o(aVar, num.intValue());
                                }
                            }
                            aVar.a(j7);
                        } else {
                            i7 = unsignedShort3;
                            unsignedShort = aVar.readUnsignedShort();
                        }
                        j4 = unsignedShort;
                        if (j4 > 0) {
                            hashSet2 = hashSet;
                            Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                        } else {
                            hashSet2 = hashSet;
                            Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                        }
                        aVar.a(j7);
                    } else {
                        hashSet2 = hashSet;
                        byte[] bArr = new byte[(int) j3];
                        aVar.readFully(bArr);
                        b bVar = new b(bArr, i6, i5);
                        mapArr[i3].put(cVar.f1410b, bVar);
                        str = cVar.f1410b;
                        if ("DNGVersion".equals(str)) {
                            i6 = unsignedShort3;
                            this.f1432b = 3;
                        }
                        i6 = unsignedShort3;
                        if (((!"Make".equals(str) || "Model".equals(str)) && bVar.f(this.e).contains("PENTAX")) || ("Compression".equals(str) && bVar.e(this.e) == 65535)) {
                            this.f1432b = 8;
                        }
                        if (aVar.f1405g != j7) {
                            aVar.a(j7);
                        }
                    }
                    hashSet3 = hashSet2;
                    i11 = i11;
                    s5 = s3;
                    s6 = (short) (s4 + 1);
                } else {
                    aVar.a(j7);
                }
                hashSet2 = hashSet;
                hashSet3 = hashSet2;
                i11 = i11;
                s5 = s3;
                s6 = (short) (s4 + 1);
            }
            j3 = 0;
            z2 = false;
            if (z2) {
                aVar.a(j7);
            } else {
                if (j3 > 4) {
                    i8 = aVar.readInt();
                    i9 = this.f1432b;
                    if (i9 == 7) {
                        if ("MakerNote".equals(cVar.f1410b)) {
                            this.f1436g = i8;
                        } else if (i3 != 6) {
                        }
                        j5 = j7;
                        i5 = i12;
                    } else {
                        j5 = j7;
                        i5 = i12;
                        if (i9 == 10) {
                            this.f1439j = i8;
                        }
                    }
                    j6 = i8;
                    if (j6 + j3 <= i11) {
                        aVar.a(j6);
                        j7 = j5;
                    } else {
                        Log.w("ExifInterface", "Skip the tag entry since data offset is invalid: " + i8);
                        aVar.a(j5);
                    }
                } else {
                    i5 = i12;
                }
                num = (Integer) f1429y.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            i7 = unsignedShort3;
                            j4 = ((long) aVar.readInt()) & 4294967295L;
                        } else if (i7 == 8) {
                            if (i7 != 9) {
                            }
                            i7 = unsignedShort3;
                            i7 = unsignedShort3;
                            unsignedShort = aVar.readInt();
                        } else {
                            i7 = unsignedShort3;
                            unsignedShort = aVar.readShort();
                        }
                        if (j4 > 0) {
                            hashSet2 = hashSet;
                            Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                        } else {
                            hashSet2 = hashSet;
                            Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                        }
                        aVar.a(j7);
                    } else {
                        i7 = unsignedShort3;
                        unsignedShort = aVar.readUnsignedShort();
                    }
                    j4 = unsignedShort;
                    if (j4 > 0) {
                        hashSet2 = hashSet;
                        Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                    } else {
                        hashSet2 = hashSet;
                        Log.w("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                    }
                    aVar.a(j7);
                } else {
                    hashSet2 = hashSet;
                    byte[] bArr2 = new byte[(int) j3];
                    aVar.readFully(bArr2);
                    b bVar2 = new b(bArr2, i6, i5);
                    mapArr[i3].put(cVar.f1410b, bVar2);
                    str = cVar.f1410b;
                    if ("DNGVersion".equals(str)) {
                        i6 = unsignedShort3;
                        this.f1432b = 3;
                    }
                    i6 = unsignedShort3;
                    if (!"Make".equals(str)) {
                    }
                    this.f1432b = 8;
                    if (aVar.f1405g != j7) {
                        aVar.a(j7);
                    }
                }
                hashSet3 = hashSet2;
                i11 = i11;
                s5 = s3;
                s6 = (short) (s4 + 1);
            }
            hashSet2 = hashSet;
            hashSet3 = hashSet2;
            i11 = i11;
            s5 = s3;
            s6 = (short) (s4 + 1);
        }
        HashSet hashSet4 = hashSet3;
        int i15 = i11;
        if (aVar.f1405g + 4 <= i15) {
            int i16 = aVar.readInt();
            long j8 = i16;
            if (j8 <= 0 || i16 >= i15) {
                Log.w("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i16);
            } else {
                if (hashSet4.contains(Integer.valueOf(i16))) {
                    Log.w("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i16);
                    return;
                }
                aVar.a(j8);
                if (mapArr[4].isEmpty()) {
                    o(aVar, 4);
                } else if (mapArr[5].isEmpty()) {
                    o(aVar, 5);
                }
            }
        }
    }

    public final void p(a aVar) throws Throwable {
        b bVar;
        HashMap map = this.f1433c[4];
        b bVar2 = (b) map.get("Compression");
        if (bVar2 == null) {
            k(aVar, map);
            return;
        }
        int iE = bVar2.e(this.e);
        if (iE != 1) {
            if (iE == 6) {
                k(aVar, map);
                return;
            } else if (iE != 7) {
                return;
            }
        }
        b bVar3 = (b) map.get("BitsPerSample");
        if (bVar3 != null) {
            int[] iArr = (int[]) bVar3.g(this.e);
            int[] iArr2 = f1416k;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.f1432b != 3 || (bVar = (b) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iE2 = bVar.e(this.e);
                if ((iE2 != 1 || !Arrays.equals(iArr, f1417l)) && (iE2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            b bVar4 = (b) map.get("StripOffsets");
            b bVar5 = (b) map.get("StripByteCounts");
            if (bVar4 == null || bVar5 == null) {
                return;
            }
            long[] jArrB = b(bVar4.g(this.e));
            long[] jArrB2 = b(bVar5.g(this.e));
            if (jArrB == null) {
                Log.w("ExifInterface", "stripOffsets should not be null.");
                return;
            }
            if (jArrB2 == null) {
                Log.w("ExifInterface", "stripByteCounts should not be null.");
                return;
            }
            long j3 = 0;
            for (long j4 : jArrB2) {
                j3 += j4;
            }
            byte[] bArr = new byte[(int) j3];
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < jArrB.length; i5++) {
                int i6 = (int) jArrB[i5];
                int i7 = (int) jArrB2[i5];
                int i8 = i6 - i3;
                if (i8 < 0) {
                    Log.d("ExifInterface", "Invalid strip offset value");
                }
                aVar.a(i8);
                int i9 = i3 + i8;
                byte[] bArr2 = new byte[i7];
                aVar.read(bArr2);
                i3 = i9 + i7;
                System.arraycopy(bArr2, 0, bArr, i4, i7);
                i4 += i7;
            }
        }
    }

    public final void q(int i3, int i4) throws Throwable {
        HashMap[] mapArr = this.f1433c;
        if (mapArr[i3].isEmpty() || mapArr[i4].isEmpty()) {
            return;
        }
        b bVar = (b) mapArr[i3].get("ImageLength");
        b bVar2 = (b) mapArr[i3].get("ImageWidth");
        b bVar3 = (b) mapArr[i4].get("ImageLength");
        b bVar4 = (b) mapArr[i4].get("ImageWidth");
        if (bVar == null || bVar2 == null || bVar3 == null || bVar4 == null) {
            return;
        }
        int iE = bVar.e(this.e);
        int iE2 = bVar2.e(this.e);
        int iE3 = bVar3.e(this.e);
        int iE4 = bVar4.e(this.e);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i3];
        mapArr[i3] = mapArr[i4];
        mapArr[i4] = map;
    }

    public final void r(a aVar, int i3) throws Throwable {
        b bVar;
        b bVarC;
        b bVarC2;
        HashMap[] mapArr = this.f1433c;
        b bVar2 = (b) mapArr[i3].get("DefaultCropSize");
        b bVar3 = (b) mapArr[i3].get("SensorTopBorder");
        b bVar4 = (b) mapArr[i3].get("SensorLeftBorder");
        b bVar5 = (b) mapArr[i3].get("SensorBottomBorder");
        b bVar6 = (b) mapArr[i3].get("SensorRightBorder");
        if (bVar2 != null) {
            if (bVar2.f1406a == 5) {
                d[] dVarArr = (d[]) bVar2.g(this.e);
                if (dVarArr == null || dVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(dVarArr));
                    return;
                }
                bVarC = b.b(dVarArr[0], this.e);
                bVarC2 = b.b(dVarArr[1], this.e);
            } else {
                int[] iArr = (int[]) bVar2.g(this.e);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                bVarC = b.c(iArr[0], this.e);
                bVarC2 = b.c(iArr[1], this.e);
            }
            mapArr[i3].put("ImageWidth", bVarC);
            mapArr[i3].put("ImageLength", bVarC2);
            return;
        }
        if (bVar3 == null || bVar4 == null || bVar5 == null || bVar6 == null) {
            b bVar7 = (b) mapArr[i3].get("ImageLength");
            b bVar8 = (b) mapArr[i3].get("ImageWidth");
            if ((bVar7 == null || bVar8 == null) && (bVar = (b) mapArr[i3].get("JPEGInterchangeFormat")) != null) {
                e(aVar, bVar.e(this.e), i3);
                return;
            }
            return;
        }
        int iE = bVar3.e(this.e);
        int iE2 = bVar5.e(this.e);
        int iE3 = bVar6.e(this.e);
        int iE4 = bVar4.e(this.e);
        if (iE2 <= iE || iE3 <= iE4) {
            return;
        }
        b bVarC3 = b.c(iE2 - iE, this.e);
        b bVarC4 = b.c(iE3 - iE4, this.e);
        mapArr[i3].put("ImageLength", bVarC3);
        mapArr[i3].put("ImageWidth", bVarC4);
    }
}
