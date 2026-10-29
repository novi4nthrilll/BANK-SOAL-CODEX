package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.OutputStream;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0339t extends OutputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3455d;
    public long e;

    @Override // java.io.OutputStream
    public final void write(int i3) {
        switch (this.f3455d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.e++;
                break;
            case 1:
                this.e++;
                break;
            default:
                this.e++;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f3455d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.e += (long) bArr.length;
                break;
            case 1:
                this.e += (long) bArr.length;
                break;
            default:
                this.e += (long) bArr.length;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) {
        int length;
        int i5;
        int length2;
        int i6;
        int length3;
        int i7;
        switch (this.f3455d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (i3 >= 0 && i3 <= (length = bArr.length) && i4 >= 0 && (i5 = i3 + i4) <= length && i5 >= 0) {
                    this.e += (long) i4;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (i3 >= 0 && i3 <= (length2 = bArr.length) && i4 >= 0 && (i6 = i3 + i4) <= length2 && i6 >= 0) {
                    this.e += (long) i4;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (i3 >= 0 && i3 <= (length3 = bArr.length) && i4 >= 0 && (i7 = i3 + i4) <= length3 && i7 >= 0) {
                    this.e += (long) i4;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }
}
