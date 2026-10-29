package com.google.android.gms.internal.mlkit_vision_face_bundled;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class W8 extends X8 {
    public W8(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.X8
    public final double a(long j3, Object obj) {
        return Double.longBitsToDouble(this.f2955a.getLong(obj, j3));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.X8
    public final float b(long j3, Object obj) {
        return Float.intBitsToFloat(this.f2955a.getInt(obj, j3));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.X8
    public final void c(Object obj, long j3, boolean z2) {
        if (Y8.f2970g) {
            Y8.b(obj, j3, z2 ? (byte) 1 : (byte) 0);
        } else {
            Y8.c(obj, j3, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.X8
    public final void d(Object obj, long j3, byte b3) {
        if (Y8.f2970g) {
            Y8.b(obj, j3, b3);
        } else {
            Y8.c(obj, j3, b3);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.X8
    public final void e(Object obj, long j3, double d3) {
        this.f2955a.putLong(obj, j3, Double.doubleToLongBits(d3));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.X8
    public final void f(Object obj, long j3, float f3) {
        this.f2955a.putInt(obj, j3, Float.floatToIntBits(f3));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.X8
    public final boolean g(long j3, Object obj) {
        return Y8.f2970g ? Y8.q(j3, obj) : Y8.r(j3, obj);
    }
}
