package p013d1;

import O0.u;
import android.graphics.Bitmap;
import android.os.Build;
import java.nio.ByteBuffer;
import p077y1.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class A3 {
    public static ByteBuffer a(a aVar) {
        int i3;
        int i4 = aVar.f5926f;
        if (i4 != -1) {
            if (i4 == 17) {
                ByteBuffer byteBuffer = aVar.f5923b;
                u.f(byteBuffer);
                return byteBuffer;
            }
            if (i4 == 35) {
                u.f(null);
                throw null;
            }
            if (i4 != 842094169) {
                throw new p062s1.a("Unsupported image format", 13);
            }
            ByteBuffer byteBuffer2 = aVar.f5923b;
            u.f(byteBuffer2);
            byteBuffer2.rewind();
            int iLimit = byteBuffer2.limit();
            int i5 = iLimit / 6;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iLimit);
            int i6 = 0;
            while (true) {
                i3 = i5 * 4;
                if (i6 >= i3) {
                    break;
                }
                byteBufferAllocateDirect.put(i6, byteBuffer2.get(i6));
                i6++;
            }
            for (int i7 = 0; i7 < i5 + i5; i7++) {
                byteBufferAllocateDirect.put(i3 + i7, byteBuffer2.get((i7 / 2) + ((i7 % 2) * i5) + i3));
            }
            return byteBufferAllocateDirect;
        }
        Bitmap bitmapCopy = aVar.f5922a;
        u.f(bitmapCopy);
        if (Build.VERSION.SDK_INT >= 26 && bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i8 = width * height;
        int[] iArr = new int[i8];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i8);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < height; i11++) {
            int i12 = 0;
            while (i12 < width) {
                int i13 = iArr[i10];
                int i14 = i13 >> 16;
                int i15 = i13 >> 8;
                int i16 = i13 & 255;
                int i17 = i9 + 1;
                int i18 = i14 & 255;
                int i19 = i15 & 255;
                byteBufferAllocateDirect2.put(i9, (byte) Math.min(255, ((((i16 * 25) + ((i19 * 129) + (i18 * 66))) + 128) >> 8) + 16));
                if (i11 % 2 == 0 && i10 % 2 == 0) {
                    int i20 = i18 * 112;
                    int i21 = (((i20 - (i19 * 94)) - (i16 * 18)) + 128) >> 8;
                    int i22 = (((((i18 * (-38)) - (i19 * 74)) + (i16 * 112)) + 128) >> 8) + 128;
                    int i23 = i8 + 1;
                    byteBufferAllocateDirect2.put(i8, (byte) Math.min(255, i21 + 128));
                    i8 += 2;
                    byteBufferAllocateDirect2.put(i23, (byte) Math.min(255, i22));
                }
                i10++;
                i12++;
                i9 = i17;
            }
        }
        return byteBufferAllocateDirect2;
    }
}
