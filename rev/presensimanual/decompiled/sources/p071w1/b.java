package p071w1;

import E0.h;
import W.e;
import Y0.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.Image;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.concurrent.CopyOnWriteArrayList;
import p040l1.s;

/* JADX INFO: loaded from: classes.dex */
public class b implements e, c, p040l1.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5779d;

    public /* synthetic */ b(int i3) {
        this.f5779d = i3;
    }

    public static void e(Image.Plane plane, int i3, int i4, byte[] bArr, int i5, int i6) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride == 0) {
            return;
        }
        int i7 = i3 / (i4 / rowStride);
        int rowStride2 = 0;
        for (int i8 = 0; i8 < rowStride; i8++) {
            int pixelStride = rowStride2;
            for (int i9 = 0; i9 < i7; i9++) {
                bArr[i5] = buffer.get(pixelStride);
                i5 += i6;
                pixelStride += plane.getPixelStride();
            }
            rowStride2 += plane.getRowStride();
        }
    }

    @Override // Y0.c
    public int a(Context context, String str) {
        return Y0.e.a(context, str);
    }

    @Override // Y0.c
    public int b(Context context, String str, boolean z2) {
        return Y0.e.d(context, str, z2);
    }

    public Signature[] c(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // p040l1.c
    public Object h(s sVar) {
        switch (this.f5779d) {
            case 10:
                return new b(0);
            default:
                return new i((Context) sVar.a(Context.class));
        }
    }

    public b(h hVar) {
        this.f5779d = 4;
        B2.h.e(hVar, "fragmentManager");
        new CopyOnWriteArrayList();
    }

    @Override // W.e
    public void g() {
    }

    @Override // W.e
    public void d(int i3, Serializable serializable) {
    }
}
