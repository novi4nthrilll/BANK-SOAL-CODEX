package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    public static ByteBuffer a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = width * height;
        int[] iArr = new int[i3];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i3);
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < height; i6++) {
            int i7 = 0;
            while (i7 < width) {
                int i8 = iArr[i5];
                int i9 = i8 >> 16;
                int i10 = i8 >> 8;
                int i11 = i8 & 255;
                int i12 = i4 + 1;
                int i13 = i9 & 255;
                int i14 = i10 & 255;
                byteBufferAllocateDirect.put(i4, (byte) Math.min(255, ((((i11 * 25) + ((i14 * 129) + (i13 * 66))) + 128) >> 8) + 16));
                if (i6 % 2 == 0 && i5 % 2 == 0) {
                    int i15 = i13 * 112;
                    int i16 = (((i15 - (i14 * 94)) - (i11 * 18)) + 128) >> 8;
                    int i17 = (((((i13 * (-38)) - (i14 * 74)) + (i11 * 112)) + 128) >> 8) + 128;
                    int i18 = i3 + 1;
                    byteBufferAllocateDirect.put(i3, (byte) Math.min(255, i16 + 128));
                    i3 += 2;
                    byteBufferAllocateDirect.put(i18, (byte) Math.min(255, i17));
                }
                i5++;
                i7++;
                i4 = i12;
            }
        }
        return byteBufferAllocateDirect;
    }
}
