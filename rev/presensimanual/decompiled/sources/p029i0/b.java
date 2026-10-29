package p029i0;

import j0.a;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f4564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f4565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f4566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f4567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f4568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f4569k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4570d;
    public final Object e;

    static {
        int i3 = 0;
        f4564f = new b("NONE", i3);
        f4565g = new b("FULL", i3);
        int i4 = 1;
        f4566h = new b("FLAT", i4);
        f4567i = new b("HALF_OPENED", i4);
        int i5 = 2;
        f4568j = new b("FOLD", i5);
        f4569k = new b("HINGE", i5);
    }

    public /* synthetic */ b(String str, int i3) {
        this.f4570d = i3;
        this.e = str;
    }

    public String toString() {
        switch (this.f4570d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return (String) this.e;
            case 1:
                return (String) this.e;
            case 2:
                return (String) this.e;
            default:
                return super.toString();
        }
    }

    public b(a aVar) {
        this.f4570d = 3;
        int i3 = n.f4591b;
        this.e = aVar;
    }
}
