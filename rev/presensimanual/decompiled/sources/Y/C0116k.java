package Y;

import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: Y.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0116k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1896d;
    public boolean e;

    public String toString() {
        switch (this.f1893a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return "AnchorInfo{mPosition=" + this.f1894b + ", mCoordinate=" + this.f1895c + ", mLayoutFromEnd=" + this.f1896d + ", mValid=" + this.e + '}';
            default:
                return super.toString();
        }
    }
}
