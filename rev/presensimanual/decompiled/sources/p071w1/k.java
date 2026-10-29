package p071w1;

import O.m;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k extends PhantomReference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f5798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f5799b;

    public /* synthetic */ k(a aVar, ReferenceQueue referenceQueue, Set set, m mVar) {
        super(aVar, referenceQueue);
        this.f5798a = set;
        this.f5799b = mVar;
    }
}
