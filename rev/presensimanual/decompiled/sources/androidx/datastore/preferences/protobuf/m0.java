package androidx.datastore.preferences.protobuf;

import org.tensorflow.lite.nnapi.NnApiDelegate;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2323b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Unsafe unsafe, int i3) {
        super(unsafe);
        this.f2323b = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean c(long j3, Object obj) {
        switch (this.f2323b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return p0.f2337g ? p0.b(j3, obj) : p0.c(j3, obj);
            default:
                return p0.f2337g ? p0.b(j3, obj) : p0.c(j3, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final double d(long j3, Object obj) {
        switch (this.f2323b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                break;
        }
        return Double.longBitsToDouble(g(j3, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final float e(long j3, Object obj) {
        switch (this.f2323b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                break;
        }
        return Float.intBitsToFloat(f(j3, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void j(Object obj, long j3, boolean z2) {
        switch (this.f2323b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (!p0.f2337g) {
                    p0.l(obj, j3, z2 ? (byte) 1 : (byte) 0);
                } else {
                    p0.k(obj, j3, z2 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!p0.f2337g) {
                    p0.l(obj, j3, z2 ? (byte) 1 : (byte) 0);
                } else {
                    p0.k(obj, j3, z2 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void k(Object obj, long j3, byte b3) {
        switch (this.f2323b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (!p0.f2337g) {
                    p0.l(obj, j3, b3);
                } else {
                    p0.k(obj, j3, b3);
                }
                break;
            default:
                if (!p0.f2337g) {
                    p0.l(obj, j3, b3);
                } else {
                    p0.k(obj, j3, b3);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void l(Object obj, long j3, double d3) {
        switch (this.f2323b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                o(obj, j3, Double.doubleToLongBits(d3));
                break;
            default:
                o(obj, j3, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final void m(Object obj, long j3, float f3) {
        switch (this.f2323b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                n(obj, j3, Float.floatToIntBits(f3));
                break;
            default:
                n(obj, j3, Float.floatToIntBits(f3));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    public final boolean r() {
        switch (this.f2323b) {
        }
        return false;
    }
}
