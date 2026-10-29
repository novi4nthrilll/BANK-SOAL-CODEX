package p077y1;

import M.k;
import O0.C0092f;
import O0.h;
import O0.u;
import R.b;
import R.e;
import W1.C0104l;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.MediaStore;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0198e7;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import k.Z0;
import p013d1.C0437e3;
import p013d1.EnumC0431d3;
import p013d1.EnumC0461i3;
import p013d1.H4;
import p013d1.K4;
import p013d1.N4;
import p013d1.P4;
import p013d1.Y2;
import p071w1.l;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Bitmap f5922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ByteBuffer f5923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5925d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5926f;

    public a(Bitmap bitmap) {
        u.f(bitmap);
        this.f5922a = bitmap;
        this.f5924c = bitmap.getWidth();
        this.f5925d = bitmap.getHeight();
        this.e = 0;
        this.f5926f = -1;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089 A[Catch: FileNotFoundException -> 0x0043, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:41:0x0099, B:42:0x00ae, B:52:0x00dd, B:54:0x00ea, B:44:0x00b3, B:45:0x00b7, B:46:0x00be, B:47:0x00c2, B:48:0x00c9, B:49:0x00cd, B:50:0x00d3, B:36:0x0089, B:39:0x0092, B:33:0x0079, B:60:0x0108, B:61:0x010f), top: B:74:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3 A[Catch: FileNotFoundException -> 0x0043, TryCatch #4 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:41:0x0099, B:42:0x00ae, B:52:0x00dd, B:54:0x00ea, B:44:0x00b3, B:45:0x00b7, B:46:0x00be, B:47:0x00c2, B:48:0x00c9, B:49:0x00cd, B:50:0x00d3, B:36:0x0089, B:39:0x0092, B:33:0x0079, B:60:0x0108, B:61:0x010f), top: B:74:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7 A[Catch: FileNotFoundException -> 0x0043, TryCatch #4 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:41:0x0099, B:42:0x00ae, B:52:0x00dd, B:54:0x00ea, B:44:0x00b3, B:45:0x00b7, B:46:0x00be, B:47:0x00c2, B:48:0x00c9, B:49:0x00cd, B:50:0x00d3, B:36:0x0089, B:39:0x0092, B:33:0x0079, B:60:0x0108, B:61:0x010f), top: B:74:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00be A[Catch: FileNotFoundException -> 0x0043, TryCatch #4 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:41:0x0099, B:42:0x00ae, B:52:0x00dd, B:54:0x00ea, B:44:0x00b3, B:45:0x00b7, B:46:0x00be, B:47:0x00c2, B:48:0x00c9, B:49:0x00cd, B:50:0x00d3, B:36:0x0089, B:39:0x0092, B:33:0x0079, B:60:0x0108, B:61:0x010f), top: B:74:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[Catch: FileNotFoundException -> 0x0043, TryCatch #4 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:41:0x0099, B:42:0x00ae, B:52:0x00dd, B:54:0x00ea, B:44:0x00b3, B:45:0x00b7, B:46:0x00be, B:47:0x00c2, B:48:0x00c9, B:49:0x00cd, B:50:0x00d3, B:36:0x0089, B:39:0x0092, B:33:0x0079, B:60:0x0108, B:61:0x010f), top: B:74:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9 A[Catch: FileNotFoundException -> 0x0043, TryCatch #4 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:41:0x0099, B:42:0x00ae, B:52:0x00dd, B:54:0x00ea, B:44:0x00b3, B:45:0x00b7, B:46:0x00be, B:47:0x00c2, B:48:0x00c9, B:49:0x00cd, B:50:0x00d3, B:36:0x0089, B:39:0x0092, B:33:0x0079, B:60:0x0108, B:61:0x010f), top: B:74:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd A[Catch: FileNotFoundException -> 0x0043, TryCatch #4 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:41:0x0099, B:42:0x00ae, B:52:0x00dd, B:54:0x00ea, B:44:0x00b3, B:45:0x00b7, B:46:0x00be, B:47:0x00c2, B:48:0x00c9, B:49:0x00cd, B:50:0x00d3, B:36:0x0089, B:39:0x0092, B:33:0x0079, B:60:0x0108, B:61:0x010f), top: B:74:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3 A[Catch: FileNotFoundException -> 0x0043, TryCatch #4 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:41:0x0099, B:42:0x00ae, B:52:0x00dd, B:54:0x00ea, B:44:0x00b3, B:45:0x00b7, B:46:0x00be, B:47:0x00c2, B:48:0x00c9, B:49:0x00cd, B:50:0x00d3, B:36:0x0089, B:39:0x0092, B:33:0x0079, B:60:0x0108, B:61:0x010f), top: B:74:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd A[Catch: FileNotFoundException -> 0x0043, TryCatch #4 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:41:0x0099, B:42:0x00ae, B:52:0x00dd, B:54:0x00ea, B:44:0x00b3, B:45:0x00b7, B:46:0x00be, B:47:0x00c2, B:48:0x00c9, B:49:0x00cd, B:50:0x00d3, B:36:0x0089, B:39:0x0092, B:33:0x0079, B:60:0x0108, B:61:0x010f), top: B:74:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ea A[Catch: FileNotFoundException -> 0x0043, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0043, blocks: (B:3:0x0023, B:5:0x0029, B:7:0x0036, B:41:0x0099, B:42:0x00ae, B:52:0x00dd, B:54:0x00ea, B:44:0x00b3, B:45:0x00b7, B:46:0x00be, B:47:0x00c2, B:48:0x00c9, B:49:0x00cd, B:50:0x00d3, B:36:0x0089, B:39:0x0092, B:33:0x0079, B:60:0x0108, B:61:0x010f), top: B:74:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:66:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static a a(Context context, Uri uri) {
        e eVar;
        b bVarD;
        Matrix matrix;
        int width;
        int height;
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        int iE = 1;
        int i3 = 0;
        u.g(context, "Please provide a valid Context");
        u.g(uri, "Please provide a valid imageUri");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        p080z1.b bVar = p080z1.b.f5958b;
        ContentResolver contentResolver = context.getContentResolver();
        bVar.getClass();
        C0092f c0092f = p080z1.b.f5957a;
        try {
            Bitmap bitmap2 = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            if (bitmap2 == null) {
                throw new IOException("The image Uri could not be resolved.");
            }
            if ("content".equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                try {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            eVar = new e(inputStreamOpenInputStream);
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    throw th;
                                } catch (Exception unused) {
                                    throw th;
                                }
                            }
                        }
                    } else {
                        eVar = null;
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e) {
                            e = e;
                            c0092f.a("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), e);
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    eVar = null;
                    c0092f.a("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uri)), e);
                    if (eVar != null) {
                        bVarD = eVar.d("Orientation");
                        if (bVarD != null) {
                            try {
                                iE = bVarD.e(eVar.e);
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        i3 = iE;
                    }
                    matrix = new Matrix();
                    width = bitmap2.getWidth();
                    height = bitmap2.getHeight();
                    switch (i3) {
                        case 2:
                            matrix = new Matrix();
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            matrix.postRotate(180.0f);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            matrix.postScale(1.0f, -1.0f);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            matrix.postRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            matrix.postRotate(90.0f);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            matrix.postRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            matrix.postRotate(-90.0f);
                            break;
                        default:
                            matrix = null;
                            break;
                    }
                    if (matrix != null) {
                        bitmap = bitmap2;
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, true);
                        if (bitmap != bitmapCreateBitmap) {
                            bitmap.recycle();
                        }
                        a aVar = new a(bitmapCreateBitmap);
                        b(-1, 4, jElapsedRealtime, bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getAllocationByteCount(), 0);
                        return aVar;
                    }
                    bitmap = bitmap2;
                    bitmapCreateBitmap = bitmap;
                    a aVar2 = new a(bitmapCreateBitmap);
                    b(-1, 4, jElapsedRealtime, bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getAllocationByteCount(), 0);
                    return aVar2;
                }
                if (eVar != null) {
                    bVarD = eVar.d("Orientation");
                    if (bVarD != null) {
                        iE = bVarD.e(eVar.e);
                    }
                    i3 = iE;
                }
            }
            matrix = new Matrix();
            width = bitmap2.getWidth();
            height = bitmap2.getHeight();
            switch (i3) {
                case 2:
                    matrix = new Matrix();
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                    matrix.postRotate(180.0f);
                    break;
                case k.LONG_FIELD_NUMBER /* 4 */:
                    matrix.postScale(1.0f, -1.0f);
                    break;
                case k.STRING_FIELD_NUMBER /* 5 */:
                    matrix.postRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case k.STRING_SET_FIELD_NUMBER /* 6 */:
                    matrix.postRotate(90.0f);
                    break;
                case k.DOUBLE_FIELD_NUMBER /* 7 */:
                    matrix.postRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case k.BYTES_FIELD_NUMBER /* 8 */:
                    matrix.postRotate(-90.0f);
                    break;
                default:
                    matrix = null;
                    break;
            }
            if (matrix != null) {
                bitmap = bitmap2;
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, true);
                if (bitmap != bitmapCreateBitmap) {
                    bitmap.recycle();
                }
                a aVar3 = new a(bitmapCreateBitmap);
                b(-1, 4, jElapsedRealtime, bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getAllocationByteCount(), 0);
                return aVar3;
            }
            bitmap = bitmap2;
            bitmapCreateBitmap = bitmap;
            a aVar4 = new a(bitmapCreateBitmap);
            b(-1, 4, jElapsedRealtime, bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getAllocationByteCount(), 0);
            return aVar4;
        } catch (FileNotFoundException e4) {
            c0092f.a("MLKitImageUtils", "Could not open file: ".concat(String.valueOf(uri)), e4);
            throw e4;
        }
    }

    public static void b(int i3, int i4, long j3, int i5, int i6, int i7, int i8) {
        K4 k4A;
        Y2 y2;
        EnumC0431d3 enumC0431d3;
        synchronized (N4.class) {
            byte b3 = (byte) (((byte) 1) | 2);
            try {
                if (b3 != 3) {
                    StringBuilder sb = new StringBuilder();
                    if ((b3 & 1) == 0) {
                        sb.append(" enableFirelog");
                    }
                    if ((b3 & 2) == 0) {
                        sb.append(" firelogEventType");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                k4A = N4.a(new H4());
            } catch (Throwable th) {
                throw th;
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j3;
        EnumC0461i3 enumC0461i3 = EnumC0461i3.INPUT_IMAGE_CONSTRUCTION;
        k4A.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap map = k4A.f3605i;
        if (map.get(enumC0461i3) != null && jElapsedRealtime2 - ((Long) map.get(enumC0461i3)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        map.put(enumC0461i3, Long.valueOf(jElapsedRealtime2));
        Z0 z2 = new Z0();
        if (i3 == -1) {
            y2 = Y2.BITMAP;
        } else if (i3 == 35) {
            y2 = Y2.YUV_420_888;
        } else if (i3 == 842094169) {
            y2 = Y2.YV12;
        } else if (i3 != 16) {
            y2 = i3 != 17 ? Y2.UNKNOWN_FORMAT : Y2.NV21;
        } else {
            y2 = Y2.NV16;
        }
        z2.f5132f = y2;
        if (i4 == 1) {
            enumC0431d3 = EnumC0431d3.BITMAP;
        } else if (i4 == 2) {
            enumC0431d3 = EnumC0431d3.BYTEARRAY;
        } else if (i4 != 3) {
            enumC0431d3 = i4 != 4 ? EnumC0431d3.ANDROID_MEDIA_IMAGE : EnumC0431d3.FILEPATH;
        } else {
            enumC0431d3 = EnumC0431d3.BYTEBUFFER;
        }
        z2.e = enumC0431d3;
        z2.f5133g = Integer.valueOf(i7 & Integer.MAX_VALUE);
        z2.f5135i = Integer.valueOf(i5 & Integer.MAX_VALUE);
        z2.f5134h = Integer.valueOf(i6 & Integer.MAX_VALUE);
        z2.f5131d = Long.valueOf(Long.MAX_VALUE & jElapsedRealtime);
        z2.f5136j = Integer.valueOf(i8 & Integer.MAX_VALUE);
        C0437e3 c0437e3 = new C0437e3(z2);
        D0.b bVar = new D0.b(16, false);
        bVar.f183g = c0437e3;
        C0104l c0104l = new C0104l();
        c0104l.f1774d = new C0198e7();
        c0104l.e = bVar;
        P4.b();
        p033j1.k kVar = k4A.e;
        l.f5800d.execute(new D0.a(k4A, c0104l, kVar.f() ? (String) kVar.d() : h.f1272c.a(k4A.f3603g)));
    }

    public a(ByteBuffer byteBuffer, int i3, int i4, int i5, int i6) {
        boolean z2;
        if (i6 == 842094169) {
            z2 = true;
        } else if (i6 == 17) {
            i6 = 17;
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            u.f(byteBuffer);
            this.f5923b = byteBuffer;
            u.a("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i3 * i4);
            byteBuffer.rewind();
            this.f5924c = i3;
            this.f5925d = i4;
            u.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", i5 == 0 || i5 == 90 || i5 == 180 || i5 == 270);
            this.e = i5;
            this.f5926f = i6;
            return;
        }
        throw new IllegalArgumentException();
    }
}
