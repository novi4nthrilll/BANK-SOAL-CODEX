package p046n2;

import N.e;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import u2.b;

/* JADX INFO: loaded from: classes.dex */
public final class v extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public J f5490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Set f5491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map f5492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Iterator f5493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f5494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f5495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ J f5496m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5497n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(J j3, b bVar) {
        super(bVar);
        this.f5496m = j3;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        this.f5495l = obj;
        this.f5497n |= Integer.MIN_VALUE;
        return J.l(this.f5496m, null, this);
    }
}
