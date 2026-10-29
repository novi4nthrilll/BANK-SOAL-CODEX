package p046n2;

import p063s2.d;
import u2.b;

/* JADX INFO: renamed from: n2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0781m extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0782n f5461i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0781m(C0782n c0782n, d dVar) {
        super(dVar);
        this.f5461i = c0782n;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f5459g = obj;
        this.f5460h |= Integer.MIN_VALUE;
        return this.f5461i.c(null, this);
    }
}
