package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0348t8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f3460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f3461b;

    static {
        Charset.forName("US-ASCII");
        f3460a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3461b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
