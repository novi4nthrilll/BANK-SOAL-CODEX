package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class K8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final K8 f2835c = new K8();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2837b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A8 f2836a = new A8();

    public final N8 a(Class cls) {
        Charset charset = AbstractC0348t8.f3460a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f2837b;
        N8 n8V = (N8) concurrentHashMap.get(cls);
        if (n8V == null) {
            A8 a8 = this.f2836a;
            a8.getClass();
            H7 h7 = O8.f2874a;
            AbstractC0299o8.class.isAssignableFrom(cls);
            M8 m8A = ((A8) a8.f2742a).a(cls);
            if ((m8A.f2865d & 2) == 2) {
                H7 h8 = O8.f2874a;
                H7 h9 = AbstractC0219g8.f3074a;
                n8V = new I8(h8, m8A.f2862a);
            } else {
                int i3 = J8.f2829a;
                int i4 = AbstractC0398y8.f3502a;
                H7 h10 = O8.f2874a;
                H7 h11 = m8A.b() + (-1) != 1 ? AbstractC0219g8.f3074a : null;
                int i5 = C8.f2758a;
                n8V = G8.v(m8A, h10, h11);
            }
            N8 n8 = (N8) concurrentHashMap.putIfAbsent(cls, n8V);
            if (n8 != null) {
                return n8;
            }
        }
        return n8V;
    }
}
