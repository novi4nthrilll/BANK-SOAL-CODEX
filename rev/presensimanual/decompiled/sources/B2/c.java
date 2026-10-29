package B2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements F2.a, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient F2.a f110d;
    public final Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f114i;

    public c(Object obj, Class cls, String str, String str2, boolean z2) {
        this.e = obj;
        this.f111f = cls;
        this.f112g = str;
        this.f113h = str2;
        this.f114i = z2;
    }

    public abstract F2.a b();

    public final d c() {
        Class cls = this.f111f;
        if (!this.f114i) {
            return q.a(cls);
        }
        q.f129a.getClass();
        return new j(cls);
    }
}
