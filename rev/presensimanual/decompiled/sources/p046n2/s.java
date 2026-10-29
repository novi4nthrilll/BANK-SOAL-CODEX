package p046n2;

import p063s2.d;
import u2.b;

/* JADX INFO: loaded from: classes.dex */
public final class s extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0782n f5481i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C0782n c0782n, d dVar) {
        super(dVar);
        this.f5481i = c0782n;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f5479g = obj;
        this.f5480h |= Integer.MIN_VALUE;
        return this.f5481i.c(null, this);
    }
}
